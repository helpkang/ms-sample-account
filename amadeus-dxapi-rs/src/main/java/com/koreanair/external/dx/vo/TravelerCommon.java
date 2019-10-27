package com.koreanair.external.dx.vo;

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
  * Individual taking part in a journey. Contains basic information to describe an traveler, whether traveler is anynomous or identified
 **/
@ApiModel(description="Individual taking part in a journey. Contains basic information to describe an traveler, whether traveler is anynomous or identified")
public class TravelerCommon  {
  
  @ApiModelProperty(example = "ADT", required = true, value = "traveler type (http://api.dev.amadeus.net/api/Development/common/codelist/PNR_PassengerType.htm)")
 /**
   * traveler type (http://api.dev.amadeus.net/api/Development/common/codelist/PNR_PassengerType.htm)
  **/
  private String passengerTypeCode = null;
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

  public TravelerCommon passengerTypeCode(String passengerTypeCode) {
    this.passengerTypeCode = passengerTypeCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelerCommon {\n");
    
    sb.append("    passengerTypeCode: ").append(toIndentedString(passengerTypeCode)).append("\n");
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

