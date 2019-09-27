package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FareInfoTravelDocument;
import com.koreanair.external.dx.vo.ItemsAssociation;
import com.koreanair.external.dx.vo.PaymentTransaction;
import com.koreanair.external.dx.vo.Price;
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
  * Travel documents generated at issuance time.
 **/
@ApiModel(description="Travel documents generated at issuance time.")
public class TravelDocument  {
  
  @ApiModelProperty(value = "Flight ids the element is associated with")
 /**
   * Flight ids the element is associated with
  **/
  private List<String> flightIds = null;

  @ApiModelProperty(value = "Service ids the element is associated with")
 /**
   * Service ids the element is associated with
  **/
  private List<String> serviceIds = null;

  @ApiModelProperty(value = "Traveler ids the element is associated with")
 /**
   * Traveler ids the element is associated with
  **/
  private List<String> travelerIds = null;

  @ApiModelProperty(value = "Temporary traveler ids the element is associated with")
 /**
   * Temporary traveler ids the element is associated with
  **/
  private List<String> travelerTIds = null;

  @ApiModelProperty(required = true, value = "Travel Document number (e.g. 220-1638074788)")
 /**
   * Travel Document number (e.g. 220-1638074788)
  **/
  private String id = null;


@XmlType(name="DocumentTypeEnum")
@XmlEnum(String.class)
public enum DocumentTypeEnum {

@XmlEnumValue("eticket") ETICKET(String.valueOf("eticket")), @XmlEnumValue("services") SERVICES(String.valueOf("services"));


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

  @ApiModelProperty(value = "It specifies if the document is the record generated when confirming flights (documentType =  eticket), or is used for for travel related services, such as excess baggage charges, miscellaneous charges, penalty fees, residual value, lounge access charges, etc.. (documentType =  service) ")
 /**
   * It specifies if the document is the record generated when confirming flights (documentType =  eticket), or is used for for travel related services, such as excess baggage charges, miscellaneous charges, penalty fees, residual value, lounge access charges, etc.. (documentType =  service) 
  **/
  private DocumentTypeEnum documentType = null;

  @ApiModelProperty(value = "Provides the price information stored in the travel document. Due to an internal limitation, the prices related to \"fees\" are not available at travel document level, so the amount in \"totalAmount\" field will not include the amount paid for the fees. ")
 /**
   * Provides the price information stored in the travel document. Due to an internal limitation, the prices related to \"fees\" are not available at travel document level, so the amount in \"totalAmount\" field will not include the amount paid for the fees. 
  **/
  private Price price = null;

  @ApiModelProperty(value = "")
  private List<PaymentTransaction> paymentTransactions = null;

  @ApiModelProperty(value = "")
  private List<FareInfoTravelDocument> fareInfos = null;
 /**
   * Flight ids the element is associated with
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public TravelDocument flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public TravelDocument addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }

 /**
   * Service ids the element is associated with
   * @return serviceIds
  **/
  @JsonProperty("serviceIds")
  public List<String> getServiceIds() {
    return serviceIds;
  }

  public void setServiceIds(List<String> serviceIds) {
    this.serviceIds = serviceIds;
  }

  public TravelDocument serviceIds(List<String> serviceIds) {
    this.serviceIds = serviceIds;
    return this;
  }

  public TravelDocument addServiceIdsItem(String serviceIdsItem) {
    this.serviceIds.add(serviceIdsItem);
    return this;
  }

 /**
   * Traveler ids the element is associated with
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public TravelDocument travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public TravelDocument addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * Temporary traveler ids the element is associated with
   * @return travelerTIds
  **/
  @JsonProperty("travelerTIds")
  public List<String> getTravelerTIds() {
    return travelerTIds;
  }

  public void setTravelerTIds(List<String> travelerTIds) {
    this.travelerTIds = travelerTIds;
  }

  public TravelDocument travelerTIds(List<String> travelerTIds) {
    this.travelerTIds = travelerTIds;
    return this;
  }

  public TravelDocument addTravelerTIdsItem(String travelerTIdsItem) {
    this.travelerTIds.add(travelerTIdsItem);
    return this;
  }

 /**
   * Travel Document number (e.g. 220-1638074788)
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TravelDocument id(String id) {
    this.id = id;
    return this;
  }

 /**
   * It specifies if the document is the record generated when confirming flights (documentType &#x3D;  eticket), or is used for for travel related services, such as excess baggage charges, miscellaneous charges, penalty fees, residual value, lounge access charges, etc.. (documentType &#x3D;  service) 
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

  public TravelDocument documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

 /**
   * Provides the price information stored in the travel document. Due to an internal limitation, the prices related to \&quot;fees\&quot; are not available at travel document level, so the amount in \&quot;totalAmount\&quot; field will not include the amount paid for the fees. 
   * @return price
  **/
  @JsonProperty("price")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public TravelDocument price(Price price) {
    this.price = price;
    return this;
  }

 /**
   * Get paymentTransactions
   * @return paymentTransactions
  **/
  @JsonProperty("paymentTransactions")
  public List<PaymentTransaction> getPaymentTransactions() {
    return paymentTransactions;
  }

  public void setPaymentTransactions(List<PaymentTransaction> paymentTransactions) {
    this.paymentTransactions = paymentTransactions;
  }

  public TravelDocument paymentTransactions(List<PaymentTransaction> paymentTransactions) {
    this.paymentTransactions = paymentTransactions;
    return this;
  }

  public TravelDocument addPaymentTransactionsItem(PaymentTransaction paymentTransactionsItem) {
    this.paymentTransactions.add(paymentTransactionsItem);
    return this;
  }

 /**
   * Get fareInfos
   * @return fareInfos
  **/
  @JsonProperty("fareInfos")
  public List<FareInfoTravelDocument> getFareInfos() {
    return fareInfos;
  }

  public void setFareInfos(List<FareInfoTravelDocument> fareInfos) {
    this.fareInfos = fareInfos;
  }

  public TravelDocument fareInfos(List<FareInfoTravelDocument> fareInfos) {
    this.fareInfos = fareInfos;
    return this;
  }

  public TravelDocument addFareInfosItem(FareInfoTravelDocument fareInfosItem) {
    this.fareInfos.add(fareInfosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelDocument {\n");
    
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
    sb.append("    serviceIds: ").append(toIndentedString(serviceIds)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
    sb.append("    travelerTIds: ").append(toIndentedString(travelerTIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    paymentTransactions: ").append(toIndentedString(paymentTransactions)).append("\n");
    sb.append("    fareInfos: ").append(toIndentedString(fareInfos)).append("\n");
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

