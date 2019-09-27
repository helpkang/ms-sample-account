package com.koreanair.external.dx.vo;

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
  * This eligibility describes if this order can be canceled.  Deletion is only allowed if the order has not yet been paid. Specifically, the order must not have been ticketed and  its payment must not be marked pending from an external payment.
 **/
@ApiModel(description="This eligibility describes if this order can be canceled.  Deletion is only allowed if the order has not yet been paid. Specifically, the order must not have been ticketed and  its payment must not be marked pending from an external payment.")
public class OrderCancelEligibility  {
  
  @ApiModelProperty(required = true, value = "If true, this order can be deleted.")
 /**
   * If true, this order can be deleted.
  **/
  private Boolean isEligible = false;
 /**
   * If true, this order can be deleted.
   * @return isEligible
  **/
  @JsonProperty("isEligible")
  public Boolean isIsEligible() {
    return isEligible;
  }

  public void setIsEligible(Boolean isEligible) {
    this.isEligible = isEligible;
  }

  public OrderCancelEligibility isEligible(Boolean isEligible) {
    this.isEligible = isEligible;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCancelEligibility {\n");
    
    sb.append("    isEligible: ").append(toIndentedString(isEligible)).append("\n");
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

