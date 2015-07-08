
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutesBetweenAirportsExResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutesBetweenAirportsExResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoutesBetweenAirportsExResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfRoutesBetweenAirportsExStruct"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutesBetweenAirportsExResults", propOrder = {
    "routesBetweenAirportsExResult"
})
public class RoutesBetweenAirportsExResults {

    @XmlElement(name = "RoutesBetweenAirportsExResult", required = true)
    protected ArrayOfRoutesBetweenAirportsExStruct routesBetweenAirportsExResult;

    /**
     * Gets the value of the routesBetweenAirportsExResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoutesBetweenAirportsExStruct }
     *     
     */
    public ArrayOfRoutesBetweenAirportsExStruct getRoutesBetweenAirportsExResult() {
        return routesBetweenAirportsExResult;
    }

    /**
     * Sets the value of the routesBetweenAirportsExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoutesBetweenAirportsExStruct }
     *     
     */
    public void setRoutesBetweenAirportsExResult(ArrayOfRoutesBetweenAirportsExStruct value) {
        this.routesBetweenAirportsExResult = value;
    }

}
