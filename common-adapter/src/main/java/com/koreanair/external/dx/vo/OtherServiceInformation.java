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
  * Free text information added to an order and associated to an airline code (OSI)
 **/
@ApiModel(description="Free text information added to an order and associated to an airline code (OSI)")
public class OtherServiceInformation  {
  
  @ApiModelProperty(value = "Identifier of the resource. not read / taken into account when creating a resource")
 /**
   * Identifier of the resource. not read / taken into account when creating a resource
  **/
  private String id = null;

  @ApiModelProperty(value = "Temporary id that can be used to associate requested and returned OSIs. Valid only for the time of the transaction")
 /**
   * Temporary id that can be used to associate requested and returned OSIs. Valid only for the time of the transaction
  **/
  private String tid = null;

  @ApiModelProperty(required = true, value = "Two letter airline code defined for the OSI message. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). You can use YY airline code to associate the OSI to all airlines.")
 /**
   * Two letter airline code defined for the OSI message. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). You can use YY airline code to associate the OSI to all airlines.
  **/
  private String airlineCode = null;

  @ApiModelProperty(required = true, value = "Free-flow text of the OSI")
 /**
   * Free-flow text of the OSI
  **/
  private String freetext = null;

  @ApiModelProperty(value = "A list of travelers associated to this Remark. If not specified, the remark applies to all travelers")
 /**
   * A list of travelers associated to this Remark. If not specified, the remark applies to all travelers
  **/
  private List<String> travelerIds = null;
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

  public OtherServiceInformation id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Temporary id that can be used to associate requested and returned OSIs. Valid only for the time of the transaction
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public OtherServiceInformation tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * Two letter airline code defined for the OSI message. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). You can use YY airline code to associate the OSI to all airlines.
   * @return airlineCode
  **/
  @JsonProperty("airlineCode")
  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public OtherServiceInformation airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }

 /**
   * Free-flow text of the OSI
   * @return freetext
  **/
  @JsonProperty("freetext")
  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public OtherServiceInformation freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

 /**
   * A list of travelers associated to this Remark. If not specified, the remark applies to all travelers
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public OtherServiceInformation travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public OtherServiceInformation addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherServiceInformation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
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
