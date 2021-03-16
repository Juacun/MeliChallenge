
package meli.user;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class AvailableFilter {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("values")
    @Expose
    private List<Value__> values = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AvailableFilter() {
    }

    /**
     * 
     * @param values
     * @param name
     * @param id
     * @param type
     */
    public AvailableFilter(String id, String name, String type, List<Value__> values) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
        this.values = values;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Value__> getValues() {
        return values;
    }

    public void setValues(List<Value__> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("type", type).append("values", values).toString();
    }

}
