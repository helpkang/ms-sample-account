package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BoardingPassDeliveryMethod;
import com.koreanair.external.dx.vo.PhoneBase;
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
  * SMS delivery method will allow sending an SMS to the phone number provided by the user The SMS format will contain a link to the boarding pass. The link is sometimes used to return the URL for handling the boarding pass through a specific website or, by default, through the Amadeus product (if configured by the airline). 
 **/
@ApiModel(description="SMS delivery method will allow sending an SMS to the phone number provided by the user The SMS format will contain a link to the boarding pass. The link is sometimes used to return the URL for handling the boarding pass through a specific website or, by default, through the Amadeus product (if configured by the airline). ")
public class BoardingPassSmsDelivery extends BoardingPassDeliveryMethod {
  
  @ApiModelProperty(required = true, value = "")
  private PhoneBase phoneNumber = null;

  @ApiModelProperty(value = "URL link to your specific website to handle the boarding pass on your side. It is added to the airline defined SMS text")
 /**
   * URL link to your specific website to handle the boarding pass on your side. It is added to the airline defined SMS text
  **/
  private String link = null;
 /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @JsonProperty("phoneNumber")
  public PhoneBase getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(PhoneBase phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public BoardingPassSmsDelivery phoneNumber(PhoneBase phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

 /**
   * URL link to your specific website to handle the boarding pass on your side. It is added to the airline defined SMS text
   * @return link
  **/
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public BoardingPassSmsDelivery link(String link) {
    this.link = link;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardingPassSmsDelivery {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

