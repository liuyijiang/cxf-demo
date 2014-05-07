
package com.sitech.nbc.product.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.sitech.nbc.product.model.xsd.SyncCrbtDeployResultEvt;


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
 *         &lt;element name="event" type="{http://model.product.nbc.sitech.com/xsd}SyncCrbtDeployResultEvt" minOccurs="0"/>
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
@XmlRootElement(name = "syncCrbtDeployResult")
public class SyncCrbtDeployResult {

    @XmlElementRef(name = "event", namespace = "http://server.product.nbc.sitech.com", type = JAXBElement.class)
    protected JAXBElement<SyncCrbtDeployResultEvt> event;

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SyncCrbtDeployResultEvt }{@code >}
     *     
     */
    public JAXBElement<SyncCrbtDeployResultEvt> getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SyncCrbtDeployResultEvt }{@code >}
     *     
     */
    public void setEvent(JAXBElement<SyncCrbtDeployResultEvt> value) {
        this.event = ((JAXBElement<SyncCrbtDeployResultEvt> ) value);
    }

}
