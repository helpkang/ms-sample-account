package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.ChecksumData;
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
  * Payment to be performed on a third party Payment Service Provider (PSP), that the airline has a contract with. The Payment Service Provider (PSP) handles in this case the payment as well as the payment capture, which generates an external payment reference. Derived from PaymentMethod object by polymorphism. 
 **/
@ApiModel(description="Payment to be performed on a third party Payment Service Provider (PSP), that the airline has a contract with. The Payment Service Provider (PSP) handles in this case the payment as well as the payment capture, which generates an external payment reference. Derived from PaymentMethod object by polymorphism. ")
public class ExternalPayment extends PaymentMethod {
  
  @ApiModelProperty(value = "Payment reference generated by the external Payment Service Provider (PSP), which is used as a proof of payment for the PSP.")
 /**
   * Payment reference generated by the external Payment Service Provider (PSP), which is used as a proof of payment for the PSP.
  **/
  private String externalPaymentRecordId = null;

  @ApiModelProperty(value = "Contains the checksum value. Given that the payment is performed on an external system, the system requires indeed to check that the payment request can be trusted and is originated from the API user. This prevents any malicious third party from sending invalid payment confirmation for the order and also prevents request tampering. ")
 /**
   * Contains the checksum value. Given that the payment is performed on an external system, the system requires indeed to check that the payment request can be trusted and is originated from the API user. This prevents any malicious third party from sending invalid payment confirmation for the order and also prevents request tampering. 
  **/
  private String checksum = null;

  @ApiModelProperty(value = "")
  private ChecksumData checksumData = null;
 /**
   * Payment reference generated by the external Payment Service Provider (PSP), which is used as a proof of payment for the PSP.
   * @return externalPaymentRecordId
  **/
  @JsonProperty("externalPaymentRecordId")
  public String getExternalPaymentRecordId() {
    return externalPaymentRecordId;
  }

  public void setExternalPaymentRecordId(String externalPaymentRecordId) {
    this.externalPaymentRecordId = externalPaymentRecordId;
  }

  public ExternalPayment externalPaymentRecordId(String externalPaymentRecordId) {
    this.externalPaymentRecordId = externalPaymentRecordId;
    return this;
  }

 /**
   * Contains the checksum value. Given that the payment is performed on an external system, the system requires indeed to check that the payment request can be trusted and is originated from the API user. This prevents any malicious third party from sending invalid payment confirmation for the order and also prevents request tampering. 
   * @return checksum
  **/
  @JsonProperty("checksum")
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public ExternalPayment checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

 /**
   * Get checksumData
   * @return checksumData
  **/
  @JsonProperty("checksumData")
  public ChecksumData getChecksumData() {
    return checksumData;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPayment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    externalPaymentRecordId: ").append(toIndentedString(externalPaymentRecordId)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    checksumData: ").append(toIndentedString(checksumData)).append("\n");
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

