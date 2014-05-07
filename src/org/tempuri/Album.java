package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Album complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Album">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="albumID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="songIDs" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="singerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productionCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publishCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publishArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumPicS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumPicM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumPicL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="awards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumNamePinyin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumNameFirstLetter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumIntro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Album", propOrder = { "albumID", "albumName", "status",
		"songIDs", "singerID", "trackCount", "productionCompany",
		"publishCompany", "publishDate", "publishArea", "language",
		"albumLength", "albumPicS", "albumPicM", "albumPicL", "salesVolume",
		"awards", "albumNamePinyin", "albumNameFirstLetter", "albumIntro" })
public class Album {

	protected String albumID;
	protected String albumName;
	protected String status;
	protected ArrayOfString songIDs;
	protected String singerID;
	protected String trackCount;
	protected String productionCompany;
	protected String publishCompany;
	protected String publishDate;
	protected String publishArea;
	protected String language;
	protected String albumLength;
	protected String albumPicS;
	protected String albumPicM;
	protected String albumPicL;
	protected String salesVolume;
	protected String awards;
	protected String albumNamePinyin;
	protected String albumNameFirstLetter;
	protected String albumIntro;

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
	 * Gets the value of the songIDs property.
	 * 
	 * @return possible object is {@link ArrayOfString }
	 * 
	 */
	public ArrayOfString getSongIDs() {
		return songIDs;
	}

	/**
	 * Sets the value of the songIDs property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfString }
	 * 
	 */
	public void setSongIDs(ArrayOfString value) {
		this.songIDs = value;
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
	 * Gets the value of the trackCount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTrackCount() {
		return trackCount;
	}

	/**
	 * Sets the value of the trackCount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTrackCount(String value) {
		this.trackCount = value;
	}

	/**
	 * Gets the value of the productionCompany property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductionCompany() {
		return productionCompany;
	}

	/**
	 * Sets the value of the productionCompany property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductionCompany(String value) {
		this.productionCompany = value;
	}

	/**
	 * Gets the value of the publishCompany property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPublishCompany() {
		return publishCompany;
	}

	/**
	 * Sets the value of the publishCompany property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPublishCompany(String value) {
		this.publishCompany = value;
	}

	/**
	 * Gets the value of the publishDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPublishDate() {
		return publishDate;
	}

	/**
	 * Sets the value of the publishDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPublishDate(String value) {
		this.publishDate = value;
	}

	/**
	 * Gets the value of the publishArea property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPublishArea() {
		return publishArea;
	}

	/**
	 * Sets the value of the publishArea property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPublishArea(String value) {
		this.publishArea = value;
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
	 * Gets the value of the albumLength property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlbumLength() {
		return albumLength;
	}

	/**
	 * Sets the value of the albumLength property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlbumLength(String value) {
		this.albumLength = value;
	}

	/**
	 * Gets the value of the albumPicS property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlbumPicS() {
		return albumPicS;
	}

	/**
	 * Sets the value of the albumPicS property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlbumPicS(String value) {
		this.albumPicS = value;
	}

	/**
	 * Gets the value of the albumPicM property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlbumPicM() {
		return albumPicM;
	}

	/**
	 * Sets the value of the albumPicM property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlbumPicM(String value) {
		this.albumPicM = value;
	}

	/**
	 * Gets the value of the albumPicL property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlbumPicL() {
		return albumPicL;
	}

	/**
	 * Sets the value of the albumPicL property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlbumPicL(String value) {
		this.albumPicL = value;
	}

	/**
	 * Gets the value of the salesVolume property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSalesVolume() {
		return salesVolume;
	}

	/**
	 * Sets the value of the salesVolume property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSalesVolume(String value) {
		this.salesVolume = value;
	}

	/**
	 * Gets the value of the awards property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAwards() {
		return awards;
	}

	/**
	 * Sets the value of the awards property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAwards(String value) {
		this.awards = value;
	}

	/**
	 * Gets the value of the albumNamePinyin property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlbumNamePinyin() {
		return albumNamePinyin;
	}

	/**
	 * Sets the value of the albumNamePinyin property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlbumNamePinyin(String value) {
		this.albumNamePinyin = value;
	}

	/**
	 * Gets the value of the albumNameFirstLetter property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlbumNameFirstLetter() {
		return albumNameFirstLetter;
	}

	/**
	 * Sets the value of the albumNameFirstLetter property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlbumNameFirstLetter(String value) {
		this.albumNameFirstLetter = value;
	}

	/**
	 * Gets the value of the albumIntro property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlbumIntro() {
		return albumIntro;
	}

	/**
	 * Sets the value of the albumIntro property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlbumIntro(String value) {
		this.albumIntro = value;
	}

}
