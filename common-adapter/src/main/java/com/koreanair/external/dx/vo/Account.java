package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
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
  * Container for a customer account e.g. miles, upgrade credits
 **/
@ApiModel(description="Container for a customer account e.g. miles, upgrade credits")
public class Account  {
  
  @ApiModelProperty(value = "ID of this account")
 /**
   * ID of this account
  **/
  private String accountId = null;

  @ApiModelProperty(value = "Traveler to whom this account belongs")
 /**
   * Traveler to whom this account belongs
  **/
  private String travelerId = null;

  @ApiModelProperty(value = "the balance of this account")
 /**
   * the balance of this account
  **/
  private Amount accountBalance = null;
 /**
   * ID of this account
   * @return accountId
  **/
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Account accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Traveler to whom this account belongs
   * @return travelerId
  **/
  @JsonProperty("travelerId")
  public String getTravelerId() {
    return travelerId;
  }

  public void setTravelerId(String travelerId) {
    this.travelerId = travelerId;
  }

  public Account travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }

 /**
   * the balance of this account
   * @return accountBalance
  **/
  @JsonProperty("accountBalance")
  public Amount getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(Amount accountBalance) {
    this.accountBalance = accountBalance;
  }

  public Account accountBalance(Amount accountBalance) {
    this.accountBalance = accountBalance;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
    sb.append("    accountBalance: ").append(toIndentedString(accountBalance)).append("\n");
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

