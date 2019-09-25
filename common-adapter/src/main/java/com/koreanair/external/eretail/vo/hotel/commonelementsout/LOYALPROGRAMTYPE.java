
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.common.CODENAMETYPESIMPLE;


/**
 * <p>Java class for LOYAL_PROGRAM_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOYAL_PROGRAM_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}CODE_NAME_TYPE_SIMPLE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_DESCRIPTION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_TEXT" type="{}DESCRIPTION_FREETEXT_TEXT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRAVEL_SECTOR" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOYAL_PROGRAM_TYPE", propOrder = {
    "listdescription",
    "travelsector"
})
public class LOYALPROGRAMTYPE
    extends CODENAMETYPESIMPLE
    implements Serializable
{

    @XmlElement(name = "LIST_DESCRIPTION")
    protected List<LOYALPROGRAMTYPE.LISTDESCRIPTION> listdescription;
    @XmlElement(name = "TRAVEL_SECTOR")
    protected CODENAMETYPESIMPLE travelsector;

    /**
     * Gets the value of the listdescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDESCRIPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOYALPROGRAMTYPE.LISTDESCRIPTION }
     * 
     * 
     */
    public List<LOYALPROGRAMTYPE.LISTDESCRIPTION> getLISTDESCRIPTION() {
        if (listdescription == null) {
            listdescription = new ArrayList<LOYALPROGRAMTYPE.LISTDESCRIPTION>();
        }
        return this.listdescription;
    }

    /**
     * Gets the value of the travelsector property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESIMPLE }
     *     
     */
    public CODENAMETYPESIMPLE getTRAVELSECTOR() {
        return travelsector;
    }

    /**
     * Sets the value of the travelsector property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESIMPLE }
     *     
     */
    public void setTRAVELSECTOR(CODENAMETYPESIMPLE value) {
        this.travelsector = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
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
    @XmlType(name = "", propOrder = {
        "listtext"
    })
    public static class LISTDESCRIPTION
        implements Serializable
    {

        @XmlElement(name = "LIST_TEXT")
        protected List<DESCRIPTIONFREETEXTTEXTTYPE> listtext;

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

}
