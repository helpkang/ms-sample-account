
package com.koreanair.external.eretail.vo.hotel.reservation.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListErrorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}SimpleListErrorType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SUBERROR_LIST" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SUBERROR_ITEMS" type="{}SubErrorType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SUBERROR" type="{}SubErrorType" minOccurs="0"/&gt;
 *         &lt;element name="HTL_LIST_FIELD_ERROR" type="{}HTL_unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListErrorType", propOrder = {
    "suberrorlist",
    "suberror",
    "htllistfielderror"
})
public class ListErrorType
    extends SimpleListErrorType
    implements Serializable
{

    @XmlElement(name = "SUBERROR_LIST")
    protected ListErrorType.SUBERRORLIST suberrorlist;
    @XmlElement(name = "SUBERROR")
    protected SubErrorType suberror;
    @XmlElement(name = "HTL_LIST_FIELD_ERROR")
    protected List<String> htllistfielderror;

    /**
     * Gets the value of the suberrorlist property.
     * 
     * @return
     *     possible object is
     *     {@link ListErrorType.SUBERRORLIST }
     *     
     */
    public ListErrorType.SUBERRORLIST getSUBERRORLIST() {
        return suberrorlist;
    }

    /**
     * Sets the value of the suberrorlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListErrorType.SUBERRORLIST }
     *     
     */
    public void setSUBERRORLIST(ListErrorType.SUBERRORLIST value) {
        this.suberrorlist = value;
    }

    /**
     * Gets the value of the suberror property.
     * 
     * @return
     *     possible object is
     *     {@link SubErrorType }
     *     
     */
    public SubErrorType getSUBERROR() {
        return suberror;
    }

    /**
     * Sets the value of the suberror property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubErrorType }
     *     
     */
    public void setSUBERROR(SubErrorType value) {
        this.suberror = value;
    }

    /**
     * Gets the value of the htllistfielderror property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the htllistfielderror property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHTLLISTFIELDERROR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHTLLISTFIELDERROR() {
        if (htllistfielderror == null) {
            htllistfielderror = new ArrayList<String>();
        }
        return this.htllistfielderror;
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
     *         &lt;element name="SUBERROR_ITEMS" type="{}SubErrorType" maxOccurs="unbounded"/&gt;
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
        "suberroritems"
    })
    public static class SUBERRORLIST
        implements Serializable
    {

        @XmlElement(name = "SUBERROR_ITEMS", required = true)
        protected List<SubErrorType> suberroritems;

        /**
         * Gets the value of the suberroritems property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the suberroritems property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSUBERRORITEMS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubErrorType }
         * 
         * 
         */
        public List<SubErrorType> getSUBERRORITEMS() {
            if (suberroritems == null) {
                suberroritems = new ArrayList<SubErrorType>();
            }
            return this.suberroritems;
        }

    }

}
