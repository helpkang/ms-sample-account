package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.PaymentMethod;
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
  * A payment request contains: - the payment method to use for the payment - the amount and currency to be paid using that method Supported payment methods are: MilesPayment, PaymentCard, ExternalPayment or VoucherPayment.
 **/
@ApiModel(description="A payment request contains: - the payment method to use for the payment - the amount and currency to be paid using that method Supported payment methods are: MilesPayment, PaymentCard, ExternalPayment or VoucherPayment.")
public class OptionalPaymentRequest  {
  
  @ApiModelProperty(value = "PaymentMethod used for this part of the payment")
 /**
   * PaymentMethod used for this part of the payment
  **/
  private PaymentMethod paymentMethod = null;

  @ApiModelProperty(value = "Amount to be paid for this part of the payment")
 /**
   * Amount to be paid for this part of the payment
  **/
  private Amount amount = null;
 /**
   * PaymentMethod used for this part of the payment
   * @return paymentMethod
  **/
  @JsonProperty("paymentMethod")
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public OptionalPaymentRequest paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

 /**
   * Amount to be paid for this part of the payment
   * @return amount
  **/
  @JsonProperty("amount")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public OptionalPaymentRequest amount(Amount amount) {
    this.amount = amount;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionalPaymentRequest {\n");
    
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

