package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FrequentFlyer;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InsuranceItemRequest  {
  
  @ApiModelProperty(required = true, value = "Id of the insurance")
 /**
   * Id of the insurance
  **/
  private String insuranceOfferId = null;

  @ApiModelProperty(value = "Frequent flyer card to be used for miles accrual upon insurance booking")
 /**
   * Frequent flyer card to be used for miles accrual upon insurance booking
  **/
  private FrequentFlyer frequentFlyer = null;
 /**
   * Id of the insurance
   * @return insuranceOfferId
  **/
  @JsonProperty("insuranceOfferId")
  public String getInsuranceOfferId() {
    return insuranceOfferId;
  }

  public void setInsuranceOfferId(String insuranceOfferId) {
    this.insuranceOfferId = insuranceOfferId;
  }

  public InsuranceItemRequest insuranceOfferId(String insuranceOfferId) {
    this.insuranceOfferId = insuranceOfferId;
    return this;
  }

 /**
   * Frequent flyer card to be used for miles accrual upon insurance booking
   * @return frequentFlyer
  **/
  @JsonProperty("frequentFlyer")
  public FrequentFlyer getFrequentFlyer() {
    return frequentFlyer;
  }

  public void setFrequentFlyer(FrequentFlyer frequentFlyer) {
    this.frequentFlyer = frequentFlyer;
  }

  public InsuranceItemRequest frequentFlyer(FrequentFlyer frequentFlyer) {
    this.frequentFlyer = frequentFlyer;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceItemRequest {\n");
    
    sb.append("    insuranceOfferId: ").append(toIndentedString(insuranceOfferId)).append("\n");
    sb.append("    frequentFlyer: ").append(toIndentedString(frequentFlyer)).append("\n");
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

