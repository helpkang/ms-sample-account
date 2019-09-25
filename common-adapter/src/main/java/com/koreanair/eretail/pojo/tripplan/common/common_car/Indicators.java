
package com.koreanair.eretail.pojo.tripplan.common.common_car;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * INDICATORS
 * 
 * <p>Java class for indicators complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="indicators"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_CD" type="{}CD_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ID" type="{}ID_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FT" type="{}FT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_IT" type="{}IT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PC" type="{}PC_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indicators", propOrder = {
    "listcd",
    "listid",
    "listft",
    "listit",
    "listpc"
})
public class Indicators
    implements Serializable
{

    @XmlElement(name = "LIST_CD")
    protected List<CDTYPE> listcd;
    @XmlElement(name = "LIST_ID")
    protected List<IDTYPE> listid;
    @XmlElement(name = "LIST_FT")
    protected List<FTTYPE> listft;
    @XmlElement(name = "LIST_IT")
    protected List<ITTYPE> listit;
    @XmlElement(name = "LIST_PC")
    protected List<PCTYPE> listpc;

    /**
     * Gets the value of the listcd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CDTYPE }
     * 
     * 
     */
    public List<CDTYPE> getLISTCD() {
        if (listcd == null) {
            listcd = new ArrayList<CDTYPE>();
        }
        return this.listcd;
    }

    /**
     * Gets the value of the listid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDTYPE }
     * 
     * 
     */
    public List<IDTYPE> getLISTID() {
        if (listid == null) {
            listid = new ArrayList<IDTYPE>();
        }
        return this.listid;
    }

    /**
     * Gets the value of the listft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FTTYPE }
     * 
     * 
     */
    public List<FTTYPE> getLISTFT() {
        if (listft == null) {
            listft = new ArrayList<FTTYPE>();
        }
        return this.listft;
    }

    /**
     * Gets the value of the listit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTIT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ITTYPE }
     * 
     * 
     */
    public List<ITTYPE> getLISTIT() {
        if (listit == null) {
            listit = new ArrayList<ITTYPE>();
        }
        return this.listit;
    }

    /**
     * Gets the value of the listpc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PCTYPE }
     * 
     * 
     */
    public List<PCTYPE> getLISTPC() {
        if (listpc == null) {
            listpc = new ArrayList<PCTYPE>();
        }
        return this.listpc;
    }

}
