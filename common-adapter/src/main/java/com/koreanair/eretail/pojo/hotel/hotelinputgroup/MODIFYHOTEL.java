
package com.koreanair.eretail.pojo.hotel.hotelinputgroup;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MODIFY_HOTEL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MODIFY_HOTEL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}OVERRIDE_MARKUP" minOccurs="0"/&gt;
 *           &lt;element name="BOOKING_SOURCE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *           &lt;element name="LIST_ADDITIONAL_FIELD" maxOccurs="unbounded" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="INDEX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                     &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="BILLBACK_DATA" type="{}BillbackDataType" minOccurs="0"/&gt;
 *           &lt;element name="REMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MODIFY_HOTEL", propOrder = {
    "id",
    "overridemarkup",
    "bookingsource",
    "listadditionalfield",
    "billbackdata",
    "remark"
})
public class MODIFYHOTEL
    implements Serializable
{

    @XmlElement(name = "ID", required = true)
    protected Object id;
    @XmlElement(name = "OVERRIDE_MARKUP")
    protected OVERRIDEMARKUP overridemarkup;
    @XmlElement(name = "BOOKING_SOURCE")
    protected Object bookingsource;
    @XmlElement(name = "LIST_ADDITIONAL_FIELD")
    protected List<MODIFYHOTEL.LISTADDITIONALFIELD> listadditionalfield;
    @XmlElement(name = "BILLBACK_DATA")
    protected BillbackDataType billbackdata;
    @XmlElement(name = "REMARK")
    protected String remark;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setID(Object value) {
        this.id = value;
    }

    /**
     * Gets the value of the overridemarkup property.
     * 
     * @return
     *     possible object is
     *     {@link OVERRIDEMARKUP }
     *     
     */
    public OVERRIDEMARKUP getOVERRIDEMARKUP() {
        return overridemarkup;
    }

    /**
     * Sets the value of the overridemarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link OVERRIDEMARKUP }
     *     
     */
    public void setOVERRIDEMARKUP(OVERRIDEMARKUP value) {
        this.overridemarkup = value;
    }

    /**
     * Gets the value of the bookingsource property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBOOKINGSOURCE() {
        return bookingsource;
    }

    /**
     * Sets the value of the bookingsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBOOKINGSOURCE(Object value) {
        this.bookingsource = value;
    }

    /**
     * Gets the value of the listadditionalfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listadditionalfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTADDITIONALFIELD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MODIFYHOTEL.LISTADDITIONALFIELD }
     * 
     * 
     */
    public List<MODIFYHOTEL.LISTADDITIONALFIELD> getLISTADDITIONALFIELD() {
        if (listadditionalfield == null) {
            listadditionalfield = new ArrayList<MODIFYHOTEL.LISTADDITIONALFIELD>();
        }
        return this.listadditionalfield;
    }

    /**
     * Gets the value of the billbackdata property.
     * 
     * @return
     *     possible object is
     *     {@link BillbackDataType }
     *     
     */
    public BillbackDataType getBILLBACKDATA() {
        return billbackdata;
    }

    /**
     * Sets the value of the billbackdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillbackDataType }
     *     
     */
    public void setBILLBACKDATA(BillbackDataType value) {
        this.billbackdata = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK(String value) {
        this.remark = value;
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
     *         &lt;element name="INDEX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "indexnumber",
        "value"
    })
    public static class LISTADDITIONALFIELD
        implements Serializable
    {

        @XmlElement(name = "INDEX_NUMBER")
        protected int indexnumber;
        @XmlElement(name = "VALUE")
        protected String value;

        /**
         * Gets the value of the indexnumber property.
         * 
         */
        public int getINDEXNUMBER() {
            return indexnumber;
        }

        /**
         * Sets the value of the indexnumber property.
         * 
         */
        public void setINDEXNUMBER(int value) {
            this.indexnumber = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVALUE() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVALUE(String value) {
            this.value = value;
        }

    }

}
