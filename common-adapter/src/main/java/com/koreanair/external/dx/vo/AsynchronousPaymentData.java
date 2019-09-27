package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.HttpRequest;
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
  * Only available for AlternativePaymentMethod. Indicates the necessary asynchronous payment information:  - Reference id of the asynchronous payment transaction - Http request to target the Payment Service Provider (PSP) 
 **/
@ApiModel(description="Only available for AlternativePaymentMethod. Indicates the necessary asynchronous payment information:  - Reference id of the asynchronous payment transaction - Http request to target the Payment Service Provider (PSP) ")
public class AsynchronousPaymentData  {
  
  @ApiModelProperty(value = "Reference of the payment transaction. Only available for AlternativePaymentMethods  requiring asynchronous interaction ")
 /**
   * Reference of the payment transaction. Only available for AlternativePaymentMethods  requiring asynchronous interaction 
  **/
  private String targetReferenceId = null;

  @ApiModelProperty(value = "Http request containing the url to the Payment Service Provider (PSP) for the asynchronous payment. ")
 /**
   * Http request containing the url to the Payment Service Provider (PSP) for the asynchronous payment. 
  **/
  private HttpRequest targetHttpRequest = null;
 /**
   * Reference of the payment transaction. Only available for AlternativePaymentMethods  requiring asynchronous interaction 
   * @return targetReferenceId
  **/
  @JsonProperty("targetReferenceId")
  public String getTargetReferenceId() {
    return targetReferenceId;
  }

  public void setTargetReferenceId(String targetReferenceId) {
    this.targetReferenceId = targetReferenceId;
  }

  public AsynchronousPaymentData targetReferenceId(String targetReferenceId) {
    this.targetReferenceId = targetReferenceId;
    return this;
  }

 /**
   * Http request containing the url to the Payment Service Provider (PSP) for the asynchronous payment. 
   * @return targetHttpRequest
  **/
  @JsonProperty("targetHttpRequest")
  public HttpRequest getTargetHttpRequest() {
    return targetHttpRequest;
  }

  public void setTargetHttpRequest(HttpRequest targetHttpRequest) {
    this.targetHttpRequest = targetHttpRequest;
  }

  public AsynchronousPaymentData targetHttpRequest(HttpRequest targetHttpRequest) {
    this.targetHttpRequest = targetHttpRequest;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsynchronousPaymentData {\n");
    
    sb.append("    targetReferenceId: ").append(toIndentedString(targetReferenceId)).append("\n");
    sb.append("    targetHttpRequest: ").append(toIndentedString(targetHttpRequest)).append("\n");
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

