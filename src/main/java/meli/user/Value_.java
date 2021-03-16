
package meli.user;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Value_ {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("path_from_root")
    @Expose
    private List<PathFromRoot> pathFromRoot = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Value_() {
    }

    /**
     * 
     * @param name
     * @param id
     * @param pathFromRoot
     */
    public Value_(String id, String name, List<PathFromRoot> pathFromRoot) {
        super();
        this.id = id;
        this.name = name;
        this.pathFromRoot = pathFromRoot;
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

    public List<PathFromRoot> getPathFromRoot() {
        return pathFromRoot;
    }

    public void setPathFromRoot(List<PathFromRoot> pathFromRoot) {
        this.pathFromRoot = pathFromRoot;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("pathFromRoot", pathFromRoot).toString();
    }

}
