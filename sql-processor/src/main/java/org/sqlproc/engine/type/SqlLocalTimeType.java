package org.sqlproc.engine.type;

import java.sql.Time;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The META type LOCALTIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlLocalTimeType extends SqlDefaultType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { java.time.LocalTime.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "LOCALTIME" };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        setResultEntryLog(logger, this, runtimeCtx, resultInstance, attributeName, resultValue, ingoreError);

        if (resultValue == null) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, null, java.time.LocalTime.class))
                return;
            error(logger, ingoreError, "There's no setter for " + attributeName + " in " + resultInstance
                    + ", META type is " + getMetaTypes()[0]);
            return;
        } else if (resultValue instanceof java.sql.Time) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName,
                    ((java.sql.Time) resultValue).toLocalTime(), java.time.LocalTime.class))
                return;
            error(logger, ingoreError, "There's no setter for " + attributeName + " in " + resultInstance
                    + ", META type is " + getMetaTypes()[0]);
            return;
        }
        error(logger, ingoreError,
                "Incorrect localtime " + resultValue + " for " + attributeName + " in " + resultInstance);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getResult(SqlRuntimeContext runtimeCtx, String attributeName, Object resultValue, boolean ingoreError)
            throws SqlRuntimeException {
        if (resultValue == null)
            return null;
        if (resultValue instanceof java.sql.Timestamp)
            return ((java.sql.Time) resultValue).toLocalTime();
        return resultValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            boolean ingoreError, Class<?>... inputTypes) throws SqlRuntimeException {
        setParameterEntryLog(logger, this, runtimeCtx, query, paramName, inputValue, ingoreError, inputTypes);

        if (inputValue == null) {
            query.setParameter(paramName, inputValue, getProviderSqlType());
        } else if (inputValue instanceof java.time.LocalTime) {
            Time value = Time.valueOf((java.time.LocalTime) inputValue);
            query.setParameter(paramName, value, getProviderSqlType());
        } else if (inputValue instanceof OutValueSetter) {
            OutValueSetter outValueSetter = (OutValueSetter) inputValue;
            OutValueSetter _outValueSetter = new OutValueSetter() {
                @Override
                public Object setOutValue(Object outValue) {
                    if (outValue == null)
                        return outValueSetter.setOutValue(null);
                    if (outValue instanceof java.sql.Time) {
                        java.time.LocalTime result = ((java.sql.Time) outValue).toLocalTime();
                        return outValueSetter.setOutValue(result);
                    }
                    throw new RuntimeException("Incorret function output value for localtime");
                }
            };
            query.setParameter(paramName, _outValueSetter, getProviderSqlType());
        } else {
            error(logger, ingoreError, "Incorrect localtime " + inputValue + " for " + paramName);
        }
    }
}
