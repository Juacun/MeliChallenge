
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ValueStruct {

    @SerializedName("number")
    @Expose
    private Double number;
    @SerializedName("unit")
    @Expose
    private String unit;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ValueStruct() {
    }

    /**
     * 
     * @param number
     * @param unit
     */
    public ValueStruct(Double number, String unit) {
        super();
        this.number = number;
        this.unit = unit;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("number", number).append("unit", unit).toString();
    }

}
