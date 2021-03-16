
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Paging {

    @SerializedName("total")
    @Expose
    private Long total;
    @SerializedName("primary_results")
    @Expose
    private Long primaryResults;
    @SerializedName("offset")
    @Expose
    private Long offset;
    @SerializedName("limit")
    @Expose
    private Long limit;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Paging() {
    }

    /**
     * 
     * @param total
     * @param offset
     * @param limit
     * @param primaryResults
     */
    public Paging(Long total, Long primaryResults, Long offset, Long limit) {
        super();
        this.total = total;
        this.primaryResults = primaryResults;
        this.offset = offset;
        this.limit = limit;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getPrimaryResults() {
        return primaryResults;
    }

    public void setPrimaryResults(Long primaryResults) {
        this.primaryResults = primaryResults;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("total", total).append("primaryResults", primaryResults).append("offset", offset).append("limit", limit).toString();
    }

}
