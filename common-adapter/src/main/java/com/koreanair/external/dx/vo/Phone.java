package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Contact;
import io.swagger.annotations.ApiModel;
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
  * Phone information. Derived from Contact object by polymorphism
 **/
@ApiModel(description="Phone information. Derived from Contact object by polymorphism")
public class Phone extends Contact {
  

@XmlType(name="DeviceTypeEnum")
@XmlEnum(String.class)
public enum DeviceTypeEnum {

@XmlEnumValue("mobile") MOBILE(String.valueOf("mobile")), @XmlEnumValue("landline") LANDLINE(String.valueOf("landline")), @XmlEnumValue("fax") FAX(String.valueOf("fax"));


    private String value;

    DeviceTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DeviceTypeEnum fromValue(String v) {
        for (DeviceTypeEnum b : DeviceTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Phone device type")
 /**
   * Phone device type
  **/
  private DeviceTypeEnum deviceType = DeviceTypeEnum.LANDLINE;


@XmlType(name="PurposeEnum")
@XmlEnum(String.class)
public enum PurposeEnum {

@XmlEnumValue("standard") STANDARD(String.valueOf("standard")), @XmlEnumValue("notification") NOTIFICATION(String.valueOf("notification")), @XmlEnumValue("emergency") EMERGENCY(String.valueOf("emergency")), @XmlEnumValue("information") INFORMATION(String.valueOf("information"));


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

  @ApiModelProperty(required = true, value = "Contact purpose")
 /**
   * Contact purpose
  **/
  private PurposeEnum purpose = PurposeEnum.STANDARD;

  @ApiModelProperty(value = "Country code phone extension (e.g. +49 for Germany)")
 /**
   * Country code phone extension (e.g. +49 for Germany)
  **/
  private String countryPhoneExtension = null;

  @ApiModelProperty(value = "Phone area code.")
 /**
   * Phone area code.
  **/
  private String areaCode = null;

  @ApiModelProperty(required = true, value = "Phone number including Work extension (when applicable)")
 /**
   * Phone number including Work extension (when applicable)
  **/
  private String number = null;

  @ApiModelProperty(value = "ISO 3166-1 country code. Used to specify the country of the person to be called in case of emergency")
 /**
   * ISO 3166-1 country code. Used to specify the country of the person to be called in case of emergency
  **/
  private String countryCode = null;

  @ApiModelProperty(value = "Code of the preferred language to be used, e.g. en-GB for English-United Kingdom. [For more details](http://www.lingoes.net/en/translator/langcode.htm)")
 /**
   * Code of the preferred language to be used, e.g. en-GB for English-United Kingdom. [For more details](http://www.lingoes.net/en/translator/langcode.htm)
  **/
  private String lang = null;

  @ApiModelProperty(value = "Code of the city (e.g. LON for London) associated to the Phone contact. Information available only at Order management time.")
 /**
   * Code of the city (e.g. LON for London) associated to the Phone contact. Information available only at Order management time.
  **/
  private String cityCode = null;
 /**
   * Phone device type
   * @return deviceType
  **/
  @JsonProperty("deviceType")
  public String getDeviceType() {
    if (deviceType == null) {
      return null;
    }
    return deviceType.value();
  }

  public void setDeviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
  }

  public Phone deviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
    return this;
  }

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

  public Phone purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

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

  public Phone countryPhoneExtension(String countryPhoneExtension) {
    this.countryPhoneExtension = countryPhoneExtension;
    return this;
  }

 /**
   * Phone area code.
   * @return areaCode
  **/
  @JsonProperty("areaCode")
  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public Phone areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

 /**
   * Phone number including Work extension (when applicable)
   * @return number
  **/
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Phone number(String number) {
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

  public Phone countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

 /**
   * Code of the preferred language to be used, e.g. en-GB for English-United Kingdom. [For more details](http://www.lingoes.net/en/translator/langcode.htm)
   * @return lang
  **/
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public Phone lang(String lang) {
    this.lang = lang;
    return this;
  }

 /**
   * Code of the city (e.g. LON for London) associated to the Phone contact. Information available only at Order management time.
   * @return cityCode
  **/
  @JsonProperty("cityCode")
  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public Phone cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    countryPhoneExtension: ").append(toIndentedString(countryPhoneExtension)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
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

