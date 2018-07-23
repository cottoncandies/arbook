package com.alva.arbook.entity;

import java.io.Serializable;
import java.util.Date;

public class PgStatBgwriter implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_bgwriter.checkpoints_timed
     *
     * @mbg.generated
     */
    private Long checkpointsTimed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_bgwriter.checkpoints_req
     *
     * @mbg.generated
     */
    private Long checkpointsReq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_bgwriter.checkpoint_write_time
     *
     * @mbg.generated
     */
    private Double checkpointWriteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_bgwriter.checkpoint_sync_time
     *
     * @mbg.generated
     */
    private Double checkpointSyncTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_bgwriter.buffers_checkpoint
     *
     * @mbg.generated
     */
    private Long buffersCheckpoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_bgwriter.buffers_clean
     *
     * @mbg.generated
     */
    private Long buffersClean;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_bgwriter.maxwritten_clean
     *
     * @mbg.generated
     */
    private Long maxwrittenClean;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_bgwriter.buffers_backend
     *
     * @mbg.generated
     */
    private Long buffersBackend;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_bgwriter.buffers_backend_fsync
     *
     * @mbg.generated
     */
    private Long buffersBackendFsync;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_bgwriter.buffers_alloc
     *
     * @mbg.generated
     */
    private Long buffersAlloc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stat_bgwriter.stats_reset
     *
     * @mbg.generated
     */
    private Date statsReset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_stat_bgwriter
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_bgwriter.checkpoints_timed
     *
     * @return the value of pg_stat_bgwriter.checkpoints_timed
     *
     * @mbg.generated
     */
    public Long getCheckpointsTimed() {
        return checkpointsTimed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_bgwriter.checkpoints_timed
     *
     * @param checkpointsTimed the value for pg_stat_bgwriter.checkpoints_timed
     *
     * @mbg.generated
     */
    public void setCheckpointsTimed(Long checkpointsTimed) {
        this.checkpointsTimed = checkpointsTimed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_bgwriter.checkpoints_req
     *
     * @return the value of pg_stat_bgwriter.checkpoints_req
     *
     * @mbg.generated
     */
    public Long getCheckpointsReq() {
        return checkpointsReq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_bgwriter.checkpoints_req
     *
     * @param checkpointsReq the value for pg_stat_bgwriter.checkpoints_req
     *
     * @mbg.generated
     */
    public void setCheckpointsReq(Long checkpointsReq) {
        this.checkpointsReq = checkpointsReq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_bgwriter.checkpoint_write_time
     *
     * @return the value of pg_stat_bgwriter.checkpoint_write_time
     *
     * @mbg.generated
     */
    public Double getCheckpointWriteTime() {
        return checkpointWriteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_bgwriter.checkpoint_write_time
     *
     * @param checkpointWriteTime the value for pg_stat_bgwriter.checkpoint_write_time
     *
     * @mbg.generated
     */
    public void setCheckpointWriteTime(Double checkpointWriteTime) {
        this.checkpointWriteTime = checkpointWriteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_bgwriter.checkpoint_sync_time
     *
     * @return the value of pg_stat_bgwriter.checkpoint_sync_time
     *
     * @mbg.generated
     */
    public Double getCheckpointSyncTime() {
        return checkpointSyncTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_bgwriter.checkpoint_sync_time
     *
     * @param checkpointSyncTime the value for pg_stat_bgwriter.checkpoint_sync_time
     *
     * @mbg.generated
     */
    public void setCheckpointSyncTime(Double checkpointSyncTime) {
        this.checkpointSyncTime = checkpointSyncTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_bgwriter.buffers_checkpoint
     *
     * @return the value of pg_stat_bgwriter.buffers_checkpoint
     *
     * @mbg.generated
     */
    public Long getBuffersCheckpoint() {
        return buffersCheckpoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_bgwriter.buffers_checkpoint
     *
     * @param buffersCheckpoint the value for pg_stat_bgwriter.buffers_checkpoint
     *
     * @mbg.generated
     */
    public void setBuffersCheckpoint(Long buffersCheckpoint) {
        this.buffersCheckpoint = buffersCheckpoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_bgwriter.buffers_clean
     *
     * @return the value of pg_stat_bgwriter.buffers_clean
     *
     * @mbg.generated
     */
    public Long getBuffersClean() {
        return buffersClean;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_bgwriter.buffers_clean
     *
     * @param buffersClean the value for pg_stat_bgwriter.buffers_clean
     *
     * @mbg.generated
     */
    public void setBuffersClean(Long buffersClean) {
        this.buffersClean = buffersClean;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_bgwriter.maxwritten_clean
     *
     * @return the value of pg_stat_bgwriter.maxwritten_clean
     *
     * @mbg.generated
     */
    public Long getMaxwrittenClean() {
        return maxwrittenClean;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_bgwriter.maxwritten_clean
     *
     * @param maxwrittenClean the value for pg_stat_bgwriter.maxwritten_clean
     *
     * @mbg.generated
     */
    public void setMaxwrittenClean(Long maxwrittenClean) {
        this.maxwrittenClean = maxwrittenClean;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_bgwriter.buffers_backend
     *
     * @return the value of pg_stat_bgwriter.buffers_backend
     *
     * @mbg.generated
     */
    public Long getBuffersBackend() {
        return buffersBackend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_bgwriter.buffers_backend
     *
     * @param buffersBackend the value for pg_stat_bgwriter.buffers_backend
     *
     * @mbg.generated
     */
    public void setBuffersBackend(Long buffersBackend) {
        this.buffersBackend = buffersBackend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_bgwriter.buffers_backend_fsync
     *
     * @return the value of pg_stat_bgwriter.buffers_backend_fsync
     *
     * @mbg.generated
     */
    public Long getBuffersBackendFsync() {
        return buffersBackendFsync;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_bgwriter.buffers_backend_fsync
     *
     * @param buffersBackendFsync the value for pg_stat_bgwriter.buffers_backend_fsync
     *
     * @mbg.generated
     */
    public void setBuffersBackendFsync(Long buffersBackendFsync) {
        this.buffersBackendFsync = buffersBackendFsync;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_bgwriter.buffers_alloc
     *
     * @return the value of pg_stat_bgwriter.buffers_alloc
     *
     * @mbg.generated
     */
    public Long getBuffersAlloc() {
        return buffersAlloc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_bgwriter.buffers_alloc
     *
     * @param buffersAlloc the value for pg_stat_bgwriter.buffers_alloc
     *
     * @mbg.generated
     */
    public void setBuffersAlloc(Long buffersAlloc) {
        this.buffersAlloc = buffersAlloc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stat_bgwriter.stats_reset
     *
     * @return the value of pg_stat_bgwriter.stats_reset
     *
     * @mbg.generated
     */
    public Date getStatsReset() {
        return statsReset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stat_bgwriter.stats_reset
     *
     * @param statsReset the value for pg_stat_bgwriter.stats_reset
     *
     * @mbg.generated
     */
    public void setStatsReset(Date statsReset) {
        this.statsReset = statsReset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_stat_bgwriter
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", checkpointsTimed=").append(checkpointsTimed);
        sb.append(", checkpointsReq=").append(checkpointsReq);
        sb.append(", checkpointWriteTime=").append(checkpointWriteTime);
        sb.append(", checkpointSyncTime=").append(checkpointSyncTime);
        sb.append(", buffersCheckpoint=").append(buffersCheckpoint);
        sb.append(", buffersClean=").append(buffersClean);
        sb.append(", maxwrittenClean=").append(maxwrittenClean);
        sb.append(", buffersBackend=").append(buffersBackend);
        sb.append(", buffersBackendFsync=").append(buffersBackendFsync);
        sb.append(", buffersAlloc=").append(buffersAlloc);
        sb.append(", statsReset=").append(statsReset);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}