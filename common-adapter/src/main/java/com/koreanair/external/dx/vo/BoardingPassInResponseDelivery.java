package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BoardingPassDeliveryMethod;
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
  * In response delivery method is to get the document in the response of the service to provide the boarding pass directly to the user. The document type can be a PDF, mobile boarding pass (html), a Apple Wallet or the boarding pass data to build the boarding pass. The document will be provided via a url link in the response of the service. The boarding pass data is defined within the response of the boarding pass request. 
 **/
@ApiModel(description="In response delivery method is to get the document in the response of the service to provide the boarding pass directly to the user. The document type can be a PDF, mobile boarding pass (html), a Apple Wallet or the boarding pass data to build the boarding pass. The document will be provided via a url link in the response of the service. The boarding pass data is defined within the response of the boarding pass request. ")
public class BoardingPassInResponseDelivery extends BoardingPassDeliveryMethod {
  

@XmlType(name="DocumentTypeEnum")
@XmlEnum(String.class)
public enum DocumentTypeEnum {

@XmlEnumValue("pdf") PDF(String.valueOf("pdf")), @XmlEnumValue("mobileBoardingPass") MOBILEBOARDINGPASS(String.valueOf("mobileBoardingPass")), @XmlEnumValue("appleWallet") APPLEWALLET(String.valueOf("appleWallet")), @XmlEnumValue("boardingPassData") BOARDINGPASSDATA(String.valueOf("boardingPassData"));


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

  @ApiModelProperty(required = true, value = "Type of the boarding pass document to generate and provide")
 /**
   * Type of the boarding pass document to generate and provide
  **/
  private DocumentTypeEnum documentType = null;
 /**
   * Type of the boarding pass document to generate and provide
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

  public BoardingPassInResponseDelivery documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardingPassInResponseDelivery {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

