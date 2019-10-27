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
  * Contain all the information for monetary conversion
 **/
@ApiModel(description="Contain all the information for monetary conversion")
public class PaymentCurrencyConversionProposalMerchantProvider  {
  

@XmlType(name="MerchantTypeEnum")
@XmlEnum(String.class)
public enum MerchantTypeEnum {

@XmlEnumValue("DCC") DCC(String.valueOf("DCC")), @XmlEnumValue("MCP") MCP(String.valueOf("MCP"));


    private String value;

    MerchantTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MerchantTypeEnum fromValue(String v) {
        for (MerchantTypeEnum b : MerchantTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Merchant type, can be either Dynamic Currency Conversion (DCC) or Multi Currency Processing (MCP)")
 /**
   * Merchant type, can be either Dynamic Currency Conversion (DCC) or Multi Currency Processing (MCP)
  **/
  private MerchantTypeEnum merchantType = null;

  @ApiModelProperty(value = "Code of the company providing the proposal")
 /**
   * Code of the company providing the proposal
  **/
  private String code = null;

  @ApiModelProperty(value = "Name of the company providing the proposal")
 /**
   * Name of the company providing the proposal
  **/
  private String name = null;
 /**
   * Merchant type, can be either Dynamic Currency Conversion (DCC) or Multi Currency Processing (MCP)
   * @return merchantType
  **/
  @JsonProperty("merchantType")
  public String getMerchantType() {
    if (merchantType == null) {
      return null;
    }
    return merchantType.value();
  }

  public void setMerchantType(MerchantTypeEnum merchantType) {
    this.merchantType = merchantType;
  }

  public PaymentCurrencyConversionProposalMerchantProvider merchantType(MerchantTypeEnum merchantType) {
    this.merchantType = merchantType;
    return this;
  }

 /**
   * Code of the company providing the proposal
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PaymentCurrencyConversionProposalMerchantProvider code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Name of the company providing the proposal
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PaymentCurrencyConversionProposalMerchantProvider name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCurrencyConversionProposalMerchantProvider {\n");
    
    sb.append("    merchantType: ").append(toIndentedString(merchantType)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

