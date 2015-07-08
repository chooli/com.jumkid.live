
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirportInfoResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirportInfoResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirportInfoResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}AirportInfoStruct"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportInfoResults", propOrder = {
    "airportInfoResult"
})
public class AirportInfoResults {

    @XmlElement(name = "AirportInfoResult", required = true)
    protected AirportInfoStruct airportInfoResult;

    /**
     * Gets the value of the airportInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link AirportInfoStruct }
     *     
     */
    public AirportInfoStruct getAirportInfoResult() {
        return airportInfoResult;
    }

    /**
     * Sets the value of the airportInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportInfoStruct }
     *     
     */
    public void setAirportInfoResult(AirportInfoStruct value) {
        this.airportInfoResult = value;
    }

}
