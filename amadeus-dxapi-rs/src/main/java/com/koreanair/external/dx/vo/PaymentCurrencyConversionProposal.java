package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.PaymentCurrencyConversionProposalAmount;
import com.koreanair.external.dx.vo.PaymentCurrencyConversionProposalMerchantProvider;
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
  * Contain all the information for monetary conversion
 **/
@ApiModel(description="Contain all the information for monetary conversion")
public class PaymentCurrencyConversionProposal  {
  
  @ApiModelProperty(required = true, value = "Conversion Proposal id")
 /**
   * Conversion Proposal id
  **/
  private String paymentCurrencyConversionProposalId = null;

  @ApiModelProperty(value = "")
  private PaymentCurrencyConversionProposalAmount conversionDetails = null;

  @ApiModelProperty(value = "")
  private PaymentCurrencyConversionProposalMerchantProvider merchantProvider = null;

  @ApiModelProperty(value = "Represents the validity date and time of the proposal in ISO8601[https://www.w3.org/TR/NOTE-datetime]. Example: 2010-08-14T13:00:00 ")
 /**
   * Represents the validity date and time of the proposal in ISO8601[https://www.w3.org/TR/NOTE-datetime]. Example: 2010-08-14T13:00:00 
  **/
  private LocalDateTime expirationDateTime = null;

  @ApiModelProperty(value = "Applicable margin percentage of the proposal applied by the provider (e.g. 3.5 = 3.5%)")
 /**
   * Applicable margin percentage of the proposal applied by the provider (e.g. 3.5 = 3.5%)
  **/
  private Float marginPercentage = null;
 /**
   * Conversion Proposal id
   * @return paymentCurrencyConversionProposalId
  **/
  @JsonProperty("paymentCurrencyConversionProposalId")
  public String getPaymentCurrencyConversionProposalId() {
    return paymentCurrencyConversionProposalId;
  }

  public void setPaymentCurrencyConversionProposalId(String paymentCurrencyConversionProposalId) {
    this.paymentCurrencyConversionProposalId = paymentCurrencyConversionProposalId;
  }

  public PaymentCurrencyConversionProposal paymentCurrencyConversionProposalId(String paymentCurrencyConversionProposalId) {
    this.paymentCurrencyConversionProposalId = paymentCurrencyConversionProposalId;
    return this;
  }

 /**
   * Get conversionDetails
   * @return conversionDetails
  **/
  @JsonProperty("conversionDetails")
  public PaymentCurrencyConversionProposalAmount getConversionDetails() {
    return conversionDetails;
  }

  public void setConversionDetails(PaymentCurrencyConversionProposalAmount conversionDetails) {
    this.conversionDetails = conversionDetails;
  }

  public PaymentCurrencyConversionProposal conversionDetails(PaymentCurrencyConversionProposalAmount conversionDetails) {
    this.conversionDetails = conversionDetails;
    return this;
  }

 /**
   * Get merchantProvider
   * @return merchantProvider
  **/
  @JsonProperty("merchantProvider")
  public PaymentCurrencyConversionProposalMerchantProvider getMerchantProvider() {
    return merchantProvider;
  }

  public void setMerchantProvider(PaymentCurrencyConversionProposalMerchantProvider merchantProvider) {
    this.merchantProvider = merchantProvider;
  }

  public PaymentCurrencyConversionProposal merchantProvider(PaymentCurrencyConversionProposalMerchantProvider merchantProvider) {
    this.merchantProvider = merchantProvider;
    return this;
  }

 /**
   * Represents the validity date and time of the proposal in ISO8601[https://www.w3.org/TR/NOTE-datetime]. Example: 2010-08-14T13:00:00 
   * @return expirationDateTime
  **/
  @JsonProperty("expirationDateTime")
  public LocalDateTime getExpirationDateTime() {
    return expirationDateTime;
  }

  public void setExpirationDateTime(LocalDateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  public PaymentCurrencyConversionProposal expirationDateTime(LocalDateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

 /**
   * Applicable margin percentage of the proposal applied by the provider (e.g. 3.5 &#x3D; 3.5%)
   * minimum: 0
   * maximum: 100
   * @return marginPercentage
  **/
  @JsonProperty("marginPercentage")
  public Float getMarginPercentage() {
    return marginPercentage;
  }

  public void setMarginPercentage(Float marginPercentage) {
    this.marginPercentage = marginPercentage;
  }

  public PaymentCurrencyConversionProposal marginPercentage(Float marginPercentage) {
    this.marginPercentage = marginPercentage;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCurrencyConversionProposal {\n");
    
    sb.append("    paymentCurrencyConversionProposalId: ").append(toIndentedString(paymentCurrencyConversionProposalId)).append("\n");
    sb.append("    conversionDetails: ").append(toIndentedString(conversionDetails)).append("\n");
    sb.append("    merchantProvider: ").append(toIndentedString(merchantProvider)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    marginPercentage: ").append(toIndentedString(marginPercentage)).append("\n");
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

