package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FlightSegment;
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
  * Details for the flight's solution for a given bound in construction mode shopping. A flight might be composed by several segments. Example: the flight NCE-NYC, could be composed by two segments, NCE-LON and LON-NYC 
 **/
@ApiModel(description="Details for the flight's solution for a given bound in construction mode shopping. A flight might be composed by several segments. Example: the flight NCE-NYC, could be composed by two segments, NCE-LON and LON-NYC ")
public class BoundFlightDetails  {
  
  @ApiModelProperty(required = true, value = "Departure location (airport code) of the flight bound")
 /**
   * Departure location (airport code) of the flight bound
  **/
  private String originLocationCode = null;

  @ApiModelProperty(required = true, value = "Arrival location (airport code) of the flight bound")
 /**
   * Arrival location (airport code) of the flight bound
  **/
  private String destinationLocationCode = null;

  @ApiModelProperty(required = true, value = "Duration of the entire journey expressed in seconds.")
 /**
   * Duration of the entire journey expressed in seconds.
  **/
  private Integer duration = null;

  @ApiModelProperty(value = "Ranking of the flight bound based on Carrier Preferred Display rules defined by airline, numbering starts from 1 which indicates the preferred bound solution. ")
 /**
   * Ranking of the flight bound based on Carrier Preferred Display rules defined by airline, numbering starts from 1 which indicates the preferred bound solution. 
  **/
  private Integer ranking = null;

  @ApiModelProperty(required = true, value = "List of different flight segments for the given flight's proposal.")
 /**
   * List of different flight segments for the given flight's proposal.
  **/
  private List<FlightSegment> segments = new ArrayList<>();
 /**
   * Departure location (airport code) of the flight bound
   * @return originLocationCode
  **/
  @JsonProperty("originLocationCode")
  public String getOriginLocationCode() {
    return originLocationCode;
  }

  public void setOriginLocationCode(String originLocationCode) {
    this.originLocationCode = originLocationCode;
  }

  public BoundFlightDetails originLocationCode(String originLocationCode) {
    this.originLocationCode = originLocationCode;
    return this;
  }

 /**
   * Arrival location (airport code) of the flight bound
   * @return destinationLocationCode
  **/
  @JsonProperty("destinationLocationCode")
  public String getDestinationLocationCode() {
    return destinationLocationCode;
  }

  public void setDestinationLocationCode(String destinationLocationCode) {
    this.destinationLocationCode = destinationLocationCode;
  }

  public BoundFlightDetails destinationLocationCode(String destinationLocationCode) {
    this.destinationLocationCode = destinationLocationCode;
    return this;
  }

 /**
   * Duration of the entire journey expressed in seconds.
   * @return duration
  **/
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public BoundFlightDetails duration(Integer duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Ranking of the flight bound based on Carrier Preferred Display rules defined by airline, numbering starts from 1 which indicates the preferred bound solution. 
   * @return ranking
  **/
  @JsonProperty("ranking")
  public Integer getRanking() {
    return ranking;
  }

  public void setRanking(Integer ranking) {
    this.ranking = ranking;
  }

  public BoundFlightDetails ranking(Integer ranking) {
    this.ranking = ranking;
    return this;
  }

 /**
   * List of different flight segments for the given flight&#39;s proposal.
   * @return segments
  **/
  @JsonProperty("segments")
  public List<FlightSegment> getSegments() {
    return segments;
  }

  public void setSegments(List<FlightSegment> segments) {
    this.segments = segments;
  }

  public BoundFlightDetails segments(List<FlightSegment> segments) {
    this.segments = segments;
    return this;
  }

  public BoundFlightDetails addSegmentsItem(FlightSegment segmentsItem) {
    this.segments.add(segmentsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoundFlightDetails {\n");
    
    sb.append("    originLocationCode: ").append(toIndentedString(originLocationCode)).append("\n");
    sb.append("    destinationLocationCode: ").append(toIndentedString(destinationLocationCode)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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

