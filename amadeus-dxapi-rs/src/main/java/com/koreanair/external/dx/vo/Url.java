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
  * Object containing URL and description 
 **/
@ApiModel(description="Object containing URL and description ")
public class Url  {
  
  @ApiModelProperty(value = "Url description, for example 'alternate' if the url specifies alternate form of information like a link to a PDF.")
 /**
   * Url description, for example 'alternate' if the url specifies alternate form of information like a link to a PDF.
  **/
  private String rel = null;

  @ApiModelProperty(value = "Url")
 /**
   * Url
  **/
  private String href = null;

  @ApiModelProperty(value = "Media type of this resource, for example 'application/pdf' See https://www.iana.org/assignments/media-types/media-types.xhtml for reference.")
 /**
   * Media type of this resource, for example 'application/pdf' See https://www.iana.org/assignments/media-types/media-types.xhtml for reference.
  **/
  private String mediaType = null;
 /**
   * Url description, for example &#39;alternate&#39; if the url specifies alternate form of information like a link to a PDF.
   * @return rel
  **/
  @JsonProperty("rel")
  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public Url rel(String rel) {
    this.rel = rel;
    return this;
  }

 /**
   * Url
   * @return href
  **/
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Url href(String href) {
    this.href = href;
    return this;
  }

 /**
   * Media type of this resource, for example &#39;application/pdf&#39; See https://www.iana.org/assignments/media-types/media-types.xhtml for reference.
   * @return mediaType
  **/
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public Url mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Url {\n");
    
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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

