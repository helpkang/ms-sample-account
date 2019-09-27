package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.Discount;
import com.koreanair.external.dx.vo.Fee;
import com.koreanair.external.dx.vo.Surcharge;
import com.koreanair.external.dx.vo.Tax;
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
  * Price breakdowns expressed as with amounts using a specific currency
 **/
@ApiModel(description="Price breakdowns expressed as with amounts using a specific currency")
public class MultiCurrencyPrice  {
  
  @ApiModelProperty(value = "Base price. It includes some surcharges, but no taxes nor fees")
 /**
   * Base price. It includes some surcharges, but no taxes nor fees
  **/
  private Amount base = null;

  @ApiModelProperty(value = "Total price, including base fare, taxes, surcharges and fees (excluding credit or debit card fees)")
 /**
   * Total price, including base fare, taxes, surcharges and fees (excluding credit or debit card fees)
  **/
  private Amount total = null;

  @ApiModelProperty(value = "Taxes breakdown")
 /**
   * Taxes breakdown
  **/
  private List<Tax> taxes = null;

  @ApiModelProperty(value = "Sum of all taxes (including surcharges)")
 /**
   * Sum of all taxes (including surcharges)
  **/
  private Amount totalTaxes = null;

  @ApiModelProperty(value = "Surcharges breakdown")
 /**
   * Surcharges breakdown
  **/
  private List<Surcharge> surcharges = null;

  @ApiModelProperty(value = "Sum of all surcharges")
 /**
   * Sum of all surcharges
  **/
  private Amount totalSurcharges = null;

  @ApiModelProperty(value = "Fees breakdown")
 /**
   * Fees breakdown
  **/
  private List<Fee> fees = null;

  @ApiModelProperty(value = "Sum of all fees")
 /**
   * Sum of all fees
  **/
  private Amount totalFees = null;

  @ApiModelProperty(value = "Details about the discount when it is applied")
 /**
   * Details about the discount when it is applied
  **/
  private Discount discount = null;
 /**
   * Base price. It includes some surcharges, but no taxes nor fees
   * @return base
  **/
  @JsonProperty("base")
  public Amount getBase() {
    return base;
  }

  public void setBase(Amount base) {
    this.base = base;
  }

  public MultiCurrencyPrice base(Amount base) {
    this.base = base;
    return this;
  }

 /**
   * Total price, including base fare, taxes, surcharges and fees (excluding credit or debit card fees)
   * @return total
  **/
  @JsonProperty("total")
  public Amount getTotal() {
    return total;
  }

  public void setTotal(Amount total) {
    this.total = total;
  }

  public MultiCurrencyPrice total(Amount total) {
    this.total = total;
    return this;
  }

 /**
   * Taxes breakdown
   * @return taxes
  **/
  @JsonProperty("taxes")
  public List<Tax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<Tax> taxes) {
    this.taxes = taxes;
  }

  public MultiCurrencyPrice taxes(List<Tax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public MultiCurrencyPrice addTaxesItem(Tax taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

 /**
   * Sum of all taxes (including surcharges)
   * @return totalTaxes
  **/
  @JsonProperty("totalTaxes")
  public Amount getTotalTaxes() {
    return totalTaxes;
  }

  public void setTotalTaxes(Amount totalTaxes) {
    this.totalTaxes = totalTaxes;
  }

  public MultiCurrencyPrice totalTaxes(Amount totalTaxes) {
    this.totalTaxes = totalTaxes;
    return this;
  }

 /**
   * Surcharges breakdown
   * @return surcharges
  **/
  @JsonProperty("surcharges")
  public List<Surcharge> getSurcharges() {
    return surcharges;
  }

  public void setSurcharges(List<Surcharge> surcharges) {
    this.surcharges = surcharges;
  }

  public MultiCurrencyPrice surcharges(List<Surcharge> surcharges) {
    this.surcharges = surcharges;
    return this;
  }

  public MultiCurrencyPrice addSurchargesItem(Surcharge surchargesItem) {
    this.surcharges.add(surchargesItem);
    return this;
  }

 /**
   * Sum of all surcharges
   * @return totalSurcharges
  **/
  @JsonProperty("totalSurcharges")
  public Amount getTotalSurcharges() {
    return totalSurcharges;
  }

  public void setTotalSurcharges(Amount totalSurcharges) {
    this.totalSurcharges = totalSurcharges;
  }

  public MultiCurrencyPrice totalSurcharges(Amount totalSurcharges) {
    this.totalSurcharges = totalSurcharges;
    return this;
  }

 /**
   * Fees breakdown
   * @return fees
  **/
  @JsonProperty("fees")
  public List<Fee> getFees() {
    return fees;
  }

  public void setFees(List<Fee> fees) {
    this.fees = fees;
  }

  public MultiCurrencyPrice fees(List<Fee> fees) {
    this.fees = fees;
    return this;
  }

  public MultiCurrencyPrice addFeesItem(Fee feesItem) {
    this.fees.add(feesItem);
    return this;
  }

 /**
   * Sum of all fees
   * @return totalFees
  **/
  @JsonProperty("totalFees")
  public Amount getTotalFees() {
    return totalFees;
  }

  public void setTotalFees(Amount totalFees) {
    this.totalFees = totalFees;
  }

  public MultiCurrencyPrice totalFees(Amount totalFees) {
    this.totalFees = totalFees;
    return this;
  }

 /**
   * Details about the discount when it is applied
   * @return discount
  **/
  @JsonProperty("discount")
  public Discount getDiscount() {
    return discount;
  }

  public void setDiscount(Discount discount) {
    this.discount = discount;
  }

  public MultiCurrencyPrice discount(Discount discount) {
    this.discount = discount;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiCurrencyPrice {\n");
    
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    totalTaxes: ").append(toIndentedString(totalTaxes)).append("\n");
    sb.append("    surcharges: ").append(toIndentedString(surcharges)).append("\n");
    sb.append("    totalSurcharges: ").append(toIndentedString(totalSurcharges)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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

