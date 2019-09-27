package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Contact;
import com.koreanair.external.dx.vo.CreationPointOfSale;
import com.koreanair.external.dx.vo.FormOfIdentificationDetail;
import com.koreanair.external.dx.vo.FrequentFlyerCard;
import com.koreanair.external.dx.vo.InsuranceItem;
import com.koreanair.external.dx.vo.NotificationResult;
import com.koreanair.external.dx.vo.OrderAirItem;
import com.koreanair.external.dx.vo.OrderEligibilities;
import com.koreanair.external.dx.vo.OrderSeatItem;
import com.koreanair.external.dx.vo.OrderServiceItem;
import com.koreanair.external.dx.vo.OtherServiceInformation;
import com.koreanair.external.dx.vo.PaymentRecord;
import com.koreanair.external.dx.vo.Remark;
import com.koreanair.external.dx.vo.SpecialKeyword;
import com.koreanair.external.dx.vo.SpecialServiceRequest;
import com.koreanair.external.dx.vo.TravelDocument;
import com.koreanair.external.dx.vo.Traveler;
import io.swagger.annotations.ApiModel;
import java.time.LocalDateTime;
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
  * List of items that are confirmed at the cart checkout. It corresponds to the final phase of a booking
 **/
@ApiModel(description="List of items that are confirmed at the cart checkout. It corresponds to the final phase of a booking")
public class Order  {
  
  @ApiModelProperty(required = true, value = "Order id (record locator)")
 /**
   * Order id (record locator)
  **/
  private String id = null;

  @ApiModelProperty(value = "")
  private CreationPointOfSale creationPointOfSale = null;

  @ApiModelProperty(required = true, value = "Creation date of the order in GMT (Example: 2018-02-10T20:40:12Z)")
 /**
   * Creation date of the order in GMT (Example: 2018-02-10T20:40:12Z)
  **/
  private LocalDateTime creationDateTime = null;

  @ApiModelProperty(value = "Last modification date of the order in GMT (Example: 2018-02-10T20:40:12Z)")
 /**
   * Last modification date of the order in GMT (Example: 2018-02-10T20:40:12Z)
  **/
  private LocalDateTime lastModificationDateTime = null;

  @ApiModelProperty(value = "Expiration date of the order in GMT (Example: 2018-02-10T20:40:12Z)")
 /**
   * Expiration date of the order in GMT (Example: 2018-02-10T20:40:12Z)
  **/
  private LocalDateTime expirationDateTime = null;

  @ApiModelProperty(value = "Flag indicating if the order is a booking for a group. In such case, the order information is filtered according to a specific passenger.")
 /**
   * Flag indicating if the order is a booking for a group. In such case, the order information is filtered according to a specific passenger.
  **/
  private Boolean isGroupBooking = null;

  @ApiModelProperty(value = "")
  private OrderAirItem air = null;

  @ApiModelProperty(value = "List of services (e.g. baggage, meals...)")
 /**
   * List of services (e.g. baggage, meals...)
  **/
  private List<OrderServiceItem> services = null;

  @ApiModelProperty(value = "List of seats (seat selection and associated travelers)")
 /**
   * List of seats (seat selection and associated travelers)
  **/
  private List<OrderSeatItem> seats = null;

  @ApiModelProperty(value = "Travelers taking part in the journey")
 /**
   * Travelers taking part in the journey
  **/
  private List<Traveler> travelers = null;

  @ApiModelProperty(value = "Frequent flyer cards used to redeem or accrue miles")
 /**
   * Frequent flyer cards used to redeem or accrue miles
  **/
  private List<FrequentFlyerCard> frequentFlyerCards = null;

  @ApiModelProperty(value = "Emails, phone numbers and addresses")
 /**
   * Emails, phone numbers and addresses
  **/
  private List<Contact> contacts = null;

  @ApiModelProperty(value = "List of form of identifications")
 /**
   * List of form of identifications
  **/
  private List<FormOfIdentificationDetail> formOfIdentifications = null;

  @ApiModelProperty(value = "Travel documents (e-tickets and service-related documents)")
 /**
   * Travel documents (e-tickets and service-related documents)
  **/
  private List<TravelDocument> travelDocuments = null;

  @ApiModelProperty(value = "Remarks (RM) stored in the order")
 /**
   * Remarks (RM) stored in the order
  **/
  private List<Remark> remarks = null;

  @ApiModelProperty(value = "Other service information elements (OSI) stored in the order")
 /**
   * Other service information elements (OSI) stored in the order
  **/
  private List<OtherServiceInformation> otherServiceInformations = null;

  @ApiModelProperty(value = "Special Keyword elements (SK) stored in the order")
 /**
   * Special Keyword elements (SK) stored in the order
  **/
  private List<SpecialKeyword> specialKeywords = null;

  @ApiModelProperty(value = "Special Services Request (SSR) stored in the order")
 /**
   * Special Services Request (SSR) stored in the order
  **/
  private List<SpecialServiceRequest> specialServiceRequests = null;

  @ApiModelProperty(value = "List of payment records stored in the order")
 /**
   * List of payment records stored in the order
  **/
  private List<PaymentRecord> paymentRecords = null;

  @ApiModelProperty(value = "List of orders associated to current order. E.g. The PNR has been split in two, in order to separate some of the passengers to a new reservation.")
 /**
   * List of orders associated to current order. E.g. The PNR has been split in two, in order to separate some of the passengers to a new reservation.
  **/
  private List<String> associateOrderIds = null;

  @ApiModelProperty(value = "")
  private OrderEligibilities orderEligibilities = null;

  @ApiModelProperty(value = "List of result of each notification sent for this order.")
 /**
   * List of result of each notification sent for this order.
  **/
  private List<NotificationResult> notifications = null;

  @ApiModelProperty(value = "List of Insurance (INS) details booked in Order")
 /**
   * List of Insurance (INS) details booked in Order
  **/
  private List<InsuranceItem> insurances = null;
 /**
   * Order id (record locator)
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Order id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get creationPointOfSale
   * @return creationPointOfSale
  **/
  @JsonProperty("creationPointOfSale")
  public CreationPointOfSale getCreationPointOfSale() {
    return creationPointOfSale;
  }

  public void setCreationPointOfSale(CreationPointOfSale creationPointOfSale) {
    this.creationPointOfSale = creationPointOfSale;
  }

  public Order creationPointOfSale(CreationPointOfSale creationPointOfSale) {
    this.creationPointOfSale = creationPointOfSale;
    return this;
  }

 /**
   * Creation date of the order in GMT (Example: 2018-02-10T20:40:12Z)
   * @return creationDateTime
  **/
  @JsonProperty("creationDateTime")
  public LocalDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(LocalDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public Order creationDateTime(LocalDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

 /**
   * Last modification date of the order in GMT (Example: 2018-02-10T20:40:12Z)
   * @return lastModificationDateTime
  **/
  @JsonProperty("lastModificationDateTime")
  public LocalDateTime getLastModificationDateTime() {
    return lastModificationDateTime;
  }

  public void setLastModificationDateTime(LocalDateTime lastModificationDateTime) {
    this.lastModificationDateTime = lastModificationDateTime;
  }

  public Order lastModificationDateTime(LocalDateTime lastModificationDateTime) {
    this.lastModificationDateTime = lastModificationDateTime;
    return this;
  }

 /**
   * Expiration date of the order in GMT (Example: 2018-02-10T20:40:12Z)
   * @return expirationDateTime
  **/
  @JsonProperty("expirationDateTime")
  public LocalDateTime getExpirationDateTime() {
    return expirationDateTime;
  }

  public void setExpirationDateTime(LocalDateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  public Order expirationDateTime(LocalDateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

 /**
   * Flag indicating if the order is a booking for a group. In such case, the order information is filtered according to a specific passenger.
   * @return isGroupBooking
  **/
  @JsonProperty("isGroupBooking")
  public Boolean isIsGroupBooking() {
    return isGroupBooking;
  }

  public void setIsGroupBooking(Boolean isGroupBooking) {
    this.isGroupBooking = isGroupBooking;
  }

  public Order isGroupBooking(Boolean isGroupBooking) {
    this.isGroupBooking = isGroupBooking;
    return this;
  }

 /**
   * Get air
   * @return air
  **/
  @JsonProperty("air")
  public OrderAirItem getAir() {
    return air;
  }

  public void setAir(OrderAirItem air) {
    this.air = air;
  }

  public Order air(OrderAirItem air) {
    this.air = air;
    return this;
  }

 /**
   * List of services (e.g. baggage, meals...)
   * @return services
  **/
  @JsonProperty("services")
  public List<OrderServiceItem> getServices() {
    return services;
  }

  public void setServices(List<OrderServiceItem> services) {
    this.services = services;
  }

  public Order services(List<OrderServiceItem> services) {
    this.services = services;
    return this;
  }

  public Order addServicesItem(OrderServiceItem servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

 /**
   * List of seats (seat selection and associated travelers)
   * @return seats
  **/
  @JsonProperty("seats")
  public List<OrderSeatItem> getSeats() {
    return seats;
  }

  public void setSeats(List<OrderSeatItem> seats) {
    this.seats = seats;
  }

  public Order seats(List<OrderSeatItem> seats) {
    this.seats = seats;
    return this;
  }

  public Order addSeatsItem(OrderSeatItem seatsItem) {
    this.seats.add(seatsItem);
    return this;
  }

 /**
   * Travelers taking part in the journey
   * @return travelers
  **/
  @JsonProperty("travelers")
  public List<Traveler> getTravelers() {
    return travelers;
  }

  public void setTravelers(List<Traveler> travelers) {
    this.travelers = travelers;
  }

  public Order travelers(List<Traveler> travelers) {
    this.travelers = travelers;
    return this;
  }

  public Order addTravelersItem(Traveler travelersItem) {
    this.travelers.add(travelersItem);
    return this;
  }

 /**
   * Frequent flyer cards used to redeem or accrue miles
   * @return frequentFlyerCards
  **/
  @JsonProperty("frequentFlyerCards")
  public List<FrequentFlyerCard> getFrequentFlyerCards() {
    return frequentFlyerCards;
  }

  public void setFrequentFlyerCards(List<FrequentFlyerCard> frequentFlyerCards) {
    this.frequentFlyerCards = frequentFlyerCards;
  }

  public Order frequentFlyerCards(List<FrequentFlyerCard> frequentFlyerCards) {
    this.frequentFlyerCards = frequentFlyerCards;
    return this;
  }

  public Order addFrequentFlyerCardsItem(FrequentFlyerCard frequentFlyerCardsItem) {
    this.frequentFlyerCards.add(frequentFlyerCardsItem);
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

  public Order contacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Order addContactsItem(Contact contactsItem) {
    this.contacts.add(contactsItem);
    return this;
  }

 /**
   * List of form of identifications
   * @return formOfIdentifications
  **/
  @JsonProperty("formOfIdentifications")
  public List<FormOfIdentificationDetail> getFormOfIdentifications() {
    return formOfIdentifications;
  }

  public void setFormOfIdentifications(List<FormOfIdentificationDetail> formOfIdentifications) {
    this.formOfIdentifications = formOfIdentifications;
  }

  public Order formOfIdentifications(List<FormOfIdentificationDetail> formOfIdentifications) {
    this.formOfIdentifications = formOfIdentifications;
    return this;
  }

  public Order addFormOfIdentificationsItem(FormOfIdentificationDetail formOfIdentificationsItem) {
    this.formOfIdentifications.add(formOfIdentificationsItem);
    return this;
  }

 /**
   * Travel documents (e-tickets and service-related documents)
   * @return travelDocuments
  **/
  @JsonProperty("travelDocuments")
  public List<TravelDocument> getTravelDocuments() {
    return travelDocuments;
  }

  public void setTravelDocuments(List<TravelDocument> travelDocuments) {
    this.travelDocuments = travelDocuments;
  }

  public Order travelDocuments(List<TravelDocument> travelDocuments) {
    this.travelDocuments = travelDocuments;
    return this;
  }

  public Order addTravelDocumentsItem(TravelDocument travelDocumentsItem) {
    this.travelDocuments.add(travelDocumentsItem);
    return this;
  }

 /**
   * Remarks (RM) stored in the order
   * @return remarks
  **/
  @JsonProperty("remarks")
  public List<Remark> getRemarks() {
    return remarks;
  }

  public void setRemarks(List<Remark> remarks) {
    this.remarks = remarks;
  }

  public Order remarks(List<Remark> remarks) {
    this.remarks = remarks;
    return this;
  }

  public Order addRemarksItem(Remark remarksItem) {
    this.remarks.add(remarksItem);
    return this;
  }

 /**
   * Other service information elements (OSI) stored in the order
   * @return otherServiceInformations
  **/
  @JsonProperty("otherServiceInformations")
  public List<OtherServiceInformation> getOtherServiceInformations() {
    return otherServiceInformations;
  }

  public void setOtherServiceInformations(List<OtherServiceInformation> otherServiceInformations) {
    this.otherServiceInformations = otherServiceInformations;
  }

  public Order otherServiceInformations(List<OtherServiceInformation> otherServiceInformations) {
    this.otherServiceInformations = otherServiceInformations;
    return this;
  }

  public Order addOtherServiceInformationsItem(OtherServiceInformation otherServiceInformationsItem) {
    this.otherServiceInformations.add(otherServiceInformationsItem);
    return this;
  }

 /**
   * Special Keyword elements (SK) stored in the order
   * @return specialKeywords
  **/
  @JsonProperty("specialKeywords")
  public List<SpecialKeyword> getSpecialKeywords() {
    return specialKeywords;
  }

  public void setSpecialKeywords(List<SpecialKeyword> specialKeywords) {
    this.specialKeywords = specialKeywords;
  }

  public Order specialKeywords(List<SpecialKeyword> specialKeywords) {
    this.specialKeywords = specialKeywords;
    return this;
  }

  public Order addSpecialKeywordsItem(SpecialKeyword specialKeywordsItem) {
    this.specialKeywords.add(specialKeywordsItem);
    return this;
  }

 /**
   * Special Services Request (SSR) stored in the order
   * @return specialServiceRequests
  **/
  @JsonProperty("specialServiceRequests")
  public List<SpecialServiceRequest> getSpecialServiceRequests() {
    return specialServiceRequests;
  }

  public void setSpecialServiceRequests(List<SpecialServiceRequest> specialServiceRequests) {
    this.specialServiceRequests = specialServiceRequests;
  }

  public Order specialServiceRequests(List<SpecialServiceRequest> specialServiceRequests) {
    this.specialServiceRequests = specialServiceRequests;
    return this;
  }

  public Order addSpecialServiceRequestsItem(SpecialServiceRequest specialServiceRequestsItem) {
    this.specialServiceRequests.add(specialServiceRequestsItem);
    return this;
  }

 /**
   * List of payment records stored in the order
   * @return paymentRecords
  **/
  @JsonProperty("paymentRecords")
  public List<PaymentRecord> getPaymentRecords() {
    return paymentRecords;
  }

  public void setPaymentRecords(List<PaymentRecord> paymentRecords) {
    this.paymentRecords = paymentRecords;
  }

  public Order paymentRecords(List<PaymentRecord> paymentRecords) {
    this.paymentRecords = paymentRecords;
    return this;
  }

  public Order addPaymentRecordsItem(PaymentRecord paymentRecordsItem) {
    this.paymentRecords.add(paymentRecordsItem);
    return this;
  }

 /**
   * List of orders associated to current order. E.g. The PNR has been split in two, in order to separate some of the passengers to a new reservation.
   * @return associateOrderIds
  **/
  @JsonProperty("associateOrderIds")
  public List<String> getAssociateOrderIds() {
    return associateOrderIds;
  }

  public void setAssociateOrderIds(List<String> associateOrderIds) {
    this.associateOrderIds = associateOrderIds;
  }

  public Order associateOrderIds(List<String> associateOrderIds) {
    this.associateOrderIds = associateOrderIds;
    return this;
  }

  public Order addAssociateOrderIdsItem(String associateOrderIdsItem) {
    this.associateOrderIds.add(associateOrderIdsItem);
    return this;
  }

 /**
   * Get orderEligibilities
   * @return orderEligibilities
  **/
  @JsonProperty("orderEligibilities")
  public OrderEligibilities getOrderEligibilities() {
    return orderEligibilities;
  }

  public void setOrderEligibilities(OrderEligibilities orderEligibilities) {
    this.orderEligibilities = orderEligibilities;
  }

  public Order orderEligibilities(OrderEligibilities orderEligibilities) {
    this.orderEligibilities = orderEligibilities;
    return this;
  }

 /**
   * List of result of each notification sent for this order.
   * @return notifications
  **/
  @JsonProperty("notifications")
  public List<NotificationResult> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<NotificationResult> notifications) {
    this.notifications = notifications;
  }

  public Order notifications(List<NotificationResult> notifications) {
    this.notifications = notifications;
    return this;
  }

  public Order addNotificationsItem(NotificationResult notificationsItem) {
    this.notifications.add(notificationsItem);
    return this;
  }

 /**
   * List of Insurance (INS) details booked in Order
   * @return insurances
  **/
  @JsonProperty("insurances")
  public List<InsuranceItem> getInsurances() {
    return insurances;
  }

  public void setInsurances(List<InsuranceItem> insurances) {
    this.insurances = insurances;
  }

  public Order insurances(List<InsuranceItem> insurances) {
    this.insurances = insurances;
    return this;
  }

  public Order addInsurancesItem(InsuranceItem insurancesItem) {
    this.insurances.add(insurancesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationPointOfSale: ").append(toIndentedString(creationPointOfSale)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    lastModificationDateTime: ").append(toIndentedString(lastModificationDateTime)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    isGroupBooking: ").append(toIndentedString(isGroupBooking)).append("\n");
    sb.append("    air: ").append(toIndentedString(air)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
    sb.append("    travelers: ").append(toIndentedString(travelers)).append("\n");
    sb.append("    frequentFlyerCards: ").append(toIndentedString(frequentFlyerCards)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    formOfIdentifications: ").append(toIndentedString(formOfIdentifications)).append("\n");
    sb.append("    travelDocuments: ").append(toIndentedString(travelDocuments)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    otherServiceInformations: ").append(toIndentedString(otherServiceInformations)).append("\n");
    sb.append("    specialKeywords: ").append(toIndentedString(specialKeywords)).append("\n");
    sb.append("    specialServiceRequests: ").append(toIndentedString(specialServiceRequests)).append("\n");
    sb.append("    paymentRecords: ").append(toIndentedString(paymentRecords)).append("\n");
    sb.append("    associateOrderIds: ").append(toIndentedString(associateOrderIds)).append("\n");
    sb.append("    orderEligibilities: ").append(toIndentedString(orderEligibilities)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    insurances: ").append(toIndentedString(insurances)).append("\n");
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

