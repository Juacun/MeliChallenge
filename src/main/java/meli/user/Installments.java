
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Installments {

    @SerializedName("quantity")
    @Expose
    private Long quantity;
    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("rate")
    @Expose
    private Double rate;
    @SerializedName("currency_id")
    @Expose
    private String currencyId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Installments() {
    }

    /**
     * 
     * @param amount
     * @param quantity
     * @param rate
     * @param currencyId
     */
    public Installments(Long quantity, Double amount, Double rate, String currencyId) {
        super();
        this.quantity = quantity;
        this.amount = amount;
        this.rate = rate;
        this.currencyId = currencyId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("quantity", quantity).append("amount", amount).append("rate", rate).append("currencyId", currencyId).toString();
    }

}
