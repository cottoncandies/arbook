package com.alva.arbook.entity;

import java.io.Serializable;

public class UserMappings implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mappings.authorization_identifier
     *
     * @mbg.generated
     */
    private Object authorizationIdentifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mappings.foreign_server_catalog
     *
     * @mbg.generated
     */
    private Object foreignServerCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mappings.foreign_server_name
     *
     * @mbg.generated
     */
    private Object foreignServerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_mappings
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mappings.authorization_identifier
     *
     * @return the value of user_mappings.authorization_identifier
     *
     * @mbg.generated
     */
    public Object getAuthorizationIdentifier() {
        return authorizationIdentifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mappings.authorization_identifier
     *
     * @param authorizationIdentifier the value for user_mappings.authorization_identifier
     *
     * @mbg.generated
     */
    public void setAuthorizationIdentifier(Object authorizationIdentifier) {
        this.authorizationIdentifier = authorizationIdentifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mappings.foreign_server_catalog
     *
     * @return the value of user_mappings.foreign_server_catalog
     *
     * @mbg.generated
     */
    public Object getForeignServerCatalog() {
        return foreignServerCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mappings.foreign_server_catalog
     *
     * @param foreignServerCatalog the value for user_mappings.foreign_server_catalog
     *
     * @mbg.generated
     */
    public void setForeignServerCatalog(Object foreignServerCatalog) {
        this.foreignServerCatalog = foreignServerCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mappings.foreign_server_name
     *
     * @return the value of user_mappings.foreign_server_name
     *
     * @mbg.generated
     */
    public Object getForeignServerName() {
        return foreignServerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mappings.foreign_server_name
     *
     * @param foreignServerName the value for user_mappings.foreign_server_name
     *
     * @mbg.generated
     */
    public void setForeignServerName(Object foreignServerName) {
        this.foreignServerName = foreignServerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mappings
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", authorizationIdentifier=").append(authorizationIdentifier);
        sb.append(", foreignServerCatalog=").append(foreignServerCatalog);
        sb.append(", foreignServerName=").append(foreignServerName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}