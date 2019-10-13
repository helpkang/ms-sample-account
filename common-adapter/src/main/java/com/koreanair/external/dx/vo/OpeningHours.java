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

public class OpeningHours  {
  
  @ApiModelProperty(value = "Day codes. Examples: 0 for Sunday, 1 for Monday, 2 for Tuesday etc")
 /**
   * Day codes. Examples: 0 for Sunday, 1 for Monday, 2 for Tuesday etc
  **/
  private Integer dayCode = null;


@XmlType(name="TimeModeEnum")
@XmlEnum(String.class)
public enum TimeModeEnum {

@XmlEnumValue("pickUpTime") PICKUPTIME(String.valueOf("pickUpTime")), @XmlEnumValue("localTime") LOCALTIME(String.valueOf("localTime")), @XmlEnumValue("dropOffTime") DROPOFFTIME(String.valueOf("dropOffTime"));


    private String value;

    TimeModeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TimeModeEnum fromValue(String v) {
        for (TimeModeEnum b : TimeModeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "localTime in requested pick-up location time zone, pickTime in agency pick-up location time zone, dropOffTime in agency drop-off location time zone")
 /**
   * localTime in requested pick-up location time zone, pickTime in agency pick-up location time zone, dropOffTime in agency drop-off location time zone
  **/
  private TimeModeEnum timeMode = null;

  @ApiModelProperty(value = "Car location opening time on the format hh:mm e.g. 8:30")
 /**
   * Car location opening time on the format hh:mm e.g. 8:30
  **/
  private String beginTime = null;

  @ApiModelProperty(value = "Car location closing time on the format hh:mm e.g. 18:30")
 /**
   * Car location closing time on the format hh:mm e.g. 18:30
  **/
  private String endTime = null;
 /**
   * Day codes. Examples: 0 for Sunday, 1 for Monday, 2 for Tuesday etc
   * minimum: 0
   * maximum: 6
   * @return dayCode
  **/
  @JsonProperty("dayCode")
  public Integer getDayCode() {
    return dayCode;
  }

  public void setDayCode(Integer dayCode) {
    this.dayCode = dayCode;
  }

  public OpeningHours dayCode(Integer dayCode) {
    this.dayCode = dayCode;
    return this;
  }

 /**
   * localTime in requested pick-up location time zone, pickTime in agency pick-up location time zone, dropOffTime in agency drop-off location time zone
   * @return timeMode
  **/
  @JsonProperty("timeMode")
  public String getTimeMode() {
    if (timeMode == null) {
      return null;
    }
    return timeMode.value();
  }

  public void setTimeMode(TimeModeEnum timeMode) {
    this.timeMode = timeMode;
  }

  public OpeningHours timeMode(TimeModeEnum timeMode) {
    this.timeMode = timeMode;
    return this;
  }

 /**
   * Car location opening time on the format hh:mm e.g. 8:30
   * @return beginTime
  **/
  @JsonProperty("beginTime")
  public String getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(String beginTime) {
    this.beginTime = beginTime;
  }

  public OpeningHours beginTime(String beginTime) {
    this.beginTime = beginTime;
    return this;
  }

 /**
   * Car location closing time on the format hh:mm e.g. 18:30
   * @return endTime
  **/
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public OpeningHours endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpeningHours {\n");
    
    sb.append("    dayCode: ").append(toIndentedString(dayCode)).append("\n");
    sb.append("    timeMode: ").append(toIndentedString(timeMode)).append("\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

