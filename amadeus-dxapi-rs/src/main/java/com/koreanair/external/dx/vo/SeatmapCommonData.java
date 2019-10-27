package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.SeatmapDescription;
import com.koreanair.external.dx.vo.SeatmapFlightInfo;
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

public class SeatmapCommonData  {
  
  @ApiModelProperty(required = true, value = "")
  private SeatmapFlightInfo flight = null;

  @ApiModelProperty(required = true, value = "")
  private List<SeatmapDescription> seatmaps = new ArrayList<>();
 /**
   * Get flight
   * @return flight
  **/
  @JsonProperty("flight")
  public SeatmapFlightInfo getFlight() {
    return flight;
  }

  public void setFlight(SeatmapFlightInfo flight) {
    this.flight = flight;
  }

  public SeatmapCommonData flight(SeatmapFlightInfo flight) {
    this.flight = flight;
    return this;
  }

 /**
   * Get seatmaps
   * @return seatmaps
  **/
  @JsonProperty("seatmaps")
  public List<SeatmapDescription> getSeatmaps() {
    return seatmaps;
  }

  public void setSeatmaps(List<SeatmapDescription> seatmaps) {
    this.seatmaps = seatmaps;
  }

  public SeatmapCommonData seatmaps(List<SeatmapDescription> seatmaps) {
    this.seatmaps = seatmaps;
    return this;
  }

  public SeatmapCommonData addSeatmapsItem(SeatmapDescription seatmapsItem) {
    this.seatmaps.add(seatmapsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatmapCommonData {\n");
    
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
    sb.append("    seatmaps: ").append(toIndentedString(seatmaps)).append("\n");
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

