
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MULTIMEDIA_ERRORS_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MULTIMEDIA_ERRORS_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_THUMBNAIL_ERROR" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_MARKETING_TEXT_ERROR" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_LANGUAGE_ERROR" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MULTIMEDIA_ERRORS_TYPE", propOrder = {
    "listthumbnailerror",
    "listmarketingtexterror",
    "listlanguageerror"
})
public class MULTIMEDIAERRORSTYPE
    implements Serializable
{

    @XmlElement(name = "LIST_THUMBNAIL_ERROR")
    protected List<String> listthumbnailerror;
    @XmlElement(name = "LIST_MARKETING_TEXT_ERROR")
    protected List<String> listmarketingtexterror;
    @XmlElement(name = "LIST_LANGUAGE_ERROR")
    protected List<String> listlanguageerror;

    /**
     * Gets the value of the listthumbnailerror property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listthumbnailerror property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTHUMBNAILERROR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTTHUMBNAILERROR() {
        if (listthumbnailerror == null) {
            listthumbnailerror = new ArrayList<String>();
        }
        return this.listthumbnailerror;
    }

    /**
     * Gets the value of the listmarketingtexterror property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmarketingtexterror property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMARKETINGTEXTERROR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTMARKETINGTEXTERROR() {
        if (listmarketingtexterror == null) {
            listmarketingtexterror = new ArrayList<String>();
        }
        return this.listmarketingtexterror;
    }

    /**
     * Gets the value of the listlanguageerror property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listlanguageerror property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTLANGUAGEERROR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTLANGUAGEERROR() {
        if (listlanguageerror == null) {
            listlanguageerror = new ArrayList<String>();
        }
        return this.listlanguageerror;
    }

}
