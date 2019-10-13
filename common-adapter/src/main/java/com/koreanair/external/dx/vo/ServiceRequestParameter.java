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
  * Service parameter information to be provided on service selection phase
 **/
@ApiModel(description="Service parameter information to be provided on service selection phase")
public class ServiceRequestParameter  {
  
  @ApiModelProperty(value = "Functional reference of the parameter. It refers to the serviceParameters dictionary")
 /**
   * Functional reference of the parameter. It refers to the serviceParameters dictionary
  **/
  private String code = null;

  @ApiModelProperty(value = "")
  private String value = null;
 /**
   * Functional reference of the parameter. It refers to the serviceParameters dictionary
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ServiceRequestParameter code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Get value
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ServiceRequestParameter value(String value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRequestParameter {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

