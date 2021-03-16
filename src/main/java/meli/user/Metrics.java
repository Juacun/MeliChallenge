
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Metrics {

    @SerializedName("sales")
    @Expose
    private Sales sales;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Metrics() {
    }

    /**
     * 
     * @param sales
     */
    public Metrics(Sales sales) {
        super();
        this.sales = sales;
    }

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sales", sales).toString();
    }

}
