package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.EstimatedRoomType;
import com.koreanair.external.dx.vo.TextWithLanguageType;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RoomDetails  {
  
  @ApiModelProperty(value = "Room type code, identifier of the room based on 3 characters.  The first character identifies the room type category.  The second numeric character identifies the number of beds.  The third character identifies the bed type.  There is a special case where ROH is returned, this value stands for Run Of House. ")
 /**
   * Room type code, identifier of the room based on 3 characters.  The first character identifies the room type category.  The second numeric character identifies the number of beds.  The third character identifies the bed type.  There is a special case where ROH is returned, this value stands for Run Of House. 
  **/
  private String type = null;

  @ApiModelProperty(value = "")
  private EstimatedRoomType typeEstimated = null;

  @ApiModelProperty(value = "")
  private TextWithLanguageType description = null;
 /**
   * Room type code, identifier of the room based on 3 characters.  The first character identifies the room type category.  The second numeric character identifies the number of beds.  The third character identifies the bed type.  There is a special case where ROH is returned, this value stands for Run Of House. 
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RoomDetails type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get typeEstimated
   * @return typeEstimated
  **/
  @JsonProperty("typeEstimated")
  public EstimatedRoomType getTypeEstimated() {
    return typeEstimated;
  }

  public void setTypeEstimated(EstimatedRoomType typeEstimated) {
    this.typeEstimated = typeEstimated;
  }

  public RoomDetails typeEstimated(EstimatedRoomType typeEstimated) {
    this.typeEstimated = typeEstimated;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public TextWithLanguageType getDescription() {
    return description;
  }

  public void setDescription(TextWithLanguageType description) {
    this.description = description;
  }

  public RoomDetails description(TextWithLanguageType description) {
    this.description = description;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomDetails {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeEstimated: ").append(toIndentedString(typeEstimated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

