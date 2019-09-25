
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.common.CODENAMETYPESTRICT;


/**
 * <p>Java class for MEETING_FACILITIES_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MEETING_FACILITIES_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LARGEST_ROOM_SPACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LARGEST_SEATING_CAPACITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEETING_ROOM_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SMALLEST_ROOM_SPACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SMALLEST_SEATING_CAPACITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_SEATING_CAPACITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_ROOM_SPACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UNIT_OF_MEASURE" type="{}CODE_NAME_TYPE_STRICT" minOccurs="0"/&gt;
 *         &lt;element name="LIST_MEETING_ROOM" type="{}MEETING_ROOM_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEETING_FACILITIES_TYPE", propOrder = {
    "largestroomspace",
    "largestseatingcapacity",
    "meetingroomnumber",
    "smallestroomspace",
    "smallestseatingcapacity",
    "totalseatingcapacity",
    "totalroomspace",
    "unitofmeasure",
    "listmeetingroom"
})
public class MEETINGFACILITIESTYPE
    implements Serializable
{

    @XmlElement(name = "LARGEST_ROOM_SPACE")
    protected String largestroomspace;
    @XmlElement(name = "LARGEST_SEATING_CAPACITY")
    protected String largestseatingcapacity;
    @XmlElement(name = "MEETING_ROOM_NUMBER")
    protected String meetingroomnumber;
    @XmlElement(name = "SMALLEST_ROOM_SPACE")
    protected String smallestroomspace;
    @XmlElement(name = "SMALLEST_SEATING_CAPACITY")
    protected String smallestseatingcapacity;
    @XmlElement(name = "TOTAL_SEATING_CAPACITY")
    protected String totalseatingcapacity;
    @XmlElement(name = "TOTAL_ROOM_SPACE")
    protected String totalroomspace;
    @XmlElement(name = "UNIT_OF_MEASURE")
    protected CODENAMETYPESTRICT unitofmeasure;
    @XmlElement(name = "LIST_MEETING_ROOM")
    protected List<MEETINGROOMTYPE> listmeetingroom;

    /**
     * Gets the value of the largestroomspace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLARGESTROOMSPACE() {
        return largestroomspace;
    }

    /**
     * Sets the value of the largestroomspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLARGESTROOMSPACE(String value) {
        this.largestroomspace = value;
    }

    /**
     * Gets the value of the largestseatingcapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLARGESTSEATINGCAPACITY() {
        return largestseatingcapacity;
    }

    /**
     * Sets the value of the largestseatingcapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLARGESTSEATINGCAPACITY(String value) {
        this.largestseatingcapacity = value;
    }

    /**
     * Gets the value of the meetingroomnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEETINGROOMNUMBER() {
        return meetingroomnumber;
    }

    /**
     * Sets the value of the meetingroomnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEETINGROOMNUMBER(String value) {
        this.meetingroomnumber = value;
    }

    /**
     * Gets the value of the smallestroomspace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMALLESTROOMSPACE() {
        return smallestroomspace;
    }

    /**
     * Sets the value of the smallestroomspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMALLESTROOMSPACE(String value) {
        this.smallestroomspace = value;
    }

    /**
     * Gets the value of the smallestseatingcapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMALLESTSEATINGCAPACITY() {
        return smallestseatingcapacity;
    }

    /**
     * Sets the value of the smallestseatingcapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMALLESTSEATINGCAPACITY(String value) {
        this.smallestseatingcapacity = value;
    }

    /**
     * Gets the value of the totalseatingcapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALSEATINGCAPACITY() {
        return totalseatingcapacity;
    }

    /**
     * Sets the value of the totalseatingcapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALSEATINGCAPACITY(String value) {
        this.totalseatingcapacity = value;
    }

    /**
     * Gets the value of the totalroomspace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALROOMSPACE() {
        return totalroomspace;
    }

    /**
     * Sets the value of the totalroomspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALROOMSPACE(String value) {
        this.totalroomspace = value;
    }

    /**
     * Gets the value of the unitofmeasure property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public CODENAMETYPESTRICT getUNITOFMEASURE() {
        return unitofmeasure;
    }

    /**
     * Sets the value of the unitofmeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public void setUNITOFMEASURE(CODENAMETYPESTRICT value) {
        this.unitofmeasure = value;
    }

    /**
     * Gets the value of the listmeetingroom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmeetingroom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMEETINGROOM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MEETINGROOMTYPE }
     * 
     * 
     */
    public List<MEETINGROOMTYPE> getLISTMEETINGROOM() {
        if (listmeetingroom == null) {
            listmeetingroom = new ArrayList<MEETINGROOMTYPE>();
        }
        return this.listmeetingroom;
    }

}
