package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CancellationPolicy;
import com.koreanair.external.dx.vo.CheckInOutPolicy;
import com.koreanair.external.dx.vo.GuaranteePolicy;
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

public class PolicyDetails  {
  
  @ApiModelProperty(value = "")
  private GuaranteePolicy guarantee = null;

  @ApiModelProperty(value = "")
  private GuaranteePolicy deposit = null;

  @ApiModelProperty(value = "")
  private GuaranteePolicy prepay = null;

  @ApiModelProperty(value = "")
  private GuaranteePolicy holdTime = null;

  @ApiModelProperty(value = "")
  private List<CancellationPolicy> cancellations = null;

  @ApiModelProperty(value = "")
  private CheckInOutPolicy checkInOut = null;
 /**
   * Get guarantee
   * @return guarantee
  **/
  @JsonProperty("guarantee")
  public GuaranteePolicy getGuarantee() {
    return guarantee;
  }

  public void setGuarantee(GuaranteePolicy guarantee) {
    this.guarantee = guarantee;
  }

  public PolicyDetails guarantee(GuaranteePolicy guarantee) {
    this.guarantee = guarantee;
    return this;
  }

 /**
   * Get deposit
   * @return deposit
  **/
  @JsonProperty("deposit")
  public GuaranteePolicy getDeposit() {
    return deposit;
  }

  public void setDeposit(GuaranteePolicy deposit) {
    this.deposit = deposit;
  }

  public PolicyDetails deposit(GuaranteePolicy deposit) {
    this.deposit = deposit;
    return this;
  }

 /**
   * Get prepay
   * @return prepay
  **/
  @JsonProperty("prepay")
  public GuaranteePolicy getPrepay() {
    return prepay;
  }

  public void setPrepay(GuaranteePolicy prepay) {
    this.prepay = prepay;
  }

  public PolicyDetails prepay(GuaranteePolicy prepay) {
    this.prepay = prepay;
    return this;
  }

 /**
   * Get holdTime
   * @return holdTime
  **/
  @JsonProperty("holdTime")
  public GuaranteePolicy getHoldTime() {
    return holdTime;
  }

  public void setHoldTime(GuaranteePolicy holdTime) {
    this.holdTime = holdTime;
  }

  public PolicyDetails holdTime(GuaranteePolicy holdTime) {
    this.holdTime = holdTime;
    return this;
  }

 /**
   * Get cancellations
   * @return cancellations
  **/
  @JsonProperty("cancellations")
  public List<CancellationPolicy> getCancellations() {
    return cancellations;
  }

  public void setCancellations(List<CancellationPolicy> cancellations) {
    this.cancellations = cancellations;
  }

  public PolicyDetails cancellations(List<CancellationPolicy> cancellations) {
    this.cancellations = cancellations;
    return this;
  }

  public PolicyDetails addCancellationsItem(CancellationPolicy cancellationsItem) {
    this.cancellations.add(cancellationsItem);
    return this;
  }

 /**
   * Get checkInOut
   * @return checkInOut
  **/
  @JsonProperty("checkInOut")
  public CheckInOutPolicy getCheckInOut() {
    return checkInOut;
  }

  public void setCheckInOut(CheckInOutPolicy checkInOut) {
    this.checkInOut = checkInOut;
  }

  public PolicyDetails checkInOut(CheckInOutPolicy checkInOut) {
    this.checkInOut = checkInOut;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyDetails {\n");
    
    sb.append("    guarantee: ").append(toIndentedString(guarantee)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    prepay: ").append(toIndentedString(prepay)).append("\n");
    sb.append("    holdTime: ").append(toIndentedString(holdTime)).append("\n");
    sb.append("    cancellations: ").append(toIndentedString(cancellations)).append("\n");
    sb.append("    checkInOut: ").append(toIndentedString(checkInOut)).append("\n");
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

