package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.NotificationRequest;
import com.koreanair.external.dx.vo.OrderCommonRequest;
import com.koreanair.external.dx.vo.OtherServiceInformation;
import com.koreanair.external.dx.vo.PaymentWithAssociationRequest;
import com.koreanair.external.dx.vo.Remark;
import com.koreanair.external.dx.vo.SpecialKeyword;
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
  * Request to perform a payment on an existing order.
 **/
@ApiModel(description="Request to perform a payment on an existing order.")
public class OrderPaymentRequest  {
  
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

  @ApiModelProperty(value = "A list of payment request. Each payment request contains a payment method, and the amount to be paid using that method. For example, to pay using both monetary currency and miles, the payment is split into a partial payment for the miles amount and a second partial payment is used to represent the amount to be paid using Credit card. If you decide to benefit from validation of the amounts, amounts need to be provided for each payment request. ")
 /**
   * A list of payment request. Each payment request contains a payment method, and the amount to be paid using that method. For example, to pay using both monetary currency and miles, the payment is split into a partial payment for the miles amount and a second partial payment is used to represent the amount to be paid using Credit card. If you decide to benefit from validation of the amounts, amounts need to be provided for each payment request. 
  **/
  private List<PaymentWithAssociationRequest> paymentRequests = null;

  @ApiModelProperty(value = "Notifications to be processed after creating travel documents for this order.")
 /**
   * Notifications to be processed after creating travel documents for this order.
  **/
  private List<NotificationRequest> notifications = null;
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

  public OrderPaymentRequest remarks(List<Remark> remarks) {
    this.remarks = remarks;
    return this;
  }

  public OrderPaymentRequest addRemarksItem(Remark remarksItem) {
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

  public OrderPaymentRequest otherServiceInformations(List<OtherServiceInformation> otherServiceInformations) {
    this.otherServiceInformations = otherServiceInformations;
    return this;
  }

  public OrderPaymentRequest addOtherServiceInformationsItem(OtherServiceInformation otherServiceInformationsItem) {
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

  public OrderPaymentRequest specialKeywords(List<SpecialKeyword> specialKeywords) {
    this.specialKeywords = specialKeywords;
    return this;
  }

  public OrderPaymentRequest addSpecialKeywordsItem(SpecialKeyword specialKeywordsItem) {
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

  public OrderPaymentRequest specialServiceRequests(List<SpecialServiceRequest> specialServiceRequests) {
    this.specialServiceRequests = specialServiceRequests;
    return this;
  }

  public OrderPaymentRequest addSpecialServiceRequestsItem(SpecialServiceRequest specialServiceRequestsItem) {
    this.specialServiceRequests.add(specialServiceRequestsItem);
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

  public OrderPaymentRequest paymentRequests(List<PaymentWithAssociationRequest> paymentRequests) {
    this.paymentRequests = paymentRequests;
    return this;
  }

  public OrderPaymentRequest addPaymentRequestsItem(PaymentWithAssociationRequest paymentRequestsItem) {
    this.paymentRequests.add(paymentRequestsItem);
    return this;
  }

 /**
   * Notifications to be processed after creating travel documents for this order.
   * @return notifications
  **/
  @JsonProperty("notifications")
  public List<NotificationRequest> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<NotificationRequest> notifications) {
    this.notifications = notifications;
  }

  public OrderPaymentRequest notifications(List<NotificationRequest> notifications) {
    this.notifications = notifications;
    return this;
  }

  public OrderPaymentRequest addNotificationsItem(NotificationRequest notificationsItem) {
    this.notifications.add(notificationsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPaymentRequest {\n");
    
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    otherServiceInformations: ").append(toIndentedString(otherServiceInformations)).append("\n");
    sb.append("    specialKeywords: ").append(toIndentedString(specialKeywords)).append("\n");
    sb.append("    specialServiceRequests: ").append(toIndentedString(specialServiceRequests)).append("\n");
    sb.append("    paymentRequests: ").append(toIndentedString(paymentRequests)).append("\n");
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

