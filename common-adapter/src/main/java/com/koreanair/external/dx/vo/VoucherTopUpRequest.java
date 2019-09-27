package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.VoucherPaymentRequest;
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
  * Object used to specify the information needed to top-up on a voucher. 
 **/
@ApiModel(description="Object used to specify the information needed to top-up on a voucher. ")
public class VoucherTopUpRequest  {
  
  @ApiModelProperty(value = "A code associated to the voucher (if provided at voucher creation).")
 /**
   * A code associated to the voucher (if provided at voucher creation).
  **/
  private String verificationCode = null;

  @ApiModelProperty(required = true, value = "The payment method to use for the voucher top-up. A payment request contains: - the payment method to use for the payment - the amount and currency to be paid using that method Today, only credit cards are supported. In order to update the voucher, both amount and payment method are mandatory. ")
 /**
   * The payment method to use for the voucher top-up. A payment request contains: - the payment method to use for the payment - the amount and currency to be paid using that method Today, only credit cards are supported. In order to update the voucher, both amount and payment method are mandatory. 
  **/
  private VoucherPaymentRequest paymentRequests = null;
 /**
   * A code associated to the voucher (if provided at voucher creation).
   * @return verificationCode
  **/
  @JsonProperty("verificationCode")
  public String getVerificationCode() {
    return verificationCode;
  }

  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }

  public VoucherTopUpRequest verificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
    return this;
  }

 /**
   * The payment method to use for the voucher top-up. A payment request contains: - the payment method to use for the payment - the amount and currency to be paid using that method Today, only credit cards are supported. In order to update the voucher, both amount and payment method are mandatory. 
   * @return paymentRequests
  **/
  @JsonProperty("paymentRequests")
  public VoucherPaymentRequest getPaymentRequests() {
    return paymentRequests;
  }

  public void setPaymentRequests(VoucherPaymentRequest paymentRequests) {
    this.paymentRequests = paymentRequests;
  }

  public VoucherTopUpRequest paymentRequests(VoucherPaymentRequest paymentRequests) {
    this.paymentRequests = paymentRequests;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherTopUpRequest {\n");
    
    sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
    sb.append("    paymentRequests: ").append(toIndentedString(paymentRequests)).append("\n");
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

