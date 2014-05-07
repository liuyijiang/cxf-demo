package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Song complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Song">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="songID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="songName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="copyrightID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lyricsWriterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lyricsWriterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="composerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="composerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumInfo" type="{http://tempuri.org/}AlbumInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prformerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prformerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnductorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnductorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lyricUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="songNamePinyin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="songNameFirstLetter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publishYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMSURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Song", propOrder = { "songID", "songName", "status",
		"copyrightID", "singerID", "singerName", "lyricsWriterID",
		"lyricsWriterName", "composerID", "composerName", "albumInfo",
		"prformerID", "prformerName", "cnductorID", "cnductorName", "trackNo",
		"language", "area", "lyricUrl", "songNamePinyin",
		"songNameFirstLetter", "speed", "length", "publishYear", "intro",
		"cmsurl" })
public class Song {

	protected String songID;
	protected String songName;
	protected String status;
	protected String copyrightID;
	protected String singerID;
	protected String singerName;
	protected String lyricsWriterID;
	protected String lyricsWriterName;
	protected String composerID;
	protected String composerName;
	@XmlElement(nillable = true)
	protected List<AlbumInfo> albumInfo;
	protected String prformerID;
	protected String prformerName;
	protected String cnductorID;
	protected String cnductorName;
	protected String trackNo;
	protected String language;
	protected String area;
	protected String lyricUrl;
	protected String songNamePinyin;
	protected String songNameFirstLetter;
	protected String speed;
	protected String length;
	protected String publishYear;
	protected String intro;
	@XmlElement(name = "CMSURL")
	protected String cmsurl;

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
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatus(String value) {
		this.status = value;
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
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the albumInfo property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAlbumInfo().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AlbumInfo }
	 * 
	 * 
	 */
	public List<AlbumInfo> getAlbumInfo() {
		if (albumInfo == null) {
			albumInfo = new ArrayList<AlbumInfo>();
		}
		return this.albumInfo;
	}

	/**
	 * Gets the value of the prformerID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrformerID() {
		return prformerID;
	}

	/**
	 * Sets the value of the prformerID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrformerID(String value) {
		this.prformerID = value;
	}

	/**
	 * Gets the value of the prformerName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrformerName() {
		return prformerName;
	}

	/**
	 * Sets the value of the prformerName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrformerName(String value) {
		this.prformerName = value;
	}

	/**
	 * Gets the value of the cnductorID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCnductorID() {
		return cnductorID;
	}

	/**
	 * Sets the value of the cnductorID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCnductorID(String value) {
		this.cnductorID = value;
	}

	/**
	 * Gets the value of the cnductorName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCnductorName() {
		return cnductorName;
	}

	/**
	 * Sets the value of the cnductorName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCnductorName(String value) {
		this.cnductorName = value;
	}

	/**
	 * Gets the value of the trackNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTrackNo() {
		return trackNo;
	}

	/**
	 * Sets the value of the trackNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTrackNo(String value) {
		this.trackNo = value;
	}

	/**
	 * Gets the value of the language property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the value of the language property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLanguage(String value) {
		this.language = value;
	}

	/**
	 * Gets the value of the area property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArea() {
		return area;
	}

	/**
	 * Sets the value of the area property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArea(String value) {
		this.area = value;
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

	/**
	 * Gets the value of the songNamePinyin property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSongNamePinyin() {
		return songNamePinyin;
	}

	/**
	 * Sets the value of the songNamePinyin property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSongNamePinyin(String value) {
		this.songNamePinyin = value;
	}

	/**
	 * Gets the value of the songNameFirstLetter property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSongNameFirstLetter() {
		return songNameFirstLetter;
	}

	/**
	 * Sets the value of the songNameFirstLetter property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSongNameFirstLetter(String value) {
		this.songNameFirstLetter = value;
	}

	/**
	 * Gets the value of the speed property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSpeed() {
		return speed;
	}

	/**
	 * Sets the value of the speed property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSpeed(String value) {
		this.speed = value;
	}

	/**
	 * Gets the value of the length property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLength() {
		return length;
	}

	/**
	 * Sets the value of the length property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLength(String value) {
		this.length = value;
	}

	/**
	 * Gets the value of the publishYear property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPublishYear() {
		return publishYear;
	}

	/**
	 * Sets the value of the publishYear property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPublishYear(String value) {
		this.publishYear = value;
	}

	/**
	 * Gets the value of the intro property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIntro() {
		return intro;
	}

	/**
	 * Sets the value of the intro property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIntro(String value) {
		this.intro = value;
	}

	/**
	 * Gets the value of the cmsurl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCMSURL() {
		return cmsurl;
	}

	/**
	 * Sets the value of the cmsurl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCMSURL(String value) {
		this.cmsurl = value;
	}

}
