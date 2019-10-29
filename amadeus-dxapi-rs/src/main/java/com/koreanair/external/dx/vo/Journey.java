package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Acceptance;
import com.koreanair.external.dx.vo.Baggage;
import com.koreanair.external.dx.vo.CheckInFlightIdObject;
import com.koreanair.external.dx.vo.Contact;
import com.koreanair.external.dx.vo.Eligibility;
import com.koreanair.external.dx.vo.JourneyElementCommon;
import com.koreanair.external.dx.vo.ServiceItem;
import com.koreanair.external.dx.vo.Traveler;
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
  * Collection of travelers on flights, grouped so as to form a logical journey for one or more passengers on one or more flights. E.g. NCE->LHR direct for pax A (single traveler on flight, standalone), or NCE->LHR->DFW for pax A and B (4 travelers on flights, outbound) + DFW->LHR->NCE A and B (4 travelers on flights, inbound).\" 
 **/
@ApiModel(description="Collection of travelers on flights, grouped so as to form a logical journey for one or more passengers on one or more flights. E.g. NCE->LHR direct for pax A (single traveler on flight, standalone), or NCE->LHR->DFW for pax A and B (4 travelers on flights, outbound) + DFW->LHR->NCE A and B (4 travelers on flights, inbound).\" ")
public class Journey  {
  
  @ApiModelProperty(required = true, value = "Journey unique identifier")
 /**
   * Journey unique identifier
  **/
  private String id = null;


@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("standalone") STANDALONE(String.valueOf("standalone")), @XmlEnumValue("outbound") OUTBOUND(String.valueOf("outbound")), @XmlEnumValue("inbound") INBOUND(String.valueOf("inbound"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Type of journey. Outbound/Inbound is in case of return journey detection.")
 /**
   * Type of journey. Outbound/Inbound is in case of return journey detection.
  **/
  private TypeEnum type = null;

  @ApiModelProperty(value = "The journeys linked to this journey: outbound if inbound and vice-versa.")
 /**
   * The journeys linked to this journey: outbound if inbound and vice-versa.
  **/
  private List<String> linkedJourneyIds = null;

  @ApiModelProperty(required = true, value = "Ordered list of flights in this journey.")
 /**
   * Ordered list of flights in this journey.
  **/
  private List<CheckInFlightIdObject> flights = new ArrayList<>();

  @ApiModelProperty(required = true, value = "List of traveler (passengers to check-in) in this journey.")
 /**
   * List of traveler (passengers to check-in) in this journey.
  **/
  private List<Traveler> travelers = new ArrayList<>();

  @ApiModelProperty(required = true, value = "List of journey elements in this journey.")
 /**
   * List of journey elements in this journey.
  **/
  private List<JourneyElementCommon> journeyElements = new ArrayList<>();

  @ApiModelProperty(value = "List of services (e.g. in flight entertainment, meals...)")
 /**
   * List of services (e.g. in flight entertainment, meals...)
  **/
  private List<ServiceItem> services = null;

  @ApiModelProperty(value = "List of baggages registered on this journey")
 /**
   * List of baggages registered on this journey
  **/
  private List<Baggage> baggages = null;

  @ApiModelProperty(required = true, value = "")
  private Eligibility acceptanceEligibility = null;

  @ApiModelProperty(required = true, value = "")
  private Acceptance acceptance = null;

  @ApiModelProperty(value = "Emails, phone numbers and addresses")
 /**
   * Emails, phone numbers and addresses
  **/
  private List<Contact> contacts = null;

  @ApiModelProperty(value = "This field describes whether this journey should be considered a group booking. The conditions for this are configured in Altea DCS Self-Service Check-In backend. User interfaces will often behave differently for group bookings. ")
 /**
   * This field describes whether this journey should be considered a group booking. The conditions for this are configured in Altea DCS Self-Service Check-In backend. User interfaces will often behave differently for group bookings. 
  **/
  private Boolean isGroupBooking = false;
 /**
   * Journey unique identifier
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Journey id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Type of journey. Outbound/Inbound is in case of return journey detection.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Journey type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The journeys linked to this journey: outbound if inbound and vice-versa.
   * @return linkedJourneyIds
  **/
  @JsonProperty("linkedJourneyIds")
  public List<String> getLinkedJourneyIds() {
    return linkedJourneyIds;
  }

  public void setLinkedJourneyIds(List<String> linkedJourneyIds) {
    this.linkedJourneyIds = linkedJourneyIds;
  }

  public Journey linkedJourneyIds(List<String> linkedJourneyIds) {
    this.linkedJourneyIds = linkedJourneyIds;
    return this;
  }

  public Journey addLinkedJourneyIdsItem(String linkedJourneyIdsItem) {
    this.linkedJourneyIds.add(linkedJourneyIdsItem);
    return this;
  }

 /**
   * Ordered list of flights in this journey.
   * @return flights
  **/
  @JsonProperty("flights")
  public List<CheckInFlightIdObject> getFlights() {
    return flights;
  }

  public void setFlights(List<CheckInFlightIdObject> flights) {
    this.flights = flights;
  }

  public Journey flights(List<CheckInFlightIdObject> flights) {
    this.flights = flights;
    return this;
  }

  public Journey addFlightsItem(CheckInFlightIdObject flightsItem) {
    this.flights.add(flightsItem);
    return this;
  }

 /**
   * List of traveler (passengers to check-in) in this journey.
   * @return travelers
  **/
  @JsonProperty("travelers")
  public List<Traveler> getTravelers() {
    return travelers;
  }

  public void setTravelers(List<Traveler> travelers) {
    this.travelers = travelers;
  }

  public Journey travelers(List<Traveler> travelers) {
    this.travelers = travelers;
    return this;
  }

  public Journey addTravelersItem(Traveler travelersItem) {
    this.travelers.add(travelersItem);
    return this;
  }

 /**
   * List of journey elements in this journey.
   * @return journeyElements
  **/
  @JsonProperty("journeyElements")
  public List<JourneyElementCommon> getJourneyElements() {
    return journeyElements;
  }

  public void setJourneyElements(List<JourneyElementCommon> journeyElements) {
    this.journeyElements = journeyElements;
  }

  public Journey journeyElements(List<JourneyElementCommon> journeyElements) {
    this.journeyElements = journeyElements;
    return this;
  }

  public Journey addJourneyElementsItem(JourneyElementCommon journeyElementsItem) {
    this.journeyElements.add(journeyElementsItem);
    return this;
  }

 /**
   * List of services (e.g. in flight entertainment, meals...)
   * @return services
  **/
  @JsonProperty("services")
  public List<ServiceItem> getServices() {
    return services;
  }

  public void setServices(List<ServiceItem> services) {
    this.services = services;
  }

  public Journey services(List<ServiceItem> services) {
    this.services = services;
    return this;
  }

  public Journey addServicesItem(ServiceItem servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

 /**
   * List of baggages registered on this journey
   * @return baggages
  **/
  @JsonProperty("baggages")
  public List<Baggage> getBaggages() {
    return baggages;
  }

  public void setBaggages(List<Baggage> baggages) {
    this.baggages = baggages;
  }

  public Journey baggages(List<Baggage> baggages) {
    this.baggages = baggages;
    return this;
  }

  public Journey addBaggagesItem(Baggage baggagesItem) {
    this.baggages.add(baggagesItem);
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

  public Journey acceptanceEligibility(Eligibility acceptanceEligibility) {
    this.acceptanceEligibility = acceptanceEligibility;
    return this;
  }

 /**
   * Get acceptance
   * @return acceptance
  **/
  @JsonProperty("acceptance")
  public Acceptance getAcceptance() {
    return acceptance;
  }

  public void setAcceptance(Acceptance acceptance) {
    this.acceptance = acceptance;
  }

  public Journey acceptance(Acceptance acceptance) {
    this.acceptance = acceptance;
    return this;
  }

 /**
   * Emails, phone numbers and addresses
   * @return contacts
  **/
  @JsonProperty("contacts")
  public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  public Journey contacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Journey addContactsItem(Contact contactsItem) {
    this.contacts.add(contactsItem);
    return this;
  }

 /**
   * This field describes whether this journey should be considered a group booking. The conditions for this are configured in Altea DCS Self-Service Check-In backend. User interfaces will often behave differently for group bookings. 
   * @return isGroupBooking
  **/
  @JsonProperty("isGroupBooking")
  public Boolean isIsGroupBooking() {
    return isGroupBooking;
  }

  public void setIsGroupBooking(Boolean isGroupBooking) {
    this.isGroupBooking = isGroupBooking;
  }

  public Journey isGroupBooking(Boolean isGroupBooking) {
    this.isGroupBooking = isGroupBooking;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Journey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    linkedJourneyIds: ").append(toIndentedString(linkedJourneyIds)).append("\n");
    sb.append("    flights: ").append(toIndentedString(flights)).append("\n");
    sb.append("    travelers: ").append(toIndentedString(travelers)).append("\n");
    sb.append("    journeyElements: ").append(toIndentedString(journeyElements)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    baggages: ").append(toIndentedString(baggages)).append("\n");
    sb.append("    acceptanceEligibility: ").append(toIndentedString(acceptanceEligibility)).append("\n");
    sb.append("    acceptance: ").append(toIndentedString(acceptance)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    isGroupBooking: ").append(toIndentedString(isGroupBooking)).append("\n");
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

