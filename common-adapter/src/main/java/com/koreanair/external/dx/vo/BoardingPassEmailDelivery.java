package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BoardingPassAttachment;
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
  * Email delivery method to send an email to the provided address. An attachment can be requested in the email to provide the boarding pass. The email format might contain a link to a boarding pass depending on the email format created for the airline. The link is sometimes used to return the URL for handling the boarding pass through a specific website or, by default, through the Amadeus product (if configured by the airline). 
 **/
@ApiModel(description="Email delivery method to send an email to the provided address. An attachment can be requested in the email to provide the boarding pass. The email format might contain a link to a boarding pass depending on the email format created for the airline. The link is sometimes used to return the URL for handling the boarding pass through a specific website or, by default, through the Amadeus product (if configured by the airline). ")
public class BoardingPassEmailDelivery extends BoardingPassDeliveryMethod {
  
  @ApiModelProperty(required = true, value = "Email address to send the email to, e.g. test@amadeus.com")
 /**
   * Email address to send the email to, e.g. test@amadeus.com
  **/
  private String recipient = null;

  @ApiModelProperty(required = true, value = "Email address of the sender, e.g. no-reply@amadeus.com")
 /**
   * Email address of the sender, e.g. no-reply@amadeus.com
  **/
  private String sender = null;

  @ApiModelProperty(required = true, value = "Email subject")
 /**
   * Email subject
  **/
  private String subject = null;

  @ApiModelProperty(value = "")
  private BoardingPassAttachment attachment = null;

  @ApiModelProperty(value = "URL link to your specific website to handle the boarding pass on your side. It is added to the airline email text.")
 /**
   * URL link to your specific website to handle the boarding pass on your side. It is added to the airline email text.
  **/
  private String link = null;
 /**
   * Email address to send the email to, e.g. test@amadeus.com
   * @return recipient
  **/
  @JsonProperty("recipient")
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public BoardingPassEmailDelivery recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

 /**
   * Email address of the sender, e.g. no-reply@amadeus.com
   * @return sender
  **/
  @JsonProperty("sender")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public BoardingPassEmailDelivery sender(String sender) {
    this.sender = sender;
    return this;
  }

 /**
   * Email subject
   * @return subject
  **/
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public BoardingPassEmailDelivery subject(String subject) {
    this.subject = subject;
    return this;
  }

 /**
   * Get attachment
   * @return attachment
  **/
  @JsonProperty("attachment")
  public BoardingPassAttachment getAttachment() {
    return attachment;
  }

  public void setAttachment(BoardingPassAttachment attachment) {
    this.attachment = attachment;
  }

  public BoardingPassEmailDelivery attachment(BoardingPassAttachment attachment) {
    this.attachment = attachment;
    return this;
  }

 /**
   * URL link to your specific website to handle the boarding pass on your side. It is added to the airline email text.
   * @return link
  **/
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public BoardingPassEmailDelivery link(String link) {
    this.link = link;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardingPassEmailDelivery {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

