
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLastTrackResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLastTrackResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetLastTrackResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfTrackStruct"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLastTrackResults", propOrder = {
    "getLastTrackResult"
})
public class GetLastTrackResults {

    @XmlElement(name = "GetLastTrackResult", required = true)
    protected ArrayOfTrackStruct getLastTrackResult;

    /**
     * Gets the value of the getLastTrackResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrackStruct }
     *     
     */
    public ArrayOfTrackStruct getGetLastTrackResult() {
        return getLastTrackResult;
    }

    /**
     * Sets the value of the getLastTrackResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrackStruct }
     *     
     */
    public void setGetLastTrackResult(ArrayOfTrackStruct value) {
        this.getLastTrackResult = value;
    }

}
