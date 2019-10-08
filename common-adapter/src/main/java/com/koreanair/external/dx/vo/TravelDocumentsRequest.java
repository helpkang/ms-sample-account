package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.NotificationRequest;
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
  * Input to create travel documents for an order
 **/
@ApiModel(description="Input to create travel documents for an order")
public class TravelDocumentsRequest  {
  
  @ApiModelProperty(value = "Notifications to be processed after creating travel documents for this order. Only in case they are specified in the request.")
 /**
   * Notifications to be processed after creating travel documents for this order. Only in case they are specified in the request.
  **/
  private List<NotificationRequest> notifications = null;
 /**
   * Notifications to be processed after creating travel documents for this order. Only in case they are specified in the request.
   * @return notifications
  **/
  @JsonProperty("notifications")
  public List<NotificationRequest> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<NotificationRequest> notifications) {
    this.notifications = notifications;
  }

  public TravelDocumentsRequest notifications(List<NotificationRequest> notifications) {
    this.notifications = notifications;
    return this;
  }

  public TravelDocumentsRequest addNotificationsItem(NotificationRequest notificationsItem) {
    this.notifications.add(notificationsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelDocumentsRequest {\n");
    
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

