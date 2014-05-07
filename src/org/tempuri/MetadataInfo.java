package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for metadataInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="metadataInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmpUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isGet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadataInfo", propOrder = { "resourceID", "size", "cmpUrl",
		"mimeType", "terminalList", "isGet", "fileType", "chord" })
public class MetadataInfo {

	protected String resourceID;
	protected String size;
	protected String cmpUrl;
	protected String mimeType;
	protected String terminalList;
	protected String isGet;
	protected String fileType;
	protected String chord;

	/**
	 * Gets the value of the resourceID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResourceID() {
		return resourceID;
	}

	/**
	 * Sets the value of the resourceID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResourceID(String value) {
		this.resourceID = value;
	}

	/**
	 * Gets the value of the size property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSize() {
		return size;
	}

	/**
	 * Sets the value of the size property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSize(String value) {
		this.size = value;
	}

	/**
	 * Gets the value of the cmpUrl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCmpUrl() {
		return cmpUrl;
	}

	/**
	 * Sets the value of the cmpUrl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCmpUrl(String value) {
		this.cmpUrl = value;
	}

	/**
	 * Gets the value of the mimeType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * Sets the value of the mimeType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMimeType(String value) {
		this.mimeType = value;
	}

	/**
	 * Gets the value of the terminalList property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTerminalList() {
		return terminalList;
	}

	/**
	 * Sets the value of the terminalList property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTerminalList(String value) {
		this.terminalList = value;
	}

	/**
	 * Gets the value of the isGet property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIsGet() {
		return isGet;
	}

	/**
	 * Sets the value of the isGet property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIsGet(String value) {
		this.isGet = value;
	}

	/**
	 * Gets the value of the fileType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * Sets the value of the fileType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFileType(String value) {
		this.fileType = value;
	}

	/**
	 * Gets the value of the chord property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getChord() {
		return chord;
	}

	/**
	 * Sets the value of the chord property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setChord(String value) {
		this.chord = value;
	}

}
