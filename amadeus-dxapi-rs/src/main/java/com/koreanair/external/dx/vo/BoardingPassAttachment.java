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
  * Provide the information for the attachment to be sent within the email
 **/
@ApiModel(description="Provide the information for the attachment to be sent within the email")
public class BoardingPassAttachment  {
  

@XmlType(name="DocumentTypeEnum")
@XmlEnum(String.class)
public enum DocumentTypeEnum {

@XmlEnumValue("pdf") PDF(String.valueOf("pdf")), @XmlEnumValue("appleWallet") APPLEWALLET(String.valueOf("appleWallet"));


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

  @ApiModelProperty(required = true, value = "Type of the boarding pass document to be attached to the email")
 /**
   * Type of the boarding pass document to be attached to the email
  **/
  private DocumentTypeEnum documentType = null;

  @ApiModelProperty(required = true, value = "Name of the attachment of the email. The extension of the document (.pdf , .pkpass) shouldn't be provided. ")
 /**
   * Name of the attachment of the email. The extension of the document (.pdf , .pkpass) shouldn't be provided. 
  **/
  private String documentName = null;
 /**
   * Type of the boarding pass document to be attached to the email
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

  public BoardingPassAttachment documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

 /**
   * Name of the attachment of the email. The extension of the document (.pdf , .pkpass) shouldn&#39;t be provided. 
   * @return documentName
  **/
  @JsonProperty("documentName")
  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public BoardingPassAttachment documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardingPassAttachment {\n");
    
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
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

