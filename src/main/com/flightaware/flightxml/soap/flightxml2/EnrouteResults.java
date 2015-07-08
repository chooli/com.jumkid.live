
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnrouteResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnrouteResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnrouteResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}EnrouteStruct"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrouteResults", propOrder = {
    "enrouteResult"
})
public class EnrouteResults {

    @XmlElement(name = "EnrouteResult", required = true)
    protected EnrouteStruct enrouteResult;

    /**
     * Gets the value of the enrouteResult property.
     * 
     * @return
     *     possible object is
     *     {@link EnrouteStruct }
     *     
     */
    public EnrouteStruct getEnrouteResult() {
        return enrouteResult;
    }

    /**
     * Sets the value of the enrouteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrouteStruct }
     *     
     */
    public void setEnrouteResult(EnrouteStruct value) {
        this.enrouteResult = value;
    }

}
