
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
    "next_change_id",
    "stashes"
})
public class StashtabResponse {

    @JsonProperty("next_change_id")
    private String nextChangeId;
    @JsonProperty("stashes")
    private List<Stash> stashes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("next_change_id")
    public String getNextChangeId() {
        return nextChangeId;
    }

    @JsonProperty("next_change_id")
    public void setNextChangeId(String nextChangeId) {
        this.nextChangeId = nextChangeId;
    }

    @JsonProperty("stashes")
    public List<Stash> getStashes() {
        return stashes;
    }

    @JsonProperty("stashes")
    public void setStashes(List<Stash> stashes) {
        this.stashes = stashes;
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
