
package meli.user;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Conditions {

    @SerializedName("context_restrictions")
    @Expose
    private List<Object> contextRestrictions = null;
    @SerializedName("start_time")
    @Expose
    private String startTime;
    @SerializedName("end_time")
    @Expose
    private String endTime;
    @SerializedName("eligible")
    @Expose
    private Boolean eligible;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Conditions() {
    }

    /**
     * 
     * @param eligible
     * @param startTime
     * @param endTime
     * @param contextRestrictions
     */
    public Conditions(List<Object> contextRestrictions, String startTime, String endTime, Boolean eligible) {
        super();
        this.contextRestrictions = contextRestrictions;
        this.startTime = startTime;
        this.endTime = endTime;
        this.eligible = eligible;
    }

    public List<Object> getContextRestrictions() {
        return contextRestrictions;
    }

    public void setContextRestrictions(List<Object> contextRestrictions) {
        this.contextRestrictions = contextRestrictions;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Boolean getEligible() {
        return eligible;
    }

    public void setEligible(Boolean eligible) {
        this.eligible = eligible;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("contextRestrictions", contextRestrictions).append("startTime", startTime).append("endTime", endTime).append("eligible", eligible).toString();
    }

}
