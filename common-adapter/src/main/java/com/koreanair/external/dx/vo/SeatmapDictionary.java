package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AnonymousTraveler;
import com.koreanair.external.dx.vo.CurrencyDictionaryItem;
import com.koreanair.external.dx.vo.DiscountDictionaryItem;
import com.koreanair.external.dx.vo.LocationDictionaryItem;
import com.koreanair.external.dx.vo.SeatCharacteristicDictionaryItem;
import com.koreanair.external.dx.vo.SeatMapDictionaryCommon;
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

public class SeatmapDictionary  {
  
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

  @ApiModelProperty(value = "Aircrafts map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/digitalapi/iswagger-ui/display/documentation.html#!/Maps/get)")
 /**
   * Aircrafts map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/digitalapi/iswagger-ui/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> aircraft = null;

  @ApiModelProperty(value = "Taxes map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Taxes map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> tax = null;

  @ApiModelProperty(value = "Currencies map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Currencies map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, CurrencyDictionaryItem> currency = null;

  @ApiModelProperty(value = "On board facilities map. E.g: bulkhead, closet, exit door, galley, lavatory... For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * On board facilities map. E.g: bulkhead, closet, exit door, galley, lavatory... For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> facility = null;

  @ApiModelProperty(value = "Seat characteristics map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Seat characteristics map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, SeatCharacteristicDictionaryItem> seatCharacteristic = null;

  @ApiModelProperty(value = "Discount information in seatmap. It contains airline code as well as the reason for discount")
 /**
   * Discount information in seatmap. It contains airline code as well as the reason for discount
  **/
  private Map<String, DiscountDictionaryItem> discount = null;

  @ApiModelProperty(value = "Basic information about an anonymous traveler such as the passenger type code and the frequent flyer card(s). Frequent flyer cards applies only for a particular case: a seatmap request based on a cart already containing frequent flyer card(s) but not yet traveler(s). For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Basic information about an anonymous traveler such as the passenger type code and the frequent flyer card(s). Frequent flyer cards applies only for a particular case: a seatmap request based on a cart already containing frequent flyer card(s) but not yet traveler(s). For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, AnonymousTraveler> anonymousTraveler = null;
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

  public SeatmapDictionary location(Map<String, LocationDictionaryItem> location) {
    this.location = location;
    return this;
  }

  public SeatmapDictionary putLocationItem(String key, LocationDictionaryItem locationItem) {
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

  public SeatmapDictionary country(Map<String, String> country) {
    this.country = country;
    return this;
  }

  public SeatmapDictionary putCountryItem(String key, String countryItem) {
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

  public SeatmapDictionary airline(Map<String, String> airline) {
    this.airline = airline;
    return this;
  }

  public SeatmapDictionary putAirlineItem(String key, String airlineItem) {
    this.airline.put(key, airlineItem);
    return this;
  }

 /**
   * Aircrafts map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/digitalapi/iswagger-ui/display/documentation.html#!/Maps/get)
   * @return aircraft
  **/
  @JsonProperty("aircraft")
  public Map<String, String> getAircraft() {
    return aircraft;
  }

  public void setAircraft(Map<String, String> aircraft) {
    this.aircraft = aircraft;
  }

  public SeatmapDictionary aircraft(Map<String, String> aircraft) {
    this.aircraft = aircraft;
    return this;
  }

  public SeatmapDictionary putAircraftItem(String key, String aircraftItem) {
    this.aircraft.put(key, aircraftItem);
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

  public SeatmapDictionary tax(Map<String, String> tax) {
    this.tax = tax;
    return this;
  }

  public SeatmapDictionary putTaxItem(String key, String taxItem) {
    this.tax.put(key, taxItem);
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

  public SeatmapDictionary currency(Map<String, CurrencyDictionaryItem> currency) {
    this.currency = currency;
    return this;
  }

  public SeatmapDictionary putCurrencyItem(String key, CurrencyDictionaryItem currencyItem) {
    this.currency.put(key, currencyItem);
    return this;
  }

 /**
   * On board facilities map. E.g: bulkhead, closet, exit door, galley, lavatory... For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return facility
  **/
  @JsonProperty("facility")
  public Map<String, String> getFacility() {
    return facility;
  }

  public void setFacility(Map<String, String> facility) {
    this.facility = facility;
  }

  public SeatmapDictionary facility(Map<String, String> facility) {
    this.facility = facility;
    return this;
  }

  public SeatmapDictionary putFacilityItem(String key, String facilityItem) {
    this.facility.put(key, facilityItem);
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

  public SeatmapDictionary seatCharacteristic(Map<String, SeatCharacteristicDictionaryItem> seatCharacteristic) {
    this.seatCharacteristic = seatCharacteristic;
    return this;
  }

  public SeatmapDictionary putSeatCharacteristicItem(String key, SeatCharacteristicDictionaryItem seatCharacteristicItem) {
    this.seatCharacteristic.put(key, seatCharacteristicItem);
    return this;
  }

 /**
   * Discount information in seatmap. It contains airline code as well as the reason for discount
   * @return discount
  **/
  @JsonProperty("discount")
  public Map<String, DiscountDictionaryItem> getDiscount() {
    return discount;
  }

  public void setDiscount(Map<String, DiscountDictionaryItem> discount) {
    this.discount = discount;
  }

  public SeatmapDictionary discount(Map<String, DiscountDictionaryItem> discount) {
    this.discount = discount;
    return this;
  }

  public SeatmapDictionary putDiscountItem(String key, DiscountDictionaryItem discountItem) {
    this.discount.put(key, discountItem);
    return this;
  }

 /**
   * Basic information about an anonymous traveler such as the passenger type code and the frequent flyer card(s). Frequent flyer cards applies only for a particular case: a seatmap request based on a cart already containing frequent flyer card(s) but not yet traveler(s). For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return anonymousTraveler
  **/
  @JsonProperty("anonymousTraveler")
  public Map<String, AnonymousTraveler> getAnonymousTraveler() {
    return anonymousTraveler;
  }

  public void setAnonymousTraveler(Map<String, AnonymousTraveler> anonymousTraveler) {
    this.anonymousTraveler = anonymousTraveler;
  }

  public SeatmapDictionary anonymousTraveler(Map<String, AnonymousTraveler> anonymousTraveler) {
    this.anonymousTraveler = anonymousTraveler;
    return this;
  }

  public SeatmapDictionary putAnonymousTravelerItem(String key, AnonymousTraveler anonymousTravelerItem) {
    this.anonymousTraveler.put(key, anonymousTravelerItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatmapDictionary {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    airline: ").append(toIndentedString(airline)).append("\n");
    sb.append("    aircraft: ").append(toIndentedString(aircraft)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    seatCharacteristic: ").append(toIndentedString(seatCharacteristic)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    anonymousTraveler: ").append(toIndentedString(anonymousTraveler)).append("\n");
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

