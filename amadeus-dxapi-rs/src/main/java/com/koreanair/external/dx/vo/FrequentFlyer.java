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
  * Frequent flyer information
 **/
@ApiModel(description="Frequent flyer information")
public class FrequentFlyer  {
  
  @ApiModelProperty(example = "6X", value = "Code of the airline company")
 /**
   * Code of the airline company
  **/
  private String companyCode = null;

  @ApiModelProperty(example = "992003172079000", value = "Card number")
 /**
   * Card number
  **/
  private String cardNumber = null;

  @ApiModelProperty(example = "3", value = "Frequent flyer priority code within the Loyalty system. Both tier level and priority codes are unique identifiers of a Frequent Flyer.")
 /**
   * Frequent flyer priority code within the Loyalty system. Both tier level and priority codes are unique identifiers of a Frequent Flyer.
  **/
  private String priorityCode = null;

  @ApiModelProperty(example = "GOLD", value = "Frequent flyer tier level code")
 /**
   * Frequent flyer tier level code
  **/
  private String tierLevel = null;
 /**
   * Code of the airline company
   * @return companyCode
  **/
  @JsonProperty("companyCode")
  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public FrequentFlyer companyCode(String companyCode) {
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

  public FrequentFlyer cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

 /**
   * Frequent flyer priority code within the Loyalty system. Both tier level and priority codes are unique identifiers of a Frequent Flyer.
   * @return priorityCode
  **/
  @JsonProperty("priorityCode")
  public String getPriorityCode() {
    return priorityCode;
  }

  public void setPriorityCode(String priorityCode) {
    this.priorityCode = priorityCode;
  }

  public FrequentFlyer priorityCode(String priorityCode) {
    this.priorityCode = priorityCode;
    return this;
  }

 /**
   * Frequent flyer tier level code
   * @return tierLevel
  **/
  @JsonProperty("tierLevel")
  public String getTierLevel() {
    return tierLevel;
  }

  public void setTierLevel(String tierLevel) {
    this.tierLevel = tierLevel;
  }

  public FrequentFlyer tierLevel(String tierLevel) {
    this.tierLevel = tierLevel;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentFlyer {\n");
    
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    priorityCode: ").append(toIndentedString(priorityCode)).append("\n");
    sb.append("    tierLevel: ").append(toIndentedString(tierLevel)).append("\n");
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

