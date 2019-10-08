package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.TextWithLanguageType;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckInOutPolicy  {
  
  @ApiModelProperty(value = "Represents the check-in time limit in ISO-8601 format [http://www.w3.org/TR/xmlschema-2/#time]")
 /**
   * Represents the check-in time limit in ISO-8601 format [http://www.w3.org/TR/xmlschema-2/#time]
  **/
  private String checkIn = null;

  @ApiModelProperty(value = "")
  private TextWithLanguageType checkInDescription = null;

  @ApiModelProperty(value = "Represents the check-out time limit in ISO-8601 format [http://www.w3.org/TR/xmlschema-2/#time]")
 /**
   * Represents the check-out time limit in ISO-8601 format [http://www.w3.org/TR/xmlschema-2/#time]
  **/
  private String checkOut = null;

  @ApiModelProperty(value = "")
  private TextWithLanguageType checkOutDescription = null;
 /**
   * Represents the check-in time limit in ISO-8601 format [http://www.w3.org/TR/xmlschema-2/#time]
   * @return checkIn
  **/
  @JsonProperty("checkIn")
  public String getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(String checkIn) {
    this.checkIn = checkIn;
  }

  public CheckInOutPolicy checkIn(String checkIn) {
    this.checkIn = checkIn;
    return this;
  }

 /**
   * Get checkInDescription
   * @return checkInDescription
  **/
  @JsonProperty("checkInDescription")
  public TextWithLanguageType getCheckInDescription() {
    return checkInDescription;
  }

  public void setCheckInDescription(TextWithLanguageType checkInDescription) {
    this.checkInDescription = checkInDescription;
  }

  public CheckInOutPolicy checkInDescription(TextWithLanguageType checkInDescription) {
    this.checkInDescription = checkInDescription;
    return this;
  }

 /**
   * Represents the check-out time limit in ISO-8601 format [http://www.w3.org/TR/xmlschema-2/#time]
   * @return checkOut
  **/
  @JsonProperty("checkOut")
  public String getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(String checkOut) {
    this.checkOut = checkOut;
  }

  public CheckInOutPolicy checkOut(String checkOut) {
    this.checkOut = checkOut;
    return this;
  }

 /**
   * Get checkOutDescription
   * @return checkOutDescription
  **/
  @JsonProperty("checkOutDescription")
  public TextWithLanguageType getCheckOutDescription() {
    return checkOutDescription;
  }

  public void setCheckOutDescription(TextWithLanguageType checkOutDescription) {
    this.checkOutDescription = checkOutDescription;
  }

  public CheckInOutPolicy checkOutDescription(TextWithLanguageType checkOutDescription) {
    this.checkOutDescription = checkOutDescription;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInOutPolicy {\n");
    
    sb.append("    checkIn: ").append(toIndentedString(checkIn)).append("\n");
    sb.append("    checkInDescription: ").append(toIndentedString(checkInDescription)).append("\n");
    sb.append("    checkOut: ").append(toIndentedString(checkOut)).append("\n");
    sb.append("    checkOutDescription: ").append(toIndentedString(checkOutDescription)).append("\n");
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

