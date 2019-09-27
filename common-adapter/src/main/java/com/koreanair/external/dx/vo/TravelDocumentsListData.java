package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.NotificationResult;
import com.koreanair.external.dx.vo.TravelDocument;
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
  * Reply containing a list of travel documents
 **/
@ApiModel(description="Reply containing a list of travel documents")
public class TravelDocumentsListData  {
  
  @ApiModelProperty(value = "Travel documents (e-tickets and service-related documents)")
 /**
   * Travel documents (e-tickets and service-related documents)
  **/
  private List<TravelDocument> travelDocuments = null;

  @ApiModelProperty(value = "List of result of each notification sent for this order.")
 /**
   * List of result of each notification sent for this order.
  **/
  private List<NotificationResult> notifications = null;
 /**
   * Travel documents (e-tickets and service-related documents)
   * @return travelDocuments
  **/
  @JsonProperty("travelDocuments")
  public List<TravelDocument> getTravelDocuments() {
    return travelDocuments;
  }

  public void setTravelDocuments(List<TravelDocument> travelDocuments) {
    this.travelDocuments = travelDocuments;
  }

  public TravelDocumentsListData travelDocuments(List<TravelDocument> travelDocuments) {
    this.travelDocuments = travelDocuments;
    return this;
  }

  public TravelDocumentsListData addTravelDocumentsItem(TravelDocument travelDocumentsItem) {
    this.travelDocuments.add(travelDocumentsItem);
    return this;
  }

 /**
   * List of result of each notification sent for this order.
   * @return notifications
  **/
  @JsonProperty("notifications")
  public List<NotificationResult> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<NotificationResult> notifications) {
    this.notifications = notifications;
  }

  public TravelDocumentsListData notifications(List<NotificationResult> notifications) {
    this.notifications = notifications;
    return this;
  }

  public TravelDocumentsListData addNotificationsItem(NotificationResult notificationsItem) {
    this.notifications.add(notificationsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelDocumentsListData {\n");
    
    sb.append("    travelDocuments: ").append(toIndentedString(travelDocuments)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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

