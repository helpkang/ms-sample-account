package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BoardingPass;
import com.koreanair.external.dx.vo.BoardingPassEligibility;
import com.koreanair.external.dx.vo.Eligibility;
import com.koreanair.external.dx.vo.FrequentFlyerCard;
import com.koreanair.external.dx.vo.SeatmapSeatProperties;
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
  * Journey element (traveler on a flight) details.
 **/
@ApiModel(description="Journey element (traveler on a flight) details.")
public class JourneyElement  {
  
  @ApiModelProperty(required = true, value = "Identifier of the journey element (traveler on a flight).")
 /**
   * Identifier of the journey element (traveler on a flight).
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "Traveler Id")
 /**
   * Traveler Id
  **/
  private String travelerId = null;

  @ApiModelProperty(required = true, value = "Flight id, as defined in flights dictionary.")
 /**
   * Flight id, as defined in flights dictionary.
  **/
  private String flightId = null;

  @ApiModelProperty(value = "Cabin of the passenger, in single letter format e.g. \"Y\". If a seat is assigned, identical to the cabin defined on the seat")
 /**
   * Cabin of the passenger, in single letter format e.g. \"Y\". If a seat is assigned, identical to the cabin defined on the seat
  **/
  private String cabin = null;

  @ApiModelProperty(value = "")
  private SeatmapSeatProperties seat = null;

  @ApiModelProperty(required = true, value = "")
  private Eligibility acceptanceEligibility = null;


@XmlType(name="CheckInStatusEnum")
@XmlEnum(String.class)
public enum CheckInStatusEnum {

@XmlEnumValue("accepted") ACCEPTED(String.valueOf("accepted")), @XmlEnumValue("standBy") STANDBY(String.valueOf("standBy")), @XmlEnumValue("notAccepted") NOTACCEPTED(String.valueOf("notAccepted")), @XmlEnumValue("rejected") REJECTED(String.valueOf("rejected"));


    private String value;

    CheckInStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CheckInStatusEnum fromValue(String v) {
        for (CheckInStatusEnum b : CheckInStatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Check-in status of the traveler on the flight")
 /**
   * Check-in status of the traveler on the flight
  **/
  private CheckInStatusEnum checkInStatus = null;

  @ApiModelProperty(required = true, value = "")
  private BoardingPassEligibility boardingPassEligibility = null;

  @ApiModelProperty(value = "")
  private BoardingPass boardingPass = null;


@XmlType(name="BoardingPassPrintStatusEnum")
@XmlEnum(String.class)
public enum BoardingPassPrintStatusEnum {

@XmlEnumValue("notPrinted") NOTPRINTED(String.valueOf("notPrinted")), @XmlEnumValue("printed") PRINTED(String.valueOf("printed")), @XmlEnumValue("needPrinting") NEEDPRINTING(String.valueOf("needPrinting"));


    private String value;

    BoardingPassPrintStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BoardingPassPrintStatusEnum fromValue(String v) {
        for (BoardingPassPrintStatusEnum b : BoardingPassPrintStatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Boarding Pass printing status. A needPrinting status means that the boarding pass was printed but need to be printed again because some information changed (seat, class...). ")
 /**
   * Boarding Pass printing status. A needPrinting status means that the boarding pass was printed but need to be printed again because some information changed (seat, class...). 
  **/
  private BoardingPassPrintStatusEnum boardingPassPrintStatus = null;

  @ApiModelProperty(value = "")
  private FrequentFlyerCard frequentFlyerCard = null;


@XmlType(name="BoardingStatusEnum")
@XmlEnum(String.class)
public enum BoardingStatusEnum {

@XmlEnumValue("notBoarded") NOTBOARDED(String.valueOf("notBoarded")), @XmlEnumValue("boarded") BOARDED(String.valueOf("boarded")), @XmlEnumValue("unknown") UNKNOWN(String.valueOf("unknown"));


    private String value;

    BoardingStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BoardingStatusEnum fromValue(String v) {
        for (BoardingStatusEnum b : BoardingStatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Indicate if the traveler has boarded his flight. If the flight is outside the Departure Control System window (long before or after departure date), boarding status might be unknown. ")
 /**
   * Indicate if the traveler has boarded his flight. If the flight is outside the Departure Control System window (long before or after departure date), boarding status might be unknown. 
  **/
  private BoardingStatusEnum boardingStatus = null;

  @ApiModelProperty(value = "Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken.")
 /**
   * Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken.
  **/
  private String bookingStatusCode = null;


@XmlType(name="ExitSeatSuitabilityEnum")
@XmlEnum(String.class)
public enum ExitSeatSuitabilityEnum {

@XmlEnumValue("suitable") SUITABLE(String.valueOf("suitable")), @XmlEnumValue("notSuitable") NOTSUITABLE(String.valueOf("notSuitable")), @XmlEnumValue("unableToDetermine") UNABLETODETERMINE(String.valueOf("unableToDetermine"));


    private String value;

    ExitSeatSuitabilityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ExitSeatSuitabilityEnum fromValue(String v) {
        for (ExitSeatSuitabilityEnum b : ExitSeatSuitabilityEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Exit seat suitability. UnableToDetermine suitability will trigger a warning at next touchpoint with an agent in order for him to check the suitability. If suitability is set to notSuitable, the traveler should not be assigned an exit seat. ")
 /**
   * Exit seat suitability. UnableToDetermine suitability will trigger a warning at next touchpoint with an agent in order for him to check the suitability. If suitability is set to notSuitable, the traveler should not be assigned an exit seat. 
  **/
  private ExitSeatSuitabilityEnum exitSeatSuitability = null;

  @ApiModelProperty(value = "The journey elements linked to this journey. In case of standby early,  the standby journey element will contain this link to the ID of the  confirmed journey element, and vice versa. The type of each journey  element can be read from the booking status")
 /**
   * The journey elements linked to this journey. In case of standby early,  the standby journey element will contain this link to the ID of the  confirmed journey element, and vice versa. The type of each journey  element can be read from the booking status
  **/
  private List<String> linkedJourneyElementIds = null;
 /**
   * Identifier of the journey element (traveler on a flight).
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public JourneyElement id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Traveler Id
   * @return travelerId
  **/
  @JsonProperty("travelerId")
  public String getTravelerId() {
    return travelerId;
  }

  public void setTravelerId(String travelerId) {
    this.travelerId = travelerId;
  }

  public JourneyElement travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }

 /**
   * Flight id, as defined in flights dictionary.
   * @return flightId
  **/
  @JsonProperty("flightId")
  public String getFlightId() {
    return flightId;
  }

  public void setFlightId(String flightId) {
    this.flightId = flightId;
  }

  public JourneyElement flightId(String flightId) {
    this.flightId = flightId;
    return this;
  }

 /**
   * Cabin of the passenger, in single letter format e.g. \&quot;Y\&quot;. If a seat is assigned, identical to the cabin defined on the seat
   * @return cabin
  **/
  @JsonProperty("cabin")
  public String getCabin() {
    return cabin;
  }

  public void setCabin(String cabin) {
    this.cabin = cabin;
  }

  public JourneyElement cabin(String cabin) {
    this.cabin = cabin;
    return this;
  }

 /**
   * Get seat
   * @return seat
  **/
  @JsonProperty("seat")
  public SeatmapSeatProperties getSeat() {
    return seat;
  }

  public void setSeat(SeatmapSeatProperties seat) {
    this.seat = seat;
  }

  public JourneyElement seat(SeatmapSeatProperties seat) {
    this.seat = seat;
    return this;
  }

 /**
   * Get acceptanceEligibility
   * @return acceptanceEligibility
  **/
  @JsonProperty("acceptanceEligibility")
  public Eligibility getAcceptanceEligibility() {
    return acceptanceEligibility;
  }

  public void setAcceptanceEligibility(Eligibility acceptanceEligibility) {
    this.acceptanceEligibility = acceptanceEligibility;
  }

  public JourneyElement acceptanceEligibility(Eligibility acceptanceEligibility) {
    this.acceptanceEligibility = acceptanceEligibility;
    return this;
  }

 /**
   * Check-in status of the traveler on the flight
   * @return checkInStatus
  **/
  @JsonProperty("checkInStatus")
  public String getCheckInStatus() {
    if (checkInStatus == null) {
      return null;
    }
    return checkInStatus.value();
  }

  public void setCheckInStatus(CheckInStatusEnum checkInStatus) {
    this.checkInStatus = checkInStatus;
  }

  public JourneyElement checkInStatus(CheckInStatusEnum checkInStatus) {
    this.checkInStatus = checkInStatus;
    return this;
  }

 /**
   * Get boardingPassEligibility
   * @return boardingPassEligibility
  **/
  @JsonProperty("boardingPassEligibility")
  public BoardingPassEligibility getBoardingPassEligibility() {
    return boardingPassEligibility;
  }

  public void setBoardingPassEligibility(BoardingPassEligibility boardingPassEligibility) {
    this.boardingPassEligibility = boardingPassEligibility;
  }

  public JourneyElement boardingPassEligibility(BoardingPassEligibility boardingPassEligibility) {
    this.boardingPassEligibility = boardingPassEligibility;
    return this;
  }

 /**
   * Get boardingPass
   * @return boardingPass
  **/
  @JsonProperty("boardingPass")
  public BoardingPass getBoardingPass() {
    return boardingPass;
  }

  public void setBoardingPass(BoardingPass boardingPass) {
    this.boardingPass = boardingPass;
  }

  public JourneyElement boardingPass(BoardingPass boardingPass) {
    this.boardingPass = boardingPass;
    return this;
  }

 /**
   * Boarding Pass printing status. A needPrinting status means that the boarding pass was printed but need to be printed again because some information changed (seat, class...). 
   * @return boardingPassPrintStatus
  **/
  @JsonProperty("boardingPassPrintStatus")
  public String getBoardingPassPrintStatus() {
    if (boardingPassPrintStatus == null) {
      return null;
    }
    return boardingPassPrintStatus.value();
  }

  public void setBoardingPassPrintStatus(BoardingPassPrintStatusEnum boardingPassPrintStatus) {
    this.boardingPassPrintStatus = boardingPassPrintStatus;
  }

  public JourneyElement boardingPassPrintStatus(BoardingPassPrintStatusEnum boardingPassPrintStatus) {
    this.boardingPassPrintStatus = boardingPassPrintStatus;
    return this;
  }

 /**
   * Get frequentFlyerCard
   * @return frequentFlyerCard
  **/
  @JsonProperty("frequentFlyerCard")
  public FrequentFlyerCard getFrequentFlyerCard() {
    return frequentFlyerCard;
  }

  public void setFrequentFlyerCard(FrequentFlyerCard frequentFlyerCard) {
    this.frequentFlyerCard = frequentFlyerCard;
  }

  public JourneyElement frequentFlyerCard(FrequentFlyerCard frequentFlyerCard) {
    this.frequentFlyerCard = frequentFlyerCard;
    return this;
  }

 /**
   * Indicate if the traveler has boarded his flight. If the flight is outside the Departure Control System window (long before or after departure date), boarding status might be unknown. 
   * @return boardingStatus
  **/
  @JsonProperty("boardingStatus")
  public String getBoardingStatus() {
    if (boardingStatus == null) {
      return null;
    }
    return boardingStatus.value();
  }

  public void setBoardingStatus(BoardingStatusEnum boardingStatus) {
    this.boardingStatus = boardingStatus;
  }

  public JourneyElement boardingStatus(BoardingStatusEnum boardingStatus) {
    this.boardingStatus = boardingStatus;
    return this;
  }

 /**
   * Operational status. HK &#x3D; confirmed, HL &#x3D; waitlist, TK &#x3D; schedule change confirmed, schedule change waitlist, UN &#x3D; unable to confirm not operating, UC &#x3D; unable to confirm, HX &#x3D; have cancelled, NO &#x3D; no action taken.
   * @return bookingStatusCode
  **/
  @JsonProperty("bookingStatusCode")
  public String getBookingStatusCode() {
    return bookingStatusCode;
  }

  public void setBookingStatusCode(String bookingStatusCode) {
    this.bookingStatusCode = bookingStatusCode;
  }

  public JourneyElement bookingStatusCode(String bookingStatusCode) {
    this.bookingStatusCode = bookingStatusCode;
    return this;
  }

 /**
   * Exit seat suitability. UnableToDetermine suitability will trigger a warning at next touchpoint with an agent in order for him to check the suitability. If suitability is set to notSuitable, the traveler should not be assigned an exit seat. 
   * @return exitSeatSuitability
  **/
  @JsonProperty("exitSeatSuitability")
  public String getExitSeatSuitability() {
    if (exitSeatSuitability == null) {
      return null;
    }
    return exitSeatSuitability.value();
  }

  public void setExitSeatSuitability(ExitSeatSuitabilityEnum exitSeatSuitability) {
    this.exitSeatSuitability = exitSeatSuitability;
  }

  public JourneyElement exitSeatSuitability(ExitSeatSuitabilityEnum exitSeatSuitability) {
    this.exitSeatSuitability = exitSeatSuitability;
    return this;
  }

 /**
   * The journey elements linked to this journey. In case of standby early,  the standby journey element will contain this link to the ID of the  confirmed journey element, and vice versa. The type of each journey  element can be read from the booking status
   * @return linkedJourneyElementIds
  **/
  @JsonProperty("linkedJourneyElementIds")
  public List<String> getLinkedJourneyElementIds() {
    return linkedJourneyElementIds;
  }

  public void setLinkedJourneyElementIds(List<String> linkedJourneyElementIds) {
    this.linkedJourneyElementIds = linkedJourneyElementIds;
  }

  public JourneyElement linkedJourneyElementIds(List<String> linkedJourneyElementIds) {
    this.linkedJourneyElementIds = linkedJourneyElementIds;
    return this;
  }

  public JourneyElement addLinkedJourneyElementIdsItem(String linkedJourneyElementIdsItem) {
    this.linkedJourneyElementIds.add(linkedJourneyElementIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyElement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
    sb.append("    flightId: ").append(toIndentedString(flightId)).append("\n");
    sb.append("    cabin: ").append(toIndentedString(cabin)).append("\n");
    sb.append("    seat: ").append(toIndentedString(seat)).append("\n");
    sb.append("    acceptanceEligibility: ").append(toIndentedString(acceptanceEligibility)).append("\n");
    sb.append("    checkInStatus: ").append(toIndentedString(checkInStatus)).append("\n");
    sb.append("    boardingPassEligibility: ").append(toIndentedString(boardingPassEligibility)).append("\n");
    sb.append("    boardingPass: ").append(toIndentedString(boardingPass)).append("\n");
    sb.append("    boardingPassPrintStatus: ").append(toIndentedString(boardingPassPrintStatus)).append("\n");
    sb.append("    frequentFlyerCard: ").append(toIndentedString(frequentFlyerCard)).append("\n");
    sb.append("    boardingStatus: ").append(toIndentedString(boardingStatus)).append("\n");
    sb.append("    bookingStatusCode: ").append(toIndentedString(bookingStatusCode)).append("\n");
    sb.append("    exitSeatSuitability: ").append(toIndentedString(exitSeatSuitability)).append("\n");
    sb.append("    linkedJourneyElementIds: ").append(toIndentedString(linkedJourneyElementIds)).append("\n");
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

