package com.koreanair.external.dx.vo;

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
  * Structured baggage policy restrictions
 **/
@ApiModel(description="Structured baggage policy restrictions")
public class BaggagePolicyRestrictions  {
  

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("weight") WEIGHT(String.valueOf("weight")), @XmlEnumValue("size") SIZE(String.valueOf("size"));


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

  @ApiModelProperty(value = "Type of policy restriction (weight, size)")
 /**
   * Type of policy restriction (weight, size)
  **/
  private TypeEnum type = null;


@XmlType(name="QualifierEnum")
@XmlEnum(String.class)
public enum QualifierEnum {

@XmlEnumValue("upTo") UPTO(String.valueOf("upTo")), @XmlEnumValue("over") OVER(String.valueOf("over")), @XmlEnumValue("maxLength") MAXLENGTH(String.valueOf("maxLength"));


    private String value;

    QualifierEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static QualifierEnum fromValue(String v) {
        for (QualifierEnum b : QualifierEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private QualifierEnum qualifier = null;

  @ApiModelProperty(value = "Value of the policy restriction")
 /**
   * Value of the policy restriction
  **/
  private String value = null;


@XmlType(name="UnitEnum")
@XmlEnum(String.class)
public enum UnitEnum {

@XmlEnumValue("centimeter") CENTIMETER(String.valueOf("centimeter")), @XmlEnumValue("inch") INCH(String.valueOf("inch")), @XmlEnumValue("kilogram") KILOGRAM(String.valueOf("kilogram")), @XmlEnumValue("pound") POUND(String.valueOf("pound"));


    private String value;

    UnitEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UnitEnum fromValue(String v) {
        for (UnitEnum b : UnitEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Unit used in the policy description")
 /**
   * Unit used in the policy description
  **/
  private UnitEnum unit = null;
 /**
   * Type of policy restriction (weight, size)
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

  public BaggagePolicyRestrictions type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get qualifier
   * @return qualifier
  **/
  @JsonProperty("qualifier")
  public String getQualifier() {
    if (qualifier == null) {
      return null;
    }
    return qualifier.value();
  }

  public void setQualifier(QualifierEnum qualifier) {
    this.qualifier = qualifier;
  }

  public BaggagePolicyRestrictions qualifier(QualifierEnum qualifier) {
    this.qualifier = qualifier;
    return this;
  }

 /**
   * Value of the policy restriction
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public BaggagePolicyRestrictions value(String value) {
    this.value = value;
    return this;
  }

 /**
   * Unit used in the policy description
   * @return unit
  **/
  @JsonProperty("unit")
  public String getUnit() {
    if (unit == null) {
      return null;
    }
    return unit.value();
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  public BaggagePolicyRestrictions unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaggagePolicyRestrictions {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

