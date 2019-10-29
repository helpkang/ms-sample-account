package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.RatingCriterion;
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

public class Rating  {
  
  @ApiModelProperty(example = "7.0", value = "Overall numeric score returned by provider based on customers feedback regarding the service received. The breakdown of this rating is provided in `categories` according to different criteria. ")
 /**
   * Overall numeric score returned by provider based on customers feedback regarding the service received. The breakdown of this rating is provided in `categories` according to different criteria. 
  **/
  private Float globalScore = null;

  @ApiModelProperty(example = "\"Fine\" \"Acceptable\" \"Very good\" ", value = "The text associated to the globalScore. For example, with a  `globalScore` of '5.0', a potential value for this attribute could be: 'Acceptable'. Please note that the text description is defined by car providers, therefore the relation between `globalScore` and  `globalScoreText` might not be in line. ")
 /**
   * The text associated to the globalScore. For example, with a  `globalScore` of '5.0', a potential value for this attribute could be: 'Acceptable'. Please note that the text description is defined by car providers, therefore the relation between `globalScore` and  `globalScoreText` might not be in line. 
  **/
  private String globalScoreText = null;

  @ApiModelProperty(value = "A list of ratings collected for the service received in a provider location. Each rating will contain the valoration for a particular category (i.e. cleanliness) ")
 /**
   * A list of ratings collected for the service received in a provider location. Each rating will contain the valoration for a particular category (i.e. cleanliness) 
  **/
  private List<RatingCriterion> criteria = null;
 /**
   * Overall numeric score returned by provider based on customers feedback regarding the service received. The breakdown of this rating is provided in &#x60;categories&#x60; according to different criteria. 
   * @return globalScore
  **/
  @JsonProperty("globalScore")
  public Float getGlobalScore() {
    return globalScore;
  }

  public void setGlobalScore(Float globalScore) {
    this.globalScore = globalScore;
  }

  public Rating globalScore(Float globalScore) {
    this.globalScore = globalScore;
    return this;
  }

 /**
   * The text associated to the globalScore. For example, with a  &#x60;globalScore&#x60; of &#39;5.0&#39;, a potential value for this attribute could be: &#39;Acceptable&#39;. Please note that the text description is defined by car providers, therefore the relation between &#x60;globalScore&#x60; and  &#x60;globalScoreText&#x60; might not be in line. 
   * @return globalScoreText
  **/
  @JsonProperty("globalScoreText")
  public String getGlobalScoreText() {
    return globalScoreText;
  }

  public void setGlobalScoreText(String globalScoreText) {
    this.globalScoreText = globalScoreText;
  }

  public Rating globalScoreText(String globalScoreText) {
    this.globalScoreText = globalScoreText;
    return this;
  }

 /**
   * A list of ratings collected for the service received in a provider location. Each rating will contain the valoration for a particular category (i.e. cleanliness) 
   * @return criteria
  **/
  @JsonProperty("criteria")
  public List<RatingCriterion> getCriteria() {
    return criteria;
  }

  public void setCriteria(List<RatingCriterion> criteria) {
    this.criteria = criteria;
  }

  public Rating criteria(List<RatingCriterion> criteria) {
    this.criteria = criteria;
    return this;
  }

  public Rating addCriteriaItem(RatingCriterion criteriaItem) {
    this.criteria.add(criteriaItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rating {\n");
    
    sb.append("    globalScore: ").append(toIndentedString(globalScore)).append("\n");
    sb.append("    globalScoreText: ").append(toIndentedString(globalScoreText)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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

