
package meli.user;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Prices {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("prices")
    @Expose
    private List<Price> prices = null;
    @SerializedName("presentation")
    @Expose
    private Presentation presentation;
    @SerializedName("payment_method_prices")
    @Expose
    private List<Object> paymentMethodPrices = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Prices() {
    }

    /**
     * 
     * @param presentation
     * @param id
     * @param prices
     * @param paymentMethodPrices
     */
    public Prices(String id, List<Price> prices, Presentation presentation, List<Object> paymentMethodPrices) {
        super();
        this.id = id;
        this.prices = prices;
        this.presentation = presentation;
        this.paymentMethodPrices = paymentMethodPrices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public Presentation getPresentation() {
        return presentation;
    }

    public void setPresentation(Presentation presentation) {
        this.presentation = presentation;
    }

    public List<Object> getPaymentMethodPrices() {
        return paymentMethodPrices;
    }

    public void setPaymentMethodPrices(List<Object> paymentMethodPrices) {
        this.paymentMethodPrices = paymentMethodPrices;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("prices", prices).append("presentation", presentation).append("paymentMethodPrices", paymentMethodPrices).toString();
    }

}
