
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Presentation {

    @SerializedName("display_currency")
    @Expose
    private String displayCurrency;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Presentation() {
    }

    /**
     * 
     * @param displayCurrency
     */
    public Presentation(String displayCurrency) {
        super();
        this.displayCurrency = displayCurrency;
    }

    public String getDisplayCurrency() {
        return displayCurrency;
    }

    public void setDisplayCurrency(String displayCurrency) {
        this.displayCurrency = displayCurrency;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("displayCurrency", displayCurrency).toString();
    }

}
