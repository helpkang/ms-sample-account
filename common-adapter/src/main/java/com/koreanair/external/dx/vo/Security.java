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
  * Security for the Remark
 **/
@ApiModel(description="Security for the Remark")
public class Security  {
  
  @ApiModelProperty(value = "The airline can group several offices and define it as a family of offices in Amadeus System (through Amadeus Extended Ownership - EOS). This option allows the airline to apply the permission of an office to all the offices of his family. ")
 /**
   * The airline can group several offices and define it as a family of offices in Amadeus System (through Amadeus Extended Ownership - EOS). This option allows the airline to apply the permission of an office to all the offices of his family. 
  **/
  private Boolean isAppliedToFamily = null;

  @ApiModelProperty(required = true, value = "Office to which the security credential is granted. It may be one the following: - a complete office ID (e.g. LON6X0100) - a partial office id (e.g. ***6X0***, LON6X0***, ***6X0100) - only wildcards (e.g. *********) - wildcards for the corporate code (LON**0100) - wildcards for the qualifier code (e.g. LON6X*100) - Any kind of wildcards for the Office number (e.g. LON6X010*, LON6X01**, LON6X0***). ")
 /**
   * Office to which the security credential is granted. It may be one the following: - a complete office ID (e.g. LON6X0100) - a partial office id (e.g. ***6X0***, LON6X0***, ***6X0100) - only wildcards (e.g. *********) - wildcards for the corporate code (LON**0100) - wildcards for the qualifier code (e.g. LON6X*100) - Any kind of wildcards for the Office number (e.g. LON6X010*, LON6X01**, LON6X0***). 
  **/
  private String office = null;


@XmlType(name="PermissionEnum")
@XmlEnum(String.class)
public enum PermissionEnum {

@XmlEnumValue("read") READ(String.valueOf("read")), @XmlEnumValue("write") WRITE(String.valueOf("write"));


    private String value;

    PermissionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PermissionEnum fromValue(String v) {
        for (PermissionEnum b : PermissionEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private PermissionEnum permission = PermissionEnum.READ;
 /**
   * The airline can group several offices and define it as a family of offices in Amadeus System (through Amadeus Extended Ownership - EOS). This option allows the airline to apply the permission of an office to all the offices of his family. 
   * @return isAppliedToFamily
  **/
  @JsonProperty("isAppliedToFamily")
  public Boolean isIsAppliedToFamily() {
    return isAppliedToFamily;
  }

  public void setIsAppliedToFamily(Boolean isAppliedToFamily) {
    this.isAppliedToFamily = isAppliedToFamily;
  }

  public Security isAppliedToFamily(Boolean isAppliedToFamily) {
    this.isAppliedToFamily = isAppliedToFamily;
    return this;
  }

 /**
   * Office to which the security credential is granted. It may be one the following: - a complete office ID (e.g. LON6X0100) - a partial office id (e.g. ***6X0***, LON6X0***, ***6X0100) - only wildcards (e.g. *********) - wildcards for the corporate code (LON**0100) - wildcards for the qualifier code (e.g. LON6X*100) - Any kind of wildcards for the Office number (e.g. LON6X010*, LON6X01**, LON6X0***). 
   * @return office
  **/
  @JsonProperty("office")
  public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }

  public Security office(String office) {
    this.office = office;
    return this;
  }

 /**
   * Get permission
   * @return permission
  **/
  @JsonProperty("permission")
  public String getPermission() {
    if (permission == null) {
      return null;
    }
    return permission.value();
  }

  public void setPermission(PermissionEnum permission) {
    this.permission = permission;
  }

  public Security permission(PermissionEnum permission) {
    this.permission = permission;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Security {\n");
    
    sb.append("    isAppliedToFamily: ").append(toIndentedString(isAppliedToFamily)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

