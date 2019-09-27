package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;
import java.time.LocalDate;

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
  * Operation to be used for building the list of journeys available for check-in corresponding to a   confirmed booking. 
 **/
@ApiModel(description="Operation to be used for building the list of journeys available for check-in corresponding to a   confirmed booking. ")
public class JourneyRequest  {
  
  @ApiModelProperty(value = "Last name of one traveler part of the order")
 /**
   * Last name of one traveler part of the order
  **/
  private String lastName = null;

  @ApiModelProperty(value = "First name of one traveler part of the order")
 /**
   * First name of one traveler part of the order
  **/
  private String firstName = null;

  @ApiModelProperty(value = "Identifier of an order (Record Locator)")
 /**
   * Identifier of an order (Record Locator)
  **/
  private String orderId = null;

  @ApiModelProperty(value = "E-ticket number")
 /**
   * E-ticket number
  **/
  private String eTicketNumber = null;

  @ApiModelProperty(value = "Identifier of a frequent flyer card, whatever its usage [redeem miles, accrue miles...]")
 /**
   * Identifier of a frequent flyer card, whatever its usage [redeem miles, accrue miles...]
  **/
  private String frequentFlyerCardId = null;

  @ApiModelProperty(value = "Staff number. No pattern is defined here, as can vary by airline")
 /**
   * Staff number. No pattern is defined here, as can vary by airline
  **/
  private String staffNumber = null;

  @ApiModelProperty(value = "Departure flight date in ISO 8601 (http://www.w3.org/TR/NOTE-datetime) without timezone. Ex : 2026-07-21 ")
 /**
   * Departure flight date in ISO 8601 (http://www.w3.org/TR/NOTE-datetime) without timezone. Ex : 2026-07-21 
  **/
  private LocalDate departureDate = null;

  @ApiModelProperty(value = "Departure location code of flight (city or airport code)")
 /**
   * Departure location code of flight (city or airport code)
  **/
  private String originLocationCode = null;

  @ApiModelProperty(value = "Reservation flight number")
 /**
   * Reservation flight number
  **/
  private String flightNumber = null;

  @ApiModelProperty(value = "Reservation airline code")
 /**
   * Reservation airline code
  **/
  private String airlineCode = null;

  @ApiModelProperty(value = "Number present on the document")
 /**
   * Number present on the document
  **/
  private String documentNumber = null;


@XmlType(name="DocumentTypeEnum")
@XmlEnum(String.class)
public enum DocumentTypeEnum {

@XmlEnumValue("passport") PASSPORT(String.valueOf("passport")), @XmlEnumValue("identityCard") IDENTITYCARD(String.valueOf("identityCard")), @XmlEnumValue("drivingLicense") DRIVINGLICENSE(String.valueOf("drivingLicense"));


    private String value;

    DocumentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DocumentTypeEnum fromValue(String v) {
        for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Type of the document")
 /**
   * Type of the document
  **/
  private DocumentTypeEnum documentType = null;
 /**
   * Last name of one traveler part of the order
   * @return lastName
  **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public JourneyRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * First name of one traveler part of the order
   * @return firstName
  **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public JourneyRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * Identifier of an order (Record Locator)
   * @return orderId
  **/
  @JsonProperty("orderId")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public JourneyRequest orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * E-ticket number
   * @return eTicketNumber
  **/
  @JsonProperty("eTicketNumber")
  public String getETicketNumber() {
    return eTicketNumber;
  }

  public void setETicketNumber(String eTicketNumber) {
    this.eTicketNumber = eTicketNumber;
  }

  public JourneyRequest eTicketNumber(String eTicketNumber) {
    this.eTicketNumber = eTicketNumber;
    return this;
  }

 /**
   * Identifier of a frequent flyer card, whatever its usage [redeem miles, accrue miles...]
   * @return frequentFlyerCardId
  **/
  @JsonProperty("frequentFlyerCardId")
  public String getFrequentFlyerCardId() {
    return frequentFlyerCardId;
  }

  public void setFrequentFlyerCardId(String frequentFlyerCardId) {
    this.frequentFlyerCardId = frequentFlyerCardId;
  }

  public JourneyRequest frequentFlyerCardId(String frequentFlyerCardId) {
    this.frequentFlyerCardId = frequentFlyerCardId;
    return this;
  }

 /**
   * Staff number. No pattern is defined here, as can vary by airline
   * @return staffNumber
  **/
  @JsonProperty("staffNumber")
  public String getStaffNumber() {
    return staffNumber;
  }

  public void setStaffNumber(String staffNumber) {
    this.staffNumber = staffNumber;
  }

  public JourneyRequest staffNumber(String staffNumber) {
    this.staffNumber = staffNumber;
    return this;
  }

 /**
   * Departure flight date in ISO 8601 (http://www.w3.org/TR/NOTE-datetime) without timezone. Ex : 2026-07-21 
   * @return departureDate
  **/
  @JsonProperty("departureDate")
  public LocalDate getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
  }

  public JourneyRequest departureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
    return this;
  }

 /**
   * Departure location code of flight (city or airport code)
   * @return originLocationCode
  **/
  @JsonProperty("originLocationCode")
  public String getOriginLocationCode() {
    return originLocationCode;
  }

  public void setOriginLocationCode(String originLocationCode) {
    this.originLocationCode = originLocationCode;
  }

  public JourneyRequest originLocationCode(String originLocationCode) {
    this.originLocationCode = originLocationCode;
    return this;
  }

 /**
   * Reservation flight number
   * @return flightNumber
  **/
  @JsonProperty("flightNumber")
  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public JourneyRequest flightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
    return this;
  }

 /**
   * Reservation airline code
   * @return airlineCode
  **/
  @JsonProperty("airlineCode")
  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public JourneyRequest airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }

 /**
   * Number present on the document
   * @return documentNumber
  **/
  @JsonProperty("documentNumber")
  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public JourneyRequest documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

 /**
   * Type of the document
   * @return documentType
  **/
  @JsonProperty("documentType")
  public String getDocumentType() {
    if (documentType == null) {
      return null;
    }
    return documentType.value();
  }

  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }

  public JourneyRequest documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyRequest {\n");
    
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    eTicketNumber: ").append(toIndentedString(eTicketNumber)).append("\n");
    sb.append("    frequentFlyerCardId: ").append(toIndentedString(frequentFlyerCardId)).append("\n");
    sb.append("    staffNumber: ").append(toIndentedString(staffNumber)).append("\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    originLocationCode: ").append(toIndentedString(originLocationCode)).append("\n");
    sb.append("    flightNumber: ").append(toIndentedString(flightNumber)).append("\n");
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
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

