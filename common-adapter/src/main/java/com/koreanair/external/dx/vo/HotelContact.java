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
  * the contact details of the hotel
 **/
@ApiModel(description="the contact details of the hotel")
public class HotelContact  {
  
  @ApiModelProperty(example = "+33679278416", value = "Phone number of the hotel")
 /**
   * Phone number of the hotel
  **/
  private String phone = null;

  @ApiModelProperty(example = "+33679278417", value = "Fax number of the hotel")
 /**
   * Fax number of the hotel
  **/
  private String fax = null;

  @ApiModelProperty(example = "hotel@brand.com", value = "Email Address")
 /**
   * Email Address
  **/
  private String email = null;
 /**
   * Phone number of the hotel
   * @return phone
  **/
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public HotelContact phone(String phone) {
    this.phone = phone;
    return this;
  }

 /**
   * Fax number of the hotel
   * @return fax
  **/
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public HotelContact fax(String fax) {
    this.fax = fax;
    return this;
  }

 /**
   * Email Address
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public HotelContact email(String email) {
    this.email = email;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelContact {\n");
    
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
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

