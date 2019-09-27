package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.MultiCurrencyPrice;
import com.koreanair.external.dx.vo.MultiCurrencyUnitPrice;
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
  * It stores the different price breakdowns for Air related resources
 **/
@ApiModel(description="It stores the different price breakdowns for Air related resources")
public class MultiCurrencyAirPricingRecords  {
  
  @ApiModelProperty(value = "List of Unit prices, where the UnitPrice expresses a price per single traveler type. It can be expressed in several currencies (cash or miles), thus this list will contain only one element when a single currency is used.")
 /**
   * List of Unit prices, where the UnitPrice expresses a price per single traveler type. It can be expressed in several currencies (cash or miles), thus this list will contain only one element when a single currency is used.
  **/
  private List<MultiCurrencyUnitPrice> unitPrices = null;

  @ApiModelProperty(required = true, value = "Global total price. It can be expressed in several currencies (cash or miles), thus this list will contain only one element when a single currency is used. ")
 /**
   * Global total price. It can be expressed in several currencies (cash or miles), thus this list will contain only one element when a single currency is used. 
  **/
  private List<MultiCurrencyPrice> totalPrices = new ArrayList<>();
 /**
   * List of Unit prices, where the UnitPrice expresses a price per single traveler type. It can be expressed in several currencies (cash or miles), thus this list will contain only one element when a single currency is used.
   * @return unitPrices
  **/
  @JsonProperty("unitPrices")
  public List<MultiCurrencyUnitPrice> getUnitPrices() {
    return unitPrices;
  }

  public void setUnitPrices(List<MultiCurrencyUnitPrice> unitPrices) {
    this.unitPrices = unitPrices;
  }

  public MultiCurrencyAirPricingRecords unitPrices(List<MultiCurrencyUnitPrice> unitPrices) {
    this.unitPrices = unitPrices;
    return this;
  }

  public MultiCurrencyAirPricingRecords addUnitPricesItem(MultiCurrencyUnitPrice unitPricesItem) {
    this.unitPrices.add(unitPricesItem);
    return this;
  }

 /**
   * Global total price. It can be expressed in several currencies (cash or miles), thus this list will contain only one element when a single currency is used. 
   * @return totalPrices
  **/
  @JsonProperty("totalPrices")
  public List<MultiCurrencyPrice> getTotalPrices() {
    return totalPrices;
  }

  public void setTotalPrices(List<MultiCurrencyPrice> totalPrices) {
    this.totalPrices = totalPrices;
  }

  public MultiCurrencyAirPricingRecords totalPrices(List<MultiCurrencyPrice> totalPrices) {
    this.totalPrices = totalPrices;
    return this;
  }

  public MultiCurrencyAirPricingRecords addTotalPricesItem(MultiCurrencyPrice totalPricesItem) {
    this.totalPrices.add(totalPricesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiCurrencyAirPricingRecords {\n");
    
    sb.append("    unitPrices: ").append(toIndentedString(unitPrices)).append("\n");
    sb.append("    totalPrices: ").append(toIndentedString(totalPrices)).append("\n");
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

