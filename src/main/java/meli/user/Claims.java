
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Claims {

    @SerializedName("rate")
    @Expose
    private Double rate;
    @SerializedName("value")
    @Expose
    private Long value;
    @SerializedName("period")
    @Expose
    private String period;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Claims() {
    }

    /**
     * 
     * @param period
     * @param rate
     * @param value
     */
    public Claims(Double rate, Long value, String period) {
        super();
        this.rate = rate;
        this.value = value;
        this.period = period;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rate", rate).append("value", value).append("period", period).toString();
    }

}
