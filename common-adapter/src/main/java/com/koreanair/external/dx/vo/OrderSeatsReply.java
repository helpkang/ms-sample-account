package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CommonReply;
import com.koreanair.external.dx.vo.DictionaryCommon;
import com.koreanair.external.dx.vo.ErrorMessage;
import com.koreanair.external.dx.vo.HttpRequest;
import com.koreanair.external.dx.vo.OrderSeatItem;
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

public class OrderSeatsReply  {
  
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

  @ApiModelProperty(required = true, value = "List of Seats")
 /**
   * List of Seats
  **/
  private List<OrderSeatItem> data = new ArrayList<>();

  @ApiModelProperty(value = "List of links related to the RM/OSI/SK.They can refer to the RM/OSI/SK  associated to order.   Also, they can refer to the redirection url to be used to retrieve the RM/OSI/SK added to order")
 /**
   * List of links related to the RM/OSI/SK.They can refer to the RM/OSI/SK  associated to order.   Also, they can refer to the redirection url to be used to retrieve the RM/OSI/SK added to order
  **/
  private List<HttpRequest> links = null;

  @ApiModelProperty(value = "")
  private DictionaryCommon dictionaries = null;
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

  public OrderSeatsReply errors(List<ErrorMessage> errors) {
    this.errors = errors;
    return this;
  }

  public OrderSeatsReply addErrorsItem(ErrorMessage errorsItem) {
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

  public OrderSeatsReply warnings(List<WarningMessage> warnings) {
    this.warnings = warnings;
    return this;
  }

  public OrderSeatsReply addWarningsItem(WarningMessage warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

 /**
   * List of Seats
   * @return data
  **/
  @JsonProperty("data")
  public List<OrderSeatItem> getData() {
    return data;
  }

  public void setData(List<OrderSeatItem> data) {
    this.data = data;
  }

  public OrderSeatsReply data(List<OrderSeatItem> data) {
    this.data = data;
    return this;
  }

  public OrderSeatsReply addDataItem(OrderSeatItem dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
   * List of links related to the RM/OSI/SK.They can refer to the RM/OSI/SK  associated to order.   Also, they can refer to the redirection url to be used to retrieve the RM/OSI/SK added to order
   * @return links
  **/
  @JsonProperty("links")
  public List<HttpRequest> getLinks() {
    return links;
  }

  public void setLinks(List<HttpRequest> links) {
    this.links = links;
  }

  public OrderSeatsReply links(List<HttpRequest> links) {
    this.links = links;
    return this;
  }

  public OrderSeatsReply addLinksItem(HttpRequest linksItem) {
    this.links.add(linksItem);
    return this;
  }

 /**
   * Get dictionaries
   * @return dictionaries
  **/
  @JsonProperty("dictionaries")
  public DictionaryCommon getDictionaries() {
    return dictionaries;
  }

  public void setDictionaries(DictionaryCommon dictionaries) {
    this.dictionaries = dictionaries;
  }

  public OrderSeatsReply dictionaries(DictionaryCommon dictionaries) {
    this.dictionaries = dictionaries;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSeatsReply {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

