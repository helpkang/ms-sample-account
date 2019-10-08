package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AddressBase;
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
  * Hold an address that will be provided to authorities
 **/
@ApiModel(description="Hold an address that will be provided to authorities")
public class RegulatoryAddress  {
  
  @ApiModelProperty(required = true, value = "Line 1 = Street address, Line 2 = Apartment, suite, unit, building, floor, etc")
 /**
   * Line 1 = Street address, Line 2 = Apartment, suite, unit, building, floor, etc
  **/
  private List<String> lines = new ArrayList<>();

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

  @ApiModelProperty(value = "Field containing a full unformatted address. Only applicable when the fields lines, postalCode, countryCode, cityName are not filled.")
 /**
   * Field containing a full unformatted address. Only applicable when the fields lines, postalCode, countryCode, cityName are not filled.
  **/
  private String text = null;


@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("homeAddress") HOMEADDRESS(String.valueOf("homeAddress")), @XmlEnumValue("destinationAddress") DESTINATIONADDRESS(String.valueOf("destinationAddress"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Type of regulatory address")
 /**
   * Type of regulatory address
  **/
  private TypeEnum type = null;
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

  public RegulatoryAddress lines(List<String> lines) {
    this.lines = lines;
    return this;
  }

  public RegulatoryAddress addLinesItem(String linesItem) {
    this.lines.add(linesItem);
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

  public RegulatoryAddress zipCode(String zipCode) {
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

  public RegulatoryAddress countryCode(String countryCode) {
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

  public RegulatoryAddress cityName(String cityName) {
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

  public RegulatoryAddress stateCode(String stateCode) {
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

  public RegulatoryAddress postalBox(String postalBox) {
    this.postalBox = postalBox;
    return this;
  }

 /**
   * Field containing a full unformatted address. Only applicable when the fields lines, postalCode, countryCode, cityName are not filled.
   * @return text
  **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public RegulatoryAddress text(String text) {
    this.text = text;
    return this;
  }

 /**
   * Type of regulatory address
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RegulatoryAddress type(TypeEnum type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryAddress {\n");
    
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    postalBox: ").append(toIndentedString(postalBox)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

