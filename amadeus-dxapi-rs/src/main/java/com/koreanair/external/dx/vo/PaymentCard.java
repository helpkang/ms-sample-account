package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Fee;
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
  * Card information supporting standard Credit/Debit cards and tokenized versions. 
 **/
@ApiModel(description="Card information supporting standard Credit/Debit cards and tokenized versions. ")
public class PaymentCard extends PaymentMethod {
  
  @ApiModelProperty(value = "Card type, e.g. VI for visa, CA for mastercard, AX for amex.")
 /**
   * Card type, e.g. VI for visa, CA for mastercard, AX for amex.
  **/
  private String vendorCode = null;

  @ApiModelProperty(value = "")
  private String cardNumber = null;

  @ApiModelProperty(value = "Credit card expiry date, e.g. 0237 for February 2037")
 /**
   * Credit card expiry date, e.g. 0237 for February 2037
  **/
  private String expiryDate = null;

  @ApiModelProperty(value = "")
  private String holderName = null;

  @ApiModelProperty(value = "Card Verification Value number, as indicated on the card. Only for query (not returned in replies)")
 /**
   * Card Verification Value number, as indicated on the card. Only for query (not returned in replies)
  **/
  private String cvv = null;

  @ApiModelProperty(value = "Fees that will apply to the payment card if the user proceeds with the payment. The information regarding fees is only available when calling the entry points: POST payment-methods. ")
 /**
   * Fees that will apply to the payment card if the user proceeds with the payment. The information regarding fees is only available when calling the entry points: POST payment-methods. 
  **/
  private List<Fee> fees = null;
 /**
   * Card type, e.g. VI for visa, CA for mastercard, AX for amex.
   * @return vendorCode
  **/
  @JsonProperty("vendorCode")
  public String getVendorCode() {
    return vendorCode;
  }

  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }

  public PaymentCard vendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
    return this;
  }

 /**
   * Get cardNumber
   * @return cardNumber
  **/
  @JsonProperty("cardNumber")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public PaymentCard cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

 /**
   * Credit card expiry date, e.g. 0237 for February 2037
   * @return expiryDate
  **/
  @JsonProperty("expiryDate")
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public PaymentCard expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

 /**
   * Get holderName
   * @return holderName
  **/
  @JsonProperty("holderName")
  public String getHolderName() {
    return holderName;
  }

  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }

  public PaymentCard holderName(String holderName) {
    this.holderName = holderName;
    return this;
  }

 /**
   * Card Verification Value number, as indicated on the card. Only for query (not returned in replies)
   * @return cvv
  **/
  @JsonProperty("cvv")
  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  public PaymentCard cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }

 /**
   * Fees that will apply to the payment card if the user proceeds with the payment. The information regarding fees is only available when calling the entry points: POST payment-methods. 
   * @return fees
  **/
  @JsonProperty("fees")
  public List<Fee> getFees() {
    return fees;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCard {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vendorCode: ").append(toIndentedString(vendorCode)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
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

