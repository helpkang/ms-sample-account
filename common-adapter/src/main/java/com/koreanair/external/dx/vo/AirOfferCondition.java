package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirOfferConditionDetails;
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
  * Fare conditions about refundability, exchangeability, minimum/maximum stay corresponding to passengers and flights being part of the itinerary. 
 **/
@ApiModel(description="Fare conditions about refundability, exchangeability, minimum/maximum stay corresponding to passengers and flights being part of the itinerary. ")
public class AirOfferCondition  {
  
  @ApiModelProperty(value = "")
  private List<String> travelerIds = null;

  @ApiModelProperty(value = "")
  private List<String> flightIds = null;


@XmlType(name="CategoryEnum")
@XmlEnum(String.class)
public enum CategoryEnum {

@XmlEnumValue("advancePurchase") ADVANCEPURCHASE(String.valueOf("advancePurchase")), @XmlEnumValue("minimumStay") MINIMUMSTAY(String.valueOf("minimumStay")), @XmlEnumValue("maximumStay") MAXIMUMSTAY(String.valueOf("maximumStay")), @XmlEnumValue("change") CHANGE(String.valueOf("change")), @XmlEnumValue("refund") REFUND(String.valueOf("refund"));


    private String value;

    CategoryEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String v) {
        for (CategoryEnum b : CategoryEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Category of the condition (i.e.Advance Purchase, Minimum stay, Change conditions, Refund conditions) ")
 /**
   * Category of the condition (i.e.Advance Purchase, Minimum stay, Change conditions, Refund conditions) 
  **/
  private CategoryEnum category = null;


@XmlType(name="SituationEnum")
@XmlEnum(String.class)
public enum SituationEnum {

@XmlEnumValue("afterDeparture") AFTERDEPARTURE(String.valueOf("afterDeparture")), @XmlEnumValue("beforeDeparture") BEFOREDEPARTURE(String.valueOf("beforeDeparture")), @XmlEnumValue("afterDepartureNoShow") AFTERDEPARTURENOSHOW(String.valueOf("afterDepartureNoShow")), @XmlEnumValue("beforeDepartureNoShow") BEFOREDEPARTURENOSHOW(String.valueOf("beforeDepartureNoShow"));


    private String value;

    SituationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SituationEnum fromValue(String v) {
        for (SituationEnum b : SituationEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "It describes to which part of the trip the condition applies. (i.e. before/after departure, in case of no show, etc.) ")
 /**
   * It describes to which part of the trip the condition applies. (i.e. before/after departure, in case of no show, etc.) 
  **/
  private SituationEnum situation = null;

  @ApiModelProperty(value = "Exhaustive list of details corresponding to the fare condition")
 /**
   * Exhaustive list of details corresponding to the fare condition
  **/
  private List<AirOfferConditionDetails> details = null;
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

  public AirOfferCondition travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public AirOfferCondition addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * Get flightIds
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public AirOfferCondition flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public AirOfferCondition addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }

 /**
   * Category of the condition (i.e.Advance Purchase, Minimum stay, Change conditions, Refund conditions) 
   * @return category
  **/
  @JsonProperty("category")
  public String getCategory() {
    if (category == null) {
      return null;
    }
    return category.value();
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public AirOfferCondition category(CategoryEnum category) {
    this.category = category;
    return this;
  }

 /**
   * It describes to which part of the trip the condition applies. (i.e. before/after departure, in case of no show, etc.) 
   * @return situation
  **/
  @JsonProperty("situation")
  public String getSituation() {
    if (situation == null) {
      return null;
    }
    return situation.value();
  }

  public void setSituation(SituationEnum situation) {
    this.situation = situation;
  }

  public AirOfferCondition situation(SituationEnum situation) {
    this.situation = situation;
    return this;
  }

 /**
   * Exhaustive list of details corresponding to the fare condition
   * @return details
  **/
  @JsonProperty("details")
  public List<AirOfferConditionDetails> getDetails() {
    return details;
  }

  public void setDetails(List<AirOfferConditionDetails> details) {
    this.details = details;
  }

  public AirOfferCondition details(List<AirOfferConditionDetails> details) {
    this.details = details;
    return this;
  }

  public AirOfferCondition addDetailsItem(AirOfferConditionDetails detailsItem) {
    this.details.add(detailsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirOfferCondition {\n");
    
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    situation: ").append(toIndentedString(situation)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

