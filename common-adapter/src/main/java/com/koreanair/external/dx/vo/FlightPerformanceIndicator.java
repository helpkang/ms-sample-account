package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;
import java.time.LocalDateTime;

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
  * Details of the flight on-time performance indicator
 **/
@ApiModel(description="Details of the flight on-time performance indicator")
public class FlightPerformanceIndicator  {
  
  @ApiModelProperty(value = "Percentage of on-time arrival (from 0 to 100)")
 /**
   * Percentage of on-time arrival (from 0 to 100)
  **/
  private Integer onTimeArrival = null;

  @ApiModelProperty(example = "2018-02-10T20:40:00+02:00", value = "Period from which the data are calculated")
 /**
   * Period from which the data are calculated
  **/
  private LocalDateTime calculationPeriod = null;

  @ApiModelProperty(value = "Accuracy of the percentage data")
 /**
   * Accuracy of the percentage data
  **/
  private String dataAccuracy = null;
 /**
   * Percentage of on-time arrival (from 0 to 100)
   * @return onTimeArrival
  **/
  @JsonProperty("onTimeArrival")
  public Integer getOnTimeArrival() {
    return onTimeArrival;
  }

  public void setOnTimeArrival(Integer onTimeArrival) {
    this.onTimeArrival = onTimeArrival;
  }

  public FlightPerformanceIndicator onTimeArrival(Integer onTimeArrival) {
    this.onTimeArrival = onTimeArrival;
    return this;
  }

 /**
   * Period from which the data are calculated
   * @return calculationPeriod
  **/
  @JsonProperty("calculationPeriod")
  public LocalDateTime getCalculationPeriod() {
    return calculationPeriod;
  }

  public void setCalculationPeriod(LocalDateTime calculationPeriod) {
    this.calculationPeriod = calculationPeriod;
  }

  public FlightPerformanceIndicator calculationPeriod(LocalDateTime calculationPeriod) {
    this.calculationPeriod = calculationPeriod;
    return this;
  }

 /**
   * Accuracy of the percentage data
   * @return dataAccuracy
  **/
  @JsonProperty("dataAccuracy")
  public String getDataAccuracy() {
    return dataAccuracy;
  }

  public void setDataAccuracy(String dataAccuracy) {
    this.dataAccuracy = dataAccuracy;
  }

  public FlightPerformanceIndicator dataAccuracy(String dataAccuracy) {
    this.dataAccuracy = dataAccuracy;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightPerformanceIndicator {\n");
    
    sb.append("    onTimeArrival: ").append(toIndentedString(onTimeArrival)).append("\n");
    sb.append("    calculationPeriod: ").append(toIndentedString(calculationPeriod)).append("\n");
    sb.append("    dataAccuracy: ").append(toIndentedString(dataAccuracy)).append("\n");
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

