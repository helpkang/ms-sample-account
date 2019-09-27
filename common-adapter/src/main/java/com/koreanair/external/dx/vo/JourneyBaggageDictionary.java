package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Traveler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JourneyBaggageDictionary  {
  
  @ApiModelProperty(value = "Traveler information corresponding to a traveler id.")
 /**
   * Traveler information corresponding to a traveler id.
  **/
  private Map<String, Traveler> traveler = null;
 /**
   * Traveler information corresponding to a traveler id.
   * @return traveler
  **/
  @JsonProperty("traveler")
  public Map<String, Traveler> getTraveler() {
    return traveler;
  }

  public void setTraveler(Map<String, Traveler> traveler) {
    this.traveler = traveler;
  }

  public JourneyBaggageDictionary traveler(Map<String, Traveler> traveler) {
    this.traveler = traveler;
    return this;
  }

  public JourneyBaggageDictionary putTravelerItem(String key, Traveler travelerItem) {
    this.traveler.put(key, travelerItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyBaggageDictionary {\n");
    
    sb.append("    traveler: ").append(toIndentedString(traveler)).append("\n");
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

