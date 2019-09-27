package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirOffer;
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

public class AirOffersListReplyData  {
  
  @ApiModelProperty(required = true, value = "")
  private List<AirOffer> airOffers = new ArrayList<>();
 /**
   * Get airOffers
   * @return airOffers
  **/
  @JsonProperty("airOffers")
  public List<AirOffer> getAirOffers() {
    return airOffers;
  }

  public void setAirOffers(List<AirOffer> airOffers) {
    this.airOffers = airOffers;
  }

  public AirOffersListReplyData airOffers(List<AirOffer> airOffers) {
    this.airOffers = airOffers;
    return this;
  }

  public AirOffersListReplyData addAirOffersItem(AirOffer airOffersItem) {
    this.airOffers.add(airOffersItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirOffersListReplyData {\n");
    
    sb.append("    airOffers: ").append(toIndentedString(airOffers)).append("\n");
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

