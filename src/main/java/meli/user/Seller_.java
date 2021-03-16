
package meli.user;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Seller_ {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("registration_date")
    @Expose
    private String registrationDate;
    @SerializedName("car_dealer")
    @Expose
    private Boolean carDealer;
    @SerializedName("real_estate_agency")
    @Expose
    private Boolean realEstateAgency;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("seller_reputation")
    @Expose
    private SellerReputation_ sellerReputation;
    @SerializedName("nickname")
    @Expose
    private String nickname;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Seller_() {
    }

    /**
     * 
     * @param realEstateAgency
     * @param sellerReputation
     * @param registrationDate
     * @param carDealer
     * @param nickname
     * @param id
     * @param permalink
     * @param tags
     */
    public Seller_(Long id, String permalink, String registrationDate, Boolean carDealer, Boolean realEstateAgency, List<String> tags, SellerReputation_ sellerReputation, String nickname) {
        super();
        this.id = id;
        this.permalink = permalink;
        this.registrationDate = registrationDate;
        this.carDealer = carDealer;
        this.realEstateAgency = realEstateAgency;
        this.tags = tags;
        this.sellerReputation = sellerReputation;
        this.nickname = nickname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Boolean getCarDealer() {
        return carDealer;
    }

    public void setCarDealer(Boolean carDealer) {
        this.carDealer = carDealer;
    }

    public Boolean getRealEstateAgency() {
        return realEstateAgency;
    }

    public void setRealEstateAgency(Boolean realEstateAgency) {
        this.realEstateAgency = realEstateAgency;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public SellerReputation_ getSellerReputation() {
        return sellerReputation;
    }

    public void setSellerReputation(SellerReputation_ sellerReputation) {
        this.sellerReputation = sellerReputation;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("permalink", permalink).append("registrationDate", registrationDate).append("carDealer", carDealer).append("realEstateAgency", realEstateAgency).append("tags", tags).append("sellerReputation", sellerReputation).append("nickname", nickname).toString();
    }

}
