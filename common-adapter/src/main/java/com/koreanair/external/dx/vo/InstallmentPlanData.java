package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.InstallmentPlanDataAmounts;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;

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
  * Indicates the details of the payment using installments. For each installment plan,  following information is returned:       - Number of installments - Amount and currency for the first installment - Amount and currency for the next installments - Amount and currency of the interest (if applicable) Only available for PaymentCard. 
 **/
@ApiModel(description="Indicates the details of the payment using installments. For each installment plan,  following information is returned:       - Number of installments - Amount and currency for the first installment - Amount and currency for the next installments - Amount and currency of the interest (if applicable) Only available for PaymentCard. ")
public class InstallmentPlanData  {
  
  @ApiModelProperty(value = "Number of installments in which the full amount of the payment is split. ")
 /**
   * Number of installments in which the full amount of the payment is split. 
  **/
  private BigDecimal numberOfInstallments = null;

  @ApiModelProperty(value = "")
  private InstallmentPlanDataAmounts amounts = null;
 /**
   * Number of installments in which the full amount of the payment is split. 
   * @return numberOfInstallments
  **/
  @JsonProperty("numberOfInstallments")
  public BigDecimal getNumberOfInstallments() {
    return numberOfInstallments;
  }

  public void setNumberOfInstallments(BigDecimal numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
  }

  public InstallmentPlanData numberOfInstallments(BigDecimal numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
    return this;
  }

 /**
   * Get amounts
   * @return amounts
  **/
  @JsonProperty("amounts")
  public InstallmentPlanDataAmounts getAmounts() {
    return amounts;
  }

  public void setAmounts(InstallmentPlanDataAmounts amounts) {
    this.amounts = amounts;
  }

  public InstallmentPlanData amounts(InstallmentPlanDataAmounts amounts) {
    this.amounts = amounts;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPlanData {\n");
    
    sb.append("    numberOfInstallments: ").append(toIndentedString(numberOfInstallments)).append("\n");
    sb.append("    amounts: ").append(toIndentedString(amounts)).append("\n");
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

