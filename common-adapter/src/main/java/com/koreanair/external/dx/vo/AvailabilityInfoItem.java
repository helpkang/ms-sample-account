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
  * It contains the information about flight associated to an `airBoundGroup`, when using construction mode shopping
 **/
@ApiModel(description="It contains the information about flight associated to an `airBoundGroup`, when using construction mode shopping")
public class AvailabilityInfoItem  {
  
  @ApiModelProperty(value = "Identifier of the flight referenced in the airBoundGroup.")
 /**
   * Identifier of the flight referenced in the airBoundGroup.
  **/
  private String flightId = null;


@XmlType(name="CabinEnum")
@XmlEnum(String.class)
public enum CabinEnum {

@XmlEnumValue("eco") ECO(String.valueOf("eco")), @XmlEnumValue("ecoPremium") ECOPREMIUM(String.valueOf("ecoPremium")), @XmlEnumValue("business") BUSINESS(String.valueOf("business")), @XmlEnumValue("first") FIRST(String.valueOf("first"));


    private String value;

    CabinEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CabinEnum fromValue(String v) {
        for (CabinEnum b : CabinEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Cabin for the given availibity and price.")
 /**
   * Cabin for the given availibity and price.
  **/
  private CabinEnum cabin = null;

  @ApiModelProperty(value = "Booking class associated to the cabin")
 /**
   * Booking class associated to the cabin
  **/
  private String bookingClass = null;

  @ApiModelProperty(value = "Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken. At shopping time, the only status that can be returned is HL=Wailist ")
 /**
   * Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken. At shopping time, the only status that can be returned is HL=Wailist 
  **/
  private String statusCode = null;

  @ApiModelProperty(value = "Number of remaining seats for this flight. Quota is returned only at shopping time")
 /**
   * Number of remaining seats for this flight. Quota is returned only at shopping time
  **/
  private Integer quota = null;
 /**
   * Identifier of the flight referenced in the airBoundGroup.
   * @return flightId
  **/
  @JsonProperty("flightId")
  public String getFlightId() {
    return flightId;
  }

  public void setFlightId(String flightId) {
    this.flightId = flightId;
  }

  public AvailabilityInfoItem flightId(String flightId) {
    this.flightId = flightId;
    return this;
  }

 /**
   * Cabin for the given availibity and price.
   * @return cabin
  **/
  @JsonProperty("cabin")
  public String getCabin() {
    if (cabin == null) {
      return null;
    }
    return cabin.value();
  }

  public void setCabin(CabinEnum cabin) {
    this.cabin = cabin;
  }

  public AvailabilityInfoItem cabin(CabinEnum cabin) {
    this.cabin = cabin;
    return this;
  }

 /**
   * Booking class associated to the cabin
   * @return bookingClass
  **/
  @JsonProperty("bookingClass")
  public String getBookingClass() {
    return bookingClass;
  }

  public void setBookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
  }

  public AvailabilityInfoItem bookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
    return this;
  }

 /**
   * Operational status. HK &#x3D; confirmed, HL &#x3D; waitlist, TK &#x3D; schedule change confirmed, schedule change waitlist, UN &#x3D; unable to confirm not operating, UC &#x3D; unable to confirm, HX &#x3D; have cancelled, NO &#x3D; no action taken. At shopping time, the only status that can be returned is HL&#x3D;Wailist 
   * @return statusCode
  **/
  @JsonProperty("statusCode")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public AvailabilityInfoItem statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

 /**
   * Number of remaining seats for this flight. Quota is returned only at shopping time
   * minimum: 0
   * maximum: 9
   * @return quota
  **/
  @JsonProperty("quota")
  public Integer getQuota() {
    return quota;
  }

  public void setQuota(Integer quota) {
    this.quota = quota;
  }

  public AvailabilityInfoItem quota(Integer quota) {
    this.quota = quota;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityInfoItem {\n");
    
    sb.append("    flightId: ").append(toIndentedString(flightId)).append("\n");
    sb.append("    cabin: ").append(toIndentedString(cabin)).append("\n");
    sb.append("    bookingClass: ").append(toIndentedString(bookingClass)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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

