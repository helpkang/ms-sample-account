
package com.koreanair.external.eretail.vo.pnr.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODE_DATE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODE_DATE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}CODE_NAME_TYPE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IS_DATE_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODE_DATE_TYPE", propOrder = {
    "isdaterequired"
})
public class CODEDATETYPE
    extends CODENAMETYPE
{

    @XmlElement(name = "IS_DATE_REQUIRED")
    protected boolean isdaterequired;

    /**
     * Gets the value of the isdaterequired property.
     * 
     */
    public boolean isISDATEREQUIRED() {
        return isdaterequired;
    }

    /**
     * Sets the value of the isdaterequired property.
     * 
     */
    public void setISDATEREQUIRED(boolean value) {
        this.isdaterequired = value;
    }

}
