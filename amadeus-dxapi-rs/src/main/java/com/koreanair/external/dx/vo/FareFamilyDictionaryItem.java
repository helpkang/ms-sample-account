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
  * Fare Family dictionary
 **/
@ApiModel(description="Fare Family dictionary")
public class FareFamilyDictionaryItem  {
  
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

  public FareFamilyDictionaryItem hierarchy(Integer hierarchy) {
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

  public FareFamilyDictionaryItem commercialFareFamily(String commercialFareFamily) {
    this.commercialFareFamily = commercialFareFamily;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareFamilyDictionaryItem {\n");
    
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
    sb.append("    commercialFareFamily: ").append(toIndentedString(commercialFareFamily)).append("\n");
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

