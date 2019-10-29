package com.koreanair.external.dx.vo;

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
  * Change eligibility for a flight bound.
 **/
@ApiModel(description="Change eligibility for a flight bound.")
public class FlightChangeEligibility  {
  
  @ApiModelProperty(required = true, value = "These are the identifiers of the flights that compose the order's air bound. Each bound has it's own flight change eligibility. This array will contain only one element in case of bound with single flight.")
 /**
   * These are the identifiers of the flights that compose the order's air bound. Each bound has it's own flight change eligibility. This array will contain only one element in case of bound with single flight.
  **/
  private List<String> flightIds = new ArrayList<>();

  @ApiModelProperty(required = true, value = "If true, this bound can be changed.")
 /**
   * If true, this bound can be changed.
  **/
  private Boolean isEligible = null;


@XmlType(name="NonEligibilityReasonEnum")
@XmlEnum(String.class)
public enum NonEligibilityReasonEnum {

@XmlEnumValue("flightGeneralStatus") FLIGHTGENERALSTATUS(String.valueOf("flightGeneralStatus")), @XmlEnumValue("ticketProblem") TICKETPROBLEM(String.valueOf("ticketProblem")), @XmlEnumValue("ticketTypeNotAllowed") TICKETTYPENOTALLOWED(String.valueOf("ticketTypeNotAllowed")), @XmlEnumValue("offerConditionRule") OFFERCONDITIONRULE(String.valueOf("offerConditionRule")), @XmlEnumValue("operationalStatusNotSupported") OPERATIONALSTATUSNOTSUPPORTED(String.valueOf("operationalStatusNotSupported")), @XmlEnumValue("ineligibleBookingStatus") INELIGIBLEBOOKINGSTATUS(String.valueOf("ineligibleBookingStatus")), @XmlEnumValue("flightIsDisrupted") FLIGHTISDISRUPTED(String.valueOf("flightIsDisrupted")), @XmlEnumValue("flightChangeNotActivated") FLIGHTCHANGENOTACTIVATED(String.valueOf("flightChangeNotActivated")), @XmlEnumValue("incompatibleCheckinStatus") INCOMPATIBLECHECKINSTATUS(String.valueOf("incompatibleCheckinStatus")), @XmlEnumValue("groupsNotSupported") GROUPSNOTSUPPORTED(String.valueOf("groupsNotSupported")), @XmlEnumValue("promotionNotSupported") PROMOTIONNOTSUPPORTED(String.valueOf("promotionNotSupported")), @XmlEnumValue("upgradedPNRNotAllowed") UPGRADEDPNRNOTALLOWED(String.valueOf("upgradedPNRNotAllowed")), @XmlEnumValue("unaccompaniedMinorNotSupported") UNACCOMPANIEDMINORNOTSUPPORTED(String.valueOf("unaccompaniedMinorNotSupported")), @XmlEnumValue("tooManyPassengerTypes") TOOMANYPASSENGERTYPES(String.valueOf("tooManyPassengerTypes")), @XmlEnumValue("unissuedServicePresent") UNISSUEDSERVICEPRESENT(String.valueOf("unissuedServicePresent")), @XmlEnumValue("complexItiniraryNotAllowed") COMPLEXITINIRARYNOTALLOWED(String.valueOf("complexItiniraryNotAllowed")), @XmlEnumValue("fareDiscountNotAllowed") FAREDISCOUNTNOTALLOWED(String.valueOf("fareDiscountNotAllowed")), @XmlEnumValue("extraSeatNotAllowed") EXTRASEATNOTALLOWED(String.valueOf("extraSeatNotAllowed")), @XmlEnumValue("discrepancyInOrder") DISCREPANCYINORDER(String.valueOf("discrepancyInOrder")), @XmlEnumValue("milesAndCashNotAllowed") MILESANDCASHNOTALLOWED(String.valueOf("milesAndCashNotAllowed")), @XmlEnumValue("dynamicWaiverPresent") DYNAMICWAIVERPRESENT(String.valueOf("dynamicWaiverPresent")), @XmlEnumValue("reasonNotSupportedInThisVersion") REASONNOTSUPPORTEDINTHISVERSION(String.valueOf("reasonNotSupportedInThisVersion"));


    private String value;

    NonEligibilityReasonEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NonEligibilityReasonEnum fromValue(String v) {
        for (NonEligibilityReasonEnum b : NonEligibilityReasonEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "When the bound cannot be change, the reason of the non-elibility is reported here.")
 /**
   * When the bound cannot be change, the reason of the non-elibility is reported here.
  **/
  private NonEligibilityReasonEnum nonEligibilityReason = null;

  @ApiModelProperty(value = "True if a penalty will be applied when the change occurs. Please refer to the fare conditions for details about this penalty: 'GET /air-offer-conditions'")
 /**
   * True if a penalty will be applied when the change occurs. Please refer to the fare conditions for details about this penalty: 'GET /air-offer-conditions'
  **/
  private Boolean isPenaltyApplied = null;

  @ApiModelProperty(value = "If true, origin and/or destination can be modified when changing flights in this order.")
 /**
   * If true, origin and/or destination can be modified when changing flights in this order.
  **/
  private Boolean isRouteChangeAllowed = null;

  @ApiModelProperty(value = "If the airline encourages a flight change and waives the associated penalty, the detailed conditions are found in the waiver. In that case, the associated codes are returned here and details can be found in the associated dictionary.")
 /**
   * If the airline encourages a flight change and waives the associated penalty, the detailed conditions are found in the waiver. In that case, the associated codes are returned here and details can be found in the associated dictionary.
  **/
  private List<String> waiverCodes = null;
 /**
   * These are the identifiers of the flights that compose the order&#39;s air bound. Each bound has it&#39;s own flight change eligibility. This array will contain only one element in case of bound with single flight.
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public FlightChangeEligibility flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public FlightChangeEligibility addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }

 /**
   * If true, this bound can be changed.
   * @return isEligible
  **/
  @JsonProperty("isEligible")
  public Boolean isIsEligible() {
    return isEligible;
  }

  public void setIsEligible(Boolean isEligible) {
    this.isEligible = isEligible;
  }

  public FlightChangeEligibility isEligible(Boolean isEligible) {
    this.isEligible = isEligible;
    return this;
  }

 /**
   * When the bound cannot be change, the reason of the non-elibility is reported here.
   * @return nonEligibilityReason
  **/
  @JsonProperty("nonEligibilityReason")
  public String getNonEligibilityReason() {
    if (nonEligibilityReason == null) {
      return null;
    }
    return nonEligibilityReason.value();
  }

  public void setNonEligibilityReason(NonEligibilityReasonEnum nonEligibilityReason) {
    this.nonEligibilityReason = nonEligibilityReason;
  }

  public FlightChangeEligibility nonEligibilityReason(NonEligibilityReasonEnum nonEligibilityReason) {
    this.nonEligibilityReason = nonEligibilityReason;
    return this;
  }

 /**
   * True if a penalty will be applied when the change occurs. Please refer to the fare conditions for details about this penalty: &#39;GET /air-offer-conditions&#39;
   * @return isPenaltyApplied
  **/
  @JsonProperty("isPenaltyApplied")
  public Boolean isIsPenaltyApplied() {
    return isPenaltyApplied;
  }

  public void setIsPenaltyApplied(Boolean isPenaltyApplied) {
    this.isPenaltyApplied = isPenaltyApplied;
  }

  public FlightChangeEligibility isPenaltyApplied(Boolean isPenaltyApplied) {
    this.isPenaltyApplied = isPenaltyApplied;
    return this;
  }

 /**
   * If true, origin and/or destination can be modified when changing flights in this order.
   * @return isRouteChangeAllowed
  **/
  @JsonProperty("isRouteChangeAllowed")
  public Boolean isIsRouteChangeAllowed() {
    return isRouteChangeAllowed;
  }

  public void setIsRouteChangeAllowed(Boolean isRouteChangeAllowed) {
    this.isRouteChangeAllowed = isRouteChangeAllowed;
  }

  public FlightChangeEligibility isRouteChangeAllowed(Boolean isRouteChangeAllowed) {
    this.isRouteChangeAllowed = isRouteChangeAllowed;
    return this;
  }

 /**
   * If the airline encourages a flight change and waives the associated penalty, the detailed conditions are found in the waiver. In that case, the associated codes are returned here and details can be found in the associated dictionary.
   * @return waiverCodes
  **/
  @JsonProperty("waiverCodes")
  public List<String> getWaiverCodes() {
    return waiverCodes;
  }

  public void setWaiverCodes(List<String> waiverCodes) {
    this.waiverCodes = waiverCodes;
  }

  public FlightChangeEligibility waiverCodes(List<String> waiverCodes) {
    this.waiverCodes = waiverCodes;
    return this;
  }

  public FlightChangeEligibility addWaiverCodesItem(String waiverCodesItem) {
    this.waiverCodes.add(waiverCodesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightChangeEligibility {\n");
    
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
    sb.append("    isEligible: ").append(toIndentedString(isEligible)).append("\n");
    sb.append("    nonEligibilityReason: ").append(toIndentedString(nonEligibilityReason)).append("\n");
    sb.append("    isPenaltyApplied: ").append(toIndentedString(isPenaltyApplied)).append("\n");
    sb.append("    isRouteChangeAllowed: ").append(toIndentedString(isRouteChangeAllowed)).append("\n");
    sb.append("    waiverCodes: ").append(toIndentedString(waiverCodes)).append("\n");
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

