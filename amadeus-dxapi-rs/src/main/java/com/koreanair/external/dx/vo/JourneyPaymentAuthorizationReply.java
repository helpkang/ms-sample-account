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
  * Payment authorization reply. In the case of simple payment (no 3DS), only the status field and action are returned properties:   status:     description: Indicates if the authorization was successful     type: string     enum:       - ok       - ko       - pending3DSecure   paymentAction:     description: Action to be performed by the UI     type: string     enum:       - confirm       - redirect       - error       - mopSelection   url:     description: URL of the 3DS page if needed     type: string   merchantData:     description: Merchant data, which will be posted back to the TermUrl at the end of the 3DS process     type: string   paymentAuthenticationRequest:     description: Zipped Base64-encoded data about the transaction, received from the Visa/Mastercard directory servers     type: string   termUrl:     description: URL the customer will be returned to at the end of the 3DS process     type: string 
 **/
@ApiModel(description="Payment authorization reply. In the case of simple payment (no 3DS), only the status field and action are returned properties:   status:     description: Indicates if the authorization was successful     type: string     enum:       - ok       - ko       - pending3DSecure   paymentAction:     description: Action to be performed by the UI     type: string     enum:       - confirm       - redirect       - error       - mopSelection   url:     description: URL of the 3DS page if needed     type: string   merchantData:     description: Merchant data, which will be posted back to the TermUrl at the end of the 3DS process     type: string   paymentAuthenticationRequest:     description: Zipped Base64-encoded data about the transaction, received from the Visa/Mastercard directory servers     type: string   termUrl:     description: URL the customer will be returned to at the end of the 3DS process     type: string ")
public class JourneyPaymentAuthorizationReply  {
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyPaymentAuthorizationReply {\n");
    
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

