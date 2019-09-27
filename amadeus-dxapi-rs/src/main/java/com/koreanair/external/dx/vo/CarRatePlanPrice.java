package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CarPrice;
import com.koreanair.external.dx.vo.Coverage;
import com.koreanair.external.dx.vo.Discount;
import com.koreanair.external.dx.vo.Fee;
import com.koreanair.external.dx.vo.SpecialEquipment;
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
  * Price expressed in respect of a specific time window
 **/
@ApiModel(description="Price expressed in respect of a specific time window")
public class CarRatePlanPrice  {
  
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

  @ApiModelProperty(value = "List of spercial equipments such as a child seat or a navigational system that can be requested at booking time")
 /**
   * List of spercial equipments such as a child seat or a navigational system that can be requested at booking time
  **/
  private List<SpecialEquipment> specialEquipments = null;

  @ApiModelProperty(value = "Sum of all special equipments")
 /**
   * Sum of all special equipments
  **/
  private Long totalSpecialEquipments = null;

  @ApiModelProperty(value = "Coverages breakdown List of coverages such as theft protection or collision damage")
 /**
   * Coverages breakdown List of coverages such as theft protection or collision damage
  **/
  private List<Coverage> coverages = null;

  @ApiModelProperty(value = "Sum of all coverages")
 /**
   * Sum of all coverages
  **/
  private Long totalCoverages = null;


@XmlType(name="PricingTimeWindowEnum")
@XmlEnum(String.class)
public enum PricingTimeWindowEnum {

@XmlEnumValue("hourly") HOURLY(String.valueOf("hourly")), @XmlEnumValue("daily") DAILY(String.valueOf("daily")), @XmlEnumValue("monthly") MONTHLY(String.valueOf("monthly")), @XmlEnumValue("weekend") WEEKEND(String.valueOf("weekend")), @XmlEnumValue("weekly") WEEKLY(String.valueOf("weekly")), @XmlEnumValue("fullPeriod") FULLPERIOD(String.valueOf("fullPeriod"));


    private String value;

    PricingTimeWindowEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PricingTimeWindowEnum fromValue(String v) {
        for (PricingTimeWindowEnum b : PricingTimeWindowEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Period for which the rate plan pricing applies")
 /**
   * Period for which the rate plan pricing applies
  **/
  private PricingTimeWindowEnum pricingTimeWindow = null;
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

  public CarRatePlanPrice base(Long base) {
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

  public CarRatePlanPrice total(Long total) {
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

  public CarRatePlanPrice currencyCode(String currencyCode) {
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

  public CarRatePlanPrice taxes(List<Tax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public CarRatePlanPrice addTaxesItem(Tax taxesItem) {
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

  public CarRatePlanPrice totalTaxes(Long totalTaxes) {
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

  public CarRatePlanPrice surcharges(List<Surcharge> surcharges) {
    this.surcharges = surcharges;
    return this;
  }

  public CarRatePlanPrice addSurchargesItem(Surcharge surchargesItem) {
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

  public CarRatePlanPrice totalSurcharges(Long totalSurcharges) {
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

  public CarRatePlanPrice fees(List<Fee> fees) {
    this.fees = fees;
    return this;
  }

  public CarRatePlanPrice addFeesItem(Fee feesItem) {
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

  public CarRatePlanPrice totalFees(Long totalFees) {
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

  public CarRatePlanPrice discount(Discount discount) {
    this.discount = discount;
    return this;
  }

 /**
   * List of spercial equipments such as a child seat or a navigational system that can be requested at booking time
   * @return specialEquipments
  **/
  @JsonProperty("specialEquipments")
  public List<SpecialEquipment> getSpecialEquipments() {
    return specialEquipments;
  }

  public void setSpecialEquipments(List<SpecialEquipment> specialEquipments) {
    this.specialEquipments = specialEquipments;
  }

  public CarRatePlanPrice specialEquipments(List<SpecialEquipment> specialEquipments) {
    this.specialEquipments = specialEquipments;
    return this;
  }

  public CarRatePlanPrice addSpecialEquipmentsItem(SpecialEquipment specialEquipmentsItem) {
    this.specialEquipments.add(specialEquipmentsItem);
    return this;
  }

 /**
   * Sum of all special equipments
   * minimum: 0
   * @return totalSpecialEquipments
  **/
  @JsonProperty("totalSpecialEquipments")
  public Long getTotalSpecialEquipments() {
    return totalSpecialEquipments;
  }

  public void setTotalSpecialEquipments(Long totalSpecialEquipments) {
    this.totalSpecialEquipments = totalSpecialEquipments;
  }

  public CarRatePlanPrice totalSpecialEquipments(Long totalSpecialEquipments) {
    this.totalSpecialEquipments = totalSpecialEquipments;
    return this;
  }

 /**
   * Coverages breakdown List of coverages such as theft protection or collision damage
   * @return coverages
  **/
  @JsonProperty("coverages")
  public List<Coverage> getCoverages() {
    return coverages;
  }

  public void setCoverages(List<Coverage> coverages) {
    this.coverages = coverages;
  }

  public CarRatePlanPrice coverages(List<Coverage> coverages) {
    this.coverages = coverages;
    return this;
  }

  public CarRatePlanPrice addCoveragesItem(Coverage coveragesItem) {
    this.coverages.add(coveragesItem);
    return this;
  }

 /**
   * Sum of all coverages
   * minimum: 0
   * @return totalCoverages
  **/
  @JsonProperty("totalCoverages")
  public Long getTotalCoverages() {
    return totalCoverages;
  }

  public void setTotalCoverages(Long totalCoverages) {
    this.totalCoverages = totalCoverages;
  }

  public CarRatePlanPrice totalCoverages(Long totalCoverages) {
    this.totalCoverages = totalCoverages;
    return this;
  }

 /**
   * Period for which the rate plan pricing applies
   * @return pricingTimeWindow
  **/
  @JsonProperty("pricingTimeWindow")
  public String getPricingTimeWindow() {
    if (pricingTimeWindow == null) {
      return null;
    }
    return pricingTimeWindow.value();
  }

  public void setPricingTimeWindow(PricingTimeWindowEnum pricingTimeWindow) {
    this.pricingTimeWindow = pricingTimeWindow;
  }

  public CarRatePlanPrice pricingTimeWindow(PricingTimeWindowEnum pricingTimeWindow) {
    this.pricingTimeWindow = pricingTimeWindow;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarRatePlanPrice {\n");
    
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
    sb.append("    specialEquipments: ").append(toIndentedString(specialEquipments)).append("\n");
    sb.append("    totalSpecialEquipments: ").append(toIndentedString(totalSpecialEquipments)).append("\n");
    sb.append("    coverages: ").append(toIndentedString(coverages)).append("\n");
    sb.append("    totalCoverages: ").append(toIndentedString(totalCoverages)).append("\n");
    sb.append("    pricingTimeWindow: ").append(toIndentedString(pricingTimeWindow)).append("\n");
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

