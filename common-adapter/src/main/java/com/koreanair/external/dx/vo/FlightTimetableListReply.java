package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AircraftDictionary;
import com.koreanair.external.dx.vo.CommonReply;
import com.koreanair.external.dx.vo.ErrorMessage;
import com.koreanair.external.dx.vo.FlightTimetableData;
import com.koreanair.external.dx.vo.WarningMessage;
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
public class FlightTimetableListReply  {
  
  @ApiModelProperty(value = "Array of error messages")
 /**
   * Array of error messages
  **/
  private List<ErrorMessage> errors = null;

  @ApiModelProperty(value = "Array of warning messages")
 /**
   * Array of warning messages
  **/
  private List<WarningMessage> warnings = null;

  @ApiModelProperty(required = true, value = "")
  private List<FlightTimetableData> data = new ArrayList<>();

  @ApiModelProperty(value = "")
  private AircraftDictionary dictionaries = null;
 /**
   * Array of error messages
   * @return errors
  **/
  @JsonProperty("errors")
  public List<ErrorMessage> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorMessage> errors) {
    this.errors = errors;
  }

  public FlightTimetableListReply errors(List<ErrorMessage> errors) {
    this.errors = errors;
    return this;
  }

  public FlightTimetableListReply addErrorsItem(ErrorMessage errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
   * Array of warning messages
   * @return warnings
  **/
  @JsonProperty("warnings")
  public List<WarningMessage> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<WarningMessage> warnings) {
    this.warnings = warnings;
  }

  public FlightTimetableListReply warnings(List<WarningMessage> warnings) {
    this.warnings = warnings;
    return this;
  }

  public FlightTimetableListReply addWarningsItem(WarningMessage warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public List<FlightTimetableData> getData() {
    return data;
  }

  public void setData(List<FlightTimetableData> data) {
    this.data = data;
  }

  public FlightTimetableListReply data(List<FlightTimetableData> data) {
    this.data = data;
    return this;
  }

  public FlightTimetableListReply addDataItem(FlightTimetableData dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
   * Get dictionaries
   * @return dictionaries
  **/
  @JsonProperty("dictionaries")
  public AircraftDictionary getDictionaries() {
    return dictionaries;
  }

  public void setDictionaries(AircraftDictionary dictionaries) {
    this.dictionaries = dictionaries;
  }

  public FlightTimetableListReply dictionaries(AircraftDictionary dictionaries) {
    this.dictionaries = dictionaries;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightTimetableListReply {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dictionaries: ").append(toIndentedString(dictionaries)).append("\n");
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
