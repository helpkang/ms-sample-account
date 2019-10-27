package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Fee  {
  
  @ApiModelProperty(required = true, value = "Amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2. ")
 /**
   * Amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2. 
  **/
  private Long value = null;

  @ApiModelProperty(required = true, value = "ISO currency code (http://www.iso.org/iso/home/standards/currency_codes.htm). For points (or miles) the code associated is `MIL`, for compensation/upgrade credits `ECR`")
 /**
   * ISO currency code (http://www.iso.org/iso/home/standards/currency_codes.htm). For points (or miles) the code associated is `MIL`, for compensation/upgrade credits `ECR`
  **/
  private String currencyCode = null;

  @ApiModelProperty(value = "Fee code")
 /**
   * Fee code
  **/
  private String code = null;


@XmlType(name="NatureEnum")
@XmlEnum(String.class)
public enum NatureEnum {

@XmlEnumValue("ticketing") TICKETING(String.valueOf("ticketing")), @XmlEnumValue("paymentCard") PAYMENTCARD(String.valueOf("paymentCard"));


    private String value;

    NatureEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NatureEnum fromValue(String v) {
        for (NatureEnum b : NatureEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Type of fee")
 /**
   * Type of fee
  **/
  private NatureEnum nature = null;

  @ApiModelProperty(value = "Minimum fee amount")
 /**
   * Minimum fee amount
  **/
  private Long minAmount = null;

  @ApiModelProperty(value = "Maximum fee amount")
 /**
   * Maximum fee amount
  **/
  private Long maxAmount = null;
 /**
   * Amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \&quot;EUR 100.85\&quot; will be represented as &#x60;10085&#x60;, with the currency &#x60;decimalPlaces&#x60; &#x3D; 2. 
   * minimum: 0
   * @return value
  **/
  @JsonProperty("value")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public Fee value(Long value) {
    this.value = value;
    return this;
  }

 /**
   * ISO currency code (http://www.iso.org/iso/home/standards/currency_codes.htm). For points (or miles) the code associated is &#x60;MIL&#x60;, for compensation/upgrade credits &#x60;ECR&#x60;
   * @return currencyCode
  **/
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Fee currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

 /**
   * Fee code
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Fee code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Type of fee
   * @return nature
  **/
  @JsonProperty("nature")
  public String getNature() {
    if (nature == null) {
      return null;
    }
    return nature.value();
  }

  public void setNature(NatureEnum nature) {
    this.nature = nature;
  }

  public Fee nature(NatureEnum nature) {
    this.nature = nature;
    return this;
  }

 /**
   * Minimum fee amount
   * minimum: 0
   * @return minAmount
  **/
  @JsonProperty("minAmount")
  public Long getMinAmount() {
    return minAmount;
  }

  public void setMinAmount(Long minAmount) {
    this.minAmount = minAmount;
  }

  public Fee minAmount(Long minAmount) {
    this.minAmount = minAmount;
    return this;
  }

 /**
   * Maximum fee amount
   * minimum: 0
   * @return maxAmount
  **/
  @JsonProperty("maxAmount")
  public Long getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(Long maxAmount) {
    this.maxAmount = maxAmount;
  }

  public Fee maxAmount(Long maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fee {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
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

