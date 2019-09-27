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
  * Object used to specify the information needed to retrieve a voucher. 
 **/
@ApiModel(description="Object used to specify the information needed to retrieve a voucher. ")
public class VoucherRetrieveRequest  {
  
  @ApiModelProperty(value = "A code associated to the voucher (if provided at creation time). Without a verificationCode, the voucher is accessible to anyone who has its id.")
 /**
   * A code associated to the voucher (if provided at creation time). Without a verificationCode, the voucher is accessible to anyone who has its id.
  **/
  private String verificationCode = null;
 /**
   * A code associated to the voucher (if provided at creation time). Without a verificationCode, the voucher is accessible to anyone who has its id.
   * @return verificationCode
  **/
  @JsonProperty("verificationCode")
  public String getVerificationCode() {
    return verificationCode;
  }

  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }

  public VoucherRetrieveRequest verificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherRetrieveRequest {\n");
    
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

