package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
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
  * Hotel offer related information to be stored in the cart when using the entry point POST /carts/{cartId}/hotel-offers/by-external-provider 
 **/
@ApiModel(description="Hotel offer related information to be stored in the cart when using the entry point POST /carts/{cartId}/hotel-offers/by-external-provider ")
public class HotelOfferRequest  {
  
  @ApiModelProperty(required = true, value = "Identifier of the accomodation offer")
 /**
   * Identifier of the accomodation offer
  **/
  private String hotelOfferId = null;

  @ApiModelProperty(value = "Textual description for the accomodation offer")
 /**
   * Textual description for the accomodation offer
  **/
  private String offerDescription = null;

  @ApiModelProperty(value = "Textual description for the room included in the offer")
 /**
   * Textual description for the room included in the offer
  **/
  private String roomDescription = null;

  @ApiModelProperty(value = "The included board type (meal) in the offer (e.g. breakfast, all inclusive)")
 /**
   * The included board type (meal) in the offer (e.g. breakfast, all inclusive)
  **/
  private String boardType = null;

  @ApiModelProperty(value = "Number of adults, 1 by default.")
 /**
   * Number of adults, 1 by default.
  **/
  private Integer adults = null;

  @ApiModelProperty(value = "Comma separated list of ages of each child and infant.  If 2 children have the same age, it will be repeated here. ")
 /**
   * Comma separated list of ages of each child and infant.  If 2 children have the same age, it will be repeated here. 
  **/
  private List<Integer> childAges = null;

  @ApiModelProperty(required = true, value = "Total accomodation price to be paid, taxes included")
 /**
   * Total accomodation price to be paid, taxes included
  **/
  private Amount totalPrice = null;

  @ApiModelProperty(value = "Cancellation policies attached to the accomodation offer")
 /**
   * Cancellation policies attached to the accomodation offer
  **/
  private List<String> cancellationPolicies = null;
 /**
   * Identifier of the accomodation offer
   * @return hotelOfferId
  **/
  @JsonProperty("hotelOfferId")
  public String getHotelOfferId() {
    return hotelOfferId;
  }

  public void setHotelOfferId(String hotelOfferId) {
    this.hotelOfferId = hotelOfferId;
  }

  public HotelOfferRequest hotelOfferId(String hotelOfferId) {
    this.hotelOfferId = hotelOfferId;
    return this;
  }

 /**
   * Textual description for the accomodation offer
   * @return offerDescription
  **/
  @JsonProperty("offerDescription")
  public String getOfferDescription() {
    return offerDescription;
  }

  public void setOfferDescription(String offerDescription) {
    this.offerDescription = offerDescription;
  }

  public HotelOfferRequest offerDescription(String offerDescription) {
    this.offerDescription = offerDescription;
    return this;
  }

 /**
   * Textual description for the room included in the offer
   * @return roomDescription
  **/
  @JsonProperty("roomDescription")
  public String getRoomDescription() {
    return roomDescription;
  }

  public void setRoomDescription(String roomDescription) {
    this.roomDescription = roomDescription;
  }

  public HotelOfferRequest roomDescription(String roomDescription) {
    this.roomDescription = roomDescription;
    return this;
  }

 /**
   * The included board type (meal) in the offer (e.g. breakfast, all inclusive)
   * @return boardType
  **/
  @JsonProperty("boardType")
  public String getBoardType() {
    return boardType;
  }

  public void setBoardType(String boardType) {
    this.boardType = boardType;
  }

  public HotelOfferRequest boardType(String boardType) {
    this.boardType = boardType;
    return this;
  }

 /**
   * Number of adults, 1 by default.
   * @return adults
  **/
  @JsonProperty("adults")
  public Integer getAdults() {
    return adults;
  }

  public void setAdults(Integer adults) {
    this.adults = adults;
  }

  public HotelOfferRequest adults(Integer adults) {
    this.adults = adults;
    return this;
  }

 /**
   * Comma separated list of ages of each child and infant.  If 2 children have the same age, it will be repeated here. 
   * @return childAges
  **/
  @JsonProperty("childAges")
  public List<Integer> getChildAges() {
    return childAges;
  }

  public void setChildAges(List<Integer> childAges) {
    this.childAges = childAges;
  }

  public HotelOfferRequest childAges(List<Integer> childAges) {
    this.childAges = childAges;
    return this;
  }

  public HotelOfferRequest addChildAgesItem(Integer childAgesItem) {
    this.childAges.add(childAgesItem);
    return this;
  }

 /**
   * Total accomodation price to be paid, taxes included
   * @return totalPrice
  **/
  @JsonProperty("totalPrice")
  public Amount getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Amount totalPrice) {
    this.totalPrice = totalPrice;
  }

  public HotelOfferRequest totalPrice(Amount totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

 /**
   * Cancellation policies attached to the accomodation offer
   * @return cancellationPolicies
  **/
  @JsonProperty("cancellationPolicies")
  public List<String> getCancellationPolicies() {
    return cancellationPolicies;
  }

  public void setCancellationPolicies(List<String> cancellationPolicies) {
    this.cancellationPolicies = cancellationPolicies;
  }

  public HotelOfferRequest cancellationPolicies(List<String> cancellationPolicies) {
    this.cancellationPolicies = cancellationPolicies;
    return this;
  }

  public HotelOfferRequest addCancellationPoliciesItem(String cancellationPoliciesItem) {
    this.cancellationPolicies.add(cancellationPoliciesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelOfferRequest {\n");
    
    sb.append("    hotelOfferId: ").append(toIndentedString(hotelOfferId)).append("\n");
    sb.append("    offerDescription: ").append(toIndentedString(offerDescription)).append("\n");
    sb.append("    roomDescription: ").append(toIndentedString(roomDescription)).append("\n");
    sb.append("    boardType: ").append(toIndentedString(boardType)).append("\n");
    sb.append("    adults: ").append(toIndentedString(adults)).append("\n");
    sb.append("    childAges: ").append(toIndentedString(childAges)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    cancellationPolicies: ").append(toIndentedString(cancellationPolicies)).append("\n");
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

