package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AlbumInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AlbumInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="albumID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlbumInfo", propOrder = { "albumID", "albumName" })
public class AlbumInfo {

	protected String albumID;
	protected String albumName;

	/**
	 * Gets the value of the albumID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlbumID() {
		return albumID;
	}

	/**
	 * Sets the value of the albumID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlbumID(String value) {
		this.albumID = value;
	}

	/**
	 * Gets the value of the albumName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlbumName() {
		return albumName;
	}

	/**
	 * Sets the value of the albumName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlbumName(String value) {
		this.albumName = value;
	}

}
