package com.alva.arbook.entity;

import java.io.Serializable;
import java.util.Date;

public class PgStatActivity implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.datid
     *
     * @mbg.generated
     */
    private Long datid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.datname
     *
     * @mbg.generated
     */
    private String datname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.pid
     *
     * @mbg.generated
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.usesysid
     *
     * @mbg.generated
     */
    private Long usesysid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.usename
     *
     * @mbg.generated
     */
    private String usename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.application_name
     *
     * @mbg.generated
     */
    private String applicationName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.client_addr
     *
     * @mbg.generated
     */
    private Object clientAddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.client_hostname
     *
     * @mbg.generated
     */
    private String clientHostname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.client_port
     *
     * @mbg.generated
     */
    private Integer clientPort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.backend_start
     *
     * @mbg.generated
     */
    private Date backendStart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.xact_start
     *
     * @mbg.generated
     */
    private Date xactStart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.query_start
     *
     * @mbg.generated
     */
    private Date queryStart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.state_change
     *
     * @mbg.generated
     */
    private Date stateChange;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.wait_event_type
     *
     * @mbg.generated
     */
    private String waitEventType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.wait_event
     *
     * @mbg.generated
     */
    private String waitEvent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.state
     *
     * @mbg.generated
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.backend_xid
     *
     * @mbg.generated
     */
    private Object backendXid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.backend_xmin
     *
     * @mbg.generated
     */
    private Object backendXmin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.query
     *
     * @mbg.generated
     */
    private String query;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_activity.backend_type
     *
     * @mbg.generated
     */
    private String backendType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_stat_activity
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.datid
     *
     * @return the value of pg_stat_activity.datid
     *
     * @mbg.generated
     */
    public Long getDatid() {
        return datid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.datid
     *
     * @param datid the value for pg_stat_activity.datid
     *
     * @mbg.generated
     */
    public void setDatid(Long datid) {
        this.datid = datid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.datname
     *
     * @return the value of pg_stat_activity.datname
     *
     * @mbg.generated
     */
    public String getDatname() {
        return datname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.datname
     *
     * @param datname the value for pg_stat_activity.datname
     *
     * @mbg.generated
     */
    public void setDatname(String datname) {
        this.datname = datname == null ? null : datname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.pid
     *
     * @return the value of pg_stat_activity.pid
     *
     * @mbg.generated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.pid
     *
     * @param pid the value for pg_stat_activity.pid
     *
     * @mbg.generated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.usesysid
     *
     * @return the value of pg_stat_activity.usesysid
     *
     * @mbg.generated
     */
    public Long getUsesysid() {
        return usesysid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.usesysid
     *
     * @param usesysid the value for pg_stat_activity.usesysid
     *
     * @mbg.generated
     */
    public void setUsesysid(Long usesysid) {
        this.usesysid = usesysid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.usename
     *
     * @return the value of pg_stat_activity.usename
     *
     * @mbg.generated
     */
    public String getUsename() {
        return usename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.usename
     *
     * @param usename the value for pg_stat_activity.usename
     *
     * @mbg.generated
     */
    public void setUsename(String usename) {
        this.usename = usename == null ? null : usename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.application_name
     *
     * @return the value of pg_stat_activity.application_name
     *
     * @mbg.generated
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.application_name
     *
     * @param applicationName the value for pg_stat_activity.application_name
     *
     * @mbg.generated
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName == null ? null : applicationName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.client_addr
     *
     * @return the value of pg_stat_activity.client_addr
     *
     * @mbg.generated
     */
    public Object getClientAddr() {
        return clientAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.client_addr
     *
     * @param clientAddr the value for pg_stat_activity.client_addr
     *
     * @mbg.generated
     */
    public void setClientAddr(Object clientAddr) {
        this.clientAddr = clientAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.client_hostname
     *
     * @return the value of pg_stat_activity.client_hostname
     *
     * @mbg.generated
     */
    public String getClientHostname() {
        return clientHostname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.client_hostname
     *
     * @param clientHostname the value for pg_stat_activity.client_hostname
     *
     * @mbg.generated
     */
    public void setClientHostname(String clientHostname) {
        this.clientHostname = clientHostname == null ? null : clientHostname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.client_port
     *
     * @return the value of pg_stat_activity.client_port
     *
     * @mbg.generated
     */
    public Integer getClientPort() {
        return clientPort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.client_port
     *
     * @param clientPort the value for pg_stat_activity.client_port
     *
     * @mbg.generated
     */
    public void setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.backend_start
     *
     * @return the value of pg_stat_activity.backend_start
     *
     * @mbg.generated
     */
    public Date getBackendStart() {
        return backendStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.backend_start
     *
     * @param backendStart the value for pg_stat_activity.backend_start
     *
     * @mbg.generated
     */
    public void setBackendStart(Date backendStart) {
        this.backendStart = backendStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.xact_start
     *
     * @return the value of pg_stat_activity.xact_start
     *
     * @mbg.generated
     */
    public Date getXactStart() {
        return xactStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.xact_start
     *
     * @param xactStart the value for pg_stat_activity.xact_start
     *
     * @mbg.generated
     */
    public void setXactStart(Date xactStart) {
        this.xactStart = xactStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.query_start
     *
     * @return the value of pg_stat_activity.query_start
     *
     * @mbg.generated
     */
    public Date getQueryStart() {
        return queryStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.query_start
     *
     * @param queryStart the value for pg_stat_activity.query_start
     *
     * @mbg.generated
     */
    public void setQueryStart(Date queryStart) {
        this.queryStart = queryStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.state_change
     *
     * @return the value of pg_stat_activity.state_change
     *
     * @mbg.generated
     */
    public Date getStateChange() {
        return stateChange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.state_change
     *
     * @param stateChange the value for pg_stat_activity.state_change
     *
     * @mbg.generated
     */
    public void setStateChange(Date stateChange) {
        this.stateChange = stateChange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.wait_event_type
     *
     * @return the value of pg_stat_activity.wait_event_type
     *
     * @mbg.generated
     */
    public String getWaitEventType() {
        return waitEventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.wait_event_type
     *
     * @param waitEventType the value for pg_stat_activity.wait_event_type
     *
     * @mbg.generated
     */
    public void setWaitEventType(String waitEventType) {
        this.waitEventType = waitEventType == null ? null : waitEventType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.wait_event
     *
     * @return the value of pg_stat_activity.wait_event
     *
     * @mbg.generated
     */
    public String getWaitEvent() {
        return waitEvent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.wait_event
     *
     * @param waitEvent the value for pg_stat_activity.wait_event
     *
     * @mbg.generated
     */
    public void setWaitEvent(String waitEvent) {
        this.waitEvent = waitEvent == null ? null : waitEvent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.state
     *
     * @return the value of pg_stat_activity.state
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.state
     *
     * @param state the value for pg_stat_activity.state
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.backend_xid
     *
     * @return the value of pg_stat_activity.backend_xid
     *
     * @mbg.generated
     */
    public Object getBackendXid() {
        return backendXid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.backend_xid
     *
     * @param backendXid the value for pg_stat_activity.backend_xid
     *
     * @mbg.generated
     */
    public void setBackendXid(Object backendXid) {
        this.backendXid = backendXid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.backend_xmin
     *
     * @return the value of pg_stat_activity.backend_xmin
     *
     * @mbg.generated
     */
    public Object getBackendXmin() {
        return backendXmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.backend_xmin
     *
     * @param backendXmin the value for pg_stat_activity.backend_xmin
     *
     * @mbg.generated
     */
    public void setBackendXmin(Object backendXmin) {
        this.backendXmin = backendXmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.query
     *
     * @return the value of pg_stat_activity.query
     *
     * @mbg.generated
     */
    public String getQuery() {
        return query;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.query
     *
     * @param query the value for pg_stat_activity.query
     *
     * @mbg.generated
     */
    public void setQuery(String query) {
        this.query = query == null ? null : query.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_activity.backend_type
     *
     * @return the value of pg_stat_activity.backend_type
     *
     * @mbg.generated
     */
    public String getBackendType() {
        return backendType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_activity.backend_type
     *
     * @param backendType the value for pg_stat_activity.backend_type
     *
     * @mbg.generated
     */
    public void setBackendType(String backendType) {
        this.backendType = backendType == null ? null : backendType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_stat_activity
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", datid=").append(datid);
        sb.append(", datname=").append(datname);
        sb.append(", pid=").append(pid);
        sb.append(", usesysid=").append(usesysid);
        sb.append(", usename=").append(usename);
        sb.append(", applicationName=").append(applicationName);
        sb.append(", clientAddr=").append(clientAddr);
        sb.append(", clientHostname=").append(clientHostname);
        sb.append(", clientPort=").append(clientPort);
        sb.append(", backendStart=").append(backendStart);
        sb.append(", xactStart=").append(xactStart);
        sb.append(", queryStart=").append(queryStart);
        sb.append(", stateChange=").append(stateChange);
        sb.append(", waitEventType=").append(waitEventType);
        sb.append(", waitEvent=").append(waitEvent);
        sb.append(", state=").append(state);
        sb.append(", backendXid=").append(backendXid);
        sb.append(", backendXmin=").append(backendXmin);
        sb.append(", query=").append(query);
        sb.append(", backendType=").append(backendType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}