package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.CarInsuranceDocument;
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

public class Coverage  {
  
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

  @ApiModelProperty(value = "")
  private String code = null;

  @ApiModelProperty(value = "Excess amount to be paid if the the coverage it is being activated")
 /**
   * Excess amount to be paid if the the coverage it is being activated
  **/
  private Long excess = null;

  @ApiModelProperty(value = "Liability amount covered by this coverage")
 /**
   * Liability amount covered by this coverage
  **/
  private Long liability = null;


@XmlType(name="PricingTimeWindowEnum")
@XmlEnum(String.class)
public enum PricingTimeWindowEnum {

@XmlEnumValue("hourly") HOURLY(String.valueOf("hourly")), @XmlEnumValue("daily") DAILY(String.valueOf("daily")), @XmlEnumValue("monthly") MONTHLY(String.valueOf("monthly")), @XmlEnumValue("weekend") WEEKEND(String.valueOf("weekend")), @XmlEnumValue("weekly") WEEKLY(String.valueOf("weekly")), @XmlEnumValue("fullPeriod") FULLPERIOD(String.valueOf("fullPeriod"));


    private String value;

    PricingTimeWindowEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PricingTimeWindowEnum fromValue(String v) {
        for (PricingTimeWindowEnum b : PricingTimeWindowEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Period for which the coverage pricing applies")
 /**
   * Period for which the coverage pricing applies
  **/
  private PricingTimeWindowEnum pricingTimeWindow = null;

  @ApiModelProperty(value = "The car insurance documents containing the policy (terms and conditions), its summary and the final contract (with the policy's personal details) in case of a reservation. These documents will be accesssed from an URL given by the car company. ")
 /**
   * The car insurance documents containing the policy (terms and conditions), its summary and the final contract (with the policy's personal details) in case of a reservation. These documents will be accesssed from an URL given by the car company. 
  **/
  private List<CarInsuranceDocument> insuranceDocuments = null;
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

  public Coverage value(Long value) {
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

  public Coverage currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Coverage code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Excess amount to be paid if the the coverage it is being activated
   * minimum: 0
   * @return excess
  **/
  @JsonProperty("excess")
  public Long getExcess() {
    return excess;
  }

  public void setExcess(Long excess) {
    this.excess = excess;
  }

  public Coverage excess(Long excess) {
    this.excess = excess;
    return this;
  }

 /**
   * Liability amount covered by this coverage
   * minimum: 0
   * @return liability
  **/
  @JsonProperty("liability")
  public Long getLiability() {
    return liability;
  }

  public void setLiability(Long liability) {
    this.liability = liability;
  }

  public Coverage liability(Long liability) {
    this.liability = liability;
    return this;
  }

 /**
   * Period for which the coverage pricing applies
   * @return pricingTimeWindow
  **/
  @JsonProperty("pricingTimeWindow")
  public String getPricingTimeWindow() {
    if (pricingTimeWindow == null) {
      return null;
    }
    return pricingTimeWindow.value();
  }

  public void setPricingTimeWindow(PricingTimeWindowEnum pricingTimeWindow) {
    this.pricingTimeWindow = pricingTimeWindow;
  }

  public Coverage pricingTimeWindow(PricingTimeWindowEnum pricingTimeWindow) {
    this.pricingTimeWindow = pricingTimeWindow;
    return this;
  }

 /**
   * The car insurance documents containing the policy (terms and conditions), its summary and the final contract (with the policy&#39;s personal details) in case of a reservation. These documents will be accesssed from an URL given by the car company. 
   * @return insuranceDocuments
  **/
  @JsonProperty("insuranceDocuments")
  public List<CarInsuranceDocument> getInsuranceDocuments() {
    return insuranceDocuments;
  }

  public void setInsuranceDocuments(List<CarInsuranceDocument> insuranceDocuments) {
    this.insuranceDocuments = insuranceDocuments;
  }

  public Coverage insuranceDocuments(List<CarInsuranceDocument> insuranceDocuments) {
    this.insuranceDocuments = insuranceDocuments;
    return this;
  }

  public Coverage addInsuranceDocumentsItem(CarInsuranceDocument insuranceDocumentsItem) {
    this.insuranceDocuments.add(insuranceDocumentsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coverage {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    excess: ").append(toIndentedString(excess)).append("\n");
    sb.append("    liability: ").append(toIndentedString(liability)).append("\n");
    sb.append("    pricingTimeWindow: ").append(toIndentedString(pricingTimeWindow)).append("\n");
    sb.append("    insuranceDocuments: ").append(toIndentedString(insuranceDocuments)).append("\n");
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

