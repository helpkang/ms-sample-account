package com.koreanair.external.dx.vo;

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

public class Image  {
  
  @ApiModelProperty(value = "Image width expressed in pixels. This attribute is not guaranteed to be returned if the content is hosted in an external source (i.e. provider CDN). In case the content is coming from Amadeus Car Multimedia Solution, this value will be set, as well as the sizeCode. ")
 /**
   * Image width expressed in pixels. This attribute is not guaranteed to be returned if the content is hosted in an external source (i.e. provider CDN). In case the content is coming from Amadeus Car Multimedia Solution, this value will be set, as well as the sizeCode. 
  **/
  private Integer width = null;

  @ApiModelProperty(value = "Image height expressed in pixels This attribute is not guaranteed to be returned if the content is hosted in an external source (i.e. provider CDN). In case the content is coming from Amadeus Car Multimedia Solution, this value will be set, as well as the sizeCode. ")
 /**
   * Image height expressed in pixels This attribute is not guaranteed to be returned if the content is hosted in an external source (i.e. provider CDN). In case the content is coming from Amadeus Car Multimedia Solution, this value will be set, as well as the sizeCode. 
  **/
  private Integer height = null;

  @ApiModelProperty(value = "Image size code following Amadeus Car Multimedia standards which defines a value range from 0 to 9. However, this attribute will not be returned if the content is in an external source (i.e. provider CDN). ")
 /**
   * Image size code following Amadeus Car Multimedia standards which defines a value range from 0 to 9. However, this attribute will not be returned if the content is in an external source (i.e. provider CDN). 
  **/
  private Integer sizeCode = null;

  @ApiModelProperty(required = true, value = "Image url")
 /**
   * Image url
  **/
  private String src = null;

  @ApiModelProperty(value = "Tag(s) describring the image e.g. [GIF, PNG, SMALL, BIG, MEDIUM, SVG,... ] This content might be used in order to convey some information about the image, especially in those cases in which it is hosted in an external solution (i.e. provider CDN). This list is not guaranteed to be filled with values, so it should be taken as additional information. ")
 /**
   * Tag(s) describring the image e.g. [GIF, PNG, SMALL, BIG, MEDIUM, SVG,... ] This content might be used in order to convey some information about the image, especially in those cases in which it is hosted in an external solution (i.e. provider CDN). This list is not guaranteed to be filled with values, so it should be taken as additional information. 
  **/
  private List<String> tags = null;
 /**
   * Image width expressed in pixels. This attribute is not guaranteed to be returned if the content is hosted in an external source (i.e. provider CDN). In case the content is coming from Amadeus Car Multimedia Solution, this value will be set, as well as the sizeCode. 
   * @return width
  **/
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Image width(Integer width) {
    this.width = width;
    return this;
  }

 /**
   * Image height expressed in pixels This attribute is not guaranteed to be returned if the content is hosted in an external source (i.e. provider CDN). In case the content is coming from Amadeus Car Multimedia Solution, this value will be set, as well as the sizeCode. 
   * @return height
  **/
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public Image height(Integer height) {
    this.height = height;
    return this;
  }

 /**
   * Image size code following Amadeus Car Multimedia standards which defines a value range from 0 to 9. However, this attribute will not be returned if the content is in an external source (i.e. provider CDN). 
   * @return sizeCode
  **/
  @JsonProperty("sizeCode")
  public Integer getSizeCode() {
    return sizeCode;
  }

  public void setSizeCode(Integer sizeCode) {
    this.sizeCode = sizeCode;
  }

  public Image sizeCode(Integer sizeCode) {
    this.sizeCode = sizeCode;
    return this;
  }

 /**
   * Image url
   * @return src
  **/
  @JsonProperty("src")
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public Image src(String src) {
    this.src = src;
    return this;
  }

 /**
   * Tag(s) describring the image e.g. [GIF, PNG, SMALL, BIG, MEDIUM, SVG,... ] This content might be used in order to convey some information about the image, especially in those cases in which it is hosted in an external solution (i.e. provider CDN). This list is not guaranteed to be filled with values, so it should be taken as additional information. 
   * @return tags
  **/
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Image tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Image addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    sizeCode: ").append(toIndentedString(sizeCode)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

