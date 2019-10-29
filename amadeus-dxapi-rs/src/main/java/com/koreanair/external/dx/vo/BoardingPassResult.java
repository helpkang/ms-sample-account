package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BoardingPassData;
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
  * Boarding pass request result for a given traveler flight info
 **/
@ApiModel(description="Boarding pass request result for a given traveler flight info")
public class BoardingPassResult  {
  
  @ApiModelProperty(required = true, value = "Journey element ids associated to the Boarding pass documents")
 /**
   * Journey element ids associated to the Boarding pass documents
  **/
  private List<String> journeyElementIds = new ArrayList<>();


@XmlType(name="ResultEnum")
@XmlEnum(String.class)
public enum ResultEnum {

@XmlEnumValue("sent") SENT(String.valueOf("sent")), @XmlEnumValue("returnedDocumentURL") RETURNEDDOCUMENTURL(String.valueOf("returnedDocumentURL")), @XmlEnumValue("returnedBoardingPassData") RETURNEDBOARDINGPASSDATA(String.valueOf("returnedBoardingPassData")), @XmlEnumValue("inhibited") INHIBITED(String.valueOf("inhibited"));


    private String value;

    ResultEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ResultEnum fromValue(String v) {
        for (ResultEnum b : ResultEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Result for this specific boarding pass. Indicate if the boarding pass was sent, returned or was not allowed because of the traveler status. ")
 /**
   * Result for this specific boarding pass. Indicate if the boarding pass was sent, returned or was not allowed because of the traveler status. 
  **/
  private ResultEnum result = null;


@XmlType(name="DocumentTypeEnum")
@XmlEnum(String.class)
public enum DocumentTypeEnum {

@XmlEnumValue("boardingPass") BOARDINGPASS(String.valueOf("boardingPass")), @XmlEnumValue("confirmation") CONFIRMATION(String.valueOf("confirmation"));


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

  @ApiModelProperty(value = "Type of the document returned. A boarding pass allow the traveler to go through security and board his flight. A confirmation only allow the traveler to be informed that his acceptance is succesful and should get a valid boarding pass at the airport. ")
 /**
   * Type of the document returned. A boarding pass allow the traveler to go through security and board his flight. A confirmation only allow the traveler to be informed that his acceptance is succesful and should get a valid boarding pass at the airport. 
  **/
  private DocumentTypeEnum documentType = null;

  @ApiModelProperty(value = "")
  private BoardingPassData boardingPassData = null;

  @ApiModelProperty(value = "URL to retrieve the requested boarding pass. The link will be valid as long as the flight has not landed.")
 /**
   * URL to retrieve the requested boarding pass. The link will be valid as long as the flight has not landed.
  **/
  private String documentURL = null;
 /**
   * Journey element ids associated to the Boarding pass documents
   * @return journeyElementIds
  **/
  @JsonProperty("journeyElementIds")
  public List<String> getJourneyElementIds() {
    return journeyElementIds;
  }

  public void setJourneyElementIds(List<String> journeyElementIds) {
    this.journeyElementIds = journeyElementIds;
  }

  public BoardingPassResult journeyElementIds(List<String> journeyElementIds) {
    this.journeyElementIds = journeyElementIds;
    return this;
  }

  public BoardingPassResult addJourneyElementIdsItem(String journeyElementIdsItem) {
    this.journeyElementIds.add(journeyElementIdsItem);
    return this;
  }

 /**
   * Result for this specific boarding pass. Indicate if the boarding pass was sent, returned or was not allowed because of the traveler status. 
   * @return result
  **/
  @JsonProperty("result")
  public String getResult() {
    if (result == null) {
      return null;
    }
    return result.value();
  }

  public void setResult(ResultEnum result) {
    this.result = result;
  }

  public BoardingPassResult result(ResultEnum result) {
    this.result = result;
    return this;
  }

 /**
   * Type of the document returned. A boarding pass allow the traveler to go through security and board his flight. A confirmation only allow the traveler to be informed that his acceptance is succesful and should get a valid boarding pass at the airport. 
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

  public BoardingPassResult documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

 /**
   * Get boardingPassData
   * @return boardingPassData
  **/
  @JsonProperty("boardingPassData")
  public BoardingPassData getBoardingPassData() {
    return boardingPassData;
  }

  public void setBoardingPassData(BoardingPassData boardingPassData) {
    this.boardingPassData = boardingPassData;
  }

  public BoardingPassResult boardingPassData(BoardingPassData boardingPassData) {
    this.boardingPassData = boardingPassData;
    return this;
  }

 /**
   * URL to retrieve the requested boarding pass. The link will be valid as long as the flight has not landed.
   * @return documentURL
  **/
  @JsonProperty("documentURL")
  public String getDocumentURL() {
    return documentURL;
  }

  public void setDocumentURL(String documentURL) {
    this.documentURL = documentURL;
  }

  public BoardingPassResult documentURL(String documentURL) {
    this.documentURL = documentURL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardingPassResult {\n");
    
    sb.append("    journeyElementIds: ").append(toIndentedString(journeyElementIds)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    boardingPassData: ").append(toIndentedString(boardingPassData)).append("\n");
    sb.append("    documentURL: ").append(toIndentedString(documentURL)).append("\n");
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

