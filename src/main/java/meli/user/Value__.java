
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Value__ {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("results")
    @Expose
    private Long results;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Value__() {
    }

    /**
     * 
     * @param name
     * @param id
     * @param results
     */
    public Value__(String id, String name, Long results) {
        super();
        this.id = id;
        this.name = name;
        this.results = results;
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

    public Long getResults() {
        return results;
    }

    public void setResults(Long results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("results", results).toString();
    }

}
