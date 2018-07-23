package com.alva.arbook.entity;

import java.io.Serializable;

public class PgHbaFileRules implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_hba_file_rules.line_number
     *
     * @mbg.generated
     */
    private Integer lineNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_hba_file_rules.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_hba_file_rules.database
     *
     * @mbg.generated
     */
    private Object database;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_hba_file_rules.user_name
     *
     * @mbg.generated
     */
    private Object userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_hba_file_rules.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_hba_file_rules.netmask
     *
     * @mbg.generated
     */
    private String netmask;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_hba_file_rules.auth_method
     *
     * @mbg.generated
     */
    private String authMethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_hba_file_rules.options
     *
     * @mbg.generated
     */
    private Object options;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_hba_file_rules.error
     *
     * @mbg.generated
     */
    private String error;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_hba_file_rules
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_hba_file_rules.line_number
     *
     * @return the value of pg_hba_file_rules.line_number
     *
     * @mbg.generated
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_hba_file_rules.line_number
     *
     * @param lineNumber the value for pg_hba_file_rules.line_number
     *
     * @mbg.generated
     */
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_hba_file_rules.type
     *
     * @return the value of pg_hba_file_rules.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_hba_file_rules.type
     *
     * @param type the value for pg_hba_file_rules.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_hba_file_rules.database
     *
     * @return the value of pg_hba_file_rules.database
     *
     * @mbg.generated
     */
    public Object getDatabase() {
        return database;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_hba_file_rules.database
     *
     * @param database the value for pg_hba_file_rules.database
     *
     * @mbg.generated
     */
    public void setDatabase(Object database) {
        this.database = database;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_hba_file_rules.user_name
     *
     * @return the value of pg_hba_file_rules.user_name
     *
     * @mbg.generated
     */
    public Object getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_hba_file_rules.user_name
     *
     * @param userName the value for pg_hba_file_rules.user_name
     *
     * @mbg.generated
     */
    public void setUserName(Object userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_hba_file_rules.address
     *
     * @return the value of pg_hba_file_rules.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_hba_file_rules.address
     *
     * @param address the value for pg_hba_file_rules.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_hba_file_rules.netmask
     *
     * @return the value of pg_hba_file_rules.netmask
     *
     * @mbg.generated
     */
    public String getNetmask() {
        return netmask;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_hba_file_rules.netmask
     *
     * @param netmask the value for pg_hba_file_rules.netmask
     *
     * @mbg.generated
     */
    public void setNetmask(String netmask) {
        this.netmask = netmask == null ? null : netmask.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_hba_file_rules.auth_method
     *
     * @return the value of pg_hba_file_rules.auth_method
     *
     * @mbg.generated
     */
    public String getAuthMethod() {
        return authMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_hba_file_rules.auth_method
     *
     * @param authMethod the value for pg_hba_file_rules.auth_method
     *
     * @mbg.generated
     */
    public void setAuthMethod(String authMethod) {
        this.authMethod = authMethod == null ? null : authMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_hba_file_rules.options
     *
     * @return the value of pg_hba_file_rules.options
     *
     * @mbg.generated
     */
    public Object getOptions() {
        return options;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_hba_file_rules.options
     *
     * @param options the value for pg_hba_file_rules.options
     *
     * @mbg.generated
     */
    public void setOptions(Object options) {
        this.options = options;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_hba_file_rules.error
     *
     * @return the value of pg_hba_file_rules.error
     *
     * @mbg.generated
     */
    public String getError() {
        return error;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_hba_file_rules.error
     *
     * @param error the value for pg_hba_file_rules.error
     *
     * @mbg.generated
     */
    public void setError(String error) {
        this.error = error == null ? null : error.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_hba_file_rules
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lineNumber=").append(lineNumber);
        sb.append(", type=").append(type);
        sb.append(", database=").append(database);
        sb.append(", userName=").append(userName);
        sb.append(", address=").append(address);
        sb.append(", netmask=").append(netmask);
        sb.append(", authMethod=").append(authMethod);
        sb.append(", options=").append(options);
        sb.append(", error=").append(error);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}