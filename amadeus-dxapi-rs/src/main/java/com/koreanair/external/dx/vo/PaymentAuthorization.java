package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;
import java.time.LocalDateTime;

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
  * An Authorization is usually the first transaction performed during the acceptance stage of a payment (usually towards the end of the checkout process), i.e. an agreement on some money to be exchanged, at once or later, between two parties, the individual and the payee (usually Merchant). When successful, it usually results in the amount at stake being blocked for a limited period of time on the payer's account.  
 **/
@ApiModel(description="An Authorization is usually the first transaction performed during the acceptance stage of a payment (usually towards the end of the checkout process), i.e. an agreement on some money to be exchanged, at once or later, between two parties, the individual and the payee (usually Merchant). When successful, it usually results in the amount at stake being blocked for a limited period of time on the payer's account.  ")
public class PaymentAuthorization  {
  
  @ApiModelProperty(value = "Approval code issued during the payment")
 /**
   * Approval code issued during the payment
  **/
  private String approvalCode = null;

  @ApiModelProperty(value = "Payment transaction date and time in GMT (Example: 2017-02-10T20:40:12Z)")
 /**
   * Payment transaction date and time in GMT (Example: 2017-02-10T20:40:12Z)
  **/
  private LocalDateTime transactionDateTime = null;

  @ApiModelProperty(value = "Payment authorization date and time in GMT (Example: 2017-02-10T20:40:12Z)")
 /**
   * Payment authorization date and time in GMT (Example: 2017-02-10T20:40:12Z)
  **/
  private LocalDateTime authorizationDateTime = null;
 /**
   * Approval code issued during the payment
   * @return approvalCode
  **/
  @JsonProperty("approvalCode")
  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public PaymentAuthorization approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

 /**
   * Payment transaction date and time in GMT (Example: 2017-02-10T20:40:12Z)
   * @return transactionDateTime
  **/
  @JsonProperty("transactionDateTime")
  public LocalDateTime getTransactionDateTime() {
    return transactionDateTime;
  }

  public void setTransactionDateTime(LocalDateTime transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
  }

  public PaymentAuthorization transactionDateTime(LocalDateTime transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
    return this;
  }

 /**
   * Payment authorization date and time in GMT (Example: 2017-02-10T20:40:12Z)
   * @return authorizationDateTime
  **/
  @JsonProperty("authorizationDateTime")
  public LocalDateTime getAuthorizationDateTime() {
    return authorizationDateTime;
  }

  public void setAuthorizationDateTime(LocalDateTime authorizationDateTime) {
    this.authorizationDateTime = authorizationDateTime;
  }

  public PaymentAuthorization authorizationDateTime(LocalDateTime authorizationDateTime) {
    this.authorizationDateTime = authorizationDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAuthorization {\n");
    
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    transactionDateTime: ").append(toIndentedString(transactionDateTime)).append("\n");
    sb.append("    authorizationDateTime: ").append(toIndentedString(authorizationDateTime)).append("\n");
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

