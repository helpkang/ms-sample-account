package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirCommon;
import com.koreanair.external.dx.vo.AirOfferItem;
import com.koreanair.external.dx.vo.Status;
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
  * AirOffer containing air and / or services
 **/
@ApiModel(description="AirOffer containing air and / or services")
public class AirOffer  {
  
  @ApiModelProperty(required = true, value = "")
  private String id = null;

  @ApiModelProperty(value = "NDC identifier (for information only)")
 /**
   * NDC identifier (for information only)
  **/
  private String offerNdcId = null;

  @ApiModelProperty(value = "Indicates if the Offer has a specific status such as soldOut, waitList, etc.")
 /**
   * Indicates if the Offer has a specific status such as soldOut, waitList, etc.
  **/
  private Status status = null;

  @ApiModelProperty(required = true, value = "List of offer items. Only one offer item contains flights (with potentially included services), other offer items contain optional services")
 /**
   * List of offer items. Only one offer item contains flights (with potentially included services), other offer items contain optional services
  **/
  private List<AirOfferItem> offerItems = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AirOffer id(String id) {
    this.id = id;
    return this;
  }

 /**
   * NDC identifier (for information only)
   * @return offerNdcId
  **/
  @JsonProperty("offerNdcId")
  public String getOfferNdcId() {
    return offerNdcId;
  }

  public void setOfferNdcId(String offerNdcId) {
    this.offerNdcId = offerNdcId;
  }

  public AirOffer offerNdcId(String offerNdcId) {
    this.offerNdcId = offerNdcId;
    return this;
  }

 /**
   * Indicates if the Offer has a specific status such as soldOut, waitList, etc.
   * @return status
  **/
  @JsonProperty("status")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public AirOffer status(Status status) {
    this.status = status;
    return this;
  }

 /**
   * List of offer items. Only one offer item contains flights (with potentially included services), other offer items contain optional services
   * @return offerItems
  **/
  @JsonProperty("offerItems")
  public List<AirOfferItem> getOfferItems() {
    return offerItems;
  }

  public void setOfferItems(List<AirOfferItem> offerItems) {
    this.offerItems = offerItems;
  }

  public AirOffer offerItems(List<AirOfferItem> offerItems) {
    this.offerItems = offerItems;
    return this;
  }

  public AirOffer addOfferItemsItem(AirOfferItem offerItemsItem) {
    this.offerItems.add(offerItemsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirOffer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offerNdcId: ").append(toIndentedString(offerNdcId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    offerItems: ").append(toIndentedString(offerItems)).append("\n");
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

