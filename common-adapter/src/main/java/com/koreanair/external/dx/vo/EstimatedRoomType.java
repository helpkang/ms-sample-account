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
  * it returns the room type parsed from the room description, thus it is provided only for informational purposes
 **/
@ApiModel(description="it returns the room type parsed from the room description, thus it is provided only for informational purposes")
public class EstimatedRoomType  {
  
  @ApiModelProperty(value = "Category code")
 /**
   * Category code
  **/
  private String category = null;

  @ApiModelProperty(value = "Number of beds in the room (1-9)")
 /**
   * Number of beds in the room (1-9)
  **/
  private Integer beds = null;

  @ApiModelProperty(value = "Type of the bed")
 /**
   * Type of the bed
  **/
  private String bedType = null;
 /**
   * Category code
   * @return category
  **/
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public EstimatedRoomType category(String category) {
    this.category = category;
    return this;
  }

 /**
   * Number of beds in the room (1-9)
   * @return beds
  **/
  @JsonProperty("beds")
  public Integer getBeds() {
    return beds;
  }

  public void setBeds(Integer beds) {
    this.beds = beds;
  }

  public EstimatedRoomType beds(Integer beds) {
    this.beds = beds;
    return this;
  }

 /**
   * Type of the bed
   * @return bedType
  **/
  @JsonProperty("bedType")
  public String getBedType() {
    return bedType;
  }

  public void setBedType(String bedType) {
    this.bedType = bedType;
  }

  public EstimatedRoomType bedType(String bedType) {
    this.bedType = bedType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimatedRoomType {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    beds: ").append(toIndentedString(beds)).append("\n");
    sb.append("    bedType: ").append(toIndentedString(bedType)).append("\n");
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

