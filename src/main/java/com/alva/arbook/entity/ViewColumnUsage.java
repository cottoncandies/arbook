package com.alva.arbook.entity;

import java.io.Serializable;

public class ViewColumnUsage implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_column_usage.view_catalog
     *
     * @mbg.generated
     */
    private Object viewCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_column_usage.view_schema
     *
     * @mbg.generated
     */
    private Object viewSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_column_usage.view_name
     *
     * @mbg.generated
     */
    private Object viewName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_column_usage.table_catalog
     *
     * @mbg.generated
     */
    private Object tableCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_column_usage.table_schema
     *
     * @mbg.generated
     */
    private Object tableSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_column_usage.table_name
     *
     * @mbg.generated
     */
    private Object tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_column_usage.column_name
     *
     * @mbg.generated
     */
    private Object columnName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table view_column_usage
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_column_usage.view_catalog
     *
     * @return the value of view_column_usage.view_catalog
     *
     * @mbg.generated
     */
    public Object getViewCatalog() {
        return viewCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_column_usage.view_catalog
     *
     * @param viewCatalog the value for view_column_usage.view_catalog
     *
     * @mbg.generated
     */
    public void setViewCatalog(Object viewCatalog) {
        this.viewCatalog = viewCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_column_usage.view_schema
     *
     * @return the value of view_column_usage.view_schema
     *
     * @mbg.generated
     */
    public Object getViewSchema() {
        return viewSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_column_usage.view_schema
     *
     * @param viewSchema the value for view_column_usage.view_schema
     *
     * @mbg.generated
     */
    public void setViewSchema(Object viewSchema) {
        this.viewSchema = viewSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_column_usage.view_name
     *
     * @return the value of view_column_usage.view_name
     *
     * @mbg.generated
     */
    public Object getViewName() {
        return viewName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_column_usage.view_name
     *
     * @param viewName the value for view_column_usage.view_name
     *
     * @mbg.generated
     */
    public void setViewName(Object viewName) {
        this.viewName = viewName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_column_usage.table_catalog
     *
     * @return the value of view_column_usage.table_catalog
     *
     * @mbg.generated
     */
    public Object getTableCatalog() {
        return tableCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_column_usage.table_catalog
     *
     * @param tableCatalog the value for view_column_usage.table_catalog
     *
     * @mbg.generated
     */
    public void setTableCatalog(Object tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_column_usage.table_schema
     *
     * @return the value of view_column_usage.table_schema
     *
     * @mbg.generated
     */
    public Object getTableSchema() {
        return tableSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_column_usage.table_schema
     *
     * @param tableSchema the value for view_column_usage.table_schema
     *
     * @mbg.generated
     */
    public void setTableSchema(Object tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_column_usage.table_name
     *
     * @return the value of view_column_usage.table_name
     *
     * @mbg.generated
     */
    public Object getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_column_usage.table_name
     *
     * @param tableName the value for view_column_usage.table_name
     *
     * @mbg.generated
     */
    public void setTableName(Object tableName) {
        this.tableName = tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_column_usage.column_name
     *
     * @return the value of view_column_usage.column_name
     *
     * @mbg.generated
     */
    public Object getColumnName() {
        return columnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_column_usage.column_name
     *
     * @param columnName the value for view_column_usage.column_name
     *
     * @mbg.generated
     */
    public void setColumnName(Object columnName) {
        this.columnName = columnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_column_usage
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", viewCatalog=").append(viewCatalog);
        sb.append(", viewSchema=").append(viewSchema);
        sb.append(", viewName=").append(viewName);
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}