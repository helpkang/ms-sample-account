package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CheckInSecurityQuestion;
import com.koreanair.external.dx.vo.JourneyElementCommon;
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
  * Acceptance of the item with the list of travelers on flights associated if relevant. An acceptance can be partial if a traveler of the journey is not eligible. In this case the list of accepted travelerd on flight is provided. In case of acceptance for a single FlightTravelerInfo, only isAccepted will be returned. 
 **/
@ApiModel(description="Acceptance of the item with the list of travelers on flights associated if relevant. An acceptance can be partial if a traveler of the journey is not eligible. In this case the list of accepted travelerd on flight is provided. In case of acceptance for a single FlightTravelerInfo, only isAccepted will be returned. ")
public class Acceptance  {
  
  @ApiModelProperty(required = true, value = "Has this item been accepted, i.e. all travelers on flights inside are accepted.")
 /**
   * Has this item been accepted, i.e. all travelers on flights inside are accepted.
  **/
  private Boolean isAccepted = null;

  @ApiModelProperty(value = "Has some of the travelers on flights within this item not accepted")
 /**
   * Has some of the travelers on flights within this item not accepted
  **/
  private Boolean isPartial = null;

  @ApiModelProperty(value = "List of JourneyElements in the journey who are checked in (Accepted or StandBy)")
 /**
   * List of JourneyElements in the journey who are checked in (Accepted or StandBy)
  **/
  private List<JourneyElementCommon> checkedInJourneyElements = null;

  @ApiModelProperty(value = "List of JourneyElements in the journey who are not checked in (notAccepted or rejected)")
 /**
   * List of JourneyElements in the journey who are not checked in (notAccepted or rejected)
  **/
  private List<JourneyElementCommon> notCheckedInJourneyElements = null;

  @ApiModelProperty(value = "List of security questions needed to be answered by the travelers before they can be accepted. Questions are set by the airlines within the Departure Control System business rule system. They are returned by the Departure Control System if required when trying to do an acceptance without the `areSecurityQuestionsAnswered` boolean set to true. ")
 /**
   * List of security questions needed to be answered by the travelers before they can be accepted. Questions are set by the airlines within the Departure Control System business rule system. They are returned by the Departure Control System if required when trying to do an acceptance without the `areSecurityQuestionsAnswered` boolean set to true. 
  **/
  private List<CheckInSecurityQuestion> securityQuestionsToAnswer = null;

  @ApiModelProperty(value = "This field represents the eligibility for the relevant travelers to volunteer for denied boarding on the relevant flights. This is only possible if all travelers are checked in. If not present, assumed to be false")
 /**
   * This field represents the eligibility for the relevant travelers to volunteer for denied boarding on the relevant flights. This is only possible if all travelers are checked in. If not present, assumed to be false
  **/
  private Boolean isEligibleForVoluntaryDeniedBoarding = false;

  @ApiModelProperty(value = "This field represents whether the relevant travelers have volunteered for denied boarding on the relevant flights. If not present, assumed to be unknown/undefined in DCS")
 /**
   * This field represents whether the relevant travelers have volunteered for denied boarding on the relevant flights. If not present, assumed to be unknown/undefined in DCS
  **/
  private Boolean isVoluntaryDeniedBoarding = null;
 /**
   * Has this item been accepted, i.e. all travelers on flights inside are accepted.
   * @return isAccepted
  **/
  @JsonProperty("isAccepted")
  public Boolean isIsAccepted() {
    return isAccepted;
  }

  public void setIsAccepted(Boolean isAccepted) {
    this.isAccepted = isAccepted;
  }

  public Acceptance isAccepted(Boolean isAccepted) {
    this.isAccepted = isAccepted;
    return this;
  }

 /**
   * Has some of the travelers on flights within this item not accepted
   * @return isPartial
  **/
  @JsonProperty("isPartial")
  public Boolean isIsPartial() {
    return isPartial;
  }

  public void setIsPartial(Boolean isPartial) {
    this.isPartial = isPartial;
  }

  public Acceptance isPartial(Boolean isPartial) {
    this.isPartial = isPartial;
    return this;
  }

 /**
   * List of JourneyElements in the journey who are checked in (Accepted or StandBy)
   * @return checkedInJourneyElements
  **/
  @JsonProperty("checkedInJourneyElements")
  public List<JourneyElementCommon> getCheckedInJourneyElements() {
    return checkedInJourneyElements;
  }

  public void setCheckedInJourneyElements(List<JourneyElementCommon> checkedInJourneyElements) {
    this.checkedInJourneyElements = checkedInJourneyElements;
  }

  public Acceptance checkedInJourneyElements(List<JourneyElementCommon> checkedInJourneyElements) {
    this.checkedInJourneyElements = checkedInJourneyElements;
    return this;
  }

  public Acceptance addCheckedInJourneyElementsItem(JourneyElementCommon checkedInJourneyElementsItem) {
    this.checkedInJourneyElements.add(checkedInJourneyElementsItem);
    return this;
  }

 /**
   * List of JourneyElements in the journey who are not checked in (notAccepted or rejected)
   * @return notCheckedInJourneyElements
  **/
  @JsonProperty("notCheckedInJourneyElements")
  public List<JourneyElementCommon> getNotCheckedInJourneyElements() {
    return notCheckedInJourneyElements;
  }

  public void setNotCheckedInJourneyElements(List<JourneyElementCommon> notCheckedInJourneyElements) {
    this.notCheckedInJourneyElements = notCheckedInJourneyElements;
  }

  public Acceptance notCheckedInJourneyElements(List<JourneyElementCommon> notCheckedInJourneyElements) {
    this.notCheckedInJourneyElements = notCheckedInJourneyElements;
    return this;
  }

  public Acceptance addNotCheckedInJourneyElementsItem(JourneyElementCommon notCheckedInJourneyElementsItem) {
    this.notCheckedInJourneyElements.add(notCheckedInJourneyElementsItem);
    return this;
  }

 /**
   * List of security questions needed to be answered by the travelers before they can be accepted. Questions are set by the airlines within the Departure Control System business rule system. They are returned by the Departure Control System if required when trying to do an acceptance without the &#x60;areSecurityQuestionsAnswered&#x60; boolean set to true. 
   * @return securityQuestionsToAnswer
  **/
  @JsonProperty("securityQuestionsToAnswer")
  public List<CheckInSecurityQuestion> getSecurityQuestionsToAnswer() {
    return securityQuestionsToAnswer;
  }

  public void setSecurityQuestionsToAnswer(List<CheckInSecurityQuestion> securityQuestionsToAnswer) {
    this.securityQuestionsToAnswer = securityQuestionsToAnswer;
  }

  public Acceptance securityQuestionsToAnswer(List<CheckInSecurityQuestion> securityQuestionsToAnswer) {
    this.securityQuestionsToAnswer = securityQuestionsToAnswer;
    return this;
  }

  public Acceptance addSecurityQuestionsToAnswerItem(CheckInSecurityQuestion securityQuestionsToAnswerItem) {
    this.securityQuestionsToAnswer.add(securityQuestionsToAnswerItem);
    return this;
  }

 /**
   * This field represents the eligibility for the relevant travelers to volunteer for denied boarding on the relevant flights. This is only possible if all travelers are checked in. If not present, assumed to be false
   * @return isEligibleForVoluntaryDeniedBoarding
  **/
  @JsonProperty("isEligibleForVoluntaryDeniedBoarding")
  public Boolean isIsEligibleForVoluntaryDeniedBoarding() {
    return isEligibleForVoluntaryDeniedBoarding;
  }

  public void setIsEligibleForVoluntaryDeniedBoarding(Boolean isEligibleForVoluntaryDeniedBoarding) {
    this.isEligibleForVoluntaryDeniedBoarding = isEligibleForVoluntaryDeniedBoarding;
  }

  public Acceptance isEligibleForVoluntaryDeniedBoarding(Boolean isEligibleForVoluntaryDeniedBoarding) {
    this.isEligibleForVoluntaryDeniedBoarding = isEligibleForVoluntaryDeniedBoarding;
    return this;
  }

 /**
   * This field represents whether the relevant travelers have volunteered for denied boarding on the relevant flights. If not present, assumed to be unknown/undefined in DCS
   * @return isVoluntaryDeniedBoarding
  **/
  @JsonProperty("isVoluntaryDeniedBoarding")
  public Boolean isIsVoluntaryDeniedBoarding() {
    return isVoluntaryDeniedBoarding;
  }

  public void setIsVoluntaryDeniedBoarding(Boolean isVoluntaryDeniedBoarding) {
    this.isVoluntaryDeniedBoarding = isVoluntaryDeniedBoarding;
  }

  public Acceptance isVoluntaryDeniedBoarding(Boolean isVoluntaryDeniedBoarding) {
    this.isVoluntaryDeniedBoarding = isVoluntaryDeniedBoarding;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Acceptance {\n");
    
    sb.append("    isAccepted: ").append(toIndentedString(isAccepted)).append("\n");
    sb.append("    isPartial: ").append(toIndentedString(isPartial)).append("\n");
    sb.append("    checkedInJourneyElements: ").append(toIndentedString(checkedInJourneyElements)).append("\n");
    sb.append("    notCheckedInJourneyElements: ").append(toIndentedString(notCheckedInJourneyElements)).append("\n");
    sb.append("    securityQuestionsToAnswer: ").append(toIndentedString(securityQuestionsToAnswer)).append("\n");
    sb.append("    isEligibleForVoluntaryDeniedBoarding: ").append(toIndentedString(isEligibleForVoluntaryDeniedBoarding)).append("\n");
    sb.append("    isVoluntaryDeniedBoarding: ").append(toIndentedString(isVoluntaryDeniedBoarding)).append("\n");
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

