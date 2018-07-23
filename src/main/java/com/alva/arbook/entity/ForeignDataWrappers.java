package com.alva.arbook.entity;

import java.io.Serializable;

public class ForeignDataWrappers implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foreign_data_wrappers.foreign_data_wrapper_catalog
     *
     * @mbg.generated
     */
    private Object foreignDataWrapperCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foreign_data_wrappers.foreign_data_wrapper_name
     *
     * @mbg.generated
     */
    private Object foreignDataWrapperName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foreign_data_wrappers.authorization_identifier
     *
     * @mbg.generated
     */
    private Object authorizationIdentifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foreign_data_wrappers.library_name
     *
     * @mbg.generated
     */
    private Object libraryName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column foreign_data_wrappers.foreign_data_wrapper_language
     *
     * @mbg.generated
     */
    private Object foreignDataWrapperLanguage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foreign_data_wrappers
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foreign_data_wrappers.foreign_data_wrapper_catalog
     *
     * @return the value of foreign_data_wrappers.foreign_data_wrapper_catalog
     *
     * @mbg.generated
     */
    public Object getForeignDataWrapperCatalog() {
        return foreignDataWrapperCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foreign_data_wrappers.foreign_data_wrapper_catalog
     *
     * @param foreignDataWrapperCatalog the value for foreign_data_wrappers.foreign_data_wrapper_catalog
     *
     * @mbg.generated
     */
    public void setForeignDataWrapperCatalog(Object foreignDataWrapperCatalog) {
        this.foreignDataWrapperCatalog = foreignDataWrapperCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foreign_data_wrappers.foreign_data_wrapper_name
     *
     * @return the value of foreign_data_wrappers.foreign_data_wrapper_name
     *
     * @mbg.generated
     */
    public Object getForeignDataWrapperName() {
        return foreignDataWrapperName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foreign_data_wrappers.foreign_data_wrapper_name
     *
     * @param foreignDataWrapperName the value for foreign_data_wrappers.foreign_data_wrapper_name
     *
     * @mbg.generated
     */
    public void setForeignDataWrapperName(Object foreignDataWrapperName) {
        this.foreignDataWrapperName = foreignDataWrapperName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foreign_data_wrappers.authorization_identifier
     *
     * @return the value of foreign_data_wrappers.authorization_identifier
     *
     * @mbg.generated
     */
    public Object getAuthorizationIdentifier() {
        return authorizationIdentifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foreign_data_wrappers.authorization_identifier
     *
     * @param authorizationIdentifier the value for foreign_data_wrappers.authorization_identifier
     *
     * @mbg.generated
     */
    public void setAuthorizationIdentifier(Object authorizationIdentifier) {
        this.authorizationIdentifier = authorizationIdentifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foreign_data_wrappers.library_name
     *
     * @return the value of foreign_data_wrappers.library_name
     *
     * @mbg.generated
     */
    public Object getLibraryName() {
        return libraryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foreign_data_wrappers.library_name
     *
     * @param libraryName the value for foreign_data_wrappers.library_name
     *
     * @mbg.generated
     */
    public void setLibraryName(Object libraryName) {
        this.libraryName = libraryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column foreign_data_wrappers.foreign_data_wrapper_language
     *
     * @return the value of foreign_data_wrappers.foreign_data_wrapper_language
     *
     * @mbg.generated
     */
    public Object getForeignDataWrapperLanguage() {
        return foreignDataWrapperLanguage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column foreign_data_wrappers.foreign_data_wrapper_language
     *
     * @param foreignDataWrapperLanguage the value for foreign_data_wrappers.foreign_data_wrapper_language
     *
     * @mbg.generated
     */
    public void setForeignDataWrapperLanguage(Object foreignDataWrapperLanguage) {
        this.foreignDataWrapperLanguage = foreignDataWrapperLanguage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreign_data_wrappers
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", foreignDataWrapperCatalog=").append(foreignDataWrapperCatalog);
        sb.append(", foreignDataWrapperName=").append(foreignDataWrapperName);
        sb.append(", authorizationIdentifier=").append(authorizationIdentifier);
        sb.append(", libraryName=").append(libraryName);
        sb.append(", foreignDataWrapperLanguage=").append(foreignDataWrapperLanguage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}