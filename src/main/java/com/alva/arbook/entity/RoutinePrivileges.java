package com.alva.arbook.entity;

import java.io.Serializable;

public class RoutinePrivileges implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column routine_privileges.grantor
     *
     * @mbg.generated
     */
    private Object grantor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column routine_privileges.grantee
     *
     * @mbg.generated
     */
    private Object grantee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column routine_privileges.specific_catalog
     *
     * @mbg.generated
     */
    private Object specificCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column routine_privileges.specific_schema
     *
     * @mbg.generated
     */
    private Object specificSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column routine_privileges.specific_name
     *
     * @mbg.generated
     */
    private Object specificName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column routine_privileges.routine_catalog
     *
     * @mbg.generated
     */
    private Object routineCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column routine_privileges.routine_schema
     *
     * @mbg.generated
     */
    private Object routineSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column routine_privileges.routine_name
     *
     * @mbg.generated
     */
    private Object routineName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column routine_privileges.privilege_type
     *
     * @mbg.generated
     */
    private Object privilegeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column routine_privileges.is_grantable
     *
     * @mbg.generated
     */
    private Object isGrantable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table routine_privileges
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column routine_privileges.grantor
     *
     * @return the value of routine_privileges.grantor
     *
     * @mbg.generated
     */
    public Object getGrantor() {
        return grantor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column routine_privileges.grantor
     *
     * @param grantor the value for routine_privileges.grantor
     *
     * @mbg.generated
     */
    public void setGrantor(Object grantor) {
        this.grantor = grantor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column routine_privileges.grantee
     *
     * @return the value of routine_privileges.grantee
     *
     * @mbg.generated
     */
    public Object getGrantee() {
        return grantee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column routine_privileges.grantee
     *
     * @param grantee the value for routine_privileges.grantee
     *
     * @mbg.generated
     */
    public void setGrantee(Object grantee) {
        this.grantee = grantee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column routine_privileges.specific_catalog
     *
     * @return the value of routine_privileges.specific_catalog
     *
     * @mbg.generated
     */
    public Object getSpecificCatalog() {
        return specificCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column routine_privileges.specific_catalog
     *
     * @param specificCatalog the value for routine_privileges.specific_catalog
     *
     * @mbg.generated
     */
    public void setSpecificCatalog(Object specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column routine_privileges.specific_schema
     *
     * @return the value of routine_privileges.specific_schema
     *
     * @mbg.generated
     */
    public Object getSpecificSchema() {
        return specificSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column routine_privileges.specific_schema
     *
     * @param specificSchema the value for routine_privileges.specific_schema
     *
     * @mbg.generated
     */
    public void setSpecificSchema(Object specificSchema) {
        this.specificSchema = specificSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column routine_privileges.specific_name
     *
     * @return the value of routine_privileges.specific_name
     *
     * @mbg.generated
     */
    public Object getSpecificName() {
        return specificName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column routine_privileges.specific_name
     *
     * @param specificName the value for routine_privileges.specific_name
     *
     * @mbg.generated
     */
    public void setSpecificName(Object specificName) {
        this.specificName = specificName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column routine_privileges.routine_catalog
     *
     * @return the value of routine_privileges.routine_catalog
     *
     * @mbg.generated
     */
    public Object getRoutineCatalog() {
        return routineCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column routine_privileges.routine_catalog
     *
     * @param routineCatalog the value for routine_privileges.routine_catalog
     *
     * @mbg.generated
     */
    public void setRoutineCatalog(Object routineCatalog) {
        this.routineCatalog = routineCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column routine_privileges.routine_schema
     *
     * @return the value of routine_privileges.routine_schema
     *
     * @mbg.generated
     */
    public Object getRoutineSchema() {
        return routineSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column routine_privileges.routine_schema
     *
     * @param routineSchema the value for routine_privileges.routine_schema
     *
     * @mbg.generated
     */
    public void setRoutineSchema(Object routineSchema) {
        this.routineSchema = routineSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column routine_privileges.routine_name
     *
     * @return the value of routine_privileges.routine_name
     *
     * @mbg.generated
     */
    public Object getRoutineName() {
        return routineName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column routine_privileges.routine_name
     *
     * @param routineName the value for routine_privileges.routine_name
     *
     * @mbg.generated
     */
    public void setRoutineName(Object routineName) {
        this.routineName = routineName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column routine_privileges.privilege_type
     *
     * @return the value of routine_privileges.privilege_type
     *
     * @mbg.generated
     */
    public Object getPrivilegeType() {
        return privilegeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column routine_privileges.privilege_type
     *
     * @param privilegeType the value for routine_privileges.privilege_type
     *
     * @mbg.generated
     */
    public void setPrivilegeType(Object privilegeType) {
        this.privilegeType = privilegeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column routine_privileges.is_grantable
     *
     * @return the value of routine_privileges.is_grantable
     *
     * @mbg.generated
     */
    public Object getIsGrantable() {
        return isGrantable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column routine_privileges.is_grantable
     *
     * @param isGrantable the value for routine_privileges.is_grantable
     *
     * @mbg.generated
     */
    public void setIsGrantable(Object isGrantable) {
        this.isGrantable = isGrantable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table routine_privileges
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
        sb.append(", specificCatalog=").append(specificCatalog);
        sb.append(", specificSchema=").append(specificSchema);
        sb.append(", specificName=").append(specificName);
        sb.append(", routineCatalog=").append(routineCatalog);
        sb.append(", routineSchema=").append(routineSchema);
        sb.append(", routineName=").append(routineName);
        sb.append(", privilegeType=").append(privilegeType);
        sb.append(", isGrantable=").append(isGrantable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}