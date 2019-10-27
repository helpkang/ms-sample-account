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
  * Localization parameters can be used to build your customised fare conditions. To see the structure of the different types of LocalizationParameter, please see [Localization Parameter documentation](http://e-travel.mkt.amadeus.net/dxapi/display/localization_params.html#!/TemplateType/get) Type of the parameters could be: - DateTemplateParameter - DateTimeTemplateParameter - AmountTemplateParameter - BooleanTemplateParameter 
 **/
@ApiModel(description="Localization parameters can be used to build your customised fare conditions. To see the structure of the different types of LocalizationParameter, please see [Localization Parameter documentation](http://e-travel.mkt.amadeus.net/dxapi/display/localization_params.html#!/TemplateType/get) Type of the parameters could be: - DateTemplateParameter - DateTimeTemplateParameter - AmountTemplateParameter - BooleanTemplateParameter ")
public class LocalizationParameter  {
  

@XmlType(name="TemplateTypeEnum")
@XmlEnum(String.class)
public enum TemplateTypeEnum {

@XmlEnumValue("DateTemplateParameter") DATETEMPLATEPARAMETER(String.valueOf("DateTemplateParameter")), @XmlEnumValue("DateTimeTemplateParameter") DATETIMETEMPLATEPARAMETER(String.valueOf("DateTimeTemplateParameter")), @XmlEnumValue("AmountTemplateParameter") AMOUNTTEMPLATEPARAMETER(String.valueOf("AmountTemplateParameter")), @XmlEnumValue("BooleanTemplateParameter") BOOLEANTEMPLATEPARAMETER(String.valueOf("BooleanTemplateParameter"));


    private String value;

    TemplateTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TemplateTypeEnum fromValue(String v) {
        for (TemplateTypeEnum b : TemplateTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "LocalizationParameter types e.g. date, datetime, amount or boolean. To see the structure of the different template parameter types, please see [Localization Parameter Templates documentation](http://e-travel.mkt.amadeus.net/dxapi/display/localization_params.html#!/TemplateType/get) ")
 /**
   * LocalizationParameter types e.g. date, datetime, amount or boolean. To see the structure of the different template parameter types, please see [Localization Parameter Templates documentation](http://e-travel.mkt.amadeus.net/dxapi/display/localization_params.html#!/TemplateType/get) 
  **/
  private TemplateTypeEnum templateType = null;
 /**
   * LocalizationParameter types e.g. date, datetime, amount or boolean. To see the structure of the different template parameter types, please see [Localization Parameter Templates documentation](http://e-travel.mkt.amadeus.net/dxapi/display/localization_params.html#!/TemplateType/get) 
   * @return templateType
  **/
  @JsonProperty("templateType")
  public String getTemplateType() {
    if (templateType == null) {
      return null;
    }
    return templateType.value();
  }

  public void setTemplateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
  }

  public LocalizationParameter templateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalizationParameter {\n");
    
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
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

