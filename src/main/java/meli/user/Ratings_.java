
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Ratings_ {

    @SerializedName("negative")
    @Expose
    private Double negative;
    @SerializedName("positive")
    @Expose
    private Double positive;
    @SerializedName("neutral")
    @Expose
    private Double neutral;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ratings_() {
    }

    /**
     * 
     * @param negative
     * @param neutral
     * @param positive
     */
    public Ratings_(Double negative, Double positive, Double neutral) {
        super();
        this.negative = negative;
        this.positive = positive;
        this.neutral = neutral;
    }

    public Double getNegative() {
        return negative;
    }

    public void setNegative(Double negative) {
        this.negative = negative;
    }

    public Double getPositive() {
        return positive;
    }

    public void setPositive(Double positive) {
        this.positive = positive;
    }

    public Double getNeutral() {
        return neutral;
    }

    public void setNeutral(Double neutral) {
        this.neutral = neutral;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("negative", negative).append("positive", positive).append("neutral", neutral).toString();
    }

}
