package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.OtherServiceInformation;
import com.koreanair.external.dx.vo.PaymentWithAssociationRequest;
import com.koreanair.external.dx.vo.Remark;
import com.koreanair.external.dx.vo.ServiceItemRequest;
import com.koreanair.external.dx.vo.SpecialKeyword;
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
  * Input to add services to an order
 **/
@ApiModel(description="Input to add services to an order")
public class PostOrderServiceRequest  {
  
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

  @ApiModelProperty(value = "List of services (chargeable or free)")
 /**
   * List of services (chargeable or free)
  **/
  private List<ServiceItemRequest> services = null;

  @ApiModelProperty(value = "A list of payment request. Each payment request contains a payment method, and the amount to be paid using that method. For example, to pay using both monetary currency and miles, the payment is split into a partial payment for the miles amount and a second partial payment is used to represent the amount to be paid using Credit card.  If you decide to benefit from validation of the amounts, amounts need to be provided for each payment request. ")
 /**
   * A list of payment request. Each payment request contains a payment method, and the amount to be paid using that method. For example, to pay using both monetary currency and miles, the payment is split into a partial payment for the miles amount and a second partial payment is used to represent the amount to be paid using Credit card.  If you decide to benefit from validation of the amounts, amounts need to be provided for each payment request. 
  **/
  private List<PaymentWithAssociationRequest> paymentRequests = null;
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

  public PostOrderServiceRequest remarks(List<Remark> remarks) {
    this.remarks = remarks;
    return this;
  }

  public PostOrderServiceRequest addRemarksItem(Remark remarksItem) {
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

  public PostOrderServiceRequest otherServiceInformations(List<OtherServiceInformation> otherServiceInformations) {
    this.otherServiceInformations = otherServiceInformations;
    return this;
  }

  public PostOrderServiceRequest addOtherServiceInformationsItem(OtherServiceInformation otherServiceInformationsItem) {
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

  public PostOrderServiceRequest specialKeywords(List<SpecialKeyword> specialKeywords) {
    this.specialKeywords = specialKeywords;
    return this;
  }

  public PostOrderServiceRequest addSpecialKeywordsItem(SpecialKeyword specialKeywordsItem) {
    this.specialKeywords.add(specialKeywordsItem);
    return this;
  }

 /**
   * List of services (chargeable or free)
   * @return services
  **/
  @JsonProperty("services")
  public List<ServiceItemRequest> getServices() {
    return services;
  }

  public void setServices(List<ServiceItemRequest> services) {
    this.services = services;
  }

  public PostOrderServiceRequest services(List<ServiceItemRequest> services) {
    this.services = services;
    return this;
  }

  public PostOrderServiceRequest addServicesItem(ServiceItemRequest servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

 /**
   * A list of payment request. Each payment request contains a payment method, and the amount to be paid using that method. For example, to pay using both monetary currency and miles, the payment is split into a partial payment for the miles amount and a second partial payment is used to represent the amount to be paid using Credit card.  If you decide to benefit from validation of the amounts, amounts need to be provided for each payment request. 
   * @return paymentRequests
  **/
  @JsonProperty("paymentRequests")
  public List<PaymentWithAssociationRequest> getPaymentRequests() {
    return paymentRequests;
  }

  public void setPaymentRequests(List<PaymentWithAssociationRequest> paymentRequests) {
    this.paymentRequests = paymentRequests;
  }

  public PostOrderServiceRequest paymentRequests(List<PaymentWithAssociationRequest> paymentRequests) {
    this.paymentRequests = paymentRequests;
    return this;
  }

  public PostOrderServiceRequest addPaymentRequestsItem(PaymentWithAssociationRequest paymentRequestsItem) {
    this.paymentRequests.add(paymentRequestsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOrderServiceRequest {\n");
    
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    otherServiceInformations: ").append(toIndentedString(otherServiceInformations)).append("\n");
    sb.append("    specialKeywords: ").append(toIndentedString(specialKeywords)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    paymentRequests: ").append(toIndentedString(paymentRequests)).append("\n");
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

