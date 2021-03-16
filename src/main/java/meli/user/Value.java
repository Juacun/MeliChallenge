
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Value {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("struct")
    @Expose
    private Struct struct;
    @SerializedName("source")
    @Expose
    private Long source;
    @SerializedName("id")
    @Expose
    private Object id;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Value() {
    }

    /**
     * 
     * @param struct
     * @param name
     * @param source
     * @param id
     */
    public Value(String name, Struct struct, Long source, Object id) {
        super();
        this.name = name;
        this.struct = struct;
        this.source = source;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Struct getStruct() {
        return struct;
    }

    public void setStruct(Struct struct) {
        this.struct = struct;
    }

    public Long getSource() {
        return source;
    }

    public void setSource(Long source) {
        this.source = source;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("struct", struct).append("source", source).append("id", id).toString();
    }

}
