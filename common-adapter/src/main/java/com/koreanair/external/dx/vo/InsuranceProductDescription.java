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
  * Describes the commercial product associated to an insurance offer.
 **/
@ApiModel(description="Describes the commercial product associated to an insurance offer.")
public class InsuranceProductDescription  {
  
  @ApiModelProperty(example = "STI1", value = "the insurance product or extension code")
 /**
   * the insurance product or extension code
  **/
  private String code = null;

  @ApiModelProperty(example = "Travel Insurance single trip extension", value = "the insurance product or extension name")
 /**
   * the insurance product or extension name
  **/
  private String name = null;
 /**
   * the insurance product or extension code
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public InsuranceProductDescription code(String code) {
    this.code = code;
    return this;
  }

 /**
   * the insurance product or extension name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InsuranceProductDescription name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceProductDescription {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

