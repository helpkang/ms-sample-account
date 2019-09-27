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
  * Common attributes shared by all actions that could manipulate a bound.
 **/
@ApiModel(description="Common attributes shared by all actions that could manipulate a bound.")
public class BoundEligibility  {
  
  @ApiModelProperty(required = true, value = "Identifier of the bound")
 /**
   * Identifier of the bound
  **/
  private String airBoundId = null;

  @ApiModelProperty(required = true, value = "If true, bound can be manipulated.")
 /**
   * If true, bound can be manipulated.
  **/
  private Boolean isEligible = null;
 /**
   * Identifier of the bound
   * @return airBoundId
  **/
  @JsonProperty("airBoundId")
  public String getAirBoundId() {
    return airBoundId;
  }

  public void setAirBoundId(String airBoundId) {
    this.airBoundId = airBoundId;
  }

  public BoundEligibility airBoundId(String airBoundId) {
    this.airBoundId = airBoundId;
    return this;
  }

 /**
   * If true, bound can be manipulated.
   * @return isEligible
  **/
  @JsonProperty("isEligible")
  public Boolean isIsEligible() {
    return isEligible;
  }

  public void setIsEligible(Boolean isEligible) {
    this.isEligible = isEligible;
  }

  public BoundEligibility isEligible(Boolean isEligible) {
    this.isEligible = isEligible;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoundEligibility {\n");
    
    sb.append("    airBoundId: ").append(toIndentedString(airBoundId)).append("\n");
    sb.append("    isEligible: ").append(toIndentedString(isEligible)).append("\n");
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

