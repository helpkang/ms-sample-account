package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirBoundItem;
import com.koreanair.external.dx.vo.BoundFlightDetails;
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
  * Group of air bounds associated to a flight proposal.
 **/
@ApiModel(description="Group of air bounds associated to a flight proposal.")
public class AirBoundGroup  {
  
  @ApiModelProperty(required = true, value = "")
  private BoundFlightDetails boundDetails = null;

  @ApiModelProperty(required = true, value = "")
  private List<AirBoundItem> airBounds = new ArrayList<>();
 /**
   * Get boundDetails
   * @return boundDetails
  **/
  @JsonProperty("boundDetails")
  public BoundFlightDetails getBoundDetails() {
    return boundDetails;
  }

  public void setBoundDetails(BoundFlightDetails boundDetails) {
    this.boundDetails = boundDetails;
  }

  public AirBoundGroup boundDetails(BoundFlightDetails boundDetails) {
    this.boundDetails = boundDetails;
    return this;
  }

 /**
   * Get airBounds
   * @return airBounds
  **/
  @JsonProperty("airBounds")
  public List<AirBoundItem> getAirBounds() {
    return airBounds;
  }

  public void setAirBounds(List<AirBoundItem> airBounds) {
    this.airBounds = airBounds;
  }

  public AirBoundGroup airBounds(List<AirBoundItem> airBounds) {
    this.airBounds = airBounds;
    return this;
  }

  public AirBoundGroup addAirBoundsItem(AirBoundItem airBoundsItem) {
    this.airBounds.add(airBoundsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirBoundGroup {\n");
    
    sb.append("    boundDetails: ").append(toIndentedString(boundDetails)).append("\n");
    sb.append("    airBounds: ").append(toIndentedString(airBounds)).append("\n");
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

