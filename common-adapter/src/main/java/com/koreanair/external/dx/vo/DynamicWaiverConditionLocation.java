package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

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
  * When a disruption is anticipated, a dynamic waiver could be offered to propose a change flights. If the waiver is only applicable to specific locations or whole countries as orgin or destination,  that information will be detailed here. Waiver conditions can also exclude locations and/or countries.
 **/
@ApiModel(description="When a disruption is anticipated, a dynamic waiver could be offered to propose a change flights. If the waiver is only applicable to specific locations or whole countries as orgin or destination,  that information will be detailed here. Waiver conditions can also exclude locations and/or countries.")
public class DynamicWaiverConditionLocation  {
  
  @ApiModelProperty(value = "This dynamic waiver can only be applied if the new location is contained here.")
 /**
   * This dynamic waiver can only be applied if the new location is contained here.
  **/
  private List<String> includedLocationCodes = null;

  @ApiModelProperty(value = "This dynamic waiver can only be applied if the new location is not contained here.")
 /**
   * This dynamic waiver can only be applied if the new location is not contained here.
  **/
  private List<String> excludedLocationCodes = null;

  @ApiModelProperty(value = "This dynamic waiver can only be applied if the new country is contained here.")
 /**
   * This dynamic waiver can only be applied if the new country is contained here.
  **/
  private List<String> includedCountryCodes = null;

  @ApiModelProperty(value = "This dynamic waiver can only be applied if the new country is not contained here.")
 /**
   * This dynamic waiver can only be applied if the new country is not contained here.
  **/
  private List<String> excludedCountryCodes = null;
 /**
   * This dynamic waiver can only be applied if the new location is contained here.
   * @return includedLocationCodes
  **/
  @JsonProperty("includedLocationCodes")
  public List<String> getIncludedLocationCodes() {
    return includedLocationCodes;
  }

  public void setIncludedLocationCodes(List<String> includedLocationCodes) {
    this.includedLocationCodes = includedLocationCodes;
  }

  public DynamicWaiverConditionLocation includedLocationCodes(List<String> includedLocationCodes) {
    this.includedLocationCodes = includedLocationCodes;
    return this;
  }

  public DynamicWaiverConditionLocation addIncludedLocationCodesItem(String includedLocationCodesItem) {
    this.includedLocationCodes.add(includedLocationCodesItem);
    return this;
  }

 /**
   * This dynamic waiver can only be applied if the new location is not contained here.
   * @return excludedLocationCodes
  **/
  @JsonProperty("excludedLocationCodes")
  public List<String> getExcludedLocationCodes() {
    return excludedLocationCodes;
  }

  public void setExcludedLocationCodes(List<String> excludedLocationCodes) {
    this.excludedLocationCodes = excludedLocationCodes;
  }

  public DynamicWaiverConditionLocation excludedLocationCodes(List<String> excludedLocationCodes) {
    this.excludedLocationCodes = excludedLocationCodes;
    return this;
  }

  public DynamicWaiverConditionLocation addExcludedLocationCodesItem(String excludedLocationCodesItem) {
    this.excludedLocationCodes.add(excludedLocationCodesItem);
    return this;
  }

 /**
   * This dynamic waiver can only be applied if the new country is contained here.
   * @return includedCountryCodes
  **/
  @JsonProperty("includedCountryCodes")
  public List<String> getIncludedCountryCodes() {
    return includedCountryCodes;
  }

  public void setIncludedCountryCodes(List<String> includedCountryCodes) {
    this.includedCountryCodes = includedCountryCodes;
  }

  public DynamicWaiverConditionLocation includedCountryCodes(List<String> includedCountryCodes) {
    this.includedCountryCodes = includedCountryCodes;
    return this;
  }

  public DynamicWaiverConditionLocation addIncludedCountryCodesItem(String includedCountryCodesItem) {
    this.includedCountryCodes.add(includedCountryCodesItem);
    return this;
  }

 /**
   * This dynamic waiver can only be applied if the new country is not contained here.
   * @return excludedCountryCodes
  **/
  @JsonProperty("excludedCountryCodes")
  public List<String> getExcludedCountryCodes() {
    return excludedCountryCodes;
  }

  public void setExcludedCountryCodes(List<String> excludedCountryCodes) {
    this.excludedCountryCodes = excludedCountryCodes;
  }

  public DynamicWaiverConditionLocation excludedCountryCodes(List<String> excludedCountryCodes) {
    this.excludedCountryCodes = excludedCountryCodes;
    return this;
  }

  public DynamicWaiverConditionLocation addExcludedCountryCodesItem(String excludedCountryCodesItem) {
    this.excludedCountryCodes.add(excludedCountryCodesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicWaiverConditionLocation {\n");
    
    sb.append("    includedLocationCodes: ").append(toIndentedString(includedLocationCodes)).append("\n");
    sb.append("    excludedLocationCodes: ").append(toIndentedString(excludedLocationCodes)).append("\n");
    sb.append("    includedCountryCodes: ").append(toIndentedString(includedCountryCodes)).append("\n");
    sb.append("    excludedCountryCodes: ").append(toIndentedString(excludedCountryCodes)).append("\n");
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

