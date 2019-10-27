package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FlightChangeEligibility;
import com.koreanair.external.dx.vo.FlightReaccommodationEligibility;
import com.koreanair.external.dx.vo.OrderCancelEligibility;
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
  * Eligibilities for modifications and cancellation of this order.
 **/
@ApiModel(description="Eligibilities for modifications and cancellation of this order.")
public class OrderEligibilities  {
  
  @ApiModelProperty(required = true, value = "This eligibility describes if and how flights in this order can be changed for each bound in this order.")
 /**
   * This eligibility describes if and how flights in this order can be changed for each bound in this order.
  **/
  private List<FlightChangeEligibility> change = new ArrayList<>();

  @ApiModelProperty(required = true, value = "This eligbility describes if this order can be cancelled.")
 /**
   * This eligbility describes if this order can be cancelled.
  **/
  private OrderCancelEligibility cancel = null;

  @ApiModelProperty(value = "Indicates the eligibility to change/accept/decline a bound that has been reaccommodated after a disruption.")
 /**
   * Indicates the eligibility to change/accept/decline a bound that has been reaccommodated after a disruption.
  **/
  private FlightReaccommodationEligibility flightReaccommodation = null;
 /**
   * This eligibility describes if and how flights in this order can be changed for each bound in this order.
   * @return change
  **/
  @JsonProperty("change")
  public List<FlightChangeEligibility> getChange() {
    return change;
  }

  public void setChange(List<FlightChangeEligibility> change) {
    this.change = change;
  }

  public OrderEligibilities change(List<FlightChangeEligibility> change) {
    this.change = change;
    return this;
  }

  public OrderEligibilities addChangeItem(FlightChangeEligibility changeItem) {
    this.change.add(changeItem);
    return this;
  }

 /**
   * This eligbility describes if this order can be cancelled.
   * @return cancel
  **/
  @JsonProperty("cancel")
  public OrderCancelEligibility getCancel() {
    return cancel;
  }

  public void setCancel(OrderCancelEligibility cancel) {
    this.cancel = cancel;
  }

  public OrderEligibilities cancel(OrderCancelEligibility cancel) {
    this.cancel = cancel;
    return this;
  }

 /**
   * Indicates the eligibility to change/accept/decline a bound that has been reaccommodated after a disruption.
   * @return flightReaccommodation
  **/
  @JsonProperty("flightReaccommodation")
  public FlightReaccommodationEligibility getFlightReaccommodation() {
    return flightReaccommodation;
  }

  public void setFlightReaccommodation(FlightReaccommodationEligibility flightReaccommodation) {
    this.flightReaccommodation = flightReaccommodation;
  }

  public OrderEligibilities flightReaccommodation(FlightReaccommodationEligibility flightReaccommodation) {
    this.flightReaccommodation = flightReaccommodation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderEligibilities {\n");
    
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    cancel: ").append(toIndentedString(cancel)).append("\n");
    sb.append("    flightReaccommodation: ").append(toIndentedString(flightReaccommodation)).append("\n");
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

