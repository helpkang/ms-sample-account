package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.HotelOfferRequest;
import com.koreanair.external.dx.vo.HotelRequest;
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
  * Object used to specify a selection of an external HotelOffer when using the entry point POST /carts/{cartId}/hotel-offers/by-external-provider 
 **/
@ApiModel(description="Object used to specify a selection of an external HotelOffer when using the entry point POST /carts/{cartId}/hotel-offers/by-external-provider ")
public class HotelExternalOffersSelectionRequest  {
  
  @ApiModelProperty(required = true, value = "Hotel associated to the provided hotelOffers")
 /**
   * Hotel associated to the provided hotelOffers
  **/
  private HotelRequest hotel = null;

  @ApiModelProperty(required = true, value = "List of hotel offers to be added in the cart")
 /**
   * List of hotel offers to be added in the cart
  **/
  private List<HotelOfferRequest> hotelOffers = new ArrayList<>();
 /**
   * Hotel associated to the provided hotelOffers
   * @return hotel
  **/
  @JsonProperty("hotel")
  public HotelRequest getHotel() {
    return hotel;
  }

  public void setHotel(HotelRequest hotel) {
    this.hotel = hotel;
  }

  public HotelExternalOffersSelectionRequest hotel(HotelRequest hotel) {
    this.hotel = hotel;
    return this;
  }

 /**
   * List of hotel offers to be added in the cart
   * @return hotelOffers
  **/
  @JsonProperty("hotelOffers")
  public List<HotelOfferRequest> getHotelOffers() {
    return hotelOffers;
  }

  public void setHotelOffers(List<HotelOfferRequest> hotelOffers) {
    this.hotelOffers = hotelOffers;
  }

  public HotelExternalOffersSelectionRequest hotelOffers(List<HotelOfferRequest> hotelOffers) {
    this.hotelOffers = hotelOffers;
    return this;
  }

  public HotelExternalOffersSelectionRequest addHotelOffersItem(HotelOfferRequest hotelOffersItem) {
    this.hotelOffers.add(hotelOffersItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelExternalOffersSelectionRequest {\n");
    
    sb.append("    hotel: ").append(toIndentedString(hotel)).append("\n");
    sb.append("    hotelOffers: ").append(toIndentedString(hotelOffers)).append("\n");
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

