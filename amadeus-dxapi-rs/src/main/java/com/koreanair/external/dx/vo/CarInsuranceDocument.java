package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Url;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CarInsuranceDocument  {
  
  @ApiModelProperty(value = "Url description, for example 'alternate' if the url specifies alternate form of information like a link to a PDF.")
 /**
   * Url description, for example 'alternate' if the url specifies alternate form of information like a link to a PDF.
  **/
  private String rel = null;

  @ApiModelProperty(value = "Url")
 /**
   * Url
  **/
  private String href = null;

  @ApiModelProperty(value = "Media type of this resource, for example 'application/pdf' See https://www.iana.org/assignments/media-types/media-types.xhtml for reference.")
 /**
   * Media type of this resource, for example 'application/pdf' See https://www.iana.org/assignments/media-types/media-types.xhtml for reference.
  **/
  private String mediaType = null;

  @ApiModelProperty(value = "The language in which the document is written.")
 /**
   * The language in which the document is written.
  **/
  private String lang = null;


@XmlType(name="DocumentTypeEnum")
@XmlEnum(String.class)
public enum DocumentTypeEnum {

@XmlEnumValue("policyWording") POLICYWORDING(String.valueOf("policyWording")), @XmlEnumValue("keyFacts") KEYFACTS(String.valueOf("keyFacts")), @XmlEnumValue("certificate") CERTIFICATE(String.valueOf("certificate"));


    private String value;

    DocumentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DocumentTypeEnum fromValue(String v) {
        for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "A car insurance document (in the form of URL) containing different information. Depending on the type, the document will contain the full policy terms and conditions (policyWording), a summary of the previous (keyFacts) or the certificate of the insurance built with the holder's data (CERTIFICATE) ")
 /**
   * A car insurance document (in the form of URL) containing different information. Depending on the type, the document will contain the full policy terms and conditions (policyWording), a summary of the previous (keyFacts) or the certificate of the insurance built with the holder's data (CERTIFICATE) 
  **/
  private DocumentTypeEnum documentType = null;
 /**
   * Url description, for example &#39;alternate&#39; if the url specifies alternate form of information like a link to a PDF.
   * @return rel
  **/
  @JsonProperty("rel")
  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public CarInsuranceDocument rel(String rel) {
    this.rel = rel;
    return this;
  }

 /**
   * Url
   * @return href
  **/
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public CarInsuranceDocument href(String href) {
    this.href = href;
    return this;
  }

 /**
   * Media type of this resource, for example &#39;application/pdf&#39; See https://www.iana.org/assignments/media-types/media-types.xhtml for reference.
   * @return mediaType
  **/
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public CarInsuranceDocument mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

 /**
   * The language in which the document is written.
   * @return lang
  **/
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public CarInsuranceDocument lang(String lang) {
    this.lang = lang;
    return this;
  }

 /**
   * A car insurance document (in the form of URL) containing different information. Depending on the type, the document will contain the full policy terms and conditions (policyWording), a summary of the previous (keyFacts) or the certificate of the insurance built with the holder&#39;s data (CERTIFICATE) 
   * @return documentType
  **/
  @JsonProperty("documentType")
  public String getDocumentType() {
    if (documentType == null) {
      return null;
    }
    return documentType.value();
  }

  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }

  public CarInsuranceDocument documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarInsuranceDocument {\n");
    
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
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

