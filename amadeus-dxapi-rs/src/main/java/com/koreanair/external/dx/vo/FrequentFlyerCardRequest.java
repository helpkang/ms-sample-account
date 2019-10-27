package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FrequentFlyerCard;
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
  * Frequent flyer card to be added to a cart or order. Usage of the card can be specified (miles accrual or servicing). Either a new card or an existing card can be specified. For an existing card (used for miles accrual), an other usage can be specified (servicing).
 **/
@ApiModel(description="Frequent flyer card to be added to a cart or order. Usage of the card can be specified (miles accrual or servicing). Either a new card or an existing card can be specified. For an existing card (used for miles accrual), an other usage can be specified (servicing).")
public class FrequentFlyerCardRequest  {
  
  @ApiModelProperty(value = "")
  private FrequentFlyerCard frequentFlyerCard = null;


@XmlType(name="UsageEnum")
@XmlEnum(String.class)
public enum UsageEnum {

@XmlEnumValue("milesAccrual") MILESACCRUAL(String.valueOf("milesAccrual")), @XmlEnumValue("servicing") SERVICING(String.valueOf("servicing"));


    private String value;

    UsageEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UsageEnum fromValue(String v) {
        for (UsageEnum b : UsageEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Usage of the card")
 /**
   * Usage of the card
  **/
  private UsageEnum usage = UsageEnum.MILESACCRUAL;

  @ApiModelProperty(value = "A list of flights associated to this frequent flyer card request. If not specified, the request is created without flight association for specified airline or all airlines of the itinerary.")
 /**
   * A list of flights associated to this frequent flyer card request. If not specified, the request is created without flight association for specified airline or all airlines of the itinerary.
  **/
  private List<String> flightIds = null;

  @ApiModelProperty(value = "Two letter airline codes defined for the frequent flyer request. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). If not specified, the request applies to all airlines of the itinerary.")
 /**
   * Two letter airline codes defined for the frequent flyer request. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). If not specified, the request applies to all airlines of the itinerary.
  **/
  private List<String> airlineCodes = null;
 /**
   * Get frequentFlyerCard
   * @return frequentFlyerCard
  **/
  @JsonProperty("frequentFlyerCard")
  public FrequentFlyerCard getFrequentFlyerCard() {
    return frequentFlyerCard;
  }

  public void setFrequentFlyerCard(FrequentFlyerCard frequentFlyerCard) {
    this.frequentFlyerCard = frequentFlyerCard;
  }

  public FrequentFlyerCardRequest frequentFlyerCard(FrequentFlyerCard frequentFlyerCard) {
    this.frequentFlyerCard = frequentFlyerCard;
    return this;
  }

 /**
   * Usage of the card
   * @return usage
  **/
  @JsonProperty("usage")
  public String getUsage() {
    if (usage == null) {
      return null;
    }
    return usage.value();
  }

  public void setUsage(UsageEnum usage) {
    this.usage = usage;
  }

  public FrequentFlyerCardRequest usage(UsageEnum usage) {
    this.usage = usage;
    return this;
  }

 /**
   * A list of flights associated to this frequent flyer card request. If not specified, the request is created without flight association for specified airline or all airlines of the itinerary.
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public FrequentFlyerCardRequest flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public FrequentFlyerCardRequest addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }

 /**
   * Two letter airline codes defined for the frequent flyer request. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). If not specified, the request applies to all airlines of the itinerary.
   * @return airlineCodes
  **/
  @JsonProperty("airlineCodes")
  public List<String> getAirlineCodes() {
    return airlineCodes;
  }

  public void setAirlineCodes(List<String> airlineCodes) {
    this.airlineCodes = airlineCodes;
  }

  public FrequentFlyerCardRequest airlineCodes(List<String> airlineCodes) {
    this.airlineCodes = airlineCodes;
    return this;
  }

  public FrequentFlyerCardRequest addAirlineCodesItem(String airlineCodesItem) {
    this.airlineCodes.add(airlineCodesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentFlyerCardRequest {\n");
    
    sb.append("    frequentFlyerCard: ").append(toIndentedString(frequentFlyerCard)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
    sb.append("    airlineCodes: ").append(toIndentedString(airlineCodes)).append("\n");
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

