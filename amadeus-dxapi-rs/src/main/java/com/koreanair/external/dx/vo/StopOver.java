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
  * The stop over can be done either in outbound and/or inbound flight in case of a round trip
 **/
@ApiModel(description="The stop over can be done either in outbound and/or inbound flight in case of a round trip")
public class StopOver  {
  
  @ApiModelProperty(value = "List of stop over locations. If more than one stop over is provided, search result contains alternatives for each stop over. Only one stop over can be done per flight. E.g. For a Nice (NCE) - New-york (JFK) and two stop overs London (LHR) Paris (CDG), offers for NCE-LHR-JFK or NCE-PAR-JFK are provided. ")
 /**
   * List of stop over locations. If more than one stop over is provided, search result contains alternatives for each stop over. Only one stop over can be done per flight. E.g. For a Nice (NCE) - New-york (JFK) and two stop overs London (LHR) Paris (CDG), offers for NCE-LHR-JFK or NCE-PAR-JFK are provided. 
  **/
  private List<String> locationCodes = null;

  @ApiModelProperty(example = "2", value = "Number of nights involved in the stop-over")
 /**
   * Number of nights involved in the stop-over
  **/
  private Integer stayDuration = null;
 /**
   * List of stop over locations. If more than one stop over is provided, search result contains alternatives for each stop over. Only one stop over can be done per flight. E.g. For a Nice (NCE) - New-york (JFK) and two stop overs London (LHR) Paris (CDG), offers for NCE-LHR-JFK or NCE-PAR-JFK are provided. 
   * @return locationCodes
  **/
  @JsonProperty("locationCodes")
  public List<String> getLocationCodes() {
    return locationCodes;
  }

  public void setLocationCodes(List<String> locationCodes) {
    this.locationCodes = locationCodes;
  }

  public StopOver locationCodes(List<String> locationCodes) {
    this.locationCodes = locationCodes;
    return this;
  }

  public StopOver addLocationCodesItem(String locationCodesItem) {
    this.locationCodes.add(locationCodesItem);
    return this;
  }

 /**
   * Number of nights involved in the stop-over
   * minimum: 1
   * maximum: 8
   * @return stayDuration
  **/
  @JsonProperty("stayDuration")
  public Integer getStayDuration() {
    return stayDuration;
  }

  public void setStayDuration(Integer stayDuration) {
    this.stayDuration = stayDuration;
  }

  public StopOver stayDuration(Integer stayDuration) {
    this.stayDuration = stayDuration;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopOver {\n");
    
    sb.append("    locationCodes: ").append(toIndentedString(locationCodes)).append("\n");
    sb.append("    stayDuration: ").append(toIndentedString(stayDuration)).append("\n");
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

