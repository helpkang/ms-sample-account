package com.koreanair.external.dx.vo;

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
  * Used to specify the flights, services and travelers an element is associated with. Allowed associations may depend on the type of element in use
 **/
@ApiModel(description="Used to specify the flights, services and travelers an element is associated with. Allowed associations may depend on the type of element in use")
public class ItemsAssociation  {
  
  @ApiModelProperty(value = "Flight ids the element is associated with")
 /**
   * Flight ids the element is associated with
  **/
  private List<String> flightIds = null;

  @ApiModelProperty(value = "Service ids the element is associated with")
 /**
   * Service ids the element is associated with
  **/
  private List<String> serviceIds = null;

  @ApiModelProperty(value = "Traveler ids the element is associated with")
 /**
   * Traveler ids the element is associated with
  **/
  private List<String> travelerIds = null;

  @ApiModelProperty(value = "Temporary traveler ids the element is associated with")
 /**
   * Temporary traveler ids the element is associated with
  **/
  private List<String> travelerTIds = null;
 /**
   * Flight ids the element is associated with
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public ItemsAssociation flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public ItemsAssociation addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }

 /**
   * Service ids the element is associated with
   * @return serviceIds
  **/
  @JsonProperty("serviceIds")
  public List<String> getServiceIds() {
    return serviceIds;
  }

  public void setServiceIds(List<String> serviceIds) {
    this.serviceIds = serviceIds;
  }

  public ItemsAssociation serviceIds(List<String> serviceIds) {
    this.serviceIds = serviceIds;
    return this;
  }

  public ItemsAssociation addServiceIdsItem(String serviceIdsItem) {
    this.serviceIds.add(serviceIdsItem);
    return this;
  }

 /**
   * Traveler ids the element is associated with
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public ItemsAssociation travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public ItemsAssociation addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * Temporary traveler ids the element is associated with
   * @return travelerTIds
  **/
  @JsonProperty("travelerTIds")
  public List<String> getTravelerTIds() {
    return travelerTIds;
  }

  public void setTravelerTIds(List<String> travelerTIds) {
    this.travelerTIds = travelerTIds;
  }

  public ItemsAssociation travelerTIds(List<String> travelerTIds) {
    this.travelerTIds = travelerTIds;
    return this;
  }

  public ItemsAssociation addTravelerTIdsItem(String travelerTIdsItem) {
    this.travelerTIds.add(travelerTIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemsAssociation {\n");
    
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
    sb.append("    serviceIds: ").append(toIndentedString(serviceIds)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
    sb.append("    travelerTIds: ").append(toIndentedString(travelerTIds)).append("\n");
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

