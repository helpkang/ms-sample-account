package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Remark;
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
  * Free text information that can be added to an order (RX). All the offices which belong to the Corporate code as the DAPI office and has EOS agreement with the creator office will have access to the Remark. 
 **/
@ApiModel(description="Free text information that can be added to an order (RX). All the offices which belong to the Corporate code as the DAPI office and has EOS agreement with the creator office will have access to the Remark. ")
public class CorporateRemark extends Remark {
  
  @ApiModelProperty(required = true, value = "Free text of the remark")
 /**
   * Free text of the remark
  **/
  private String freetext = null;

  @ApiModelProperty(value = "A list of flights associated to this Remark. If not specified, the remark applies to all flights")
 /**
   * A list of flights associated to this Remark. If not specified, the remark applies to all flights
  **/
  private List<String> flightIds = null;
 /**
   * Free text of the remark
   * @return freetext
  **/
  @JsonProperty("freetext")
  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public CorporateRemark freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

 /**
   * A list of flights associated to this Remark. If not specified, the remark applies to all flights
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public CorporateRemark flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public CorporateRemark addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateRemark {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
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

