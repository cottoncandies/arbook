package com.alva.arbook.entity;

import java.io.Serializable;

public class ColumnDomainUsage implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column column_domain_usage.domain_catalog
     *
     * @mbg.generated
     */
    private Object domainCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column column_domain_usage.domain_schema
     *
     * @mbg.generated
     */
    private Object domainSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column column_domain_usage.domain_name
     *
     * @mbg.generated
     */
    private Object domainName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column column_domain_usage.table_catalog
     *
     * @mbg.generated
     */
    private Object tableCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column column_domain_usage.table_schema
     *
     * @mbg.generated
     */
    private Object tableSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column column_domain_usage.table_name
     *
     * @mbg.generated
     */
    private Object tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column column_domain_usage.column_name
     *
     * @mbg.generated
     */
    private Object columnName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table column_domain_usage
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column column_domain_usage.domain_catalog
     *
     * @return the value of column_domain_usage.domain_catalog
     *
     * @mbg.generated
     */
    public Object getDomainCatalog() {
        return domainCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column column_domain_usage.domain_catalog
     *
     * @param domainCatalog the value for column_domain_usage.domain_catalog
     *
     * @mbg.generated
     */
    public void setDomainCatalog(Object domainCatalog) {
        this.domainCatalog = domainCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column column_domain_usage.domain_schema
     *
     * @return the value of column_domain_usage.domain_schema
     *
     * @mbg.generated
     */
    public Object getDomainSchema() {
        return domainSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column column_domain_usage.domain_schema
     *
     * @param domainSchema the value for column_domain_usage.domain_schema
     *
     * @mbg.generated
     */
    public void setDomainSchema(Object domainSchema) {
        this.domainSchema = domainSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column column_domain_usage.domain_name
     *
     * @return the value of column_domain_usage.domain_name
     *
     * @mbg.generated
     */
    public Object getDomainName() {
        return domainName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column column_domain_usage.domain_name
     *
     * @param domainName the value for column_domain_usage.domain_name
     *
     * @mbg.generated
     */
    public void setDomainName(Object domainName) {
        this.domainName = domainName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column column_domain_usage.table_catalog
     *
     * @return the value of column_domain_usage.table_catalog
     *
     * @mbg.generated
     */
    public Object getTableCatalog() {
        return tableCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column column_domain_usage.table_catalog
     *
     * @param tableCatalog the value for column_domain_usage.table_catalog
     *
     * @mbg.generated
     */
    public void setTableCatalog(Object tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column column_domain_usage.table_schema
     *
     * @return the value of column_domain_usage.table_schema
     *
     * @mbg.generated
     */
    public Object getTableSchema() {
        return tableSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column column_domain_usage.table_schema
     *
     * @param tableSchema the value for column_domain_usage.table_schema
     *
     * @mbg.generated
     */
    public void setTableSchema(Object tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column column_domain_usage.table_name
     *
     * @return the value of column_domain_usage.table_name
     *
     * @mbg.generated
     */
    public Object getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column column_domain_usage.table_name
     *
     * @param tableName the value for column_domain_usage.table_name
     *
     * @mbg.generated
     */
    public void setTableName(Object tableName) {
        this.tableName = tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column column_domain_usage.column_name
     *
     * @return the value of column_domain_usage.column_name
     *
     * @mbg.generated
     */
    public Object getColumnName() {
        return columnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column column_domain_usage.column_name
     *
     * @param columnName the value for column_domain_usage.column_name
     *
     * @mbg.generated
     */
    public void setColumnName(Object columnName) {
        this.columnName = columnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table column_domain_usage
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", domainCatalog=").append(domainCatalog);
        sb.append(", domainSchema=").append(domainSchema);
        sb.append(", domainName=").append(domainName);
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}