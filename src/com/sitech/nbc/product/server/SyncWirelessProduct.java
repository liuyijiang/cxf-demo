
package com.sitech.nbc.product.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.sitech.nbc.product.model.xsd.SyncWirelessProductEvt;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="event" type="{http://model.product.nbc.sitech.com/xsd}SyncWirelessProductEvt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "event"
})
@XmlRootElement(name = "syncWirelessProduct")
public class SyncWirelessProduct {

    @XmlElementRef(name = "event", namespace = "http://server.product.nbc.sitech.com", type = JAXBElement.class)
    protected JAXBElement<SyncWirelessProductEvt> event;

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SyncWirelessProductEvt }{@code >}
     *     
     */
    public JAXBElement<SyncWirelessProductEvt> getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SyncWirelessProductEvt }{@code >}
     *     
     */
    public void setEvent(JAXBElement<SyncWirelessProductEvt> value) {
        this.event = ((JAXBElement<SyncWirelessProductEvt> ) value);
    }

}
