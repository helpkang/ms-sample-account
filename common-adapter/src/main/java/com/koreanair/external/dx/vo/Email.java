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
  * Email information. Derived from Contact object by polymorphism
 **/
@ApiModel(description="Email information. Derived from Contact object by polymorphism")
public class Email extends Contact {
  

@XmlType(name="PurposeEnum")
@XmlEnum(String.class)
public enum PurposeEnum {

@XmlEnumValue("standard") STANDARD(String.valueOf("standard")), @XmlEnumValue("notification") NOTIFICATION(String.valueOf("notification")), @XmlEnumValue("information") INFORMATION(String.valueOf("information"));


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

  @ApiModelProperty(required = true, value = "Email address, e.g. test@amadeus.com")
 /**
   * Email address, e.g. test@amadeus.com
  **/
  private String address = null;

  @ApiModelProperty(value = "Code of the preferred language to be used, e.g. en-GB for English-United Kingdom. [For more details](http://www.lingoes.net/en/translator/langcode.htm)")
 /**
   * Code of the preferred language to be used, e.g. en-GB for English-United Kingdom. [For more details](http://www.lingoes.net/en/translator/langcode.htm)
  **/
  private String lang = null;
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

  public Email purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

 /**
   * Email address, e.g. test@amadeus.com
   * @return address
  **/
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Email address(String address) {
    this.address = address;
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

  public Email lang(String lang) {
    this.lang = lang;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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

