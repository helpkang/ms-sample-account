package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Coverage;
import com.koreanair.external.dx.vo.SpecialEquipment;
import com.koreanair.external.dx.vo.Surcharge;
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
  * This object includes all the additional options that can be selected at booking time (payNow) or at pickupTime (payLater)
 **/
@ApiModel(description="This object includes all the additional options that can be selected at booking time (payNow) or at pickupTime (payLater)")
public class CarAdditionalOptionsPrice  {
  
  @ApiModelProperty(value = "Surcharges breakdown List of surcharges such as the airport fee or the roadside assistance")
 /**
   * Surcharges breakdown List of surcharges such as the airport fee or the roadside assistance
  **/
  private List<Surcharge> surcharges = null;

  @ApiModelProperty(value = "List of special equipments such as a child seat or a navigational system")
 /**
   * List of special equipments such as a child seat or a navigational system
  **/
  private List<SpecialEquipment> specialEquipments = null;

  @ApiModelProperty(value = "Coverages breakdown List of coverages such as theft protection or collision damage")
 /**
   * Coverages breakdown List of coverages such as theft protection or collision damage
  **/
  private List<Coverage> coverages = null;
 /**
   * Surcharges breakdown List of surcharges such as the airport fee or the roadside assistance
   * @return surcharges
  **/
  @JsonProperty("surcharges")
  public List<Surcharge> getSurcharges() {
    return surcharges;
  }

  public void setSurcharges(List<Surcharge> surcharges) {
    this.surcharges = surcharges;
  }

  public CarAdditionalOptionsPrice surcharges(List<Surcharge> surcharges) {
    this.surcharges = surcharges;
    return this;
  }

  public CarAdditionalOptionsPrice addSurchargesItem(Surcharge surchargesItem) {
    this.surcharges.add(surchargesItem);
    return this;
  }

 /**
   * List of special equipments such as a child seat or a navigational system
   * @return specialEquipments
  **/
  @JsonProperty("specialEquipments")
  public List<SpecialEquipment> getSpecialEquipments() {
    return specialEquipments;
  }

  public void setSpecialEquipments(List<SpecialEquipment> specialEquipments) {
    this.specialEquipments = specialEquipments;
  }

  public CarAdditionalOptionsPrice specialEquipments(List<SpecialEquipment> specialEquipments) {
    this.specialEquipments = specialEquipments;
    return this;
  }

  public CarAdditionalOptionsPrice addSpecialEquipmentsItem(SpecialEquipment specialEquipmentsItem) {
    this.specialEquipments.add(specialEquipmentsItem);
    return this;
  }

 /**
   * Coverages breakdown List of coverages such as theft protection or collision damage
   * @return coverages
  **/
  @JsonProperty("coverages")
  public List<Coverage> getCoverages() {
    return coverages;
  }

  public void setCoverages(List<Coverage> coverages) {
    this.coverages = coverages;
  }

  public CarAdditionalOptionsPrice coverages(List<Coverage> coverages) {
    this.coverages = coverages;
    return this;
  }

  public CarAdditionalOptionsPrice addCoveragesItem(Coverage coveragesItem) {
    this.coverages.add(coveragesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarAdditionalOptionsPrice {\n");
    
    sb.append("    surcharges: ").append(toIndentedString(surcharges)).append("\n");
    sb.append("    specialEquipments: ").append(toIndentedString(specialEquipments)).append("\n");
    sb.append("    coverages: ").append(toIndentedString(coverages)).append("\n");
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

