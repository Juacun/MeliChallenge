
package meli.user;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Result {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("site_id")
    @Expose
    private String siteId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("seller")
    @Expose
    private Seller_ seller;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("prices")
    @Expose
    private Prices prices;
    @SerializedName("sale_price")
    @Expose
    private Object salePrice;
    @SerializedName("currency_id")
    @Expose
    private String currencyId;
    @SerializedName("available_quantity")
    @Expose
    private Long availableQuantity;
    @SerializedName("sold_quantity")
    @Expose
    private Long soldQuantity;
    @SerializedName("buying_mode")
    @Expose
    private String buyingMode;
    @SerializedName("listing_type_id")
    @Expose
    private String listingTypeId;
    @SerializedName("stop_time")
    @Expose
    private String stopTime;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("thumbnail_id")
    @Expose
    private String thumbnailId;
    @SerializedName("accepts_mercadopago")
    @Expose
    private Boolean acceptsMercadopago;
    @SerializedName("installments")
    @Expose
    private Installments installments;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("shipping")
    @Expose
    private Shipping shipping;
    @SerializedName("seller_address")
    @Expose
    private SellerAddress sellerAddress;
    @SerializedName("attributes")
    @Expose
    private List<Attribute> attributes = null;
    @SerializedName("original_price")
    @Expose
    private Object originalPrice;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("official_store_id")
    @Expose
    private Long officialStoreId;
    @SerializedName("domain_id")
    @Expose
    private String domainId;
    @SerializedName("catalog_product_id")
    @Expose
    private String catalogProductId;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("order_backend")
    @Expose
    private Long orderBackend;
    @SerializedName("use_thumbnail_id")
    @Expose
    private Boolean useThumbnailId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param seller
     * @param originalPrice
     * @param officialStoreId
     * @param catalogProductId
     * @param listingTypeId
     * @param sellerAddress
     * @param title
     * @param soldQuantity
     * @param shipping
     * @param installments
     * @param price
     * @param useThumbnailId
     * @param acceptsMercadopago
     * @param buyingMode
     * @param stopTime
     * @param thumbnailId
     * @param id
     * @param prices
     * @param currencyId
     * @param availableQuantity
     * @param thumbnail
     * @param address
     * @param salePrice
     * @param domainId
     * @param tags
     * @param condition
     * @param siteId
     * @param attributes
     * @param permalink
     * @param orderBackend
     * @param categoryId
     */
    public Result(String id, String siteId, String title, Seller_ seller, Double price, Prices prices, Object salePrice, String currencyId, Long availableQuantity, Long soldQuantity, String buyingMode, String listingTypeId, String stopTime, String condition, String permalink, String thumbnail, String thumbnailId, Boolean acceptsMercadopago, Installments installments, Address address, Shipping shipping, SellerAddress sellerAddress, List<Attribute> attributes, Object originalPrice, String categoryId, Long officialStoreId, String domainId, String catalogProductId, List<String> tags, Long orderBackend, Boolean useThumbnailId) {
        super();
        this.id = id;
        this.siteId = siteId;
        this.title = title;
        this.seller = seller;
        this.price = price;
        this.prices = prices;
        this.salePrice = salePrice;
        this.currencyId = currencyId;
        this.availableQuantity = availableQuantity;
        this.soldQuantity = soldQuantity;
        this.buyingMode = buyingMode;
        this.listingTypeId = listingTypeId;
        this.stopTime = stopTime;
        this.condition = condition;
        this.permalink = permalink;
        this.thumbnail = thumbnail;
        this.thumbnailId = thumbnailId;
        this.acceptsMercadopago = acceptsMercadopago;
        this.installments = installments;
        this.address = address;
        this.shipping = shipping;
        this.sellerAddress = sellerAddress;
        this.attributes = attributes;
        this.originalPrice = originalPrice;
        this.categoryId = categoryId;
        this.officialStoreId = officialStoreId;
        this.domainId = domainId;
        this.catalogProductId = catalogProductId;
        this.tags = tags;
        this.orderBackend = orderBackend;
        this.useThumbnailId = useThumbnailId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Seller_ getSeller() {
        return seller;
    }

    public void setSeller(Seller_ seller) {
        this.seller = seller;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Prices getPrices() {
        return prices;
    }

    public void setPrices(Prices prices) {
        this.prices = prices;
    }

    public Object getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Object salePrice) {
        this.salePrice = salePrice;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Long getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Long availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Long getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(Long soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public String getBuyingMode() {
        return buyingMode;
    }

    public void setBuyingMode(String buyingMode) {
        this.buyingMode = buyingMode;
    }

    public String getListingTypeId() {
        return listingTypeId;
    }

    public void setListingTypeId(String listingTypeId) {
        this.listingTypeId = listingTypeId;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getThumbnailId() {
        return thumbnailId;
    }

    public void setThumbnailId(String thumbnailId) {
        this.thumbnailId = thumbnailId;
    }

    public Boolean getAcceptsMercadopago() {
        return acceptsMercadopago;
    }

    public void setAcceptsMercadopago(Boolean acceptsMercadopago) {
        this.acceptsMercadopago = acceptsMercadopago;
    }

    public Installments getInstallments() {
        return installments;
    }

    public void setInstallments(Installments installments) {
        this.installments = installments;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public SellerAddress getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(SellerAddress sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Object getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Object originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Long getOfficialStoreId() {
        return officialStoreId;
    }

    public void setOfficialStoreId(Long officialStoreId) {
        this.officialStoreId = officialStoreId;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getCatalogProductId() {
        return catalogProductId;
    }

    public void setCatalogProductId(String catalogProductId) {
        this.catalogProductId = catalogProductId;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Long getOrderBackend() {
        return orderBackend;
    }

    public void setOrderBackend(Long orderBackend) {
        this.orderBackend = orderBackend;
    }

    public Boolean getUseThumbnailId() {
        return useThumbnailId;
    }

    public void setUseThumbnailId(Boolean useThumbnailId) {
        this.useThumbnailId = useThumbnailId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("siteId", siteId).append("title", title).append("seller", seller).append("price", price).append("prices", prices).append("salePrice", salePrice).append("currencyId", currencyId).append("availableQuantity", availableQuantity).append("soldQuantity", soldQuantity).append("buyingMode", buyingMode).append("listingTypeId", listingTypeId).append("stopTime", stopTime).append("condition", condition).append("permalink", permalink).append("thumbnail", thumbnail).append("thumbnailId", thumbnailId).append("acceptsMercadopago", acceptsMercadopago).append("installments", installments).append("address", address).append("shipping", shipping).append("sellerAddress", sellerAddress).append("attributes", attributes).append("originalPrice", originalPrice).append("categoryId", categoryId).append("officialStoreId", officialStoreId).append("domainId", domainId).append("catalogProductId", catalogProductId).append("tags", tags).append("orderBackend", orderBackend).append("useThumbnailId", useThumbnailId).toString();
    }

}
