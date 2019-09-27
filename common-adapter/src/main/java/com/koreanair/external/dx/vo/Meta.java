package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.HttpRequest;
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
  * Meta information containing the HTTP details of the linked resources
 **/
@ApiModel(description="Meta information containing the HTTP details of the linked resources")
public class Meta  {
  
  @ApiModelProperty(value = "")
  private List<HttpRequest> links = null;
 /**
   * Get links
   * @return links
  **/
  @JsonProperty("links")
  public List<HttpRequest> getLinks() {
    return links;
  }

  public void setLinks(List<HttpRequest> links) {
    this.links = links;
  }

  public Meta links(List<HttpRequest> links) {
    this.links = links;
    return this;
  }

  public Meta addLinksItem(HttpRequest linksItem) {
    this.links.add(linksItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

