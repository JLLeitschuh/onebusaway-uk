//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.09 at 02:09:56 PM CEST 
//


package uk.org.naptan;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterchangeActivityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterchangeActivityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="transferOnly"/>
 *     &lt;enumeration value="change"/>
 *     &lt;enumeration value="through"/>
 *     &lt;enumeration value="split"/>
 *     &lt;enumeration value="join"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterchangeActivityEnumeration")
@XmlEnum
public enum InterchangeActivityEnumeration {


    /**
     * Passengers may only transfer to another service at interchange. The may not start or end their journey.
     * 
     */
    @XmlEnumValue("transferOnly")
    TRANSFER_ONLY("transferOnly"),

    /**
     * Passengers may transfer to another service at interchange. The may also start or end their journey.
     * 
     */
    @XmlEnumValue("change")
    CHANGE("change"),

    /**
     * Passengers will  transfer to another service by remaining on vehicle. They may also start or end their journey.
     * 
     */
    @XmlEnumValue("through")
    THROUGH("through"),

    /**
     * Service divides into different journeys at interchange. Passengers must choose appropriate coach. They may also start or end their journey.
     * 
     */
    @XmlEnumValue("split")
    SPLIT("split"),

    /**
     * Service merges two different journeys at interchange. Passengers may also start or end their journey.
     * 
     */
    @XmlEnumValue("join")
    JOIN("join");
    private final String value;

    InterchangeActivityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterchangeActivityEnumeration fromValue(String v) {
        for (InterchangeActivityEnumeration c: InterchangeActivityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
