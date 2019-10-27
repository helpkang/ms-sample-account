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
  * Provider object for teaser recommandation
 **/
@ApiModel(description="Provider object for teaser recommandation")
public class Provider  {
  
  @ApiModelProperty(required = true, value = "Provider code")
 /**
   * Provider code
  **/
  private String providerCode = null;

  @ApiModelProperty(required = true, value = "Flag to indicate if the provider merchant")
 /**
   * Flag to indicate if the provider merchant
  **/
  private Boolean isAirlineMerchant = null;
 /**
   * Provider code
   * @return providerCode
  **/
  @JsonProperty("providerCode")
  public String getProviderCode() {
    return providerCode;
  }

  public void setProviderCode(String providerCode) {
    this.providerCode = providerCode;
  }

  public Provider providerCode(String providerCode) {
    this.providerCode = providerCode;
    return this;
  }

 /**
   * Flag to indicate if the provider merchant
   * @return isAirlineMerchant
  **/
  @JsonProperty("isAirlineMerchant")
  public Boolean isIsAirlineMerchant() {
    return isAirlineMerchant;
  }

  public void setIsAirlineMerchant(Boolean isAirlineMerchant) {
    this.isAirlineMerchant = isAirlineMerchant;
  }

  public Provider isAirlineMerchant(Boolean isAirlineMerchant) {
    this.isAirlineMerchant = isAirlineMerchant;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Provider {\n");
    
    sb.append("    providerCode: ").append(toIndentedString(providerCode)).append("\n");
    sb.append("    isAirlineMerchant: ").append(toIndentedString(isAirlineMerchant)).append("\n");
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

