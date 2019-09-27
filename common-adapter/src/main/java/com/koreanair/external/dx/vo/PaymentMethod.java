package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;

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
  * Payment method that can be used to pay for an order. To see the structure of the different payment methods, please check [Payment Methods documentation](http://e-travel.mkt.amadeus.net/dxapi/display/payment_methods.html#!/PaymentMethod/get) 
 **/
@ApiModel(description="Payment method that can be used to pay for an order. To see the structure of the different payment methods, please check [Payment Methods documentation](http://e-travel.mkt.amadeus.net/dxapi/display/payment_methods.html#!/PaymentMethod/get) ")
public class PaymentMethod  {
  
  @ApiModelProperty(value = "Id of the payment method.")
 /**
   * Id of the payment method.
  **/
  private String id = null;

  @ApiModelProperty(value = "temporary Id of the payment method.")
 /**
   * temporary Id of the payment method.
  **/
  private String tid = null;


@XmlType(name="PaymentTypeEnum")
@XmlEnum(String.class)
public enum PaymentTypeEnum {

@XmlEnumValue("PaymentCard") PAYMENTCARD(String.valueOf("PaymentCard")), @XmlEnumValue("ExternalPayment") EXTERNALPAYMENT(String.valueOf("ExternalPayment")), @XmlEnumValue("MilesPayment") MILESPAYMENT(String.valueOf("MilesPayment")), @XmlEnumValue("AlternativePaymentMethod") ALTERNATIVEPAYMENTMETHOD(String.valueOf("AlternativePaymentMethod")), @XmlEnumValue("VoucherPayment") VOUCHERPAYMENT(String.valueOf("VoucherPayment")), @XmlEnumValue("CustomPayment") CUSTOMPAYMENT(String.valueOf("CustomPayment"));


    private String value;

    PaymentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PaymentTypeEnum fromValue(String v) {
        for (PaymentTypeEnum b : PaymentTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Payment type for that payment method e.g. Payment Card, External Payment. To see the structure of the different payment methods, please check [Payment Methods documentation](http://e-travel.mkt.amadeus.net/dxapi/display/payment_methods.html#!/PaymentMethod/get) ")
 /**
   * Payment type for that payment method e.g. Payment Card, External Payment. To see the structure of the different payment methods, please check [Payment Methods documentation](http://e-travel.mkt.amadeus.net/dxapi/display/payment_methods.html#!/PaymentMethod/get) 
  **/
  private PaymentTypeEnum paymentType = null;
 /**
   * Id of the payment method.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentMethod id(String id) {
    this.id = id;
    return this;
  }

 /**
   * temporary Id of the payment method.
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public PaymentMethod tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * Payment type for that payment method e.g. Payment Card, External Payment. To see the structure of the different payment methods, please check [Payment Methods documentation](http://e-travel.mkt.amadeus.net/dxapi/display/payment_methods.html#!/PaymentMethod/get) 
   * @return paymentType
  **/
  @JsonProperty("paymentType")
  public String getPaymentType() {
    if (paymentType == null) {
      return null;
    }
    return paymentType.value();
  }

  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }

  public PaymentMethod paymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
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

