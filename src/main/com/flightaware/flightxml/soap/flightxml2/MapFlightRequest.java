
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MapFlightRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapFlightRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mapHeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mapWidth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapFlightRequest", propOrder = {
    "ident",
    "mapHeight",
    "mapWidth"
})
public class MapFlightRequest {

    @XmlElement(required = true)
    protected String ident;
    protected int mapHeight;
    protected int mapWidth;

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
     * Gets the value of the mapHeight property.
     * 
     */
    public int getMapHeight() {
        return mapHeight;
    }

    /**
     * Sets the value of the mapHeight property.
     * 
     */
    public void setMapHeight(int value) {
        this.mapHeight = value;
    }

    /**
     * Gets the value of the mapWidth property.
     * 
     */
    public int getMapWidth() {
        return mapWidth;
    }

    /**
     * Sets the value of the mapWidth property.
     * 
     */
    public void setMapWidth(int value) {
        this.mapWidth = value;
    }

}
