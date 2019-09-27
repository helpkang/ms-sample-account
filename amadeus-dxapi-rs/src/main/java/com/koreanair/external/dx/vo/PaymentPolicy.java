package com.koreanair.external.dx.vo;

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
  * Accepted payment methods, several type of form of payment are possible for a guarantee
 **/
@ApiModel(description="Accepted payment methods, several type of form of payment are possible for a guarantee")
public class PaymentPolicy  {
  
  @ApiModelProperty(value = "")
  private List<String> creditCards = null;

  @ApiModelProperty(value = "The payment method (CREDIT_CARD, TRAVEL_AGENT_ID, CORPORATE_ID, CHECK, HOTEL_GUEST_ID, MISC_CHARGE_ORDER, ADVANCE_DEPOSIT, COMPANY_ADDRESS) Travel Agent = The credit card has to be the one of the Travel Agent ")
 /**
   * The payment method (CREDIT_CARD, TRAVEL_AGENT_ID, CORPORATE_ID, CHECK, HOTEL_GUEST_ID, MISC_CHARGE_ORDER, ADVANCE_DEPOSIT, COMPANY_ADDRESS) Travel Agent = The credit card has to be the one of the Travel Agent 
  **/
  private String method = null;
 /**
   * Get creditCards
   * @return creditCards
  **/
  @JsonProperty("creditCards")
  public List<String> getCreditCards() {
    return creditCards;
  }

  public void setCreditCards(List<String> creditCards) {
    this.creditCards = creditCards;
  }

  public PaymentPolicy creditCards(List<String> creditCards) {
    this.creditCards = creditCards;
    return this;
  }

  public PaymentPolicy addCreditCardsItem(String creditCardsItem) {
    this.creditCards.add(creditCardsItem);
    return this;
  }

 /**
   * The payment method (CREDIT_CARD, TRAVEL_AGENT_ID, CORPORATE_ID, CHECK, HOTEL_GUEST_ID, MISC_CHARGE_ORDER, ADVANCE_DEPOSIT, COMPANY_ADDRESS) Travel Agent &#x3D; The credit card has to be the one of the Travel Agent 
   * @return method
  **/
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public PaymentPolicy method(String method) {
    this.method = method;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPolicy {\n");
    
    sb.append("    creditCards: ").append(toIndentedString(creditCards)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

