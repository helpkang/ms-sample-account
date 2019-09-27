package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.PaymentTransaction;
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
  * A Payment record contains the payment transaction(s) that has been made to pay the order. It includes details such as the amount covered by the payment as well as the payment method used to proceed with the payment. A Payment Record can be associated to flights, travelers, seats and services. 
 **/
@ApiModel(description="A Payment record contains the payment transaction(s) that has been made to pay the order. It includes details such as the amount covered by the payment as well as the payment method used to proceed with the payment. A Payment Record can be associated to flights, travelers, seats and services. ")
public class PaymentRecord  {
  
  @ApiModelProperty(required = true, value = "Id of the Payment Record")
 /**
   * Id of the Payment Record
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "A list of payment transaction made on that record.")
 /**
   * A list of payment transaction made on that record.
  **/
  private List<PaymentTransaction> paymentTransactions = new ArrayList<>();

  @ApiModelProperty(value = "A list of travelers associated to this payment record. If not specified, the payment record applies to all travelers")
 /**
   * A list of travelers associated to this payment record. If not specified, the payment record applies to all travelers
  **/
  private List<String> travelerIds = null;

  @ApiModelProperty(value = "A list of flights associated to this payment record. If not specified, the payment record applies to all flights")
 /**
   * A list of flights associated to this payment record. If not specified, the payment record applies to all flights
  **/
  private List<String> flightIds = null;

  @ApiModelProperty(value = "A list of Services associated to this payment record.")
 /**
   * A list of Services associated to this payment record.
  **/
  private List<String> serviceItemIds = null;

  @ApiModelProperty(value = "A list of Seats associated to this payment record.")
 /**
   * A list of Seats associated to this payment record.
  **/
  private List<String> seatItemIds = null;
 /**
   * Id of the Payment Record
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentRecord id(String id) {
    this.id = id;
    return this;
  }

 /**
   * A list of payment transaction made on that record.
   * @return paymentTransactions
  **/
  @JsonProperty("paymentTransactions")
  public List<PaymentTransaction> getPaymentTransactions() {
    return paymentTransactions;
  }

  public void setPaymentTransactions(List<PaymentTransaction> paymentTransactions) {
    this.paymentTransactions = paymentTransactions;
  }

  public PaymentRecord paymentTransactions(List<PaymentTransaction> paymentTransactions) {
    this.paymentTransactions = paymentTransactions;
    return this;
  }

  public PaymentRecord addPaymentTransactionsItem(PaymentTransaction paymentTransactionsItem) {
    this.paymentTransactions.add(paymentTransactionsItem);
    return this;
  }

 /**
   * A list of travelers associated to this payment record. If not specified, the payment record applies to all travelers
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public PaymentRecord travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public PaymentRecord addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * A list of flights associated to this payment record. If not specified, the payment record applies to all flights
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public PaymentRecord flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public PaymentRecord addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }

 /**
   * A list of Services associated to this payment record.
   * @return serviceItemIds
  **/
  @JsonProperty("serviceItemIds")
  public List<String> getServiceItemIds() {
    return serviceItemIds;
  }

  public void setServiceItemIds(List<String> serviceItemIds) {
    this.serviceItemIds = serviceItemIds;
  }

  public PaymentRecord serviceItemIds(List<String> serviceItemIds) {
    this.serviceItemIds = serviceItemIds;
    return this;
  }

  public PaymentRecord addServiceItemIdsItem(String serviceItemIdsItem) {
    this.serviceItemIds.add(serviceItemIdsItem);
    return this;
  }

 /**
   * A list of Seats associated to this payment record.
   * @return seatItemIds
  **/
  @JsonProperty("seatItemIds")
  public List<String> getSeatItemIds() {
    return seatItemIds;
  }

  public void setSeatItemIds(List<String> seatItemIds) {
    this.seatItemIds = seatItemIds;
  }

  public PaymentRecord seatItemIds(List<String> seatItemIds) {
    this.seatItemIds = seatItemIds;
    return this;
  }

  public PaymentRecord addSeatItemIdsItem(String seatItemIdsItem) {
    this.seatItemIds.add(seatItemIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRecord {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentTransactions: ").append(toIndentedString(paymentTransactions)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
    sb.append("    serviceItemIds: ").append(toIndentedString(serviceItemIds)).append("\n");
    sb.append("    seatItemIds: ").append(toIndentedString(seatItemIds)).append("\n");
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

