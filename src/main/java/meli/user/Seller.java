
package meli.user;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Seller {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("nickname")
    @Expose
    private String nickname;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("registration_date")
    @Expose
    private String registrationDate;
    @SerializedName("seller_reputation")
    @Expose
    private SellerReputation sellerReputation;
    @SerializedName("real_estate_agency")
    @Expose
    private Boolean realEstateAgency;
    @SerializedName("car_dealer")
    @Expose
    private Boolean carDealer;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("eshop")
    @Expose
    private Object eshop;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Seller() {
    }

    /**
     * 
     * @param realEstateAgency
     * @param sellerReputation
     * @param nickname
     * @param registrationDate
     * @param carDealer
     * @param id
     * @param permalink
     * @param eshop
     * @param tags
     */
    public Seller(Long id, String nickname, String permalink, String registrationDate, SellerReputation sellerReputation, Boolean realEstateAgency, Boolean carDealer, List<String> tags, Object eshop) {
        super();
        this.id = id;
        this.nickname = nickname;
        this.permalink = permalink;
        this.registrationDate = registrationDate;
        this.sellerReputation = sellerReputation;
        this.realEstateAgency = realEstateAgency;
        this.carDealer = carDealer;
        this.tags = tags;
        this.eshop = eshop;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public SellerReputation getSellerReputation() {
        return sellerReputation;
    }

    public void setSellerReputation(SellerReputation sellerReputation) {
        this.sellerReputation = sellerReputation;
    }

    public Boolean getRealEstateAgency() {
        return realEstateAgency;
    }

    public void setRealEstateAgency(Boolean realEstateAgency) {
        this.realEstateAgency = realEstateAgency;
    }

    public Boolean getCarDealer() {
        return carDealer;
    }

    public void setCarDealer(Boolean carDealer) {
        this.carDealer = carDealer;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Object getEshop() {
        return eshop;
    }

    public void setEshop(Object eshop) {
        this.eshop = eshop;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("nickname", nickname).append("permalink", permalink).append("registrationDate", registrationDate).append("sellerReputation", sellerReputation).append("realEstateAgency", realEstateAgency).append("carDealer", carDealer).append("tags", tags).append("eshop", eshop).toString();
    }

}
