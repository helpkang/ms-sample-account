package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;
import java.time.LocalDateTime;

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
  * Boarding pass data related to the traveler's baggages. Information is regarding the checked baggages, those put in the hold of the plane. 
 **/
@ApiModel(description="Boarding pass data related to the traveler's baggages. Information is regarding the checked baggages, those put in the hold of the plane. ")
public class BoardingPassBaggage  {
  
  @ApiModelProperty(value = "Number of checked baggages allowed on the plane")
 /**
   * Number of checked baggages allowed on the plane
  **/
  private Integer allowance = null;

  @ApiModelProperty(example = "2018-02-10T20:40:00+02:00", value = "Closing date and time to drop a checked baggage Local date and time with the following format \\\"yyyy-MM-dd'T'HH:mm:ssZ\\\" (e.g. 2018-02-10T20:40:00+02:00)\" ")
 /**
   * Closing date and time to drop a checked baggage Local date and time with the following format \\\"yyyy-MM-dd'T'HH:mm:ssZ\\\" (e.g. 2018-02-10T20:40:00+02:00)\" 
  **/
  private LocalDateTime baggageDropClosingDateTime = null;
 /**
   * Number of checked baggages allowed on the plane
   * minimum: 0
   * @return allowance
  **/
  @JsonProperty("allowance")
  public Integer getAllowance() {
    return allowance;
  }

  public void setAllowance(Integer allowance) {
    this.allowance = allowance;
  }

  public BoardingPassBaggage allowance(Integer allowance) {
    this.allowance = allowance;
    return this;
  }

 /**
   * Closing date and time to drop a checked baggage Local date and time with the following format \\\&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\\\&quot; (e.g. 2018-02-10T20:40:00+02:00)\&quot; 
   * @return baggageDropClosingDateTime
  **/
  @JsonProperty("baggageDropClosingDateTime")
  public LocalDateTime getBaggageDropClosingDateTime() {
    return baggageDropClosingDateTime;
  }

  public void setBaggageDropClosingDateTime(LocalDateTime baggageDropClosingDateTime) {
    this.baggageDropClosingDateTime = baggageDropClosingDateTime;
  }

  public BoardingPassBaggage baggageDropClosingDateTime(LocalDateTime baggageDropClosingDateTime) {
    this.baggageDropClosingDateTime = baggageDropClosingDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardingPassBaggage {\n");
    
    sb.append("    allowance: ").append(toIndentedString(allowance)).append("\n");
    sb.append("    baggageDropClosingDateTime: ").append(toIndentedString(baggageDropClosingDateTime)).append("\n");
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

