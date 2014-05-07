package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SyncCatalogInfoEvt complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SyncCatalogInfoEvt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="copyrightID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="songID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="songName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lyricsWriterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lyricsWriterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="composerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="composerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumInfo" type="{http://tempuri.org/}ArrayOfAlbumInfo" minOccurs="0"/>
 *         &lt;element name="lyricUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncCatalogInfoEvt", propOrder = { "pid", "seq", "key",
		"transactionID", "action", "copyrightID", "songID", "songName",
		"singerID", "singerName", "lyricsWriterID", "lyricsWriterName",
		"composerID", "composerName", "albumInfo", "lyricUrl" })
public class SyncCatalogInfoEvt {

	@XmlElement(name = "PID")
	protected String pid;
	@XmlElement(name = "SEQ")
	protected String seq;
	protected String key;
	protected String transactionID;
	protected String action;
	protected String copyrightID;
	protected String songID;
	protected String songName;
	protected String singerID;
	protected String singerName;
	protected String lyricsWriterID;
	protected String lyricsWriterName;
	protected String composerID;
	protected String composerName;
	protected ArrayOfAlbumInfo albumInfo;
	protected String lyricUrl;

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
	 * Gets the value of the copyrightID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCopyrightID() {
		return copyrightID;
	}

	/**
	 * Sets the value of the copyrightID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCopyrightID(String value) {
		this.copyrightID = value;
	}

	/**
	 * Gets the value of the songID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSongID() {
		return songID;
	}

	/**
	 * Sets the value of the songID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSongID(String value) {
		this.songID = value;
	}

	/**
	 * Gets the value of the songName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSongName() {
		return songName;
	}

	/**
	 * Sets the value of the songName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSongName(String value) {
		this.songName = value;
	}

	/**
	 * Gets the value of the singerID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSingerID() {
		return singerID;
	}

	/**
	 * Sets the value of the singerID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSingerID(String value) {
		this.singerID = value;
	}

	/**
	 * Gets the value of the singerName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSingerName() {
		return singerName;
	}

	/**
	 * Sets the value of the singerName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSingerName(String value) {
		this.singerName = value;
	}

	/**
	 * Gets the value of the lyricsWriterID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLyricsWriterID() {
		return lyricsWriterID;
	}

	/**
	 * Sets the value of the lyricsWriterID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLyricsWriterID(String value) {
		this.lyricsWriterID = value;
	}

	/**
	 * Gets the value of the lyricsWriterName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLyricsWriterName() {
		return lyricsWriterName;
	}

	/**
	 * Sets the value of the lyricsWriterName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLyricsWriterName(String value) {
		this.lyricsWriterName = value;
	}

	/**
	 * Gets the value of the composerID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getComposerID() {
		return composerID;
	}

	/**
	 * Sets the value of the composerID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setComposerID(String value) {
		this.composerID = value;
	}

	/**
	 * Gets the value of the composerName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getComposerName() {
		return composerName;
	}

	/**
	 * Sets the value of the composerName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setComposerName(String value) {
		this.composerName = value;
	}

	/**
	 * Gets the value of the albumInfo property.
	 * 
	 * @return possible object is {@link ArrayOfAlbumInfo }
	 * 
	 */
	public ArrayOfAlbumInfo getAlbumInfo() {
		return albumInfo;
	}

	/**
	 * Sets the value of the albumInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfAlbumInfo }
	 * 
	 */
	public void setAlbumInfo(ArrayOfAlbumInfo value) {
		this.albumInfo = value;
	}

	/**
	 * Gets the value of the lyricUrl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLyricUrl() {
		return lyricUrl;
	}

	/**
	 * Sets the value of the lyricUrl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLyricUrl(String value) {
		this.lyricUrl = value;
	}

}
