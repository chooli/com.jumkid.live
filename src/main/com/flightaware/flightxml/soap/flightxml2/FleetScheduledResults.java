
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FleetScheduledResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FleetScheduledResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FleetScheduledResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ScheduledStruct"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FleetScheduledResults", propOrder = {
    "fleetScheduledResult"
})
public class FleetScheduledResults {

    @XmlElement(name = "FleetScheduledResult", required = true)
    protected ScheduledStruct fleetScheduledResult;

    /**
     * Gets the value of the fleetScheduledResult property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStruct }
     *     
     */
    public ScheduledStruct getFleetScheduledResult() {
        return fleetScheduledResult;
    }

    /**
     * Sets the value of the fleetScheduledResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStruct }
     *     
     */
    public void setFleetScheduledResult(ScheduledStruct value) {
        this.fleetScheduledResult = value;
    }

}
