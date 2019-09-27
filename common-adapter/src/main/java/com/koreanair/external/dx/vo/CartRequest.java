package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirOfferTravelerSelection;
import com.koreanair.external.dx.vo.Contact;
import com.koreanair.external.dx.vo.Extension;
import com.koreanair.external.dx.vo.FrequentFlyerCard;
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
  * CartRequest can be used to create a Cart with sub-resources such as Travelers, Contacts, Frequent flyer cards Contacts and Frequent flyer cards can be associated to Travelers using temporary ids, when those sub-resources are manipulated in the same transaction 
 **/
@ApiModel(description="CartRequest can be used to create a Cart with sub-resources such as Travelers, Contacts, Frequent flyer cards Contacts and Frequent flyer cards can be associated to Travelers using temporary ids, when those sub-resources are manipulated in the same transaction ")
public class CartRequest  {
  
  @ApiModelProperty(value = "identifier of an offer")
 /**
   * identifier of an offer
  **/
  private String airOfferId = null;

  @ApiModelProperty(value = "List of airbounds to be used as elements composing the offer to be stored in the cart")
 /**
   * List of airbounds to be used as elements composing the offer to be stored in the cart
  **/
  private List<String> airBoundIds = null;

  @ApiModelProperty(value = "List of associations between travelers described in the offer and existing travelers in the cart")
 /**
   * List of associations between travelers described in the offer and existing travelers in the cart
  **/
  private List<AirOfferTravelerSelection> airOfferTravelerSelections = null;

  @ApiModelProperty(value = "Cart label or name")
 /**
   * Cart label or name
  **/
  private String title = null;

  @ApiModelProperty(value = "Cart state (list to be defined during development)")
 /**
   * Cart state (list to be defined during development)
  **/
  private String state = null;

  @ApiModelProperty(value = "List of travelers (individual taking part in the journey)")
 /**
   * List of travelers (individual taking part in the journey)
  **/
  private List<Traveler> travelers = null;

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

  @ApiModelProperty(value = "Add extensions to the cart.  ")
 /**
   * Add extensions to the cart.  
  **/
  private List<Extension> extensions = null;
 /**
   * identifier of an offer
   * @return airOfferId
  **/
  @JsonProperty("airOfferId")
  public String getAirOfferId() {
    return airOfferId;
  }

  public void setAirOfferId(String airOfferId) {
    this.airOfferId = airOfferId;
  }

  public CartRequest airOfferId(String airOfferId) {
    this.airOfferId = airOfferId;
    return this;
  }

 /**
   * List of airbounds to be used as elements composing the offer to be stored in the cart
   * @return airBoundIds
  **/
  @JsonProperty("airBoundIds")
  public List<String> getAirBoundIds() {
    return airBoundIds;
  }

  public void setAirBoundIds(List<String> airBoundIds) {
    this.airBoundIds = airBoundIds;
  }

  public CartRequest airBoundIds(List<String> airBoundIds) {
    this.airBoundIds = airBoundIds;
    return this;
  }

  public CartRequest addAirBoundIdsItem(String airBoundIdsItem) {
    this.airBoundIds.add(airBoundIdsItem);
    return this;
  }

 /**
   * List of associations between travelers described in the offer and existing travelers in the cart
   * @return airOfferTravelerSelections
  **/
  @JsonProperty("airOfferTravelerSelections")
  public List<AirOfferTravelerSelection> getAirOfferTravelerSelections() {
    return airOfferTravelerSelections;
  }

  public void setAirOfferTravelerSelections(List<AirOfferTravelerSelection> airOfferTravelerSelections) {
    this.airOfferTravelerSelections = airOfferTravelerSelections;
  }

  public CartRequest airOfferTravelerSelections(List<AirOfferTravelerSelection> airOfferTravelerSelections) {
    this.airOfferTravelerSelections = airOfferTravelerSelections;
    return this;
  }

  public CartRequest addAirOfferTravelerSelectionsItem(AirOfferTravelerSelection airOfferTravelerSelectionsItem) {
    this.airOfferTravelerSelections.add(airOfferTravelerSelectionsItem);
    return this;
  }

 /**
   * Cart label or name
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CartRequest title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Cart state (list to be defined during development)
   * @return state
  **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public CartRequest state(String state) {
    this.state = state;
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

  public CartRequest travelers(List<Traveler> travelers) {
    this.travelers = travelers;
    return this;
  }

  public CartRequest addTravelersItem(Traveler travelersItem) {
    this.travelers.add(travelersItem);
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

  public CartRequest frequentFlyerCards(List<FrequentFlyerCard> frequentFlyerCards) {
    this.frequentFlyerCards = frequentFlyerCards;
    return this;
  }

  public CartRequest addFrequentFlyerCardsItem(FrequentFlyerCard frequentFlyerCardsItem) {
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

  public CartRequest contacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public CartRequest addContactsItem(Contact contactsItem) {
    this.contacts.add(contactsItem);
    return this;
  }

 /**
   * Add extensions to the cart.  
   * @return extensions
  **/
  @JsonProperty("extensions")
  public List<Extension> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<Extension> extensions) {
    this.extensions = extensions;
  }

  public CartRequest extensions(List<Extension> extensions) {
    this.extensions = extensions;
    return this;
  }

  public CartRequest addExtensionsItem(Extension extensionsItem) {
    this.extensions.add(extensionsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartRequest {\n");
    
    sb.append("    airOfferId: ").append(toIndentedString(airOfferId)).append("\n");
    sb.append("    airBoundIds: ").append(toIndentedString(airBoundIds)).append("\n");
    sb.append("    airOfferTravelerSelections: ").append(toIndentedString(airOfferTravelerSelections)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    travelers: ").append(toIndentedString(travelers)).append("\n");
    sb.append("    frequentFlyerCards: ").append(toIndentedString(frequentFlyerCards)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
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

