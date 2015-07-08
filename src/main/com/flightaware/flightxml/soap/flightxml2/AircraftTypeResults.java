
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AircraftTypeResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftTypeResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AircraftTypeResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}AircraftTypeStruct"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftTypeResults", propOrder = {
    "aircraftTypeResult"
})
public class AircraftTypeResults {

    @XmlElement(name = "AircraftTypeResult", required = true)
    protected AircraftTypeStruct aircraftTypeResult;

    /**
     * Gets the value of the aircraftTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftTypeStruct }
     *     
     */
    public AircraftTypeStruct getAircraftTypeResult() {
        return aircraftTypeResult;
    }

    /**
     * Sets the value of the aircraftTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftTypeStruct }
     *     
     */
    public void setAircraftTypeResult(AircraftTypeStruct value) {
        this.aircraftTypeResult = value;
    }

}
