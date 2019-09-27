package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.ServiceItemRequestCommon;
import com.koreanair.external.dx.vo.ServiceRequestParameter;
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
  * Object used to specify the service item that will be part of the update services request Services can be associated to travelers in the Cart using travelerId 
 **/
@ApiModel(description="Object used to specify the service item that will be part of the update services request Services can be associated to travelers in the Cart using travelerId ")
public class UpdateServiceItemRequest  {
  
  @ApiModelProperty(value = "Temporary id that can be used to associate requested and returned services. It is only valid the time of the transaction.")
 /**
   * Temporary id that can be used to associate requested and returned services. It is only valid the time of the transaction.
  **/
  private String tid = null;

  @ApiModelProperty(value = "Desired quantity of the service to be requested (e.g. Number of bags)")
 /**
   * Desired quantity of the service to be requested (e.g. Number of bags)
  **/
  private Integer quantity = null;

  @ApiModelProperty(value = "List of parameters defining the service structure")
 /**
   * List of parameters defining the service structure
  **/
  private List<ServiceRequestParameter> parameters = null;

  @ApiModelProperty(value = "Traveler id to be associated to the service")
 /**
   * Traveler id to be associated to the service
  **/
  private String travelerId = null;
 /**
   * Temporary id that can be used to associate requested and returned services. It is only valid the time of the transaction.
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public UpdateServiceItemRequest tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * Desired quantity of the service to be requested (e.g. Number of bags)
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public UpdateServiceItemRequest quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * List of parameters defining the service structure
   * @return parameters
  **/
  @JsonProperty("parameters")
  public List<ServiceRequestParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<ServiceRequestParameter> parameters) {
    this.parameters = parameters;
  }

  public UpdateServiceItemRequest parameters(List<ServiceRequestParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public UpdateServiceItemRequest addParametersItem(ServiceRequestParameter parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

 /**
   * Traveler id to be associated to the service
   * @return travelerId
  **/
  @JsonProperty("travelerId")
  public String getTravelerId() {
    return travelerId;
  }

  public void setTravelerId(String travelerId) {
    this.travelerId = travelerId;
  }

  public UpdateServiceItemRequest travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateServiceItemRequest {\n");
    
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
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

