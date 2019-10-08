package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AlternativePaymentMethodParameter;
import com.koreanair.external.dx.vo.AlternativePaymentMethodProperties;
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
  * Payment is done with AlternativePaymentMethod. The payment can be done with or without redirection, with or without parameters. E.g. \"PayPal\", \"Alipay\" or \"Boleto\". The payment method provides a direct link with payment providers, fully integrated with the order creation and payment. Derived from PaymentMethod object by polymorphism. To see the structure, please check [Payment Methods  documentation](http://e-travel.mkt.amadeus.net/dxapi/display/payment_methods.html#!/PaymentMethod/get) 
 **/
@ApiModel(description="Payment is done with AlternativePaymentMethod. The payment can be done with or without redirection, with or without parameters. E.g. \"PayPal\", \"Alipay\" or \"Boleto\". The payment method provides a direct link with payment providers, fully integrated with the order creation and payment. Derived from PaymentMethod object by polymorphism. To see the structure, please check [Payment Methods  documentation](http://e-travel.mkt.amadeus.net/dxapi/display/payment_methods.html#!/PaymentMethod/get) ")
public class AlternativePaymentMethod extends PaymentMethod {
  
  @ApiModelProperty(value = "Name of the Alternative Method of Payment to be used. E.g. 'Boleto'.")
 /**
   * Name of the Alternative Method of Payment to be used. E.g. 'Boleto'.
  **/
  private String name = null;


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

  @ApiModelProperty(value = "Payment status of the generated payment record")
 /**
   * Payment status of the generated payment record
  **/
  private StatusEnum status = null;

  @ApiModelProperty(value = "List of payment properties related to the Alternative Method of Payment. E.g. 'payment needs or not redirection'")
 /**
   * List of payment properties related to the Alternative Method of Payment. E.g. 'payment needs or not redirection'
  **/
  private AlternativePaymentMethodProperties properties = null;

  @ApiModelProperty(value = "List of parameters to be sent in input to pay with Alternative Method of Payment")
 /**
   * List of parameters to be sent in input to pay with Alternative Method of Payment
  **/
  private List<AlternativePaymentMethodParameter> parameters = null;
 /**
   * Name of the Alternative Method of Payment to be used. E.g. &#39;Boleto&#39;.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AlternativePaymentMethod name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Payment status of the generated payment record
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

  public AlternativePaymentMethod status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * List of payment properties related to the Alternative Method of Payment. E.g. &#39;payment needs or not redirection&#39;
   * @return properties
  **/
  @JsonProperty("properties")
  public AlternativePaymentMethodProperties getProperties() {
    return properties;
  }

  public void setProperties(AlternativePaymentMethodProperties properties) {
    this.properties = properties;
  }

  public AlternativePaymentMethod properties(AlternativePaymentMethodProperties properties) {
    this.properties = properties;
    return this;
  }

 /**
   * List of parameters to be sent in input to pay with Alternative Method of Payment
   * @return parameters
  **/
  @JsonProperty("parameters")
  public List<AlternativePaymentMethodParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<AlternativePaymentMethodParameter> parameters) {
    this.parameters = parameters;
  }

  public AlternativePaymentMethod parameters(List<AlternativePaymentMethodParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public AlternativePaymentMethod addParametersItem(AlternativePaymentMethodParameter parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativePaymentMethod {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

