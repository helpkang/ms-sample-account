package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Contains information related to flight connections after the disruption.
 **/
@ApiModel(description="Contains information related to flight connections after the disruption.")
public class DisruptionConnection  {
  

@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("ok") OK(String.valueOf("ok")), @XmlEnumValue("broken") BROKEN(String.valueOf("broken"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Indicates if ,after disruption, the traveller is able to make the connections of his trip, based on Minimum Connecting Time (MCT) at the airport and Maximum Ground Time (MGT).   2 values are possible: - ok: connection time is greater than MCT and the ground time is lower than MGT.  - broken: connection time is lower than MCT or ground time is greater than MGT.")
 /**
   * Indicates if ,after disruption, the traveller is able to make the connections of his trip, based on Minimum Connecting Time (MCT) at the airport and Maximum Ground Time (MGT).   2 values are possible: - ok: connection time is greater than MCT and the ground time is lower than MGT.  - broken: connection time is lower than MCT or ground time is greater than MGT.
  **/
  private StatusEnum status = null;

  @ApiModelProperty(value = "Indicates the difference in the number of connections between the current trip and the original trip. Example: 1 means that the current trip has 1 more connection than the original trip before disruption.")
 /**
   * Indicates the difference in the number of connections between the current trip and the original trip. Example: 1 means that the current trip has 1 more connection than the original trip before disruption.
  **/
  private Integer delta = null;

  @ApiModelProperty(value = "Boolean to indicate if at least one connection point or the number of connections have changed relative to the original trip")
 /**
   * Boolean to indicate if at least one connection point or the number of connections have changed relative to the original trip
  **/
  private Boolean sameViaPoint = null;

  @ApiModelProperty(value = "Duration in seconds between connection time of the current trip and the original trip. If the duration is positive, the connection time of the current trip is longer than the original trip.")
 /**
   * Duration in seconds between connection time of the current trip and the original trip. If the duration is positive, the connection time of the current trip is longer than the original trip.
  **/
  private Integer deltaTime = null;
 /**
   * Indicates if ,after disruption, the traveller is able to make the connections of his trip, based on Minimum Connecting Time (MCT) at the airport and Maximum Ground Time (MGT).   2 values are possible: - ok: connection time is greater than MCT and the ground time is lower than MGT.  - broken: connection time is lower than MCT or ground time is greater than MGT.
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DisruptionConnection status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Indicates the difference in the number of connections between the current trip and the original trip. Example: 1 means that the current trip has 1 more connection than the original trip before disruption.
   * @return delta
  **/
  @JsonProperty("delta")
  public Integer getDelta() {
    return delta;
  }

  public void setDelta(Integer delta) {
    this.delta = delta;
  }

  public DisruptionConnection delta(Integer delta) {
    this.delta = delta;
    return this;
  }

 /**
   * Boolean to indicate if at least one connection point or the number of connections have changed relative to the original trip
   * @return sameViaPoint
  **/
  @JsonProperty("sameViaPoint")
  public Boolean isSameViaPoint() {
    return sameViaPoint;
  }

  public void setSameViaPoint(Boolean sameViaPoint) {
    this.sameViaPoint = sameViaPoint;
  }

  public DisruptionConnection sameViaPoint(Boolean sameViaPoint) {
    this.sameViaPoint = sameViaPoint;
    return this;
  }

 /**
   * Duration in seconds between connection time of the current trip and the original trip. If the duration is positive, the connection time of the current trip is longer than the original trip.
   * @return deltaTime
  **/
  @JsonProperty("deltaTime")
  public Integer getDeltaTime() {
    return deltaTime;
  }

  public void setDeltaTime(Integer deltaTime) {
    this.deltaTime = deltaTime;
  }

  public DisruptionConnection deltaTime(Integer deltaTime) {
    this.deltaTime = deltaTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisruptionConnection {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    sameViaPoint: ").append(toIndentedString(sameViaPoint)).append("\n");
    sb.append("    deltaTime: ").append(toIndentedString(deltaTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

