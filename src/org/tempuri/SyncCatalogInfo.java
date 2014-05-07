package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="event" type="{http://tempuri.org/}SyncCatalogInfoEvt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "event" })
@XmlRootElement(name = "syncCatalogInfo")
public class SyncCatalogInfo {

	protected SyncCatalogInfoEvt event;

	/**
	 * Gets the value of the event property.
	 * 
	 * @return possible object is {@link SyncCatalogInfoEvt }
	 * 
	 */
	public SyncCatalogInfoEvt getEvent() {
		return event;
	}

	/**
	 * Sets the value of the event property.
	 * 
	 * @param value
	 *            allowed object is {@link SyncCatalogInfoEvt }
	 * 
	 */
	public void setEvent(SyncCatalogInfoEvt value) {
		this.event = value;
	}

}
