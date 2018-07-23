package com.alva.arbook.entity;

import java.io.Serializable;

public class PgAvailableExtensions implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_available_extensions.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_available_extensions.default_version
     *
     * @mbg.generated
     */
    private String defaultVersion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_available_extensions.installed_version
     *
     * @mbg.generated
     */
    private String installedVersion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_available_extensions.comment
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_available_extensions
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_available_extensions.name
     *
     * @return the value of pg_available_extensions.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_available_extensions.name
     *
     * @param name the value for pg_available_extensions.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_available_extensions.default_version
     *
     * @return the value of pg_available_extensions.default_version
     *
     * @mbg.generated
     */
    public String getDefaultVersion() {
        return defaultVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_available_extensions.default_version
     *
     * @param defaultVersion the value for pg_available_extensions.default_version
     *
     * @mbg.generated
     */
    public void setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion == null ? null : defaultVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_available_extensions.installed_version
     *
     * @return the value of pg_available_extensions.installed_version
     *
     * @mbg.generated
     */
    public String getInstalledVersion() {
        return installedVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_available_extensions.installed_version
     *
     * @param installedVersion the value for pg_available_extensions.installed_version
     *
     * @mbg.generated
     */
    public void setInstalledVersion(String installedVersion) {
        this.installedVersion = installedVersion == null ? null : installedVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_available_extensions.comment
     *
     * @return the value of pg_available_extensions.comment
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_available_extensions.comment
     *
     * @param comment the value for pg_available_extensions.comment
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_available_extensions
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
        sb.append(", defaultVersion=").append(defaultVersion);
        sb.append(", installedVersion=").append(installedVersion);
        sb.append(", comment=").append(comment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}