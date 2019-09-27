package com.koreanair.external.dx.vo;

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

public class FareInfo  {
  

@XmlType(name="FareTypeEnum")
@XmlEnum(String.class)
public enum FareTypeEnum {

@XmlEnumValue("public") PUBLIC(String.valueOf("public")), @XmlEnumValue("unifares") UNIFARES(String.valueOf("unifares"));


    private String value;

    FareTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FareTypeEnum fromValue(String v) {
        for (FareTypeEnum b : FareTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private FareTypeEnum fareType = null;

  @ApiModelProperty(value = "")
  private String fareClass = null;

  @ApiModelProperty(value = "")
  private List<String> pricedPassengerTypeCodes = null;

  @ApiModelProperty(value = "")
  private List<String> travelerIds = null;

  @ApiModelProperty(value = "Code used by the airline to reflect the discount applied to the fares")
 /**
   * Code used by the airline to reflect the discount applied to the fares
  **/
  private String ticketDesignator = null;

  @ApiModelProperty(value = "Corporate code used by the airline to target a given fare")
 /**
   * Corporate code used by the airline to target a given fare
  **/
  private String corporateCode = null;

  @ApiModelProperty(value = "Flight identifiers associated to the fare (not available when using AirCalendar operations)")
 /**
   * Flight identifiers associated to the fare (not available when using AirCalendar operations)
  **/
  private List<String> flightIds = null;
 /**
   * Get fareType
   * @return fareType
  **/
  @JsonProperty("fareType")
  public String getFareType() {
    if (fareType == null) {
      return null;
    }
    return fareType.value();
  }

  public void setFareType(FareTypeEnum fareType) {
    this.fareType = fareType;
  }

  public FareInfo fareType(FareTypeEnum fareType) {
    this.fareType = fareType;
    return this;
  }

 /**
   * Get fareClass
   * @return fareClass
  **/
  @JsonProperty("fareClass")
  public String getFareClass() {
    return fareClass;
  }

  public void setFareClass(String fareClass) {
    this.fareClass = fareClass;
  }

  public FareInfo fareClass(String fareClass) {
    this.fareClass = fareClass;
    return this;
  }

 /**
   * Get pricedPassengerTypeCodes
   * @return pricedPassengerTypeCodes
  **/
  @JsonProperty("pricedPassengerTypeCodes")
  public List<String> getPricedPassengerTypeCodes() {
    return pricedPassengerTypeCodes;
  }

  public void setPricedPassengerTypeCodes(List<String> pricedPassengerTypeCodes) {
    this.pricedPassengerTypeCodes = pricedPassengerTypeCodes;
  }

  public FareInfo pricedPassengerTypeCodes(List<String> pricedPassengerTypeCodes) {
    this.pricedPassengerTypeCodes = pricedPassengerTypeCodes;
    return this;
  }

  public FareInfo addPricedPassengerTypeCodesItem(String pricedPassengerTypeCodesItem) {
    this.pricedPassengerTypeCodes.add(pricedPassengerTypeCodesItem);
    return this;
  }

 /**
   * Get travelerIds
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public FareInfo travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public FareInfo addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * Code used by the airline to reflect the discount applied to the fares
   * @return ticketDesignator
  **/
  @JsonProperty("ticketDesignator")
  public String getTicketDesignator() {
    return ticketDesignator;
  }

  public void setTicketDesignator(String ticketDesignator) {
    this.ticketDesignator = ticketDesignator;
  }

  public FareInfo ticketDesignator(String ticketDesignator) {
    this.ticketDesignator = ticketDesignator;
    return this;
  }

 /**
   * Corporate code used by the airline to target a given fare
   * @return corporateCode
  **/
  @JsonProperty("corporateCode")
  public String getCorporateCode() {
    return corporateCode;
  }

  public void setCorporateCode(String corporateCode) {
    this.corporateCode = corporateCode;
  }

  public FareInfo corporateCode(String corporateCode) {
    this.corporateCode = corporateCode;
    return this;
  }

 /**
   * Flight identifiers associated to the fare (not available when using AirCalendar operations)
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public FareInfo flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public FareInfo addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareInfo {\n");
    
    sb.append("    fareType: ").append(toIndentedString(fareType)).append("\n");
    sb.append("    fareClass: ").append(toIndentedString(fareClass)).append("\n");
    sb.append("    pricedPassengerTypeCodes: ").append(toIndentedString(pricedPassengerTypeCodes)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
    sb.append("    ticketDesignator: ").append(toIndentedString(ticketDesignator)).append("\n");
    sb.append("    corporateCode: ").append(toIndentedString(corporateCode)).append("\n");
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
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

