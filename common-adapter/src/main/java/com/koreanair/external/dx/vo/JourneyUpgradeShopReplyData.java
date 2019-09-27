package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Account;
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
  * Data containing all the upgrade options for the journey with their individual prices. In addition, any relevant account balances
 **/
@ApiModel(description="Data containing all the upgrade options for the journey with their individual prices. In addition, any relevant account balances")
public class JourneyUpgradeShopReplyData  {
  
  @ApiModelProperty(value = "List of available upgrades for this journey")
 /**
   * List of available upgrades for this journey
  **/
  private List<JourneyElementUpgrade> availableUpgrades = null;

  @ApiModelProperty(value = "the balance of the relevant customer account(s) e.g. miles, upgrade credits")
 /**
   * the balance of the relevant customer account(s) e.g. miles, upgrade credits
  **/
  private List<Account> accountBalances = null;
 /**
   * List of available upgrades for this journey
   * @return availableUpgrades
  **/
  @JsonProperty("availableUpgrades")
  public List<JourneyElementUpgrade> getAvailableUpgrades() {
    return availableUpgrades;
  }

  public void setAvailableUpgrades(List<JourneyElementUpgrade> availableUpgrades) {
    this.availableUpgrades = availableUpgrades;
  }

  public JourneyUpgradeShopReplyData availableUpgrades(List<JourneyElementUpgrade> availableUpgrades) {
    this.availableUpgrades = availableUpgrades;
    return this;
  }

  public JourneyUpgradeShopReplyData addAvailableUpgradesItem(JourneyElementUpgrade availableUpgradesItem) {
    this.availableUpgrades.add(availableUpgradesItem);
    return this;
  }

 /**
   * the balance of the relevant customer account(s) e.g. miles, upgrade credits
   * @return accountBalances
  **/
  @JsonProperty("accountBalances")
  public List<Account> getAccountBalances() {
    return accountBalances;
  }

  public void setAccountBalances(List<Account> accountBalances) {
    this.accountBalances = accountBalances;
  }

  public JourneyUpgradeShopReplyData accountBalances(List<Account> accountBalances) {
    this.accountBalances = accountBalances;
    return this;
  }

  public JourneyUpgradeShopReplyData addAccountBalancesItem(Account accountBalancesItem) {
    this.accountBalances.add(accountBalancesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyUpgradeShopReplyData {\n");
    
    sb.append("    availableUpgrades: ").append(toIndentedString(availableUpgrades)).append("\n");
    sb.append("    accountBalances: ").append(toIndentedString(accountBalances)).append("\n");
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

