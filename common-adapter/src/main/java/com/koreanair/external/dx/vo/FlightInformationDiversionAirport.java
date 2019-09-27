package com.koreanair.external.dx.vo;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightInformationDiversionAirport  {
  
  @ApiModelProperty(value = "Initial Airport from where the diversion occured.")
 /**
   * Initial Airport from where the diversion occured.
  **/
  private String fromAirport = null;

  @ApiModelProperty(value = "Aircraft continues at this Airport")
 /**
   * Aircraft continues at this Airport
  **/
  private String toAirport = null;
 /**
   * Initial Airport from where the diversion occured.
   * @return fromAirport
  **/
  @JsonProperty("fromAirport")
  public String getFromAirport() {
    return fromAirport;
  }

  public void setFromAirport(String fromAirport) {
    this.fromAirport = fromAirport;
  }

  public FlightInformationDiversionAirport fromAirport(String fromAirport) {
    this.fromAirport = fromAirport;
    return this;
  }

 /**
   * Aircraft continues at this Airport
   * @return toAirport
  **/
  @JsonProperty("toAirport")
  public String getToAirport() {
    return toAirport;
  }

  public void setToAirport(String toAirport) {
    this.toAirport = toAirport;
  }

  public FlightInformationDiversionAirport toAirport(String toAirport) {
    this.toAirport = toAirport;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightInformationDiversionAirport {\n");
    
    sb.append("    fromAirport: ").append(toIndentedString(fromAirport)).append("\n");
    sb.append("    toAirport: ").append(toIndentedString(toAirport)).append("\n");
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

