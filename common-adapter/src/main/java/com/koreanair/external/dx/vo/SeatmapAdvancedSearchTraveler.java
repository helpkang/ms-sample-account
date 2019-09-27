package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.SearchFrequentFlyer;
import com.koreanair.external.dx.vo.SearchTraveler;
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
  * Object used to define a traveler in input of advanced seatmap
 **/
@ApiModel(description="Object used to define a traveler in input of advanced seatmap")
public class SeatmapAdvancedSearchTraveler  {
  
  @ApiModelProperty(example = "ADT", required = true, value = "It corresponds to a [Passenger type code](http://api.dev.amadeus.net/api/Development/common/codelist/PNR_PassengerType.htm) 'INF' corresponds to an infant without seat automatically associated to the first eligible traveler provided in the list ")
 /**
   * It corresponds to a [Passenger type code](http://api.dev.amadeus.net/api/Development/common/codelist/PNR_PassengerType.htm) 'INF' corresponds to an infant without seat automatically associated to the first eligible traveler provided in the list 
  **/
  private String passengerTypeCode = null;

  @ApiModelProperty(value = "Frequent flyer accounts information")
 /**
   * Frequent flyer accounts information
  **/
  private List<SearchFrequentFlyer> frequentFlyerCards = null;

  @ApiModelProperty(example = "PAX1", value = "temporary id used to map travelers in the request with travelers in the response. only valid the time of the transaction")
 /**
   * temporary id used to map travelers in the request with travelers in the response. only valid the time of the transaction
  **/
  private String tid = null;

  @ApiModelProperty(example = "Arthur Ignatius", value = "Individual first name. If the person has middle names, both first and middle name should be added here (e.g. Arthur Ignatius)")
 /**
   * Individual first name. If the person has middle names, both first and middle name should be added here (e.g. Arthur Ignatius)
  **/
  private String firstName = null;

  @ApiModelProperty(example = "Holmes", value = "")
  private String lastName = null;

  @ApiModelProperty(example = "Dr", value = "Individual title (MR Mister ...)")
 /**
   * Individual title (MR Mister ...)
  **/
  private String title = null;

  @ApiModelProperty(value = "Defines if the seatmap should be computed for this traveler.")
 /**
   * Defines if the seatmap should be computed for this traveler.
  **/
  private Boolean isRequestedTraveler = null;
 /**
   * It corresponds to a [Passenger type code](http://api.dev.amadeus.net/api/Development/common/codelist/PNR_PassengerType.htm) &#39;INF&#39; corresponds to an infant without seat automatically associated to the first eligible traveler provided in the list 
   * @return passengerTypeCode
  **/
  @JsonProperty("passengerTypeCode")
  public String getPassengerTypeCode() {
    return passengerTypeCode;
  }

  public void setPassengerTypeCode(String passengerTypeCode) {
    this.passengerTypeCode = passengerTypeCode;
  }

  public SeatmapAdvancedSearchTraveler passengerTypeCode(String passengerTypeCode) {
    this.passengerTypeCode = passengerTypeCode;
    return this;
  }

 /**
   * Frequent flyer accounts information
   * @return frequentFlyerCards
  **/
  @JsonProperty("frequentFlyerCards")
  public List<SearchFrequentFlyer> getFrequentFlyerCards() {
    return frequentFlyerCards;
  }

  public void setFrequentFlyerCards(List<SearchFrequentFlyer> frequentFlyerCards) {
    this.frequentFlyerCards = frequentFlyerCards;
  }

  public SeatmapAdvancedSearchTraveler frequentFlyerCards(List<SearchFrequentFlyer> frequentFlyerCards) {
    this.frequentFlyerCards = frequentFlyerCards;
    return this;
  }

  public SeatmapAdvancedSearchTraveler addFrequentFlyerCardsItem(SearchFrequentFlyer frequentFlyerCardsItem) {
    this.frequentFlyerCards.add(frequentFlyerCardsItem);
    return this;
  }

 /**
   * temporary id used to map travelers in the request with travelers in the response. only valid the time of the transaction
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public SeatmapAdvancedSearchTraveler tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * Individual first name. If the person has middle names, both first and middle name should be added here (e.g. Arthur Ignatius)
   * @return firstName
  **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public SeatmapAdvancedSearchTraveler firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * Get lastName
   * @return lastName
  **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public SeatmapAdvancedSearchTraveler lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * Individual title (MR Mister ...)
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SeatmapAdvancedSearchTraveler title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Defines if the seatmap should be computed for this traveler.
   * @return isRequestedTraveler
  **/
  @JsonProperty("isRequestedTraveler")
  public Boolean isIsRequestedTraveler() {
    return isRequestedTraveler;
  }

  public void setIsRequestedTraveler(Boolean isRequestedTraveler) {
    this.isRequestedTraveler = isRequestedTraveler;
  }

  public SeatmapAdvancedSearchTraveler isRequestedTraveler(Boolean isRequestedTraveler) {
    this.isRequestedTraveler = isRequestedTraveler;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatmapAdvancedSearchTraveler {\n");
    
    sb.append("    passengerTypeCode: ").append(toIndentedString(passengerTypeCode)).append("\n");
    sb.append("    frequentFlyerCards: ").append(toIndentedString(frequentFlyerCards)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    isRequestedTraveler: ").append(toIndentedString(isRequestedTraveler)).append("\n");
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

