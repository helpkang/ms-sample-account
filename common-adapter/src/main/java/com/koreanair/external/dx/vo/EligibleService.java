package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EligibleService  {
  
  @ApiModelProperty(value = "")
  private String serviceId = null;

  @ApiModelProperty(value = "Used to specify if a service is included (true) or at a charge (false)")
 /**
   * Used to specify if a service is included (true) or at a charge (false)
  **/
  private Boolean isIncluded = null;

  @ApiModelProperty(value = "")
  private Amount fromPrice = null;
 /**
   * Get serviceId
   * @return serviceId
  **/
  @JsonProperty("serviceId")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public EligibleService serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

 /**
   * Used to specify if a service is included (true) or at a charge (false)
   * @return isIncluded
  **/
  @JsonProperty("isIncluded")
  public Boolean isIsIncluded() {
    return isIncluded;
  }

  public void setIsIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
  }

  public EligibleService isIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
    return this;
  }

 /**
   * Get fromPrice
   * @return fromPrice
  **/
  @JsonProperty("fromPrice")
  public Amount getFromPrice() {
    return fromPrice;
  }

  public void setFromPrice(Amount fromPrice) {
    this.fromPrice = fromPrice;
  }

  public EligibleService fromPrice(Amount fromPrice) {
    this.fromPrice = fromPrice;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibleService {\n");
    
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    isIncluded: ").append(toIndentedString(isIncluded)).append("\n");
    sb.append("    fromPrice: ").append(toIndentedString(fromPrice)).append("\n");
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

