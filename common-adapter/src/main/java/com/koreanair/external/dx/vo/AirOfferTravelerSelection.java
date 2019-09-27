package com.koreanair.external.dx.vo;

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
  * structure to describe the association between travelers listed in the offer and either travelers already stored in the Cart or traveler provided in the same request.
 **/
@ApiModel(description="structure to describe the association between travelers listed in the offer and either travelers already stored in the Cart or traveler provided in the same request.")
public class AirOfferTravelerSelection  {
  
  @ApiModelProperty(value = "Id of the traveller inside the Offer")
 /**
   * Id of the traveller inside the Offer
  **/
  private String airOfferTravelerId = null;

  @ApiModelProperty(value = "Existing traveler from the cart to be associated with an offer traveler Id")
 /**
   * Existing traveler from the cart to be associated with an offer traveler Id
  **/
  private String cartTravelerId = null;

  @ApiModelProperty(value = "Temporary (valid only for the transaction timing) traveler id, to be used when adding in a cart a list of travelers and an air offer in the same request.")
 /**
   * Temporary (valid only for the transaction timing) traveler id, to be used when adding in a cart a list of travelers and an air offer in the same request.
  **/
  private String travelerTId = null;
 /**
   * Id of the traveller inside the Offer
   * @return airOfferTravelerId
  **/
  @JsonProperty("airOfferTravelerId")
  public String getAirOfferTravelerId() {
    return airOfferTravelerId;
  }

  public void setAirOfferTravelerId(String airOfferTravelerId) {
    this.airOfferTravelerId = airOfferTravelerId;
  }

  public AirOfferTravelerSelection airOfferTravelerId(String airOfferTravelerId) {
    this.airOfferTravelerId = airOfferTravelerId;
    return this;
  }

 /**
   * Existing traveler from the cart to be associated with an offer traveler Id
   * @return cartTravelerId
  **/
  @JsonProperty("cartTravelerId")
  public String getCartTravelerId() {
    return cartTravelerId;
  }

  public void setCartTravelerId(String cartTravelerId) {
    this.cartTravelerId = cartTravelerId;
  }

  public AirOfferTravelerSelection cartTravelerId(String cartTravelerId) {
    this.cartTravelerId = cartTravelerId;
    return this;
  }

 /**
   * Temporary (valid only for the transaction timing) traveler id, to be used when adding in a cart a list of travelers and an air offer in the same request.
   * @return travelerTId
  **/
  @JsonProperty("travelerTId")
  public String getTravelerTId() {
    return travelerTId;
  }

  public void setTravelerTId(String travelerTId) {
    this.travelerTId = travelerTId;
  }

  public AirOfferTravelerSelection travelerTId(String travelerTId) {
    this.travelerTId = travelerTId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirOfferTravelerSelection {\n");
    
    sb.append("    airOfferTravelerId: ").append(toIndentedString(airOfferTravelerId)).append("\n");
    sb.append("    cartTravelerId: ").append(toIndentedString(cartTravelerId)).append("\n");
    sb.append("    travelerTId: ").append(toIndentedString(travelerTId)).append("\n");
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

