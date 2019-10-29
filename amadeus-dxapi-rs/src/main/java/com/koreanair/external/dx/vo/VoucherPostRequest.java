package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.VoucherEligibilities;
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
  * Object used to specify the information needed to create a voucher. 
 **/
@ApiModel(description="Object used to specify the information needed to create a voucher. ")
public class VoucherPostRequest  {
  
  @ApiModelProperty(required = true, value = "The category under which the voucher is applying")
 /**
   * The category under which the voucher is applying
  **/
  private String category = null;

  @ApiModelProperty(value = "A more detailed description on the category of the voucher")
 /**
   * A more detailed description on the category of the voucher
  **/
  private String subCategory = null;

  @ApiModelProperty(value = "A code associated to the voucher. After the voucher creation, this code will be needed for all actions on it (retrieve, usage...). Without verificationCode, the voucher will accessible to anyone who has its id.")
 /**
   * A code associated to the voucher. After the voucher creation, this code will be needed for all actions on it (retrieve, usage...). Without verificationCode, the voucher will accessible to anyone who has its id.
  **/
  private String verificationCode = null;

  @ApiModelProperty(required = true, value = "The payment method to use for the voucher creation. A payment request contains: - the payment method to use for the payment - the amount and currency to be paid using that method Today, only credit cards and invoices are supported. ")
 /**
   * The payment method to use for the voucher creation. A payment request contains: - the payment method to use for the payment - the amount and currency to be paid using that method Today, only credit cards and invoices are supported. 
  **/
  private VoucherPaymentRequest paymentRequests = null;

  @ApiModelProperty(value = "What is the voucher is eligible for. If not provided, the default value will be TRUE for each eligibility.")
 /**
   * What is the voucher is eligible for. If not provided, the default value will be TRUE for each eligibility.
  **/
  private VoucherEligibilities voucherEligibilities = null;
 /**
   * The category under which the voucher is applying
   * @return category
  **/
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public VoucherPostRequest category(String category) {
    this.category = category;
    return this;
  }

 /**
   * A more detailed description on the category of the voucher
   * @return subCategory
  **/
  @JsonProperty("subCategory")
  public String getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(String subCategory) {
    this.subCategory = subCategory;
  }

  public VoucherPostRequest subCategory(String subCategory) {
    this.subCategory = subCategory;
    return this;
  }

 /**
   * A code associated to the voucher. After the voucher creation, this code will be needed for all actions on it (retrieve, usage...). Without verificationCode, the voucher will accessible to anyone who has its id.
   * @return verificationCode
  **/
  @JsonProperty("verificationCode")
  public String getVerificationCode() {
    return verificationCode;
  }

  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }

  public VoucherPostRequest verificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
    return this;
  }

 /**
   * The payment method to use for the voucher creation. A payment request contains: - the payment method to use for the payment - the amount and currency to be paid using that method Today, only credit cards and invoices are supported. 
   * @return paymentRequests
  **/
  @JsonProperty("paymentRequests")
  public VoucherPaymentRequest getPaymentRequests() {
    return paymentRequests;
  }

  public void setPaymentRequests(VoucherPaymentRequest paymentRequests) {
    this.paymentRequests = paymentRequests;
  }

  public VoucherPostRequest paymentRequests(VoucherPaymentRequest paymentRequests) {
    this.paymentRequests = paymentRequests;
    return this;
  }

 /**
   * What is the voucher is eligible for. If not provided, the default value will be TRUE for each eligibility.
   * @return voucherEligibilities
  **/
  @JsonProperty("voucherEligibilities")
  public VoucherEligibilities getVoucherEligibilities() {
    return voucherEligibilities;
  }

  public void setVoucherEligibilities(VoucherEligibilities voucherEligibilities) {
    this.voucherEligibilities = voucherEligibilities;
  }

  public VoucherPostRequest voucherEligibilities(VoucherEligibilities voucherEligibilities) {
    this.voucherEligibilities = voucherEligibilities;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherPostRequest {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
    sb.append("    paymentRequests: ").append(toIndentedString(paymentRequests)).append("\n");
    sb.append("    voucherEligibilities: ").append(toIndentedString(voucherEligibilities)).append("\n");
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

