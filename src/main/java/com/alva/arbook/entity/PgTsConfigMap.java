package com.alva.arbook.entity;

import java.io.Serializable;

public class PgTsConfigMap implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_ts_config_map.mapcfg
     *
     * @mbg.generated
     */
    private Long mapcfg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_ts_config_map.maptokentype
     *
     * @mbg.generated
     */
    private Integer maptokentype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_ts_config_map.mapseqno
     *
     * @mbg.generated
     */
    private Integer mapseqno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_ts_config_map.mapdict
     *
     * @mbg.generated
     */
    private Long mapdict;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_ts_config_map
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_ts_config_map.mapcfg
     *
     * @return the value of pg_ts_config_map.mapcfg
     *
     * @mbg.generated
     */
    public Long getMapcfg() {
        return mapcfg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_ts_config_map.mapcfg
     *
     * @param mapcfg the value for pg_ts_config_map.mapcfg
     *
     * @mbg.generated
     */
    public void setMapcfg(Long mapcfg) {
        this.mapcfg = mapcfg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_ts_config_map.maptokentype
     *
     * @return the value of pg_ts_config_map.maptokentype
     *
     * @mbg.generated
     */
    public Integer getMaptokentype() {
        return maptokentype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_ts_config_map.maptokentype
     *
     * @param maptokentype the value for pg_ts_config_map.maptokentype
     *
     * @mbg.generated
     */
    public void setMaptokentype(Integer maptokentype) {
        this.maptokentype = maptokentype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_ts_config_map.mapseqno
     *
     * @return the value of pg_ts_config_map.mapseqno
     *
     * @mbg.generated
     */
    public Integer getMapseqno() {
        return mapseqno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_ts_config_map.mapseqno
     *
     * @param mapseqno the value for pg_ts_config_map.mapseqno
     *
     * @mbg.generated
     */
    public void setMapseqno(Integer mapseqno) {
        this.mapseqno = mapseqno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_ts_config_map.mapdict
     *
     * @return the value of pg_ts_config_map.mapdict
     *
     * @mbg.generated
     */
    public Long getMapdict() {
        return mapdict;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_ts_config_map.mapdict
     *
     * @param mapdict the value for pg_ts_config_map.mapdict
     *
     * @mbg.generated
     */
    public void setMapdict(Long mapdict) {
        this.mapdict = mapdict;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_ts_config_map
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mapcfg=").append(mapcfg);
        sb.append(", maptokentype=").append(maptokentype);
        sb.append(", mapseqno=").append(mapseqno);
        sb.append(", mapdict=").append(mapdict);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}