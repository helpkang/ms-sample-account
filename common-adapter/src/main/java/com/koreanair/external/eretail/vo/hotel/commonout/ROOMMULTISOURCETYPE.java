
package com.koreanair.external.eretail.vo.hotel.commonout;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.koreanair.external.eretail.vo.hotel.commonelementsout.LISTROOMITEMTYPE;


/**
 * This XSD type is used to represent a room and to link it to an hotel in the dupe pool. Introduced by CR3951693.
 * 
 * <p>Java class for ROOM_MULTISOURCE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROOM_MULTISOURCE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}LIST_ROOM_ITEM_TYPE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DUPE_PROPERTY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="B_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="E_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ROOM_MULTISOURCE_TYPE", propOrder = {
    "dupepropertycode",
    "bdate",
    "edate"
})
@XmlSeeAlso({
    RULESDRIVENROOMTYPE.class
})
public class ROOMMULTISOURCETYPE
    extends LISTROOMITEMTYPE
{

    @XmlElement(name = "DUPE_PROPERTY_CODE")
    protected Object dupepropertycode;
    @XmlElement(name = "B_DATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bdate;
    @XmlElement(name = "E_DATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar edate;

    /**
     * Gets the value of the dupepropertycode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDUPEPROPERTYCODE() {
        return dupepropertycode;
    }

    /**
     * Sets the value of the dupepropertycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDUPEPROPERTYCODE(Object value) {
        this.dupepropertycode = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBDATE(XMLGregorianCalendar value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEDATE(XMLGregorianCalendar value) {
        this.edate = value;
    }

}
