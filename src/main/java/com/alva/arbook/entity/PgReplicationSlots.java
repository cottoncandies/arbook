package com.alva.arbook.entity;

import java.io.Serializable;

public class PgReplicationSlots implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_replication_slots.slot_name
     *
     * @mbg.generated
     */
    private String slotName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_replication_slots.plugin
     *
     * @mbg.generated
     */
    private String plugin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_replication_slots.slot_type
     *
     * @mbg.generated
     */
    private String slotType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_replication_slots.datoid
     *
     * @mbg.generated
     */
    private Long datoid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_replication_slots.database
     *
     * @mbg.generated
     */
    private String database;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_replication_slots.temporary
     *
     * @mbg.generated
     */
    private Boolean temporary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_replication_slots.active
     *
     * @mbg.generated
     */
    private Boolean active;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_replication_slots.active_pid
     *
     * @mbg.generated
     */
    private Integer activePid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_replication_slots.xmin
     *
     * @mbg.generated
     */
    private Object xmin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_replication_slots.catalog_xmin
     *
     * @mbg.generated
     */
    private Object catalogXmin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_replication_slots.restart_lsn
     *
     * @mbg.generated
     */
    private Object restartLsn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_replication_slots.confirmed_flush_lsn
     *
     * @mbg.generated
     */
    private Object confirmedFlushLsn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_replication_slots
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_replication_slots.slot_name
     *
     * @return the value of pg_replication_slots.slot_name
     *
     * @mbg.generated
     */
    public String getSlotName() {
        return slotName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_replication_slots.slot_name
     *
     * @param slotName the value for pg_replication_slots.slot_name
     *
     * @mbg.generated
     */
    public void setSlotName(String slotName) {
        this.slotName = slotName == null ? null : slotName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_replication_slots.plugin
     *
     * @return the value of pg_replication_slots.plugin
     *
     * @mbg.generated
     */
    public String getPlugin() {
        return plugin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_replication_slots.plugin
     *
     * @param plugin the value for pg_replication_slots.plugin
     *
     * @mbg.generated
     */
    public void setPlugin(String plugin) {
        this.plugin = plugin == null ? null : plugin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_replication_slots.slot_type
     *
     * @return the value of pg_replication_slots.slot_type
     *
     * @mbg.generated
     */
    public String getSlotType() {
        return slotType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_replication_slots.slot_type
     *
     * @param slotType the value for pg_replication_slots.slot_type
     *
     * @mbg.generated
     */
    public void setSlotType(String slotType) {
        this.slotType = slotType == null ? null : slotType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_replication_slots.datoid
     *
     * @return the value of pg_replication_slots.datoid
     *
     * @mbg.generated
     */
    public Long getDatoid() {
        return datoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_replication_slots.datoid
     *
     * @param datoid the value for pg_replication_slots.datoid
     *
     * @mbg.generated
     */
    public void setDatoid(Long datoid) {
        this.datoid = datoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_replication_slots.database
     *
     * @return the value of pg_replication_slots.database
     *
     * @mbg.generated
     */
    public String getDatabase() {
        return database;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_replication_slots.database
     *
     * @param database the value for pg_replication_slots.database
     *
     * @mbg.generated
     */
    public void setDatabase(String database) {
        this.database = database == null ? null : database.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_replication_slots.temporary
     *
     * @return the value of pg_replication_slots.temporary
     *
     * @mbg.generated
     */
    public Boolean getTemporary() {
        return temporary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_replication_slots.temporary
     *
     * @param temporary the value for pg_replication_slots.temporary
     *
     * @mbg.generated
     */
    public void setTemporary(Boolean temporary) {
        this.temporary = temporary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_replication_slots.active
     *
     * @return the value of pg_replication_slots.active
     *
     * @mbg.generated
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_replication_slots.active
     *
     * @param active the value for pg_replication_slots.active
     *
     * @mbg.generated
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_replication_slots.active_pid
     *
     * @return the value of pg_replication_slots.active_pid
     *
     * @mbg.generated
     */
    public Integer getActivePid() {
        return activePid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_replication_slots.active_pid
     *
     * @param activePid the value for pg_replication_slots.active_pid
     *
     * @mbg.generated
     */
    public void setActivePid(Integer activePid) {
        this.activePid = activePid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_replication_slots.xmin
     *
     * @return the value of pg_replication_slots.xmin
     *
     * @mbg.generated
     */
    public Object getXmin() {
        return xmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_replication_slots.xmin
     *
     * @param xmin the value for pg_replication_slots.xmin
     *
     * @mbg.generated
     */
    public void setXmin(Object xmin) {
        this.xmin = xmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_replication_slots.catalog_xmin
     *
     * @return the value of pg_replication_slots.catalog_xmin
     *
     * @mbg.generated
     */
    public Object getCatalogXmin() {
        return catalogXmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_replication_slots.catalog_xmin
     *
     * @param catalogXmin the value for pg_replication_slots.catalog_xmin
     *
     * @mbg.generated
     */
    public void setCatalogXmin(Object catalogXmin) {
        this.catalogXmin = catalogXmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_replication_slots.restart_lsn
     *
     * @return the value of pg_replication_slots.restart_lsn
     *
     * @mbg.generated
     */
    public Object getRestartLsn() {
        return restartLsn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_replication_slots.restart_lsn
     *
     * @param restartLsn the value for pg_replication_slots.restart_lsn
     *
     * @mbg.generated
     */
    public void setRestartLsn(Object restartLsn) {
        this.restartLsn = restartLsn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_replication_slots.confirmed_flush_lsn
     *
     * @return the value of pg_replication_slots.confirmed_flush_lsn
     *
     * @mbg.generated
     */
    public Object getConfirmedFlushLsn() {
        return confirmedFlushLsn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_replication_slots.confirmed_flush_lsn
     *
     * @param confirmedFlushLsn the value for pg_replication_slots.confirmed_flush_lsn
     *
     * @mbg.generated
     */
    public void setConfirmedFlushLsn(Object confirmedFlushLsn) {
        this.confirmedFlushLsn = confirmedFlushLsn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_replication_slots
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", slotName=").append(slotName);
        sb.append(", plugin=").append(plugin);
        sb.append(", slotType=").append(slotType);
        sb.append(", datoid=").append(datoid);
        sb.append(", database=").append(database);
        sb.append(", temporary=").append(temporary);
        sb.append(", active=").append(active);
        sb.append(", activePid=").append(activePid);
        sb.append(", xmin=").append(xmin);
        sb.append(", catalogXmin=").append(catalogXmin);
        sb.append(", restartLsn=").append(restartLsn);
        sb.append(", confirmedFlushLsn=").append(confirmedFlushLsn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}