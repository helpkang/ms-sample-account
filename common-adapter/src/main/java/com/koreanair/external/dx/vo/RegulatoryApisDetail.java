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
  * Object used to manipulate (add, read, update) regulatory details (APIS data). For each operation only one type of `RegulatoryApisDetail` could be used: `regulatoryDocument` or `RegulatoryAddress` To see the structure of the different types of APIS Regulatory details, please see [APIS documentation](http://e-travel.mkt.amadeus.net/dxapi/display/apis.html#!/RegulatoryApisType/get) 
 **/
@ApiModel(description="Object used to manipulate (add, read, update) regulatory details (APIS data). For each operation only one type of `RegulatoryApisDetail` could be used: `regulatoryDocument` or `RegulatoryAddress` To see the structure of the different types of APIS Regulatory details, please see [APIS documentation](http://e-travel.mkt.amadeus.net/dxapi/display/apis.html#!/RegulatoryApisType/get) ")
public class RegulatoryApisDetail  {
  
  @ApiModelProperty(value = "Regulatory request ID")
 /**
   * Regulatory request ID
  **/
  private String id = null;

  @ApiModelProperty(value = "Temporary id that can be used to associate requested and returned regulatory request. It is only valid the time of the transaction.")
 /**
   * Temporary id that can be used to associate requested and returned regulatory request. It is only valid the time of the transaction.
  **/
  private String tid = null;

  @ApiModelProperty(value = "Segment(s) associated to this regulatory request. If not provided, the request applies to all the segments of the itinerary")
 /**
   * Segment(s) associated to this regulatory request. If not provided, the request applies to all the segments of the itinerary
  **/
  private List<String> flightIds = null;


@XmlType(name="RegulatoryApisTypeEnum")
@XmlEnum(String.class)
public enum RegulatoryApisTypeEnum {

@XmlEnumValue("ApisDetailRegulatoryDocument") APISDETAILREGULATORYDOCUMENT(String.valueOf("ApisDetailRegulatoryDocument")), @XmlEnumValue("ApisDetailAddress") APISDETAILADDRESS(String.valueOf("ApisDetailAddress")), @XmlEnumValue("ApisDetailFromReference") APISDETAILFROMREFERENCE(String.valueOf("ApisDetailFromReference"));


    private String value;

    RegulatoryApisTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RegulatoryApisTypeEnum fromValue(String v) {
        for (RegulatoryApisTypeEnum b : RegulatoryApisTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "type of APIS regulatory detail. To see the structure of the different types of APIS type, please see [APIS documentation](http://e-travel.mkt.amadeus.net/dxapi/display/apis.html#!/RegulatoryApisType/get)")
 /**
   * type of APIS regulatory detail. To see the structure of the different types of APIS type, please see [APIS documentation](http://e-travel.mkt.amadeus.net/dxapi/display/apis.html#!/RegulatoryApisType/get)
  **/
  private RegulatoryApisTypeEnum regulatoryApisType = null;
 /**
   * Regulatory request ID
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RegulatoryApisDetail id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Temporary id that can be used to associate requested and returned regulatory request. It is only valid the time of the transaction.
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public RegulatoryApisDetail tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * Segment(s) associated to this regulatory request. If not provided, the request applies to all the segments of the itinerary
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public RegulatoryApisDetail flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public RegulatoryApisDetail addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }

 /**
   * type of APIS regulatory detail. To see the structure of the different types of APIS type, please see [APIS documentation](http://e-travel.mkt.amadeus.net/dxapi/display/apis.html#!/RegulatoryApisType/get)
   * @return regulatoryApisType
  **/
  @JsonProperty("regulatoryApisType")
  public String getRegulatoryApisType() {
    if (regulatoryApisType == null) {
      return null;
    }
    return regulatoryApisType.value();
  }

  public void setRegulatoryApisType(RegulatoryApisTypeEnum regulatoryApisType) {
    this.regulatoryApisType = regulatoryApisType;
  }

  public RegulatoryApisDetail regulatoryApisType(RegulatoryApisTypeEnum regulatoryApisType) {
    this.regulatoryApisType = regulatoryApisType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryApisDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
    sb.append("    regulatoryApisType: ").append(toIndentedString(regulatoryApisType)).append("\n");
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

