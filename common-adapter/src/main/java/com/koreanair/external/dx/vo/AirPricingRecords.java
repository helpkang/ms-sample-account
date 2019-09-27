package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.MilesConversion;
import com.koreanair.external.dx.vo.Price;
import com.koreanair.external.dx.vo.UnitPrice;
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
public class AirPricingRecords  {
  
  @ApiModelProperty(value = "List of Unit prices, where the UnitPrice expresses a price per single traveler type. It can be expressed in several currencies (cash or miles), thus this list will contain only one element when a single currency is used.")
 /**
   * List of Unit prices, where the UnitPrice expresses a price per single traveler type. It can be expressed in several currencies (cash or miles), thus this list will contain only one element when a single currency is used.
  **/
  private List<UnitPrice> unitPrices = null;

  @ApiModelProperty(required = true, value = "List of Total prices. It can be expressed in several currencies (cash or miles), thus this list will contain only one element when a single currency is used. ")
 /**
   * List of Total prices. It can be expressed in several currencies (cash or miles), thus this list will contain only one element when a single currency is used. 
  **/
  private List<Price> totalPrices = new ArrayList<>();

  @ApiModelProperty(value = "If true, it indicates that payment needs to be done in miles.  Note : In case, marginal fare solution needs to be combined with non marginal fare or vice versa in bound by bound display,   then it is up to the API user to detect which bound is marginal.")
 /**
   * If true, it indicates that payment needs to be done in miles.  Note : In case, marginal fare solution needs to be combined with non marginal fare or vice versa in bound by bound display,   then it is up to the API user to detect which bound is marginal.
  **/
  private Boolean isMarginal = null;

  @ApiModelProperty(value = "Contains information about converted miles and non converted cash when Award converter is used")
 /**
   * Contains information about converted miles and non converted cash when Award converter is used
  **/
  private MilesConversion milesConversion = null;
 /**
   * List of Unit prices, where the UnitPrice expresses a price per single traveler type. It can be expressed in several currencies (cash or miles), thus this list will contain only one element when a single currency is used.
   * @return unitPrices
  **/
  @JsonProperty("unitPrices")
  public List<UnitPrice> getUnitPrices() {
    return unitPrices;
  }

  public void setUnitPrices(List<UnitPrice> unitPrices) {
    this.unitPrices = unitPrices;
  }

  public AirPricingRecords unitPrices(List<UnitPrice> unitPrices) {
    this.unitPrices = unitPrices;
    return this;
  }

  public AirPricingRecords addUnitPricesItem(UnitPrice unitPricesItem) {
    this.unitPrices.add(unitPricesItem);
    return this;
  }

 /**
   * List of Total prices. It can be expressed in several currencies (cash or miles), thus this list will contain only one element when a single currency is used. 
   * @return totalPrices
  **/
  @JsonProperty("totalPrices")
  public List<Price> getTotalPrices() {
    return totalPrices;
  }

  public void setTotalPrices(List<Price> totalPrices) {
    this.totalPrices = totalPrices;
  }

  public AirPricingRecords totalPrices(List<Price> totalPrices) {
    this.totalPrices = totalPrices;
    return this;
  }

  public AirPricingRecords addTotalPricesItem(Price totalPricesItem) {
    this.totalPrices.add(totalPricesItem);
    return this;
  }

 /**
   * If true, it indicates that payment needs to be done in miles.  Note : In case, marginal fare solution needs to be combined with non marginal fare or vice versa in bound by bound display,   then it is up to the API user to detect which bound is marginal.
   * @return isMarginal
  **/
  @JsonProperty("isMarginal")
  public Boolean isIsMarginal() {
    return isMarginal;
  }

  public void setIsMarginal(Boolean isMarginal) {
    this.isMarginal = isMarginal;
  }

  public AirPricingRecords isMarginal(Boolean isMarginal) {
    this.isMarginal = isMarginal;
    return this;
  }

 /**
   * Contains information about converted miles and non converted cash when Award converter is used
   * @return milesConversion
  **/
  @JsonProperty("milesConversion")
  public MilesConversion getMilesConversion() {
    return milesConversion;
  }

  public void setMilesConversion(MilesConversion milesConversion) {
    this.milesConversion = milesConversion;
  }

  public AirPricingRecords milesConversion(MilesConversion milesConversion) {
    this.milesConversion = milesConversion;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirPricingRecords {\n");
    
    sb.append("    unitPrices: ").append(toIndentedString(unitPrices)).append("\n");
    sb.append("    totalPrices: ").append(toIndentedString(totalPrices)).append("\n");
    sb.append("    isMarginal: ").append(toIndentedString(isMarginal)).append("\n");
    sb.append("    milesConversion: ").append(toIndentedString(milesConversion)).append("\n");
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

