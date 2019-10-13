package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;

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
  * Boarding Pass data related to the lounge access for the traveler if he has access to one. 
 **/
@ApiModel(description="Boarding Pass data related to the lounge access for the traveler if he has access to one. ")
public class BoardingPassLounge  {
  

@XmlType(name="AirportEnum")
@XmlEnum(String.class)
public enum AirportEnum {

@XmlEnumValue("departure") DEPARTURE(String.valueOf("departure")), @XmlEnumValue("arrival") ARRIVAL(String.valueOf("arrival"));


    private String value;

    AirportEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AirportEnum fromValue(String v) {
        for (AirportEnum b : AirportEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Indicate if the lounge access is for the departure or arrival airport")
 /**
   * Indicate if the lounge access is for the departure or arrival airport
  **/
  private AirportEnum airport = null;

  @ApiModelProperty(example = "AMADEUS LOUNGE", value = "Name of the lounge at the airport")
 /**
   * Name of the lounge at the airport
  **/
  private String name = null;

  @ApiModelProperty(example = "LOCATED AT GATE 37", value = "Information to help the traveler find where the lounge is within the terminal (English only).")
 /**
   * Information to help the traveler find where the lounge is within the terminal (English only).
  **/
  private String location = null;

  @ApiModelProperty(example = "WELCOME TO", value = "Welcome message to invite the traveler to the lounge (English only).")
 /**
   * Welcome message to invite the traveler to the lounge (English only).
  **/
  private String invitationText = null;

  @ApiModelProperty(example = "AMADEUS TOP FLYER CLUB", value = "Small description of the lounge")
 /**
   * Small description of the lounge
  **/
  private String description = null;

  @ApiModelProperty(value = "")
  private Integer numberOfGuests = null;
 /**
   * Indicate if the lounge access is for the departure or arrival airport
   * @return airport
  **/
  @JsonProperty("airport")
  public String getAirport() {
    if (airport == null) {
      return null;
    }
    return airport.value();
  }

  public void setAirport(AirportEnum airport) {
    this.airport = airport;
  }

  public BoardingPassLounge airport(AirportEnum airport) {
    this.airport = airport;
    return this;
  }

 /**
   * Name of the lounge at the airport
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BoardingPassLounge name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Information to help the traveler find where the lounge is within the terminal (English only).
   * @return location
  **/
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public BoardingPassLounge location(String location) {
    this.location = location;
    return this;
  }

 /**
   * Welcome message to invite the traveler to the lounge (English only).
   * @return invitationText
  **/
  @JsonProperty("invitationText")
  public String getInvitationText() {
    return invitationText;
  }

  public void setInvitationText(String invitationText) {
    this.invitationText = invitationText;
  }

  public BoardingPassLounge invitationText(String invitationText) {
    this.invitationText = invitationText;
    return this;
  }

 /**
   * Small description of the lounge
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BoardingPassLounge description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get numberOfGuests
   * minimum: 0
   * @return numberOfGuests
  **/
  @JsonProperty("numberOfGuests")
  public Integer getNumberOfGuests() {
    return numberOfGuests;
  }

  public void setNumberOfGuests(Integer numberOfGuests) {
    this.numberOfGuests = numberOfGuests;
  }

  public BoardingPassLounge numberOfGuests(Integer numberOfGuests) {
    this.numberOfGuests = numberOfGuests;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardingPassLounge {\n");
    
    sb.append("    airport: ").append(toIndentedString(airport)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    invitationText: ").append(toIndentedString(invitationText)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    numberOfGuests: ").append(toIndentedString(numberOfGuests)).append("\n");
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

