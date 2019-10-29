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
  * Indicates if the travel solution has a specific status.
 **/
@ApiModel(description="Indicates if the travel solution has a specific status.")
public class Status  {
  

@XmlType(name="ValueEnum")
@XmlEnum(String.class)
public enum ValueEnum {

@XmlEnumValue("soldOut") SOLDOUT(String.valueOf("soldOut")), @XmlEnumValue("unavailable") UNAVAILABLE(String.valueOf("unavailable"));


    private String value;

    ValueEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ValueEnum fromValue(String v) {
        for (ValueEnum b : ValueEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Indicates travel solution status. If soldOut is highlighted it means that the travel solution can't be booked and shown only for illustration purposes.")
 /**
   * Indicates travel solution status. If soldOut is highlighted it means that the travel solution can't be booked and shown only for illustration purposes.
  **/
  private ValueEnum value = null;


@XmlType(name="UnavailabilityReasonCodesEnum")
@XmlEnum(String.class)
public enum UnavailabilityReasonCodesEnum {

@XmlEnumValue("noFlights") NOFLIGHTS(String.valueOf("noFlights")), @XmlEnumValue("noFares") NOFARES(String.valueOf("noFares")), @XmlEnumValue("soldOut") SOLDOUT(String.valueOf("soldOut")), @XmlEnumValue("dateCrossover") DATECROSSOVER(String.valueOf("dateCrossover")), @XmlEnumValue("timeCrossover") TIMECROSSOVER(String.valueOf("timeCrossover"));


    private String value;

    UnavailabilityReasonCodesEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UnavailabilityReasonCodesEnum fromValue(String v) {
        for (UnavailabilityReasonCodesEnum b : UnavailabilityReasonCodesEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Displayed only in case of Calendar request when the entry status is 'unavailable'. Highlights detailed reasons of the unavailability.")
 /**
   * Displayed only in case of Calendar request when the entry status is 'unavailable'. Highlights detailed reasons of the unavailability.
  **/
  private List<UnavailabilityReasonCodesEnum> unavailabilityReasonCodes = null;
 /**
   * Indicates travel solution status. If soldOut is highlighted it means that the travel solution can&#39;t be booked and shown only for illustration purposes.
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    if (value == null) {
      return null;
    }
    return value.value();
  }

  public void setValue(ValueEnum value) {
    this.value = value;
  }

  public Status value(ValueEnum value) {
    this.value = value;
    return this;
  }

 /**
   * Displayed only in case of Calendar request when the entry status is &#39;unavailable&#39;. Highlights detailed reasons of the unavailability.
   * @return unavailabilityReasonCodes
  **/
  @JsonProperty("unavailabilityReasonCodes")
  public List<UnavailabilityReasonCodesEnum> getUnavailabilityReasonCodes() {
    return unavailabilityReasonCodes;
  }

  public void setUnavailabilityReasonCodes(List<UnavailabilityReasonCodesEnum> unavailabilityReasonCodes) {
    this.unavailabilityReasonCodes = unavailabilityReasonCodes;
  }

  public Status unavailabilityReasonCodes(List<UnavailabilityReasonCodesEnum> unavailabilityReasonCodes) {
    this.unavailabilityReasonCodes = unavailabilityReasonCodes;
    return this;
  }

  public Status addUnavailabilityReasonCodesItem(UnavailabilityReasonCodesEnum unavailabilityReasonCodesItem) {
    this.unavailabilityReasonCodes.add(unavailabilityReasonCodesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unavailabilityReasonCodes: ").append(toIndentedString(unavailabilityReasonCodes)).append("\n");
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

