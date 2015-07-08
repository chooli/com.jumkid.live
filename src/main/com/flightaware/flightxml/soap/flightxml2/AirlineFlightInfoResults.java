
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirlineFlightInfoResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineFlightInfoResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineFlightInfoResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}AirlineFlightInfoStruct"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineFlightInfoResults", propOrder = {
    "airlineFlightInfoResult"
})
public class AirlineFlightInfoResults {

    @XmlElement(name = "AirlineFlightInfoResult", required = true)
    protected AirlineFlightInfoStruct airlineFlightInfoResult;

    /**
     * Gets the value of the airlineFlightInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineFlightInfoStruct }
     *     
     */
    public AirlineFlightInfoStruct getAirlineFlightInfoResult() {
        return airlineFlightInfoResult;
    }

    /**
     * Sets the value of the airlineFlightInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineFlightInfoStruct }
     *     
     */
    public void setAirlineFlightInfoResult(AirlineFlightInfoStruct value) {
        this.airlineFlightInfoResult = value;
    }

}
