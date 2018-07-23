package com.alva.arbook.entity;

import java.io.Serializable;

public class RoleColumnGrants implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_column_grants.grantor
     *
     * @mbg.generated
     */
    private Object grantor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_column_grants.grantee
     *
     * @mbg.generated
     */
    private Object grantee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_column_grants.table_catalog
     *
     * @mbg.generated
     */
    private Object tableCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_column_grants.table_schema
     *
     * @mbg.generated
     */
    private Object tableSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_column_grants.table_name
     *
     * @mbg.generated
     */
    private Object tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_column_grants.column_name
     *
     * @mbg.generated
     */
    private Object columnName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_column_grants.privilege_type
     *
     * @mbg.generated
     */
    private Object privilegeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_column_grants.is_grantable
     *
     * @mbg.generated
     */
    private Object isGrantable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_column_grants
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_column_grants.grantor
     *
     * @return the value of role_column_grants.grantor
     *
     * @mbg.generated
     */
    public Object getGrantor() {
        return grantor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_column_grants.grantor
     *
     * @param grantor the value for role_column_grants.grantor
     *
     * @mbg.generated
     */
    public void setGrantor(Object grantor) {
        this.grantor = grantor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_column_grants.grantee
     *
     * @return the value of role_column_grants.grantee
     *
     * @mbg.generated
     */
    public Object getGrantee() {
        return grantee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_column_grants.grantee
     *
     * @param grantee the value for role_column_grants.grantee
     *
     * @mbg.generated
     */
    public void setGrantee(Object grantee) {
        this.grantee = grantee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_column_grants.table_catalog
     *
     * @return the value of role_column_grants.table_catalog
     *
     * @mbg.generated
     */
    public Object getTableCatalog() {
        return tableCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_column_grants.table_catalog
     *
     * @param tableCatalog the value for role_column_grants.table_catalog
     *
     * @mbg.generated
     */
    public void setTableCatalog(Object tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_column_grants.table_schema
     *
     * @return the value of role_column_grants.table_schema
     *
     * @mbg.generated
     */
    public Object getTableSchema() {
        return tableSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_column_grants.table_schema
     *
     * @param tableSchema the value for role_column_grants.table_schema
     *
     * @mbg.generated
     */
    public void setTableSchema(Object tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_column_grants.table_name
     *
     * @return the value of role_column_grants.table_name
     *
     * @mbg.generated
     */
    public Object getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_column_grants.table_name
     *
     * @param tableName the value for role_column_grants.table_name
     *
     * @mbg.generated
     */
    public void setTableName(Object tableName) {
        this.tableName = tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_column_grants.column_name
     *
     * @return the value of role_column_grants.column_name
     *
     * @mbg.generated
     */
    public Object getColumnName() {
        return columnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_column_grants.column_name
     *
     * @param columnName the value for role_column_grants.column_name
     *
     * @mbg.generated
     */
    public void setColumnName(Object columnName) {
        this.columnName = columnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_column_grants.privilege_type
     *
     * @return the value of role_column_grants.privilege_type
     *
     * @mbg.generated
     */
    public Object getPrivilegeType() {
        return privilegeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_column_grants.privilege_type
     *
     * @param privilegeType the value for role_column_grants.privilege_type
     *
     * @mbg.generated
     */
    public void setPrivilegeType(Object privilegeType) {
        this.privilegeType = privilegeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_column_grants.is_grantable
     *
     * @return the value of role_column_grants.is_grantable
     *
     * @mbg.generated
     */
    public Object getIsGrantable() {
        return isGrantable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_column_grants.is_grantable
     *
     * @param isGrantable the value for role_column_grants.is_grantable
     *
     * @mbg.generated
     */
    public void setIsGrantable(Object isGrantable) {
        this.isGrantable = isGrantable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_column_grants
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grantor=").append(grantor);
        sb.append(", grantee=").append(grantee);
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", privilegeType=").append(privilegeType);
        sb.append(", isGrantable=").append(isGrantable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}