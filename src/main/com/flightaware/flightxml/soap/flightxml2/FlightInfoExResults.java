
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightInfoExResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightInfoExResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightInfoExResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}FlightInfoExStruct"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInfoExResults", propOrder = {
    "flightInfoExResult"
})
public class FlightInfoExResults {

    @XmlElement(name = "FlightInfoExResult", required = true)
    protected FlightInfoExStruct flightInfoExResult;

    /**
     * Gets the value of the flightInfoExResult property.
     * 
     * @return
     *     possible object is
     *     {@link FlightInfoExStruct }
     *     
     */
    public FlightInfoExStruct getFlightInfoExResult() {
        return flightInfoExResult;
    }

    /**
     * Sets the value of the flightInfoExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInfoExStruct }
     *     
     */
    public void setFlightInfoExResult(FlightInfoExStruct value) {
        this.flightInfoExResult = value;
    }

}
