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
  * Details about the discount when it is applied. Object part of Price information.
 **/
@ApiModel(description="Details about the discount when it is applied. Object part of Price information.")
public class Discount  {
  
  @ApiModelProperty(value = "Total amount before the discount application")
 /**
   * Total amount before the discount application
  **/
  private Long originalTotal = null;

  @ApiModelProperty(value = "Total base fare amount before the discount application")
 /**
   * Total base fare amount before the discount application
  **/
  private Long originalBase = null;

  @ApiModelProperty(value = "Total taxes amount before the discount application")
 /**
   * Total taxes amount before the discount application
  **/
  private Long originalTotalTaxes = null;

  @ApiModelProperty(value = "Discount dictionary index identifying the dictionary item that contains the details about the discount or the promotion.  It corresponds to the best applied discount or promotion. ")
 /**
   * Discount dictionary index identifying the dictionary item that contains the details about the discount or the promotion.  It corresponds to the best applied discount or promotion. 
  **/
  private String discountCode = null;

  @ApiModelProperty(value = "Exhaustive list of applied discounts' codes. Each discount code corresponds to the dictionary index identifying the dictionary item containing all the details about the discount or the promotion. ")
 /**
   * Exhaustive list of applied discounts' codes. Each discount code corresponds to the dictionary index identifying the dictionary item containing all the details about the discount or the promotion. 
  **/
  private List<String> discountCodes = null;
 /**
   * Total amount before the discount application
   * minimum: 0
   * @return originalTotal
  **/
  @JsonProperty("originalTotal")
  public Long getOriginalTotal() {
    return originalTotal;
  }

  public void setOriginalTotal(Long originalTotal) {
    this.originalTotal = originalTotal;
  }

  public Discount originalTotal(Long originalTotal) {
    this.originalTotal = originalTotal;
    return this;
  }

 /**
   * Total base fare amount before the discount application
   * minimum: 0
   * @return originalBase
  **/
  @JsonProperty("originalBase")
  public Long getOriginalBase() {
    return originalBase;
  }

  public void setOriginalBase(Long originalBase) {
    this.originalBase = originalBase;
  }

  public Discount originalBase(Long originalBase) {
    this.originalBase = originalBase;
    return this;
  }

 /**
   * Total taxes amount before the discount application
   * minimum: 0
   * @return originalTotalTaxes
  **/
  @JsonProperty("originalTotalTaxes")
  public Long getOriginalTotalTaxes() {
    return originalTotalTaxes;
  }

  public void setOriginalTotalTaxes(Long originalTotalTaxes) {
    this.originalTotalTaxes = originalTotalTaxes;
  }

  public Discount originalTotalTaxes(Long originalTotalTaxes) {
    this.originalTotalTaxes = originalTotalTaxes;
    return this;
  }

 /**
   * Discount dictionary index identifying the dictionary item that contains the details about the discount or the promotion.  It corresponds to the best applied discount or promotion. 
   * @return discountCode
  **/
  @JsonProperty("discountCode")
  public String getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
  }

  public Discount discountCode(String discountCode) {
    this.discountCode = discountCode;
    return this;
  }

 /**
   * Exhaustive list of applied discounts&#39; codes. Each discount code corresponds to the dictionary index identifying the dictionary item containing all the details about the discount or the promotion. 
   * @return discountCodes
  **/
  @JsonProperty("discountCodes")
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  public Discount discountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
    return this;
  }

  public Discount addDiscountCodesItem(String discountCodesItem) {
    this.discountCodes.add(discountCodesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Discount {\n");
    
    sb.append("    originalTotal: ").append(toIndentedString(originalTotal)).append("\n");
    sb.append("    originalBase: ").append(toIndentedString(originalBase)).append("\n");
    sb.append("    originalTotalTaxes: ").append(toIndentedString(originalTotalTaxes)).append("\n");
    sb.append("    discountCode: ").append(toIndentedString(discountCode)).append("\n");
    sb.append("    discountCodes: ").append(toIndentedString(discountCodes)).append("\n");
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

