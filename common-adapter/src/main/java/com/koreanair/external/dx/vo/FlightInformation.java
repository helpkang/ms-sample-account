package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FlightDelay;
import com.koreanair.external.dx.vo.FlightInformationAirlineCommon;
import com.koreanair.external.dx.vo.FlightInformationArrivalEndPoint;
import com.koreanair.external.dx.vo.FlightInformationDepartureEndPoint;
import com.koreanair.external.dx.vo.FlightInformationFlightStop;
import com.koreanair.external.dx.vo.FlightInformationOperatingFlight;
import com.koreanair.external.dx.vo.FlightInformationSegment;
import com.koreanair.external.dx.vo.FlightPerformanceIndicator;
import com.koreanair.external.dx.vo.Meal;
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
  * Flight information corresponding to a flight id. 
 **/
@ApiModel(description="Flight information corresponding to a flight id. ")
public class FlightInformation  {
  
  @ApiModelProperty(value = "")
  private FlightInformationDepartureEndPoint departure = null;

  @ApiModelProperty(value = "")
  private FlightInformationArrivalEndPoint arrival = null;

  @ApiModelProperty(value = "Information about the flight")
 /**
   * Information about the flight
  **/
  private FlightInformationAirlineCommon marketingFlight = null;

  @ApiModelProperty(value = "Information about the operating flight")
 /**
   * Information about the operating flight
  **/
  private FlightInformationOperatingFlight operatingFlight = null;

  @ApiModelProperty(value = "Open segment")
 /**
   * Open segment
  **/
  private Boolean isOpenSegment = false;

  @ApiModelProperty(value = "Flag indicating if some travel documents are needed for this flight")
 /**
   * Flag indicating if some travel documents are needed for this flight
  **/
  private Boolean secureFlightIndicator = false;

  @ApiModelProperty(value = "")
  private FlightPerformanceIndicator performanceIndicator = null;

  @ApiModelProperty(value = "IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php)")
 /**
   * IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php)
  **/
  private String aircraftCode = null;

  @ApiModelProperty(value = "Details of stops for direct or change of gauge flights")
 /**
   * Details of stops for direct or change of gauge flights
  **/
  private List<FlightInformationFlightStop> stops = null;

  @ApiModelProperty(value = "Duration time expressed in seconds")
 /**
   * Duration time expressed in seconds
  **/
  private Integer duration = null;

  @ApiModelProperty(required = true, value = "Information on the list of booking classes available in the flight.")
 /**
   * Information on the list of booking classes available in the flight.
  **/
  private List<String> availableBookingClasses = new ArrayList<>();


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

  @ApiModelProperty(required = true, value = "status of the flight")
 /**
   * status of the flight
  **/
  private FlightStatusEnum flightStatus = null;

  @ApiModelProperty(value = "")
  private FlightDelay flightDelay = null;

  @ApiModelProperty(value = "Provides the list of meals per booking class in the flight. B=BREAKFAST, K=CONTINENTAL BREAKFAST, L=LUNCH, D=DINNER, S=SNACK OR BRUNCH, O=COLD MEAL, H=HOT MEAL, M=MEAL (NON-SPECIFIC), R=REFRESHMENT, C=ALCOHOLIC BEVERAGES COMPLIMENTARY,F=FOOD FOR PURCHASE, P=ALCOHOLIC BEVERAGES FOR PURCHASE,  Y=DUTY FREE SALES AVAILABLE, N=NO MEAL SERVICE, V=REFRESHMENTS FOR PURCHASE, G=FOOD AND BEVERAGES FOR PURCHASE. Booking Class can be Y=Economy.")
 /**
   * Provides the list of meals per booking class in the flight. B=BREAKFAST, K=CONTINENTAL BREAKFAST, L=LUNCH, D=DINNER, S=SNACK OR BRUNCH, O=COLD MEAL, H=HOT MEAL, M=MEAL (NON-SPECIFIC), R=REFRESHMENT, C=ALCOHOLIC BEVERAGES COMPLIMENTARY,F=FOOD FOR PURCHASE, P=ALCOHOLIC BEVERAGES FOR PURCHASE,  Y=DUTY FREE SALES AVAILABLE, N=NO MEAL SERVICE, V=REFRESHMENTS FOR PURCHASE, G=FOOD AND BEVERAGES FOR PURCHASE. Booking Class can be Y=Economy.
  **/
  private List<Meal> availableMealsPerBookingClass = null;
 /**
   * Get departure
   * @return departure
  **/
  @JsonProperty("departure")
  public FlightInformationDepartureEndPoint getDeparture() {
    return departure;
  }

  public void setDeparture(FlightInformationDepartureEndPoint departure) {
    this.departure = departure;
  }

  public FlightInformation departure(FlightInformationDepartureEndPoint departure) {
    this.departure = departure;
    return this;
  }

 /**
   * Get arrival
   * @return arrival
  **/
  @JsonProperty("arrival")
  public FlightInformationArrivalEndPoint getArrival() {
    return arrival;
  }

  public void setArrival(FlightInformationArrivalEndPoint arrival) {
    this.arrival = arrival;
  }

  public FlightInformation arrival(FlightInformationArrivalEndPoint arrival) {
    this.arrival = arrival;
    return this;
  }

 /**
   * Information about the flight
   * @return marketingFlight
  **/
  @JsonProperty("marketingFlight")
  public FlightInformationAirlineCommon getMarketingFlight() {
    return marketingFlight;
  }

  public void setMarketingFlight(FlightInformationAirlineCommon marketingFlight) {
    this.marketingFlight = marketingFlight;
  }

  public FlightInformation marketingFlight(FlightInformationAirlineCommon marketingFlight) {
    this.marketingFlight = marketingFlight;
    return this;
  }

 /**
   * Information about the operating flight
   * @return operatingFlight
  **/
  @JsonProperty("operatingFlight")
  public FlightInformationOperatingFlight getOperatingFlight() {
    return operatingFlight;
  }

  public void setOperatingFlight(FlightInformationOperatingFlight operatingFlight) {
    this.operatingFlight = operatingFlight;
  }

  public FlightInformation operatingFlight(FlightInformationOperatingFlight operatingFlight) {
    this.operatingFlight = operatingFlight;
    return this;
  }

 /**
   * Open segment
   * @return isOpenSegment
  **/
  @JsonProperty("isOpenSegment")
  public Boolean isIsOpenSegment() {
    return isOpenSegment;
  }

  public void setIsOpenSegment(Boolean isOpenSegment) {
    this.isOpenSegment = isOpenSegment;
  }

  public FlightInformation isOpenSegment(Boolean isOpenSegment) {
    this.isOpenSegment = isOpenSegment;
    return this;
  }

 /**
   * Flag indicating if some travel documents are needed for this flight
   * @return secureFlightIndicator
  **/
  @JsonProperty("secureFlightIndicator")
  public Boolean isSecureFlightIndicator() {
    return secureFlightIndicator;
  }

  public void setSecureFlightIndicator(Boolean secureFlightIndicator) {
    this.secureFlightIndicator = secureFlightIndicator;
  }

  public FlightInformation secureFlightIndicator(Boolean secureFlightIndicator) {
    this.secureFlightIndicator = secureFlightIndicator;
    return this;
  }

 /**
   * Get performanceIndicator
   * @return performanceIndicator
  **/
  @JsonProperty("performanceIndicator")
  public FlightPerformanceIndicator getPerformanceIndicator() {
    return performanceIndicator;
  }

  public void setPerformanceIndicator(FlightPerformanceIndicator performanceIndicator) {
    this.performanceIndicator = performanceIndicator;
  }

  public FlightInformation performanceIndicator(FlightPerformanceIndicator performanceIndicator) {
    this.performanceIndicator = performanceIndicator;
    return this;
  }

 /**
   * IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php)
   * @return aircraftCode
  **/
  @JsonProperty("aircraftCode")
  public String getAircraftCode() {
    return aircraftCode;
  }

  public void setAircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
  }

  public FlightInformation aircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
    return this;
  }

 /**
   * Details of stops for direct or change of gauge flights
   * @return stops
  **/
  @JsonProperty("stops")
  public List<FlightInformationFlightStop> getStops() {
    return stops;
  }

  public void setStops(List<FlightInformationFlightStop> stops) {
    this.stops = stops;
  }

  public FlightInformation stops(List<FlightInformationFlightStop> stops) {
    this.stops = stops;
    return this;
  }

  public FlightInformation addStopsItem(FlightInformationFlightStop stopsItem) {
    this.stops.add(stopsItem);
    return this;
  }

 /**
   * Duration time expressed in seconds
   * @return duration
  **/
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public FlightInformation duration(Integer duration) {
    this.duration = duration;
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

  public FlightInformation availableBookingClasses(List<String> availableBookingClasses) {
    this.availableBookingClasses = availableBookingClasses;
    return this;
  }

  public FlightInformation addAvailableBookingClassesItem(String availableBookingClassesItem) {
    this.availableBookingClasses.add(availableBookingClassesItem);
    return this;
  }

 /**
   * status of the flight
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

  public FlightInformation flightStatus(FlightStatusEnum flightStatus) {
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

  public FlightInformation flightDelay(FlightDelay flightDelay) {
    this.flightDelay = flightDelay;
    return this;
  }

 /**
   * Provides the list of meals per booking class in the flight. B&#x3D;BREAKFAST, K&#x3D;CONTINENTAL BREAKFAST, L&#x3D;LUNCH, D&#x3D;DINNER, S&#x3D;SNACK OR BRUNCH, O&#x3D;COLD MEAL, H&#x3D;HOT MEAL, M&#x3D;MEAL (NON-SPECIFIC), R&#x3D;REFRESHMENT, C&#x3D;ALCOHOLIC BEVERAGES COMPLIMENTARY,F&#x3D;FOOD FOR PURCHASE, P&#x3D;ALCOHOLIC BEVERAGES FOR PURCHASE,  Y&#x3D;DUTY FREE SALES AVAILABLE, N&#x3D;NO MEAL SERVICE, V&#x3D;REFRESHMENTS FOR PURCHASE, G&#x3D;FOOD AND BEVERAGES FOR PURCHASE. Booking Class can be Y&#x3D;Economy.
   * @return availableMealsPerBookingClass
  **/
  @JsonProperty("availableMealsPerBookingClass")
  public List<Meal> getAvailableMealsPerBookingClass() {
    return availableMealsPerBookingClass;
  }

  public void setAvailableMealsPerBookingClass(List<Meal> availableMealsPerBookingClass) {
    this.availableMealsPerBookingClass = availableMealsPerBookingClass;
  }

  public FlightInformation availableMealsPerBookingClass(List<Meal> availableMealsPerBookingClass) {
    this.availableMealsPerBookingClass = availableMealsPerBookingClass;
    return this;
  }

  public FlightInformation addAvailableMealsPerBookingClassItem(Meal availableMealsPerBookingClassItem) {
    this.availableMealsPerBookingClass.add(availableMealsPerBookingClassItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightInformation {\n");
    
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    marketingFlight: ").append(toIndentedString(marketingFlight)).append("\n");
    sb.append("    operatingFlight: ").append(toIndentedString(operatingFlight)).append("\n");
    sb.append("    isOpenSegment: ").append(toIndentedString(isOpenSegment)).append("\n");
    sb.append("    secureFlightIndicator: ").append(toIndentedString(secureFlightIndicator)).append("\n");
    sb.append("    performanceIndicator: ").append(toIndentedString(performanceIndicator)).append("\n");
    sb.append("    aircraftCode: ").append(toIndentedString(aircraftCode)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

