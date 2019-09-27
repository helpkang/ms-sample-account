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
  * A rating stucture used to convey feedback (score) for each criteria Example: criterion with code 'cleanliness' and score '10' 
 **/
@ApiModel(description="A rating stucture used to convey feedback (score) for each criteria Example: criterion with code 'cleanliness' and score '10' ")
public class RatingCriterion  {
  
  @ApiModelProperty(example = "cleanliness", value = "Code identifying the rating criterion. It defines a property in which the customer feedback is measured.")
 /**
   * Code identifying the rating criterion. It defines a property in which the customer feedback is measured.
  **/
  private String code = null;

  @ApiModelProperty(value = "The actual assessment of the customer. This could be a numeric value score (i.e. '7.7') or a nominal value (i.e. 'Very good'). In case of numeric value, it will be in a 0-to-10 rating scale. ")
 /**
   * The actual assessment of the customer. This could be a numeric value score (i.e. '7.7') or a nominal value (i.e. 'Very good'). In case of numeric value, it will be in a 0-to-10 rating scale. 
  **/
  private String score = null;
 /**
   * Code identifying the rating criterion. It defines a property in which the customer feedback is measured.
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public RatingCriterion code(String code) {
    this.code = code;
    return this;
  }

 /**
   * The actual assessment of the customer. This could be a numeric value score (i.e. &#39;7.7&#39;) or a nominal value (i.e. &#39;Very good&#39;). In case of numeric value, it will be in a 0-to-10 rating scale. 
   * @return score
  **/
  @JsonProperty("score")
  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public RatingCriterion score(String score) {
    this.score = score;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingCriterion {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

