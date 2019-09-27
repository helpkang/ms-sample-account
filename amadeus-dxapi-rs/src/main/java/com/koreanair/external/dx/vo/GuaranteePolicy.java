package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.HotelPaymentPolicy;
import com.koreanair.external.dx.vo.TextWithLanguageType;
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
  * the guarantee policy information applicable to the rate plan for the requested period. It includes accepted payments, deadline and the amount due
 **/
@ApiModel(description="the guarantee policy information applicable to the rate plan for the requested period. It includes accepted payments, deadline and the amount due")
public class GuaranteePolicy  {
  
  @ApiModelProperty(value = "")
  private Amount amount = null;

  @ApiModelProperty(value = "Represents the deadline's date and time in ISO 8601[https://www.w3.org/TR/NOTE-datetime].   Example: 2010-08-14T13:00:00  Please note that this value is expressed in the hotel local time zone ")
 /**
   * Represents the deadline's date and time in ISO 8601[https://www.w3.org/TR/NOTE-datetime].   Example: 2010-08-14T13:00:00  Please note that this value is expressed in the hotel local time zone 
  **/
  private LocalDateTime deadline = null;

  @ApiModelProperty(value = "")
  private TextWithLanguageType description = null;

  @ApiModelProperty(value = "")
  private HotelPaymentPolicy acceptedPayments = null;
 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("amount")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public GuaranteePolicy amount(Amount amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Represents the deadline&#39;s date and time in ISO 8601[https://www.w3.org/TR/NOTE-datetime].   Example: 2010-08-14T13:00:00  Please note that this value is expressed in the hotel local time zone 
   * @return deadline
  **/
  @JsonProperty("deadline")
  public LocalDateTime getDeadline() {
    return deadline;
  }

  public void setDeadline(LocalDateTime deadline) {
    this.deadline = deadline;
  }

  public GuaranteePolicy deadline(LocalDateTime deadline) {
    this.deadline = deadline;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public TextWithLanguageType getDescription() {
    return description;
  }

  public void setDescription(TextWithLanguageType description) {
    this.description = description;
  }

  public GuaranteePolicy description(TextWithLanguageType description) {
    this.description = description;
    return this;
  }

 /**
   * Get acceptedPayments
   * @return acceptedPayments
  **/
  @JsonProperty("acceptedPayments")
  public HotelPaymentPolicy getAcceptedPayments() {
    return acceptedPayments;
  }

  public void setAcceptedPayments(HotelPaymentPolicy acceptedPayments) {
    this.acceptedPayments = acceptedPayments;
  }

  public GuaranteePolicy acceptedPayments(HotelPaymentPolicy acceptedPayments) {
    this.acceptedPayments = acceptedPayments;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteePolicy {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    acceptedPayments: ").append(toIndentedString(acceptedPayments)).append("\n");
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

