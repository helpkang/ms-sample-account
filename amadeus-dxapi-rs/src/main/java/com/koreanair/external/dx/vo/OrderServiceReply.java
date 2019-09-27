package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CommonReply;
import com.koreanair.external.dx.vo.DictionaryCommon;
import com.koreanair.external.dx.vo.ErrorMessage;
import com.koreanair.external.dx.vo.HttpRequest;
import com.koreanair.external.dx.vo.OrderServiceItem;
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
  * Reply containing a service object. 
 **/
@ApiModel(description="Reply containing a service object. ")
public class OrderServiceReply  {
  
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
  private OrderServiceItem data = null;

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

  public OrderServiceReply errors(List<ErrorMessage> errors) {
    this.errors = errors;
    return this;
  }

  public OrderServiceReply addErrorsItem(ErrorMessage errorsItem) {
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

  public OrderServiceReply warnings(List<WarningMessage> warnings) {
    this.warnings = warnings;
    return this;
  }

  public OrderServiceReply addWarningsItem(WarningMessage warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public OrderServiceItem getData() {
    return data;
  }

  public void setData(OrderServiceItem data) {
    this.data = data;
  }

  public OrderServiceReply data(OrderServiceItem data) {
    this.data = data;
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

  public OrderServiceReply links(List<HttpRequest> links) {
    this.links = links;
    return this;
  }

  public OrderServiceReply addLinksItem(HttpRequest linksItem) {
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

  public OrderServiceReply dictionaries(DictionaryCommon dictionaries) {
    this.dictionaries = dictionaries;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderServiceReply {\n");
    
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

