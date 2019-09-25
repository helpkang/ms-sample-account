
package com.koreanair.external.eretail.vo.specialservices.commonservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SERVICE_output complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVICE_output"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SERVICE_KEY" type="{}SERVICE_KEY_TYPE"/&gt;
 *         &lt;element name="DEFINITION" type="{}DEFINITION_type"/&gt;
 *         &lt;element name="LIST_SELECTION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SELECTION_KEY" type="{}SELECTION_KEY_type"/&gt;
 *                   &lt;element name="LIST_ASSOCIATION" type="{}ASSOCIATION_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_ATTRIBUTE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_PROPERTY" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;group ref="{}CodeNameGroup" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_PARAMETER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;group ref="{}CodeNameGroup" minOccurs="0"/&gt;
 *                                       &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
@XmlType(name = "SERVICE_output", propOrder = {
    "servicekey",
    "definition",
    "listselection"
})
public class SERVICEOutput
    implements Serializable
{

    @XmlElement(name = "SERVICE_KEY", required = true)
    protected SERVICEKEYTYPE servicekey;
    @XmlElement(name = "DEFINITION", required = true)
    protected DEFINITIONType definition;
    @XmlElement(name = "LIST_SELECTION")
    protected List<SERVICEOutput.LISTSELECTION> listselection;

    /**
     * Gets the value of the servicekey property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICEKEYTYPE }
     *     
     */
    public SERVICEKEYTYPE getSERVICEKEY() {
        return servicekey;
    }

    /**
     * Sets the value of the servicekey property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICEKEYTYPE }
     *     
     */
    public void setSERVICEKEY(SERVICEKEYTYPE value) {
        this.servicekey = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link DEFINITIONType }
     *     
     */
    public DEFINITIONType getDEFINITION() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEFINITIONType }
     *     
     */
    public void setDEFINITION(DEFINITIONType value) {
        this.definition = value;
    }

    /**
     * Gets the value of the listselection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listselection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSELECTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SERVICEOutput.LISTSELECTION }
     * 
     * 
     */
    public List<SERVICEOutput.LISTSELECTION> getLISTSELECTION() {
        if (listselection == null) {
            listselection = new ArrayList<SERVICEOutput.LISTSELECTION>();
        }
        return this.listselection;
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
     *         &lt;element name="SELECTION_KEY" type="{}SELECTION_KEY_type"/&gt;
     *         &lt;element name="LIST_ASSOCIATION" type="{}ASSOCIATION_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_ATTRIBUTE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_PROPERTY" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;group ref="{}CodeNameGroup" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_PARAMETER" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;group ref="{}CodeNameGroup" minOccurs="0"/&gt;
     *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "selectionkey",
        "listassociation",
        "listattribute",
        "listproperty"
    })
    public static class LISTSELECTION
        implements Serializable
    {

        @XmlElement(name = "SELECTION_KEY", required = true)
        protected SELECTIONKEYType selectionkey;
        @XmlElement(name = "LIST_ASSOCIATION")
        protected List<ASSOCIATIONTYPE> listassociation;
        @XmlElement(name = "LIST_ATTRIBUTE")
        protected List<SERVICEOutput.LISTSELECTION.LISTATTRIBUTE> listattribute;
        @XmlElement(name = "LIST_PROPERTY")
        protected List<SERVICEOutput.LISTSELECTION.LISTPROPERTY> listproperty;

        /**
         * Gets the value of the selectionkey property.
         * 
         * @return
         *     possible object is
         *     {@link SELECTIONKEYType }
         *     
         */
        public SELECTIONKEYType getSELECTIONKEY() {
            return selectionkey;
        }

        /**
         * Sets the value of the selectionkey property.
         * 
         * @param value
         *     allowed object is
         *     {@link SELECTIONKEYType }
         *     
         */
        public void setSELECTIONKEY(SELECTIONKEYType value) {
            this.selectionkey = value;
        }

        /**
         * Gets the value of the listassociation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listassociation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTASSOCIATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ASSOCIATIONTYPE }
         * 
         * 
         */
        public List<ASSOCIATIONTYPE> getLISTASSOCIATION() {
            if (listassociation == null) {
                listassociation = new ArrayList<ASSOCIATIONTYPE>();
            }
            return this.listassociation;
        }

        /**
         * Gets the value of the listattribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listattribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTATTRIBUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SERVICEOutput.LISTSELECTION.LISTATTRIBUTE }
         * 
         * 
         */
        public List<SERVICEOutput.LISTSELECTION.LISTATTRIBUTE> getLISTATTRIBUTE() {
            if (listattribute == null) {
                listattribute = new ArrayList<SERVICEOutput.LISTSELECTION.LISTATTRIBUTE>();
            }
            return this.listattribute;
        }

        /**
         * Gets the value of the listproperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listproperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPROPERTY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SERVICEOutput.LISTSELECTION.LISTPROPERTY }
         * 
         * 
         */
        public List<SERVICEOutput.LISTSELECTION.LISTPROPERTY> getLISTPROPERTY() {
            if (listproperty == null) {
                listproperty = new ArrayList<SERVICEOutput.LISTSELECTION.LISTPROPERTY>();
            }
            return this.listproperty;
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
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "type",
            "value"
        })
        public static class LISTATTRIBUTE
            implements Serializable
        {

            @XmlElement(name = "TYPE", required = true)
            protected String type;
            @XmlElement(name = "VALUE", required = true)
            protected String value;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
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
         *         &lt;group ref="{}CodeNameGroup" minOccurs="0"/&gt;
         *         &lt;element name="LIST_PARAMETER" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;group ref="{}CodeNameGroup" minOccurs="0"/&gt;
         *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "code",
            "name",
            "listparameter"
        })
        public static class LISTPROPERTY
            implements Serializable
        {

            @XmlElement(name = "CODE")
            protected String code;
            @XmlElement(name = "NAME")
            protected String name;
            @XmlElement(name = "LIST_PARAMETER")
            protected List<SERVICEOutput.LISTSELECTION.LISTPROPERTY.LISTPARAMETER> listparameter;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODE() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODE(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the listparameter property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listparameter property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTPARAMETER().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SERVICEOutput.LISTSELECTION.LISTPROPERTY.LISTPARAMETER }
             * 
             * 
             */
            public List<SERVICEOutput.LISTSELECTION.LISTPROPERTY.LISTPARAMETER> getLISTPARAMETER() {
                if (listparameter == null) {
                    listparameter = new ArrayList<SERVICEOutput.LISTSELECTION.LISTPROPERTY.LISTPARAMETER>();
                }
                return this.listparameter;
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
             *         &lt;group ref="{}CodeNameGroup" minOccurs="0"/&gt;
             *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "code",
                "name",
                "value"
            })
            public static class LISTPARAMETER
                implements Serializable
            {

                @XmlElement(name = "CODE")
                protected String code;
                @XmlElement(name = "NAME")
                protected String name;
                @XmlElement(name = "VALUE", required = true)
                protected String value;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCODE() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCODE(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNAME() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNAME(String value) {
                    this.name = value;
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

    }

}
