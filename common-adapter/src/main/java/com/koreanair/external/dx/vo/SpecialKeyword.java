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
  * Special keyword added to an order and associated to an airline code (SK). The airline has to previously configure those keywords in their reservation system.
 **/
@ApiModel(description="Special keyword added to an order and associated to an airline code (SK). The airline has to previously configure those keywords in their reservation system.")
public class SpecialKeyword  {
  
  @ApiModelProperty(value = "Identifier of the resource. not read / taken into account when creating a resource")
 /**
   * Identifier of the resource. not read / taken into account when creating a resource
  **/
  private String id = null;

  @ApiModelProperty(value = "Temporary id that can be used to associate requested and returned keyword. Valid only for the time of the transaction")
 /**
   * Temporary id that can be used to associate requested and returned keyword. Valid only for the time of the transaction
  **/
  private String tid = null;

  @ApiModelProperty(required = true, value = "Keyword defined by the airline")
 /**
   * Keyword defined by the airline
  **/
  private String keyword = null;

  @ApiModelProperty(required = true, value = "Two letter airline code defined for the OSI message. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). For a codeshare segment that has been merged into a single element, this can be the marketing or the operating airline code")
 /**
   * Two letter airline code defined for the OSI message. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). For a codeshare segment that has been merged into a single element, this can be the marketing or the operating airline code
  **/
  private String airlineCode = null;

  @ApiModelProperty(value = "HK status code (mandatory if the number in party is required by the airline)")
 /**
   * HK status code (mandatory if the number in party is required by the airline)
  **/
  private String statusCode = null;

  @ApiModelProperty(value = "Desired quantity of the special keyword (also called Number In Party)")
 /**
   * Desired quantity of the special keyword (also called Number In Party)
  **/
  private Integer quantity = null;

  @ApiModelProperty(value = "Free-flow text sent in the Special Keyword (SK) in the order (optional if allowed by the airline on their reservation system). The maximum length for the free text information will be stored in the Keyword table. However, it is recommended that the free text does not exceed 53 characters as OSI TTY transmission cannot exceed 64 characters in total")
 /**
   * Free-flow text sent in the Special Keyword (SK) in the order (optional if allowed by the airline on their reservation system). The maximum length for the free text information will be stored in the Keyword table. However, it is recommended that the free text does not exceed 53 characters as OSI TTY transmission cannot exceed 64 characters in total
  **/
  private String freetext = null;

  @ApiModelProperty(value = "A list of travelers associated to this special keyword. If not specified, the special keyword applies to all travelers")
 /**
   * A list of travelers associated to this special keyword. If not specified, the special keyword applies to all travelers
  **/
  private List<String> travelerIds = null;

  @ApiModelProperty(value = "A list of flights associated to this special keyword. If not specified, the special keyword applies to all flights")
 /**
   * A list of flights associated to this special keyword. If not specified, the special keyword applies to all flights
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

  public SpecialKeyword id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Temporary id that can be used to associate requested and returned keyword. Valid only for the time of the transaction
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public SpecialKeyword tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * Keyword defined by the airline
   * @return keyword
  **/
  @JsonProperty("keyword")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public SpecialKeyword keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

 /**
   * Two letter airline code defined for the OSI message. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). For a codeshare segment that has been merged into a single element, this can be the marketing or the operating airline code
   * @return airlineCode
  **/
  @JsonProperty("airlineCode")
  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public SpecialKeyword airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }

 /**
   * HK status code (mandatory if the number in party is required by the airline)
   * @return statusCode
  **/
  @JsonProperty("statusCode")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public SpecialKeyword statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

 /**
   * Desired quantity of the special keyword (also called Number In Party)
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public SpecialKeyword quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * Free-flow text sent in the Special Keyword (SK) in the order (optional if allowed by the airline on their reservation system). The maximum length for the free text information will be stored in the Keyword table. However, it is recommended that the free text does not exceed 53 characters as OSI TTY transmission cannot exceed 64 characters in total
   * @return freetext
  **/
  @JsonProperty("freetext")
  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public SpecialKeyword freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

 /**
   * A list of travelers associated to this special keyword. If not specified, the special keyword applies to all travelers
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public SpecialKeyword travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public SpecialKeyword addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * A list of flights associated to this special keyword. If not specified, the special keyword applies to all flights
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public SpecialKeyword flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public SpecialKeyword addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialKeyword {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

