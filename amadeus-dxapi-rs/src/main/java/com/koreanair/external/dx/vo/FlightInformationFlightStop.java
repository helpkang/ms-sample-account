package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FlightDelay;
import com.koreanair.external.dx.vo.FlightInformationArrivalTimings;
import com.koreanair.external.dx.vo.FlightInformationDepartureTimings;
import com.koreanair.external.dx.vo.FlightInformationDiversionAirport;
import com.koreanair.external.dx.vo.FlightStop;
import com.koreanair.external.dx.vo.Meal;
import java.time.LocalDateTime;
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

public class FlightInformationFlightStop  {
  
  @ApiModelProperty(value = "Flight will stop at this location")
 /**
   * Flight will stop at this location
  **/
  private String locationCode = null;

  @ApiModelProperty(value = "Flight will stop at this terminal")
 /**
   * Flight will stop at this terminal
  **/
  private String departureTerminal = null;

  @ApiModelProperty(value = "Stop duration expressed in seconds")
 /**
   * Stop duration expressed in seconds
  **/
  private Integer duration = null;

  @ApiModelProperty(value = "Type of stop")
 /**
   * Type of stop
  **/
  private Boolean isChangeOfGauge = null;

  @ApiModelProperty(example = "2018-02-10T20:40:00+02:00", value = "Arrival at the stop with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)")
 /**
   * Arrival at the stop with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)
  **/
  private LocalDateTime arrivalDateTime = null;

  @ApiModelProperty(example = "2018-02-10T20:40:00+02:00", value = "Departure from the stop with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)")
 /**
   * Departure from the stop with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)
  **/
  private LocalDateTime departureDateTime = null;

  @ApiModelProperty(value = "IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php). Specified if a change of gauge (with change of aircraft) occurs")
 /**
   * IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php). Specified if a change of gauge (with change of aircraft) occurs
  **/
  private String aircraftCode = null;

  @ApiModelProperty(value = "Departure timings")
 /**
   * Departure timings
  **/
  private FlightInformationDepartureTimings departureTimings = null;

  @ApiModelProperty(value = "Arrival timings")
 /**
   * Arrival timings
  **/
  private FlightInformationArrivalTimings arrivalTimings = null;

  @ApiModelProperty(value = "Diversion information if available")
 /**
   * Diversion information if available
  **/
  private FlightInformationDiversionAirport diversion = null;

  @ApiModelProperty(value = "Information on the list of booking classes available in the flight.")
 /**
   * Information on the list of booking classes available in the flight.
  **/
  private List<String> availableBookingClasses = null;


@XmlType(name="FlightStatusEnum")
@XmlEnum(String.class)
public enum FlightStatusEnum {

@XmlEnumValue("scheduled") SCHEDULED(String.valueOf("scheduled")), @XmlEnumValue("departed") DEPARTED(String.valueOf("departed")), @XmlEnumValue("cancelled") CANCELLED(String.valueOf("cancelled")), @XmlEnumValue("delayed") DELAYED(String.valueOf("delayed")), @XmlEnumValue("arrived") ARRIVED(String.valueOf("arrived")), @XmlEnumValue("landingCancelled") LANDINGCANCELLED(String.valueOf("landingCancelled")), @XmlEnumValue("diverted") DIVERTED(String.valueOf("diverted"));


    private String value;

    FlightStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FlightStatusEnum fromValue(String v) {
        for (FlightStatusEnum b : FlightStatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Status of the flight")
 /**
   * Status of the flight
  **/
  private FlightStatusEnum flightStatus = null;

  @ApiModelProperty(value = "")
  private FlightDelay flightDelay = null;

  @ApiModelProperty(value = "Provides information of meals for every available booking class in the flight. Meal code specifies the type of meal available per booking class. B=BREAKFAST, K=CONTINENTAL BREAKFAST, L=LUNCH, D=DINNER, S=SNACK OR BRUNCH, O=COLD MEAL, H=HOT MEAL, M=MEAL (NON-SPECIFIC), R=REFRESHMENT, C=ALCOHOLIC BEVERAGES COMPLIMENTARY,F=FOOD FOR PURCHASE, P=ALCOHOLIC BEVERAGES FOR PURCHASE,  Y=DUTY FREE SALES AVAILABLE, N=NO MEAL SERVICE, V=REFRESHMENTS FOR PURCHASE, G=FOOD AND BEVERAGES FOR PURCHASE. Booking Class can be Y=Economy.")
 /**
   * Provides information of meals for every available booking class in the flight. Meal code specifies the type of meal available per booking class. B=BREAKFAST, K=CONTINENTAL BREAKFAST, L=LUNCH, D=DINNER, S=SNACK OR BRUNCH, O=COLD MEAL, H=HOT MEAL, M=MEAL (NON-SPECIFIC), R=REFRESHMENT, C=ALCOHOLIC BEVERAGES COMPLIMENTARY,F=FOOD FOR PURCHASE, P=ALCOHOLIC BEVERAGES FOR PURCHASE,  Y=DUTY FREE SALES AVAILABLE, N=NO MEAL SERVICE, V=REFRESHMENTS FOR PURCHASE, G=FOOD AND BEVERAGES FOR PURCHASE. Booking Class can be Y=Economy.
  **/
  private List<Meal> availableMealsPerBookingClass = null;
 /**
   * Flight will stop at this location
   * @return locationCode
  **/
  @JsonProperty("locationCode")
  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public FlightInformationFlightStop locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

 /**
   * Flight will stop at this terminal
   * @return departureTerminal
  **/
  @JsonProperty("departureTerminal")
  public String getDepartureTerminal() {
    return departureTerminal;
  }

  public void setDepartureTerminal(String departureTerminal) {
    this.departureTerminal = departureTerminal;
  }

  public FlightInformationFlightStop departureTerminal(String departureTerminal) {
    this.departureTerminal = departureTerminal;
    return this;
  }

 /**
   * Stop duration expressed in seconds
   * @return duration
  **/
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public FlightInformationFlightStop duration(Integer duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Type of stop
   * @return isChangeOfGauge
  **/
  @JsonProperty("isChangeOfGauge")
  public Boolean isIsChangeOfGauge() {
    return isChangeOfGauge;
  }

  public void setIsChangeOfGauge(Boolean isChangeOfGauge) {
    this.isChangeOfGauge = isChangeOfGauge;
  }

  public FlightInformationFlightStop isChangeOfGauge(Boolean isChangeOfGauge) {
    this.isChangeOfGauge = isChangeOfGauge;
    return this;
  }

 /**
   * Arrival at the stop with the following format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return arrivalDateTime
  **/
  @JsonProperty("arrivalDateTime")
  public LocalDateTime getArrivalDateTime() {
    return arrivalDateTime;
  }

  public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
    this.arrivalDateTime = arrivalDateTime;
  }

  public FlightInformationFlightStop arrivalDateTime(LocalDateTime arrivalDateTime) {
    this.arrivalDateTime = arrivalDateTime;
    return this;
  }

 /**
   * Departure from the stop with the following format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return departureDateTime
  **/
  @JsonProperty("departureDateTime")
  public LocalDateTime getDepartureDateTime() {
    return departureDateTime;
  }

  public void setDepartureDateTime(LocalDateTime departureDateTime) {
    this.departureDateTime = departureDateTime;
  }

  public FlightInformationFlightStop departureDateTime(LocalDateTime departureDateTime) {
    this.departureDateTime = departureDateTime;
    return this;
  }

 /**
   * IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php). Specified if a change of gauge (with change of aircraft) occurs
   * @return aircraftCode
  **/
  @JsonProperty("aircraftCode")
  public String getAircraftCode() {
    return aircraftCode;
  }

  public void setAircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
  }

  public FlightInformationFlightStop aircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
    return this;
  }

 /**
   * Departure timings
   * @return departureTimings
  **/
  @JsonProperty("departureTimings")
  public FlightInformationDepartureTimings getDepartureTimings() {
    return departureTimings;
  }

  public void setDepartureTimings(FlightInformationDepartureTimings departureTimings) {
    this.departureTimings = departureTimings;
  }

  public FlightInformationFlightStop departureTimings(FlightInformationDepartureTimings departureTimings) {
    this.departureTimings = departureTimings;
    return this;
  }

 /**
   * Arrival timings
   * @return arrivalTimings
  **/
  @JsonProperty("arrivalTimings")
  public FlightInformationArrivalTimings getArrivalTimings() {
    return arrivalTimings;
  }

  public void setArrivalTimings(FlightInformationArrivalTimings arrivalTimings) {
    this.arrivalTimings = arrivalTimings;
  }

  public FlightInformationFlightStop arrivalTimings(FlightInformationArrivalTimings arrivalTimings) {
    this.arrivalTimings = arrivalTimings;
    return this;
  }

 /**
   * Diversion information if available
   * @return diversion
  **/
  @JsonProperty("diversion")
  public FlightInformationDiversionAirport getDiversion() {
    return diversion;
  }

  public void setDiversion(FlightInformationDiversionAirport diversion) {
    this.diversion = diversion;
  }

  public FlightInformationFlightStop diversion(FlightInformationDiversionAirport diversion) {
    this.diversion = diversion;
    return this;
  }

 /**
   * Information on the list of booking classes available in the flight.
   * @return availableBookingClasses
  **/
  @JsonProperty("availableBookingClasses")
  public List<String> getAvailableBookingClasses() {
    return availableBookingClasses;
  }

  public void setAvailableBookingClasses(List<String> availableBookingClasses) {
    this.availableBookingClasses = availableBookingClasses;
  }

  public FlightInformationFlightStop availableBookingClasses(List<String> availableBookingClasses) {
    this.availableBookingClasses = availableBookingClasses;
    return this;
  }

  public FlightInformationFlightStop addAvailableBookingClassesItem(String availableBookingClassesItem) {
    this.availableBookingClasses.add(availableBookingClassesItem);
    return this;
  }

 /**
   * Status of the flight
   * @return flightStatus
  **/
  @JsonProperty("flightStatus")
  public String getFlightStatus() {
    if (flightStatus == null) {
      return null;
    }
    return flightStatus.value();
  }

  public void setFlightStatus(FlightStatusEnum flightStatus) {
    this.flightStatus = flightStatus;
  }

  public FlightInformationFlightStop flightStatus(FlightStatusEnum flightStatus) {
    this.flightStatus = flightStatus;
    return this;
  }

 /**
   * Get flightDelay
   * @return flightDelay
  **/
  @JsonProperty("flightDelay")
  public FlightDelay getFlightDelay() {
    return flightDelay;
  }

  public void setFlightDelay(FlightDelay flightDelay) {
    this.flightDelay = flightDelay;
  }

  public FlightInformationFlightStop flightDelay(FlightDelay flightDelay) {
    this.flightDelay = flightDelay;
    return this;
  }

 /**
   * Provides information of meals for every available booking class in the flight. Meal code specifies the type of meal available per booking class. B&#x3D;BREAKFAST, K&#x3D;CONTINENTAL BREAKFAST, L&#x3D;LUNCH, D&#x3D;DINNER, S&#x3D;SNACK OR BRUNCH, O&#x3D;COLD MEAL, H&#x3D;HOT MEAL, M&#x3D;MEAL (NON-SPECIFIC), R&#x3D;REFRESHMENT, C&#x3D;ALCOHOLIC BEVERAGES COMPLIMENTARY,F&#x3D;FOOD FOR PURCHASE, P&#x3D;ALCOHOLIC BEVERAGES FOR PURCHASE,  Y&#x3D;DUTY FREE SALES AVAILABLE, N&#x3D;NO MEAL SERVICE, V&#x3D;REFRESHMENTS FOR PURCHASE, G&#x3D;FOOD AND BEVERAGES FOR PURCHASE. Booking Class can be Y&#x3D;Economy.
   * @return availableMealsPerBookingClass
  **/
  @JsonProperty("availableMealsPerBookingClass")
  public List<Meal> getAvailableMealsPerBookingClass() {
    return availableMealsPerBookingClass;
  }

  public void setAvailableMealsPerBookingClass(List<Meal> availableMealsPerBookingClass) {
    this.availableMealsPerBookingClass = availableMealsPerBookingClass;
  }

  public FlightInformationFlightStop availableMealsPerBookingClass(List<Meal> availableMealsPerBookingClass) {
    this.availableMealsPerBookingClass = availableMealsPerBookingClass;
    return this;
  }

  public FlightInformationFlightStop addAvailableMealsPerBookingClassItem(Meal availableMealsPerBookingClassItem) {
    this.availableMealsPerBookingClass.add(availableMealsPerBookingClassItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightInformationFlightStop {\n");
    
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    departureTerminal: ").append(toIndentedString(departureTerminal)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    isChangeOfGauge: ").append(toIndentedString(isChangeOfGauge)).append("\n");
    sb.append("    arrivalDateTime: ").append(toIndentedString(arrivalDateTime)).append("\n");
    sb.append("    departureDateTime: ").append(toIndentedString(departureDateTime)).append("\n");
    sb.append("    aircraftCode: ").append(toIndentedString(aircraftCode)).append("\n");
    sb.append("    departureTimings: ").append(toIndentedString(departureTimings)).append("\n");
    sb.append("    arrivalTimings: ").append(toIndentedString(arrivalTimings)).append("\n");
    sb.append("    diversion: ").append(toIndentedString(diversion)).append("\n");
    sb.append("    availableBookingClasses: ").append(toIndentedString(availableBookingClasses)).append("\n");
    sb.append("    flightStatus: ").append(toIndentedString(flightStatus)).append("\n");
    sb.append("    flightDelay: ").append(toIndentedString(flightDelay)).append("\n");
    sb.append("    availableMealsPerBookingClass: ").append(toIndentedString(availableMealsPerBookingClass)).append("\n");
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

