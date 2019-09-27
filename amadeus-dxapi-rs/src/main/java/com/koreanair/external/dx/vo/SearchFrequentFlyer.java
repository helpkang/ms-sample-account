package com.koreanair.external.dx.vo;

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
  * Frequent flyer card information required for seatMap request
 **/
@ApiModel(description="Frequent flyer card information required for seatMap request")
public class SearchFrequentFlyer  {
  
  @ApiModelProperty(example = "6X", required = true, value = "Code of the company emitting the card")
 /**
   * Code of the company emitting the card
  **/
  private String companyCode = null;

  @ApiModelProperty(example = "992003172079000", required = true, value = "Card number")
 /**
   * Card number
  **/
  private String cardNumber = null;
 /**
   * Code of the company emitting the card
   * @return companyCode
  **/
  @JsonProperty("companyCode")
  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public SearchFrequentFlyer companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

 /**
   * Card number
   * @return cardNumber
  **/
  @JsonProperty("cardNumber")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public SearchFrequentFlyer cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchFrequentFlyer {\n");
    
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

