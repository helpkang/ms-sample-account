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
  * Price breakdown of converted part expressed in miles
 **/
@ApiModel(description="Price breakdown of converted part expressed in miles")
public class ConvertedMiles  {
  
  @ApiModelProperty(required = true, value = "Base price converted to miles")
 /**
   * Base price converted to miles
  **/
  private Long base = null;

  @ApiModelProperty(required = true, value = "Total price converted to miles")
 /**
   * Total price converted to miles
  **/
  private Long total = null;
 /**
   * Base price converted to miles
   * @return base
  **/
  @JsonProperty("base")
  public Long getBase() {
    return base;
  }

  public void setBase(Long base) {
    this.base = base;
  }

  public ConvertedMiles base(Long base) {
    this.base = base;
    return this;
  }

 /**
   * Total price converted to miles
   * @return total
  **/
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public ConvertedMiles total(Long total) {
    this.total = total;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertedMiles {\n");
    
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

