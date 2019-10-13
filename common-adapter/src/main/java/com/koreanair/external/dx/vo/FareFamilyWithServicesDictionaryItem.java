package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.EligibleService;
import com.koreanair.external.dx.vo.FareFamilyDictionaryItem;
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
  * Fare Family dictionary
 **/
@ApiModel(description="Fare Family dictionary")
public class FareFamilyWithServicesDictionaryItem  {
  
  @ApiModelProperty(required = true, value = "Hierarchy of the fare family as defined on the GDS.")
 /**
   * Hierarchy of the fare family as defined on the GDS.
  **/
  private Integer hierarchy = null;

  @ApiModelProperty(required = true, value = "Commercial Fare Family associated")
 /**
   * Commercial Fare Family associated
  **/
  private String commercialFareFamily = null;

  @ApiModelProperty(value = "Eligible services for a given fare family")
 /**
   * Eligible services for a given fare family
  **/
  private List<EligibleService> eligibleServices = null;
 /**
   * Hierarchy of the fare family as defined on the GDS.
   * @return hierarchy
  **/
  @JsonProperty("hierarchy")
  public Integer getHierarchy() {
    return hierarchy;
  }

  public void setHierarchy(Integer hierarchy) {
    this.hierarchy = hierarchy;
  }

  public FareFamilyWithServicesDictionaryItem hierarchy(Integer hierarchy) {
    this.hierarchy = hierarchy;
    return this;
  }

 /**
   * Commercial Fare Family associated
   * @return commercialFareFamily
  **/
  @JsonProperty("commercialFareFamily")
  public String getCommercialFareFamily() {
    return commercialFareFamily;
  }

  public void setCommercialFareFamily(String commercialFareFamily) {
    this.commercialFareFamily = commercialFareFamily;
  }

  public FareFamilyWithServicesDictionaryItem commercialFareFamily(String commercialFareFamily) {
    this.commercialFareFamily = commercialFareFamily;
    return this;
  }

 /**
   * Eligible services for a given fare family
   * @return eligibleServices
  **/
  @JsonProperty("eligibleServices")
  public List<EligibleService> getEligibleServices() {
    return eligibleServices;
  }

  public void setEligibleServices(List<EligibleService> eligibleServices) {
    this.eligibleServices = eligibleServices;
  }

  public FareFamilyWithServicesDictionaryItem eligibleServices(List<EligibleService> eligibleServices) {
    this.eligibleServices = eligibleServices;
    return this;
  }

  public FareFamilyWithServicesDictionaryItem addEligibleServicesItem(EligibleService eligibleServicesItem) {
    this.eligibleServices.add(eligibleServicesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareFamilyWithServicesDictionaryItem {\n");
    
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
    sb.append("    commercialFareFamily: ").append(toIndentedString(commercialFareFamily)).append("\n");
    sb.append("    eligibleServices: ").append(toIndentedString(eligibleServices)).append("\n");
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

