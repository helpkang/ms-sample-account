package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.PaymentMethod;
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
  * Frequent Flyer Card information to be used to redeem miles. The information can be provided in 2 ways.  1) The card can be referenced from the cart using frequentFlyerCardId.  2) The information can be provided directly, by filling companyCode and cardNumber. Only one of these 2 ways can be chosen, they cannot be combined. 
 **/
@ApiModel(description="Frequent Flyer Card information to be used to redeem miles. The information can be provided in 2 ways.  1) The card can be referenced from the cart using frequentFlyerCardId.  2) The information can be provided directly, by filling companyCode and cardNumber. Only one of these 2 ways can be chosen, they cannot be combined. ")
public class MilesPayment extends PaymentMethod {
  
  @ApiModelProperty(example = "12#25", value = "Identifier of the selected Miles and Cash split from GET /payment-methods/miles-payment. ")
 /**
   * Identifier of the selected Miles and Cash split from GET /payment-methods/miles-payment. 
  **/
  private String milesPaymentSplitId = null;

  @ApiModelProperty(value = "Identifier of a frequent flyer card stored in the cart. When using this identifier, no other frequent flyer card data is needed. ")
 /**
   * Identifier of a frequent flyer card stored in the cart. When using this identifier, no other frequent flyer card data is needed. 
  **/
  private String frequentFlyerCardId = null;

  @ApiModelProperty(example = "6X", value = "Code of the company emitting the card. This property (and cardNumber) is mandatory when frequent flyer card data is added directly. It should not be present when a frequent flyer card is used from the cart. ")
 /**
   * Code of the company emitting the card. This property (and cardNumber) is mandatory when frequent flyer card data is added directly. It should not be present when a frequent flyer card is used from the cart. 
  **/
  private String companyCode = null;

  @ApiModelProperty(example = "992003172079000", value = "Card number This property (and companyCode) is mandatory when frequent flyer card data is added directly. It should not be present when a frequent flyer card is used from the cart. ")
 /**
   * Card number This property (and companyCode) is mandatory when frequent flyer card data is added directly. It should not be present when a frequent flyer card is used from the cart. 
  **/
  private String cardNumber = null;
 /**
   * Identifier of the selected Miles and Cash split from GET /payment-methods/miles-payment. 
   * @return milesPaymentSplitId
  **/
  @JsonProperty("milesPaymentSplitId")
  public String getMilesPaymentSplitId() {
    return milesPaymentSplitId;
  }

  public void setMilesPaymentSplitId(String milesPaymentSplitId) {
    this.milesPaymentSplitId = milesPaymentSplitId;
  }

  public MilesPayment milesPaymentSplitId(String milesPaymentSplitId) {
    this.milesPaymentSplitId = milesPaymentSplitId;
    return this;
  }

 /**
   * Identifier of a frequent flyer card stored in the cart. When using this identifier, no other frequent flyer card data is needed. 
   * @return frequentFlyerCardId
  **/
  @JsonProperty("frequentFlyerCardId")
  public String getFrequentFlyerCardId() {
    return frequentFlyerCardId;
  }

  public void setFrequentFlyerCardId(String frequentFlyerCardId) {
    this.frequentFlyerCardId = frequentFlyerCardId;
  }

  public MilesPayment frequentFlyerCardId(String frequentFlyerCardId) {
    this.frequentFlyerCardId = frequentFlyerCardId;
    return this;
  }

 /**
   * Code of the company emitting the card. This property (and cardNumber) is mandatory when frequent flyer card data is added directly. It should not be present when a frequent flyer card is used from the cart. 
   * @return companyCode
  **/
  @JsonProperty("companyCode")
  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public MilesPayment companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

 /**
   * Card number This property (and companyCode) is mandatory when frequent flyer card data is added directly. It should not be present when a frequent flyer card is used from the cart. 
   * @return cardNumber
  **/
  @JsonProperty("cardNumber")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public MilesPayment cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MilesPayment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    milesPaymentSplitId: ").append(toIndentedString(milesPaymentSplitId)).append("\n");
    sb.append("    frequentFlyerCardId: ").append(toIndentedString(frequentFlyerCardId)).append("\n");
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
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

