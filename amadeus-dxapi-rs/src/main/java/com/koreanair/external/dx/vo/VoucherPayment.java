package com.koreanair.external.dx.vo;

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
  * Voucher to use for the payment. In case, the voucher is associated with a verification code, it should be provided.
 **/
@ApiModel(description="Voucher to use for the payment. In case, the voucher is associated with a verification code, it should be provided.")
public class VoucherPayment extends PaymentMethod {
  
  @ApiModelProperty(value = "Verification code needed to use/retrieve the voucher. This field is needed only when a payment with the voucher is needed, it is not returned in any output.")
 /**
   * Verification code needed to use/retrieve the voucher. This field is needed only when a payment with the voucher is needed, it is not returned in any output.
  **/
  private String verificationCode = null;
 /**
   * Verification code needed to use/retrieve the voucher. This field is needed only when a payment with the voucher is needed, it is not returned in any output.
   * @return verificationCode
  **/
  @JsonProperty("verificationCode")
  public String getVerificationCode() {
    return verificationCode;
  }

  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }

  public VoucherPayment verificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherPayment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
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

