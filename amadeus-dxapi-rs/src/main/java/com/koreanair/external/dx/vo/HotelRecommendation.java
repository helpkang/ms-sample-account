package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.HotelOffers;
import com.koreanair.external.dx.vo.HotelRelevantCriteria;
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
  * A hotel recommendation exposes a list of hotel offers associated to the reference relevant criteria
 **/
@ApiModel(description="A hotel recommendation exposes a list of hotel offers associated to the reference relevant criteria")
public class HotelRecommendation  {
  
  @ApiModelProperty(value = "")
  private HotelRelevantCriteria relevantCriteria = null;

  @ApiModelProperty(value = "")
  private List<HotelOffers> hotelOffers = null;
 /**
   * Get relevantCriteria
   * @return relevantCriteria
  **/
  @JsonProperty("relevantCriteria")
  public HotelRelevantCriteria getRelevantCriteria() {
    return relevantCriteria;
  }

  public void setRelevantCriteria(HotelRelevantCriteria relevantCriteria) {
    this.relevantCriteria = relevantCriteria;
  }

  public HotelRecommendation relevantCriteria(HotelRelevantCriteria relevantCriteria) {
    this.relevantCriteria = relevantCriteria;
    return this;
  }

 /**
   * Get hotelOffers
   * @return hotelOffers
  **/
  @JsonProperty("hotelOffers")
  public List<HotelOffers> getHotelOffers() {
    return hotelOffers;
  }

  public void setHotelOffers(List<HotelOffers> hotelOffers) {
    this.hotelOffers = hotelOffers;
  }

  public HotelRecommendation hotelOffers(List<HotelOffers> hotelOffers) {
    this.hotelOffers = hotelOffers;
    return this;
  }

  public HotelRecommendation addHotelOffersItem(HotelOffers hotelOffersItem) {
    this.hotelOffers.add(hotelOffersItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelRecommendation {\n");
    
    sb.append("    relevantCriteria: ").append(toIndentedString(relevantCriteria)).append("\n");
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

