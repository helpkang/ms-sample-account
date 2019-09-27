package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.InsuranceItemRequest;
import com.koreanair.external.dx.vo.PaymentWithAssociationRequest;
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

public class PostOrderInsuranceRequest  {
  
  @ApiModelProperty(required = true, value = "List of insurances")
 /**
   * List of insurances
  **/
  private List<InsuranceItemRequest> insurances = new ArrayList<>();

  @ApiModelProperty(value = "A list of payment request")
 /**
   * A list of payment request
  **/
  private List<PaymentWithAssociationRequest> paymentRequests = null;
 /**
   * List of insurances
   * @return insurances
  **/
  @JsonProperty("insurances")
  public List<InsuranceItemRequest> getInsurances() {
    return insurances;
  }

  public void setInsurances(List<InsuranceItemRequest> insurances) {
    this.insurances = insurances;
  }

  public PostOrderInsuranceRequest insurances(List<InsuranceItemRequest> insurances) {
    this.insurances = insurances;
    return this;
  }

  public PostOrderInsuranceRequest addInsurancesItem(InsuranceItemRequest insurancesItem) {
    this.insurances.add(insurancesItem);
    return this;
  }

 /**
   * A list of payment request
   * @return paymentRequests
  **/
  @JsonProperty("paymentRequests")
  public List<PaymentWithAssociationRequest> getPaymentRequests() {
    return paymentRequests;
  }

  public void setPaymentRequests(List<PaymentWithAssociationRequest> paymentRequests) {
    this.paymentRequests = paymentRequests;
  }

  public PostOrderInsuranceRequest paymentRequests(List<PaymentWithAssociationRequest> paymentRequests) {
    this.paymentRequests = paymentRequests;
    return this;
  }

  public PostOrderInsuranceRequest addPaymentRequestsItem(PaymentWithAssociationRequest paymentRequestsItem) {
    this.paymentRequests.add(paymentRequestsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOrderInsuranceRequest {\n");
    
    sb.append("    insurances: ").append(toIndentedString(insurances)).append("\n");
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

