package org.sqlproc.sample.simple.dao.impl;

import java.util.List;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.dao.NewBookDao;
import org.sqlproc.sample.simple.dao.impl.BaseDaoImpl;
import org.sqlproc.sample.simple.model.NewBook;

@SuppressWarnings("all")
public class NewBookDaoImpl extends BaseDaoImpl implements NewBookDao, BaseDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public NewBookDaoImpl() {
  }
  
  public NewBookDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public NewBookDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public NewBook insert(final SqlSession sqlSession, final NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert newBook: " + newBook + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertNewBook = sqlEngineFactory.getCheckedCrudEngine("INSERT_NEW_BOOK");
    org.sqlproc.engine.SqlCrudEngine sqlInsertMedia = sqlEngineFactory.getCheckedCrudEngine("INSERT_MEDIA");
    int count = sqlInsertMedia.insert(sqlSession, newBook, sqlControl);
    if (count > 0) {
    	sqlInsertNewBook.insert(sqlSession, newBook, sqlControl);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert newBook result: " + count + " " + newBook);
    }
    return (count > 0) ? newBook : null;
  }
  
  public NewBook insert(final NewBook newBook, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), newBook, sqlControl);
  }
  
  public NewBook insert(final SqlSession sqlSession, final NewBook newBook) {
    return insert(sqlSession, newBook, null);
  }
  
  public NewBook insert(final NewBook newBook) {
    return insert(newBook, null);
  }
  
  public NewBook get(final SqlSession sqlSession, final NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + newBook + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineNewBook = sqlEngineFactory.getCheckedCrudEngine("GET_NEW_BOOK");
    //sqlControl = getMoreResultClasses(newBook, sqlControl);
    NewBook newBookGot = sqlGetEngineNewBook.get(sqlSession, NewBook.class, newBook, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get newBook result: " + newBookGot);
    }
    return newBookGot;
  }
  
  public NewBook get(final NewBook newBook, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), newBook, sqlControl);
  }
  
  public NewBook get(final SqlSession sqlSession, final NewBook newBook) {
    return get(sqlSession, newBook, null);
  }
  
  public NewBook get(final NewBook newBook) {
    return get(newBook, null);
  }
  
  public int update(final SqlSession sqlSession, final NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update newBook: " + newBook + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineNewBook = sqlEngineFactory.getCheckedCrudEngine("UPDATE_NEW_BOOK");
    org.sqlproc.engine.SqlCrudEngine sqlUpdateMedia = sqlEngineFactory.getCheckedCrudEngine("UPDATE_MEDIA");
    int count = sqlUpdateEngineNewBook.update(sqlSession, newBook, sqlControl);
    if (count > 0) {
    	sqlUpdateMedia.update(sqlSession, newBook, sqlControl);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update newBook result count: " + count);
    }
    return count;
  }
  
  public int update(final NewBook newBook, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), newBook, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final NewBook newBook) {
    return update(sqlSession, newBook, null);
  }
  
  public int update(final NewBook newBook) {
    return update(newBook, null);
  }
  
  public int delete(final SqlSession sqlSession, final NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete newBook: " + newBook + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineNewBook = sqlEngineFactory.getCheckedCrudEngine("DELETE_NEW_BOOK");
    org.sqlproc.engine.SqlCrudEngine sqlDeleteMedia = sqlEngineFactory.getCheckedCrudEngine("DELETE_MEDIA");
    int count = sqlDeleteEngineNewBook.delete(sqlSession, newBook, sqlControl);
    if (count > 0) {
    	sqlDeleteMedia.delete(sqlSession, newBook, sqlControl);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete newBook result count: " + count);
    }
    return count;
  }
  
  public int delete(final NewBook newBook, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), newBook, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final NewBook newBook) {
    return delete(sqlSession, newBook, null);
  }
  
  public int delete(final NewBook newBook) {
    return delete(newBook, null);
  }
  
  public List<NewBook> list(final SqlSession sqlSession, final NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list newBook: " + newBook + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineNewBook = sqlEngineFactory.getCheckedQueryEngine("SELECT_NEW_BOOK");
    //sqlControl = getMoreResultClasses(newBook, sqlControl);
    List<NewBook> newBookList = sqlEngineNewBook.query(sqlSession, NewBook.class, newBook, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list newBook size: " + ((newBookList != null) ? newBookList.size() : "null"));
    }
    return newBookList;
  }
  
  public List<NewBook> list(final NewBook newBook, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), newBook, sqlControl);
  }
  
  public List<NewBook> list(final SqlSession sqlSession, final NewBook newBook) {
    return list(sqlSession, newBook, null);
  }
  
  public List<NewBook> list(final NewBook newBook) {
    return list(newBook, null);
  }
  
  public int query(final SqlSession sqlSession, final NewBook newBook, SqlControl sqlControl, final SqlRowProcessor<NewBook> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query newBook: " + newBook + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineNewBook = sqlEngineFactory.getCheckedQueryEngine("SELECT_NEW_BOOK");
    //sqlControl = getMoreResultClasses(newBook, sqlControl);
    int rownums = sqlEngineNewBook.query(sqlSession, NewBook.class, newBook, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query newBook size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final NewBook newBook, SqlControl sqlControl, final SqlRowProcessor<NewBook> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), newBook, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final NewBook newBook, final SqlRowProcessor<NewBook> sqlRowProcessor) {
    return query(sqlSession, newBook, null, sqlRowProcessor);
  }
  
  public int query(final NewBook newBook, final SqlRowProcessor<NewBook> sqlRowProcessor) {
    return query(newBook, null, sqlRowProcessor);
  }
  
  public int count(final SqlSession sqlSession, final NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count newBook: " + newBook + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineNewBook = sqlEngineFactory.getCheckedQueryEngine("SELECT_NEW_BOOK");
    //sqlControl = getMoreResultClasses(newBook, sqlControl);
    int count = sqlEngineNewBook.queryCount(sqlSession, newBook, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final NewBook newBook, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), newBook, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final NewBook newBook) {
    return count(sqlSession, newBook, null);
  }
  
  public int count(final NewBook newBook) {
    return count(newBook, null);
  }
}
