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
  * Seat characteristics dictionary. Allows mapping a service characteristic to its name. Example: CH = Chargeable Seat, W = Window Seat, A = Aisle Seat, Q = Seat in a quiet zone, E = Exit Row Seat, ...
 **/
@ApiModel(description="Seat characteristics dictionary. Allows mapping a service characteristic to its name. Example: CH = Chargeable Seat, W = Window Seat, A = Aisle Seat, Q = Seat in a quiet zone, E = Exit Row Seat, ...")
public class SeatCharacteristicDictionaryItem  {
  
  @ApiModelProperty(required = true, value = "seat characteristic code. Eg: \"CH\" for \"Chargeable seat\"")
 /**
   * seat characteristic code. Eg: \"CH\" for \"Chargeable seat\"
  **/
  private String code = null;

  @ApiModelProperty(required = true, value = "seat characteristic code name. Eg: \"Chargeable seat\"")
 /**
   * seat characteristic code name. Eg: \"Chargeable seat\"
  **/
  private String name = null;
 /**
   * seat characteristic code. Eg: \&quot;CH\&quot; for \&quot;Chargeable seat\&quot;
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SeatCharacteristicDictionaryItem code(String code) {
    this.code = code;
    return this;
  }

 /**
   * seat characteristic code name. Eg: \&quot;Chargeable seat\&quot;
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SeatCharacteristicDictionaryItem name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatCharacteristicDictionaryItem {\n");
    
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

