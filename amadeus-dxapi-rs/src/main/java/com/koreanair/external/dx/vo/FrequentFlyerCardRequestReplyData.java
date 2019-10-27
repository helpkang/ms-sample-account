package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FrequentFlyerCard;
import com.koreanair.external.dx.vo.SpecialServiceRequest;
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
  * Reply data containing a frequent flyer card element and the associated service requests
 **/
@ApiModel(description="Reply data containing a frequent flyer card element and the associated service requests")
public class FrequentFlyerCardRequestReplyData  {
  
  @ApiModelProperty(value = "")
  private FrequentFlyerCard frequentFlyerCard = null;

  @ApiModelProperty(value = "")
  private List<SpecialServiceRequest> serviceRequests = null;
 /**
   * Get frequentFlyerCard
   * @return frequentFlyerCard
  **/
  @JsonProperty("frequentFlyerCard")
  public FrequentFlyerCard getFrequentFlyerCard() {
    return frequentFlyerCard;
  }

  public void setFrequentFlyerCard(FrequentFlyerCard frequentFlyerCard) {
    this.frequentFlyerCard = frequentFlyerCard;
  }

  public FrequentFlyerCardRequestReplyData frequentFlyerCard(FrequentFlyerCard frequentFlyerCard) {
    this.frequentFlyerCard = frequentFlyerCard;
    return this;
  }

 /**
   * Get serviceRequests
   * @return serviceRequests
  **/
  @JsonProperty("serviceRequests")
  public List<SpecialServiceRequest> getServiceRequests() {
    return serviceRequests;
  }

  public void setServiceRequests(List<SpecialServiceRequest> serviceRequests) {
    this.serviceRequests = serviceRequests;
  }

  public FrequentFlyerCardRequestReplyData serviceRequests(List<SpecialServiceRequest> serviceRequests) {
    this.serviceRequests = serviceRequests;
    return this;
  }

  public FrequentFlyerCardRequestReplyData addServiceRequestsItem(SpecialServiceRequest serviceRequestsItem) {
    this.serviceRequests.add(serviceRequestsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentFlyerCardRequestReplyData {\n");
    
    sb.append("    frequentFlyerCard: ").append(toIndentedString(frequentFlyerCard)).append("\n");
    sb.append("    serviceRequests: ").append(toIndentedString(serviceRequests)).append("\n");
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

