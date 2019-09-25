
package com.koreanair.eretail.pojo.common.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{}SUBERROR_ITEMS" maxOccurs="unbounded"/&gt;
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
@XmlRootElement(name = "SUBERROR_LIST")
public class SUBERRORLIST
    implements Serializable
{

    @XmlElement(name = "SUBERROR_ITEMS", required = true)
    protected List<SUBERRORITEMS> suberroritems;

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
     * {@link SUBERRORITEMS }
     * 
     * 
     */
    public List<SUBERRORITEMS> getSUBERRORITEMS() {
        if (suberroritems == null) {
            suberroritems = new ArrayList<SUBERRORITEMS>();
        }
        return this.suberroritems;
    }

}
