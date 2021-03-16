
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Metadata {

    @SerializedName("campaign_id")
    @Expose
    private String campaignId;
    @SerializedName("promotion_id")
    @Expose
    private String promotionId;
    @SerializedName("promotion_type")
    @Expose
    private String promotionType;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Metadata() {
    }

    /**
     * 
     * @param promotionType
     * @param campaignId
     * @param promotionId
     */
    public Metadata(String campaignId, String promotionId, String promotionType) {
        super();
        this.campaignId = campaignId;
        this.promotionId = promotionId;
        this.promotionType = promotionType;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("campaignId", campaignId).append("promotionId", promotionId).append("promotionType", promotionType).toString();
    }

}
