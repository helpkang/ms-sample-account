package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.EligibilityCommon;
import com.koreanair.external.dx.vo.TimeWindow;
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
  * Define the eligibility for acceptance (check-in)
 **/
@ApiModel(description="Define the eligibility for acceptance (check-in)")
public class Eligibility  {
  

@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("eligible") ELIGIBLE(String.valueOf("eligible")), @XmlEnumValue("ineligible") INELIGIBLE(String.valueOf("ineligible")), @XmlEnumValue("partial") PARTIAL(String.valueOf("partial"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Eligibility status")
 /**
   * Eligibility status
  **/
  private StatusEnum status = null;

  @ApiModelProperty(value = "Provide the timing for the eligibility if there is a time window to be respected. Request must be within the window to be eligible.")
 /**
   * Provide the timing for the eligibility if there is a time window to be respected. Request must be within the window to be eligible.
  **/
  private TimeWindow eligibilityWindow = null;


@XmlType(name="ReasonsEnum")
@XmlEnum(String.class)
public enum ReasonsEnum {

@XmlEnumValue("firstFlightOtherAirline") FIRSTFLIGHTOTHERAIRLINE(String.valueOf("firstFlightOtherAirline")), @XmlEnumValue("firstFlightOnOtherDepartureControlSystem") FIRSTFLIGHTONOTHERDEPARTURECONTROLSYSTEM(String.valueOf("firstFlightOnOtherDepartureControlSystem")), @XmlEnumValue("flightAcceptanceEligibilityWindow") FLIGHTACCEPTANCEELIGIBILITYWINDOW(String.valueOf("flightAcceptanceEligibilityWindow")), @XmlEnumValue("flightAcceptanceDefaultEligibilityWindow") FLIGHTACCEPTANCEDEFAULTELIGIBILITYWINDOW(String.valueOf("flightAcceptanceDefaultEligibilityWindow")), @XmlEnumValue("flightEligibilityRule") FLIGHTELIGIBILITYRULE(String.valueOf("flightEligibilityRule")), @XmlEnumValue("flightEligibilityDefaultRule") FLIGHTELIGIBILITYDEFAULTRULE(String.valueOf("flightEligibilityDefaultRule")), @XmlEnumValue("flightGeneralStatus") FLIGHTGENERALSTATUS(String.valueOf("flightGeneralStatus")), @XmlEnumValue("flightAcceptanceStatus") FLIGHTACCEPTANCESTATUS(String.valueOf("flightAcceptanceStatus")), @XmlEnumValue("departureAirportInhibited") DEPARTUREAIRPORTINHIBITED(String.valueOf("departureAirportInhibited")), @XmlEnumValue("arrivalAirportInhibited") ARRIVALAIRPORTINHIBITED(String.valueOf("arrivalAirportInhibited")), @XmlEnumValue("firstFlightIsInhibited") FIRSTFLIGHTISINHIBITED(String.valueOf("firstFlightIsInhibited")), @XmlEnumValue("passiveSegment") PASSIVESEGMENT(String.valueOf("passiveSegment")), @XmlEnumValue("previousFlightIsInhibited") PREVIOUSFLIGHTISINHIBITED(String.valueOf("previousFlightIsInhibited")), @XmlEnumValue("infantStatusNeedToBeChecked") INFANTSTATUSNEEDTOBECHECKED(String.valueOf("infantStatusNeedToBeChecked")), @XmlEnumValue("infantAgeToBeChecked") INFANTAGETOBECHECKED(String.valueOf("infantAgeToBeChecked")), @XmlEnumValue("childAgeToBeChecked") CHILDAGETOBECHECKED(String.valueOf("childAgeToBeChecked")), @XmlEnumValue("ticketProblem") TICKETPROBLEM(String.valueOf("ticketProblem")), @XmlEnumValue("ticketTypeNotAllowed") TICKETTYPENOTALLOWED(String.valueOf("ticketTypeNotAllowed")), @XmlEnumValue("highPriorityComment") HIGHPRIORITYCOMMENT(String.valueOf("highPriorityComment")), @XmlEnumValue("customerEligibilityRule") CUSTOMERELIGIBILITYRULE(String.valueOf("customerEligibilityRule")), @XmlEnumValue("operationalStatusNotSupported") OPERATIONALSTATUSNOTSUPPORTED(String.valueOf("operationalStatusNotSupported")), @XmlEnumValue("serviceRequestNotSupported") SERVICEREQUESTNOTSUPPORTED(String.valueOf("serviceRequestNotSupported")), @XmlEnumValue("unpaidService") UNPAIDSERVICE(String.valueOf("unpaidService")), @XmlEnumValue("regulatoryDetailsInhibition") REGULATORYDETAILSINHIBITION(String.valueOf("regulatoryDetailsInhibition")), @XmlEnumValue("regulatoryDetailsLimitations") REGULATORYDETAILSLIMITATIONS(String.valueOf("regulatoryDetailsLimitations")), @XmlEnumValue("regulatoryDetailsNameNotMatching") REGULATORYDETAILSNAMENOTMATCHING(String.valueOf("regulatoryDetailsNameNotMatching")), @XmlEnumValue("regulatoryDetailsMultipleNationality") REGULATORYDETAILSMULTIPLENATIONALITY(String.valueOf("regulatoryDetailsMultipleNationality")), @XmlEnumValue("regulatoryDetailsStatusNotAuthorized") REGULATORYDETAILSSTATUSNOTAUTHORIZED(String.valueOf("regulatoryDetailsStatusNotAuthorized")), @XmlEnumValue("regulatoryDetailsPassportExpired") REGULATORYDETAILSPASSPORTEXPIRED(String.valueOf("regulatoryDetailsPassportExpired")), @XmlEnumValue("reprintingIsInhibited") REPRINTINGISINHIBITED(String.valueOf("reprintingIsInhibited")), @XmlEnumValue("alreadyBoarded") ALREADYBOARDED(String.valueOf("alreadyBoarded")), @XmlEnumValue("visaNeedAgentVerification") VISANEEDAGENTVERIFICATION(String.valueOf("visaNeedAgentVerification")), @XmlEnumValue("ineligibleBookingstatus") INELIGIBLEBOOKINGSTATUS(String.valueOf("ineligibleBookingstatus")), @XmlEnumValue("ineligibleNonRevenuePassenger") INELIGIBLENONREVENUEPASSENGER(String.valueOf("ineligibleNonRevenuePassenger")), @XmlEnumValue("flightIsDisrupted") FLIGHTISDISRUPTED(String.valueOf("flightIsDisrupted")), @XmlEnumValue("passengerAlreadyAccepted") PASSENGERALREADYACCEPTED(String.valueOf("passengerAlreadyAccepted")), @XmlEnumValue("reasonNotSupportedInThisVersion") REASONNOTSUPPORTEDINTHISVERSION(String.valueOf("reasonNotSupportedInThisVersion"));


    private String value;

    ReasonsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReasonsEnum fromValue(String v) {
        for (ReasonsEnum b : ReasonsEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Reasons for the eligibility status provided if not eligible.")
 /**
   * Reasons for the eligibility status provided if not eligible.
  **/
  private List<ReasonsEnum> reasons = null;
 /**
   * Eligibility status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Eligibility status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Provide the timing for the eligibility if there is a time window to be respected. Request must be within the window to be eligible.
   * @return eligibilityWindow
  **/
  @JsonProperty("eligibilityWindow")
  public TimeWindow getEligibilityWindow() {
    return eligibilityWindow;
  }

  public void setEligibilityWindow(TimeWindow eligibilityWindow) {
    this.eligibilityWindow = eligibilityWindow;
  }

  public Eligibility eligibilityWindow(TimeWindow eligibilityWindow) {
    this.eligibilityWindow = eligibilityWindow;
    return this;
  }

 /**
   * Reasons for the eligibility status provided if not eligible.
   * @return reasons
  **/
  @JsonProperty("reasons")
  public List<ReasonsEnum> getReasons() {
    return reasons;
  }

  public void setReasons(List<ReasonsEnum> reasons) {
    this.reasons = reasons;
  }

  public Eligibility reasons(List<ReasonsEnum> reasons) {
    this.reasons = reasons;
    return this;
  }

  public Eligibility addReasonsItem(ReasonsEnum reasonsItem) {
    this.reasons.add(reasonsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eligibility {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    eligibilityWindow: ").append(toIndentedString(eligibilityWindow)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
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

