package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BoundEligibility;
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
  * Indicates the eligibility to change a bound that has been reaccommodated after a disruption
 **/
@ApiModel(description="Indicates the eligibility to change a bound that has been reaccommodated after a disruption")
public class ChangeReaccommodationEligibility  {
  
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

  @ApiModelProperty(value = "")
  private String nonEligibilityCode = null;

  @ApiModelProperty(value = "When the reaccommodated bound cannot be changed, the reason of the non-elibility is reported here.")
 /**
   * When the reaccommodated bound cannot be changed, the reason of the non-elibility is reported here.
  **/
  private String nonEligibilityReason = null;
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

  public ChangeReaccommodationEligibility airBoundId(String airBoundId) {
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

  public ChangeReaccommodationEligibility isEligible(Boolean isEligible) {
    this.isEligible = isEligible;
    return this;
  }

 /**
   * Get nonEligibilityCode
   * @return nonEligibilityCode
  **/
  @JsonProperty("nonEligibilityCode")
  public String getNonEligibilityCode() {
    return nonEligibilityCode;
  }

  public void setNonEligibilityCode(String nonEligibilityCode) {
    this.nonEligibilityCode = nonEligibilityCode;
  }

  public ChangeReaccommodationEligibility nonEligibilityCode(String nonEligibilityCode) {
    this.nonEligibilityCode = nonEligibilityCode;
    return this;
  }

 /**
   * When the reaccommodated bound cannot be changed, the reason of the non-elibility is reported here.
   * @return nonEligibilityReason
  **/
  @JsonProperty("nonEligibilityReason")
  public String getNonEligibilityReason() {
    return nonEligibilityReason;
  }

  public void setNonEligibilityReason(String nonEligibilityReason) {
    this.nonEligibilityReason = nonEligibilityReason;
  }

  public ChangeReaccommodationEligibility nonEligibilityReason(String nonEligibilityReason) {
    this.nonEligibilityReason = nonEligibilityReason;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeReaccommodationEligibility {\n");
    
    sb.append("    airBoundId: ").append(toIndentedString(airBoundId)).append("\n");
    sb.append("    isEligible: ").append(toIndentedString(isEligible)).append("\n");
    sb.append("    nonEligibilityCode: ").append(toIndentedString(nonEligibilityCode)).append("\n");
    sb.append("    nonEligibilityReason: ").append(toIndentedString(nonEligibilityReason)).append("\n");
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

