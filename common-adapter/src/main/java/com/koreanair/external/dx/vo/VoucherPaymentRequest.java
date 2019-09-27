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
  * The payment request for the voucher creation. A payment request contains: - the payment method to use for the payment - the amount and currency to be paid using that method   Today, only PaymentCard is supported. 
 **/
@ApiModel(description="The payment request for the voucher creation. A payment request contains: - the payment method to use for the payment - the amount and currency to be paid using that method   Today, only PaymentCard is supported. ")
public class VoucherPaymentRequest  {
  
  @ApiModelProperty(value = "PaymentMethod used for this part of the payment. Can be optional in case a voucher with no initial amount needs be requested.")
 /**
   * PaymentMethod used for this part of the payment. Can be optional in case a voucher with no initial amount needs be requested.
  **/
  private PaymentMethod paymentMethod = null;

  @ApiModelProperty(required = true, value = "Amount to be paid for this part of the payment. If value is 0, no paymentMethod is needed.")
 /**
   * Amount to be paid for this part of the payment. If value is 0, no paymentMethod is needed.
  **/
  private Amount amount = null;
 /**
   * PaymentMethod used for this part of the payment. Can be optional in case a voucher with no initial amount needs be requested.
   * @return paymentMethod
  **/
  @JsonProperty("paymentMethod")
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public VoucherPaymentRequest paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

 /**
   * Amount to be paid for this part of the payment. If value is 0, no paymentMethod is needed.
   * @return amount
  **/
  @JsonProperty("amount")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public VoucherPaymentRequest amount(Amount amount) {
    this.amount = amount;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherPaymentRequest {\n");
    
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

