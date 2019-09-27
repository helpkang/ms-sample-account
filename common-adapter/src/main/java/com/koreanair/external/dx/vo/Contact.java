package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.ItemCommon;
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
  * Any contact information. There are three types of contacts: email, phone number or address. Contact is a polymorphic object, meaning that it contains only the basic structure from which derive the three types of contacts. To see the structure of the different types of contacts, please see [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get) 
 **/
@ApiModel(description="Any contact information. There are three types of contacts: email, phone number or address. Contact is a polymorphic object, meaning that it contains only the basic structure from which derive the three types of contacts. To see the structure of the different types of contacts, please see [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get) ")
public class Contact  {
  
  @ApiModelProperty(value = "Identifier of the resource. not read / taken into account when creating a resource")
 /**
   * Identifier of the resource. not read / taken into account when creating a resource
  **/
  private String id = null;

  @ApiModelProperty(value = "Temporary id that can be used to associate requested and returned contacts. Valid only for the time of the transaction")
 /**
   * Temporary id that can be used to associate requested and returned contacts. Valid only for the time of the transaction
  **/
  private String tid = null;

  @ApiModelProperty(value = "List of travelers associated to the contacts stored in the cart. If not specified, the contact applies to all travelers. Traveler association is required when the contactType has a 'notification' purpose.")
 /**
   * List of travelers associated to the contacts stored in the cart. If not specified, the contact applies to all travelers. Traveler association is required when the contactType has a 'notification' purpose.
  **/
  private List<String> travelerIds = null;

  @ApiModelProperty(value = "List of travelers temporary ids associated to stored in the cart. It can be used when both the contact and its associated traveler(s) are added simultanuously. Traveler association is required when the contactType has a 'notification' purpose.")
 /**
   * List of travelers temporary ids associated to stored in the cart. It can be used when both the contact and its associated traveler(s) are added simultanuously. Traveler association is required when the contactType has a 'notification' purpose.
  **/
  private List<String> travelerTIds = null;


@XmlType(name="CategoryEnum")
@XmlEnum(String.class)
public enum CategoryEnum {

@XmlEnumValue("personal") PERSONAL(String.valueOf("personal")), @XmlEnumValue("business") BUSINESS(String.valueOf("business")), @XmlEnumValue("agency") AGENCY(String.valueOf("agency")), @XmlEnumValue("other") OTHER(String.valueOf("other"));


    private String value;

    CategoryEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String v) {
        for (CategoryEnum b : CategoryEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Category of contact usage")
 /**
   * Category of contact usage
  **/
  private CategoryEnum category = CategoryEnum.PERSONAL;

  @ApiModelProperty(value = "Recipient name to be used if different from the traveler name (e.g. in case of emergency phone it corresponds to name of the person to be contacted)")
 /**
   * Recipient name to be used if different from the traveler name (e.g. in case of emergency phone it corresponds to name of the person to be contacted)
  **/
  private String addresseeName = null;


@XmlType(name="ContactTypeEnum")
@XmlEnum(String.class)
public enum ContactTypeEnum {

@XmlEnumValue("Email") EMAIL(String.valueOf("Email")), @XmlEnumValue("Address") ADDRESS(String.valueOf("Address")), @XmlEnumValue("Phone") PHONE(String.valueOf("Phone"));


    private String value;

    ContactTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ContactTypeEnum fromValue(String v) {
        for (ContactTypeEnum b : ContactTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "To see the structure of the different types of contacts, please check [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get)")
 /**
   * To see the structure of the different types of contacts, please check [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get)
  **/
  private ContactTypeEnum contactType = null;
 /**
   * Identifier of the resource. not read / taken into account when creating a resource
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Contact id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Temporary id that can be used to associate requested and returned contacts. Valid only for the time of the transaction
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public Contact tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * List of travelers associated to the contacts stored in the cart. If not specified, the contact applies to all travelers. Traveler association is required when the contactType has a &#39;notification&#39; purpose.
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public Contact travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public Contact addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * List of travelers temporary ids associated to stored in the cart. It can be used when both the contact and its associated traveler(s) are added simultanuously. Traveler association is required when the contactType has a &#39;notification&#39; purpose.
   * @return travelerTIds
  **/
  @JsonProperty("travelerTIds")
  public List<String> getTravelerTIds() {
    return travelerTIds;
  }

  public void setTravelerTIds(List<String> travelerTIds) {
    this.travelerTIds = travelerTIds;
  }

  public Contact travelerTIds(List<String> travelerTIds) {
    this.travelerTIds = travelerTIds;
    return this;
  }

  public Contact addTravelerTIdsItem(String travelerTIdsItem) {
    this.travelerTIds.add(travelerTIdsItem);
    return this;
  }

 /**
   * Category of contact usage
   * @return category
  **/
  @JsonProperty("category")
  public String getCategory() {
    if (category == null) {
      return null;
    }
    return category.value();
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public Contact category(CategoryEnum category) {
    this.category = category;
    return this;
  }

 /**
   * Recipient name to be used if different from the traveler name (e.g. in case of emergency phone it corresponds to name of the person to be contacted)
   * @return addresseeName
  **/
  @JsonProperty("addresseeName")
  public String getAddresseeName() {
    return addresseeName;
  }

  public void setAddresseeName(String addresseeName) {
    this.addresseeName = addresseeName;
  }

  public Contact addresseeName(String addresseeName) {
    this.addresseeName = addresseeName;
    return this;
  }

 /**
   * To see the structure of the different types of contacts, please check [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get)
   * @return contactType
  **/
  @JsonProperty("contactType")
  public String getContactType() {
    if (contactType == null) {
      return null;
    }
    return contactType.value();
  }

  public void setContactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
  }

  public Contact contactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
    sb.append("    travelerTIds: ").append(toIndentedString(travelerTIds)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    addresseeName: ").append(toIndentedString(addresseeName)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
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

