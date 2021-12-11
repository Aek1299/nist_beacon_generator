package org.mycompany.beacongenerator.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "pulse"
})
public class BeaconResponse {

    @JsonProperty("pulse")
    private Pulse pulse;

    @JsonProperty("pulse")
    public Pulse getPulse() {
        return pulse;
    }

    @JsonProperty("pulse")
    public void setPulse(Pulse pulse) {
        this.pulse = pulse;
    }

}