
package de.misc.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountName",
    "lastCharacterName",
    "id",
    "stash",
    "stashType",
    "items",
    "public"
})
public class Stash {

    @JsonProperty("accountName")
    private String accountName;
    @JsonProperty("lastCharacterName")
    private String lastCharacterName;
    @JsonProperty("id")
    private String id;
    @JsonProperty("stash")
    private String stash;
    @JsonProperty("stashType")
    private String stashType;
    @JsonProperty("items")
    private List<Object> items = null;
    @JsonProperty("public")
    private Boolean _public;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("accountName")
    public String getAccountName() {
        return accountName;
    }

    @JsonProperty("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @JsonProperty("lastCharacterName")
    public String getLastCharacterName() {
        return lastCharacterName;
    }

    @JsonProperty("lastCharacterName")
    public void setLastCharacterName(String lastCharacterName) {
        this.lastCharacterName = lastCharacterName;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("stash")
    public String getStash() {
        return stash;
    }

    @JsonProperty("stash")
    public void setStash(String stash) {
        this.stash = stash;
    }

    @JsonProperty("stashType")
    public String getStashType() {
        return stashType;
    }

    @JsonProperty("stashType")
    public void setStashType(String stashType) {
        this.stashType = stashType;
    }

    @JsonProperty("items")
    public List<Object> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Object> items) {
        this.items = items;
    }

    @JsonProperty("public")
    public Boolean getPublic() {
        return _public;
    }

    @JsonProperty("public")
    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
