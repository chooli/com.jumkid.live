
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecodeRouteResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecodeRouteResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DecodeRouteResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfFlightRouteStruct"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecodeRouteResults", propOrder = {
    "decodeRouteResult"
})
public class DecodeRouteResults {

    @XmlElement(name = "DecodeRouteResult", required = true)
    protected ArrayOfFlightRouteStruct decodeRouteResult;

    /**
     * Gets the value of the decodeRouteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFlightRouteStruct }
     *     
     */
    public ArrayOfFlightRouteStruct getDecodeRouteResult() {
        return decodeRouteResult;
    }

    /**
     * Sets the value of the decodeRouteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFlightRouteStruct }
     *     
     */
    public void setDecodeRouteResult(ArrayOfFlightRouteStruct value) {
        this.decodeRouteResult = value;
    }

}
