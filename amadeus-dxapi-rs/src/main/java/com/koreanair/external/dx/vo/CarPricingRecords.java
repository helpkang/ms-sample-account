package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CarAdditionalOptions;
import com.koreanair.external.dx.vo.CarDueTimePrice;
import com.koreanair.external.dx.vo.CarPrice;
import com.koreanair.external.dx.vo.CarRatePlanPrice;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CarPricingRecords  {
  
  @ApiModelProperty(value = "")
  private CarRatePlanPrice ratePlanPrice = null;

  @ApiModelProperty(value = "")
  private CarPrice estimatedTotal = null;

  @ApiModelProperty(value = "")
  private CarAdditionalOptions additionalOptions = null;

  @ApiModelProperty(value = "")
  private CarDueTimePrice dueTimePrices = null;
 /**
   * Get ratePlanPrice
   * @return ratePlanPrice
  **/
  @JsonProperty("ratePlanPrice")
  public CarRatePlanPrice getRatePlanPrice() {
    return ratePlanPrice;
  }

  public void setRatePlanPrice(CarRatePlanPrice ratePlanPrice) {
    this.ratePlanPrice = ratePlanPrice;
  }

  public CarPricingRecords ratePlanPrice(CarRatePlanPrice ratePlanPrice) {
    this.ratePlanPrice = ratePlanPrice;
    return this;
  }

 /**
   * Get estimatedTotal
   * @return estimatedTotal
  **/
  @JsonProperty("estimatedTotal")
  public CarPrice getEstimatedTotal() {
    return estimatedTotal;
  }

  public void setEstimatedTotal(CarPrice estimatedTotal) {
    this.estimatedTotal = estimatedTotal;
  }

  public CarPricingRecords estimatedTotal(CarPrice estimatedTotal) {
    this.estimatedTotal = estimatedTotal;
    return this;
  }

 /**
   * Get additionalOptions
   * @return additionalOptions
  **/
  @JsonProperty("additionalOptions")
  public CarAdditionalOptions getAdditionalOptions() {
    return additionalOptions;
  }

  public void setAdditionalOptions(CarAdditionalOptions additionalOptions) {
    this.additionalOptions = additionalOptions;
  }

  public CarPricingRecords additionalOptions(CarAdditionalOptions additionalOptions) {
    this.additionalOptions = additionalOptions;
    return this;
  }

 /**
   * Get dueTimePrices
   * @return dueTimePrices
  **/
  @JsonProperty("dueTimePrices")
  public CarDueTimePrice getDueTimePrices() {
    return dueTimePrices;
  }

  public void setDueTimePrices(CarDueTimePrice dueTimePrices) {
    this.dueTimePrices = dueTimePrices;
  }

  public CarPricingRecords dueTimePrices(CarDueTimePrice dueTimePrices) {
    this.dueTimePrices = dueTimePrices;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarPricingRecords {\n");
    
    sb.append("    ratePlanPrice: ").append(toIndentedString(ratePlanPrice)).append("\n");
    sb.append("    estimatedTotal: ").append(toIndentedString(estimatedTotal)).append("\n");
    sb.append("    additionalOptions: ").append(toIndentedString(additionalOptions)).append("\n");
    sb.append("    dueTimePrices: ").append(toIndentedString(dueTimePrices)).append("\n");
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

