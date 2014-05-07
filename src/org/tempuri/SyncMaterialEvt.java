package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SyncMaterialEvt complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SyncMaterialEvt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="song" type="{http://tempuri.org/}Song" minOccurs="0"/>
 *         &lt;element name="album" type="{http://tempuri.org/}Album" minOccurs="0"/>
 *         &lt;element name="artist" type="{http://tempuri.org/}Artist" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncMaterialEvt", propOrder = { "pid", "seq", "key",
		"transactionID", "action", "objectType", "song", "album", "artist" })
public class SyncMaterialEvt {

	@XmlElement(name = "PID")
	protected String pid;
	@XmlElement(name = "SEQ")
	protected String seq;
	protected String key;
	protected String transactionID;
	protected String action;
	protected String objectType;
	protected Song song;
	protected Album album;
	protected Artist artist;

	/**
	 * Gets the value of the pid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPID() {
		return pid;
	}

	/**
	 * Sets the value of the pid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPID(String value) {
		this.pid = value;
	}

	/**
	 * Gets the value of the seq property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSEQ() {
		return seq;
	}

	/**
	 * Sets the value of the seq property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSEQ(String value) {
		this.seq = value;
	}

	/**
	 * Gets the value of the key property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Sets the value of the key property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setKey(String value) {
		this.key = value;
	}

	/**
	 * Gets the value of the transactionID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransactionID() {
		return transactionID;
	}

	/**
	 * Sets the value of the transactionID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransactionID(String value) {
		this.transactionID = value;
	}

	/**
	 * Gets the value of the action property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAction() {
		return action;
	}

	/**
	 * Sets the value of the action property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAction(String value) {
		this.action = value;
	}

	/**
	 * Gets the value of the objectType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getObjectType() {
		return objectType;
	}

	/**
	 * Sets the value of the objectType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setObjectType(String value) {
		this.objectType = value;
	}

	/**
	 * Gets the value of the song property.
	 * 
	 * @return possible object is {@link Song }
	 * 
	 */
	public Song getSong() {
		return song;
	}

	/**
	 * Sets the value of the song property.
	 * 
	 * @param value
	 *            allowed object is {@link Song }
	 * 
	 */
	public void setSong(Song value) {
		this.song = value;
	}

	/**
	 * Gets the value of the album property.
	 * 
	 * @return possible object is {@link Album }
	 * 
	 */
	public Album getAlbum() {
		return album;
	}

	/**
	 * Sets the value of the album property.
	 * 
	 * @param value
	 *            allowed object is {@link Album }
	 * 
	 */
	public void setAlbum(Album value) {
		this.album = value;
	}

	/**
	 * Gets the value of the artist property.
	 * 
	 * @return possible object is {@link Artist }
	 * 
	 */
	public Artist getArtist() {
		return artist;
	}

	/**
	 * Sets the value of the artist property.
	 * 
	 * @param value
	 *            allowed object is {@link Artist }
	 * 
	 */
	public void setArtist(Artist value) {
		this.artist = value;
	}

}
