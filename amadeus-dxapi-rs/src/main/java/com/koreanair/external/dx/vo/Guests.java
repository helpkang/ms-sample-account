package com.koreanair.external.dx.vo;

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

public class Guests  {
  
  @ApiModelProperty(value = "Number of adults.")
 /**
   * Number of adults.
  **/
  private Integer adults = null;

  @ApiModelProperty(value = "Comma separated list of ages of each child. If 2 children have the same age, it will be repeated here.")
 /**
   * Comma separated list of ages of each child. If 2 children have the same age, it will be repeated here.
  **/
  private List<Integer> childAges = null;
 /**
   * Number of adults.
   * @return adults
  **/
  @JsonProperty("adults")
  public Integer getAdults() {
    return adults;
  }

  public void setAdults(Integer adults) {
    this.adults = adults;
  }

  public Guests adults(Integer adults) {
    this.adults = adults;
    return this;
  }

 /**
   * Comma separated list of ages of each child. If 2 children have the same age, it will be repeated here.
   * @return childAges
  **/
  @JsonProperty("childAges")
  public List<Integer> getChildAges() {
    return childAges;
  }

  public void setChildAges(List<Integer> childAges) {
    this.childAges = childAges;
  }

  public Guests childAges(List<Integer> childAges) {
    this.childAges = childAges;
    return this;
  }

  public Guests addChildAgesItem(Integer childAgesItem) {
    this.childAges.add(childAgesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guests {\n");
    
    sb.append("    adults: ").append(toIndentedString(adults)).append("\n");
    sb.append("    childAges: ").append(toIndentedString(childAges)).append("\n");
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

