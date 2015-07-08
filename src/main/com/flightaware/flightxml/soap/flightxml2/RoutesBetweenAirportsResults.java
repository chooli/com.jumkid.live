
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutesBetweenAirportsResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutesBetweenAirportsResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoutesBetweenAirportsResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfRoutesBetweenAirportsStruct"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutesBetweenAirportsResults", propOrder = {
    "routesBetweenAirportsResult"
})
public class RoutesBetweenAirportsResults {

    @XmlElement(name = "RoutesBetweenAirportsResult", required = true)
    protected ArrayOfRoutesBetweenAirportsStruct routesBetweenAirportsResult;

    /**
     * Gets the value of the routesBetweenAirportsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoutesBetweenAirportsStruct }
     *     
     */
    public ArrayOfRoutesBetweenAirportsStruct getRoutesBetweenAirportsResult() {
        return routesBetweenAirportsResult;
    }

    /**
     * Sets the value of the routesBetweenAirportsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoutesBetweenAirportsStruct }
     *     
     */
    public void setRoutesBetweenAirportsResult(ArrayOfRoutesBetweenAirportsStruct value) {
        this.routesBetweenAirportsResult = value;
    }

}
