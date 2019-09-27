package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Commission;
import com.koreanair.external.dx.vo.Guests;
import com.koreanair.external.dx.vo.HotelPrice;
import com.koreanair.external.dx.vo.PolicyDetails;
import com.koreanair.external.dx.vo.RateFamily;
import com.koreanair.external.dx.vo.RoomDetails;
import com.koreanair.external.dx.vo.TextWithLanguageType;
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
  * details of the requested offer
 **/
@ApiModel(description="details of the requested offer")
public class HotelOffer  {
  
  @ApiModelProperty(value = "The type of this data object (offer by default).")
 /**
   * The type of this data object (offer by default).
  **/
  private String type = "offer";

  @ApiModelProperty(required = true, value = "Unique identifier of this offer. Might be valid for a temporary period only.")
 /**
   * Unique identifier of this offer. Might be valid for a temporary period only.
  **/
  private String id = null;

  @ApiModelProperty(value = "The id of the associated hotel")
 /**
   * The id of the associated hotel
  **/
  private String hotelId = null;

  @ApiModelProperty(value = "Number of rooms requested.")
 /**
   * Number of rooms requested.
  **/
  private Integer roomQuantity = null;

  @ApiModelProperty(value = "Identifies the offer during the booking, to be used in addition of invBlockCode and rateCode.")
 /**
   * Identifies the offer during the booking, to be used in addition of invBlockCode and rateCode.
  **/
  private String bookingCode = null;

  @ApiModelProperty(value = "Allotment reserved in the hotel CRS, to be used in addition of bookingCode and rateCode when booking the offer.")
 /**
   * Allotment reserved in the hotel CRS, to be used in addition of bookingCode and rateCode when booking the offer.
  **/
  private String invBlockCode = null;

  @ApiModelProperty(value = "Amadeus Rate plan code identification, to be used in addition of bookingCode and invBlockCode when booking the offer. Examples:  PRO (promotional rate)  MIL (military rate)       ")
 /**
   * Amadeus Rate plan code identification, to be used in addition of bookingCode and invBlockCode when booking the offer. Examples:  PRO (promotional rate)  MIL (military rate)       
  **/
  private String rateCode = null;

  @ApiModelProperty(value = "")
  private RateFamily rateFamilyEstimated = null;

  @ApiModelProperty(value = "Amadeus rate plan type identification Examples:  ASSOCIATION  FAMILY_PLAN ")
 /**
   * Amadeus rate plan type identification Examples:  ASSOCIATION  FAMILY_PLAN 
  **/
  private String category = null;

  @ApiModelProperty(value = "")
  private TextWithLanguageType description = null;

  @ApiModelProperty(value = "")
  private Commission commission = null;

  @ApiModelProperty(value = "The included board type (meal) Examples:  ALL_INCLUSIVE  BREAKFAST ")
 /**
   * The included board type (meal) Examples:  ALL_INCLUSIVE  BREAKFAST 
  **/
  private String boardType = null;

  @ApiModelProperty(value = "")
  private RoomDetails room = null;

  @ApiModelProperty(value = "")
  private Guests guests = null;

  @ApiModelProperty(value = "")
  private HotelPrice price = null;

  @ApiModelProperty(value = "")
  private PolicyDetails policies = null;

  @ApiModelProperty(value = "a self link to the object")
 /**
   * a self link to the object
  **/
  private String self = null;
 /**
   * The type of this data object (offer by default).
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public HotelOffer type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Unique identifier of this offer. Might be valid for a temporary period only.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HotelOffer id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The id of the associated hotel
   * @return hotelId
  **/
  @JsonProperty("hotelId")
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  public HotelOffer hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

 /**
   * Number of rooms requested.
   * @return roomQuantity
  **/
  @JsonProperty("roomQuantity")
  public Integer getRoomQuantity() {
    return roomQuantity;
  }

  public void setRoomQuantity(Integer roomQuantity) {
    this.roomQuantity = roomQuantity;
  }

  public HotelOffer roomQuantity(Integer roomQuantity) {
    this.roomQuantity = roomQuantity;
    return this;
  }

 /**
   * Identifies the offer during the booking, to be used in addition of invBlockCode and rateCode.
   * @return bookingCode
  **/
  @JsonProperty("bookingCode")
  public String getBookingCode() {
    return bookingCode;
  }

  public void setBookingCode(String bookingCode) {
    this.bookingCode = bookingCode;
  }

  public HotelOffer bookingCode(String bookingCode) {
    this.bookingCode = bookingCode;
    return this;
  }

 /**
   * Allotment reserved in the hotel CRS, to be used in addition of bookingCode and rateCode when booking the offer.
   * @return invBlockCode
  **/
  @JsonProperty("invBlockCode")
  public String getInvBlockCode() {
    return invBlockCode;
  }

  public void setInvBlockCode(String invBlockCode) {
    this.invBlockCode = invBlockCode;
  }

  public HotelOffer invBlockCode(String invBlockCode) {
    this.invBlockCode = invBlockCode;
    return this;
  }

 /**
   * Amadeus Rate plan code identification, to be used in addition of bookingCode and invBlockCode when booking the offer. Examples:  PRO (promotional rate)  MIL (military rate)       
   * @return rateCode
  **/
  @JsonProperty("rateCode")
  public String getRateCode() {
    return rateCode;
  }

  public void setRateCode(String rateCode) {
    this.rateCode = rateCode;
  }

  public HotelOffer rateCode(String rateCode) {
    this.rateCode = rateCode;
    return this;
  }

 /**
   * Get rateFamilyEstimated
   * @return rateFamilyEstimated
  **/
  @JsonProperty("rateFamilyEstimated")
  public RateFamily getRateFamilyEstimated() {
    return rateFamilyEstimated;
  }

  public void setRateFamilyEstimated(RateFamily rateFamilyEstimated) {
    this.rateFamilyEstimated = rateFamilyEstimated;
  }

  public HotelOffer rateFamilyEstimated(RateFamily rateFamilyEstimated) {
    this.rateFamilyEstimated = rateFamilyEstimated;
    return this;
  }

 /**
   * Amadeus rate plan type identification Examples:  ASSOCIATION  FAMILY_PLAN 
   * @return category
  **/
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public HotelOffer category(String category) {
    this.category = category;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public TextWithLanguageType getDescription() {
    return description;
  }

  public void setDescription(TextWithLanguageType description) {
    this.description = description;
  }

  public HotelOffer description(TextWithLanguageType description) {
    this.description = description;
    return this;
  }

 /**
   * Get commission
   * @return commission
  **/
  @JsonProperty("commission")
  public Commission getCommission() {
    return commission;
  }

  public void setCommission(Commission commission) {
    this.commission = commission;
  }

  public HotelOffer commission(Commission commission) {
    this.commission = commission;
    return this;
  }

 /**
   * The included board type (meal) Examples:  ALL_INCLUSIVE  BREAKFAST 
   * @return boardType
  **/
  @JsonProperty("boardType")
  public String getBoardType() {
    return boardType;
  }

  public void setBoardType(String boardType) {
    this.boardType = boardType;
  }

  public HotelOffer boardType(String boardType) {
    this.boardType = boardType;
    return this;
  }

 /**
   * Get room
   * @return room
  **/
  @JsonProperty("room")
  public RoomDetails getRoom() {
    return room;
  }

  public void setRoom(RoomDetails room) {
    this.room = room;
  }

  public HotelOffer room(RoomDetails room) {
    this.room = room;
    return this;
  }

 /**
   * Get guests
   * @return guests
  **/
  @JsonProperty("guests")
  public Guests getGuests() {
    return guests;
  }

  public void setGuests(Guests guests) {
    this.guests = guests;
  }

  public HotelOffer guests(Guests guests) {
    this.guests = guests;
    return this;
  }

 /**
   * Get price
   * @return price
  **/
  @JsonProperty("price")
  public HotelPrice getPrice() {
    return price;
  }

  public void setPrice(HotelPrice price) {
    this.price = price;
  }

  public HotelOffer price(HotelPrice price) {
    this.price = price;
    return this;
  }

 /**
   * Get policies
   * @return policies
  **/
  @JsonProperty("policies")
  public PolicyDetails getPolicies() {
    return policies;
  }

  public void setPolicies(PolicyDetails policies) {
    this.policies = policies;
  }

  public HotelOffer policies(PolicyDetails policies) {
    this.policies = policies;
    return this;
  }

 /**
   * a self link to the object
   * @return self
  **/
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public HotelOffer self(String self) {
    this.self = self;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelOffer {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    roomQuantity: ").append(toIndentedString(roomQuantity)).append("\n");
    sb.append("    bookingCode: ").append(toIndentedString(bookingCode)).append("\n");
    sb.append("    invBlockCode: ").append(toIndentedString(invBlockCode)).append("\n");
    sb.append("    rateCode: ").append(toIndentedString(rateCode)).append("\n");
    sb.append("    rateFamilyEstimated: ").append(toIndentedString(rateFamilyEstimated)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    boardType: ").append(toIndentedString(boardType)).append("\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
    sb.append("    guests: ").append(toIndentedString(guests)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

