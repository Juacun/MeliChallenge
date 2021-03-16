
package meli.user;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class UserPojo {

    @SerializedName("site_id")
    @Expose
    private String siteId;
    @SerializedName("seller")
    @Expose
    private Seller seller;
    @SerializedName("paging")
    @Expose
    private Paging paging;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("secondary_results")
    @Expose
    private List<Object> secondaryResults = null;
    @SerializedName("related_results")
    @Expose
    private List<Object> relatedResults = null;
    @SerializedName("sort")
    @Expose
    private Sort sort;
    @SerializedName("available_sorts")
    @Expose
    private List<AvailableSort> availableSorts = null;
    @SerializedName("filters")
    @Expose
    private List<Filter> filters = null;
    @SerializedName("available_filters")
    @Expose
    private List<AvailableFilter> availableFilters = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserPojo() {
    }

    /**
     * 
     * @param seller
     * @param secondaryResults
     * @param relatedResults
     * @param availableSorts
     * @param availableFilters
     * @param siteId
     * @param paging
     * @param sort
     * @param filters
     * @param results
     */
    public UserPojo(String siteId, Seller seller, Paging paging, List<Result> results, List<Object> secondaryResults, List<Object> relatedResults, Sort sort, List<AvailableSort> availableSorts, List<Filter> filters, List<AvailableFilter> availableFilters) {
        super();
        this.siteId = siteId;
        this.seller = seller;
        this.paging = paging;
        this.results = results;
        this.secondaryResults = secondaryResults;
        this.relatedResults = relatedResults;
        this.sort = sort;
        this.availableSorts = availableSorts;
        this.filters = filters;
        this.availableFilters = availableFilters;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public List<Object> getSecondaryResults() {
        return secondaryResults;
    }

    public void setSecondaryResults(List<Object> secondaryResults) {
        this.secondaryResults = secondaryResults;
    }

    public List<Object> getRelatedResults() {
        return relatedResults;
    }

    public void setRelatedResults(List<Object> relatedResults) {
        this.relatedResults = relatedResults;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public List<AvailableSort> getAvailableSorts() {
        return availableSorts;
    }

    public void setAvailableSorts(List<AvailableSort> availableSorts) {
        this.availableSorts = availableSorts;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public List<AvailableFilter> getAvailableFilters() {
        return availableFilters;
    }

    public void setAvailableFilters(List<AvailableFilter> availableFilters) {
        this.availableFilters = availableFilters;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("siteId", siteId).append("seller", seller).append("paging", paging).append("results", results).append("secondaryResults", secondaryResults).append("relatedResults", relatedResults).append("sort", sort).append("availableSorts", availableSorts).append("filters", filters).append("availableFilters", availableFilters).toString();
    }

}
