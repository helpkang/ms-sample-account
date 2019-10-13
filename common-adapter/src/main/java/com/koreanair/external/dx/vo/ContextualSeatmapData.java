package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.SeatSelection;
import com.koreanair.external.dx.vo.SeatmapCommonData;
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

public class ContextualSeatmapData  {
  
  @ApiModelProperty(required = true, value = "")
  private SeatmapFlightInfo flight = null;

  @ApiModelProperty(required = true, value = "")
  private List<SeatmapDescription> seatmaps = new ArrayList<>();

  @ApiModelProperty(value = "It allows to define the list of seat selections for a group of travelers")
 /**
   * It allows to define the list of seat selections for a group of travelers
  **/
  private List<SeatSelection> seatSelections = null;
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

  public ContextualSeatmapData flight(SeatmapFlightInfo flight) {
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

  public ContextualSeatmapData seatmaps(List<SeatmapDescription> seatmaps) {
    this.seatmaps = seatmaps;
    return this;
  }

  public ContextualSeatmapData addSeatmapsItem(SeatmapDescription seatmapsItem) {
    this.seatmaps.add(seatmapsItem);
    return this;
  }

 /**
   * It allows to define the list of seat selections for a group of travelers
   * @return seatSelections
  **/
  @JsonProperty("seatSelections")
  public List<SeatSelection> getSeatSelections() {
    return seatSelections;
  }

  public void setSeatSelections(List<SeatSelection> seatSelections) {
    this.seatSelections = seatSelections;
  }

  public ContextualSeatmapData seatSelections(List<SeatSelection> seatSelections) {
    this.seatSelections = seatSelections;
    return this;
  }

  public ContextualSeatmapData addSeatSelectionsItem(SeatSelection seatSelectionsItem) {
    this.seatSelections.add(seatSelectionsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextualSeatmapData {\n");
    
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
    sb.append("    seatmaps: ").append(toIndentedString(seatmaps)).append("\n");
    sb.append("    seatSelections: ").append(toIndentedString(seatSelections)).append("\n");
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

