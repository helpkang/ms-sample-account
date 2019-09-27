package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Remark;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

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
  * Free text information added to an order (RM). These are visible to all DAPI users. 
 **/
@ApiModel(description="Free text information added to an order (RM). These are visible to all DAPI users. ")
public class GeneralRemark extends Remark {
  
  @ApiModelProperty(value = "Category of the remark e.g. RMA will be inserted in the order with the provided free text")
 /**
   * Category of the remark e.g. RMA will be inserted in the order with the provided free text
  **/
  private String category = null;

  @ApiModelProperty(required = true, value = "Free text of the remark")
 /**
   * Free text of the remark
  **/
  private String freetext = null;

  @ApiModelProperty(value = "A list of flights associated to this Remark. If not specified, the remark applies to all flights")
 /**
   * A list of flights associated to this Remark. If not specified, the remark applies to all flights
  **/
  private List<String> flightIds = null;
 /**
   * Category of the remark e.g. RMA will be inserted in the order with the provided free text
   * @return category
  **/
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public GeneralRemark category(String category) {
    this.category = category;
    return this;
  }

 /**
   * Free text of the remark
   * @return freetext
  **/
  @JsonProperty("freetext")
  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public GeneralRemark freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

 /**
   * A list of flights associated to this Remark. If not specified, the remark applies to all flights
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public GeneralRemark flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public GeneralRemark addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralRemark {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
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

