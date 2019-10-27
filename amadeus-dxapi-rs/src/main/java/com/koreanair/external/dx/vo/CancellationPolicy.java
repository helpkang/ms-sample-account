package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.TextWithLanguageType;
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

public class CancellationPolicy  {
  
  @ApiModelProperty(value = "[\"Flat\",\"FlatPerNight\", \"Nights\", \"StayPercent\", \"FirstNight\", \"LastNight\", \"FirstAndLastNight\", \"FullStay\"] Several penalty type can apply for the same product. ")
 /**
   * [\"Flat\",\"FlatPerNight\", \"Nights\", \"StayPercent\", \"FirstNight\", \"LastNight\", \"FirstAndLastNight\", \"FullStay\"] Several penalty type can apply for the same product. 
  **/
  private String type = null;

  @ApiModelProperty(value = "")
  private Amount amount = null;

  @ApiModelProperty(value = "Number of nights due as fee in case of cancellation.")
 /**
   * Number of nights due as fee in case of cancellation.
  **/
  private Integer numberOfNights = null;

  @ApiModelProperty(value = "Percentage associated to the cancellation policy linked to the total amount. Value is between 0 and 100.")
 /**
   * Percentage associated to the cancellation policy linked to the total amount. Value is between 0 and 100.
  **/
  private String percentage = null;

  @ApiModelProperty(value = "Represents the deadline's date and time in ISO 8601 [https://www.w3.org/TR/NOTE-datetime]. Example: 2010-08-14T13:00:00 Please note that this value is expressed in the hotel local time zone ")
 /**
   * Represents the deadline's date and time in ISO 8601 [https://www.w3.org/TR/NOTE-datetime]. Example: 2010-08-14T13:00:00 Please note that this value is expressed in the hotel local time zone 
  **/
  private LocalDateTime deadline = null;

  @ApiModelProperty(value = "")
  private TextWithLanguageType description = null;
 /**
   * [\&quot;Flat\&quot;,\&quot;FlatPerNight\&quot;, \&quot;Nights\&quot;, \&quot;StayPercent\&quot;, \&quot;FirstNight\&quot;, \&quot;LastNight\&quot;, \&quot;FirstAndLastNight\&quot;, \&quot;FullStay\&quot;] Several penalty type can apply for the same product. 
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CancellationPolicy type(String type) {
    this.type = type;
    return this;
  }

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

  public CancellationPolicy amount(Amount amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Number of nights due as fee in case of cancellation.
   * minimum: 0
   * @return numberOfNights
  **/
  @JsonProperty("numberOfNights")
  public Integer getNumberOfNights() {
    return numberOfNights;
  }

  public void setNumberOfNights(Integer numberOfNights) {
    this.numberOfNights = numberOfNights;
  }

  public CancellationPolicy numberOfNights(Integer numberOfNights) {
    this.numberOfNights = numberOfNights;
    return this;
  }

 /**
   * Percentage associated to the cancellation policy linked to the total amount. Value is between 0 and 100.
   * @return percentage
  **/
  @JsonProperty("percentage")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  public CancellationPolicy percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

 /**
   * Represents the deadline&#39;s date and time in ISO 8601 [https://www.w3.org/TR/NOTE-datetime]. Example: 2010-08-14T13:00:00 Please note that this value is expressed in the hotel local time zone 
   * @return deadline
  **/
  @JsonProperty("deadline")
  public LocalDateTime getDeadline() {
    return deadline;
  }

  public void setDeadline(LocalDateTime deadline) {
    this.deadline = deadline;
  }

  public CancellationPolicy deadline(LocalDateTime deadline) {
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

  public CancellationPolicy description(TextWithLanguageType description) {
    this.description = description;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationPolicy {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    numberOfNights: ").append(toIndentedString(numberOfNights)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

