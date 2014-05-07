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
 *         &lt;element name="syncMaterialResult" type="{http://tempuri.org/}Response" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "syncMaterialResult" })
@XmlRootElement(name = "syncMaterialResponse")
public class SyncMaterialResponse {

	protected Response syncMaterialResult;

	/**
	 * Gets the value of the syncMaterialResult property.
	 * 
	 * @return possible object is {@link Response }
	 * 
	 */
	public Response getSyncMaterialResult() {
		return syncMaterialResult;
	}

	/**
	 * Sets the value of the syncMaterialResult property.
	 * 
	 * @param value
	 *            allowed object is {@link Response }
	 * 
	 */
	public void setSyncMaterialResult(Response value) {
		this.syncMaterialResult = value;
	}

}
