package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FlightBase;
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
  * Reply containing a list of flight details and schedule
 **/
@ApiModel(description="Reply containing a list of flight details and schedule")
public class FlightTimetableData  {
  
  @ApiModelProperty(value = "")
  private FlightBase flight = null;

  @ApiModelProperty(value = "Number of stops for the flight")
 /**
   * Number of stops for the flight
  **/
  private Integer numberOfStops = null;


@XmlType(name="OperatingDaysEnum")
@XmlEnum(String.class)
public enum OperatingDaysEnum {

@XmlEnumValue("monday") MONDAY(String.valueOf("monday")), @XmlEnumValue("tuesday") TUESDAY(String.valueOf("tuesday")), @XmlEnumValue("wednesday") WEDNESDAY(String.valueOf("wednesday")), @XmlEnumValue("thursday") THURSDAY(String.valueOf("thursday")), @XmlEnumValue("friday") FRIDAY(String.valueOf("friday")), @XmlEnumValue("saturday") SATURDAY(String.valueOf("saturday")), @XmlEnumValue("sunday") SUNDAY(String.valueOf("sunday"));


    private String value;

    OperatingDaysEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OperatingDaysEnum fromValue(String v) {
        for (OperatingDaysEnum b : OperatingDaysEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "List of the day the flight operates in the week corresponding to the date provided")
 /**
   * List of the day the flight operates in the week corresponding to the date provided
  **/
  private List<OperatingDaysEnum> operatingDays = null;
 /**
   * Get flight
   * @return flight
  **/
  @JsonProperty("flight")
  public FlightBase getFlight() {
    return flight;
  }

  public void setFlight(FlightBase flight) {
    this.flight = flight;
  }

  public FlightTimetableData flight(FlightBase flight) {
    this.flight = flight;
    return this;
  }

 /**
   * Number of stops for the flight
   * @return numberOfStops
  **/
  @JsonProperty("numberOfStops")
  public Integer getNumberOfStops() {
    return numberOfStops;
  }

  public void setNumberOfStops(Integer numberOfStops) {
    this.numberOfStops = numberOfStops;
  }

  public FlightTimetableData numberOfStops(Integer numberOfStops) {
    this.numberOfStops = numberOfStops;
    return this;
  }

 /**
   * List of the day the flight operates in the week corresponding to the date provided
   * @return operatingDays
  **/
  @JsonProperty("operatingDays")
  public List<OperatingDaysEnum> getOperatingDays() {
    return operatingDays;
  }

  public void setOperatingDays(List<OperatingDaysEnum> operatingDays) {
    this.operatingDays = operatingDays;
  }

  public FlightTimetableData operatingDays(List<OperatingDaysEnum> operatingDays) {
    this.operatingDays = operatingDays;
    return this;
  }

  public FlightTimetableData addOperatingDaysItem(OperatingDaysEnum operatingDaysItem) {
    this.operatingDays.add(operatingDaysItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightTimetableData {\n");
    
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
    sb.append("    numberOfStops: ").append(toIndentedString(numberOfStops)).append("\n");
    sb.append("    operatingDays: ").append(toIndentedString(operatingDays)).append("\n");
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

