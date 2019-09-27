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
  * This object contains a list of information associated to a rich media
 **/
@ApiModel(description="This object contains a list of information associated to a rich media")
public class RichMedia  {
  
  @ApiModelProperty(value = "Reference to the rich media to be used for describing a service/seat")
 /**
   * Reference to the rich media to be used for describing a service/seat
  **/
  private String mediaId = null;

  @ApiModelProperty(value = "Identifier of the traveler for which a media id is applicable.")
 /**
   * Identifier of the traveler for which a media id is applicable.
  **/
  private String travelerId = null;

  @ApiModelProperty(value = "Identifiers of the flights for which a media id is applicable.")
 /**
   * Identifiers of the flights for which a media id is applicable.
  **/
  private List<String> flightIds = null;

  @ApiModelProperty(value = "Airline code of the airline owner of the media id.")
 /**
   * Airline code of the airline owner of the media id.
  **/
  private String airlineCode = null;
 /**
   * Reference to the rich media to be used for describing a service/seat
   * @return mediaId
  **/
  @JsonProperty("mediaId")
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  public RichMedia mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

 /**
   * Identifier of the traveler for which a media id is applicable.
   * @return travelerId
  **/
  @JsonProperty("travelerId")
  public String getTravelerId() {
    return travelerId;
  }

  public void setTravelerId(String travelerId) {
    this.travelerId = travelerId;
  }

  public RichMedia travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }

 /**
   * Identifiers of the flights for which a media id is applicable.
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public RichMedia flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public RichMedia addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }

 /**
   * Airline code of the airline owner of the media id.
   * @return airlineCode
  **/
  @JsonProperty("airlineCode")
  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public RichMedia airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RichMedia {\n");
    
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
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

