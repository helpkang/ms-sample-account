package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AlternativePaymentMethodParameter;
import com.koreanair.external.dx.vo.PaymentMethod;
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
  * Payment method defined by a list of parameters defined and customized by the airline. Example:  - Cash: it could be defined as a CustomPayment Method with no parameters. - Check number: it could be defined as a CustomPayment Method with 1 parameter e.g. the check number. The API does not perform any validation and processes on this payment method. The API user is responsible of processing and ensuring the payment is done. This is there therefore only available when the API user  consumes the API end points on a middleware/server. If the API user wishes to delegate the integration and link with the payment provider to the API,  AlternativePaymentMethod should be used. Derived from PaymentMethod object by polymorphism. 
 **/
@ApiModel(description="Payment method defined by a list of parameters defined and customized by the airline. Example:  - Cash: it could be defined as a CustomPayment Method with no parameters. - Check number: it could be defined as a CustomPayment Method with 1 parameter e.g. the check number. The API does not perform any validation and processes on this payment method. The API user is responsible of processing and ensuring the payment is done. This is there therefore only available when the API user  consumes the API end points on a middleware/server. If the API user wishes to delegate the integration and link with the payment provider to the API,  AlternativePaymentMethod should be used. Derived from PaymentMethod object by polymorphism. ")
public class CustomPayment extends PaymentMethod {
  
  @ApiModelProperty(value = "List of parameters to be sent in input to pay")
 /**
   * List of parameters to be sent in input to pay
  **/
  private List<AlternativePaymentMethodParameter> parameters = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("approved") APPROVED(String.valueOf("approved")), @XmlEnumValue("pending") PENDING(String.valueOf("pending")), @XmlEnumValue("denied") DENIED(String.valueOf("denied")), @XmlEnumValue("error") ERROR(String.valueOf("error"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Approval status of the payment record")
 /**
   * Approval status of the payment record
  **/
  private StatusEnum status = null;
 /**
   * List of parameters to be sent in input to pay
   * @return parameters
  **/
  @JsonProperty("parameters")
  public List<AlternativePaymentMethodParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<AlternativePaymentMethodParameter> parameters) {
    this.parameters = parameters;
  }

  public CustomPayment parameters(List<AlternativePaymentMethodParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public CustomPayment addParametersItem(AlternativePaymentMethodParameter parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

 /**
   * Approval status of the payment record
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CustomPayment status(StatusEnum status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomPayment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

