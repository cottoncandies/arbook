package com.alva.arbook.entity;

import java.io.Serializable;

public class CheckConstraintRoutineUsage implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_constraint_routine_usage.constraint_catalog
     *
     * @mbg.generated
     */
    private Object constraintCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_constraint_routine_usage.constraint_schema
     *
     * @mbg.generated
     */
    private Object constraintSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_constraint_routine_usage.constraint_name
     *
     * @mbg.generated
     */
    private Object constraintName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_constraint_routine_usage.specific_catalog
     *
     * @mbg.generated
     */
    private Object specificCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_constraint_routine_usage.specific_schema
     *
     * @mbg.generated
     */
    private Object specificSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_constraint_routine_usage.specific_name
     *
     * @mbg.generated
     */
    private Object specificName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table check_constraint_routine_usage
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_constraint_routine_usage.constraint_catalog
     *
     * @return the value of check_constraint_routine_usage.constraint_catalog
     *
     * @mbg.generated
     */
    public Object getConstraintCatalog() {
        return constraintCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_constraint_routine_usage.constraint_catalog
     *
     * @param constraintCatalog the value for check_constraint_routine_usage.constraint_catalog
     *
     * @mbg.generated
     */
    public void setConstraintCatalog(Object constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_constraint_routine_usage.constraint_schema
     *
     * @return the value of check_constraint_routine_usage.constraint_schema
     *
     * @mbg.generated
     */
    public Object getConstraintSchema() {
        return constraintSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_constraint_routine_usage.constraint_schema
     *
     * @param constraintSchema the value for check_constraint_routine_usage.constraint_schema
     *
     * @mbg.generated
     */
    public void setConstraintSchema(Object constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_constraint_routine_usage.constraint_name
     *
     * @return the value of check_constraint_routine_usage.constraint_name
     *
     * @mbg.generated
     */
    public Object getConstraintName() {
        return constraintName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_constraint_routine_usage.constraint_name
     *
     * @param constraintName the value for check_constraint_routine_usage.constraint_name
     *
     * @mbg.generated
     */
    public void setConstraintName(Object constraintName) {
        this.constraintName = constraintName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_constraint_routine_usage.specific_catalog
     *
     * @return the value of check_constraint_routine_usage.specific_catalog
     *
     * @mbg.generated
     */
    public Object getSpecificCatalog() {
        return specificCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_constraint_routine_usage.specific_catalog
     *
     * @param specificCatalog the value for check_constraint_routine_usage.specific_catalog
     *
     * @mbg.generated
     */
    public void setSpecificCatalog(Object specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_constraint_routine_usage.specific_schema
     *
     * @return the value of check_constraint_routine_usage.specific_schema
     *
     * @mbg.generated
     */
    public Object getSpecificSchema() {
        return specificSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_constraint_routine_usage.specific_schema
     *
     * @param specificSchema the value for check_constraint_routine_usage.specific_schema
     *
     * @mbg.generated
     */
    public void setSpecificSchema(Object specificSchema) {
        this.specificSchema = specificSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_constraint_routine_usage.specific_name
     *
     * @return the value of check_constraint_routine_usage.specific_name
     *
     * @mbg.generated
     */
    public Object getSpecificName() {
        return specificName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_constraint_routine_usage.specific_name
     *
     * @param specificName the value for check_constraint_routine_usage.specific_name
     *
     * @mbg.generated
     */
    public void setSpecificName(Object specificName) {
        this.specificName = specificName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check_constraint_routine_usage
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", constraintCatalog=").append(constraintCatalog);
        sb.append(", constraintSchema=").append(constraintSchema);
        sb.append(", constraintName=").append(constraintName);
        sb.append(", specificCatalog=").append(specificCatalog);
        sb.append(", specificSchema=").append(specificSchema);
        sb.append(", specificName=").append(specificName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}