package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.PaymentCard;
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
  * Request to get dynamic currency conversion Proposals.
 **/
@ApiModel(description="Request to get dynamic currency conversion Proposals.")
public class PaymentCurrencyConversionProposalListRequest  {
  
  @ApiModelProperty(value = "Card number to use for having DCC Proposals. The currency returned is the one associated to the credit card.  If not provided, only MCP Proposals can be provided.")
 /**
   * Card number to use for having DCC Proposals. The currency returned is the one associated to the credit card.  If not provided, only MCP Proposals can be provided.
  **/
  private PaymentCard paymentCard = null;

  @ApiModelProperty(value = "Amount to be converted. The amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2.")
 /**
   * Amount to be converted. The amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2.
  **/
  private Amount monetaryAmount = null;
 /**
   * Card number to use for having DCC Proposals. The currency returned is the one associated to the credit card.  If not provided, only MCP Proposals can be provided.
   * @return paymentCard
  **/
  @JsonProperty("paymentCard")
  public PaymentCard getPaymentCard() {
    return paymentCard;
  }

  public void setPaymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
  }

  public PaymentCurrencyConversionProposalListRequest paymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
    return this;
  }

 /**
   * Amount to be converted. The amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \&quot;EUR 100.85\&quot; will be represented as &#x60;10085&#x60;, with the currency &#x60;decimalPlaces&#x60; &#x3D; 2.
   * @return monetaryAmount
  **/
  @JsonProperty("monetaryAmount")
  public Amount getMonetaryAmount() {
    return monetaryAmount;
  }

  public void setMonetaryAmount(Amount monetaryAmount) {
    this.monetaryAmount = monetaryAmount;
  }

  public PaymentCurrencyConversionProposalListRequest monetaryAmount(Amount monetaryAmount) {
    this.monetaryAmount = monetaryAmount;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCurrencyConversionProposalListRequest {\n");
    
    sb.append("    paymentCard: ").append(toIndentedString(paymentCard)).append("\n");
    sb.append("    monetaryAmount: ").append(toIndentedString(monetaryAmount)).append("\n");
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

