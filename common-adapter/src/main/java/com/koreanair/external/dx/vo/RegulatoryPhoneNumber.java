package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Name;
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
  * Hold a phone number and name that will be provided to authorities
 **/
@ApiModel(description="Hold a phone number and name that will be provided to authorities")
public class RegulatoryPhoneNumber  {
  
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

  @ApiModelProperty(value = "Name of the phone owner for the regulatory phone number")
 /**
   * Name of the phone owner for the regulatory phone number
  **/
  private Name name = null;


@XmlType(name="PurposeEnum")
@XmlEnum(String.class)
public enum PurposeEnum {

@XmlEnumValue("emergencyContact") EMERGENCYCONTACT(String.valueOf("emergencyContact"));


    private String value;

    PurposeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PurposeEnum fromValue(String v) {
        for (PurposeEnum b : PurposeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Type of regulatory phone number")
 /**
   * Type of regulatory phone number
  **/
  private PurposeEnum purpose = null;
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

  public RegulatoryPhoneNumber countryPhoneExtension(String countryPhoneExtension) {
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

  public RegulatoryPhoneNumber areaCode(String areaCode) {
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

  public RegulatoryPhoneNumber number(String number) {
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

  public RegulatoryPhoneNumber countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

 /**
   * Name of the phone owner for the regulatory phone number
   * @return name
  **/
  @JsonProperty("name")
  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public RegulatoryPhoneNumber name(Name name) {
    this.name = name;
    return this;
  }

 /**
   * Type of regulatory phone number
   * @return purpose
  **/
  @JsonProperty("purpose")
  public String getPurpose() {
    if (purpose == null) {
      return null;
    }
    return purpose.value();
  }

  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  public RegulatoryPhoneNumber purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryPhoneNumber {\n");
    
    sb.append("    countryPhoneExtension: ").append(toIndentedString(countryPhoneExtension)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
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

