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
  * All possible value indicating the monetary details over the Voucher
 **/
@ApiModel(description="All possible value indicating the monetary details over the Voucher")
public class VoucherValue  {
  
  @ApiModelProperty(required = true, value = "Represents the monetary amount currently available in the voucher")
 /**
   * Represents the monetary amount currently available in the voucher
  **/
  private Amount availableAmount = null;
 /**
   * Represents the monetary amount currently available in the voucher
   * @return availableAmount
  **/
  @JsonProperty("availableAmount")
  public Amount getAvailableAmount() {
    return availableAmount;
  }

  public void setAvailableAmount(Amount availableAmount) {
    this.availableAmount = availableAmount;
  }

  public VoucherValue availableAmount(Amount availableAmount) {
    this.availableAmount = availableAmount;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherValue {\n");
    
    sb.append("    availableAmount: ").append(toIndentedString(availableAmount)).append("\n");
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

