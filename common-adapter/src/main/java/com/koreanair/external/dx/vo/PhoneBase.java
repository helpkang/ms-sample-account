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
  * Base element to hold phone information.
 **/
@ApiModel(description="Base element to hold phone information.")
public class PhoneBase  {
  
  @ApiModelProperty(value = "Country code phone extension (e.g. +49 for Germany)")
 /**
   * Country code phone extension (e.g. +49 for Germany)
  **/
  private String countryPhoneExtension = null;

  @ApiModelProperty(value = "Phone area code. Not implemented yet")
 /**
   * Phone area code. Not implemented yet
  **/
  private String areaCode = null;

  @ApiModelProperty(required = true, value = "Phone number")
 /**
   * Phone number
  **/
  private String number = null;

  @ApiModelProperty(value = "ISO 3166-1 country code. Used to specify the country of the person to be called in case of emergency")
 /**
   * ISO 3166-1 country code. Used to specify the country of the person to be called in case of emergency
  **/
  private String countryCode = null;
 /**
   * Country code phone extension (e.g. +49 for Germany)
   * @return countryPhoneExtension
  **/
  @JsonProperty("countryPhoneExtension")
  public String getCountryPhoneExtension() {
    return countryPhoneExtension;
  }

  public void setCountryPhoneExtension(String countryPhoneExtension) {
    this.countryPhoneExtension = countryPhoneExtension;
  }

  public PhoneBase countryPhoneExtension(String countryPhoneExtension) {
    this.countryPhoneExtension = countryPhoneExtension;
    return this;
  }

 /**
   * Phone area code. Not implemented yet
   * @return areaCode
  **/
  @JsonProperty("areaCode")
  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public PhoneBase areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

 /**
   * Phone number
   * @return number
  **/
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public PhoneBase number(String number) {
    this.number = number;
    return this;
  }

 /**
   * ISO 3166-1 country code. Used to specify the country of the person to be called in case of emergency
   * @return countryCode
  **/
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public PhoneBase countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneBase {\n");
    
    sb.append("    countryPhoneExtension: ").append(toIndentedString(countryPhoneExtension)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

