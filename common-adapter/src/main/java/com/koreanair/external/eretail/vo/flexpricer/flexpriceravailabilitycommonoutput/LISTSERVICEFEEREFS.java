
package com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput;

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
 *         &lt;element name="REF_INFO"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="REFERENCING_DETAIL" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="QUALIFIER" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "refinfo"
})
@XmlRootElement(name = "LIST_SERVICE_FEE_REFS")
public class LISTSERVICEFEEREFS
    implements Serializable
{

    @XmlElement(name = "REF_INFO", required = true)
    protected LISTSERVICEFEEREFS.REFINFO refinfo;

    /**
     * Gets the value of the refinfo property.
     * 
     * @return
     *     possible object is
     *     {@link LISTSERVICEFEEREFS.REFINFO }
     *     
     */
    public LISTSERVICEFEEREFS.REFINFO getREFINFO() {
        return refinfo;
    }

    /**
     * Sets the value of the refinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTSERVICEFEEREFS.REFINFO }
     *     
     */
    public void setREFINFO(LISTSERVICEFEEREFS.REFINFO value) {
        this.refinfo = value;
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
     *         &lt;element name="REFERENCING_DETAIL" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="QUALIFIER" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "referencingdetail"
    })
    public static class REFINFO
        implements Serializable
    {

        @XmlElement(name = "REFERENCING_DETAIL", required = true)
        protected List<LISTSERVICEFEEREFS.REFINFO.REFERENCINGDETAIL> referencingdetail;

        /**
         * Gets the value of the referencingdetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the referencingdetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREFERENCINGDETAIL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTSERVICEFEEREFS.REFINFO.REFERENCINGDETAIL }
         * 
         * 
         */
        public List<LISTSERVICEFEEREFS.REFINFO.REFERENCINGDETAIL> getREFERENCINGDETAIL() {
            if (referencingdetail == null) {
                referencingdetail = new ArrayList<LISTSERVICEFEEREFS.REFINFO.REFERENCINGDETAIL>();
            }
            return this.referencingdetail;
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
         *         &lt;element name="QUALIFIER" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NUMBER" type="{}unprotectedStringType"/&gt;
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
            "qualifier",
            "number"
        })
        public static class REFERENCINGDETAIL
            implements Serializable
        {

            @XmlElement(name = "QUALIFIER", required = true)
            protected String qualifier;
            @XmlElement(name = "NUMBER", required = true)
            protected String number;

            /**
             * Gets the value of the qualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQUALIFIER() {
                return qualifier;
            }

            /**
             * Sets the value of the qualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQUALIFIER(String value) {
                this.qualifier = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMBER() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMBER(String value) {
                this.number = value;
            }

        }

    }

}
