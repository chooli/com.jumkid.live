
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduledFlightStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduledFlightStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aircrafttype" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="filed_departuretime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="estimatedarrivaltime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="originName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="originCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="destinationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="destinationCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledFlightStruct", propOrder = {
    "ident",
    "aircrafttype",
    "filedDeparturetime",
    "estimatedarrivaltime",
    "origin",
    "destination",
    "originName",
    "originCity",
    "destinationName",
    "destinationCity"
})
public class ScheduledFlightStruct {

    @XmlElement(required = true)
    protected String ident;
    @XmlElement(required = true)
    protected String aircrafttype;
    @XmlElement(name = "filed_departuretime")
    protected int filedDeparturetime;
    protected int estimatedarrivaltime;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String originName;
    @XmlElement(required = true)
    protected String originCity;
    @XmlElement(required = true)
    protected String destinationName;
    @XmlElement(required = true)
    protected String destinationCity;

    /**
     * Gets the value of the ident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Sets the value of the ident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Gets the value of the aircrafttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircrafttype() {
        return aircrafttype;
    }

    /**
     * Sets the value of the aircrafttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircrafttype(String value) {
        this.aircrafttype = value;
    }

    /**
     * Gets the value of the filedDeparturetime property.
     * 
     */
    public int getFiledDeparturetime() {
        return filedDeparturetime;
    }

    /**
     * Sets the value of the filedDeparturetime property.
     * 
     */
    public void setFiledDeparturetime(int value) {
        this.filedDeparturetime = value;
    }

    /**
     * Gets the value of the estimatedarrivaltime property.
     * 
     */
    public int getEstimatedarrivaltime() {
        return estimatedarrivaltime;
    }

    /**
     * Sets the value of the estimatedarrivaltime property.
     * 
     */
    public void setEstimatedarrivaltime(int value) {
        this.estimatedarrivaltime = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the originName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginName() {
        return originName;
    }

    /**
     * Sets the value of the originName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginName(String value) {
        this.originName = value;
    }

    /**
     * Gets the value of the originCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCity() {
        return originCity;
    }

    /**
     * Sets the value of the originCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCity(String value) {
        this.originCity = value;
    }

    /**
     * Gets the value of the destinationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * Sets the value of the destinationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationName(String value) {
        this.destinationName = value;
    }

    /**
     * Gets the value of the destinationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * Sets the value of the destinationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCity(String value) {
        this.destinationCity = value;
    }

}
