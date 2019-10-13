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
  * text and language
 **/
@ApiModel(description="text and language")
public class TextWithLanguageType  {
  
  @ApiModelProperty(value = "Language code of the text")
 /**
   * Language code of the text
  **/
  private String lang = null;

  @ApiModelProperty(value = "Short description")
 /**
   * Short description
  **/
  private String text = null;
 /**
   * Language code of the text
   * @return lang
  **/
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public TextWithLanguageType lang(String lang) {
    this.lang = lang;
    return this;
  }

 /**
   * Short description
   * @return text
  **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public TextWithLanguageType text(String text) {
    this.text = text;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextWithLanguageType {\n");
    
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

