package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Promotion;
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
  * Object used to specify the service item to be added to a Cart or an Order 
 **/
@ApiModel(description="Object used to specify the service item to be added to a Cart or an Order ")
public class ServiceItemRequest  {
  
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

  @ApiModelProperty(required = true, value = "Id of the service selected from the catalogue")
 /**
   * Id of the service selected from the catalogue
  **/
  private String serviceId = null;

  @ApiModelProperty(required = true, value = "Traveler id to be associated to the service")
 /**
   * Traveler id to be associated to the service
  **/
  private String travelerId = null;

  @ApiModelProperty(value = "Promotion code and related airline code. When a Promotion is injected and is applied, then the price will be discounted accordingly and the applied promotion will appear in the Discount dictionary associated. ")
 /**
   * Promotion code and related airline code. When a Promotion is injected and is applied, then the price will be discounted accordingly and the applied promotion will appear in the Discount dictionary associated. 
  **/
  private Promotion promotion = null;
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

  public ServiceItemRequest tid(String tid) {
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

  public ServiceItemRequest quantity(Integer quantity) {
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

  public ServiceItemRequest parameters(List<ServiceRequestParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public ServiceItemRequest addParametersItem(ServiceRequestParameter parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

 /**
   * Id of the service selected from the catalogue
   * @return serviceId
  **/
  @JsonProperty("serviceId")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public ServiceItemRequest serviceId(String serviceId) {
    this.serviceId = serviceId;
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

  public ServiceItemRequest travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }

 /**
   * Promotion code and related airline code. When a Promotion is injected and is applied, then the price will be discounted accordingly and the applied promotion will appear in the Discount dictionary associated. 
   * @return promotion
  **/
  @JsonProperty("promotion")
  public Promotion getPromotion() {
    return promotion;
  }

  public void setPromotion(Promotion promotion) {
    this.promotion = promotion;
  }

  public ServiceItemRequest promotion(Promotion promotion) {
    this.promotion = promotion;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceItemRequest {\n");
    
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
    sb.append("    promotion: ").append(toIndentedString(promotion)).append("\n");
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

