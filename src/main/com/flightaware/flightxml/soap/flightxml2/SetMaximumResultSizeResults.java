
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetMaximumResultSizeResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetMaximumResultSizeResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SetMaximumResultSizeResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetMaximumResultSizeResults", propOrder = {
    "setMaximumResultSizeResult"
})
public class SetMaximumResultSizeResults {

    @XmlElement(name = "SetMaximumResultSizeResult")
    protected int setMaximumResultSizeResult;

    /**
     * Gets the value of the setMaximumResultSizeResult property.
     * 
     */
    public int getSetMaximumResultSizeResult() {
        return setMaximumResultSizeResult;
    }

    /**
     * Sets the value of the setMaximumResultSizeResult property.
     * 
     */
    public void setSetMaximumResultSizeResult(int value) {
        this.setMaximumResultSizeResult = value;
    }

}
