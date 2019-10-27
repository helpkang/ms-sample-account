package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.PaymentRedirectionContext;
import com.koreanair.external.dx.vo.PaymentResumption;
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
  * Authorization information for payment performed on third party systems. Integration or interaction with those third party systems may require a redirection to their website or application. 
 **/
@ApiModel(description="Authorization information for payment performed on third party systems. Integration or interaction with those third party systems may require a redirection to their website or application. ")
public class PaymentAuthorizationInput  {
  
  @ApiModelProperty(value = "Manual approval code issued by an external Payment Service Provider (PSP) for a PaymentCard payment. This is used only when the airline has selected an external Payment Service Provider (i.e. not Amadeus Payment Platform). The approval code will be stored in a Payment Record in the order. ")
 /**
   * Manual approval code issued by an external Payment Service Provider (PSP) for a PaymentCard payment. This is used only when the airline has selected an external Payment Service Provider (i.e. not Amadeus Payment Platform). The approval code will be stored in a Payment Record in the order. 
  **/
  private String approvalCode = null;

  @ApiModelProperty(value = "List of API user callback urls to be sent in input at the creation of the payment records  the payment method requires redirection (e.g. AlternativePaymentMethod or PaymentCard enrolled for 3D Secure). ")
 /**
   * List of API user callback urls to be sent in input at the creation of the payment records  the payment method requires redirection (e.g. AlternativePaymentMethod or PaymentCard enrolled for 3D Secure). 
  **/
  private PaymentRedirectionContext paymentRedirectionContext = null;

  @ApiModelProperty(value = "Resumption information needed to trigger the payment authorization after the redirection.  Payment confirmation data received from the Payment Service Provider (PSP) or the Access Control Server (ACS) has to be sent in input in order to confirm the payment records in the Order. ")
 /**
   * Resumption information needed to trigger the payment authorization after the redirection.  Payment confirmation data received from the Payment Service Provider (PSP) or the Access Control Server (ACS) has to be sent in input in order to confirm the payment records in the Order. 
  **/
  private PaymentResumption paymentResumption = null;
 /**
   * Manual approval code issued by an external Payment Service Provider (PSP) for a PaymentCard payment. This is used only when the airline has selected an external Payment Service Provider (i.e. not Amadeus Payment Platform). The approval code will be stored in a Payment Record in the order. 
   * @return approvalCode
  **/
  @JsonProperty("approvalCode")
  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public PaymentAuthorizationInput approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

 /**
   * List of API user callback urls to be sent in input at the creation of the payment records  the payment method requires redirection (e.g. AlternativePaymentMethod or PaymentCard enrolled for 3D Secure). 
   * @return paymentRedirectionContext
  **/
  @JsonProperty("paymentRedirectionContext")
  public PaymentRedirectionContext getPaymentRedirectionContext() {
    return paymentRedirectionContext;
  }

  public void setPaymentRedirectionContext(PaymentRedirectionContext paymentRedirectionContext) {
    this.paymentRedirectionContext = paymentRedirectionContext;
  }

  public PaymentAuthorizationInput paymentRedirectionContext(PaymentRedirectionContext paymentRedirectionContext) {
    this.paymentRedirectionContext = paymentRedirectionContext;
    return this;
  }

 /**
   * Resumption information needed to trigger the payment authorization after the redirection.  Payment confirmation data received from the Payment Service Provider (PSP) or the Access Control Server (ACS) has to be sent in input in order to confirm the payment records in the Order. 
   * @return paymentResumption
  **/
  @JsonProperty("paymentResumption")
  public PaymentResumption getPaymentResumption() {
    return paymentResumption;
  }

  public void setPaymentResumption(PaymentResumption paymentResumption) {
    this.paymentResumption = paymentResumption;
  }

  public PaymentAuthorizationInput paymentResumption(PaymentResumption paymentResumption) {
    this.paymentResumption = paymentResumption;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAuthorizationInput {\n");
    
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    paymentRedirectionContext: ").append(toIndentedString(paymentRedirectionContext)).append("\n");
    sb.append("    paymentResumption: ").append(toIndentedString(paymentResumption)).append("\n");
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

