//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.09 at 02:09:56 PM CEST 
//


package uk.org.naptan;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StopPoints" type="{http://www.naptan.org.uk/}StopPointsStructure" minOccurs="0"/>
 *         &lt;element name="StopAreas" type="{http://www.naptan.org.uk/}StopAreasStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.naptan.org.uk/}DocumentModificationDetailsGroup"/>
 *       &lt;attribute name="SchemaVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="2.1" />
 *       &lt;attribute name="LocationSystem" type="{http://www.naptan.org.uk/}LocationSystemEnumeration" default="Grid" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stopPoints",
    "stopAreas"
})
@XmlRootElement(name = "NaPTAN")
public class NaPTAN {

    @XmlElement(name = "StopPoints")
    protected StopPointsStructure stopPoints;
    @XmlElement(name = "StopAreas")
    protected StopAreasStructure stopAreas;
    @XmlAttribute(name = "SchemaVersion", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String schemaVersion;
    @XmlAttribute(name = "LocationSystem")
    protected LocationSystemEnumeration locationSystem;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "CreationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlAttribute(name = "ModificationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modificationDateTime;
    @XmlAttribute(name = "Modification", required = true)
    protected ModificationEnumeration modification;
    @XmlAttribute(name = "RevisionNumber", required = true)
    protected BigInteger revisionNumber;
    @XmlAttribute(name = "FileName", required = true)
    protected String fileName;

    /**
     * Gets the value of the stopPoints property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointsStructure }
     *     
     */
    public StopPointsStructure getStopPoints() {
        return stopPoints;
    }

    /**
     * Sets the value of the stopPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointsStructure }
     *     
     */
    public void setStopPoints(StopPointsStructure value) {
        this.stopPoints = value;
    }

    /**
     * Gets the value of the stopAreas property.
     * 
     * @return
     *     possible object is
     *     {@link StopAreasStructure }
     *     
     */
    public StopAreasStructure getStopAreas() {
        return stopAreas;
    }

    /**
     * Sets the value of the stopAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAreasStructure }
     *     
     */
    public void setStopAreas(StopAreasStructure value) {
        this.stopAreas = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        if (schemaVersion == null) {
            return "2.1";
        } else {
            return schemaVersion;
        }
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

    /**
     * Gets the value of the locationSystem property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSystemEnumeration }
     *     
     */
    public LocationSystemEnumeration getLocationSystem() {
        if (locationSystem == null) {
            return LocationSystemEnumeration.GRID;
        } else {
            return locationSystem;
        }
    }

    /**
     * Sets the value of the locationSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSystemEnumeration }
     *     
     */
    public void setLocationSystem(LocationSystemEnumeration value) {
        this.locationSystem = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the modificationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationDateTime() {
        return modificationDateTime;
    }

    /**
     * Sets the value of the modificationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationDateTime(XMLGregorianCalendar value) {
        this.modificationDateTime = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationEnumeration }
     *     
     */
    public ModificationEnumeration getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationEnumeration }
     *     
     */
    public void setModification(ModificationEnumeration value) {
        this.modification = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRevisionNumber(BigInteger value) {
        this.revisionNumber = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

}
