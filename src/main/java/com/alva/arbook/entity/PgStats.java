package com.alva.arbook.entity;

import java.io.Serializable;

public class PgStats implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stats.schemaname
     *
     * @mbg.generated
     */
    private String schemaname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stats.tablename
     *
     * @mbg.generated
     */
    private String tablename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stats.attname
     *
     * @mbg.generated
     */
    private String attname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stats.inherited
     *
     * @mbg.generated
     */
    private Boolean inherited;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stats.null_frac
     *
     * @mbg.generated
     */
    private Float nullFrac;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stats.avg_width
     *
     * @mbg.generated
     */
    private Integer avgWidth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stats.n_distinct
     *
     * @mbg.generated
     */
    private Float nDistinct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stats.most_common_vals
     *
     * @mbg.generated
     */
    private Object mostCommonVals;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stats.most_common_freqs
     *
     * @mbg.generated
     */
    private Object mostCommonFreqs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stats.histogram_bounds
     *
     * @mbg.generated
     */
    private Object histogramBounds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stats.correlation
     *
     * @mbg.generated
     */
    private Float correlation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stats.most_common_elems
     *
     * @mbg.generated
     */
    private Object mostCommonElems;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stats.most_common_elem_freqs
     *
     * @mbg.generated
     */
    private Object mostCommonElemFreqs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_stats.elem_count_histogram
     *
     * @mbg.generated
     */
    private Object elemCountHistogram;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_stats
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stats.schemaname
     *
     * @return the value of pg_stats.schemaname
     *
     * @mbg.generated
     */
    public String getSchemaname() {
        return schemaname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stats.schemaname
     *
     * @param schemaname the value for pg_stats.schemaname
     *
     * @mbg.generated
     */
    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname == null ? null : schemaname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stats.tablename
     *
     * @return the value of pg_stats.tablename
     *
     * @mbg.generated
     */
    public String getTablename() {
        return tablename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stats.tablename
     *
     * @param tablename the value for pg_stats.tablename
     *
     * @mbg.generated
     */
    public void setTablename(String tablename) {
        this.tablename = tablename == null ? null : tablename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stats.attname
     *
     * @return the value of pg_stats.attname
     *
     * @mbg.generated
     */
    public String getAttname() {
        return attname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stats.attname
     *
     * @param attname the value for pg_stats.attname
     *
     * @mbg.generated
     */
    public void setAttname(String attname) {
        this.attname = attname == null ? null : attname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stats.inherited
     *
     * @return the value of pg_stats.inherited
     *
     * @mbg.generated
     */
    public Boolean getInherited() {
        return inherited;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stats.inherited
     *
     * @param inherited the value for pg_stats.inherited
     *
     * @mbg.generated
     */
    public void setInherited(Boolean inherited) {
        this.inherited = inherited;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stats.null_frac
     *
     * @return the value of pg_stats.null_frac
     *
     * @mbg.generated
     */
    public Float getNullFrac() {
        return nullFrac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stats.null_frac
     *
     * @param nullFrac the value for pg_stats.null_frac
     *
     * @mbg.generated
     */
    public void setNullFrac(Float nullFrac) {
        this.nullFrac = nullFrac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stats.avg_width
     *
     * @return the value of pg_stats.avg_width
     *
     * @mbg.generated
     */
    public Integer getAvgWidth() {
        return avgWidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stats.avg_width
     *
     * @param avgWidth the value for pg_stats.avg_width
     *
     * @mbg.generated
     */
    public void setAvgWidth(Integer avgWidth) {
        this.avgWidth = avgWidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stats.n_distinct
     *
     * @return the value of pg_stats.n_distinct
     *
     * @mbg.generated
     */
    public Float getnDistinct() {
        return nDistinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stats.n_distinct
     *
     * @param nDistinct the value for pg_stats.n_distinct
     *
     * @mbg.generated
     */
    public void setnDistinct(Float nDistinct) {
        this.nDistinct = nDistinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stats.most_common_vals
     *
     * @return the value of pg_stats.most_common_vals
     *
     * @mbg.generated
     */
    public Object getMostCommonVals() {
        return mostCommonVals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stats.most_common_vals
     *
     * @param mostCommonVals the value for pg_stats.most_common_vals
     *
     * @mbg.generated
     */
    public void setMostCommonVals(Object mostCommonVals) {
        this.mostCommonVals = mostCommonVals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stats.most_common_freqs
     *
     * @return the value of pg_stats.most_common_freqs
     *
     * @mbg.generated
     */
    public Object getMostCommonFreqs() {
        return mostCommonFreqs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stats.most_common_freqs
     *
     * @param mostCommonFreqs the value for pg_stats.most_common_freqs
     *
     * @mbg.generated
     */
    public void setMostCommonFreqs(Object mostCommonFreqs) {
        this.mostCommonFreqs = mostCommonFreqs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stats.histogram_bounds
     *
     * @return the value of pg_stats.histogram_bounds
     *
     * @mbg.generated
     */
    public Object getHistogramBounds() {
        return histogramBounds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stats.histogram_bounds
     *
     * @param histogramBounds the value for pg_stats.histogram_bounds
     *
     * @mbg.generated
     */
    public void setHistogramBounds(Object histogramBounds) {
        this.histogramBounds = histogramBounds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stats.correlation
     *
     * @return the value of pg_stats.correlation
     *
     * @mbg.generated
     */
    public Float getCorrelation() {
        return correlation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stats.correlation
     *
     * @param correlation the value for pg_stats.correlation
     *
     * @mbg.generated
     */
    public void setCorrelation(Float correlation) {
        this.correlation = correlation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stats.most_common_elems
     *
     * @return the value of pg_stats.most_common_elems
     *
     * @mbg.generated
     */
    public Object getMostCommonElems() {
        return mostCommonElems;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stats.most_common_elems
     *
     * @param mostCommonElems the value for pg_stats.most_common_elems
     *
     * @mbg.generated
     */
    public void setMostCommonElems(Object mostCommonElems) {
        this.mostCommonElems = mostCommonElems;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stats.most_common_elem_freqs
     *
     * @return the value of pg_stats.most_common_elem_freqs
     *
     * @mbg.generated
     */
    public Object getMostCommonElemFreqs() {
        return mostCommonElemFreqs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stats.most_common_elem_freqs
     *
     * @param mostCommonElemFreqs the value for pg_stats.most_common_elem_freqs
     *
     * @mbg.generated
     */
    public void setMostCommonElemFreqs(Object mostCommonElemFreqs) {
        this.mostCommonElemFreqs = mostCommonElemFreqs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_stats.elem_count_histogram
     *
     * @return the value of pg_stats.elem_count_histogram
     *
     * @mbg.generated
     */
    public Object getElemCountHistogram() {
        return elemCountHistogram;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_stats.elem_count_histogram
     *
     * @param elemCountHistogram the value for pg_stats.elem_count_histogram
     *
     * @mbg.generated
     */
    public void setElemCountHistogram(Object elemCountHistogram) {
        this.elemCountHistogram = elemCountHistogram;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_stats
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schemaname=").append(schemaname);
        sb.append(", tablename=").append(tablename);
        sb.append(", attname=").append(attname);
        sb.append(", inherited=").append(inherited);
        sb.append(", nullFrac=").append(nullFrac);
        sb.append(", avgWidth=").append(avgWidth);
        sb.append(", nDistinct=").append(nDistinct);
        sb.append(", mostCommonVals=").append(mostCommonVals);
        sb.append(", mostCommonFreqs=").append(mostCommonFreqs);
        sb.append(", histogramBounds=").append(histogramBounds);
        sb.append(", correlation=").append(correlation);
        sb.append(", mostCommonElems=").append(mostCommonElems);
        sb.append(", mostCommonElemFreqs=").append(mostCommonElemFreqs);
        sb.append(", elemCountHistogram=").append(elemCountHistogram);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}