package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;
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

/**
  * Meal code specifies the type of meal available per booking class. B=BREAKFAST, K=CONTINENTAL BREAKFAST, L=LUNCH, D=DINNER, S=SNACK OR BRUNCH, O=COLD MEAL, H=HOT MEAL, M=MEAL (NON-SPECIFIC), R=REFRESHMENT, C=ALCOHOLIC BEVERAGES COMPLIMENTARY,F=FOOD FOR PURCHASE, P=ALCOHOLIC BEVERAGES FOR PURCHASE,  Y=DUTY FREE SALES AVAILABLE, N=NO MEAL SERVICE, V=REFRESHMENTS FOR PURCHASE, G=FOOD AND BEVERAGES FOR PURCHASE. Booking Class can be Y=Economy.
 **/
@ApiModel(description="Meal code specifies the type of meal available per booking class. B=BREAKFAST, K=CONTINENTAL BREAKFAST, L=LUNCH, D=DINNER, S=SNACK OR BRUNCH, O=COLD MEAL, H=HOT MEAL, M=MEAL (NON-SPECIFIC), R=REFRESHMENT, C=ALCOHOLIC BEVERAGES COMPLIMENTARY,F=FOOD FOR PURCHASE, P=ALCOHOLIC BEVERAGES FOR PURCHASE,  Y=DUTY FREE SALES AVAILABLE, N=NO MEAL SERVICE, V=REFRESHMENTS FOR PURCHASE, G=FOOD AND BEVERAGES FOR PURCHASE. Booking Class can be Y=Economy.")
public class Meal  {
  
  @ApiModelProperty(value = "Booking class")
 /**
   * Booking class
  **/
  private String bookingClass = null;

  @ApiModelProperty(value = "Meal Type")
 /**
   * Meal Type
  **/
  private List<String> mealCodes = null;
 /**
   * Booking class
   * @return bookingClass
  **/
  @JsonProperty("bookingClass")
  public String getBookingClass() {
    return bookingClass;
  }

  public void setBookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
  }

  public Meal bookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
    return this;
  }

 /**
   * Meal Type
   * @return mealCodes
  **/
  @JsonProperty("mealCodes")
  public List<String> getMealCodes() {
    return mealCodes;
  }

  public void setMealCodes(List<String> mealCodes) {
    this.mealCodes = mealCodes;
  }

  public Meal mealCodes(List<String> mealCodes) {
    this.mealCodes = mealCodes;
    return this;
  }

  public Meal addMealCodesItem(String mealCodesItem) {
    this.mealCodes.add(mealCodesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meal {\n");
    
    sb.append("    bookingClass: ").append(toIndentedString(bookingClass)).append("\n");
    sb.append("    mealCodes: ").append(toIndentedString(mealCodes)).append("\n");
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

