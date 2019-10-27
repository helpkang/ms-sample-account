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
  * Media URI
 **/
@ApiModel(description="Media URI")
public class MediaUri  {
  
  @ApiModelProperty(value = "")
  private String uri = null;

  @ApiModelProperty(value = "Examples :   * EXTERIOR   * LOBBY   * SWIMMING_POOL   * RESTAURANT   * ROOM")
 /**
   * Examples :   * EXTERIOR   * LOBBY   * SWIMMING_POOL   * RESTAURANT   * ROOM
  **/
  private String category = null;
 /**
   * Get uri
   * @return uri
  **/
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public MediaUri uri(String uri) {
    this.uri = uri;
    return this;
  }

 /**
   * Examples :   * EXTERIOR   * LOBBY   * SWIMMING_POOL   * RESTAURANT   * ROOM
   * @return category
  **/
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public MediaUri category(String category) {
    this.category = category;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUri {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

