package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import io.swagger.annotations.ApiModel;
import java.time.LocalDateTime;
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
  * Contains the data that are safe from tampering thanks to the checksum. The DAPI user should concatenate those properties and calculate the checksum thanks the secret key that has been shared by Amadeus to the API user. 
 **/
@ApiModel(description="Contains the data that are safe from tampering thanks to the checksum. The DAPI user should concatenate those properties and calculate the checksum thanks the secret key that has been shared by Amadeus to the API user. ")
public class ChecksumData  {
  
  @ApiModelProperty(required = true, value = "Id of the Order to be paid")
 /**
   * Id of the Order to be paid
  **/
  private String orderId = null;

  @ApiModelProperty(required = true, value = "Creation date of the order in GMT (Example: 2018-02-10T20:40:12Z)")
 /**
   * Creation date of the order in GMT (Example: 2018-02-10T20:40:12Z)
  **/
  private LocalDateTime creationDate = null;

  @ApiModelProperty(required = true, value = "Price that should be paid through External Payment")
 /**
   * Price that should be paid through External Payment
  **/
  private Amount priceToPay = null;

  @ApiModelProperty(value = "List of Service taken into account during the Checksum calculation")
 /**
   * List of Service taken into account during the Checksum calculation
  **/
  private List<String> serviceItemIds = null;

  @ApiModelProperty(value = "List of Seat taken into account during the Checksum calculation")
 /**
   * List of Seat taken into account during the Checksum calculation
  **/
  private List<String> seatItemIds = null;
 /**
   * Id of the Order to be paid
   * @return orderId
  **/
  @JsonProperty("orderId")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public ChecksumData orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * Creation date of the order in GMT (Example: 2018-02-10T20:40:12Z)
   * @return creationDate
  **/
  @JsonProperty("creationDate")
  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ChecksumData creationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

 /**
   * Price that should be paid through External Payment
   * @return priceToPay
  **/
  @JsonProperty("priceToPay")
  public Amount getPriceToPay() {
    return priceToPay;
  }

  public void setPriceToPay(Amount priceToPay) {
    this.priceToPay = priceToPay;
  }

  public ChecksumData priceToPay(Amount priceToPay) {
    this.priceToPay = priceToPay;
    return this;
  }

 /**
   * List of Service taken into account during the Checksum calculation
   * @return serviceItemIds
  **/
  @JsonProperty("serviceItemIds")
  public List<String> getServiceItemIds() {
    return serviceItemIds;
  }

  public void setServiceItemIds(List<String> serviceItemIds) {
    this.serviceItemIds = serviceItemIds;
  }

  public ChecksumData serviceItemIds(List<String> serviceItemIds) {
    this.serviceItemIds = serviceItemIds;
    return this;
  }

  public ChecksumData addServiceItemIdsItem(String serviceItemIdsItem) {
    this.serviceItemIds.add(serviceItemIdsItem);
    return this;
  }

 /**
   * List of Seat taken into account during the Checksum calculation
   * @return seatItemIds
  **/
  @JsonProperty("seatItemIds")
  public List<String> getSeatItemIds() {
    return seatItemIds;
  }

  public void setSeatItemIds(List<String> seatItemIds) {
    this.seatItemIds = seatItemIds;
  }

  public ChecksumData seatItemIds(List<String> seatItemIds) {
    this.seatItemIds = seatItemIds;
    return this;
  }

  public ChecksumData addSeatItemIdsItem(String seatItemIdsItem) {
    this.seatItemIds.add(seatItemIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChecksumData {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    priceToPay: ").append(toIndentedString(priceToPay)).append("\n");
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

