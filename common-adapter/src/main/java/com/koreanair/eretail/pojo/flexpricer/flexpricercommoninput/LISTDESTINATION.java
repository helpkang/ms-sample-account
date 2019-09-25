
package com.koreanair.eretail.pojo.flexpricer.flexpricercommoninput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}B_LOCATION" minOccurs="0"/&gt;
 *         &lt;element ref="{}E_LOCATION" minOccurs="0"/&gt;
 *         &lt;element ref="{}B_DATE" minOccurs="0"/&gt;
 *         &lt;element ref="{}B_ANY_TIME" minOccurs="0"/&gt;
 *         &lt;element ref="{}B_TIME_WINDOW" minOccurs="0"/&gt;
 *         &lt;element ref="{}DATE_RANGE" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_INCLUDE_CONNECTION" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element name="MIN_LAYOVER_TIME" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element ref="{}BOUND_TO_MODIFY" minOccurs="0"/&gt;
 *         &lt;element ref="{}BOUND_TO_CALCULATE" minOccurs="0"/&gt;
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
    "blocation",
    "elocation",
    "bdate",
    "banytime",
    "btimewindow",
    "daterange",
    "listincludeconnection",
    "minlayovertime",
    "boundtomodify",
    "boundtocalculate"
})
@XmlRootElement(name = "LIST_DESTINATION")
public class LISTDESTINATION
    implements Serializable
{

    @XmlElement(name = "B_LOCATION")
    protected String blocation;
    @XmlElement(name = "E_LOCATION")
    protected String elocation;
    @XmlElement(name = "B_DATE")
    protected String bdate;
    @XmlElement(name = "B_ANY_TIME")
    protected Boolean banytime;
    @XmlElement(name = "B_TIME_WINDOW")
    protected String btimewindow;
    @XmlElement(name = "DATE_RANGE")
    protected DATERANGE daterange;
    @XmlElement(name = "LIST_INCLUDE_CONNECTION")
    protected List<LISTINCLUDECONNECTION> listincludeconnection;
    @XmlElement(name = "MIN_LAYOVER_TIME")
    @XmlSchemaType(name = "unsignedInt")
    protected Long minlayovertime;
    @XmlElement(name = "BOUND_TO_MODIFY")
    protected Boolean boundtomodify;
    @XmlElement(name = "BOUND_TO_CALCULATE")
    protected Boolean boundtocalculate;

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLOCATION(String value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELOCATION(String value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDATE(String value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the banytime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBANYTIME() {
        return banytime;
    }

    /**
     * Sets the value of the banytime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBANYTIME(Boolean value) {
        this.banytime = value;
    }

    /**
     * Gets the value of the btimewindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTIMEWINDOW() {
        return btimewindow;
    }

    /**
     * Sets the value of the btimewindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTIMEWINDOW(String value) {
        this.btimewindow = value;
    }

    /**
     * Gets the value of the daterange property.
     * 
     * @return
     *     possible object is
     *     {@link DATERANGE }
     *     
     */
    public DATERANGE getDATERANGE() {
        return daterange;
    }

    /**
     * Sets the value of the daterange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATERANGE }
     *     
     */
    public void setDATERANGE(DATERANGE value) {
        this.daterange = value;
    }

    /**
     * Gets the value of the listincludeconnection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listincludeconnection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTINCLUDECONNECTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTINCLUDECONNECTION }
     * 
     * 
     */
    public List<LISTINCLUDECONNECTION> getLISTINCLUDECONNECTION() {
        if (listincludeconnection == null) {
            listincludeconnection = new ArrayList<LISTINCLUDECONNECTION>();
        }
        return this.listincludeconnection;
    }

    /**
     * Gets the value of the minlayovertime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMINLAYOVERTIME() {
        return minlayovertime;
    }

    /**
     * Sets the value of the minlayovertime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMINLAYOVERTIME(Long value) {
        this.minlayovertime = value;
    }

    /**
     * Gets the value of the boundtomodify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOUNDTOMODIFY() {
        return boundtomodify;
    }

    /**
     * Sets the value of the boundtomodify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOUNDTOMODIFY(Boolean value) {
        this.boundtomodify = value;
    }

    /**
     * Gets the value of the boundtocalculate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOUNDTOCALCULATE() {
        return boundtocalculate;
    }

    /**
     * Sets the value of the boundtocalculate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOUNDTOCALCULATE(Boolean value) {
        this.boundtocalculate = value;
    }

}
