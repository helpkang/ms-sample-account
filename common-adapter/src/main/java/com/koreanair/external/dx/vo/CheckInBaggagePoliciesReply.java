package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BaggagePoliciesDictionary;
import com.koreanair.external.dx.vo.CheckInBaggagePolicies;
import com.koreanair.external.dx.vo.CommonReply;
import com.koreanair.external.dx.vo.ErrorMessage;
import com.koreanair.external.dx.vo.WarningMessage;
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

public class CheckInBaggagePoliciesReply  {
  
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

  @ApiModelProperty(required = true, value = "Baggage allowance and price for each group of passengers in the journey. The policies apply to all the flights in the journey. ")
 /**
   * Baggage allowance and price for each group of passengers in the journey. The policies apply to all the flights in the journey. 
  **/
  private List<CheckInBaggagePolicies> data = new ArrayList<>();

  @ApiModelProperty(value = "")
  private BaggagePoliciesDictionary dictionaries = null;
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

  public CheckInBaggagePoliciesReply errors(List<ErrorMessage> errors) {
    this.errors = errors;
    return this;
  }

  public CheckInBaggagePoliciesReply addErrorsItem(ErrorMessage errorsItem) {
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

  public CheckInBaggagePoliciesReply warnings(List<WarningMessage> warnings) {
    this.warnings = warnings;
    return this;
  }

  public CheckInBaggagePoliciesReply addWarningsItem(WarningMessage warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

 /**
   * Baggage allowance and price for each group of passengers in the journey. The policies apply to all the flights in the journey. 
   * @return data
  **/
  @JsonProperty("data")
  public List<CheckInBaggagePolicies> getData() {
    return data;
  }

  public void setData(List<CheckInBaggagePolicies> data) {
    this.data = data;
  }

  public CheckInBaggagePoliciesReply data(List<CheckInBaggagePolicies> data) {
    this.data = data;
    return this;
  }

  public CheckInBaggagePoliciesReply addDataItem(CheckInBaggagePolicies dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
   * Get dictionaries
   * @return dictionaries
  **/
  @JsonProperty("dictionaries")
  public BaggagePoliciesDictionary getDictionaries() {
    return dictionaries;
  }

  public void setDictionaries(BaggagePoliciesDictionary dictionaries) {
    this.dictionaries = dictionaries;
  }

  public CheckInBaggagePoliciesReply dictionaries(BaggagePoliciesDictionary dictionaries) {
    this.dictionaries = dictionaries;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInBaggagePoliciesReply {\n");
    
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

