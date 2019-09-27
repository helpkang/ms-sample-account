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
  * Object used to specify a selection of an HotelOffer when using the entry point POST /carts/{cartId}/hotel-offers 
 **/
@ApiModel(description="Object used to specify a selection of an HotelOffer when using the entry point POST /carts/{cartId}/hotel-offers ")
public class HotelOffersSelectionRequest  {
  
  @ApiModelProperty(required = true, value = "")
  private String hotelOfferId = null;

  @ApiModelProperty(value = "")
  private List<String> travelerIds = null;
 /**
   * Get hotelOfferId
   * @return hotelOfferId
  **/
  @JsonProperty("hotelOfferId")
  public String getHotelOfferId() {
    return hotelOfferId;
  }

  public void setHotelOfferId(String hotelOfferId) {
    this.hotelOfferId = hotelOfferId;
  }

  public HotelOffersSelectionRequest hotelOfferId(String hotelOfferId) {
    this.hotelOfferId = hotelOfferId;
    return this;
  }

 /**
   * Get travelerIds
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public HotelOffersSelectionRequest travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public HotelOffersSelectionRequest addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelOffersSelectionRequest {\n");
    
    sb.append("    hotelOfferId: ").append(toIndentedString(hotelOfferId)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
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

