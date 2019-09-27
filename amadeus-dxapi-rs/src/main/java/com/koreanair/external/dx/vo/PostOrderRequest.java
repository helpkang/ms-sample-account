package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FormOfIdentificationDetailPostOrderRequest;
import com.koreanair.external.dx.vo.NotificationRequest;
import com.koreanair.external.dx.vo.OtherServiceInformation;
import com.koreanair.external.dx.vo.PaymentWithAssociationRequest;
import com.koreanair.external.dx.vo.Remark;
import com.koreanair.external.dx.vo.SpecialKeyword;
import com.koreanair.external.dx.vo.SpecialServiceRequest;
import io.swagger.annotations.ApiModel;
import java.time.LocalDateTime;
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
  * Input to create an order from a cart
 **/
@ApiModel(description="Input to create an order from a cart")
public class PostOrderRequest  {
  
  @ApiModelProperty(value = "Remarks (RM) to be inserted in the order")
 /**
   * Remarks (RM) to be inserted in the order
  **/
  private List<Remark> remarks = null;

  @ApiModelProperty(value = "Other service information elements (OSI) to be inserted in the order")
 /**
   * Other service information elements (OSI) to be inserted in the order
  **/
  private List<OtherServiceInformation> otherServiceInformations = null;

  @ApiModelProperty(value = "Special Keyword elements (SK) to be inserted in the order")
 /**
   * Special Keyword elements (SK) to be inserted in the order
  **/
  private List<SpecialKeyword> specialKeywords = null;

  @ApiModelProperty(value = "Special Services Request(SSR) stored in the order")
 /**
   * Special Services Request(SSR) stored in the order
  **/
  private List<SpecialServiceRequest> specialServiceRequests = null;

  @ApiModelProperty(value = "Form of identification requests for travelers. Several FOIDs can be entered for each traveler.")
 /**
   * Form of identification requests for travelers. Several FOIDs can be entered for each traveler.
  **/
  private List<FormOfIdentificationDetailPostOrderRequest> formOfIdentifications = null;

  @ApiModelProperty(value = "A list of payment request. Each payment request contains a payment method, and the amount to be paid using that method. For example, to pay using both monetary currency and miles, the payment is split into a partial payment for the miles amount and a second partial payment is used to represent the amount to be paid using Credit card. If you decide to benefit from validation of the amounts, amounts need to be provided for each payment request. ")
 /**
   * A list of payment request. Each payment request contains a payment method, and the amount to be paid using that method. For example, to pay using both monetary currency and miles, the payment is split into a partial payment for the miles amount and a second partial payment is used to represent the amount to be paid using Credit card. If you decide to benefit from validation of the amounts, amounts need to be provided for each payment request. 
  **/
  private List<PaymentWithAssociationRequest> paymentRequests = null;

  @ApiModelProperty(value = "Notifications to be processed after issuance of this order.")
 /**
   * Notifications to be processed after issuance of this order.
  **/
  private List<NotificationRequest> notifications = null;

  @ApiModelProperty(value = "Number of minutes requested to keep the order on hold before expiration.  The order expires if the associated payment not performed within this delay. If both minutesBeforeExpiration and expirationDateTime are provided in the input,  minutesBeforeExpiration is ignored and expirationDateTime is considered for the order expiry date.           ")
 /**
   * Number of minutes requested to keep the order on hold before expiration.  The order expires if the associated payment not performed within this delay. If both minutesBeforeExpiration and expirationDateTime are provided in the input,  minutesBeforeExpiration is ignored and expirationDateTime is considered for the order expiry date.           
  **/
  private Integer minutesBeforeExpiration = null;

  @ApiModelProperty(example = "2018-02-10T20:40:00+02:00", value = "Date and time with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00).The order expires if the associated payment not performed within this date.")
 /**
   * Date and time with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00).The order expires if the associated payment not performed within this date.
  **/
  private LocalDateTime expirationDateTime = null;
 /**
   * Remarks (RM) to be inserted in the order
   * @return remarks
  **/
  @JsonProperty("remarks")
  public List<Remark> getRemarks() {
    return remarks;
  }

  public void setRemarks(List<Remark> remarks) {
    this.remarks = remarks;
  }

  public PostOrderRequest remarks(List<Remark> remarks) {
    this.remarks = remarks;
    return this;
  }

  public PostOrderRequest addRemarksItem(Remark remarksItem) {
    this.remarks.add(remarksItem);
    return this;
  }

 /**
   * Other service information elements (OSI) to be inserted in the order
   * @return otherServiceInformations
  **/
  @JsonProperty("otherServiceInformations")
  public List<OtherServiceInformation> getOtherServiceInformations() {
    return otherServiceInformations;
  }

  public void setOtherServiceInformations(List<OtherServiceInformation> otherServiceInformations) {
    this.otherServiceInformations = otherServiceInformations;
  }

  public PostOrderRequest otherServiceInformations(List<OtherServiceInformation> otherServiceInformations) {
    this.otherServiceInformations = otherServiceInformations;
    return this;
  }

  public PostOrderRequest addOtherServiceInformationsItem(OtherServiceInformation otherServiceInformationsItem) {
    this.otherServiceInformations.add(otherServiceInformationsItem);
    return this;
  }

 /**
   * Special Keyword elements (SK) to be inserted in the order
   * @return specialKeywords
  **/
  @JsonProperty("specialKeywords")
  public List<SpecialKeyword> getSpecialKeywords() {
    return specialKeywords;
  }

  public void setSpecialKeywords(List<SpecialKeyword> specialKeywords) {
    this.specialKeywords = specialKeywords;
  }

  public PostOrderRequest specialKeywords(List<SpecialKeyword> specialKeywords) {
    this.specialKeywords = specialKeywords;
    return this;
  }

  public PostOrderRequest addSpecialKeywordsItem(SpecialKeyword specialKeywordsItem) {
    this.specialKeywords.add(specialKeywordsItem);
    return this;
  }

 /**
   * Special Services Request(SSR) stored in the order
   * @return specialServiceRequests
  **/
  @JsonProperty("specialServiceRequests")
  public List<SpecialServiceRequest> getSpecialServiceRequests() {
    return specialServiceRequests;
  }

  public void setSpecialServiceRequests(List<SpecialServiceRequest> specialServiceRequests) {
    this.specialServiceRequests = specialServiceRequests;
  }

  public PostOrderRequest specialServiceRequests(List<SpecialServiceRequest> specialServiceRequests) {
    this.specialServiceRequests = specialServiceRequests;
    return this;
  }

  public PostOrderRequest addSpecialServiceRequestsItem(SpecialServiceRequest specialServiceRequestsItem) {
    this.specialServiceRequests.add(specialServiceRequestsItem);
    return this;
  }

 /**
   * Form of identification requests for travelers. Several FOIDs can be entered for each traveler.
   * @return formOfIdentifications
  **/
  @JsonProperty("formOfIdentifications")
  public List<FormOfIdentificationDetailPostOrderRequest> getFormOfIdentifications() {
    return formOfIdentifications;
  }

  public void setFormOfIdentifications(List<FormOfIdentificationDetailPostOrderRequest> formOfIdentifications) {
    this.formOfIdentifications = formOfIdentifications;
  }

  public PostOrderRequest formOfIdentifications(List<FormOfIdentificationDetailPostOrderRequest> formOfIdentifications) {
    this.formOfIdentifications = formOfIdentifications;
    return this;
  }

  public PostOrderRequest addFormOfIdentificationsItem(FormOfIdentificationDetailPostOrderRequest formOfIdentificationsItem) {
    this.formOfIdentifications.add(formOfIdentificationsItem);
    return this;
  }

 /**
   * A list of payment request. Each payment request contains a payment method, and the amount to be paid using that method. For example, to pay using both monetary currency and miles, the payment is split into a partial payment for the miles amount and a second partial payment is used to represent the amount to be paid using Credit card. If you decide to benefit from validation of the amounts, amounts need to be provided for each payment request. 
   * @return paymentRequests
  **/
  @JsonProperty("paymentRequests")
  public List<PaymentWithAssociationRequest> getPaymentRequests() {
    return paymentRequests;
  }

  public void setPaymentRequests(List<PaymentWithAssociationRequest> paymentRequests) {
    this.paymentRequests = paymentRequests;
  }

  public PostOrderRequest paymentRequests(List<PaymentWithAssociationRequest> paymentRequests) {
    this.paymentRequests = paymentRequests;
    return this;
  }

  public PostOrderRequest addPaymentRequestsItem(PaymentWithAssociationRequest paymentRequestsItem) {
    this.paymentRequests.add(paymentRequestsItem);
    return this;
  }

 /**
   * Notifications to be processed after issuance of this order.
   * @return notifications
  **/
  @JsonProperty("notifications")
  public List<NotificationRequest> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<NotificationRequest> notifications) {
    this.notifications = notifications;
  }

  public PostOrderRequest notifications(List<NotificationRequest> notifications) {
    this.notifications = notifications;
    return this;
  }

  public PostOrderRequest addNotificationsItem(NotificationRequest notificationsItem) {
    this.notifications.add(notificationsItem);
    return this;
  }

 /**
   * Number of minutes requested to keep the order on hold before expiration.  The order expires if the associated payment not performed within this delay. If both minutesBeforeExpiration and expirationDateTime are provided in the input,  minutesBeforeExpiration is ignored and expirationDateTime is considered for the order expiry date.           
   * minimum: 6
   * @return minutesBeforeExpiration
  **/
  @JsonProperty("minutesBeforeExpiration")
  public Integer getMinutesBeforeExpiration() {
    return minutesBeforeExpiration;
  }

  public void setMinutesBeforeExpiration(Integer minutesBeforeExpiration) {
    this.minutesBeforeExpiration = minutesBeforeExpiration;
  }

  public PostOrderRequest minutesBeforeExpiration(Integer minutesBeforeExpiration) {
    this.minutesBeforeExpiration = minutesBeforeExpiration;
    return this;
  }

 /**
   * Date and time with the following format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00).The order expires if the associated payment not performed within this date.
   * @return expirationDateTime
  **/
  @JsonProperty("expirationDateTime")
  public LocalDateTime getExpirationDateTime() {
    return expirationDateTime;
  }

  public void setExpirationDateTime(LocalDateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  public PostOrderRequest expirationDateTime(LocalDateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOrderRequest {\n");
    
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    otherServiceInformations: ").append(toIndentedString(otherServiceInformations)).append("\n");
    sb.append("    specialKeywords: ").append(toIndentedString(specialKeywords)).append("\n");
    sb.append("    specialServiceRequests: ").append(toIndentedString(specialServiceRequests)).append("\n");
    sb.append("    formOfIdentifications: ").append(toIndentedString(formOfIdentifications)).append("\n");
    sb.append("    paymentRequests: ").append(toIndentedString(paymentRequests)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    minutesBeforeExpiration: ").append(toIndentedString(minutesBeforeExpiration)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
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

