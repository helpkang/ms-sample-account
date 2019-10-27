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
  * Special service requests dictionary. Allows mapping a Special service request to its name. Example: RQST = Request Seat
 **/
@ApiModel(description="Special service requests dictionary. Allows mapping a Special service request to its name. Example: RQST = Request Seat")
public class SpecialServiceRequestDictionaryItem  {
  
  @ApiModelProperty(required = true, value = "Special service requests name. Eg: \"Request seat\"")
 /**
   * Special service requests name. Eg: \"Request seat\"
  **/
  private String name = null;
 /**
   * Special service requests name. Eg: \&quot;Request seat\&quot;
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SpecialServiceRequestDictionaryItem name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialServiceRequestDictionaryItem {\n");
    
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

