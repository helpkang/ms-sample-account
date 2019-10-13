package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.PaymentCurrencyConversionProposal;
import com.koreanair.external.dx.vo.PaymentMethod;
import com.koreanair.external.dx.vo.ValidatePaymentWithAssociationRequest;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

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
  * Summary of the split payment, the remaining amount to pay (not covered by the split payment selection) and the list of available payment methods combinable with the ones selected in splitPaymentMethods. In case no payment was entered in splitPaymentMethods, only the list of all available payment methods will be returned.
 **/
@ApiModel(description="Summary of the split payment, the remaining amount to pay (not covered by the split payment selection) and the list of available payment methods combinable with the ones selected in splitPaymentMethods. In case no payment was entered in splitPaymentMethods, only the list of all available payment methods will be returned.")
public class ValidatePaymentMethods  {
  
  @ApiModelProperty(value = "A list of payment request. Each payment request contains a payment method, and the amount to be paid using that method. For example, to pay using both monetary currency and miles, the payment is split into a partial payment for the miles amount and a second partial payment is used to represent the amount to be paid using Credit card. If you decide to benefit from validation of the amounts, amounts need to be provided for each payment request. There is one case in which the payment request returned will not contain  payment method field: When the flights in the Order are ticketed, but there  are some chargeable seats or services remaining to be paid, and the endpoint  is called to retrieve the list of available payment methods. Then the payment  request will contain the association of the remaining seats and services to be  paid, and the amount.          ")
 /**
   * A list of payment request. Each payment request contains a payment method, and the amount to be paid using that method. For example, to pay using both monetary currency and miles, the payment is split into a partial payment for the miles amount and a second partial payment is used to represent the amount to be paid using Credit card. If you decide to benefit from validation of the amounts, amounts need to be provided for each payment request. There is one case in which the payment request returned will not contain  payment method field: When the flights in the Order are ticketed, but there  are some chargeable seats or services remaining to be paid, and the endpoint  is called to retrieve the list of available payment methods. Then the payment  request will contain the association of the remaining seats and services to be  paid, and the amount.          
  **/
  private List<ValidatePaymentWithAssociationRequest> paymentRequests = null;

  @ApiModelProperty(value = "Remaining amount due to pay")
 /**
   * Remaining amount due to pay
  **/
  private Amount remainingAmount = null;

  @ApiModelProperty(value = "A list of available payment methods.")
 /**
   * A list of available payment methods.
  **/
  private List<PaymentMethod> availablePaymentMethods = null;

  @ApiModelProperty(value = "List of the currency conversion proposals available for the payment requests to be validated. ")
 /**
   * List of the currency conversion proposals available for the payment requests to be validated. 
  **/
  private List<PaymentCurrencyConversionProposal> currencyConversionProposals = null;
 /**
   * A list of payment request. Each payment request contains a payment method, and the amount to be paid using that method. For example, to pay using both monetary currency and miles, the payment is split into a partial payment for the miles amount and a second partial payment is used to represent the amount to be paid using Credit card. If you decide to benefit from validation of the amounts, amounts need to be provided for each payment request. There is one case in which the payment request returned will not contain  payment method field: When the flights in the Order are ticketed, but there  are some chargeable seats or services remaining to be paid, and the endpoint  is called to retrieve the list of available payment methods. Then the payment  request will contain the association of the remaining seats and services to be  paid, and the amount.          
   * @return paymentRequests
  **/
  @JsonProperty("paymentRequests")
  public List<ValidatePaymentWithAssociationRequest> getPaymentRequests() {
    return paymentRequests;
  }

  public void setPaymentRequests(List<ValidatePaymentWithAssociationRequest> paymentRequests) {
    this.paymentRequests = paymentRequests;
  }

  public ValidatePaymentMethods paymentRequests(List<ValidatePaymentWithAssociationRequest> paymentRequests) {
    this.paymentRequests = paymentRequests;
    return this;
  }

  public ValidatePaymentMethods addPaymentRequestsItem(ValidatePaymentWithAssociationRequest paymentRequestsItem) {
    this.paymentRequests.add(paymentRequestsItem);
    return this;
  }

 /**
   * Remaining amount due to pay
   * @return remainingAmount
  **/
  @JsonProperty("remainingAmount")
  public Amount getRemainingAmount() {
    return remainingAmount;
  }

  public void setRemainingAmount(Amount remainingAmount) {
    this.remainingAmount = remainingAmount;
  }

  public ValidatePaymentMethods remainingAmount(Amount remainingAmount) {
    this.remainingAmount = remainingAmount;
    return this;
  }

 /**
   * A list of available payment methods.
   * @return availablePaymentMethods
  **/
  @JsonProperty("availablePaymentMethods")
  public List<PaymentMethod> getAvailablePaymentMethods() {
    return availablePaymentMethods;
  }

  public void setAvailablePaymentMethods(List<PaymentMethod> availablePaymentMethods) {
    this.availablePaymentMethods = availablePaymentMethods;
  }

  public ValidatePaymentMethods availablePaymentMethods(List<PaymentMethod> availablePaymentMethods) {
    this.availablePaymentMethods = availablePaymentMethods;
    return this;
  }

  public ValidatePaymentMethods addAvailablePaymentMethodsItem(PaymentMethod availablePaymentMethodsItem) {
    this.availablePaymentMethods.add(availablePaymentMethodsItem);
    return this;
  }

 /**
   * List of the currency conversion proposals available for the payment requests to be validated. 
   * @return currencyConversionProposals
  **/
  @JsonProperty("currencyConversionProposals")
  public List<PaymentCurrencyConversionProposal> getCurrencyConversionProposals() {
    return currencyConversionProposals;
  }

  public void setCurrencyConversionProposals(List<PaymentCurrencyConversionProposal> currencyConversionProposals) {
    this.currencyConversionProposals = currencyConversionProposals;
  }

  public ValidatePaymentMethods currencyConversionProposals(List<PaymentCurrencyConversionProposal> currencyConversionProposals) {
    this.currencyConversionProposals = currencyConversionProposals;
    return this;
  }

  public ValidatePaymentMethods addCurrencyConversionProposalsItem(PaymentCurrencyConversionProposal currencyConversionProposalsItem) {
    this.currencyConversionProposals.add(currencyConversionProposalsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatePaymentMethods {\n");
    
    sb.append("    paymentRequests: ").append(toIndentedString(paymentRequests)).append("\n");
    sb.append("    remainingAmount: ").append(toIndentedString(remainingAmount)).append("\n");
    sb.append("    availablePaymentMethods: ").append(toIndentedString(availablePaymentMethods)).append("\n");
    sb.append("    currencyConversionProposals: ").append(toIndentedString(currencyConversionProposals)).append("\n");
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

