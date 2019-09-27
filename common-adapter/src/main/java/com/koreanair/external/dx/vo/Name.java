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
  * Simple identity information, with major information only
 **/
@ApiModel(description="Simple identity information, with major information only")
public class Name  {
  
  @ApiModelProperty(example = "Arthur Ignatius", value = "Individual first name. If the person has middle names, both first and middle name should be added here (e.g. Arthur Ignatius)")
 /**
   * Individual first name. If the person has middle names, both first and middle name should be added here (e.g. Arthur Ignatius)
  **/
  private String firstName = null;

  @ApiModelProperty(example = "Holmes", value = "")
  private String lastName = null;

  @ApiModelProperty(example = "Dr", value = "Individual title (MR Mister ...)")
 /**
   * Individual title (MR Mister ...)
  **/
  private String title = null;


@XmlType(name="NameTypeEnum")
@XmlEnum(String.class)
public enum NameTypeEnum {

@XmlEnumValue("universal") UNIVERSAL(String.valueOf("universal")), @XmlEnumValue("native") NATIVE(String.valueOf("native"));


    private String value;

    NameTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NameTypeEnum fromValue(String v) {
        for (NameTypeEnum b : NameTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Type of name returned. Universal (supporting only ASCII characters) or native (supporting all Unicode characters) ")
 /**
   * Type of name returned. Universal (supporting only ASCII characters) or native (supporting all Unicode characters) 
  **/
  private NameTypeEnum nameType = NameTypeEnum.UNIVERSAL;
 /**
   * Individual first name. If the person has middle names, both first and middle name should be added here (e.g. Arthur Ignatius)
   * @return firstName
  **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Name firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * Get lastName
   * @return lastName
  **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Name lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * Individual title (MR Mister ...)
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Name title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Type of name returned. Universal (supporting only ASCII characters) or native (supporting all Unicode characters) 
   * @return nameType
  **/
  @JsonProperty("nameType")
  public String getNameType() {
    if (nameType == null) {
      return null;
    }
    return nameType.value();
  }

  public void setNameType(NameTypeEnum nameType) {
    this.nameType = nameType;
  }

  public Name nameType(NameTypeEnum nameType) {
    this.nameType = nameType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    nameType: ").append(toIndentedString(nameType)).append("\n");
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

