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
  * it contains the rate code family grouping various rate plan codes belonging to the same family and it indicates the type of the rate
 **/
@ApiModel(description="it contains the rate code family grouping various rate plan codes belonging to the same family and it indicates the type of the rate")
public class RateFamily  {
  
  @ApiModelProperty(value = "The estimated rate family (PRO,FAM,GOV)")
 /**
   * The estimated rate family (PRO,FAM,GOV)
  **/
  private String code = null;

  @ApiModelProperty(value = "The type of the rate (public=P, negotiated=N, conditional=C)")
 /**
   * The type of the rate (public=P, negotiated=N, conditional=C)
  **/
  private String type = null;
 /**
   * The estimated rate family (PRO,FAM,GOV)
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public RateFamily code(String code) {
    this.code = code;
    return this;
  }

 /**
   * The type of the rate (public&#x3D;P, negotiated&#x3D;N, conditional&#x3D;C)
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RateFamily type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateFamily {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

