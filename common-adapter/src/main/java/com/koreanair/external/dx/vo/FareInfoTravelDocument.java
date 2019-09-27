package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FlightTravelDocument;
import com.koreanair.external.dx.vo.FreeCheckedBaggageAllowanceItem;
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

public class FareInfoTravelDocument  {
  
  @ApiModelProperty(value = "")
  private String fareClass = null;


@XmlType(name="CouponStatusEnum")
@XmlEnum(String.class)
public enum CouponStatusEnum {

@XmlEnumValue("airportControl") AIRPORTCONTROL(String.valueOf("airportControl")), @XmlEnumValue("checkedIn") CHECKEDIN(String.valueOf("checkedIn")), @XmlEnumValue("exchangedOrReissued") EXCHANGEDORREISSUED(String.valueOf("exchangedOrReissued")), @XmlEnumValue("flownOrUsed") FLOWNORUSED(String.valueOf("flownOrUsed")), @XmlEnumValue("convertedToFIM") CONVERTEDTOFIM(String.valueOf("convertedToFIM")), @XmlEnumValue("irregularOperations") IRREGULAROPERATIONS(String.valueOf("irregularOperations")), @XmlEnumValue("liftedOrBoarded") LIFTEDORBOARDED(String.valueOf("liftedOrBoarded")), @XmlEnumValue("open") OPEN(String.valueOf("open")), @XmlEnumValue("printed") PRINTED(String.valueOf("printed")), @XmlEnumValue("refunded") REFUNDED(String.valueOf("refunded")), @XmlEnumValue("suspended") SUSPENDED(String.valueOf("suspended")), @XmlEnumValue("paperTicket") PAPERTICKET(String.valueOf("paperTicket")), @XmlEnumValue("unavailable") UNAVAILABLE(String.valueOf("unavailable")), @XmlEnumValue("void") VOID(String.valueOf("void")), @XmlEnumValue("refundTaxesOrFeesOrCharges") REFUNDTAXESORFEESORCHARGES(String.valueOf("refundTaxesOrFeesOrCharges")), @XmlEnumValue("printExchange") PRINTEXCHANGE(String.valueOf("printExchange")), @XmlEnumValue("closed") CLOSED(String.valueOf("closed")), @XmlEnumValue("groundTransportationVoucher") GROUNDTRANSPORTATIONVOUCHER(String.valueOf("groundTransportationVoucher"));


    private String value;

    CouponStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CouponStatusEnum fromValue(String v) {
        for (CouponStatusEnum b : CouponStatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "It represents the E-ticket record status code. This list below shows  the possible codes displayed in the e-ticket record: - Airport Control - Checked In - Exchanged/Reissued - Flown/Used - Converted to FIM: A FIM (Flight Interruption Manifest) is issued by the airline    when the airline has to involuntarily reroute a passenger due to flight cancellation    or major flight delay - Irregular Operations - Lifted/Boarded - Open: OPEN FOR USE - Printed - Refunded - Suspended - Paper Ticket - Unavailable: Indicates Interim status: airport control, checked in,    irregular operations, lifted/boarded, refund taxes/fees/charges only,    suspended,unavailable - Void - Refund Taxes/Fees/Charges only: Indicates the Validating Carrier has    determined the coupon is no longer available for use as ticketed, applicable    taxes/fees/charges may be refunded. - Print Exchange - Closed: Indicates the Validating Carrier has determined the coupon(s)    is not available for use. This is a final status, no follow-up action permitted - Ground Transportation Voucher  ")
 /**
   * It represents the E-ticket record status code. This list below shows  the possible codes displayed in the e-ticket record: - Airport Control - Checked In - Exchanged/Reissued - Flown/Used - Converted to FIM: A FIM (Flight Interruption Manifest) is issued by the airline    when the airline has to involuntarily reroute a passenger due to flight cancellation    or major flight delay - Irregular Operations - Lifted/Boarded - Open: OPEN FOR USE - Printed - Refunded - Suspended - Paper Ticket - Unavailable: Indicates Interim status: airport control, checked in,    irregular operations, lifted/boarded, refund taxes/fees/charges only,    suspended,unavailable - Void - Refund Taxes/Fees/Charges only: Indicates the Validating Carrier has    determined the coupon is no longer available for use as ticketed, applicable    taxes/fees/charges may be refunded. - Print Exchange - Closed: Indicates the Validating Carrier has determined the coupon(s)    is not available for use. This is a final status, no follow-up action permitted - Ground Transportation Voucher  
  **/
  private CouponStatusEnum couponStatus = null;

  @ApiModelProperty(value = "Code used by the airline to reflect the discount applied to the fares")
 /**
   * Code used by the airline to reflect the discount applied to the fares
  **/
  private String ticketDesignator = null;

  @ApiModelProperty(value = "Free checked baggage allowance corresponding to the flights in the Order")
 /**
   * Free checked baggage allowance corresponding to the flights in the Order
  **/
  private List<FreeCheckedBaggageAllowanceItem> freeCheckedBaggageAllowanceItems = null;

  @ApiModelProperty(value = "")
  private FlightTravelDocument flight = null;
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

  public FareInfoTravelDocument fareClass(String fareClass) {
    this.fareClass = fareClass;
    return this;
  }

 /**
   * It represents the E-ticket record status code. This list below shows  the possible codes displayed in the e-ticket record: - Airport Control - Checked In - Exchanged/Reissued - Flown/Used - Converted to FIM: A FIM (Flight Interruption Manifest) is issued by the airline    when the airline has to involuntarily reroute a passenger due to flight cancellation    or major flight delay - Irregular Operations - Lifted/Boarded - Open: OPEN FOR USE - Printed - Refunded - Suspended - Paper Ticket - Unavailable: Indicates Interim status: airport control, checked in,    irregular operations, lifted/boarded, refund taxes/fees/charges only,    suspended,unavailable - Void - Refund Taxes/Fees/Charges only: Indicates the Validating Carrier has    determined the coupon is no longer available for use as ticketed, applicable    taxes/fees/charges may be refunded. - Print Exchange - Closed: Indicates the Validating Carrier has determined the coupon(s)    is not available for use. This is a final status, no follow-up action permitted - Ground Transportation Voucher  
   * @return couponStatus
  **/
  @JsonProperty("couponStatus")
  public String getCouponStatus() {
    if (couponStatus == null) {
      return null;
    }
    return couponStatus.value();
  }

  public void setCouponStatus(CouponStatusEnum couponStatus) {
    this.couponStatus = couponStatus;
  }

  public FareInfoTravelDocument couponStatus(CouponStatusEnum couponStatus) {
    this.couponStatus = couponStatus;
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

  public FareInfoTravelDocument ticketDesignator(String ticketDesignator) {
    this.ticketDesignator = ticketDesignator;
    return this;
  }

 /**
   * Free checked baggage allowance corresponding to the flights in the Order
   * @return freeCheckedBaggageAllowanceItems
  **/
  @JsonProperty("freeCheckedBaggageAllowanceItems")
  public List<FreeCheckedBaggageAllowanceItem> getFreeCheckedBaggageAllowanceItems() {
    return freeCheckedBaggageAllowanceItems;
  }

  public void setFreeCheckedBaggageAllowanceItems(List<FreeCheckedBaggageAllowanceItem> freeCheckedBaggageAllowanceItems) {
    this.freeCheckedBaggageAllowanceItems = freeCheckedBaggageAllowanceItems;
  }

  public FareInfoTravelDocument freeCheckedBaggageAllowanceItems(List<FreeCheckedBaggageAllowanceItem> freeCheckedBaggageAllowanceItems) {
    this.freeCheckedBaggageAllowanceItems = freeCheckedBaggageAllowanceItems;
    return this;
  }

  public FareInfoTravelDocument addFreeCheckedBaggageAllowanceItemsItem(FreeCheckedBaggageAllowanceItem freeCheckedBaggageAllowanceItemsItem) {
    this.freeCheckedBaggageAllowanceItems.add(freeCheckedBaggageAllowanceItemsItem);
    return this;
  }

 /**
   * Get flight
   * @return flight
  **/
  @JsonProperty("flight")
  public FlightTravelDocument getFlight() {
    return flight;
  }

  public void setFlight(FlightTravelDocument flight) {
    this.flight = flight;
  }

  public FareInfoTravelDocument flight(FlightTravelDocument flight) {
    this.flight = flight;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareInfoTravelDocument {\n");
    
    sb.append("    fareClass: ").append(toIndentedString(fareClass)).append("\n");
    sb.append("    couponStatus: ").append(toIndentedString(couponStatus)).append("\n");
    sb.append("    ticketDesignator: ").append(toIndentedString(ticketDesignator)).append("\n");
    sb.append("    freeCheckedBaggageAllowanceItems: ").append(toIndentedString(freeCheckedBaggageAllowanceItems)).append("\n");
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
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

