package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.ServicesCatalogueItem;
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
  * List of services assiociated to a specific air offer
 **/
@ApiModel(description="List of services assiociated to a specific air offer")
public class ServicesCatalogueReplyData  {
  
  @ApiModelProperty(value = "")
  private String airOfferId = null;

  @ApiModelProperty(value = "")
  private List<ServicesCatalogueItem> services = null;
 /**
   * Get airOfferId
   * @return airOfferId
  **/
  @JsonProperty("airOfferId")
  public String getAirOfferId() {
    return airOfferId;
  }

  public void setAirOfferId(String airOfferId) {
    this.airOfferId = airOfferId;
  }

  public ServicesCatalogueReplyData airOfferId(String airOfferId) {
    this.airOfferId = airOfferId;
    return this;
  }

 /**
   * Get services
   * @return services
  **/
  @JsonProperty("services")
  public List<ServicesCatalogueItem> getServices() {
    return services;
  }

  public void setServices(List<ServicesCatalogueItem> services) {
    this.services = services;
  }

  public ServicesCatalogueReplyData services(List<ServicesCatalogueItem> services) {
    this.services = services;
    return this;
  }

  public ServicesCatalogueReplyData addServicesItem(ServicesCatalogueItem servicesItem) {
    this.services.add(servicesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesCatalogueReplyData {\n");
    
    sb.append("    airOfferId: ").append(toIndentedString(airOfferId)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

