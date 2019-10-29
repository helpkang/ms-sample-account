package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.TextWithLanguageType;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Commission  {
  
  @ApiModelProperty(value = "Percentage of the commission. Value is between 0 and 100")
 /**
   * Percentage of the commission. Value is between 0 and 100
  **/
  private String percentage = null;

  @ApiModelProperty(value = "")
  private Amount amount = null;

  @ApiModelProperty(value = "")
  private TextWithLanguageType description = null;
 /**
   * Percentage of the commission. Value is between 0 and 100
   * @return percentage
  **/
  @JsonProperty("percentage")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  public Commission percentage(String percentage) {
    this.percentage = percentage;
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

  public Commission amount(Amount amount) {
    this.amount = amount;
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

  public Commission description(TextWithLanguageType description) {
    this.description = description;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Commission {\n");
    
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

