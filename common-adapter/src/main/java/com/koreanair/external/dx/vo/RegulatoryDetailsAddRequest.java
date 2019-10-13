package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.RegulatoryDetail;
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
  * Provide the list of regulatory details to be added as well as those to be declined
 **/
@ApiModel(description="Provide the list of regulatory details to be added as well as those to be declined")
public class RegulatoryDetailsAddRequest  {
  
  @ApiModelProperty(value = "Traveler associated to the regulatory details update")
 /**
   * Traveler associated to the regulatory details update
  **/
  private String travelerId = null;

  @ApiModelProperty(required = true, value = "List of regulatory details to add to the traveler for his journey")
 /**
   * List of regulatory details to add to the traveler for his journey
  **/
  private List<RegulatoryDetail> detailsToAdd = new ArrayList<>();

  @ApiModelProperty(required = true, value = "List of regulatory details to be declined for the traveler for his journey (see RegulatoryType for the list of possibilities)")
 /**
   * List of regulatory details to be declined for the traveler for his journey (see RegulatoryType for the list of possibilities)
  **/
  private List<String> detailsToDecline = new ArrayList<>();
 /**
   * Traveler associated to the regulatory details update
   * @return travelerId
  **/
  @JsonProperty("travelerId")
  public String getTravelerId() {
    return travelerId;
  }

  public void setTravelerId(String travelerId) {
    this.travelerId = travelerId;
  }

  public RegulatoryDetailsAddRequest travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }

 /**
   * List of regulatory details to add to the traveler for his journey
   * @return detailsToAdd
  **/
  @JsonProperty("detailsToAdd")
  public List<RegulatoryDetail> getDetailsToAdd() {
    return detailsToAdd;
  }

  public void setDetailsToAdd(List<RegulatoryDetail> detailsToAdd) {
    this.detailsToAdd = detailsToAdd;
  }

  public RegulatoryDetailsAddRequest detailsToAdd(List<RegulatoryDetail> detailsToAdd) {
    this.detailsToAdd = detailsToAdd;
    return this;
  }

  public RegulatoryDetailsAddRequest addDetailsToAddItem(RegulatoryDetail detailsToAddItem) {
    this.detailsToAdd.add(detailsToAddItem);
    return this;
  }

 /**
   * List of regulatory details to be declined for the traveler for his journey (see RegulatoryType for the list of possibilities)
   * @return detailsToDecline
  **/
  @JsonProperty("detailsToDecline")
  public List<String> getDetailsToDecline() {
    return detailsToDecline;
  }

  public void setDetailsToDecline(List<String> detailsToDecline) {
    this.detailsToDecline = detailsToDecline;
  }

  public RegulatoryDetailsAddRequest detailsToDecline(List<String> detailsToDecline) {
    this.detailsToDecline = detailsToDecline;
    return this;
  }

  public RegulatoryDetailsAddRequest addDetailsToDeclineItem(String detailsToDeclineItem) {
    this.detailsToDecline.add(detailsToDeclineItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryDetailsAddRequest {\n");
    
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
    sb.append("    detailsToAdd: ").append(toIndentedString(detailsToAdd)).append("\n");
    sb.append("    detailsToDecline: ").append(toIndentedString(detailsToDecline)).append("\n");
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

