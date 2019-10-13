package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.PaymentWithAssociationRequest;
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
  * Request to confirm a payment after redirection on an existing order.
 **/
@ApiModel(description="Request to confirm a payment after redirection on an existing order.")
public class OrderPaymentConfirmRequest  {
  
  @ApiModelProperty(required = true, value = "A list of payment requests. Each payment request contains a payment method and paymentResumption information to trigger the confirmation of the payment in the Order. Only AlternativePaymentMethod and PaymentCard enrolled for 3D Secure are supported. ")
 /**
   * A list of payment requests. Each payment request contains a payment method and paymentResumption information to trigger the confirmation of the payment in the Order. Only AlternativePaymentMethod and PaymentCard enrolled for 3D Secure are supported. 
  **/
  private List<PaymentWithAssociationRequest> paymentRequests = new ArrayList<>();
 /**
   * A list of payment requests. Each payment request contains a payment method and paymentResumption information to trigger the confirmation of the payment in the Order. Only AlternativePaymentMethod and PaymentCard enrolled for 3D Secure are supported. 
   * @return paymentRequests
  **/
  @JsonProperty("paymentRequests")
  public List<PaymentWithAssociationRequest> getPaymentRequests() {
    return paymentRequests;
  }

  public void setPaymentRequests(List<PaymentWithAssociationRequest> paymentRequests) {
    this.paymentRequests = paymentRequests;
  }

  public OrderPaymentConfirmRequest paymentRequests(List<PaymentWithAssociationRequest> paymentRequests) {
    this.paymentRequests = paymentRequests;
    return this;
  }

  public OrderPaymentConfirmRequest addPaymentRequestsItem(PaymentWithAssociationRequest paymentRequestsItem) {
    this.paymentRequests.add(paymentRequestsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPaymentConfirmRequest {\n");
    
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

