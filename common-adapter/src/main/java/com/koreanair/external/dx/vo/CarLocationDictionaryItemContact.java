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
  * location contact elements
 **/
@ApiModel(description="location contact elements")
public class CarLocationDictionaryItemContact  {
  
  @ApiModelProperty(value = "Location phone number")
 /**
   * Location phone number
  **/
  private String phoneNumber = null;

  @ApiModelProperty(value = "Location fax number")
 /**
   * Location fax number
  **/
  private String faxNumber = null;

  @ApiModelProperty(value = "Location email address")
 /**
   * Location email address
  **/
  private String email = null;
 /**
   * Location phone number
   * @return phoneNumber
  **/
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CarLocationDictionaryItemContact phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

 /**
   * Location fax number
   * @return faxNumber
  **/
  @JsonProperty("faxNumber")
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public CarLocationDictionaryItemContact faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

 /**
   * Location email address
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CarLocationDictionaryItemContact email(String email) {
    this.email = email;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarLocationDictionaryItemContact {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

