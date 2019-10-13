package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.JourneyElementUpgrade;
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
  * Reply containing a recap of the selected upgrades, and the total price
 **/
@ApiModel(description="Reply containing a recap of the selected upgrades, and the total price")
public class JourneyUpgradePriceReplyData  {
  
  @ApiModelProperty(value = "A recap of the selected upgrades")
 /**
   * A recap of the selected upgrades
  **/
  private List<JourneyElementUpgrade> upgrades = null;

  @ApiModelProperty(value = "Total price of the upgrades that were passed as selected in the query, after applying discounts. There may be multiple amounts involved, e.g. upgrade in miles + taxes in cash")
 /**
   * Total price of the upgrades that were passed as selected in the query, after applying discounts. There may be multiple amounts involved, e.g. upgrade in miles + taxes in cash
  **/
  private List<Amount> totalPrices = null;
 /**
   * A recap of the selected upgrades
   * @return upgrades
  **/
  @JsonProperty("upgrades")
  public List<JourneyElementUpgrade> getUpgrades() {
    return upgrades;
  }

  public void setUpgrades(List<JourneyElementUpgrade> upgrades) {
    this.upgrades = upgrades;
  }

  public JourneyUpgradePriceReplyData upgrades(List<JourneyElementUpgrade> upgrades) {
    this.upgrades = upgrades;
    return this;
  }

  public JourneyUpgradePriceReplyData addUpgradesItem(JourneyElementUpgrade upgradesItem) {
    this.upgrades.add(upgradesItem);
    return this;
  }

 /**
   * Total price of the upgrades that were passed as selected in the query, after applying discounts. There may be multiple amounts involved, e.g. upgrade in miles + taxes in cash
   * @return totalPrices
  **/
  @JsonProperty("totalPrices")
  public List<Amount> getTotalPrices() {
    return totalPrices;
  }

  public void setTotalPrices(List<Amount> totalPrices) {
    this.totalPrices = totalPrices;
  }

  public JourneyUpgradePriceReplyData totalPrices(List<Amount> totalPrices) {
    this.totalPrices = totalPrices;
    return this;
  }

  public JourneyUpgradePriceReplyData addTotalPricesItem(Amount totalPricesItem) {
    this.totalPrices.add(totalPricesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyUpgradePriceReplyData {\n");
    
    sb.append("    upgrades: ").append(toIndentedString(upgrades)).append("\n");
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

