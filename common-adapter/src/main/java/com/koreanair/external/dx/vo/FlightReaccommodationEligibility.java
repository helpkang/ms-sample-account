package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.ChangeReaccommodationEligibility;
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
  * The eligibility to change a bound that has been reaccommodated after a disruption.
 **/
@ApiModel(description="The eligibility to change a bound that has been reaccommodated after a disruption.")
public class FlightReaccommodationEligibility  {
  
  @ApiModelProperty(required = true, value = "Indicates the eligibility to change a bound that has been reaccommodated after a disruption.")
 /**
   * Indicates the eligibility to change a bound that has been reaccommodated after a disruption.
  **/
  private List<ChangeReaccommodationEligibility> change = new ArrayList<>();
 /**
   * Indicates the eligibility to change a bound that has been reaccommodated after a disruption.
   * @return change
  **/
  @JsonProperty("change")
  public List<ChangeReaccommodationEligibility> getChange() {
    return change;
  }

  public void setChange(List<ChangeReaccommodationEligibility> change) {
    this.change = change;
  }

  public FlightReaccommodationEligibility change(List<ChangeReaccommodationEligibility> change) {
    this.change = change;
    return this;
  }

  public FlightReaccommodationEligibility addChangeItem(ChangeReaccommodationEligibility changeItem) {
    this.change.add(changeItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightReaccommodationEligibility {\n");
    
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
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

