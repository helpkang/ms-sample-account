package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.HttpPayload;
import com.koreanair.external.dx.vo.Url;
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
  * HTTP request containing Url, HTTP method and payload
 **/
@ApiModel(description="HTTP request containing Url, HTTP method and payload")
public class HttpRequest  {
  
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


@XmlType(name="MethodsEnum")
@XmlEnum(String.class)
public enum MethodsEnum {

@XmlEnumValue("GET") GET(String.valueOf("GET")), @XmlEnumValue("POST") POST(String.valueOf("POST")), @XmlEnumValue("PUT") PUT(String.valueOf("PUT")), @XmlEnumValue("PATCH") PATCH(String.valueOf("PATCH")), @XmlEnumValue("DELETE") DELETE(String.valueOf("DELETE"));


    private String value;

    MethodsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MethodsEnum fromValue(String v) {
        for (MethodsEnum b : MethodsEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "The list of methods that are available on the resource (selected among POST, PUT, PATCH, GET, DELETE)")
 /**
   * The list of methods that are available on the resource (selected among POST, PUT, PATCH, GET, DELETE)
  **/
  private List<MethodsEnum> methods = null;

  @ApiModelProperty(value = "Payload of the HTTP request")
 /**
   * Payload of the HTTP request
  **/
  private List<HttpPayload> payload = null;
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

  public HttpRequest rel(String rel) {
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

  public HttpRequest href(String href) {
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

  public HttpRequest mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

 /**
   * The list of methods that are available on the resource (selected among POST, PUT, PATCH, GET, DELETE)
   * @return methods
  **/
  @JsonProperty("methods")
  public List<MethodsEnum> getMethods() {
    return methods;
  }

  public void setMethods(List<MethodsEnum> methods) {
    this.methods = methods;
  }

  public HttpRequest methods(List<MethodsEnum> methods) {
    this.methods = methods;
    return this;
  }

  public HttpRequest addMethodsItem(MethodsEnum methodsItem) {
    this.methods.add(methodsItem);
    return this;
  }

 /**
   * Payload of the HTTP request
   * @return payload
  **/
  @JsonProperty("payload")
  public List<HttpPayload> getPayload() {
    return payload;
  }

  public void setPayload(List<HttpPayload> payload) {
    this.payload = payload;
  }

  public HttpRequest payload(List<HttpPayload> payload) {
    this.payload = payload;
    return this;
  }

  public HttpRequest addPayloadItem(HttpPayload payloadItem) {
    this.payload.add(payloadItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpRequest {\n");
    
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

