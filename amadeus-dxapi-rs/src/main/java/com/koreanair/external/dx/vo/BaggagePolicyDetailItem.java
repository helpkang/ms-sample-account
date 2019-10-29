package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BaggagePolicyRestrictions;
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
  * Baggage characteristics and policy details for a specific recommendation
 **/
@ApiModel(description="Baggage characteristics and policy details for a specific recommendation")
public class BaggagePolicyDetailItem  {
  
  @ApiModelProperty(value = "Baggage policy description. E.g: UPTO50LB 23KG AND62LI 158LCM")
 /**
   * Baggage policy description. E.g: UPTO50LB 23KG AND62LI 158LCM
  **/
  private String description = null;

  @ApiModelProperty(value = "Structured list of applicable baggage policy restrictions in terms of weigth and size")
 /**
   * Structured list of applicable baggage policy restrictions in terms of weigth and size
  **/
  private List<BaggagePolicyRestrictions> policyDetails = null;
 /**
   * Baggage policy description. E.g: UPTO50LB 23KG AND62LI 158LCM
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BaggagePolicyDetailItem description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Structured list of applicable baggage policy restrictions in terms of weigth and size
   * @return policyDetails
  **/
  @JsonProperty("policyDetails")
  public List<BaggagePolicyRestrictions> getPolicyDetails() {
    return policyDetails;
  }

  public void setPolicyDetails(List<BaggagePolicyRestrictions> policyDetails) {
    this.policyDetails = policyDetails;
  }

  public BaggagePolicyDetailItem policyDetails(List<BaggagePolicyRestrictions> policyDetails) {
    this.policyDetails = policyDetails;
    return this;
  }

  public BaggagePolicyDetailItem addPolicyDetailsItem(BaggagePolicyRestrictions policyDetailsItem) {
    this.policyDetails.add(policyDetailsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaggagePolicyDetailItem {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    policyDetails: ").append(toIndentedString(policyDetails)).append("\n");
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

