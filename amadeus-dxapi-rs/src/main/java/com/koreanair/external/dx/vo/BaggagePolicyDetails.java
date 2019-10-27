package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BaggageAllowanceDetail;
import com.koreanair.external.dx.vo.BaggagePolicyDetailItem;
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
  * This object contains the baggage policy details for a specific recommendation
 **/
@ApiModel(description="This object contains the baggage policy details for a specific recommendation")
public class BaggagePolicyDetails  {
  

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("weight") WEIGHT(String.valueOf("weight")), @XmlEnumValue("piece") PIECE(String.valueOf("piece"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Baggage allowance by weight (expressed in kilograms or pounds) or by pieces")
 /**
   * Baggage allowance by weight (expressed in kilograms or pounds) or by pieces
  **/
  private TypeEnum type = null;

  @ApiModelProperty(value = "Baggage allowance by weight (expressed in the unit below)")
 /**
   * Baggage allowance by weight (expressed in the unit below)
  **/
  private String weightAmount = null;


@XmlType(name="WeightUnitEnum")
@XmlEnum(String.class)
public enum WeightUnitEnum {

@XmlEnumValue("kilogram") KILOGRAM(String.valueOf("kilogram")), @XmlEnumValue("pound") POUND(String.valueOf("pound"));


    private String value;

    WeightUnitEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static WeightUnitEnum fromValue(String v) {
        for (WeightUnitEnum b : WeightUnitEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Weight unit used in baggage allowance")
 /**
   * Weight unit used in baggage allowance
  **/
  private WeightUnitEnum weightUnit = null;

  @ApiModelProperty(value = "If the field 'type' is returned, this field represents the baggage allowance by piece or weight. If the field 'type' is not returned, this field represents the baggage allowance by piece.          ")
 /**
   * If the field 'type' is returned, this field represents the baggage allowance by piece or weight. If the field 'type' is not returned, this field represents the baggage allowance by piece.          
  **/
  private Integer quantity = null;

  @ApiModelProperty(value = "List of applicable restrictions")
 /**
   * List of applicable restrictions
  **/
  private List<BaggagePolicyDetailItem> baggageCharacteristics = null;
 /**
   * Baggage allowance by weight (expressed in kilograms or pounds) or by pieces
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BaggagePolicyDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Baggage allowance by weight (expressed in the unit below)
   * @return weightAmount
  **/
  @JsonProperty("weightAmount")
  public String getWeightAmount() {
    return weightAmount;
  }

  public void setWeightAmount(String weightAmount) {
    this.weightAmount = weightAmount;
  }

  public BaggagePolicyDetails weightAmount(String weightAmount) {
    this.weightAmount = weightAmount;
    return this;
  }

 /**
   * Weight unit used in baggage allowance
   * @return weightUnit
  **/
  @JsonProperty("weightUnit")
  public String getWeightUnit() {
    if (weightUnit == null) {
      return null;
    }
    return weightUnit.value();
  }

  public void setWeightUnit(WeightUnitEnum weightUnit) {
    this.weightUnit = weightUnit;
  }

  public BaggagePolicyDetails weightUnit(WeightUnitEnum weightUnit) {
    this.weightUnit = weightUnit;
    return this;
  }

 /**
   * If the field &#39;type&#39; is returned, this field represents the baggage allowance by piece or weight. If the field &#39;type&#39; is not returned, this field represents the baggage allowance by piece.          
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public BaggagePolicyDetails quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * List of applicable restrictions
   * @return baggageCharacteristics
  **/
  @JsonProperty("baggageCharacteristics")
  public List<BaggagePolicyDetailItem> getBaggageCharacteristics() {
    return baggageCharacteristics;
  }

  public void setBaggageCharacteristics(List<BaggagePolicyDetailItem> baggageCharacteristics) {
    this.baggageCharacteristics = baggageCharacteristics;
  }

  public BaggagePolicyDetails baggageCharacteristics(List<BaggagePolicyDetailItem> baggageCharacteristics) {
    this.baggageCharacteristics = baggageCharacteristics;
    return this;
  }

  public BaggagePolicyDetails addBaggageCharacteristicsItem(BaggagePolicyDetailItem baggageCharacteristicsItem) {
    this.baggageCharacteristics.add(baggageCharacteristicsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaggagePolicyDetails {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    weightAmount: ").append(toIndentedString(weightAmount)).append("\n");
    sb.append("    weightUnit: ").append(toIndentedString(weightUnit)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    baggageCharacteristics: ").append(toIndentedString(baggageCharacteristics)).append("\n");
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

