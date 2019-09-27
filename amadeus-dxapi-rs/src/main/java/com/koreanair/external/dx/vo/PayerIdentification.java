package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Contact;
import com.koreanair.external.dx.vo.Name;
import io.swagger.annotations.ApiModel;
import java.time.LocalDate;
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
  * Device, individual or corporation data aiming to identify the payer to detect frauds.
 **/
@ApiModel(description="Device, individual or corporation data aiming to identify the payer to detect frauds.")
public class PayerIdentification  {
  
  @ApiModelProperty(value = "Name of the payer")
 /**
   * Name of the payer
  **/
  private Name name = null;

  @ApiModelProperty(example = "2002-07-25", value = "Date of birth (date in ISO 8601: http://www.w3.org/TR/NOTE-datetime)")
 /**
   * Date of birth (date in ISO 8601: http://www.w3.org/TR/NOTE-datetime)
  **/
  private LocalDate dateOfBirth = null;

  @ApiModelProperty(example = "46.235.153.60", value = "Payer IP address")
 /**
   * Payer IP address
  **/
  private String ipAddress = null;

  @ApiModelProperty(value = "Device Finger Print. The format depends on the fraud detection system used. As an example: Bas64(ScreenResolution;OS;Browser) ")
 /**
   * Device Finger Print. The format depends on the fraud detection system used. As an example: Bas64(ScreenResolution;OS;Browser) 
  **/
  private String deviceFingerPrint = null;

  @ApiModelProperty(value = "Contacts information of the payer: email, billingAddress for example")
 /**
   * Contacts information of the payer: email, billingAddress for example
  **/
  private List<Contact> contacts = null;
 /**
   * Name of the payer
   * @return name
  **/
  @JsonProperty("name")
  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public PayerIdentification name(Name name) {
    this.name = name;
    return this;
  }

 /**
   * Date of birth (date in ISO 8601: http://www.w3.org/TR/NOTE-datetime)
   * @return dateOfBirth
  **/
  @JsonProperty("dateOfBirth")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public PayerIdentification dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

 /**
   * Payer IP address
   * @return ipAddress
  **/
  @JsonProperty("IPAddress")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public PayerIdentification ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

 /**
   * Device Finger Print. The format depends on the fraud detection system used. As an example: Bas64(ScreenResolution;OS;Browser) 
   * @return deviceFingerPrint
  **/
  @JsonProperty("deviceFingerPrint")
  public String getDeviceFingerPrint() {
    return deviceFingerPrint;
  }

  public void setDeviceFingerPrint(String deviceFingerPrint) {
    this.deviceFingerPrint = deviceFingerPrint;
  }

  public PayerIdentification deviceFingerPrint(String deviceFingerPrint) {
    this.deviceFingerPrint = deviceFingerPrint;
    return this;
  }

 /**
   * Contacts information of the payer: email, billingAddress for example
   * @return contacts
  **/
  @JsonProperty("contacts")
  public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  public PayerIdentification contacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public PayerIdentification addContactsItem(Contact contactsItem) {
    this.contacts.add(contactsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayerIdentification {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    deviceFingerPrint: ").append(toIndentedString(deviceFingerPrint)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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

