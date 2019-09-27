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
  * Discount dictionary
 **/
@ApiModel(description="Discount dictionary")
public class DiscountDictionaryItem  {
  
  @ApiModelProperty(required = true, value = "The code of the airline that created the discount")
 /**
   * The code of the airline that created the discount
  **/
  private String airlineCode = null;

  @ApiModelProperty(required = true, value = "Contains the reason for discount appliance as defined via the rules of AAM product If 'isPromotion' field value is set to True, then it contains the promotion code as defined via the rules of AAM product For more details about AAM please see [Amadeus Anytime Merchandising](http://www.amadeus.com/web/amadeus/en_1A-corporate/Airlines/Airline-Needs/Serve/Differentiate-your-offer/Amadeus-Anytime-Merchandising/1319660801962-Solution_C-AMAD_ProductDetailPpal-1319637765525?industrySegment=1259068355670&level2=1332980613390&level3=1319616835064). Example: PROMCHRIS corresponds to a Christmas time reduction ")
 /**
   * Contains the reason for discount appliance as defined via the rules of AAM product If 'isPromotion' field value is set to True, then it contains the promotion code as defined via the rules of AAM product For more details about AAM please see [Amadeus Anytime Merchandising](http://www.amadeus.com/web/amadeus/en_1A-corporate/Airlines/Airline-Needs/Serve/Differentiate-your-offer/Amadeus-Anytime-Merchandising/1319660801962-Solution_C-AMAD_ProductDetailPpal-1319637765525?industrySegment=1259068355670&level2=1332980613390&level3=1319616835064). Example: PROMCHRIS corresponds to a Christmas time reduction 
  **/
  private String reasonCode = null;

  @ApiModelProperty(value = "This field highlights if a discount comes from the application of a dynamic bundle ")
 /**
   * This field highlights if a discount comes from the application of a dynamic bundle 
  **/
  private Boolean isBundleDiscount = null;

  @ApiModelProperty(value = "This field highlights if a discount comes from the application of a promotion ")
 /**
   * This field highlights if a discount comes from the application of a promotion 
  **/
  private Boolean isPromotion = null;
 /**
   * The code of the airline that created the discount
   * @return airlineCode
  **/
  @JsonProperty("airlineCode")
  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public DiscountDictionaryItem airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }

 /**
   * Contains the reason for discount appliance as defined via the rules of AAM product If &#39;isPromotion&#39; field value is set to True, then it contains the promotion code as defined via the rules of AAM product For more details about AAM please see [Amadeus Anytime Merchandising](http://www.amadeus.com/web/amadeus/en_1A-corporate/Airlines/Airline-Needs/Serve/Differentiate-your-offer/Amadeus-Anytime-Merchandising/1319660801962-Solution_C-AMAD_ProductDetailPpal-1319637765525?industrySegment&#x3D;1259068355670&amp;level2&#x3D;1332980613390&amp;level3&#x3D;1319616835064). Example: PROMCHRIS corresponds to a Christmas time reduction 
   * @return reasonCode
  **/
  @JsonProperty("reasonCode")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public DiscountDictionaryItem reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

 /**
   * This field highlights if a discount comes from the application of a dynamic bundle 
   * @return isBundleDiscount
  **/
  @JsonProperty("isBundleDiscount")
  public Boolean isIsBundleDiscount() {
    return isBundleDiscount;
  }

  public void setIsBundleDiscount(Boolean isBundleDiscount) {
    this.isBundleDiscount = isBundleDiscount;
  }

  public DiscountDictionaryItem isBundleDiscount(Boolean isBundleDiscount) {
    this.isBundleDiscount = isBundleDiscount;
    return this;
  }

 /**
   * This field highlights if a discount comes from the application of a promotion 
   * @return isPromotion
  **/
  @JsonProperty("isPromotion")
  public Boolean isIsPromotion() {
    return isPromotion;
  }

  public void setIsPromotion(Boolean isPromotion) {
    this.isPromotion = isPromotion;
  }

  public DiscountDictionaryItem isPromotion(Boolean isPromotion) {
    this.isPromotion = isPromotion;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountDictionaryItem {\n");
    
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    isBundleDiscount: ").append(toIndentedString(isBundleDiscount)).append("\n");
    sb.append("    isPromotion: ").append(toIndentedString(isPromotion)).append("\n");
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

