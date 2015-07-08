
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LatLongsToHeadingResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LatLongsToHeadingResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LatLongsToHeadingResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatLongsToHeadingResults", propOrder = {
    "latLongsToHeadingResult"
})
public class LatLongsToHeadingResults {

    @XmlElement(name = "LatLongsToHeadingResult")
    protected int latLongsToHeadingResult;

    /**
     * Gets the value of the latLongsToHeadingResult property.
     * 
     */
    public int getLatLongsToHeadingResult() {
        return latLongsToHeadingResult;
    }

    /**
     * Sets the value of the latLongsToHeadingResult property.
     * 
     */
    public void setLatLongsToHeadingResult(int value) {
        this.latLongsToHeadingResult = value;
    }

}
