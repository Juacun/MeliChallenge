
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Sales {

    @SerializedName("period")
    @Expose
    private String period;
    @SerializedName("completed")
    @Expose
    private Long completed;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sales() {
    }

    /**
     * 
     * @param period
     * @param completed
     */
    public Sales(String period, Long completed) {
        super();
        this.period = period;
        this.completed = completed;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Long getCompleted() {
        return completed;
    }

    public void setCompleted(Long completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("period", period).append("completed", completed).toString();
    }

}
