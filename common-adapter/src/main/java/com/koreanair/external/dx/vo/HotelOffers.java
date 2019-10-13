package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Hotel;
import com.koreanair.external.dx.vo.HotelOffer;
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
  * details for the requested hotel and the available offers
 **/
@ApiModel(description="details for the requested hotel and the available offers")
public class HotelOffers  {
  
  @ApiModelProperty(value = "the type of the object (offers)")
 /**
   * the type of the object (offers)
  **/
  private String type = "offers";

  @ApiModelProperty(value = "")
  private Hotel hotel = null;

  @ApiModelProperty(value = "availability status of this hotel-offers")
 /**
   * availability status of this hotel-offers
  **/
  private Boolean available = null;

  @ApiModelProperty(value = "")
  private List<HotelOffer> offers = null;

  @ApiModelProperty(value = "a self link to the object")
 /**
   * a self link to the object
  **/
  private String self = null;
 /**
   * the type of the object (offers)
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public HotelOffers type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get hotel
   * @return hotel
  **/
  @JsonProperty("hotel")
  public Hotel getHotel() {
    return hotel;
  }

  public void setHotel(Hotel hotel) {
    this.hotel = hotel;
  }

  public HotelOffers hotel(Hotel hotel) {
    this.hotel = hotel;
    return this;
  }

 /**
   * availability status of this hotel-offers
   * @return available
  **/
  @JsonProperty("available")
  public Boolean isAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public HotelOffers available(Boolean available) {
    this.available = available;
    return this;
  }

 /**
   * Get offers
   * @return offers
  **/
  @JsonProperty("offers")
  public List<HotelOffer> getOffers() {
    return offers;
  }

  public void setOffers(List<HotelOffer> offers) {
    this.offers = offers;
  }

  public HotelOffers offers(List<HotelOffer> offers) {
    this.offers = offers;
    return this;
  }

  public HotelOffers addOffersItem(HotelOffer offersItem) {
    this.offers.add(offersItem);
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

  public HotelOffers self(String self) {
    this.self = self;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelOffers {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hotel: ").append(toIndentedString(hotel)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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

