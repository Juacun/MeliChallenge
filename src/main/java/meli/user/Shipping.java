
package meli.user;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Shipping {

    @SerializedName("free_shipping")
    @Expose
    private Boolean freeShipping;
    @SerializedName("mode")
    @Expose
    private String mode;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("logistic_type")
    @Expose
    private String logisticType;
    @SerializedName("store_pick_up")
    @Expose
    private Boolean storePickUp;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Shipping() {
    }

    /**
     * 
     * @param mode
     * @param logisticType
     * @param freeShipping
     * @param storePickUp
     * @param tags
     */
    public Shipping(Boolean freeShipping, String mode, List<String> tags, String logisticType, Boolean storePickUp) {
        super();
        this.freeShipping = freeShipping;
        this.mode = mode;
        this.tags = tags;
        this.logisticType = logisticType;
        this.storePickUp = storePickUp;
    }

    public Boolean getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(Boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getLogisticType() {
        return logisticType;
    }

    public void setLogisticType(String logisticType) {
        this.logisticType = logisticType;
    }

    public Boolean getStorePickUp() {
        return storePickUp;
    }

    public void setStorePickUp(Boolean storePickUp) {
        this.storePickUp = storePickUp;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("freeShipping", freeShipping).append("mode", mode).append("tags", tags).append("logisticType", logisticType).append("storePickUp", storePickUp).toString();
    }

}
