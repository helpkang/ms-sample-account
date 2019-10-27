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
  * Fare basis data used while computing the seatmap
 **/
@ApiModel(description="Fare basis data used while computing the seatmap")
public class FareClassSelection  {
  
  @ApiModelProperty(required = true, value = "Fare basis code associated to the flight and the below travelers")
 /**
   * Fare basis code associated to the flight and the below travelers
  **/
  private String fareClass = null;

  @ApiModelProperty(required = true, value = "Traveler identifiers associated to the `fareClass` value (aka fare basis code). When used for AdvancedSearch seatmap computation, this corresponds to the temporary traveler id (`tid`)")
 /**
   * Traveler identifiers associated to the `fareClass` value (aka fare basis code). When used for AdvancedSearch seatmap computation, this corresponds to the temporary traveler id (`tid`)
  **/
  private List<String> travelerIds = new ArrayList<>();
 /**
   * Fare basis code associated to the flight and the below travelers
   * @return fareClass
  **/
  @JsonProperty("fareClass")
  public String getFareClass() {
    return fareClass;
  }

  public void setFareClass(String fareClass) {
    this.fareClass = fareClass;
  }

  public FareClassSelection fareClass(String fareClass) {
    this.fareClass = fareClass;
    return this;
  }

 /**
   * Traveler identifiers associated to the &#x60;fareClass&#x60; value (aka fare basis code). When used for AdvancedSearch seatmap computation, this corresponds to the temporary traveler id (&#x60;tid&#x60;)
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public FareClassSelection travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public FareClassSelection addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareClassSelection {\n");
    
    sb.append("    fareClass: ").append(toIndentedString(fareClass)).append("\n");
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

