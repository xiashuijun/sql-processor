package org.sqlproc.engine.jdbc.type;

import java.sql.Types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.type.SqlTaggedMetaType;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The JDBC META type OTHER.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcOtherType implements SqlTaggedMetaType {

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return Types.OTHER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] {};
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "OTHER" };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addScalar(SqlTypeFactory typeFactory, SqlQuery query, String dbName, Class<?>... attributeTypes) {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            boolean ingoreError, Class<?>... inputTypes) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter " + getMetaTypes()[0] + ": paramName=" + paramName + ", inputValue="
                    + inputValue + ", inputTypes=" + inputTypes);
        }

        query.setParameter(paramName, inputValue, getProviderSqlType());
    }
}
