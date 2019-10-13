package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.JourneyPaymentRequest;
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
  * Input needed to confirm and finalize payment. For backwards compatiblity reasons, authorizationSuccessful is not mandatory. If not present, success true is assumed. 
 **/
@ApiModel(description="Input needed to confirm and finalize payment. For backwards compatiblity reasons, authorizationSuccessful is not mandatory. If not present, success true is assumed. ")
public class JourneyPaymentConfirmationRequest  {
  

@XmlType(name="PaymentOperationTypeEnum")
@XmlEnum(String.class)
public enum PaymentOperationTypeEnum {

@XmlEnumValue("services") SERVICES(String.valueOf("services")), @XmlEnumValue("upgrade") UPGRADE(String.valueOf("upgrade")), @XmlEnumValue("standbyEarly") STANDBYEARLY(String.valueOf("standbyEarly")), @XmlEnumValue("sameDayChange") SAMEDAYCHANGE(String.valueOf("sameDayChange"));


    private String value;

    PaymentOperationTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PaymentOperationTypeEnum fromValue(String v) {
        for (PaymentOperationTypeEnum b : PaymentOperationTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "This defines what needs to be paid as part of this operation. If 'services' no additional input is needed (today all services are paid, filtering has not yet been implemented) If 'upgrade' the 'upgradeIds' array must be filled If 'sameDayChange' or 'standbyEarly', the 'alternativeOfferIds' array must be filled")
 /**
   * This defines what needs to be paid as part of this operation. If 'services' no additional input is needed (today all services are paid, filtering has not yet been implemented) If 'upgrade' the 'upgradeIds' array must be filled If 'sameDayChange' or 'standbyEarly', the 'alternativeOfferIds' array must be filled
  **/
  private PaymentOperationTypeEnum paymentOperationType = null;

  @ApiModelProperty(value = "List of IDs of individual upgrades that the customer has selected")
 /**
   * List of IDs of individual upgrades that the customer has selected
  **/
  private List<String> upgradeIds = null;

  @ApiModelProperty(value = "List of IDs of alternative flight offer being applied.")
 /**
   * List of IDs of alternative flight offer being applied.
  **/
  private List<String> alternativeOfferIds = null;

  @ApiModelProperty(value = "In case of 3D Secure payment managed by Amadeus Payment Platform, the return URL to be called by APP upon validation of the one-time code")
 /**
   * In case of 3D Secure payment managed by Amadeus Payment Platform, the return URL to be called by APP upon validation of the one-time code
  **/
  private String returnURL = null;

  @ApiModelProperty(value = "Was the authorization call successful, in which case finalization should be performed, or did it fail, in which case cleanup should be performed. This is informative of course, final verification is performed between backend and payment provider For backwards compatiblity reasons, this field is not mandatory. If not present, success true is assumed. ")
 /**
   * Was the authorization call successful, in which case finalization should be performed, or did it fail, in which case cleanup should be performed. This is informative of course, final verification is performed between backend and payment provider For backwards compatiblity reasons, this field is not mandatory. If not present, success true is assumed. 
  **/
  private Boolean authorizationSuccessful = null;

  @ApiModelProperty(value = "Email address for the payment receipt")
 /**
   * Email address for the payment receipt
  **/
  private String email = null;

  @ApiModelProperty(value = "Code of the preferred language to be used for the receipt, e.g. en-GB for English-United Kingdom. [For more details](http://www.lingoes.net/en/translator/langcode.htm) ")
 /**
   * Code of the preferred language to be used for the receipt, e.g. en-GB for English-United Kingdom. [For more details](http://www.lingoes.net/en/translator/langcode.htm) 
  **/
  private String lang = "en-GB";
 /**
   * This defines what needs to be paid as part of this operation. If &#39;services&#39; no additional input is needed (today all services are paid, filtering has not yet been implemented) If &#39;upgrade&#39; the &#39;upgradeIds&#39; array must be filled If &#39;sameDayChange&#39; or &#39;standbyEarly&#39;, the &#39;alternativeOfferIds&#39; array must be filled
   * @return paymentOperationType
  **/
  @JsonProperty("paymentOperationType")
  public String getPaymentOperationType() {
    if (paymentOperationType == null) {
      return null;
    }
    return paymentOperationType.value();
  }

  public void setPaymentOperationType(PaymentOperationTypeEnum paymentOperationType) {
    this.paymentOperationType = paymentOperationType;
  }

  public JourneyPaymentConfirmationRequest paymentOperationType(PaymentOperationTypeEnum paymentOperationType) {
    this.paymentOperationType = paymentOperationType;
    return this;
  }

 /**
   * List of IDs of individual upgrades that the customer has selected
   * @return upgradeIds
  **/
  @JsonProperty("upgradeIds")
  public List<String> getUpgradeIds() {
    return upgradeIds;
  }

  public void setUpgradeIds(List<String> upgradeIds) {
    this.upgradeIds = upgradeIds;
  }

  public JourneyPaymentConfirmationRequest upgradeIds(List<String> upgradeIds) {
    this.upgradeIds = upgradeIds;
    return this;
  }

  public JourneyPaymentConfirmationRequest addUpgradeIdsItem(String upgradeIdsItem) {
    this.upgradeIds.add(upgradeIdsItem);
    return this;
  }

 /**
   * List of IDs of alternative flight offer being applied.
   * @return alternativeOfferIds
  **/
  @JsonProperty("alternativeOfferIds")
  public List<String> getAlternativeOfferIds() {
    return alternativeOfferIds;
  }

  public void setAlternativeOfferIds(List<String> alternativeOfferIds) {
    this.alternativeOfferIds = alternativeOfferIds;
  }

  public JourneyPaymentConfirmationRequest alternativeOfferIds(List<String> alternativeOfferIds) {
    this.alternativeOfferIds = alternativeOfferIds;
    return this;
  }

  public JourneyPaymentConfirmationRequest addAlternativeOfferIdsItem(String alternativeOfferIdsItem) {
    this.alternativeOfferIds.add(alternativeOfferIdsItem);
    return this;
  }

 /**
   * In case of 3D Secure payment managed by Amadeus Payment Platform, the return URL to be called by APP upon validation of the one-time code
   * @return returnURL
  **/
  @JsonProperty("returnURL")
  public String getReturnURL() {
    return returnURL;
  }

  public void setReturnURL(String returnURL) {
    this.returnURL = returnURL;
  }

  public JourneyPaymentConfirmationRequest returnURL(String returnURL) {
    this.returnURL = returnURL;
    return this;
  }

 /**
   * Was the authorization call successful, in which case finalization should be performed, or did it fail, in which case cleanup should be performed. This is informative of course, final verification is performed between backend and payment provider For backwards compatiblity reasons, this field is not mandatory. If not present, success true is assumed. 
   * @return authorizationSuccessful
  **/
  @JsonProperty("authorizationSuccessful")
  public Boolean isAuthorizationSuccessful() {
    return authorizationSuccessful;
  }

  public void setAuthorizationSuccessful(Boolean authorizationSuccessful) {
    this.authorizationSuccessful = authorizationSuccessful;
  }

  public JourneyPaymentConfirmationRequest authorizationSuccessful(Boolean authorizationSuccessful) {
    this.authorizationSuccessful = authorizationSuccessful;
    return this;
  }

 /**
   * Email address for the payment receipt
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public JourneyPaymentConfirmationRequest email(String email) {
    this.email = email;
    return this;
  }

 /**
   * Code of the preferred language to be used for the receipt, e.g. en-GB for English-United Kingdom. [For more details](http://www.lingoes.net/en/translator/langcode.htm) 
   * @return lang
  **/
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public JourneyPaymentConfirmationRequest lang(String lang) {
    this.lang = lang;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyPaymentConfirmationRequest {\n");
    
    sb.append("    paymentOperationType: ").append(toIndentedString(paymentOperationType)).append("\n");
    sb.append("    upgradeIds: ").append(toIndentedString(upgradeIds)).append("\n");
    sb.append("    alternativeOfferIds: ").append(toIndentedString(alternativeOfferIds)).append("\n");
    sb.append("    returnURL: ").append(toIndentedString(returnURL)).append("\n");
    sb.append("    authorizationSuccessful: ").append(toIndentedString(authorizationSuccessful)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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

