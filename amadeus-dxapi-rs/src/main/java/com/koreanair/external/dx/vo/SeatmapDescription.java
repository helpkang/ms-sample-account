package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.SeatmapCoordinatesUnit;
import com.koreanair.external.dx.vo.SeatmapDeck;
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

public class SeatmapDescription  {
  
  @ApiModelProperty(value = "Specify if information was provided by the airline (false), or if generic data are used based on the equipement (true)")
 /**
   * Specify if information was provided by the airline (false), or if generic data are used based on the equipement (true)
  **/
  private Boolean computedCoordinates = null;

  @ApiModelProperty(value = "")
  private List<SeatmapDeck> decks = null;

  @ApiModelProperty(value = "")
  private SeatmapCoordinatesUnit coordinates = null;
 /**
   * Specify if information was provided by the airline (false), or if generic data are used based on the equipement (true)
   * @return computedCoordinates
  **/
  @JsonProperty("computedCoordinates")
  public Boolean isComputedCoordinates() {
    return computedCoordinates;
  }

  public void setComputedCoordinates(Boolean computedCoordinates) {
    this.computedCoordinates = computedCoordinates;
  }

  public SeatmapDescription computedCoordinates(Boolean computedCoordinates) {
    this.computedCoordinates = computedCoordinates;
    return this;
  }

 /**
   * Get decks
   * @return decks
  **/
  @JsonProperty("decks")
  public List<SeatmapDeck> getDecks() {
    return decks;
  }

  public void setDecks(List<SeatmapDeck> decks) {
    this.decks = decks;
  }

  public SeatmapDescription decks(List<SeatmapDeck> decks) {
    this.decks = decks;
    return this;
  }

  public SeatmapDescription addDecksItem(SeatmapDeck decksItem) {
    this.decks.add(decksItem);
    return this;
  }

 /**
   * Get coordinates
   * @return coordinates
  **/
  @JsonProperty("coordinates")
  public SeatmapCoordinatesUnit getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(SeatmapCoordinatesUnit coordinates) {
    this.coordinates = coordinates;
  }

  public SeatmapDescription coordinates(SeatmapCoordinatesUnit coordinates) {
    this.coordinates = coordinates;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatmapDescription {\n");
    
    sb.append("    computedCoordinates: ").append(toIndentedString(computedCoordinates)).append("\n");
    sb.append("    decks: ").append(toIndentedString(decks)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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

