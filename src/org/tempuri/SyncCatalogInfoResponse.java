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
 *         &lt;element name="syncCatalogInfoResult" type="{http://tempuri.org/}Response" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "syncCatalogInfoResult" })
@XmlRootElement(name = "syncCatalogInfoResponse")
public class SyncCatalogInfoResponse {

	protected Response syncCatalogInfoResult;

	/**
	 * Gets the value of the syncCatalogInfoResult property.
	 * 
	 * @return possible object is {@link Response }
	 * 
	 */
	public Response getSyncCatalogInfoResult() {
		return syncCatalogInfoResult;
	}

	/**
	 * Sets the value of the syncCatalogInfoResult property.
	 * 
	 * @param value
	 *            allowed object is {@link Response }
	 * 
	 */
	public void setSyncCatalogInfoResult(Response value) {
		this.syncCatalogInfoResult = value;
	}

}
