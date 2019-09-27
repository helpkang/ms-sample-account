package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.PaymentWithAssociationRequest;
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
  * Request to validate and combine one or several payment methods before proceeding with the payment process.
 **/
@ApiModel(description="Request to validate and combine one or several payment methods before proceeding with the payment process.")
public class ValidatePaymentMethodsRequest  {
  
  @ApiModelProperty(value = "")
  private String orderId = null;

  @ApiModelProperty(value = "If true, when available for the selected payment method (i.e. PayementCard, ExternalPayment), alternative currency proposals are computed and returned for each payment request. ")
 /**
   * If true, when available for the selected payment method (i.e. PayementCard, ExternalPayment), alternative currency proposals are computed and returned for each payment request. 
  **/
  private Boolean showCurrencyConversionProposals = null;

  @ApiModelProperty(value = "A list of payment request. Each payment request contains a payment method, and the amount to be paid using that method. For example, to pay using both monetary currency and miles, the payment is split into a partial payment for the miles amount and a second partial payment is used to represent the amount to be paid using Credit card. If you decide to benefit from validation of the amounts, amounts need to be provided for each payment request. ")
 /**
   * A list of payment request. Each payment request contains a payment method, and the amount to be paid using that method. For example, to pay using both monetary currency and miles, the payment is split into a partial payment for the miles amount and a second partial payment is used to represent the amount to be paid using Credit card. If you decide to benefit from validation of the amounts, amounts need to be provided for each payment request. 
  **/
  private List<PaymentWithAssociationRequest> paymentRequests = null;
 /**
   * Get orderId
   * @return orderId
  **/
  @JsonProperty("orderId")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public ValidatePaymentMethodsRequest orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * If true, when available for the selected payment method (i.e. PayementCard, ExternalPayment), alternative currency proposals are computed and returned for each payment request. 
   * @return showCurrencyConversionProposals
  **/
  @JsonProperty("showCurrencyConversionProposals")
  public Boolean isShowCurrencyConversionProposals() {
    return showCurrencyConversionProposals;
  }

  public void setShowCurrencyConversionProposals(Boolean showCurrencyConversionProposals) {
    this.showCurrencyConversionProposals = showCurrencyConversionProposals;
  }

  public ValidatePaymentMethodsRequest showCurrencyConversionProposals(Boolean showCurrencyConversionProposals) {
    this.showCurrencyConversionProposals = showCurrencyConversionProposals;
    return this;
  }

 /**
   * A list of payment request. Each payment request contains a payment method, and the amount to be paid using that method. For example, to pay using both monetary currency and miles, the payment is split into a partial payment for the miles amount and a second partial payment is used to represent the amount to be paid using Credit card. If you decide to benefit from validation of the amounts, amounts need to be provided for each payment request. 
   * @return paymentRequests
  **/
  @JsonProperty("paymentRequests")
  public List<PaymentWithAssociationRequest> getPaymentRequests() {
    return paymentRequests;
  }

  public void setPaymentRequests(List<PaymentWithAssociationRequest> paymentRequests) {
    this.paymentRequests = paymentRequests;
  }

  public ValidatePaymentMethodsRequest paymentRequests(List<PaymentWithAssociationRequest> paymentRequests) {
    this.paymentRequests = paymentRequests;
    return this;
  }

  public ValidatePaymentMethodsRequest addPaymentRequestsItem(PaymentWithAssociationRequest paymentRequestsItem) {
    this.paymentRequests.add(paymentRequestsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatePaymentMethodsRequest {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    showCurrencyConversionProposals: ").append(toIndentedString(showCurrencyConversionProposals)).append("\n");
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

