
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountAllEnrouteAirlineOperationsResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountAllEnrouteAirlineOperationsResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountAllEnrouteAirlineOperationsResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfCountAirlineOperationsStruct"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountAllEnrouteAirlineOperationsResults", propOrder = {
    "countAllEnrouteAirlineOperationsResult"
})
public class CountAllEnrouteAirlineOperationsResults {

    @XmlElement(name = "CountAllEnrouteAirlineOperationsResult", required = true)
    protected ArrayOfCountAirlineOperationsStruct countAllEnrouteAirlineOperationsResult;

    /**
     * Gets the value of the countAllEnrouteAirlineOperationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCountAirlineOperationsStruct }
     *     
     */
    public ArrayOfCountAirlineOperationsStruct getCountAllEnrouteAirlineOperationsResult() {
        return countAllEnrouteAirlineOperationsResult;
    }

    /**
     * Sets the value of the countAllEnrouteAirlineOperationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCountAirlineOperationsStruct }
     *     
     */
    public void setCountAllEnrouteAirlineOperationsResult(ArrayOfCountAirlineOperationsStruct value) {
        this.countAllEnrouteAirlineOperationsResult = value;
    }

}
