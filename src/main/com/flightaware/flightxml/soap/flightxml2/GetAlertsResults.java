
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAlertsResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAlertsResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetAlertsResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}FlightAlertListing"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAlertsResults", propOrder = {
    "getAlertsResult"
})
public class GetAlertsResults {

    @XmlElement(name = "GetAlertsResult", required = true)
    protected FlightAlertListing getAlertsResult;

    /**
     * Gets the value of the getAlertsResult property.
     * 
     * @return
     *     possible object is
     *     {@link FlightAlertListing }
     *     
     */
    public FlightAlertListing getGetAlertsResult() {
        return getAlertsResult;
    }

    /**
     * Sets the value of the getAlertsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightAlertListing }
     *     
     */
    public void setGetAlertsResult(FlightAlertListing value) {
        this.getAlertsResult = value;
    }

}
