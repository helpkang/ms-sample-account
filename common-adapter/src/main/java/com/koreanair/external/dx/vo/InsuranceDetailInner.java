package com.koreanair.external.dx.vo;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InsuranceDetailInner  {
  

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("text") TEXT(String.valueOf("text")), @XmlEnumValue("url") URL(String.valueOf("url"));


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

  @ApiModelProperty(example = "url", value = "the information type")
 /**
   * the information type
  **/
  private TypeEnum type = null;

  @ApiModelProperty(example = "https://www.myInsurance.com/Terms&Conditions", value = "the information content")
 /**
   * the information content
  **/
  private String description = null;

  @ApiModelProperty(example = "EN", value = "the language code used in the content")
 /**
   * the language code used in the content
  **/
  private String lang = null;
 /**
   * the information type
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

  public InsuranceDetailInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * the information content
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InsuranceDetailInner description(String description) {
    this.description = description;
    return this;
  }

 /**
   * the language code used in the content
   * @return lang
  **/
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public InsuranceDetailInner lang(String lang) {
    this.lang = lang;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceDetailInner {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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

