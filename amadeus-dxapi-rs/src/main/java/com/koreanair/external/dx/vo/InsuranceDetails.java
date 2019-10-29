package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.InsuranceDetail;
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
  * Object gather list of all data related to the provider or product. It can be text or urls. Aim is to provide image and description of the product.
 **/
@ApiModel(description="Object gather list of all data related to the provider or product. It can be text or urls. Aim is to provide image and description of the product.")
public class InsuranceDetails  {
  
  @ApiModelProperty(value = "")
  private InsuranceDetail logo = null;

  @ApiModelProperty(value = "")
  private InsuranceDetail information = null;

  @ApiModelProperty(value = "")
  private InsuranceDetail images = null;

  @ApiModelProperty(value = "")
  private InsuranceDetail marketingText = null;

  @ApiModelProperty(value = "")
  private InsuranceDetail privacyPolicy = null;

  @ApiModelProperty(value = "")
  private InsuranceDetail declaration = null;

  @ApiModelProperty(value = "")
  private InsuranceDetail termsAndConditions = null;

  @ApiModelProperty(value = "")
  private InsuranceDetail disclosure = null;

  @ApiModelProperty(value = "")
  private InsuranceDetail disclaimer = null;
 /**
   * Get logo
   * @return logo
  **/
  @JsonProperty("logo")
  public InsuranceDetail getLogo() {
    return logo;
  }

  public void setLogo(InsuranceDetail logo) {
    this.logo = logo;
  }

  public InsuranceDetails logo(InsuranceDetail logo) {
    this.logo = logo;
    return this;
  }

 /**
   * Get information
   * @return information
  **/
  @JsonProperty("information")
  public InsuranceDetail getInformation() {
    return information;
  }

  public void setInformation(InsuranceDetail information) {
    this.information = information;
  }

  public InsuranceDetails information(InsuranceDetail information) {
    this.information = information;
    return this;
  }

 /**
   * Get images
   * @return images
  **/
  @JsonProperty("images")
  public InsuranceDetail getImages() {
    return images;
  }

  public void setImages(InsuranceDetail images) {
    this.images = images;
  }

  public InsuranceDetails images(InsuranceDetail images) {
    this.images = images;
    return this;
  }

 /**
   * Get marketingText
   * @return marketingText
  **/
  @JsonProperty("marketingText")
  public InsuranceDetail getMarketingText() {
    return marketingText;
  }

  public void setMarketingText(InsuranceDetail marketingText) {
    this.marketingText = marketingText;
  }

  public InsuranceDetails marketingText(InsuranceDetail marketingText) {
    this.marketingText = marketingText;
    return this;
  }

 /**
   * Get privacyPolicy
   * @return privacyPolicy
  **/
  @JsonProperty("privacyPolicy")
  public InsuranceDetail getPrivacyPolicy() {
    return privacyPolicy;
  }

  public void setPrivacyPolicy(InsuranceDetail privacyPolicy) {
    this.privacyPolicy = privacyPolicy;
  }

  public InsuranceDetails privacyPolicy(InsuranceDetail privacyPolicy) {
    this.privacyPolicy = privacyPolicy;
    return this;
  }

 /**
   * Get declaration
   * @return declaration
  **/
  @JsonProperty("declaration")
  public InsuranceDetail getDeclaration() {
    return declaration;
  }

  public void setDeclaration(InsuranceDetail declaration) {
    this.declaration = declaration;
  }

  public InsuranceDetails declaration(InsuranceDetail declaration) {
    this.declaration = declaration;
    return this;
  }

 /**
   * Get termsAndConditions
   * @return termsAndConditions
  **/
  @JsonProperty("termsAndConditions")
  public InsuranceDetail getTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(InsuranceDetail termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  public InsuranceDetails termsAndConditions(InsuranceDetail termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

 /**
   * Get disclosure
   * @return disclosure
  **/
  @JsonProperty("disclosure")
  public InsuranceDetail getDisclosure() {
    return disclosure;
  }

  public void setDisclosure(InsuranceDetail disclosure) {
    this.disclosure = disclosure;
  }

  public InsuranceDetails disclosure(InsuranceDetail disclosure) {
    this.disclosure = disclosure;
    return this;
  }

 /**
   * Get disclaimer
   * @return disclaimer
  **/
  @JsonProperty("disclaimer")
  public InsuranceDetail getDisclaimer() {
    return disclaimer;
  }

  public void setDisclaimer(InsuranceDetail disclaimer) {
    this.disclaimer = disclaimer;
  }

  public InsuranceDetails disclaimer(InsuranceDetail disclaimer) {
    this.disclaimer = disclaimer;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceDetails {\n");
    
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    information: ").append(toIndentedString(information)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    marketingText: ").append(toIndentedString(marketingText)).append("\n");
    sb.append("    privacyPolicy: ").append(toIndentedString(privacyPolicy)).append("\n");
    sb.append("    declaration: ").append(toIndentedString(declaration)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    disclosure: ").append(toIndentedString(disclosure)).append("\n");
    sb.append("    disclaimer: ").append(toIndentedString(disclaimer)).append("\n");
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

