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
  * Input data to resume payment after redirection. In case of AlternativePaymentMethod, the API user has to gather the payment  confirmation data received from the PSP and build an HTTP request to confirm payment. The API user has to provide the following information in the HTTP request: - Confirmation callback url (of API user) in 'href' field. - Http method to be used (commonly POST or GET) - Payment confirmation data received from the PSP. If http method is 'POST' then this data must be sent in the payload as an array of HttpPayload of 'name' and 'value'. If http method is 'GET', then this data must be sent as query query parameters (e.g. 'http://confCallbackUrl.com?buyer_id=2088102141653014&is_success=T'). In case of PaymentCard enrolled for 3D Secure, Payer Authentication Response (PARes) must be provided in input.  This information is received from the Access Control Server (ACS) during the redirection. 
 **/
@ApiModel(description="Input data to resume payment after redirection. In case of AlternativePaymentMethod, the API user has to gather the payment  confirmation data received from the PSP and build an HTTP request to confirm payment. The API user has to provide the following information in the HTTP request: - Confirmation callback url (of API user) in 'href' field. - Http method to be used (commonly POST or GET) - Payment confirmation data received from the PSP. If http method is 'POST' then this data must be sent in the payload as an array of HttpPayload of 'name' and 'value'. If http method is 'GET', then this data must be sent as query query parameters (e.g. 'http://confCallbackUrl.com?buyer_id=2088102141653014&is_success=T'). In case of PaymentCard enrolled for 3D Secure, Payer Authentication Response (PARes) must be provided in input.  This information is received from the Access Control Server (ACS) during the redirection. ")
public class PaymentResumption  {
  
  @ApiModelProperty(value = "Payer Authentication Response (PARes). This is the payment confirmation  data received from the Access Control Server in the payment with 3D Secure ")
 /**
   * Payer Authentication Response (PARes). This is the payment confirmation  data received from the Access Control Server in the payment with 3D Secure 
  **/
  private String payerAuthenticationResponse = null;

  @ApiModelProperty(value = "Http request with payment confirmation data coming from Payment Service Provider (PSP) during the redirection for the AlternativePaymentMethod. ")
 /**
   * Http request with payment confirmation data coming from Payment Service Provider (PSP) during the redirection for the AlternativePaymentMethod. 
  **/
  private HttpRequest link = null;
 /**
   * Payer Authentication Response (PARes). This is the payment confirmation  data received from the Access Control Server in the payment with 3D Secure 
   * @return payerAuthenticationResponse
  **/
  @JsonProperty("payerAuthenticationResponse")
  public String getPayerAuthenticationResponse() {
    return payerAuthenticationResponse;
  }

  public void setPayerAuthenticationResponse(String payerAuthenticationResponse) {
    this.payerAuthenticationResponse = payerAuthenticationResponse;
  }

  public PaymentResumption payerAuthenticationResponse(String payerAuthenticationResponse) {
    this.payerAuthenticationResponse = payerAuthenticationResponse;
    return this;
  }

 /**
   * Http request with payment confirmation data coming from Payment Service Provider (PSP) during the redirection for the AlternativePaymentMethod. 
   * @return link
  **/
  @JsonProperty("link")
  public HttpRequest getLink() {
    return link;
  }

  public void setLink(HttpRequest link) {
    this.link = link;
  }

  public PaymentResumption link(HttpRequest link) {
    this.link = link;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentResumption {\n");
    
    sb.append("    payerAuthenticationResponse: ").append(toIndentedString(payerAuthenticationResponse)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

