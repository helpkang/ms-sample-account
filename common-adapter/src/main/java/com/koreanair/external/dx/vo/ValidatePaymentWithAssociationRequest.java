package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.OptionalPaymentRequest;
import com.koreanair.external.dx.vo.PayerIdentification;
import com.koreanair.external.dx.vo.PaymentAuthorizationInput;
import com.koreanair.external.dx.vo.PaymentMethod;
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
  * A validate payment request contains: - the payment method to use for the payment - the amount and currency to be paid using that method - the items to be covered by this payment request The items to be covered by the payment request is optional. Several options are available for the API user: - The API user can provide a specific payment request for seat and services, by providing their ids. - If this is not provided, the payment request will be used to cover any items in the order Note that the payment of a specific seat and/or services should cover its full amount i.e. payment of 1 single service with multiple services is not supported. Supported payment methods are: MilesPayment, PaymentCard,  ExternalPayment or AlternativePaymentMethod. 
 **/
@ApiModel(description="A validate payment request contains: - the payment method to use for the payment - the amount and currency to be paid using that method - the items to be covered by this payment request The items to be covered by the payment request is optional. Several options are available for the API user: - The API user can provide a specific payment request for seat and services, by providing their ids. - If this is not provided, the payment request will be used to cover any items in the order Note that the payment of a specific seat and/or services should cover its full amount i.e. payment of 1 single service with multiple services is not supported. Supported payment methods are: MilesPayment, PaymentCard,  ExternalPayment or AlternativePaymentMethod. ")
public class ValidatePaymentWithAssociationRequest  {
  
  @ApiModelProperty(value = "PaymentMethod used for this part of the payment")
 /**
   * PaymentMethod used for this part of the payment
  **/
  private PaymentMethod paymentMethod = null;

  @ApiModelProperty(value = "Amount to be paid for this part of the payment")
 /**
   * Amount to be paid for this part of the payment
  **/
  private Amount amount = null;

  @ApiModelProperty(value = "A list of Services to be paid")
 /**
   * A list of Services to be paid
  **/
  private List<String> serviceItemIds = null;

  @ApiModelProperty(value = "A list of Seats to be paid")
 /**
   * A list of Seats to be paid
  **/
  private List<String> seatItemIds = null;

  @ApiModelProperty(value = "ID of the currency conversion Proposal to be used for the payment")
 /**
   * ID of the currency conversion Proposal to be used for the payment
  **/
  private List<String> currencyConversionProposalIds = null;

  @ApiModelProperty(value = "Authorization information to be sent in input for redirection flows")
 /**
   * Authorization information to be sent in input for redirection flows
  **/
  private PaymentAuthorizationInput authorization = null;

  @ApiModelProperty(value = "Payer data to enable fraud detection")
 /**
   * Payer data to enable fraud detection
  **/
  private PayerIdentification payerIdentification = null;

  @ApiModelProperty(value = "List of travelers associated to this payment request. To split payment by traveler, the given payment method will be used to pay for all flights, seats and services of the given traveler.")
 /**
   * List of travelers associated to this payment request. To split payment by traveler, the given payment method will be used to pay for all flights, seats and services of the given traveler.
  **/
  private List<String> travelerIds = null;
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

  public ValidatePaymentWithAssociationRequest paymentMethod(PaymentMethod paymentMethod) {
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

  public ValidatePaymentWithAssociationRequest amount(Amount amount) {
    this.amount = amount;
    return this;
  }

 /**
   * A list of Services to be paid
   * @return serviceItemIds
  **/
  @JsonProperty("serviceItemIds")
  public List<String> getServiceItemIds() {
    return serviceItemIds;
  }

  public void setServiceItemIds(List<String> serviceItemIds) {
    this.serviceItemIds = serviceItemIds;
  }

  public ValidatePaymentWithAssociationRequest serviceItemIds(List<String> serviceItemIds) {
    this.serviceItemIds = serviceItemIds;
    return this;
  }

  public ValidatePaymentWithAssociationRequest addServiceItemIdsItem(String serviceItemIdsItem) {
    this.serviceItemIds.add(serviceItemIdsItem);
    return this;
  }

 /**
   * A list of Seats to be paid
   * @return seatItemIds
  **/
  @JsonProperty("seatItemIds")
  public List<String> getSeatItemIds() {
    return seatItemIds;
  }

  public void setSeatItemIds(List<String> seatItemIds) {
    this.seatItemIds = seatItemIds;
  }

  public ValidatePaymentWithAssociationRequest seatItemIds(List<String> seatItemIds) {
    this.seatItemIds = seatItemIds;
    return this;
  }

  public ValidatePaymentWithAssociationRequest addSeatItemIdsItem(String seatItemIdsItem) {
    this.seatItemIds.add(seatItemIdsItem);
    return this;
  }

 /**
   * ID of the currency conversion Proposal to be used for the payment
   * @return currencyConversionProposalIds
  **/
  @JsonProperty("currencyConversionProposalIds")
  public List<String> getCurrencyConversionProposalIds() {
    return currencyConversionProposalIds;
  }

  public void setCurrencyConversionProposalIds(List<String> currencyConversionProposalIds) {
    this.currencyConversionProposalIds = currencyConversionProposalIds;
  }

  public ValidatePaymentWithAssociationRequest currencyConversionProposalIds(List<String> currencyConversionProposalIds) {
    this.currencyConversionProposalIds = currencyConversionProposalIds;
    return this;
  }

  public ValidatePaymentWithAssociationRequest addCurrencyConversionProposalIdsItem(String currencyConversionProposalIdsItem) {
    this.currencyConversionProposalIds.add(currencyConversionProposalIdsItem);
    return this;
  }

 /**
   * Authorization information to be sent in input for redirection flows
   * @return authorization
  **/
  @JsonProperty("authorization")
  public PaymentAuthorizationInput getAuthorization() {
    return authorization;
  }

  public void setAuthorization(PaymentAuthorizationInput authorization) {
    this.authorization = authorization;
  }

  public ValidatePaymentWithAssociationRequest authorization(PaymentAuthorizationInput authorization) {
    this.authorization = authorization;
    return this;
  }

 /**
   * Payer data to enable fraud detection
   * @return payerIdentification
  **/
  @JsonProperty("payerIdentification")
  public PayerIdentification getPayerIdentification() {
    return payerIdentification;
  }

  public void setPayerIdentification(PayerIdentification payerIdentification) {
    this.payerIdentification = payerIdentification;
  }

  public ValidatePaymentWithAssociationRequest payerIdentification(PayerIdentification payerIdentification) {
    this.payerIdentification = payerIdentification;
    return this;
  }

 /**
   * List of travelers associated to this payment request. To split payment by traveler, the given payment method will be used to pay for all flights, seats and services of the given traveler.
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public ValidatePaymentWithAssociationRequest travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public ValidatePaymentWithAssociationRequest addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatePaymentWithAssociationRequest {\n");
    
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    serviceItemIds: ").append(toIndentedString(serviceItemIds)).append("\n");
    sb.append("    seatItemIds: ").append(toIndentedString(seatItemIds)).append("\n");
    sb.append("    currencyConversionProposalIds: ").append(toIndentedString(currencyConversionProposalIds)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    payerIdentification: ").append(toIndentedString(payerIdentification)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
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

