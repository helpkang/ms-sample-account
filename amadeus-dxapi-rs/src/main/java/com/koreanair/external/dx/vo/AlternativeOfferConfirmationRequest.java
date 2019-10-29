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
  * Request to modify an order with the new flight selection from POST alternative-offers
 **/
@ApiModel(description="Request to modify an order with the new flight selection from POST alternative-offers")
public class AlternativeOfferConfirmationRequest  {
  
  @ApiModelProperty(example = "Holmes", value = "")
  private String lastName = null;

  @ApiModelProperty(value = "Identifier of an alternative offer.")
 /**
   * Identifier of an alternative offer.
  **/
  private String alternativeOfferId = null;
 /**
   * Get lastName
   * @return lastName
  **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public AlternativeOfferConfirmationRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * Identifier of an alternative offer.
   * @return alternativeOfferId
  **/
  @JsonProperty("alternativeOfferId")
  public String getAlternativeOfferId() {
    return alternativeOfferId;
  }

  public void setAlternativeOfferId(String alternativeOfferId) {
    this.alternativeOfferId = alternativeOfferId;
  }

  public AlternativeOfferConfirmationRequest alternativeOfferId(String alternativeOfferId) {
    this.alternativeOfferId = alternativeOfferId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeOfferConfirmationRequest {\n");
    
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    alternativeOfferId: ").append(toIndentedString(alternativeOfferId)).append("\n");
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

