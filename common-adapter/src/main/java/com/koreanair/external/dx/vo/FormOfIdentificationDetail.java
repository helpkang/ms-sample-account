package com.koreanair.external.dx.vo;

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
  * Object used to manipulate (add, read, update) the form of identification details (FOID). For each operation only one type of data could be used according the document type, either a regulatory document, or a frequent flyer card, or a payment card or a ticket or confirmation number. To see the structure of the different types of identification, please see [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get) 
 **/
@ApiModel(description="Object used to manipulate (add, read, update) the form of identification details (FOID). For each operation only one type of data could be used according the document type, either a regulatory document, or a frequent flyer card, or a payment card or a ticket or confirmation number. To see the structure of the different types of identification, please see [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get) ")
public class FormOfIdentificationDetail  {
  
  @ApiModelProperty(value = "Form of identification request id, used only in output after the request creation.")
 /**
   * Form of identification request id, used only in output after the request creation.
  **/
  private String id = null;

  @ApiModelProperty(value = "Temporary id that can be used to associate requested and returned services. It is only valid the time of the transaction.")
 /**
   * Temporary id that can be used to associate requested and returned services. It is only valid the time of the transaction.
  **/
  private String tid = null;

  @ApiModelProperty(value = "Two letter airline code defined for the FOID message. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). You can use YY airline code to associate the FOID to all airlines.")
 /**
   * Two letter airline code defined for the FOID message. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). You can use YY airline code to associate the FOID to all airlines.
  **/
  private String airlineCode = null;

  @ApiModelProperty(required = true, value = "Traveler(s) associated to this FOID(Form of identification). At least one traveler identifier is associated to the FOID.")
 /**
   * Traveler(s) associated to this FOID(Form of identification). At least one traveler identifier is associated to the FOID.
  **/
  private List<String> travelerIds = new ArrayList<>();


@XmlType(name="IdentificationTypeEnum")
@XmlEnum(String.class)
public enum IdentificationTypeEnum {

@XmlEnumValue("IdentificationRegulatoryDocuments") IDENTIFICATIONREGULATORYDOCUMENTS(String.valueOf("IdentificationRegulatoryDocuments")), @XmlEnumValue("IdentificationFrequentFlyerCard") IDENTIFICATIONFREQUENTFLYERCARD(String.valueOf("IdentificationFrequentFlyerCard")), @XmlEnumValue("IdentificationPaymentCard") IDENTIFICATIONPAYMENTCARD(String.valueOf("IdentificationPaymentCard")), @XmlEnumValue("IdentificationTicketNumber") IDENTIFICATIONTICKETNUMBER(String.valueOf("IdentificationTicketNumber")), @XmlEnumValue("IdentificationConfirmationNumber") IDENTIFICATIONCONFIRMATIONNUMBER(String.valueOf("IdentificationConfirmationNumber")), @XmlEnumValue("IdentificationFromReference") IDENTIFICATIONFROMREFERENCE(String.valueOf("IdentificationFromReference"));


    private String value;

    IdentificationTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IdentificationTypeEnum fromValue(String v) {
        for (IdentificationTypeEnum b : IdentificationTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "type of form of identification. To see the structure of the different types of identification, please see [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get) Paymentcard identification is not allowed to be added to cart due to security reasons.")
 /**
   * type of form of identification. To see the structure of the different types of identification, please see [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get) Paymentcard identification is not allowed to be added to cart due to security reasons.
  **/
  private IdentificationTypeEnum identificationType = null;
 /**
   * Form of identification request id, used only in output after the request creation.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FormOfIdentificationDetail id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Temporary id that can be used to associate requested and returned services. It is only valid the time of the transaction.
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public FormOfIdentificationDetail tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * Two letter airline code defined for the FOID message. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). You can use YY airline code to associate the FOID to all airlines.
   * @return airlineCode
  **/
  @JsonProperty("airlineCode")
  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public FormOfIdentificationDetail airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }

 /**
   * Traveler(s) associated to this FOID(Form of identification). At least one traveler identifier is associated to the FOID.
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public FormOfIdentificationDetail travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public FormOfIdentificationDetail addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * type of form of identification. To see the structure of the different types of identification, please see [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get) Paymentcard identification is not allowed to be added to cart due to security reasons.
   * @return identificationType
  **/
  @JsonProperty("identificationType")
  public String getIdentificationType() {
    if (identificationType == null) {
      return null;
    }
    return identificationType.value();
  }

  public void setIdentificationType(IdentificationTypeEnum identificationType) {
    this.identificationType = identificationType;
  }

  public FormOfIdentificationDetail identificationType(IdentificationTypeEnum identificationType) {
    this.identificationType = identificationType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormOfIdentificationDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
    sb.append("    identificationType: ").append(toIndentedString(identificationType)).append("\n");
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

