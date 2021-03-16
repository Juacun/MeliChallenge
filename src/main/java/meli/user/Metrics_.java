
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Metrics_ {

    @SerializedName("claims")
    @Expose
    private Claims claims;
    @SerializedName("delayed_handling_time")
    @Expose
    private DelayedHandlingTime delayedHandlingTime;
    @SerializedName("sales")
    @Expose
    private Sales_ sales;
    @SerializedName("cancellations")
    @Expose
    private Cancellations cancellations;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Metrics_() {
    }

    /**
     * 
     * @param cancellations
     * @param claims
     * @param delayedHandlingTime
     * @param sales
     */
    public Metrics_(Claims claims, DelayedHandlingTime delayedHandlingTime, Sales_ sales, Cancellations cancellations) {
        super();
        this.claims = claims;
        this.delayedHandlingTime = delayedHandlingTime;
        this.sales = sales;
        this.cancellations = cancellations;
    }

    public Claims getClaims() {
        return claims;
    }

    public void setClaims(Claims claims) {
        this.claims = claims;
    }

    public DelayedHandlingTime getDelayedHandlingTime() {
        return delayedHandlingTime;
    }

    public void setDelayedHandlingTime(DelayedHandlingTime delayedHandlingTime) {
        this.delayedHandlingTime = delayedHandlingTime;
    }

    public Sales_ getSales() {
        return sales;
    }

    public void setSales(Sales_ sales) {
        this.sales = sales;
    }

    public Cancellations getCancellations() {
        return cancellations;
    }

    public void setCancellations(Cancellations cancellations) {
        this.cancellations = cancellations;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("claims", claims).append("delayedHandlingTime", delayedHandlingTime).append("sales", sales).append("cancellations", cancellations).toString();
    }

}
