package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.ExtendedRegulatoryDocument;
import com.koreanair.external.dx.vo.PersonalDetails;
import com.koreanair.external.dx.vo.RegulatoryAddress;
import com.koreanair.external.dx.vo.RegulatoryPhoneNumber;
import io.swagger.annotations.ApiModel;

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
  * Detail which are of border control value when entering another country or overall security. It can be a travel documents (passport, visa), an address (destination address, home address), a phone number (emergency contact), personal details (gender, date of birth, purpose of visit) The different possibilities are exclusive. A regulatoryDetail will contain only one of his child (document, address, phoneNumber, personalDetails) 
 **/
@ApiModel(description="Detail which are of border control value when entering another country or overall security. It can be a travel documents (passport, visa), an address (destination address, home address), a phone number (emergency contact), personal details (gender, date of birth, purpose of visit) The different possibilities are exclusive. A regulatoryDetail will contain only one of his child (document, address, phoneNumber, personalDetails) ")
public class RegulatoryDetail  {
  
  @ApiModelProperty(value = "Regulatory Detail unique id")
 /**
   * Regulatory Detail unique id
  **/
  private String id = null;

  @ApiModelProperty(value = "")
  private ExtendedRegulatoryDocument document = null;

  @ApiModelProperty(value = "")
  private RegulatoryAddress address = null;

  @ApiModelProperty(value = "")
  private RegulatoryPhoneNumber phoneNumber = null;

  @ApiModelProperty(value = "")
  private PersonalDetails personalDetails = null;
 /**
   * Regulatory Detail unique id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RegulatoryDetail id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get document
   * @return document
  **/
  @JsonProperty("document")
  public ExtendedRegulatoryDocument getDocument() {
    return document;
  }

  public void setDocument(ExtendedRegulatoryDocument document) {
    this.document = document;
  }

  public RegulatoryDetail document(ExtendedRegulatoryDocument document) {
    this.document = document;
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public RegulatoryAddress getAddress() {
    return address;
  }

  public void setAddress(RegulatoryAddress address) {
    this.address = address;
  }

  public RegulatoryDetail address(RegulatoryAddress address) {
    this.address = address;
    return this;
  }

 /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @JsonProperty("phoneNumber")
  public RegulatoryPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(RegulatoryPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public RegulatoryDetail phoneNumber(RegulatoryPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

 /**
   * Get personalDetails
   * @return personalDetails
  **/
  @JsonProperty("personalDetails")
  public PersonalDetails getPersonalDetails() {
    return personalDetails;
  }

  public void setPersonalDetails(PersonalDetails personalDetails) {
    this.personalDetails = personalDetails;
  }

  public RegulatoryDetail personalDetails(PersonalDetails personalDetails) {
    this.personalDetails = personalDetails;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    personalDetails: ").append(toIndentedString(personalDetails)).append("\n");
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

