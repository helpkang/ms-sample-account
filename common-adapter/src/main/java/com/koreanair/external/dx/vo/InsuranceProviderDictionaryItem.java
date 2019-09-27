package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.InsuranceDetails;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InsuranceProviderDictionaryItem  {
  
  @ApiModelProperty(example = "Travel Guard", value = "The provider full name")
 /**
   * The provider full name
  **/
  private String name = null;

  @ApiModelProperty(value = "")
  private InsuranceDetails details = null;
 /**
   * The provider full name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InsuranceProviderDictionaryItem name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get details
   * @return details
  **/
  @JsonProperty("details")
  public InsuranceDetails getDetails() {
    return details;
  }

  public void setDetails(InsuranceDetails details) {
    this.details = details;
  }

  public InsuranceProviderDictionaryItem details(InsuranceDetails details) {
    this.details = details;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceProviderDictionaryItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

