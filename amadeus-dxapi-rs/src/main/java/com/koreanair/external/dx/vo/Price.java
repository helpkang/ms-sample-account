package com.koreanair.external.dx.vo;

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
  * Price breakdowns expressed as exhaustive amounts
 **/
@ApiModel(description="Price breakdowns expressed as exhaustive amounts")
public class Price  {
  
  @ApiModelProperty(value = "Base price. It includes some surcharges, but no taxes nor fees")
 /**
   * Base price. It includes some surcharges, but no taxes nor fees
  **/
  private Long base = null;

  @ApiModelProperty(required = true, value = "Total price, including base fare, taxes, surcharges and fees (excluding credit or debit card fees)")
 /**
   * Total price, including base fare, taxes, surcharges and fees (excluding credit or debit card fees)
  **/
  private Long total = null;

  @ApiModelProperty(required = true, value = "ISO currency code (http://www.iso.org/iso/home/standards/currency_codes.htm)")
 /**
   * ISO currency code (http://www.iso.org/iso/home/standards/currency_codes.htm)
  **/
  private String currencyCode = null;

  @ApiModelProperty(value = "Taxes breakdown")
 /**
   * Taxes breakdown
  **/
  private List<Tax> taxes = null;

  @ApiModelProperty(required = true, value = "Sum of all taxes (including surcharges)")
 /**
   * Sum of all taxes (including surcharges)
  **/
  private Long totalTaxes = null;

  @ApiModelProperty(value = "Surcharges breakdown")
 /**
   * Surcharges breakdown
  **/
  private List<Surcharge> surcharges = null;

  @ApiModelProperty(value = "Sum of all surcharges")
 /**
   * Sum of all surcharges
  **/
  private Long totalSurcharges = null;

  @ApiModelProperty(value = "Fees breakdown")
 /**
   * Fees breakdown
  **/
  private List<Fee> fees = null;

  @ApiModelProperty(value = "Sum of all fees")
 /**
   * Sum of all fees
  **/
  private Long totalFees = null;

  @ApiModelProperty(value = "Details about the discount when it is applied")
 /**
   * Details about the discount when it is applied
  **/
  private Discount discount = null;
 /**
   * Base price. It includes some surcharges, but no taxes nor fees
   * minimum: 0
   * @return base
  **/
  @JsonProperty("base")
  public Long getBase() {
    return base;
  }

  public void setBase(Long base) {
    this.base = base;
  }

  public Price base(Long base) {
    this.base = base;
    return this;
  }

 /**
   * Total price, including base fare, taxes, surcharges and fees (excluding credit or debit card fees)
   * minimum: 0
   * @return total
  **/
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public Price total(Long total) {
    this.total = total;
    return this;
  }

 /**
   * ISO currency code (http://www.iso.org/iso/home/standards/currency_codes.htm)
   * @return currencyCode
  **/
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Price currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
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

  public Price taxes(List<Tax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public Price addTaxesItem(Tax taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

 /**
   * Sum of all taxes (including surcharges)
   * minimum: 0
   * @return totalTaxes
  **/
  @JsonProperty("totalTaxes")
  public Long getTotalTaxes() {
    return totalTaxes;
  }

  public void setTotalTaxes(Long totalTaxes) {
    this.totalTaxes = totalTaxes;
  }

  public Price totalTaxes(Long totalTaxes) {
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

  public Price surcharges(List<Surcharge> surcharges) {
    this.surcharges = surcharges;
    return this;
  }

  public Price addSurchargesItem(Surcharge surchargesItem) {
    this.surcharges.add(surchargesItem);
    return this;
  }

 /**
   * Sum of all surcharges
   * minimum: 0
   * @return totalSurcharges
  **/
  @JsonProperty("totalSurcharges")
  public Long getTotalSurcharges() {
    return totalSurcharges;
  }

  public void setTotalSurcharges(Long totalSurcharges) {
    this.totalSurcharges = totalSurcharges;
  }

  public Price totalSurcharges(Long totalSurcharges) {
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

  public Price fees(List<Fee> fees) {
    this.fees = fees;
    return this;
  }

  public Price addFeesItem(Fee feesItem) {
    this.fees.add(feesItem);
    return this;
  }

 /**
   * Sum of all fees
   * minimum: 0
   * @return totalFees
  **/
  @JsonProperty("totalFees")
  public Long getTotalFees() {
    return totalFees;
  }

  public void setTotalFees(Long totalFees) {
    this.totalFees = totalFees;
  }

  public Price totalFees(Long totalFees) {
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

  public Price discount(Discount discount) {
    this.discount = discount;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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
