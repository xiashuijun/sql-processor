/*
 * generated by Xtext
 */
package org.sqlproc.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.sqlproc.dsl.processorDsl.PojoEntity
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.sqlproc.dsl.processorDsl.PojoProperty
import org.eclipse.xtext.xbase.compiler.ImportManager

import static org.sqlproc.dsl.util.Utils.*;
import java.util.ArrayList
import org.sqlproc.dsl.processorDsl.Implements
import org.sqlproc.dsl.processorDsl.Extends
import org.sqlproc.dsl.processorDsl.PojoDao
import java.util.List
import org.sqlproc.dsl.processorDsl.PojoMethodArg
import java.util.Map
import org.sqlproc.dsl.processorDsl.ImplPackage

class ProcessorDslGenerator implements IGenerator {
	
@Inject extension IQualifiedNameProvider
	
override void doGenerate(Resource resource, IFileSystemAccess fsa) {
	for(e: resource.allContents.toIterable.filter(typeof(PojoEntity))) {
		fsa.generateFile(e.eContainer.fullyQualifiedName.toString("/") + "/"+
			e.fullyQualifiedName + ".java",e.compile
		)
	}
	for(d: resource.allContents.toIterable.filter(typeof(PojoDao))) {
		if (d.implPackage != null) {
    		fsa.generateFile(d.eContainer.fullyQualifiedName.toString("/") + "/"+
	      		d.fullyQualifiedName + ".java",d.compileIfx
		    )
    		fsa.generateFile(d.eContainer.fullyQualifiedName.toString("/") + "/"+ 
	      		d.implPackage + "/" + d.fullyQualifiedName + "Impl.java",d.compile
		    )
		}
		else {
    		fsa.generateFile(d.eContainer.fullyQualifiedName.toString("/") + "/"+
	      		d.fullyQualifiedName + ".java",d.compile
		    )
		}
	}
}

def compile(PojoEntity e) '''
«val importManager = new ImportManager(true)»
«addImplements(e, importManager)»
«addExtends(e, importManager)»
«val classBody = compile(e, importManager)»
«IF e.eContainer != null»package «e.eContainer.fullyQualifiedName»;«ENDIF»
  «IF !importManager.imports.empty»
  
  «FOR i : importManager.imports»
import «i»;
  «ENDFOR»
  «ENDIF»
  «IF getSernum(e) != null»

import java.io.Serializable;
  «ENDIF»
  «IF !e.listFeatures.empty»
import java.util.ArrayList;
  «ENDIF»
  «IF e.hasIsDef != null || e.hasToInit != null»
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;
  «ENDIF»

«classBody»
'''

def compile(PojoEntity e, ImportManager importManager) '''
public «IF isAbstract(e)»abstract «ENDIF»class «e.name» «compileExtends(e)»«compileImplements(e)»{
  «IF getSernum(e) != null»
  
  private static final long serialVersionUID = «getSernum(e)»L;
  «ENDIF»
  «FOR f:e.features.filter(x| getIndex(x)!=null)»
  public static final int ORDER_BY_«constName(f)» = «getIndex(f)»;
  «ENDFOR»
  «FOR f:e.features.filter(x| x.name.startsWith("index="))»
  public static final int ORDER_BY_«constName2(f)» = «f.name.substring(6)»;
  «ENDFOR»
	
  public «e.name»() {
  }
  «IF !e.requiredFeatures.empty»
  
  public «e.name»(«FOR f:e.requiredFeatures SEPARATOR ", "»«f.compileType(importManager)» «f.name»«ENDFOR») {
  «FOR f:e.requiredSuperFeatures BEFORE "  super(" SEPARATOR ", " AFTER ");"»«f.name»«ENDFOR»
  «FOR f:e.requiredFeatures1 SEPARATOR "
"»  this.«f.name» = «f.name»;«ENDFOR»
  }
  «ENDIF»
  «FOR f:e.features.filter(x| isAttribute(x))»
    «f.compile(importManager, e)»
  «ENDFOR»
  «FOR f:e.features.filter(x| !isAttribute(x))»«IF f.name.equalsIgnoreCase("hashCode")»«f.compileHashCode(importManager, e)»
  «ELSEIF f.name.equalsIgnoreCase("equals")»«f.compileEquals(importManager, e)»
  «ELSEIF f.name.equalsIgnoreCase("toInit")»«f.compileToInit(importManager, e)»
  «ELSEIF f.name.equalsIgnoreCase("enumInit")»«f.compileEnumInit(importManager, e)»
  «ELSEIF f.name.equalsIgnoreCase("isDef")»«f.compileIsDef(importManager, e)»
  «ELSEIF f.name.equalsIgnoreCase("enumDef")»«f.compileEnumDef(importManager, e)»
  «ELSEIF f.name.equalsIgnoreCase("toString")»«f.compileToString(importManager, e)»«ENDIF»«ENDFOR»
}
'''

def compile(PojoProperty f, ImportManager importManager, PojoEntity e) '''

    private «f.compileType(importManager)» «f.name»«IF isList(f)» = new Array«f.compileType(importManager)»()«ELSEIF isOptLock(f)» = 0«ENDIF»;
  
    public «f.compileType(importManager)» get«f.name.toFirstUpper»() {
      return «f.name»;
    }
  
    public void set«f.name.toFirstUpper»(«f.compileType(importManager)» «f.name») {
      this.«f.name» = «f.name»;
    }
  
    public «e.name» _set«f.name.toFirstUpper»(«f.compileType(importManager)» «f.name») {
      this.«f.name» = «f.name»;
      return this;
    }
'''

def compileHashCode(PojoProperty f, ImportManager importManager, PojoEntity e) '''

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      «FOR f2:f.attrs»
      result = prime * result + (int) («f2.name» ^ («f2.name» >>> 32));
      «ENDFOR»
      return result;
    }  
'''

def compileEquals(PojoProperty f, ImportManager importManager, PojoEntity e) '''

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      «e.name» other = («e.name») obj;
      «FOR f2:f.attrs»
      «IF f2.native != null»if («f2.name» != other.«f2.name»)«ELSE»if (!«f2.name».equals(other.«f2.name»))«ENDIF»
        return false;
      «ENDFOR»
      return true;
    }  
'''

def compileToString(PojoProperty f, ImportManager importManager, PojoEntity e) '''

    @Override
    public String toString() {
      return "«e.name» [«FOR f2:f.simplAttrs SEPARATOR " + \", "»«f2.name»=" + «f2.name»«ENDFOR»«IF getSuperType(e) != null» + super.toString()«ENDIF» + "]";
    }

    public String toStringFull() {
      return "«e.name» [«FOR f2:f.attrs SEPARATOR " + \", "»«f2.name»=" + «f2.name»«ENDFOR»«IF getSuperType(e) != null» + super.toString()«ENDIF» + "]";
    }
'''

def compileIsDef(PojoProperty f, ImportManager importManager, PojoEntity e) '''

    public enum Attribute {
      «FOR f2:f.attrs SEPARATOR ", "»«f2.name»«ENDFOR»
    }

    private Set<String> nullValues = new HashSet<String>();

    public void setNull(Attribute... attributes) {
      if (attributes == null)
        throw new IllegalArgumentException();
      for (Attribute attribute : attributes)
        nullValues.add(attribute.name());
    }

    public void clearNull(Attribute... attributes) {
      if (attributes == null)
        throw new IllegalArgumentException();
      for (Attribute attribute : attributes)
        nullValues.remove(attribute.name());
    }

    public Boolean isNull(String attrName) {
      if (attrName == null)
        throw new IllegalArgumentException();
      return nullValues.contains(attrName);
    }

    public Boolean isNull(Attribute attribute) {
      if (attribute == null)
        throw new IllegalArgumentException();
      return nullValues.contains(attribute.name());
    }

    public Boolean isDef(String attrName) {
      if (attrName == null)
        throw new IllegalArgumentException();
      if (nullValues.contains(attrName))
        return true;
      try {
        Object result = MethodUtils.invokeMethod(this, "get" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
        return (result != null) ? true : false;
      } catch (NoSuchMethodException e) {
      } catch (IllegalAccessException e) {
        throw new RuntimeException(e);
      } catch (InvocationTargetException e) {
        throw new RuntimeException(e);
      }
      try {
        Object result = MethodUtils.invokeMethod(this, "is" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
        return (result != null) ? true : false;
      } catch (NoSuchMethodException e) {
      } catch (IllegalAccessException e) {
        throw new RuntimeException(e);
      } catch (InvocationTargetException e) {
        throw new RuntimeException(e);
      }
      return false;
    }

    public void clearAllNull() {
      nullValues = new HashSet<String>();
    }
'''

def compileEnumDef(PojoProperty f, ImportManager importManager, PojoEntity e) '''

    public enum Attribute {
      «FOR f2:f.attrs SEPARATOR ", "»«f2.name»«ENDFOR»
    }
'''

def compileToInit(PojoProperty f, ImportManager importManager, PojoEntity e) '''

    public enum Association {
      «FOR f2:f.attrs SEPARATOR ", "»«f2.name»«ENDFOR»
    }

    private Set<String> initAssociations = new HashSet<String>();

    public void setInit(String... associations) {
      if (associations == null)
        throw new IllegalArgumentException();
      for (String association : associations)
        initAssociations.add(association);
    }

    public void clearInit(String... associations) {
      if (associations == null)
        throw new IllegalArgumentException();
      for (String association : associations)
        initAssociations.remove(association);
    }

    public Boolean toInit(String association) {
      if (association == null)
        throw new IllegalArgumentException();
      return initAssociations.contains(association);
    }

    public void clearAllInit() {
      initAssociations = new HashSet<String>();
    }
'''

def compileEnumInit(PojoProperty f, ImportManager importManager, PojoEntity e) '''

    public enum Association {
      «FOR f2:f.attrs SEPARATOR ", "»«f2.name»«ENDFOR»
    }
'''

def compileType(PojoProperty f, ImportManager importManager) '''
  «IF f.getNative != null»«f.getNative.substring(1)»«ELSEIF f.getRef != null»«f.getRef.fullyQualifiedName»«ELSEIF f.getType != null»«importManager.serialize(f.getType)»«ENDIF»«IF f.getGtype != null»<«importManager.serialize(f.getGtype)»>«ENDIF»«IF f.getGref != null»<«f.getGref.fullyQualifiedName»>«ENDIF»«IF f.array»[]«ENDIF»'''
  

def compile(PojoDao d) '''
«val importManager = new ImportManager(true)»
«addImplements(d, importManager)»
«addExtends(d, importManager)»
«val toInits = getToInits(d)»
«val classBody = compile(d, d.pojo, toInits, importManager)»
«IF d.eContainer != null»package «d.eContainer.fullyQualifiedName»«IF d.implPackage != null».«d.implPackage»«ENDIF»;«ENDIF»
  «IF d.implPackage != null»

import «d.eContainer.fullyQualifiedName».«d.name»;
  «ENDIF»
  «IF !importManager.imports.empty»
  
  «FOR i : importManager.imports»
import «i»;
  «ENDFOR»
  «ENDIF»
  «IF getSernum(d) != null»

import java.io.Serializable;
  «ENDIF»

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import «d.pojo.completeName»;
«FOR f:toInits.entrySet»«FOR a:f.value SEPARATOR "
"»import «a.ref.completeName»;«ENDFOR»«ENDFOR»

«classBody»
'''

def compile(PojoDao d, PojoEntity e, Map<String, List<PojoMethodArg>> toInits, ImportManager importManager) '''
public «IF isAbstract(d)»abstract «ENDIF»class «d.name»«IF d.implPackage != null»Impl«ENDIF» «compileExtends(d)»«compileImplements(d)»{
  «IF getSernum(d) != null»
  
  private static final long serialVersionUID = «getSernum(d)»L;
  «ENDIF»
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public «d.name»«IF d.implPackage != null»Impl«ENDIF»(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public «d.name»«IF d.implPackage != null»Impl«ENDIF»(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  «compileInsert(d, e, getParent(e), importManager)»
  «compileGet(d, e, toInits, importManager)»
  «compileUpdate(d, e, getParent(e), importManager)»
  «compileDelete(d, e, getParent(e), importManager)»
  «compileList(d, e, toInits, importManager)»
  «IF !toInits.empty»«compileMoreResultClasses(d, e, toInits, importManager)»«ENDIF»
}
'''

def compileInsert(PojoDao d, PojoEntity e, PojoEntity pe, ImportManager importManager) '''

    public «e.name» insert(SqlSession sqlSession, «e.name» «e.name.toFirstLower», SqlControl sqlControl) {
      if (logger.isTraceEnabled()) {
        logger.trace("insert «e.name.toFirstLower»: " + «e.name.toFirstLower» + " " + sqlControl);
      }
      SqlCrudEngine sqlInsert«e.name» = sqlEngineFactory.getCheckedCrudEngine("INSERT_«dbName(e)»");«IF pe != null»
      SqlCrudEngine sqlInsert«pe.name» = sqlEngineFactory.getCheckedCrudEngine("INSERT_«dbName(pe)»");
      int count = sqlInsert«pe.name».insert(sqlSession, «e.name.toFirstLower»);
      if (count > 0) {
        sqlInsert«e.name».insert(sqlSession, «e.name.toFirstLower»);
      }«ELSE»
      int count = sqlInsert«e.name».insert(sqlSession, «e.name.toFirstLower»);«ENDIF»
      if (logger.isTraceEnabled()) {
        logger.trace("insert «e.name.toFirstLower» result: " + count + " " + «e.name.toFirstLower»);
      }
      return (count > 0) ? «e.name.toFirstLower» : null;
    }

    public «e.name» insert(«e.name» «e.name.toFirstLower», SqlControl sqlControl) {
    	return insert(sqlSessionFactory.getSqlSession(), «e.name.toFirstLower», sqlControl);
    }

    public «e.name» insert(SqlSession sqlSession, «e.name» «e.name.toFirstLower») {
      return insert(sqlSession, «e.name.toFirstLower», null);
    }

    public «e.name» insert(«e.name» «e.name.toFirstLower») {
      return insert(«e.name.toFirstLower», null);
    }
'''

def compileGet(PojoDao d, PojoEntity e, Map<String, List<PojoMethodArg>> toInits, ImportManager importManager) '''

    public «e.name» get(SqlSession sqlSession, «e.name» «e.name.toFirstLower», SqlControl sqlControl) {
      if (logger.isTraceEnabled()) {
        logger.trace("get get: " + «e.name.toFirstLower» + " " + sqlControl);
      }
      SqlCrudEngine sqlGetEngine«e.name» = sqlEngineFactory.getCheckedCrudEngine("GET_«dbName(e)»");
      «IF toInits.empty»//«ENDIF»sqlControl = getMoreResultClasses(«e.name.toFirstLower», sqlControl);
      «e.name» «e.name.toFirstLower»Got = sqlGetEngine«e.name».get(sqlSession, «e.name».class, «e.name.toFirstLower», sqlControl);
      if (logger.isTraceEnabled()) {
        logger.trace("get «e.name.toFirstLower» result: " + «e.name.toFirstLower»Got);
      }
      return «e.name.toFirstLower»Got;
    }
	
    public «e.name» get(«e.name» «e.name.toFirstLower», SqlControl sqlControl) {
    	return get(sqlSessionFactory.getSqlSession(), «e.name.toFirstLower», sqlControl);
    }

    public «e.name» get(SqlSession sqlSession, «e.name» «e.name.toFirstLower») {
      return get(sqlSession, «e.name.toFirstLower», null);
    }

    public «e.name» get(«e.name» «e.name.toFirstLower») {
      return get(«e.name.toFirstLower», null);
    }
'''

def compileUpdate(PojoDao d, PojoEntity e, PojoEntity pe, ImportManager importManager) '''

    public int update(SqlSession sqlSession, «e.name» «e.name.toFirstLower», SqlControl sqlControl) {
      if (logger.isTraceEnabled()) {
        logger.trace("update «e.name.toFirstLower»: " + «e.name.toFirstLower» + " " + sqlControl);
      }
      SqlCrudEngine sqlUpdateEngine«e.name» = sqlEngineFactory.getCheckedCrudEngine("UPDATE_«dbName(e)»");«IF pe != null»
      SqlCrudEngine sqlUpdate«pe.name» = sqlEngineFactory.getCheckedCrudEngine("UPDATE_«dbName(pe)»");«ENDIF»
      int count = sqlUpdateEngine«e.name».update(sqlSession, «e.name.toFirstLower»);«IF pe != null»
      if (count > 0) {
      	sqlUpdate«pe.name».update(sqlSession, «e.name.toFirstLower»);
      }«ENDIF»«val f=getOptLock(e)»«IF f != null»
      if (count > 0) {
      	«e.name.toFirstLower».set«f.name.toFirstUpper»(«e.name.toFirstLower».get«f.name.toFirstUpper»() + 1);
      }«ENDIF»
      if (logger.isTraceEnabled()) {
        logger.trace("update «e.name.toFirstLower» result count: " + count);
      }
      return count;
    }

    public int update(«e.name» «e.name.toFirstLower», SqlControl sqlControl) {
    	return update(sqlSessionFactory.getSqlSession(), «e.name.toFirstLower», sqlControl);
    }
    
    public int update(SqlSession sqlSession, «e.name» «e.name.toFirstLower») {
      return update(sqlSession, «e.name.toFirstLower», null);
    }
    
    public int update(«e.name» «e.name.toFirstLower») {
      return update(«e.name.toFirstLower», null);
    }
'''

def compileDelete(PojoDao d, PojoEntity e, PojoEntity pe, ImportManager importManager) '''

    public int delete(SqlSession sqlSession, «e.name» «e.name.toFirstLower», SqlControl sqlControl) {
      if (logger.isTraceEnabled()) {
        logger.trace("delete «e.name.toFirstLower»: " + «e.name.toFirstLower» + " " + sqlControl);
      }
      SqlCrudEngine sqlDeleteEngine«e.name» = sqlEngineFactory.getCheckedCrudEngine("DELETE_«dbName(e)»");«IF pe != null»
      SqlCrudEngine sqlDelete«pe.name» = sqlEngineFactory.getCheckedCrudEngine("DELETE_«dbName(pe)»");«ENDIF»
      int count = sqlDeleteEngine«e.name».delete(sqlSession, «e.name.toFirstLower»);«IF pe != null»
      if (count > 0) {
      	sqlDelete«pe.name».delete(sqlSession, «e.name.toFirstLower»);
      }«ENDIF»«val f=getOptLock(e)»«IF f != null»
      if (count > 0) {
      	«e.name.toFirstLower».set«f.name.toFirstUpper»(«e.name.toFirstLower».get«f.name.toFirstUpper»() + 1);
      }«ENDIF»
      if (logger.isTraceEnabled()) {
        logger.trace("delete «e.name.toFirstLower» result count: " + count);
      }
      return count;
    }

    public int delete(«e.name» «e.name.toFirstLower», SqlControl sqlControl) {
    	return delete(sqlSessionFactory.getSqlSession(), «e.name.toFirstLower», sqlControl);
    }

    public int delete(SqlSession sqlSession, «e.name» «e.name.toFirstLower») {
      return delete(sqlSession, «e.name.toFirstLower», null);
    }

    public int delete(«e.name» «e.name.toFirstLower») {
      return delete(«e.name.toFirstLower», null);
    }
'''

def compileList(PojoDao d, PojoEntity e, Map<String, List<PojoMethodArg>> toInits, ImportManager importManager) '''

    public List<«e.name»> list(SqlSession sqlSession, «e.name» «e.name.toFirstLower», SqlControl sqlControl) {
      if (logger.isTraceEnabled()) {
        logger.trace("list «e.name.toFirstLower»: " + «e.name.toFirstLower» + " " + sqlControl);
      }
      SqlQueryEngine sqlEngine«e.name» = sqlEngineFactory.getCheckedQueryEngine("SELECT_«dbName(e)»");
      «IF toInits.empty»//«ENDIF»sqlControl = getMoreResultClasses(«e.name.toFirstLower», sqlControl);
      List<«e.name»> «e.name.toFirstLower»List = sqlEngine«e.name».query(sqlSession, «e.name».class, «e.name.toFirstLower», sqlControl);
      if (logger.isTraceEnabled()) {
        logger.trace("list «e.name.toFirstLower» size: " + ((«e.name.toFirstLower»List != null) ? «e.name.toFirstLower»List.size() : "null"));
      }
      return «e.name.toFirstLower»List;
    }

    public List<«e.name»> list(«e.name» «e.name.toFirstLower», SqlControl sqlControl) {
    	return list(sqlSessionFactory.getSqlSession(), «e.name.toFirstLower», sqlControl);
    }
    
    public List<«e.name»> list(SqlSession sqlSession, «e.name» «e.name.toFirstLower») {
      return list(sqlSession, «e.name.toFirstLower», null);
    }
    
    public List<«e.name»> list(«e.name» «e.name.toFirstLower») {
      return list(«e.name.toFirstLower», null);
    }
'''

def compileMoreResultClasses(PojoDao d, PojoEntity e, Map<String, List<PojoMethodArg>> toInits, ImportManager importManager) '''

    SqlControl getMoreResultClasses(«e.name» «e.name.toFirstLower», SqlControl sqlControl) {
      if (sqlControl != null && sqlControl.getMoreResultClasses() != null)
        return sqlControl;
      Map<String, Class<?>> moreResultClasses = null;
    «FOR f:toInits.entrySet SEPARATOR "
"»  if («e.name.toFirstLower» != null && «e.name.toFirstLower».toInit(«e.name».Association.«f.key».name())) {
        if (moreResultClasses == null)
          moreResultClasses = new HashMap<String, Class<?>>();
    «FOR a:f.value SEPARATOR "
"»    moreResultClasses.put("«a.name»", «a.ref.fullyQualifiedName».class);«ENDFOR»
      }
      «ENDFOR»
      if (moreResultClasses != null) {
        sqlControl = new SqlStandardControl(sqlControl);
        ((SqlStandardControl) sqlControl).setMoreResultClasses(moreResultClasses);
      }
      return sqlControl;
    }
'''

def compileIfx(PojoDao d) '''
«val importManager = new ImportManager(true)»
«addImplements(d, importManager)»
«addExtends(d, importManager)»
«val classBody = compileIfx(d, d.pojo, importManager)»
«IF d.eContainer != null»package «d.eContainer.fullyQualifiedName»;«ENDIF»

import java.util.List;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlControl;
import «d.pojo.completeName»;

«classBody»
'''

def compileIfx(PojoDao d, PojoEntity e, ImportManager importManager) '''
public interface «d.name» {
  «compileInsertIfx(d, e, importManager)»
  «compileGetIfx(d, e, importManager)»
  «compileUpdateIfx(d, e, importManager)»
  «compileDeleteIfx(d, e, importManager)»
  «compileListIfx(d, e, importManager)»
}
'''

def compileInsertIfx(PojoDao d, PojoEntity e, ImportManager importManager) '''

    public «e.name» insert(SqlSession sqlSession, «e.name» «e.name.toFirstLower», SqlControl sqlControl);

    public «e.name» insert(«e.name» «e.name.toFirstLower», SqlControl sqlControl);

    public «e.name» insert(SqlSession sqlSession, «e.name» «e.name.toFirstLower»);

    public «e.name» insert(«e.name» «e.name.toFirstLower»);
'''

def compileGetIfx(PojoDao d, PojoEntity e, ImportManager importManager) '''

    public «e.name» get(SqlSession sqlSession, «e.name» «e.name.toFirstLower», SqlControl sqlControl);
	
    public «e.name» get(«e.name» «e.name.toFirstLower», SqlControl sqlControl);
	
    public «e.name» get(SqlSession sqlSession, «e.name» «e.name.toFirstLower»);
	
    public «e.name» get(«e.name» «e.name.toFirstLower»);
'''

def compileUpdateIfx(PojoDao d, PojoEntity e, ImportManager importManager) '''

    public int update(SqlSession sqlSession, «e.name» «e.name.toFirstLower», SqlControl sqlControl);

    public int update(«e.name» «e.name.toFirstLower», SqlControl sqlControl);

    public int update(SqlSession sqlSession, «e.name» «e.name.toFirstLower»);

    public int update(«e.name» «e.name.toFirstLower»);
'''

def compileDeleteIfx(PojoDao d, PojoEntity e, ImportManager importManager) '''

    public int delete(SqlSession sqlSession, «e.name» «e.name.toFirstLower», SqlControl sqlControl);

    public int delete(«e.name» «e.name.toFirstLower», SqlControl sqlControl);

    public int delete(SqlSession sqlSession, «e.name» «e.name.toFirstLower»);

    public int delete(«e.name» «e.name.toFirstLower»);
'''

def compileListIfx(PojoDao d, PojoEntity e, ImportManager importManager) '''

    public List<«e.name»> list(SqlSession sqlSession, «e.name» «e.name.toFirstLower», SqlControl sqlControl);

    public List<«e.name»> list(«e.name» «e.name.toFirstLower», SqlControl sqlControl);

    public List<«e.name»> list(SqlSession sqlSession, «e.name» «e.name.toFirstLower»);

    public List<«e.name»> list(«e.name» «e.name.toFirstLower»);
'''

def listFeatures(PojoEntity e) {
	
   	val list = new ArrayList<PojoProperty>()
	if (getSuperType(e) != null)
	  list.addAll(getSuperType(e).listFeatures)
	list.addAll(e.listFeatures1)
    return list
}

def listFeatures1(PojoEntity e) {
	return e.features.filter(f|isList(f)).toList
}
  
def requiredFeatures(PojoEntity e) {
	
   	val list = new ArrayList<PojoProperty>()
	if (getSuperType(e) != null)
	  list.addAll(getSuperType(e).requiredFeatures)
	list.addAll(e.requiredFeatures1)
    return list
}

def requiredSuperFeatures(PojoEntity e) {
	
   	val list = new ArrayList<PojoProperty>()
	if (getSuperType(e) != null)
	  list.addAll(getSuperType(e).requiredFeatures)
    return list
}

def requiredFeatures1(PojoEntity e) {
	return e.features.filter(f|isRequired(f)).toList
}

def hasIsDef(PojoEntity e) {
	return e.features.findFirst(f|f.name == "isDef")
}

def hasToInit(PojoEntity e) {
	return e.features.findFirst(f|f.name == "toInit")
}

def isAttribute(PojoProperty f) {
    return f.getNative != null || f.getRef != null || f.getType != null
}

def simplAttrs(PojoProperty f) {
	return f.attrs.filter(f2|f2.getNative != null || f2.getType != null).toList
}

def compileExtends(PojoEntity e) '''
	«IF getSuperType(e) != null»extends «getSuperType(e).fullyQualifiedName» «ELSEIF getExtends(e) != ""»extends «getExtends(e)» «ENDIF»'''

def compileImplements(PojoEntity e) '''
	«IF isImplements(e) || getSernum(e) != null»implements «FOR f:e.eContainer.eContents.filter(typeof(Implements)) SEPARATOR ", " »«f.getImplements().simpleName»«ENDFOR»«IF getSernum(e) != null»«IF isImplements(e)», «ENDIF»Serializable«ENDIF» «ENDIF»'''

def compileExtends(PojoDao e) '''
	«IF getSuperType(e) != null»extends «getSuperType(e).fullyQualifiedName» «ELSEIF getExtends(e) != ""»extends «getExtends(e)» «ENDIF»'''

def compileImplements(PojoDao d) '''
	«IF isImplements(d) || getSernum(d) != null || d.implPackage != null»implements «FOR f:d.eContainer.eContents.filter(typeof(Implements)) SEPARATOR ", " »«f.getImplements().simpleName»«ENDFOR»«IF getSernum(d) != null»«IF isImplements(d)», «ENDIF»Serializable«ENDIF»«IF d.implPackage != null»«IF isImplements(d) || getSernum(d) != null», «ENDIF»«d.name»«ENDIF» «ENDIF»'''

def compile(Extends e, ImportManager importManager) {
	importManager.addImportFor(e.getExtends())
}

def addImplements(PojoEntity e, ImportManager importManager) {
	for(impl: e.eContainer.eContents.filter(typeof(Implements))) {
		importManager.addImportFor(impl.getImplements())
	}
}

def addExtends(PojoEntity e, ImportManager importManager) {
	for(ext: e.eContainer.eContents.filter(typeof(Extends))) {
		importManager.addImportFor(ext.getExtends())
	}
}

def addImplements(PojoDao e, ImportManager importManager) {
	for(impl: e.eContainer.eContents.filter(typeof(Implements))) {
		importManager.addImportFor(impl.getImplements())
	}
}

def addExtends(PojoDao e, ImportManager importManager) {
	for(ext: e.eContainer.eContents.filter(typeof(Extends))) {
		importManager.addImportFor(ext.getExtends())
	}
}

def getExtends(PojoEntity e) {
	for(ext: e.eContainer.eContents.filter(typeof(Extends))) {
		return ext.getExtends().simpleName
	}
	return ""
}

def isImplements(PojoEntity e) {
	for(ext: e.eContainer.eContents.filter(typeof(Implements))) {
		return true
	}
	return false
}

def getExtends(PojoDao e) {
	for(ext: e.eContainer.eContents.filter(typeof(Extends))) {
		return ext.getExtends().simpleName
	}
	return ""
}

def isImplements(PojoDao e) {
	for(ext: e.eContainer.eContents.filter(typeof(Implements))) {
		return true
	}
	return false
}

def getImplPackage(PojoDao e) {
	for(ext: e.eContainer.eContents.filter(typeof(ImplPackage))) {
		return ext.name
	}
	return null
}

def completeName(PojoEntity e) {
	return getPackage(e)+"."+e.name;
}
}