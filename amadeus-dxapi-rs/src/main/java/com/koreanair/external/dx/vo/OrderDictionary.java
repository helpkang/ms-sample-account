package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BookingStatusDictionaryItem;
import com.koreanair.external.dx.vo.CurrencyDictionaryItem;
import com.koreanair.external.dx.vo.DiscountDictionaryItem;
import com.koreanair.external.dx.vo.DynamicWaiverDictionaryItem;
import com.koreanair.external.dx.vo.FareFamilyDictionaryItem;
import com.koreanair.external.dx.vo.Flight;
import com.koreanair.external.dx.vo.FlightDictionary;
import com.koreanair.external.dx.vo.InsuranceOrderDictionary;
import com.koreanair.external.dx.vo.LocationDictionaryItem;
import com.koreanair.external.dx.vo.SeatCharacteristicDictionaryItem;
import com.koreanair.external.dx.vo.SpecialServiceRequestDictionaryItem;
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

public class OrderDictionary  {
  
  @ApiModelProperty(value = "Locations map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Locations map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, LocationDictionaryItem> location = null;

  @ApiModelProperty(value = "Countries map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Countries map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> country = null;

  @ApiModelProperty(value = "Airlines map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Airlines map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> airline = null;

  @ApiModelProperty(value = "Aircrafts map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Aircrafts map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> aircraft = null;

  @ApiModelProperty(value = "Flight information corresponding to a flight id. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Flight information corresponding to a flight id. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, Flight> flight = null;

  @ApiModelProperty(value = "Reference to Insurance dictionary")
 /**
   * Reference to Insurance dictionary
  **/
  private Map<String, InsuranceOrderDictionary> insurance = null;

  @ApiModelProperty(value = "Fare families map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Fare families map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, FareFamilyDictionaryItem> fareFamily = null;

  @ApiModelProperty(value = "Taxes map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Taxes map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> tax = null;

  @ApiModelProperty(value = "Surcharges map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Surcharges map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> surcharge = null;

  @ApiModelProperty(value = "Currencies map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Currencies map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, CurrencyDictionaryItem> currency = null;

  @ApiModelProperty(value = "Seat characteristics map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Seat characteristics map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, SeatCharacteristicDictionaryItem> seatCharacteristic = null;

  @ApiModelProperty(value = "Special service requests map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Special service requests map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, SpecialServiceRequestDictionaryItem> specialServiceRequest = null;

  @ApiModelProperty(value = "Status map for flights, services, seats and special service requests. For more details please see [Maps  in dictionary documentation] (http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Status map for flights, services, seats and special service requests. For more details please see [Maps  in dictionary documentation] (http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, BookingStatusDictionaryItem> bookingStatus = null;

  @ApiModelProperty(value = "Status map for meal codes. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Status map for meal codes. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> meal = null;

  @ApiModelProperty(value = "When a flight change is encouraged due to an anticipated disruption, you will will be allowed  to change the flight within the given conditions and the penalty for that flight change is then waived. If a waiver is offered, the conditions for the flight change are described here. [documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * When a flight change is encouraged due to an anticipated disruption, you will will be allowed  to change the flight within the given conditions and the penalty for that flight change is then waived. If a waiver is offered, the conditions for the flight change are described here. [documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, DynamicWaiverDictionaryItem> waivers = null;

  @ApiModelProperty(value = "Details about the discounts. The reference currency is the one defined at Price level. ")
 /**
   * Details about the discounts. The reference currency is the one defined at Price level. 
  **/
  private Map<String, DiscountDictionaryItem> discount = null;
 /**
   * Locations map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return location
  **/
  @JsonProperty("location")
  public Map<String, LocationDictionaryItem> getLocation() {
    return location;
  }

  public void setLocation(Map<String, LocationDictionaryItem> location) {
    this.location = location;
  }

  public OrderDictionary location(Map<String, LocationDictionaryItem> location) {
    this.location = location;
    return this;
  }

  public OrderDictionary putLocationItem(String key, LocationDictionaryItem locationItem) {
    this.location.put(key, locationItem);
    return this;
  }

 /**
   * Countries map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return country
  **/
  @JsonProperty("country")
  public Map<String, String> getCountry() {
    return country;
  }

  public void setCountry(Map<String, String> country) {
    this.country = country;
  }

  public OrderDictionary country(Map<String, String> country) {
    this.country = country;
    return this;
  }

  public OrderDictionary putCountryItem(String key, String countryItem) {
    this.country.put(key, countryItem);
    return this;
  }

 /**
   * Airlines map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return airline
  **/
  @JsonProperty("airline")
  public Map<String, String> getAirline() {
    return airline;
  }

  public void setAirline(Map<String, String> airline) {
    this.airline = airline;
  }

  public OrderDictionary airline(Map<String, String> airline) {
    this.airline = airline;
    return this;
  }

  public OrderDictionary putAirlineItem(String key, String airlineItem) {
    this.airline.put(key, airlineItem);
    return this;
  }

 /**
   * Aircrafts map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return aircraft
  **/
  @JsonProperty("aircraft")
  public Map<String, String> getAircraft() {
    return aircraft;
  }

  public void setAircraft(Map<String, String> aircraft) {
    this.aircraft = aircraft;
  }

  public OrderDictionary aircraft(Map<String, String> aircraft) {
    this.aircraft = aircraft;
    return this;
  }

  public OrderDictionary putAircraftItem(String key, String aircraftItem) {
    this.aircraft.put(key, aircraftItem);
    return this;
  }

 /**
   * Flight information corresponding to a flight id. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return flight
  **/
  @JsonProperty("flight")
  public Map<String, Flight> getFlight() {
    return flight;
  }

  public void setFlight(Map<String, Flight> flight) {
    this.flight = flight;
  }

  public OrderDictionary flight(Map<String, Flight> flight) {
    this.flight = flight;
    return this;
  }

  public OrderDictionary putFlightItem(String key, Flight flightItem) {
    this.flight.put(key, flightItem);
    return this;
  }

 /**
   * Reference to Insurance dictionary
   * @return insurance
  **/
  @JsonProperty("insurance")
  public Map<String, InsuranceOrderDictionary> getInsurance() {
    return insurance;
  }

  public void setInsurance(Map<String, InsuranceOrderDictionary> insurance) {
    this.insurance = insurance;
  }

  public OrderDictionary insurance(Map<String, InsuranceOrderDictionary> insurance) {
    this.insurance = insurance;
    return this;
  }

  public OrderDictionary putInsuranceItem(String key, InsuranceOrderDictionary insuranceItem) {
    this.insurance.put(key, insuranceItem);
    return this;
  }

 /**
   * Fare families map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return fareFamily
  **/
  @JsonProperty("fareFamily")
  public Map<String, FareFamilyDictionaryItem> getFareFamily() {
    return fareFamily;
  }

  public void setFareFamily(Map<String, FareFamilyDictionaryItem> fareFamily) {
    this.fareFamily = fareFamily;
  }

  public OrderDictionary fareFamily(Map<String, FareFamilyDictionaryItem> fareFamily) {
    this.fareFamily = fareFamily;
    return this;
  }

  public OrderDictionary putFareFamilyItem(String key, FareFamilyDictionaryItem fareFamilyItem) {
    this.fareFamily.put(key, fareFamilyItem);
    return this;
  }

 /**
   * Taxes map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return tax
  **/
  @JsonProperty("tax")
  public Map<String, String> getTax() {
    return tax;
  }

  public void setTax(Map<String, String> tax) {
    this.tax = tax;
  }

  public OrderDictionary tax(Map<String, String> tax) {
    this.tax = tax;
    return this;
  }

  public OrderDictionary putTaxItem(String key, String taxItem) {
    this.tax.put(key, taxItem);
    return this;
  }

 /**
   * Surcharges map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return surcharge
  **/
  @JsonProperty("surcharge")
  public Map<String, String> getSurcharge() {
    return surcharge;
  }

  public void setSurcharge(Map<String, String> surcharge) {
    this.surcharge = surcharge;
  }

  public OrderDictionary surcharge(Map<String, String> surcharge) {
    this.surcharge = surcharge;
    return this;
  }

  public OrderDictionary putSurchargeItem(String key, String surchargeItem) {
    this.surcharge.put(key, surchargeItem);
    return this;
  }

 /**
   * Currencies map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return currency
  **/
  @JsonProperty("currency")
  public Map<String, CurrencyDictionaryItem> getCurrency() {
    return currency;
  }

  public void setCurrency(Map<String, CurrencyDictionaryItem> currency) {
    this.currency = currency;
  }

  public OrderDictionary currency(Map<String, CurrencyDictionaryItem> currency) {
    this.currency = currency;
    return this;
  }

  public OrderDictionary putCurrencyItem(String key, CurrencyDictionaryItem currencyItem) {
    this.currency.put(key, currencyItem);
    return this;
  }

 /**
   * Seat characteristics map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return seatCharacteristic
  **/
  @JsonProperty("seatCharacteristic")
  public Map<String, SeatCharacteristicDictionaryItem> getSeatCharacteristic() {
    return seatCharacteristic;
  }

  public void setSeatCharacteristic(Map<String, SeatCharacteristicDictionaryItem> seatCharacteristic) {
    this.seatCharacteristic = seatCharacteristic;
  }

  public OrderDictionary seatCharacteristic(Map<String, SeatCharacteristicDictionaryItem> seatCharacteristic) {
    this.seatCharacteristic = seatCharacteristic;
    return this;
  }

  public OrderDictionary putSeatCharacteristicItem(String key, SeatCharacteristicDictionaryItem seatCharacteristicItem) {
    this.seatCharacteristic.put(key, seatCharacteristicItem);
    return this;
  }

 /**
   * Special service requests map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return specialServiceRequest
  **/
  @JsonProperty("specialServiceRequest")
  public Map<String, SpecialServiceRequestDictionaryItem> getSpecialServiceRequest() {
    return specialServiceRequest;
  }

  public void setSpecialServiceRequest(Map<String, SpecialServiceRequestDictionaryItem> specialServiceRequest) {
    this.specialServiceRequest = specialServiceRequest;
  }

  public OrderDictionary specialServiceRequest(Map<String, SpecialServiceRequestDictionaryItem> specialServiceRequest) {
    this.specialServiceRequest = specialServiceRequest;
    return this;
  }

  public OrderDictionary putSpecialServiceRequestItem(String key, SpecialServiceRequestDictionaryItem specialServiceRequestItem) {
    this.specialServiceRequest.put(key, specialServiceRequestItem);
    return this;
  }

 /**
   * Status map for flights, services, seats and special service requests. For more details please see [Maps  in dictionary documentation] (http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return bookingStatus
  **/
  @JsonProperty("bookingStatus")
  public Map<String, BookingStatusDictionaryItem> getBookingStatus() {
    return bookingStatus;
  }

  public void setBookingStatus(Map<String, BookingStatusDictionaryItem> bookingStatus) {
    this.bookingStatus = bookingStatus;
  }

  public OrderDictionary bookingStatus(Map<String, BookingStatusDictionaryItem> bookingStatus) {
    this.bookingStatus = bookingStatus;
    return this;
  }

  public OrderDictionary putBookingStatusItem(String key, BookingStatusDictionaryItem bookingStatusItem) {
    this.bookingStatus.put(key, bookingStatusItem);
    return this;
  }

 /**
   * Status map for meal codes. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return meal
  **/
  @JsonProperty("meal")
  public Map<String, String> getMeal() {
    return meal;
  }

  public void setMeal(Map<String, String> meal) {
    this.meal = meal;
  }

  public OrderDictionary meal(Map<String, String> meal) {
    this.meal = meal;
    return this;
  }

  public OrderDictionary putMealItem(String key, String mealItem) {
    this.meal.put(key, mealItem);
    return this;
  }

 /**
   * When a flight change is encouraged due to an anticipated disruption, you will will be allowed  to change the flight within the given conditions and the penalty for that flight change is then waived. If a waiver is offered, the conditions for the flight change are described here. [documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return waivers
  **/
  @JsonProperty("waivers")
  public Map<String, DynamicWaiverDictionaryItem> getWaivers() {
    return waivers;
  }

  public void setWaivers(Map<String, DynamicWaiverDictionaryItem> waivers) {
    this.waivers = waivers;
  }

  public OrderDictionary waivers(Map<String, DynamicWaiverDictionaryItem> waivers) {
    this.waivers = waivers;
    return this;
  }

  public OrderDictionary putWaiversItem(String key, DynamicWaiverDictionaryItem waiversItem) {
    this.waivers.put(key, waiversItem);
    return this;
  }

 /**
   * Details about the discounts. The reference currency is the one defined at Price level. 
   * @return discount
  **/
  @JsonProperty("discount")
  public Map<String, DiscountDictionaryItem> getDiscount() {
    return discount;
  }

  public void setDiscount(Map<String, DiscountDictionaryItem> discount) {
    this.discount = discount;
  }

  public OrderDictionary discount(Map<String, DiscountDictionaryItem> discount) {
    this.discount = discount;
    return this;
  }

  public OrderDictionary putDiscountItem(String key, DiscountDictionaryItem discountItem) {
    this.discount.put(key, discountItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDictionary {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    airline: ").append(toIndentedString(airline)).append("\n");
    sb.append("    aircraft: ").append(toIndentedString(aircraft)).append("\n");
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
    sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
    sb.append("    fareFamily: ").append(toIndentedString(fareFamily)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    seatCharacteristic: ").append(toIndentedString(seatCharacteristic)).append("\n");
    sb.append("    specialServiceRequest: ").append(toIndentedString(specialServiceRequest)).append("\n");
    sb.append("    bookingStatus: ").append(toIndentedString(bookingStatus)).append("\n");
    sb.append("    meal: ").append(toIndentedString(meal)).append("\n");
    sb.append("    waivers: ").append(toIndentedString(waivers)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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

