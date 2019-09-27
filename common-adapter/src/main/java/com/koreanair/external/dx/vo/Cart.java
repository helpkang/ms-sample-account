package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirOffer;
import com.koreanair.external.dx.vo.Contact;
import com.koreanair.external.dx.vo.Extension;
import com.koreanair.external.dx.vo.FormOfIdentificationDetail;
import com.koreanair.external.dx.vo.FrequentFlyerCard;
import com.koreanair.external.dx.vo.HotelOffer;
import com.koreanair.external.dx.vo.SeatItem;
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
  * Shopping cart content
 **/
@ApiModel(description="Shopping cart content")
public class Cart  {
  
  @ApiModelProperty(required = true, value = "Cart id")
 /**
   * Cart id
  **/
  private String id = null;

  @ApiModelProperty(value = "List of travelers (individual taking part in the journey)")
 /**
   * List of travelers (individual taking part in the journey)
  **/
  private List<Traveler> travelers = null;

  @ApiModelProperty(value = "List of air offers")
 /**
   * List of air offers
  **/
  private List<AirOffer> airOffers = null;

  @ApiModelProperty(value = "List of services (e.g. baggage, meals...)")
 /**
   * List of services (e.g. baggage, meals...)
  **/
  private List<ServiceItem> services = null;

  @ApiModelProperty(value = "List of seats (seat selection and associated travelers)")
 /**
   * List of seats (seat selection and associated travelers)
  **/
  private List<SeatItem> seats = null;

  @ApiModelProperty(value = "List of frequent flyer cards (for mileage accrual)")
 /**
   * List of frequent flyer cards (for mileage accrual)
  **/
  private List<FrequentFlyerCard> frequentFlyerCards = null;

  @ApiModelProperty(value = "List of contacts (phone number, email or address)")
 /**
   * List of contacts (phone number, email or address)
  **/
  private List<Contact> contacts = null;

  @ApiModelProperty(value = "List of form of identifications")
 /**
   * List of form of identifications
  **/
  private List<FormOfIdentificationDetail> formOfIdentifications = null;

  @ApiModelProperty(value = "List of extensions in the cart.")
 /**
   * List of extensions in the cart.
  **/
  private List<Extension> extensions = null;

  @ApiModelProperty(value = "List of hotel offers")
 /**
   * List of hotel offers
  **/
  private List<HotelOffer> hotelItems = null;
 /**
   * Cart id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Cart id(String id) {
    this.id = id;
    return this;
  }

 /**
   * List of travelers (individual taking part in the journey)
   * @return travelers
  **/
  @JsonProperty("travelers")
  public List<Traveler> getTravelers() {
    return travelers;
  }

  public void setTravelers(List<Traveler> travelers) {
    this.travelers = travelers;
  }

  public Cart travelers(List<Traveler> travelers) {
    this.travelers = travelers;
    return this;
  }

  public Cart addTravelersItem(Traveler travelersItem) {
    this.travelers.add(travelersItem);
    return this;
  }

 /**
   * List of air offers
   * @return airOffers
  **/
  @JsonProperty("airOffers")
  public List<AirOffer> getAirOffers() {
    return airOffers;
  }

  public void setAirOffers(List<AirOffer> airOffers) {
    this.airOffers = airOffers;
  }

  public Cart airOffers(List<AirOffer> airOffers) {
    this.airOffers = airOffers;
    return this;
  }

  public Cart addAirOffersItem(AirOffer airOffersItem) {
    this.airOffers.add(airOffersItem);
    return this;
  }

 /**
   * List of services (e.g. baggage, meals...)
   * @return services
  **/
  @JsonProperty("services")
  public List<ServiceItem> getServices() {
    return services;
  }

  public void setServices(List<ServiceItem> services) {
    this.services = services;
  }

  public Cart services(List<ServiceItem> services) {
    this.services = services;
    return this;
  }

  public Cart addServicesItem(ServiceItem servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

 /**
   * List of seats (seat selection and associated travelers)
   * @return seats
  **/
  @JsonProperty("seats")
  public List<SeatItem> getSeats() {
    return seats;
  }

  public void setSeats(List<SeatItem> seats) {
    this.seats = seats;
  }

  public Cart seats(List<SeatItem> seats) {
    this.seats = seats;
    return this;
  }

  public Cart addSeatsItem(SeatItem seatsItem) {
    this.seats.add(seatsItem);
    return this;
  }

 /**
   * List of frequent flyer cards (for mileage accrual)
   * @return frequentFlyerCards
  **/
  @JsonProperty("frequentFlyerCards")
  public List<FrequentFlyerCard> getFrequentFlyerCards() {
    return frequentFlyerCards;
  }

  public void setFrequentFlyerCards(List<FrequentFlyerCard> frequentFlyerCards) {
    this.frequentFlyerCards = frequentFlyerCards;
  }

  public Cart frequentFlyerCards(List<FrequentFlyerCard> frequentFlyerCards) {
    this.frequentFlyerCards = frequentFlyerCards;
    return this;
  }

  public Cart addFrequentFlyerCardsItem(FrequentFlyerCard frequentFlyerCardsItem) {
    this.frequentFlyerCards.add(frequentFlyerCardsItem);
    return this;
  }

 /**
   * List of contacts (phone number, email or address)
   * @return contacts
  **/
  @JsonProperty("contacts")
  public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  public Cart contacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Cart addContactsItem(Contact contactsItem) {
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

  public Cart formOfIdentifications(List<FormOfIdentificationDetail> formOfIdentifications) {
    this.formOfIdentifications = formOfIdentifications;
    return this;
  }

  public Cart addFormOfIdentificationsItem(FormOfIdentificationDetail formOfIdentificationsItem) {
    this.formOfIdentifications.add(formOfIdentificationsItem);
    return this;
  }

 /**
   * List of extensions in the cart.
   * @return extensions
  **/
  @JsonProperty("extensions")
  public List<Extension> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<Extension> extensions) {
    this.extensions = extensions;
  }

  public Cart extensions(List<Extension> extensions) {
    this.extensions = extensions;
    return this;
  }

  public Cart addExtensionsItem(Extension extensionsItem) {
    this.extensions.add(extensionsItem);
    return this;
  }

 /**
   * List of hotel offers
   * @return hotelItems
  **/
  @JsonProperty("hotelItems")
  public List<HotelOffer> getHotelItems() {
    return hotelItems;
  }

  public void setHotelItems(List<HotelOffer> hotelItems) {
    this.hotelItems = hotelItems;
  }

  public Cart hotelItems(List<HotelOffer> hotelItems) {
    this.hotelItems = hotelItems;
    return this;
  }

  public Cart addHotelItemsItem(HotelOffer hotelItemsItem) {
    this.hotelItems.add(hotelItemsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cart {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    travelers: ").append(toIndentedString(travelers)).append("\n");
    sb.append("    airOffers: ").append(toIndentedString(airOffers)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
    sb.append("    frequentFlyerCards: ").append(toIndentedString(frequentFlyerCards)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    formOfIdentifications: ").append(toIndentedString(formOfIdentifications)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    hotelItems: ").append(toIndentedString(hotelItems)).append("\n");
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

