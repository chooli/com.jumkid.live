
package com.flightaware.flightxml.soap.flightxml2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightInfoStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="next_offset" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="flights" type="{http://flightxml.flightaware.com/soap/FlightXML2}FlightStruct" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInfoStruct", propOrder = {
    "nextOffset",
    "flights"
})
public class FlightInfoStruct {

    @XmlElement(name = "next_offset")
    protected int nextOffset;
    @XmlElement(required = true)
    protected List<FlightStruct> flights;

    /**
     * Gets the value of the nextOffset property.
     * 
     */
    public int getNextOffset() {
        return nextOffset;
    }

    /**
     * Sets the value of the nextOffset property.
     * 
     */
    public void setNextOffset(int value) {
        this.nextOffset = value;
    }

    /**
     * Gets the value of the flights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightStruct }
     * 
     * 
     */
    public List<FlightStruct> getFlights() {
        if (flights == null) {
            flights = new ArrayList<FlightStruct>();
        }
        return this.flights;
    }

}
