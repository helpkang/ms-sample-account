package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Contact;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

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
  * Address information. Derived from Contact object by polymorphism
 **/
@ApiModel(description="Address information. Derived from Contact object by polymorphism")
public class Address extends Contact {
  

@XmlType(name="PurposeEnum")
@XmlEnum(String.class)
public enum PurposeEnum {

@XmlEnumValue("billing") BILLING(String.valueOf("billing")), @XmlEnumValue("mailing") MAILING(String.valueOf("mailing"));


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

  @ApiModelProperty(value = "Contact purpose")
 /**
   * Contact purpose
  **/
  private PurposeEnum purpose = null;

  @ApiModelProperty(required = true, value = "Line 1 = Street address, Line 2 = Apartment, suite, unit, building, floor, etc")
 /**
   * Line 1 = Street address, Line 2 = Apartment, suite, unit, building, floor, etc
  **/
  private List<String> lines = new ArrayList<>();

  @ApiModelProperty(value = "Name of the company")
 /**
   * Name of the company
  **/
  private String companyName = null;

  @ApiModelProperty(value = "Post office code number")
 /**
   * Post office code number
  **/
  private String zipCode = null;

  @ApiModelProperty(value = "ISO 3166-1 country code")
 /**
   * ISO 3166-1 country code
  **/
  private String countryCode = null;

  @ApiModelProperty(value = "Localized name of the city")
 /**
   * Localized name of the city
  **/
  private String cityName = null;

  @ApiModelProperty(value = "State code (two character standard IATA state code)")
 /**
   * State code (two character standard IATA state code)
  **/
  private String stateCode = null;

  @ApiModelProperty(value = "Postal Office Box")
 /**
   * Postal Office Box
  **/
  private String postalBox = null;
 /**
   * Contact purpose
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

  public Address purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

 /**
   * Line 1 &#x3D; Street address, Line 2 &#x3D; Apartment, suite, unit, building, floor, etc
   * @return lines
  **/
  @JsonProperty("lines")
  public List<String> getLines() {
    return lines;
  }

  public void setLines(List<String> lines) {
    this.lines = lines;
  }

  public Address lines(List<String> lines) {
    this.lines = lines;
    return this;
  }

  public Address addLinesItem(String linesItem) {
    this.lines.add(linesItem);
    return this;
  }

 /**
   * Name of the company
   * @return companyName
  **/
  @JsonProperty("companyName")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Address companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

 /**
   * Post office code number
   * @return zipCode
  **/
  @JsonProperty("zipCode")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public Address zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

 /**
   * ISO 3166-1 country code
   * @return countryCode
  **/
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Address countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

 /**
   * Localized name of the city
   * @return cityName
  **/
  @JsonProperty("cityName")
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public Address cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

 /**
   * State code (two character standard IATA state code)
   * @return stateCode
  **/
  @JsonProperty("stateCode")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public Address stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

 /**
   * Postal Office Box
   * @return postalBox
  **/
  @JsonProperty("postalBox")
  public String getPostalBox() {
    return postalBox;
  }

  public void setPostalBox(String postalBox) {
    this.postalBox = postalBox;
  }

  public Address postalBox(String postalBox) {
    this.postalBox = postalBox;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    postalBox: ").append(toIndentedString(postalBox)).append("\n");
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

