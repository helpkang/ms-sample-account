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
  * This object contains a list of detailed information associated to a promotion
 **/
@ApiModel(description="This object contains a list of detailed information associated to a promotion")
public class Promotion  {
  
  @ApiModelProperty(required = true, value = "Value of the promotion")
 /**
   * Value of the promotion
  **/
  private String code = null;

  @ApiModelProperty(value = "Code of the airline which is owner of the promotionCode. Note: If promotionCode provided in input and if no promotionAirlineCode provided in input, then airline used for the promocode computation is the one of the calling UI.")
 /**
   * Code of the airline which is owner of the promotionCode. Note: If promotionCode provided in input and if no promotionAirlineCode provided in input, then airline used for the promocode computation is the one of the calling UI.
  **/
  private String airlineCode = null;
 /**
   * Value of the promotion
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Promotion code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Code of the airline which is owner of the promotionCode. Note: If promotionCode provided in input and if no promotionAirlineCode provided in input, then airline used for the promocode computation is the one of the calling UI.
   * @return airlineCode
  **/
  @JsonProperty("airlineCode")
  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public Promotion airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Promotion {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
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

