package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BaseTotalAmount;
import com.koreanair.external.dx.vo.PriceVariation;
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
  * it shows the rate changes during the stay and the average daily rate
 **/
@ApiModel(description="it shows the rate changes during the stay and the average daily rate")
public class PriceVariations  {
  
  @ApiModelProperty(value = "")
  private BaseTotalAmount average = null;

  @ApiModelProperty(value = "A collection of rate changes")
 /**
   * A collection of rate changes
  **/
  private List<PriceVariation> changes = null;
 /**
   * Get average
   * @return average
  **/
  @JsonProperty("average")
  public BaseTotalAmount getAverage() {
    return average;
  }

  public void setAverage(BaseTotalAmount average) {
    this.average = average;
  }

  public PriceVariations average(BaseTotalAmount average) {
    this.average = average;
    return this;
  }

 /**
   * A collection of rate changes
   * @return changes
  **/
  @JsonProperty("changes")
  public List<PriceVariation> getChanges() {
    return changes;
  }

  public void setChanges(List<PriceVariation> changes) {
    this.changes = changes;
  }

  public PriceVariations changes(List<PriceVariation> changes) {
    this.changes = changes;
    return this;
  }

  public PriceVariations addChangesItem(PriceVariation changesItem) {
    this.changes.add(changesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceVariations {\n");
    
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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

