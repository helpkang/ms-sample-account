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
  * Special Service Request (SSR) for an order
 **/
@ApiModel(description="Special Service Request (SSR) for an order")
public class SpecialServiceRequest  {
  
  @ApiModelProperty(value = "Identifier of the resource. not read / taken into account when creating a resource")
 /**
   * Identifier of the resource. not read / taken into account when creating a resource
  **/
  private String id = null;

  @ApiModelProperty(value = "Temporary id that can be used to associate requested and returned service requests. Valid only for the time of the transaction")
 /**
   * Temporary id that can be used to associate requested and returned service requests. Valid only for the time of the transaction
  **/
  private String tid = null;

  @ApiModelProperty(required = true, value = "Code of the Special Service Request")
 /**
   * Code of the Special Service Request
  **/
  private String code = null;

  @ApiModelProperty(value = "Two letter airline code defined for the Special Service Request (SSR) message. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). Airline on which the Special Service Request applies. If not specified, the Special Service Request applies to all flights.")
 /**
   * Two letter airline code defined for the Special Service Request (SSR) message. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). Airline on which the Special Service Request applies. If not specified, the Special Service Request applies to all flights.
  **/
  private String airlineCode = null;

  @ApiModelProperty(value = "Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken. Status code is not returned at shopping time. For the Special Service Request creation, the status HK, SS and NN are supported.")
 /**
   * Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken. Status code is not returned at shopping time. For the Special Service Request creation, the status HK, SS and NN are supported.
  **/
  private String statusCode = null;

  @ApiModelProperty(value = "Desired quantity of the Special Service Request (also called Number In Party)")
 /**
   * Desired quantity of the Special Service Request (also called Number In Party)
  **/
  private Integer quantity = null;

  @ApiModelProperty(value = "Used for frequent flyer SSR only. In case of SSR for: mileage accrual (FQTV) recognition (FQTS) redemption (FQTR) upgrade (FQTU or FQTO) This flag is indicating if the card has been validated against the Amadeus profile database. ")
 /**
   * Used for frequent flyer SSR only. In case of SSR for: mileage accrual (FQTV) recognition (FQTS) redemption (FQTR) upgrade (FQTU or FQTO) This flag is indicating if the card has been validated against the Amadeus profile database. 
  **/
  private Boolean isVerified = null;

  @ApiModelProperty(value = "Free-flow text for the Special Service Request in the order (optional if allowed by the airline on their reservation system)")
 /**
   * Free-flow text for the Special Service Request in the order (optional if allowed by the airline on their reservation system)
  **/
  private String freetext = null;

  @ApiModelProperty(value = "A list of travelers associated to this generic service. If not specified, the generic service applies to all travelers")
 /**
   * A list of travelers associated to this generic service. If not specified, the generic service applies to all travelers
  **/
  private List<String> travelerIds = null;

  @ApiModelProperty(value = "A list of flights associated to this generic service. If not specified, the generic service applies to all flights")
 /**
   * A list of flights associated to this generic service. If not specified, the generic service applies to all flights
  **/
  private List<String> flightIds = null;
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

  public SpecialServiceRequest id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Temporary id that can be used to associate requested and returned service requests. Valid only for the time of the transaction
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public SpecialServiceRequest tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * Code of the Special Service Request
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SpecialServiceRequest code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Two letter airline code defined for the Special Service Request (SSR) message. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). Airline on which the Special Service Request applies. If not specified, the Special Service Request applies to all flights.
   * @return airlineCode
  **/
  @JsonProperty("airlineCode")
  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public SpecialServiceRequest airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }

 /**
   * Operational status. HK &#x3D; confirmed, HL &#x3D; waitlist, TK &#x3D; schedule change confirmed, schedule change waitlist, UN &#x3D; unable to confirm not operating, UC &#x3D; unable to confirm, HX &#x3D; have cancelled, NO &#x3D; no action taken. Status code is not returned at shopping time. For the Special Service Request creation, the status HK, SS and NN are supported.
   * @return statusCode
  **/
  @JsonProperty("statusCode")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public SpecialServiceRequest statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

 /**
   * Desired quantity of the Special Service Request (also called Number In Party)
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public SpecialServiceRequest quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * Used for frequent flyer SSR only. In case of SSR for: mileage accrual (FQTV) recognition (FQTS) redemption (FQTR) upgrade (FQTU or FQTO) This flag is indicating if the card has been validated against the Amadeus profile database. 
   * @return isVerified
  **/
  @JsonProperty("isVerified")
  public Boolean isIsVerified() {
    return isVerified;
  }

  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }

  public SpecialServiceRequest isVerified(Boolean isVerified) {
    this.isVerified = isVerified;
    return this;
  }

 /**
   * Free-flow text for the Special Service Request in the order (optional if allowed by the airline on their reservation system)
   * @return freetext
  **/
  @JsonProperty("freetext")
  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public SpecialServiceRequest freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

 /**
   * A list of travelers associated to this generic service. If not specified, the generic service applies to all travelers
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public SpecialServiceRequest travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public SpecialServiceRequest addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * A list of flights associated to this generic service. If not specified, the generic service applies to all flights
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public SpecialServiceRequest flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public SpecialServiceRequest addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialServiceRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
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

