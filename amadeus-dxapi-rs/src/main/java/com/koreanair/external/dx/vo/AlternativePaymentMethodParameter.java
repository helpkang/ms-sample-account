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
  * Needed information to be provided for the payment. 
 **/
@ApiModel(description="Needed information to be provided for the payment. ")
public class AlternativePaymentMethodParameter  {
  
  @ApiModelProperty(value = "Parameter key")
 /**
   * Parameter key
  **/
  private String key = null;


@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("string") STRING(String.valueOf("string")), @XmlEnumValue("numeric") NUMERIC(String.valueOf("numeric")), @XmlEnumValue("alpha") ALPHA(String.valueOf("alpha")), @XmlEnumValue("alphanumeric") ALPHANUMERIC(String.valueOf("alphanumeric"));


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

  @ApiModelProperty(value = "Parameter type e.g. string, numeric, alphanumeric. Available only for CustomPayment methods.")
 /**
   * Parameter type e.g. string, numeric, alphanumeric. Available only for CustomPayment methods.
  **/
  private TypeEnum type = null;

  @ApiModelProperty(value = "Indicates whether the parameter is mandatory or not.")
 /**
   * Indicates whether the parameter is mandatory or not.
  **/
  private Boolean isMandatory = null;

  @ApiModelProperty(value = "Regular expression for the value of the parameter. ")
 /**
   * Regular expression for the value of the parameter. 
  **/
  private String format = null;

  @ApiModelProperty(value = "Value sent for the parameter")
 /**
   * Value sent for the parameter
  **/
  private String value = null;
 /**
   * Parameter key
   * @return key
  **/
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public AlternativePaymentMethodParameter key(String key) {
    this.key = key;
    return this;
  }

 /**
   * Parameter type e.g. string, numeric, alphanumeric. Available only for CustomPayment methods.
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

  public AlternativePaymentMethodParameter type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Indicates whether the parameter is mandatory or not.
   * @return isMandatory
  **/
  @JsonProperty("isMandatory")
  public Boolean isIsMandatory() {
    return isMandatory;
  }

  public void setIsMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
  }

  public AlternativePaymentMethodParameter isMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
    return this;
  }

 /**
   * Regular expression for the value of the parameter. 
   * @return format
  **/
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public AlternativePaymentMethodParameter format(String format) {
    this.format = format;
    return this;
  }

 /**
   * Value sent for the parameter
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public AlternativePaymentMethodParameter value(String value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativePaymentMethodParameter {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

