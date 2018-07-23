package com.alva.arbook.entity;

import java.io.Serializable;
import java.util.Date;

public class PgPreparedStatements implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_prepared_statements.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_prepared_statements.statement
     *
     * @mbg.generated
     */
    private String statement;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_prepared_statements.prepare_time
     *
     * @mbg.generated
     */
    private Date prepareTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_prepared_statements.parameter_types
     *
     * @mbg.generated
     */
    private Object parameterTypes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_prepared_statements.from_sql
     *
     * @mbg.generated
     */
    private Boolean fromSql;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_prepared_statements
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_prepared_statements.name
     *
     * @return the value of pg_prepared_statements.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_prepared_statements.name
     *
     * @param name the value for pg_prepared_statements.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_prepared_statements.statement
     *
     * @return the value of pg_prepared_statements.statement
     *
     * @mbg.generated
     */
    public String getStatement() {
        return statement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_prepared_statements.statement
     *
     * @param statement the value for pg_prepared_statements.statement
     *
     * @mbg.generated
     */
    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_prepared_statements.prepare_time
     *
     * @return the value of pg_prepared_statements.prepare_time
     *
     * @mbg.generated
     */
    public Date getPrepareTime() {
        return prepareTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_prepared_statements.prepare_time
     *
     * @param prepareTime the value for pg_prepared_statements.prepare_time
     *
     * @mbg.generated
     */
    public void setPrepareTime(Date prepareTime) {
        this.prepareTime = prepareTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_prepared_statements.parameter_types
     *
     * @return the value of pg_prepared_statements.parameter_types
     *
     * @mbg.generated
     */
    public Object getParameterTypes() {
        return parameterTypes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_prepared_statements.parameter_types
     *
     * @param parameterTypes the value for pg_prepared_statements.parameter_types
     *
     * @mbg.generated
     */
    public void setParameterTypes(Object parameterTypes) {
        this.parameterTypes = parameterTypes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_prepared_statements.from_sql
     *
     * @return the value of pg_prepared_statements.from_sql
     *
     * @mbg.generated
     */
    public Boolean getFromSql() {
        return fromSql;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_prepared_statements.from_sql
     *
     * @param fromSql the value for pg_prepared_statements.from_sql
     *
     * @mbg.generated
     */
    public void setFromSql(Boolean fromSql) {
        this.fromSql = fromSql;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_prepared_statements
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", statement=").append(statement);
        sb.append(", prepareTime=").append(prepareTime);
        sb.append(", parameterTypes=").append(parameterTypes);
        sb.append(", fromSql=").append(fromSql);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}