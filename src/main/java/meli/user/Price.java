
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Price {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("conditions")
    @Expose
    private Conditions conditions;
    @SerializedName("amount")
    @Expose
    private Float amount;
    @SerializedName("regular_amount")
    @Expose
    private Float regularAmount;
    @SerializedName("currency_id")
    @Expose
    private String currencyId;
    @SerializedName("exchange_rate_context")
    @Expose
    private String exchangeRateContext;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("last_updated")
    @Expose
    private String lastUpdated;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Price() {
    }

    /**
     * 
     * @param lastUpdated
     * @param amount
     * @param metadata
     * @param exchangeRateContext
     * @param id
     * @param type
     * @param conditions
     * @param currencyId
     * @param regularAmount
     */
    public Price(String id, String type, Conditions conditions, Float amount, Float regularAmount, String currencyId, String exchangeRateContext, Metadata metadata, String lastUpdated) {
        super();
        this.id = id;
        this.type = type;
        this.conditions = conditions;
        this.amount = amount;
        this.regularAmount = regularAmount;
        this.currencyId = currencyId;
        this.exchangeRateContext = exchangeRateContext;
        this.metadata = metadata;
        this.lastUpdated = lastUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Conditions getConditions() {
        return conditions;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Float getRegularAmount() {
        return regularAmount;
    }

    public void setRegularAmount(Float regularAmount) {
        this.regularAmount = regularAmount;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getExchangeRateContext() {
        return exchangeRateContext;
    }

    public void setExchangeRateContext(String exchangeRateContext) {
        this.exchangeRateContext = exchangeRateContext;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("type", type).append("conditions", conditions).append("amount", amount).append("regularAmount", regularAmount).append("currencyId", currencyId).append("exchangeRateContext", exchangeRateContext).append("metadata", metadata).append("lastUpdated", lastUpdated).toString();
    }

}
