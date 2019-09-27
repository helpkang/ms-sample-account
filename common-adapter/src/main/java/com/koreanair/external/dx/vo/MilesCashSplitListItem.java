package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.MilesCashMonetaryAmount;
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
  * Possible split of payable amount for Miles & Cash
 **/
@ApiModel(description="Possible split of payable amount for Miles & Cash")
public class MilesCashSplitListItem  {
  
  @ApiModelProperty(required = true, value = "Unique id for this item, to used when paying with this Miles & Cash split.")
 /**
   * Unique id for this item, to used when paying with this Miles & Cash split.
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "This is the amount in miles that will be redeemed. ")
 /**
   * This is the amount in miles that will be redeemed. 
  **/
  private Integer miles = null;

  @ApiModelProperty(required = true, value = "")
  private MilesCashMonetaryAmount monetary = null;
 /**
   * Unique id for this item, to used when paying with this Miles &amp; Cash split.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MilesCashSplitListItem id(String id) {
    this.id = id;
    return this;
  }

 /**
   * This is the amount in miles that will be redeemed. 
   * minimum: 0
   * @return miles
  **/
  @JsonProperty("miles")
  public Integer getMiles() {
    return miles;
  }

  public void setMiles(Integer miles) {
    this.miles = miles;
  }

  public MilesCashSplitListItem miles(Integer miles) {
    this.miles = miles;
    return this;
  }

 /**
   * Get monetary
   * @return monetary
  **/
  @JsonProperty("monetary")
  public MilesCashMonetaryAmount getMonetary() {
    return monetary;
  }

  public void setMonetary(MilesCashMonetaryAmount monetary) {
    this.monetary = monetary;
  }

  public MilesCashSplitListItem monetary(MilesCashMonetaryAmount monetary) {
    this.monetary = monetary;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MilesCashSplitListItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    miles: ").append(toIndentedString(miles)).append("\n");
    sb.append("    monetary: ").append(toIndentedString(monetary)).append("\n");
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

