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
  * Input needed to price selected upgrades on a journey
 **/
@ApiModel(description="Input needed to price selected upgrades on a journey")
public class JourneyUpgradePriceRequest  {
  
  @ApiModelProperty(required = true, value = "List of IDs of individual upgrades that the customer has selected. This allows the server to provide the final price for the selection")
 /**
   * List of IDs of individual upgrades that the customer has selected. This allows the server to provide the final price for the selection
  **/
  private List<String> upgradeIds = new ArrayList<>();
 /**
   * List of IDs of individual upgrades that the customer has selected. This allows the server to provide the final price for the selection
   * @return upgradeIds
  **/
  @JsonProperty("upgradeIds")
  public List<String> getUpgradeIds() {
    return upgradeIds;
  }

  public void setUpgradeIds(List<String> upgradeIds) {
    this.upgradeIds = upgradeIds;
  }

  public JourneyUpgradePriceRequest upgradeIds(List<String> upgradeIds) {
    this.upgradeIds = upgradeIds;
    return this;
  }

  public JourneyUpgradePriceRequest addUpgradeIdsItem(String upgradeIdsItem) {
    this.upgradeIds.add(upgradeIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyUpgradePriceRequest {\n");
    
    sb.append("    upgradeIds: ").append(toIndentedString(upgradeIds)).append("\n");
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

