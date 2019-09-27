package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirOfferTravelerSelection;
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
  * Object used to input the information to be used when adding an air offer or a list of air bounds into a cart. 
 **/
@ApiModel(description="Object used to input the information to be used when adding an air offer or a list of air bounds into a cart. ")
public class AirOfferSelectionRequest  {
  
  @ApiModelProperty(value = "")
  private String airOfferId = null;

  @ApiModelProperty(value = "List of airbounds to be used as elements composing the offer to be stored in the cart")
 /**
   * List of airbounds to be used as elements composing the offer to be stored in the cart
  **/
  private List<String> airBoundIds = null;

  @ApiModelProperty(value = "List of associations between travelers described in the offer and existing travelers in the cart")
 /**
   * List of associations between travelers described in the offer and existing travelers in the cart
  **/
  private List<AirOfferTravelerSelection> airOfferTravelerSelections = null;
 /**
   * Get airOfferId
   * @return airOfferId
  **/
  @JsonProperty("airOfferId")
  public String getAirOfferId() {
    return airOfferId;
  }

  public void setAirOfferId(String airOfferId) {
    this.airOfferId = airOfferId;
  }

  public AirOfferSelectionRequest airOfferId(String airOfferId) {
    this.airOfferId = airOfferId;
    return this;
  }

 /**
   * List of airbounds to be used as elements composing the offer to be stored in the cart
   * @return airBoundIds
  **/
  @JsonProperty("airBoundIds")
  public List<String> getAirBoundIds() {
    return airBoundIds;
  }

  public void setAirBoundIds(List<String> airBoundIds) {
    this.airBoundIds = airBoundIds;
  }

  public AirOfferSelectionRequest airBoundIds(List<String> airBoundIds) {
    this.airBoundIds = airBoundIds;
    return this;
  }

  public AirOfferSelectionRequest addAirBoundIdsItem(String airBoundIdsItem) {
    this.airBoundIds.add(airBoundIdsItem);
    return this;
  }

 /**
   * List of associations between travelers described in the offer and existing travelers in the cart
   * @return airOfferTravelerSelections
  **/
  @JsonProperty("airOfferTravelerSelections")
  public List<AirOfferTravelerSelection> getAirOfferTravelerSelections() {
    return airOfferTravelerSelections;
  }

  public void setAirOfferTravelerSelections(List<AirOfferTravelerSelection> airOfferTravelerSelections) {
    this.airOfferTravelerSelections = airOfferTravelerSelections;
  }

  public AirOfferSelectionRequest airOfferTravelerSelections(List<AirOfferTravelerSelection> airOfferTravelerSelections) {
    this.airOfferTravelerSelections = airOfferTravelerSelections;
    return this;
  }

  public AirOfferSelectionRequest addAirOfferTravelerSelectionsItem(AirOfferTravelerSelection airOfferTravelerSelectionsItem) {
    this.airOfferTravelerSelections.add(airOfferTravelerSelectionsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirOfferSelectionRequest {\n");
    
    sb.append("    airOfferId: ").append(toIndentedString(airOfferId)).append("\n");
    sb.append("    airBoundIds: ").append(toIndentedString(airBoundIds)).append("\n");
    sb.append("    airOfferTravelerSelections: ").append(toIndentedString(airOfferTravelerSelections)).append("\n");
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

