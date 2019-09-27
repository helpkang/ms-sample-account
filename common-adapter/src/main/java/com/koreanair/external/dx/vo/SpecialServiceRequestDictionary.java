package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BookingStatusDictionaryItem;
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

public class SpecialServiceRequestDictionary  {
  
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

  public SpecialServiceRequestDictionary specialServiceRequest(Map<String, SpecialServiceRequestDictionaryItem> specialServiceRequest) {
    this.specialServiceRequest = specialServiceRequest;
    return this;
  }

  public SpecialServiceRequestDictionary putSpecialServiceRequestItem(String key, SpecialServiceRequestDictionaryItem specialServiceRequestItem) {
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

  public SpecialServiceRequestDictionary bookingStatus(Map<String, BookingStatusDictionaryItem> bookingStatus) {
    this.bookingStatus = bookingStatus;
    return this;
  }

  public SpecialServiceRequestDictionary putBookingStatusItem(String key, BookingStatusDictionaryItem bookingStatusItem) {
    this.bookingStatus.put(key, bookingStatusItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialServiceRequestDictionary {\n");
    
    sb.append("    specialServiceRequest: ").append(toIndentedString(specialServiceRequest)).append("\n");
    sb.append("    bookingStatus: ").append(toIndentedString(bookingStatus)).append("\n");
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

