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
  * Set of elements that holds the information pertaining to the properties of the voucher.
 **/
@ApiModel(description="Set of elements that holds the information pertaining to the properties of the voucher.")
public class VoucherEligibilities  {
  
  @ApiModelProperty(required = true, value = "The voucher can be printed on paper")
 /**
   * The voucher can be printed on paper
  **/
  private Boolean isPrintable = null;

  @ApiModelProperty(required = true, value = "The voucher can be reprinted on paper even after it was printed the first time")
 /**
   * The voucher can be reprinted on paper even after it was printed the first time
  **/
  private Boolean isReprintable = null;

  @ApiModelProperty(required = true, value = "The voucher can be cancelled by an agent")
 /**
   * The voucher can be cancelled by an agent
  **/
  private Boolean isCancellable = null;

  @ApiModelProperty(required = true, value = "The voucher can be used by another customer different from the owner")
 /**
   * The voucher can be used by another customer different from the owner
  **/
  private Boolean isTransmissible = null;

  @ApiModelProperty(required = true, value = "The voucher can be reinstated after it goes in status Used")
 /**
   * The voucher can be reinstated after it goes in status Used
  **/
  private Boolean isRestorable = null;

  @ApiModelProperty(required = true, value = "The voucher can be refunded")
 /**
   * The voucher can be refunded
  **/
  private Boolean isRefundable = null;

  @ApiModelProperty(required = true, value = "The voucher cannot be combined with other vouchers for the payment")
 /**
   * The voucher cannot be combined with other vouchers for the payment
  **/
  private Boolean isExclusive = null;

  @ApiModelProperty(required = true, value = "The voucher cannot pay the taxes fare of a pricing record (if false, can pay the grand total)")
 /**
   * The voucher cannot pay the taxes fare of a pricing record (if false, can pay the grand total)
  **/
  private Boolean isTaxesExcluded = null;
 /**
   * The voucher can be printed on paper
   * @return isPrintable
  **/
  @JsonProperty("isPrintable")
  public Boolean isIsPrintable() {
    return isPrintable;
  }

  public void setIsPrintable(Boolean isPrintable) {
    this.isPrintable = isPrintable;
  }

  public VoucherEligibilities isPrintable(Boolean isPrintable) {
    this.isPrintable = isPrintable;
    return this;
  }

 /**
   * The voucher can be reprinted on paper even after it was printed the first time
   * @return isReprintable
  **/
  @JsonProperty("isReprintable")
  public Boolean isIsReprintable() {
    return isReprintable;
  }

  public void setIsReprintable(Boolean isReprintable) {
    this.isReprintable = isReprintable;
  }

  public VoucherEligibilities isReprintable(Boolean isReprintable) {
    this.isReprintable = isReprintable;
    return this;
  }

 /**
   * The voucher can be cancelled by an agent
   * @return isCancellable
  **/
  @JsonProperty("isCancellable")
  public Boolean isIsCancellable() {
    return isCancellable;
  }

  public void setIsCancellable(Boolean isCancellable) {
    this.isCancellable = isCancellable;
  }

  public VoucherEligibilities isCancellable(Boolean isCancellable) {
    this.isCancellable = isCancellable;
    return this;
  }

 /**
   * The voucher can be used by another customer different from the owner
   * @return isTransmissible
  **/
  @JsonProperty("isTransmissible")
  public Boolean isIsTransmissible() {
    return isTransmissible;
  }

  public void setIsTransmissible(Boolean isTransmissible) {
    this.isTransmissible = isTransmissible;
  }

  public VoucherEligibilities isTransmissible(Boolean isTransmissible) {
    this.isTransmissible = isTransmissible;
    return this;
  }

 /**
   * The voucher can be reinstated after it goes in status Used
   * @return isRestorable
  **/
  @JsonProperty("isRestorable")
  public Boolean isIsRestorable() {
    return isRestorable;
  }

  public void setIsRestorable(Boolean isRestorable) {
    this.isRestorable = isRestorable;
  }

  public VoucherEligibilities isRestorable(Boolean isRestorable) {
    this.isRestorable = isRestorable;
    return this;
  }

 /**
   * The voucher can be refunded
   * @return isRefundable
  **/
  @JsonProperty("isRefundable")
  public Boolean isIsRefundable() {
    return isRefundable;
  }

  public void setIsRefundable(Boolean isRefundable) {
    this.isRefundable = isRefundable;
  }

  public VoucherEligibilities isRefundable(Boolean isRefundable) {
    this.isRefundable = isRefundable;
    return this;
  }

 /**
   * The voucher cannot be combined with other vouchers for the payment
   * @return isExclusive
  **/
  @JsonProperty("isExclusive")
  public Boolean isIsExclusive() {
    return isExclusive;
  }

  public void setIsExclusive(Boolean isExclusive) {
    this.isExclusive = isExclusive;
  }

  public VoucherEligibilities isExclusive(Boolean isExclusive) {
    this.isExclusive = isExclusive;
    return this;
  }

 /**
   * The voucher cannot pay the taxes fare of a pricing record (if false, can pay the grand total)
   * @return isTaxesExcluded
  **/
  @JsonProperty("isTaxesExcluded")
  public Boolean isIsTaxesExcluded() {
    return isTaxesExcluded;
  }

  public void setIsTaxesExcluded(Boolean isTaxesExcluded) {
    this.isTaxesExcluded = isTaxesExcluded;
  }

  public VoucherEligibilities isTaxesExcluded(Boolean isTaxesExcluded) {
    this.isTaxesExcluded = isTaxesExcluded;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherEligibilities {\n");
    
    sb.append("    isPrintable: ").append(toIndentedString(isPrintable)).append("\n");
    sb.append("    isReprintable: ").append(toIndentedString(isReprintable)).append("\n");
    sb.append("    isCancellable: ").append(toIndentedString(isCancellable)).append("\n");
    sb.append("    isTransmissible: ").append(toIndentedString(isTransmissible)).append("\n");
    sb.append("    isRestorable: ").append(toIndentedString(isRestorable)).append("\n");
    sb.append("    isRefundable: ").append(toIndentedString(isRefundable)).append("\n");
    sb.append("    isExclusive: ").append(toIndentedString(isExclusive)).append("\n");
    sb.append("    isTaxesExcluded: ").append(toIndentedString(isTaxesExcluded)).append("\n");
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

