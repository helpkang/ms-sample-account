package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirBound;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Air  {
  
  @ApiModelProperty(required = true, value = "")
  private AirBound bound = null;
 /**
   * Get bound
   * @return bound
  **/
  @JsonProperty("bound")
  public AirBound getBound() {
    return bound;
  }

  public void setBound(AirBound bound) {
    this.bound = bound;
  }

  public Air bound(AirBound bound) {
    this.bound = bound;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Air {\n");
    
    sb.append("    bound: ").append(toIndentedString(bound)).append("\n");
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

