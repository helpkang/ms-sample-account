package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Name;
import com.koreanair.external.dx.vo.RegulatoryApisDetail;
import com.koreanair.external.dx.vo.TravelerCommon;
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
  * Individual taking part in a journey
 **/
@ApiModel(description="Individual taking part in a journey")
public class Traveler  {
  
  @ApiModelProperty(example = "ADT", required = true, value = "traveler type (http://api.dev.amadeus.net/api/Development/common/codelist/PNR_PassengerType.htm)")
 /**
   * traveler type (http://api.dev.amadeus.net/api/Development/common/codelist/PNR_PassengerType.htm)
  **/
  private String passengerTypeCode = null;

  @ApiModelProperty(value = "traveler id")
 /**
   * traveler id
  **/
  private String id = null;

  @ApiModelProperty(value = "Temporary id used to identify a traveler. can be used to associate an infant to an adult, when the adult id is not known yet. only valid the time of the transaction")
 /**
   * Temporary id used to identify a traveler. can be used to associate an infant to an adult, when the adult id is not known yet. only valid the time of the transaction
  **/
  private String tid = null;

  @ApiModelProperty(value = "")
  private List<Name> names = null;

  @ApiModelProperty(example = "2002-07-25", value = "Date of birth (date in ISO 8601: http://www.w3.org/TR/NOTE-datetime)")
 /**
   * Date of birth (date in ISO 8601: http://www.w3.org/TR/NOTE-datetime)
  **/
  private LocalDate dateOfBirth = null;

  @ApiModelProperty(example = "36", value = "Traveler age, in years")
 /**
   * Traveler age, in years
  **/
  private Integer age = null;


@XmlType(name="GenderEnum")
@XmlEnum(String.class)
public enum GenderEnum {

@XmlEnumValue("male") MALE(String.valueOf("male")), @XmlEnumValue("female") FEMALE(String.valueOf("female")), @XmlEnumValue("unknown") UNKNOWN(String.valueOf("unknown"));


    private String value;

    GenderEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GenderEnum fromValue(String v) {
        for (GenderEnum b : GenderEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Gender of the traveler")
 /**
   * Gender of the traveler
  **/
  private GenderEnum gender = null;

  @ApiModelProperty(value = "List of regulatory details for Advance Passenger Information associated to the traveler. These information are available only when using the operations associated to the cart/order `regulatory-details` sub resource ")
 /**
   * List of regulatory details for Advance Passenger Information associated to the traveler. These information are available only when using the operations associated to the cart/order `regulatory-details` sub resource 
  **/
  private List<RegulatoryApisDetail> regulatoryDetails = null;

  @ApiModelProperty(value = "When flying, if an infant is traveling without a seat, it must be associated to an adult traveler. Id of the adult must be specified in that case")
 /**
   * When flying, if an infant is traveling without a seat, it must be associated to an adult traveler. Id of the adult must be specified in that case
  **/
  private String accompanyingTravelerId = null;

  @ApiModelProperty(value = "When flying, if an infant is traveling without a seat, it must be associated to an adult traveler. Temporary traveler id, e.g. tid, (if id not known) of the adult must be specified in that case")
 /**
   * When flying, if an infant is traveling without a seat, it must be associated to an adult traveler. Temporary traveler id, e.g. tid, (if id not known) of the adult must be specified in that case
  **/
  private String accompanyingTravelerTid = null;

  @ApiModelProperty(value = "Traveler's nationalities expressed as two letter country codes")
 /**
   * Traveler's nationalities expressed as two letter country codes
  **/
  private List<String> nationalityCountryCodes = null;

  @ApiModelProperty(value = "Identifier of customer profile or persona (from market segment) associated to the traveler, used to retrieve his/her inferred and declared travel preferences")
 /**
   * Identifier of customer profile or persona (from market segment) associated to the traveler, used to retrieve his/her inferred and declared travel preferences
  **/
  private String customerProfileId = null;

  @ApiModelProperty(value = "Staff number, present if the traveler is identified as an airline staff member")
 /**
   * Staff number, present if the traveler is identified as an airline staff member
  **/
  private String staffNumber = null;
 /**
   * traveler type (http://api.dev.amadeus.net/api/Development/common/codelist/PNR_PassengerType.htm)
   * @return passengerTypeCode
  **/
  @JsonProperty("passengerTypeCode")
  public String getPassengerTypeCode() {
    return passengerTypeCode;
  }

  public void setPassengerTypeCode(String passengerTypeCode) {
    this.passengerTypeCode = passengerTypeCode;
  }

  public Traveler passengerTypeCode(String passengerTypeCode) {
    this.passengerTypeCode = passengerTypeCode;
    return this;
  }

 /**
   * traveler id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Traveler id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Temporary id used to identify a traveler. can be used to associate an infant to an adult, when the adult id is not known yet. only valid the time of the transaction
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public Traveler tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<Name> getNames() {
    return names;
  }

  public void setNames(List<Name> names) {
    this.names = names;
  }

  public Traveler names(List<Name> names) {
    this.names = names;
    return this;
  }

  public Traveler addNamesItem(Name namesItem) {
    this.names.add(namesItem);
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

  public Traveler dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

 /**
   * Traveler age, in years
   * minimum: 0
   * maximum: 150
   * @return age
  **/
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Traveler age(Integer age) {
    this.age = age;
    return this;
  }

 /**
   * Gender of the traveler
   * @return gender
  **/
  @JsonProperty("gender")
  public String getGender() {
    if (gender == null) {
      return null;
    }
    return gender.value();
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public Traveler gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

 /**
   * List of regulatory details for Advance Passenger Information associated to the traveler. These information are available only when using the operations associated to the cart/order &#x60;regulatory-details&#x60; sub resource 
   * @return regulatoryDetails
  **/
  @JsonProperty("regulatoryDetails")
  public List<RegulatoryApisDetail> getRegulatoryDetails() {
    return regulatoryDetails;
  }

  public void setRegulatoryDetails(List<RegulatoryApisDetail> regulatoryDetails) {
    this.regulatoryDetails = regulatoryDetails;
  }

  public Traveler regulatoryDetails(List<RegulatoryApisDetail> regulatoryDetails) {
    this.regulatoryDetails = regulatoryDetails;
    return this;
  }

  public Traveler addRegulatoryDetailsItem(RegulatoryApisDetail regulatoryDetailsItem) {
    this.regulatoryDetails.add(regulatoryDetailsItem);
    return this;
  }

 /**
   * When flying, if an infant is traveling without a seat, it must be associated to an adult traveler. Id of the adult must be specified in that case
   * @return accompanyingTravelerId
  **/
  @JsonProperty("accompanyingTravelerId")
  public String getAccompanyingTravelerId() {
    return accompanyingTravelerId;
  }

  public void setAccompanyingTravelerId(String accompanyingTravelerId) {
    this.accompanyingTravelerId = accompanyingTravelerId;
  }

  public Traveler accompanyingTravelerId(String accompanyingTravelerId) {
    this.accompanyingTravelerId = accompanyingTravelerId;
    return this;
  }

 /**
   * When flying, if an infant is traveling without a seat, it must be associated to an adult traveler. Temporary traveler id, e.g. tid, (if id not known) of the adult must be specified in that case
   * @return accompanyingTravelerTid
  **/
  @JsonProperty("accompanyingTravelerTid")
  public String getAccompanyingTravelerTid() {
    return accompanyingTravelerTid;
  }

  public void setAccompanyingTravelerTid(String accompanyingTravelerTid) {
    this.accompanyingTravelerTid = accompanyingTravelerTid;
  }

  public Traveler accompanyingTravelerTid(String accompanyingTravelerTid) {
    this.accompanyingTravelerTid = accompanyingTravelerTid;
    return this;
  }

 /**
   * Traveler&#39;s nationalities expressed as two letter country codes
   * @return nationalityCountryCodes
  **/
  @JsonProperty("nationalityCountryCodes")
  public List<String> getNationalityCountryCodes() {
    return nationalityCountryCodes;
  }

  public void setNationalityCountryCodes(List<String> nationalityCountryCodes) {
    this.nationalityCountryCodes = nationalityCountryCodes;
  }

  public Traveler nationalityCountryCodes(List<String> nationalityCountryCodes) {
    this.nationalityCountryCodes = nationalityCountryCodes;
    return this;
  }

  public Traveler addNationalityCountryCodesItem(String nationalityCountryCodesItem) {
    this.nationalityCountryCodes.add(nationalityCountryCodesItem);
    return this;
  }

 /**
   * Identifier of customer profile or persona (from market segment) associated to the traveler, used to retrieve his/her inferred and declared travel preferences
   * @return customerProfileId
  **/
  @JsonProperty("customerProfileId")
  public String getCustomerProfileId() {
    return customerProfileId;
  }

  public void setCustomerProfileId(String customerProfileId) {
    this.customerProfileId = customerProfileId;
  }

  public Traveler customerProfileId(String customerProfileId) {
    this.customerProfileId = customerProfileId;
    return this;
  }

 /**
   * Staff number, present if the traveler is identified as an airline staff member
   * @return staffNumber
  **/
  @JsonProperty("staffNumber")
  public String getStaffNumber() {
    return staffNumber;
  }

  public void setStaffNumber(String staffNumber) {
    this.staffNumber = staffNumber;
  }

  public Traveler staffNumber(String staffNumber) {
    this.staffNumber = staffNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Traveler {\n");
    
    sb.append("    passengerTypeCode: ").append(toIndentedString(passengerTypeCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    regulatoryDetails: ").append(toIndentedString(regulatoryDetails)).append("\n");
    sb.append("    accompanyingTravelerId: ").append(toIndentedString(accompanyingTravelerId)).append("\n");
    sb.append("    accompanyingTravelerTid: ").append(toIndentedString(accompanyingTravelerTid)).append("\n");
    sb.append("    nationalityCountryCodes: ").append(toIndentedString(nationalityCountryCodes)).append("\n");
    sb.append("    customerProfileId: ").append(toIndentedString(customerProfileId)).append("\n");
    sb.append("    staffNumber: ").append(toIndentedString(staffNumber)).append("\n");
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

