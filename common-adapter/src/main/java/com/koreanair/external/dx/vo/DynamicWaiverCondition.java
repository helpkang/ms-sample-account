package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.DynamicWaiverConditionLocation;
import io.swagger.annotations.ApiModel;
import java.time.LocalDate;

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
  * Conditions under which this waiver can be applied.
 **/
@ApiModel(description="Conditions under which this waiver can be applied.")
public class DynamicWaiverCondition  {
  
  @ApiModelProperty(example = "2020-07-26", value = "This dynamic waiver can only be applied if a flight on or after this date. (date in ISO 8601, e.g., 2002-07-25: YYYY-MM-DD)")
 /**
   * This dynamic waiver can only be applied if a flight on or after this date. (date in ISO 8601, e.g., 2002-07-25: YYYY-MM-DD)
  **/
  private LocalDate firstDate = null;

  @ApiModelProperty(example = "2020-07-26", value = "This dynamic waiver can only be applied if a flight on or before this date. (date in ISO 8601, e.g., 2002-07-25: YYYY-MM-DD)")
 /**
   * This dynamic waiver can only be applied if a flight on or before this date. (date in ISO 8601, e.g., 2002-07-25: YYYY-MM-DD)
  **/
  private LocalDate lastDate = null;

  @ApiModelProperty(value = "")
  private DynamicWaiverConditionLocation origin = null;

  @ApiModelProperty(value = "")
  private DynamicWaiverConditionLocation destination = null;
 /**
   * This dynamic waiver can only be applied if a flight on or after this date. (date in ISO 8601, e.g., 2002-07-25: YYYY-MM-DD)
   * @return firstDate
  **/
  @JsonProperty("firstDate")
  public LocalDate getFirstDate() {
    return firstDate;
  }

  public void setFirstDate(LocalDate firstDate) {
    this.firstDate = firstDate;
  }

  public DynamicWaiverCondition firstDate(LocalDate firstDate) {
    this.firstDate = firstDate;
    return this;
  }

 /**
   * This dynamic waiver can only be applied if a flight on or before this date. (date in ISO 8601, e.g., 2002-07-25: YYYY-MM-DD)
   * @return lastDate
  **/
  @JsonProperty("lastDate")
  public LocalDate getLastDate() {
    return lastDate;
  }

  public void setLastDate(LocalDate lastDate) {
    this.lastDate = lastDate;
  }

  public DynamicWaiverCondition lastDate(LocalDate lastDate) {
    this.lastDate = lastDate;
    return this;
  }

 /**
   * Get origin
   * @return origin
  **/
  @JsonProperty("origin")
  public DynamicWaiverConditionLocation getOrigin() {
    return origin;
  }

  public void setOrigin(DynamicWaiverConditionLocation origin) {
    this.origin = origin;
  }

  public DynamicWaiverCondition origin(DynamicWaiverConditionLocation origin) {
    this.origin = origin;
    return this;
  }

 /**
   * Get destination
   * @return destination
  **/
  @JsonProperty("destination")
  public DynamicWaiverConditionLocation getDestination() {
    return destination;
  }

  public void setDestination(DynamicWaiverConditionLocation destination) {
    this.destination = destination;
  }

  public DynamicWaiverCondition destination(DynamicWaiverConditionLocation destination) {
    this.destination = destination;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicWaiverCondition {\n");
    
    sb.append("    firstDate: ").append(toIndentedString(firstDate)).append("\n");
    sb.append("    lastDate: ").append(toIndentedString(lastDate)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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

