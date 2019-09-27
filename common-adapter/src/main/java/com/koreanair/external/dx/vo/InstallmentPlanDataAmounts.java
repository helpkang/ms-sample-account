package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
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
  * The total amount to be paid is the sum of the price of the  booking plus the interest (if applicable) due to the use of installments. This total amount is split in a 'first' installment, and the remaining amount  is then split in alicuote 'next' installments. The interest is already included in  the calculated installment amounts. It is also returned separately for  information purposes.  E.g. the price of one Order is 250 EUROS. The plan to pay in 3 installments has  an interest of 5 EUROS. One example of the amounts returned would be: - first: 155 EUROS - next: 50 EUROS - interest: 5 EUROS The 'first' installment includes 150 EUROS from the price of the Order plus the  5 EUROS from the interest. The remaining 100 EUROS is split in two 'next' intallments  of 50 EUROS. 
 **/
@ApiModel(description="The total amount to be paid is the sum of the price of the  booking plus the interest (if applicable) due to the use of installments. This total amount is split in a 'first' installment, and the remaining amount  is then split in alicuote 'next' installments. The interest is already included in  the calculated installment amounts. It is also returned separately for  information purposes.  E.g. the price of one Order is 250 EUROS. The plan to pay in 3 installments has  an interest of 5 EUROS. One example of the amounts returned would be: - first: 155 EUROS - next: 50 EUROS - interest: 5 EUROS The 'first' installment includes 150 EUROS from the price of the Order plus the  5 EUROS from the interest. The remaining 100 EUROS is split in two 'next' intallments  of 50 EUROS. ")
public class InstallmentPlanDataAmounts  {
  
  @ApiModelProperty(value = "Amount and currency of the first installment. ")
 /**
   * Amount and currency of the first installment. 
  **/
  private Amount first = null;

  @ApiModelProperty(value = "Amount and currency of the next installments after the first installment. ")
 /**
   * Amount and currency of the next installments after the first installment. 
  **/
  private Amount next = null;

  @ApiModelProperty(value = "Amount and currency of the interest. It is already included  in all the installments plan. ")
 /**
   * Amount and currency of the interest. It is already included  in all the installments plan. 
  **/
  private Amount interest = null;
 /**
   * Amount and currency of the first installment. 
   * @return first
  **/
  @JsonProperty("first")
  public Amount getFirst() {
    return first;
  }

  public void setFirst(Amount first) {
    this.first = first;
  }

  public InstallmentPlanDataAmounts first(Amount first) {
    this.first = first;
    return this;
  }

 /**
   * Amount and currency of the next installments after the first installment. 
   * @return next
  **/
  @JsonProperty("next")
  public Amount getNext() {
    return next;
  }

  public void setNext(Amount next) {
    this.next = next;
  }

  public InstallmentPlanDataAmounts next(Amount next) {
    this.next = next;
    return this;
  }

 /**
   * Amount and currency of the interest. It is already included  in all the installments plan. 
   * @return interest
  **/
  @JsonProperty("interest")
  public Amount getInterest() {
    return interest;
  }

  public void setInterest(Amount interest) {
    this.interest = interest;
  }

  public InstallmentPlanDataAmounts interest(Amount interest) {
    this.interest = interest;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPlanDataAmounts {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
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

