package org.mycompany.beacongenerator.domain;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "uri",
        "version",
        "cipherSuite",
        "period",
        "certificateId",
        "chainIndex",
        "pulseIndex",
        "timeStamp",
        "localRandomValue",
        "external",
        "listValues",
        "precommitmentValue",
        "statusCode",
        "signatureValue",
        "outputValue"
})
public class Pulse {

    @JsonProperty("uri")
    private String uri;
    @JsonProperty("version")
    private String version;
    @JsonProperty("cipherSuite")
    private Integer cipherSuite;
    @JsonProperty("period")
    private Integer period;
    @JsonProperty("certificateId")
    private String certificateId;
    @JsonProperty("chainIndex")
    private Integer chainIndex;
    @JsonProperty("pulseIndex")
    private Integer pulseIndex;
    @JsonProperty("timeStamp")
    private String timeStamp;
    @JsonProperty("localRandomValue")
    private String localRandomValue;
    @JsonProperty("external")
    private External external;
    @JsonProperty("listValues")
    private List<ListValue> listValues = null;
    @JsonProperty("precommitmentValue")
    private String precommitmentValue;
    @JsonProperty("statusCode")
    private Integer statusCode;
    @JsonProperty("signatureValue")
    private String signatureValue;
    @JsonProperty("outputValue")
    private String outputValue;

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("cipherSuite")
    public Integer getCipherSuite() {
        return cipherSuite;
    }

    @JsonProperty("cipherSuite")
    public void setCipherSuite(Integer cipherSuite) {
        this.cipherSuite = cipherSuite;
    }

    @JsonProperty("period")
    public Integer getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(Integer period) {
        this.period = period;
    }

    @JsonProperty("certificateId")
    public String getCertificateId() {
        return certificateId;
    }

    @JsonProperty("certificateId")
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    @JsonProperty("chainIndex")
    public Integer getChainIndex() {
        return chainIndex;
    }

    @JsonProperty("chainIndex")
    public void setChainIndex(Integer chainIndex) {
        this.chainIndex = chainIndex;
    }

    @JsonProperty("pulseIndex")
    public Integer getPulseIndex() {
        return pulseIndex;
    }

    @JsonProperty("pulseIndex")
    public void setPulseIndex(Integer pulseIndex) {
        this.pulseIndex = pulseIndex;
    }

    @JsonProperty("timeStamp")
    public String getTimeStamp() {
        return timeStamp;
    }

    @JsonProperty("timeStamp")
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @JsonProperty("localRandomValue")
    public String getLocalRandomValue() {
        return localRandomValue;
    }

    @JsonProperty("localRandomValue")
    public void setLocalRandomValue(String localRandomValue) {
        this.localRandomValue = localRandomValue;
    }

    @JsonProperty("external")
    public External getExternal() {
        return external;
    }

    @JsonProperty("external")
    public void setExternal(External external) {
        this.external = external;
    }

    @JsonProperty("listValues")
    public List<ListValue> getListValues() {
        return listValues;
    }

    @JsonProperty("listValues")
    public void setListValues(List<ListValue> listValues) {
        this.listValues = listValues;
    }

    @JsonProperty("precommitmentValue")
    public String getPrecommitmentValue() {
        return precommitmentValue;
    }

    @JsonProperty("precommitmentValue")
    public void setPrecommitmentValue(String precommitmentValue) {
        this.precommitmentValue = precommitmentValue;
    }

    @JsonProperty("statusCode")
    public Integer getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("signatureValue")
    public String getSignatureValue() {
        return signatureValue;
    }

    @JsonProperty("signatureValue")
    public void setSignatureValue(String signatureValue) {
        this.signatureValue = signatureValue;
    }

    @JsonProperty("outputValue")
    public String getOutputValue() {
        return outputValue;
    }

    @JsonProperty("outputValue")
    public void setOutputValue(String outputValue) {
        this.outputValue = outputValue;
    }

}