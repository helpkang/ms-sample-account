package com.koreanair.external.dx.vo;

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
  * accepted payment methods, several type of form of payment are possible for a guarantee
 **/
@ApiModel(description="accepted payment methods, several type of form of payment are possible for a guarantee")
public class HotelPaymentPolicy  {
  
  @ApiModelProperty(value = "")
  private List<String> creditCards = null;


@XmlType(name="MethodsEnum")
@XmlEnum(String.class)
public enum MethodsEnum {

@XmlEnumValue("CREDIT_CARD") CREDIT_CARD(String.valueOf("CREDIT_CARD")), @XmlEnumValue("TRAVEL_AGENT_ID") TRAVEL_AGENT_ID(String.valueOf("TRAVEL_AGENT_ID")), @XmlEnumValue("CORPORATE_ID") CORPORATE_ID(String.valueOf("CORPORATE_ID")), @XmlEnumValue("CHECK") CHECK(String.valueOf("CHECK")), @XmlEnumValue("HOTEL_GUEST_ID") HOTEL_GUEST_ID(String.valueOf("HOTEL_GUEST_ID")), @XmlEnumValue("MISC_CHARGE_ORDER") MISC_CHARGE_ORDER(String.valueOf("MISC_CHARGE_ORDER")), @XmlEnumValue("ADVANCE_DEPOSIT") ADVANCE_DEPOSIT(String.valueOf("ADVANCE_DEPOSIT")), @XmlEnumValue("COMPANY_ADDRESS") COMPANY_ADDRESS(String.valueOf("COMPANY_ADDRESS"));


    private String value;

    MethodsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MethodsEnum fromValue(String v) {
        for (MethodsEnum b : MethodsEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private List<MethodsEnum> methods = null;
 /**
   * Get creditCards
   * @return creditCards
  **/
  @JsonProperty("creditCards")
  public List<String> getCreditCards() {
    return creditCards;
  }

  public void setCreditCards(List<String> creditCards) {
    this.creditCards = creditCards;
  }

  public HotelPaymentPolicy creditCards(List<String> creditCards) {
    this.creditCards = creditCards;
    return this;
  }

  public HotelPaymentPolicy addCreditCardsItem(String creditCardsItem) {
    this.creditCards.add(creditCardsItem);
    return this;
  }

 /**
   * Get methods
   * @return methods
  **/
  @JsonProperty("methods")
  public List<MethodsEnum> getMethods() {
    return methods;
  }

  public void setMethods(List<MethodsEnum> methods) {
    this.methods = methods;
  }

  public HotelPaymentPolicy methods(List<MethodsEnum> methods) {
    this.methods = methods;
    return this;
  }

  public HotelPaymentPolicy addMethodsItem(MethodsEnum methodsItem) {
    this.methods.add(methodsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelPaymentPolicy {\n");
    
    sb.append("    creditCards: ").append(toIndentedString(creditCards)).append("\n");
    sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
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

