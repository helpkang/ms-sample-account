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
  * Information regarding the priority for the security checks and the boarding at the gate 
 **/
@ApiModel(description="Information regarding the priority for the security checks and the boarding at the gate ")
public class BoardingPriorities  {
  
  @ApiModelProperty(value = "Indicate if the traveler can use the Fast Track path for security and boarding")
 /**
   * Indicate if the traveler can use the Fast Track path for security and boarding
  **/
  private Boolean isFastTrack = null;

  @ApiModelProperty(value = "Text to be printed on the document to show traveler's Fast Track possibility")
 /**
   * Text to be printed on the document to show traveler's Fast Track possibility
  **/
  private String fastTrackText = null;

  @ApiModelProperty(value = "Provide the boarding group of the traveler to help him know when he can board the plane")
 /**
   * Provide the boarding group of the traveler to help him know when he can board the plane
  **/
  private String boardingGroup = null;

  @ApiModelProperty(value = "Indicate if the traveler subscribed to USA's Transportation Security Administration (TSA) Pre-Check system. Information should be provided to the traveler for him to know he can go through the specific security line. ")
 /**
   * Indicate if the traveler subscribed to USA's Transportation Security Administration (TSA) Pre-Check system. Information should be provided to the traveler for him to know he can go through the specific security line. 
  **/
  private Boolean tsaPreCheck = null;

  @ApiModelProperty(value = "List of security indicators to be displayed on this boarding pass (e.g \"ITD OSS\" for Canadian international to domestic one stop security)")
 /**
   * List of security indicators to be displayed on this boarding pass (e.g \"ITD OSS\" for Canadian international to domestic one stop security)
  **/
  private List<String> securityIndicators = null;
 /**
   * Indicate if the traveler can use the Fast Track path for security and boarding
   * @return isFastTrack
  **/
  @JsonProperty("isFastTrack")
  public Boolean isIsFastTrack() {
    return isFastTrack;
  }

  public void setIsFastTrack(Boolean isFastTrack) {
    this.isFastTrack = isFastTrack;
  }

  public BoardingPriorities isFastTrack(Boolean isFastTrack) {
    this.isFastTrack = isFastTrack;
    return this;
  }

 /**
   * Text to be printed on the document to show traveler&#39;s Fast Track possibility
   * @return fastTrackText
  **/
  @JsonProperty("fastTrackText")
  public String getFastTrackText() {
    return fastTrackText;
  }

  public void setFastTrackText(String fastTrackText) {
    this.fastTrackText = fastTrackText;
  }

  public BoardingPriorities fastTrackText(String fastTrackText) {
    this.fastTrackText = fastTrackText;
    return this;
  }

 /**
   * Provide the boarding group of the traveler to help him know when he can board the plane
   * @return boardingGroup
  **/
  @JsonProperty("boardingGroup")
  public String getBoardingGroup() {
    return boardingGroup;
  }

  public void setBoardingGroup(String boardingGroup) {
    this.boardingGroup = boardingGroup;
  }

  public BoardingPriorities boardingGroup(String boardingGroup) {
    this.boardingGroup = boardingGroup;
    return this;
  }

 /**
   * Indicate if the traveler subscribed to USA&#39;s Transportation Security Administration (TSA) Pre-Check system. Information should be provided to the traveler for him to know he can go through the specific security line. 
   * @return tsaPreCheck
  **/
  @JsonProperty("tsaPreCheck")
  public Boolean isTsaPreCheck() {
    return tsaPreCheck;
  }

  public void setTsaPreCheck(Boolean tsaPreCheck) {
    this.tsaPreCheck = tsaPreCheck;
  }

  public BoardingPriorities tsaPreCheck(Boolean tsaPreCheck) {
    this.tsaPreCheck = tsaPreCheck;
    return this;
  }

 /**
   * List of security indicators to be displayed on this boarding pass (e.g \&quot;ITD OSS\&quot; for Canadian international to domestic one stop security)
   * @return securityIndicators
  **/
  @JsonProperty("securityIndicators")
  public List<String> getSecurityIndicators() {
    return securityIndicators;
  }

  public void setSecurityIndicators(List<String> securityIndicators) {
    this.securityIndicators = securityIndicators;
  }

  public BoardingPriorities securityIndicators(List<String> securityIndicators) {
    this.securityIndicators = securityIndicators;
    return this;
  }

  public BoardingPriorities addSecurityIndicatorsItem(String securityIndicatorsItem) {
    this.securityIndicators.add(securityIndicatorsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardingPriorities {\n");
    
    sb.append("    isFastTrack: ").append(toIndentedString(isFastTrack)).append("\n");
    sb.append("    fastTrackText: ").append(toIndentedString(fastTrackText)).append("\n");
    sb.append("    boardingGroup: ").append(toIndentedString(boardingGroup)).append("\n");
    sb.append("    tsaPreCheck: ").append(toIndentedString(tsaPreCheck)).append("\n");
    sb.append("    securityIndicators: ").append(toIndentedString(securityIndicators)).append("\n");
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

