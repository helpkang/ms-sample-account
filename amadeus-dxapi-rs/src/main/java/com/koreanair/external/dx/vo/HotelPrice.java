package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.HotelTax;
import com.koreanair.external.dx.vo.PriceVariations;
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
  * price valuation information
 **/
@ApiModel(description="price valuation information")
public class HotelPrice  {
  
  @ApiModelProperty(value = "Total amount after taxes returned by provider")
 /**
   * Total amount after taxes returned by provider
  **/
  private Amount oldTotal = null;

  @ApiModelProperty(value = "Total amount after taxes")
 /**
   * Total amount after taxes
  **/
  private Amount total = null;

  @ApiModelProperty(value = "Total amount before taxes")
 /**
   * Total amount before taxes
  **/
  private Amount base = null;

  @ApiModelProperty(value = "")
  private List<HotelTax> taxes = null;

  @ApiModelProperty(value = "some prices may vary during a stay. It shows the rate changes during the stay and the average daily rate")
 /**
   * some prices may vary during a stay. It shows the rate changes during the stay and the average daily rate
  **/
  private PriceVariations variations = null;
 /**
   * Total amount after taxes returned by provider
   * @return oldTotal
  **/
  @JsonProperty("oldTotal")
  public Amount getOldTotal() {
    return oldTotal;
  }

  public void setOldTotal(Amount oldTotal) {
    this.oldTotal = oldTotal;
  }

  public HotelPrice oldTotal(Amount oldTotal) {
    this.oldTotal = oldTotal;
    return this;
  }

 /**
   * Total amount after taxes
   * @return total
  **/
  @JsonProperty("total")
  public Amount getTotal() {
    return total;
  }

  public void setTotal(Amount total) {
    this.total = total;
  }

  public HotelPrice total(Amount total) {
    this.total = total;
    return this;
  }

 /**
   * Total amount before taxes
   * @return base
  **/
  @JsonProperty("base")
  public Amount getBase() {
    return base;
  }

  public void setBase(Amount base) {
    this.base = base;
  }

  public HotelPrice base(Amount base) {
    this.base = base;
    return this;
  }

 /**
   * Get taxes
   * @return taxes
  **/
  @JsonProperty("taxes")
  public List<HotelTax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<HotelTax> taxes) {
    this.taxes = taxes;
  }

  public HotelPrice taxes(List<HotelTax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public HotelPrice addTaxesItem(HotelTax taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

 /**
   * some prices may vary during a stay. It shows the rate changes during the stay and the average daily rate
   * @return variations
  **/
  @JsonProperty("variations")
  public PriceVariations getVariations() {
    return variations;
  }

  public void setVariations(PriceVariations variations) {
    this.variations = variations;
  }

  public HotelPrice variations(PriceVariations variations) {
    this.variations = variations;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelPrice {\n");
    
    sb.append("    oldTotal: ").append(toIndentedString(oldTotal)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
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

