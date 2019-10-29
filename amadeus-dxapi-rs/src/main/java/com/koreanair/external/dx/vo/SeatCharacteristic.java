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
  * Functional characteristic of the seat. It refers to the seat characteristics dictionary
 **/
@ApiModel(description="Functional characteristic of the seat. It refers to the seat characteristics dictionary")
public class SeatCharacteristic  {
  
  @ApiModelProperty(value = "Seat characteristic code. Eg: \"CH\" for \"Chargeable seat\"")
 /**
   * Seat characteristic code. Eg: \"CH\" for \"Chargeable seat\"
  **/
  private String code = null;
 /**
   * Seat characteristic code. Eg: \&quot;CH\&quot; for \&quot;Chargeable seat\&quot;
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SeatCharacteristic code(String code) {
    this.code = code;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatCharacteristic {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

