
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.common.CODENAMETYPESTRICT;


/**
 * FreeText - may be in different languages
 * 
 * <p>Java class for DESCRIPTION_FREETEXT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DESCRIPTION_FREETEXT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}CODE_NAME_TYPE_STRICT" minOccurs="0"/&gt;
 *         &lt;element name="SUBTYPE" type="{}CODE_NAME_TYPE_STRICT" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TEXT" type="{}DESCRIPTION_FREETEXT_TEXT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DESCRIPTION_FREETEXT_TYPE", propOrder = {
    "type",
    "subtype",
    "listtext"
})
public class DESCRIPTIONFREETEXTTYPE
    implements Serializable
{

    @XmlElement(name = "TYPE")
    protected CODENAMETYPESTRICT type;
    @XmlElement(name = "SUBTYPE")
    protected CODENAMETYPESTRICT subtype;
    @XmlElement(name = "LIST_TEXT")
    protected List<DESCRIPTIONFREETEXTTEXTTYPE> listtext;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public CODENAMETYPESTRICT getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public void setTYPE(CODENAMETYPESTRICT value) {
        this.type = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public CODENAMETYPESTRICT getSUBTYPE() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public void setSUBTYPE(CODENAMETYPESTRICT value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the listtext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTEXT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DESCRIPTIONFREETEXTTEXTTYPE }
     * 
     * 
     */
    public List<DESCRIPTIONFREETEXTTEXTTYPE> getLISTTEXT() {
        if (listtext == null) {
            listtext = new ArrayList<DESCRIPTIONFREETEXTTEXTTYPE>();
        }
        return this.listtext;
    }

}
