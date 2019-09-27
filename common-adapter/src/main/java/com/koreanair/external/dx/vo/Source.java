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
  * An object containing references to the source of the error
 **/
@ApiModel(description="An object containing references to the source of the error")
public class Source  {
  
  @ApiModelProperty(value = "a JSON Pointer [RFC6901] to the associated entity in the request document")
 /**
   * a JSON Pointer [RFC6901] to the associated entity in the request document
  **/
  private String pointer = null;

  @ApiModelProperty(value = "a string indicating which URI query parameter caused the issue")
 /**
   * a string indicating which URI query parameter caused the issue
  **/
  private String parameter = null;
 /**
   * a JSON Pointer [RFC6901] to the associated entity in the request document
   * @return pointer
  **/
  @JsonProperty("pointer")
  public String getPointer() {
    return pointer;
  }

  public void setPointer(String pointer) {
    this.pointer = pointer;
  }

  public Source pointer(String pointer) {
    this.pointer = pointer;
    return this;
  }

 /**
   * a string indicating which URI query parameter caused the issue
   * @return parameter
  **/
  @JsonProperty("parameter")
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  public Source parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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

