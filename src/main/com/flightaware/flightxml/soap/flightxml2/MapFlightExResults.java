
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MapFlightExResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapFlightExResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MapFlightExResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapFlightExResults", propOrder = {
    "mapFlightExResult"
})
public class MapFlightExResults {

    @XmlElement(name = "MapFlightExResult", required = true)
    protected String mapFlightExResult;

    /**
     * Gets the value of the mapFlightExResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapFlightExResult() {
        return mapFlightExResult;
    }

    /**
     * Sets the value of the mapFlightExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapFlightExResult(String value) {
        this.mapFlightExResult = value;
    }

}
