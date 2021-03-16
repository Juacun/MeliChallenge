
package meli.user;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Attribute {

    @SerializedName("value_id")
    @Expose
    private Object valueId;
    @SerializedName("value_name")
    @Expose
    private String valueName;
    @SerializedName("values")
    @Expose
    private List<Value> values = null;
    @SerializedName("attribute_group_id")
    @Expose
    private String attributeGroupId;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("value_struct")
    @Expose
    private ValueStruct valueStruct;
    @SerializedName("attribute_group_name")
    @Expose
    private String attributeGroupName;
    @SerializedName("source")
    @Expose
    private Long source;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attribute() {
    }

    /**
     * 
     * @param valueStruct
     * @param valueId
     * @param valueName
     * @param values
     * @param name
     * @param id
     * @param source
     * @param attributeGroupId
     * @param attributeGroupName
     */
    public Attribute(Object valueId, String valueName, List<Value> values, String attributeGroupId, String id, String name, ValueStruct valueStruct, String attributeGroupName, Long source) {
        super();
        this.valueId = valueId;
        this.valueName = valueName;
        this.values = values;
        this.attributeGroupId = attributeGroupId;
        this.id = id;
        this.name = name;
        this.valueStruct = valueStruct;
        this.attributeGroupName = attributeGroupName;
        this.source = source;
    }

    public Object getValueId() {
        return valueId;
    }

    public void setValueId(Object valueId) {
        this.valueId = valueId;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

    public String getAttributeGroupId() {
        return attributeGroupId;
    }

    public void setAttributeGroupId(String attributeGroupId) {
        this.attributeGroupId = attributeGroupId;
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

    public ValueStruct getValueStruct() {
        return valueStruct;
    }

    public void setValueStruct(ValueStruct valueStruct) {
        this.valueStruct = valueStruct;
    }

    public String getAttributeGroupName() {
        return attributeGroupName;
    }

    public void setAttributeGroupName(String attributeGroupName) {
        this.attributeGroupName = attributeGroupName;
    }

    public Long getSource() {
        return source;
    }

    public void setSource(Long source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("valueId", valueId).append("valueName", valueName).append("values", values).append("attributeGroupId", attributeGroupId).append("id", id).append("name", name).append("valueStruct", valueStruct).append("attributeGroupName", attributeGroupName).append("source", source).toString();
    }

}
