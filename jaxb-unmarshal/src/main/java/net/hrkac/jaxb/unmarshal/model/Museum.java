//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.03 at 10:04:09 PM CEST 
//


package net.hrkac.jaxb.unmarshal.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for museum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="museum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MUSEUM_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PERMANENT_EXHIBITION" type="{}exhibition" minOccurs="0"/>
 *         &lt;element name="SPECIAL_EXHIBITION" type="{}exhibition" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="children_allowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "museum", propOrder = {
    "city",
    "museumname",
    "permanentexhibition",
    "specialexhibition"
})
public class Museum {

    @XmlElement(name = "CITY")
    protected String city;
    @XmlElement(name = "MUSEUM_NAME")
    protected String museumname;
    @XmlElement(name = "PERMANENT_EXHIBITION")
    protected Exhibition permanentexhibition;
    @XmlElement(name = "SPECIAL_EXHIBITION")
    protected Exhibition specialexhibition;
    @XmlAttribute(name = "children_allowed")
    protected Boolean childrenAllowed;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITY(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the museumname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMUSEUMNAME() {
        return museumname;
    }

    /**
     * Sets the value of the museumname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMUSEUMNAME(String value) {
        this.museumname = value;
    }

    /**
     * Gets the value of the permanentexhibition property.
     * 
     * @return
     *     possible object is
     *     {@link Exhibition }
     *     
     */
    public Exhibition getPERMANENTEXHIBITION() {
        return permanentexhibition;
    }

    /**
     * Sets the value of the permanentexhibition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exhibition }
     *     
     */
    public void setPERMANENTEXHIBITION(Exhibition value) {
        this.permanentexhibition = value;
    }

    /**
     * Gets the value of the specialexhibition property.
     * 
     * @return
     *     possible object is
     *     {@link Exhibition }
     *     
     */
    public Exhibition getSPECIALEXHIBITION() {
        return specialexhibition;
    }

    /**
     * Sets the value of the specialexhibition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exhibition }
     *     
     */
    public void setSPECIALEXHIBITION(Exhibition value) {
        this.specialexhibition = value;
    }

    /**
     * Gets the value of the childrenAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChildrenAllowed() {
        return childrenAllowed;
    }

    /**
     * Sets the value of the childrenAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChildrenAllowed(Boolean value) {
        this.childrenAllowed = value;
    }

}
