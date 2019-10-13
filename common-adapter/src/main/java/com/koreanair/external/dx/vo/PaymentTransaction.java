package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.AsynchronousPaymentData;
import com.koreanair.external.dx.vo.InstallmentPlanData;
import com.koreanair.external.dx.vo.PaymentAuthorization;
import com.koreanair.external.dx.vo.PaymentCurrencyConversionProposal;
import com.koreanair.external.dx.vo.PaymentMethod;
import com.koreanair.external.dx.vo.PaymentRequest;
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
  * Form of Payment used to pay flights and / or services
 **/
@ApiModel(description="Form of Payment used to pay flights and / or services")
public class PaymentTransaction  {
  
  @ApiModelProperty(required = true, value = "PaymentMethod used for this part of the payment")
 /**
   * PaymentMethod used for this part of the payment
  **/
  private PaymentMethod paymentMethod = null;

  @ApiModelProperty(value = "Amount to be paid for this part of the payment")
 /**
   * Amount to be paid for this part of the payment
  **/
  private Amount amount = null;

  @ApiModelProperty(value = "")
  private PaymentAuthorization authorization = null;

  @ApiModelProperty(value = "Details of the selected currency conversion proposal used for the payment transaction")
 /**
   * Details of the selected currency conversion proposal used for the payment transaction
  **/
  private PaymentCurrencyConversionProposal selectedCurrencyConversionProposal = null;

  @ApiModelProperty(value = "Only available for asynchronous AlternativePaymentMethod. Indicates the necessary asynchronous payment information:  - Reference id of the asynchronous payment transaction - Http request to target the Payment Service Provider (PSP) ")
 /**
   * Only available for asynchronous AlternativePaymentMethod. Indicates the necessary asynchronous payment information:  - Reference id of the asynchronous payment transaction - Http request to target the Payment Service Provider (PSP) 
  **/
  private AsynchronousPaymentData asynchronousPaymentData = null;

  @ApiModelProperty(value = "Indicates the details of the payment using installments:  - Number of installments - Amount and currency for the first and following installments - Amount and currency of the interest Only available for PaymentCard. ")
 /**
   * Indicates the details of the payment using installments:  - Number of installments - Amount and currency for the first and following installments - Amount and currency of the interest Only available for PaymentCard. 
  **/
  private InstallmentPlanData installmentPlan = null;
 /**
   * PaymentMethod used for this part of the payment
   * @return paymentMethod
  **/
  @JsonProperty("paymentMethod")
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentTransaction paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

 /**
   * Amount to be paid for this part of the payment
   * @return amount
  **/
  @JsonProperty("amount")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public PaymentTransaction amount(Amount amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Get authorization
   * @return authorization
  **/
  @JsonProperty("authorization")
  public PaymentAuthorization getAuthorization() {
    return authorization;
  }

  public void setAuthorization(PaymentAuthorization authorization) {
    this.authorization = authorization;
  }

  public PaymentTransaction authorization(PaymentAuthorization authorization) {
    this.authorization = authorization;
    return this;
  }

 /**
   * Details of the selected currency conversion proposal used for the payment transaction
   * @return selectedCurrencyConversionProposal
  **/
  @JsonProperty("selectedCurrencyConversionProposal")
  public PaymentCurrencyConversionProposal getSelectedCurrencyConversionProposal() {
    return selectedCurrencyConversionProposal;
  }

  public void setSelectedCurrencyConversionProposal(PaymentCurrencyConversionProposal selectedCurrencyConversionProposal) {
    this.selectedCurrencyConversionProposal = selectedCurrencyConversionProposal;
  }

  public PaymentTransaction selectedCurrencyConversionProposal(PaymentCurrencyConversionProposal selectedCurrencyConversionProposal) {
    this.selectedCurrencyConversionProposal = selectedCurrencyConversionProposal;
    return this;
  }

 /**
   * Only available for asynchronous AlternativePaymentMethod. Indicates the necessary asynchronous payment information:  - Reference id of the asynchronous payment transaction - Http request to target the Payment Service Provider (PSP) 
   * @return asynchronousPaymentData
  **/
  @JsonProperty("asynchronousPaymentData")
  public AsynchronousPaymentData getAsynchronousPaymentData() {
    return asynchronousPaymentData;
  }

  public void setAsynchronousPaymentData(AsynchronousPaymentData asynchronousPaymentData) {
    this.asynchronousPaymentData = asynchronousPaymentData;
  }

  public PaymentTransaction asynchronousPaymentData(AsynchronousPaymentData asynchronousPaymentData) {
    this.asynchronousPaymentData = asynchronousPaymentData;
    return this;
  }

 /**
   * Indicates the details of the payment using installments:  - Number of installments - Amount and currency for the first and following installments - Amount and currency of the interest Only available for PaymentCard. 
   * @return installmentPlan
  **/
  @JsonProperty("installmentPlan")
  public InstallmentPlanData getInstallmentPlan() {
    return installmentPlan;
  }

  public void setInstallmentPlan(InstallmentPlanData installmentPlan) {
    this.installmentPlan = installmentPlan;
  }

  public PaymentTransaction installmentPlan(InstallmentPlanData installmentPlan) {
    this.installmentPlan = installmentPlan;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransaction {\n");
    
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    selectedCurrencyConversionProposal: ").append(toIndentedString(selectedCurrencyConversionProposal)).append("\n");
    sb.append("    asynchronousPaymentData: ").append(toIndentedString(asynchronousPaymentData)).append("\n");
    sb.append("    installmentPlan: ").append(toIndentedString(installmentPlan)).append("\n");
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

