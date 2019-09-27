package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Source;
import com.koreanair.external.dx.vo.WarningMessage;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorMessage  {
  
  @ApiModelProperty(value = "An application-specific error code")
 /**
   * An application-specific error code
  **/
  private String code = null;

  @ApiModelProperty(required = true, value = "A short summary of the error")
 /**
   * A short summary of the error
  **/
  private String title = null;

  @ApiModelProperty(value = "Explanation of the error")
 /**
   * Explanation of the error
  **/
  private String detail = null;

  @ApiModelProperty(value = "")
  private Source source = null;

  @ApiModelProperty(value = "HTTP status code associated")
 /**
   * HTTP status code associated
  **/
  private String status = null;
 /**
   * An application-specific error code
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorMessage code(String code) {
    this.code = code;
    return this;
  }

 /**
   * A short summary of the error
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ErrorMessage title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Explanation of the error
   * @return detail
  **/
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ErrorMessage detail(String detail) {
    this.detail = detail;
    return this;
  }

 /**
   * Get source
   * @return source
  **/
  @JsonProperty("source")
  public Source getSource() {
    return source;
  }

  public void setSource(Source source) {
    this.source = source;
  }

  public ErrorMessage source(Source source) {
    this.source = source;
    return this;
  }

 /**
   * HTTP status code associated
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ErrorMessage status(String status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorMessage {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

