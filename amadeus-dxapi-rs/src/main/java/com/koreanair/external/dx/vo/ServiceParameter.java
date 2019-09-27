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
  * Set of conditions applying to a service: they can represent multiple factors such as weight, type, size that can have an influence on booking and pricing of the service. A parameter can be organised as a structured list: one parameter can link to a list of sub-parameters. 
 **/
@ApiModel(description="Set of conditions applying to a service: they can represent multiple factors such as weight, type, size that can have an influence on booking and pricing of the service. A parameter can be organised as a structured list: one parameter can link to a list of sub-parameters. ")
public class ServiceParameter  {
  
  @ApiModelProperty(value = "Identifier of the parameter, used only in case of sub-parameters (to do the link with the parent parameter)")
 /**
   * Identifier of the parameter, used only in case of sub-parameters (to do the link with the parent parameter)
  **/
  private String id = null;

  @ApiModelProperty(value = "Functional reference of the parameter. It refers to the serviceParameters dictionary")
 /**
   * Functional reference of the parameter. It refers to the serviceParameters dictionary
  **/
  private String code = null;

  @ApiModelProperty(value = "Expression used to validate the format of the parameter")
 /**
   * Expression used to validate the format of the parameter
  **/
  private String validatingFormat = null;

  @ApiModelProperty(value = "")
  private String minVal = null;

  @ApiModelProperty(value = "")
  private String maxVal = null;

  @ApiModelProperty(value = "")
  private String value = null;

  @ApiModelProperty(value = "")
  private String description = null;


@XmlType(name="RequirementLevelEnum")
@XmlEnum(String.class)
public enum RequirementLevelEnum {

@XmlEnumValue("mandatory") MANDATORY(String.valueOf("mandatory")), @XmlEnumValue("optional") OPTIONAL(String.valueOf("optional"));


    private String value;

    RequirementLevelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RequirementLevelEnum fromValue(String v) {
        for (RequirementLevelEnum b : RequirementLevelEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "It defines if the parameter is required or not")
 /**
   * It defines if the parameter is required or not
  **/
  private RequirementLevelEnum requirementLevel = null;

  @ApiModelProperty(value = "List of associated sub-parameters ids. (e.g. To define the weight parameter, two sup-parameters are used: one for the value and one for the unit of measure)")
 /**
   * List of associated sub-parameters ids. (e.g. To define the weight parameter, two sup-parameters are used: one for the value and one for the unit of measure)
  **/
  private List<String> subParameterIds = null;
 /**
   * Identifier of the parameter, used only in case of sub-parameters (to do the link with the parent parameter)
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ServiceParameter id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Functional reference of the parameter. It refers to the serviceParameters dictionary
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ServiceParameter code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Expression used to validate the format of the parameter
   * @return validatingFormat
  **/
  @JsonProperty("validatingFormat")
  public String getValidatingFormat() {
    return validatingFormat;
  }

  public void setValidatingFormat(String validatingFormat) {
    this.validatingFormat = validatingFormat;
  }

  public ServiceParameter validatingFormat(String validatingFormat) {
    this.validatingFormat = validatingFormat;
    return this;
  }

 /**
   * Get minVal
   * @return minVal
  **/
  @JsonProperty("minVal")
  public String getMinVal() {
    return minVal;
  }

  public void setMinVal(String minVal) {
    this.minVal = minVal;
  }

  public ServiceParameter minVal(String minVal) {
    this.minVal = minVal;
    return this;
  }

 /**
   * Get maxVal
   * @return maxVal
  **/
  @JsonProperty("maxVal")
  public String getMaxVal() {
    return maxVal;
  }

  public void setMaxVal(String maxVal) {
    this.maxVal = maxVal;
  }

  public ServiceParameter maxVal(String maxVal) {
    this.maxVal = maxVal;
    return this;
  }

 /**
   * Get value
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ServiceParameter value(String value) {
    this.value = value;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServiceParameter description(String description) {
    this.description = description;
    return this;
  }

 /**
   * It defines if the parameter is required or not
   * @return requirementLevel
  **/
  @JsonProperty("requirementLevel")
  public String getRequirementLevel() {
    if (requirementLevel == null) {
      return null;
    }
    return requirementLevel.value();
  }

  public void setRequirementLevel(RequirementLevelEnum requirementLevel) {
    this.requirementLevel = requirementLevel;
  }

  public ServiceParameter requirementLevel(RequirementLevelEnum requirementLevel) {
    this.requirementLevel = requirementLevel;
    return this;
  }

 /**
   * List of associated sub-parameters ids. (e.g. To define the weight parameter, two sup-parameters are used: one for the value and one for the unit of measure)
   * @return subParameterIds
  **/
  @JsonProperty("subParameterIds")
  public List<String> getSubParameterIds() {
    return subParameterIds;
  }

  public void setSubParameterIds(List<String> subParameterIds) {
    this.subParameterIds = subParameterIds;
  }

  public ServiceParameter subParameterIds(List<String> subParameterIds) {
    this.subParameterIds = subParameterIds;
    return this;
  }

  public ServiceParameter addSubParameterIdsItem(String subParameterIdsItem) {
    this.subParameterIds.add(subParameterIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceParameter {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    validatingFormat: ").append(toIndentedString(validatingFormat)).append("\n");
    sb.append("    minVal: ").append(toIndentedString(minVal)).append("\n");
    sb.append("    maxVal: ").append(toIndentedString(maxVal)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    requirementLevel: ").append(toIndentedString(requirementLevel)).append("\n");
    sb.append("    subParameterIds: ").append(toIndentedString(subParameterIds)).append("\n");
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

