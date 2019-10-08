package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Air;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AlternativeOffer  {
  
  @ApiModelProperty(required = true, value = "Will have value alternative-offers ")
 /**
   * Will have value alternative-offers 
  **/
  private String type = null;

  @ApiModelProperty(required = true, value = "The unique identifier of the alternative offer")
 /**
   * The unique identifier of the alternative offer
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "")
  private Air air = null;
 /**
   * Will have value alternative-offers 
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AlternativeOffer type(String type) {
    this.type = type;
    return this;
  }

 /**
   * The unique identifier of the alternative offer
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AlternativeOffer id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get air
   * @return air
  **/
  @JsonProperty("air")
  public Air getAir() {
    return air;
  }

  public void setAir(Air air) {
    this.air = air;
  }

  public AlternativeOffer air(Air air) {
    this.air = air;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeOffer {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    air: ").append(toIndentedString(air)).append("\n");
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

