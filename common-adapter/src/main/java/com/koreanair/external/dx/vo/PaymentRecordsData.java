package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.HttpRequest;
import com.koreanair.external.dx.vo.NotificationResult;
import com.koreanair.external.dx.vo.PaymentRecord;
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
  * Reply containing a list of payment records
 **/
@ApiModel(description="Reply containing a list of payment records")
public class PaymentRecordsData  {
  
  @ApiModelProperty(value = "")
  private List<PaymentRecord> paymentRecords = null;

  @ApiModelProperty(value = "List of result of each notification sent for this order.")
 /**
   * List of result of each notification sent for this order.
  **/
  private List<NotificationResult> notifications = null;

  @ApiModelProperty(value = "List of links related to the payment records. They can refer to  the travel documents generated if the Order was ticketed.  Also, they can refer to the redirection url to be used in case the selected payment method requires redirection. Valid 'rel' value for AlternativePaymentMethod is 'pspRedirectionUrl'  where 'psp' refers to Payment Service Provider.  Valid 'rel' value for 3D Secure is 'acsRedirectionUrl'  where 'acs' refers to Access Control Server.")
 /**
   * List of links related to the payment records. They can refer to  the travel documents generated if the Order was ticketed.  Also, they can refer to the redirection url to be used in case the selected payment method requires redirection. Valid 'rel' value for AlternativePaymentMethod is 'pspRedirectionUrl'  where 'psp' refers to Payment Service Provider.  Valid 'rel' value for 3D Secure is 'acsRedirectionUrl'  where 'acs' refers to Access Control Server.
  **/
  private List<HttpRequest> links = null;
 /**
   * Get paymentRecords
   * @return paymentRecords
  **/
  @JsonProperty("paymentRecords")
  public List<PaymentRecord> getPaymentRecords() {
    return paymentRecords;
  }

  public void setPaymentRecords(List<PaymentRecord> paymentRecords) {
    this.paymentRecords = paymentRecords;
  }

  public PaymentRecordsData paymentRecords(List<PaymentRecord> paymentRecords) {
    this.paymentRecords = paymentRecords;
    return this;
  }

  public PaymentRecordsData addPaymentRecordsItem(PaymentRecord paymentRecordsItem) {
    this.paymentRecords.add(paymentRecordsItem);
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

  public PaymentRecordsData notifications(List<NotificationResult> notifications) {
    this.notifications = notifications;
    return this;
  }

  public PaymentRecordsData addNotificationsItem(NotificationResult notificationsItem) {
    this.notifications.add(notificationsItem);
    return this;
  }

 /**
   * List of links related to the payment records. They can refer to  the travel documents generated if the Order was ticketed.  Also, they can refer to the redirection url to be used in case the selected payment method requires redirection. Valid &#39;rel&#39; value for AlternativePaymentMethod is &#39;pspRedirectionUrl&#39;  where &#39;psp&#39; refers to Payment Service Provider.  Valid &#39;rel&#39; value for 3D Secure is &#39;acsRedirectionUrl&#39;  where &#39;acs&#39; refers to Access Control Server.
   * @return links
  **/
  @JsonProperty("links")
  public List<HttpRequest> getLinks() {
    return links;
  }

  public void setLinks(List<HttpRequest> links) {
    this.links = links;
  }

  public PaymentRecordsData links(List<HttpRequest> links) {
    this.links = links;
    return this;
  }

  public PaymentRecordsData addLinksItem(HttpRequest linksItem) {
    this.links.add(linksItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRecordsData {\n");
    
    sb.append("    paymentRecords: ").append(toIndentedString(paymentRecords)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

