
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Transactions_ {

    @SerializedName("total")
    @Expose
    private Long total;
    @SerializedName("canceled")
    @Expose
    private Long canceled;
    @SerializedName("period")
    @Expose
    private String period;
    @SerializedName("ratings")
    @Expose
    private Ratings_ ratings;
    @SerializedName("completed")
    @Expose
    private Long completed;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Transactions_() {
    }

    /**
     * 
     * @param canceled
     * @param total
     * @param period
     * @param ratings
     * @param completed
     */
    public Transactions_(Long total, Long canceled, String period, Ratings_ ratings, Long completed) {
        super();
        this.total = total;
        this.canceled = canceled;
        this.period = period;
        this.ratings = ratings;
        this.completed = completed;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getCanceled() {
        return canceled;
    }

    public void setCanceled(Long canceled) {
        this.canceled = canceled;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Ratings_ getRatings() {
        return ratings;
    }

    public void setRatings(Ratings_ ratings) {
        this.ratings = ratings;
    }

    public Long getCompleted() {
        return completed;
    }

    public void setCompleted(Long completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("total", total).append("canceled", canceled).append("period", period).append("ratings", ratings).append("completed", completed).toString();
    }

}
