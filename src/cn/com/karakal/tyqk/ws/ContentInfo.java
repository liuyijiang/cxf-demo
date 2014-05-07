package cn.com.karakal.tyqk.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for contentInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="contentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumInfo" type="{http://ws.tyqk.karakal.com.cn}albumInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appendInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmsSingerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmsSingerNameLetter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corpID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISRC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="musicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="playFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="songID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="songName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toneNameLetter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toneValidDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contentInfo", propOrder = { "addTime", "albumInfo",
		"appendInfo", "approveTime", "auditFilePath", "cmsSingerName",
		"cmsSingerNameLetter", "corpID", "isrc", "musicID", "playFilePath",
		"price", "property", "singerID", "singerName", "songID", "songName",
		"spID", "spName", "status", "toneID", "toneName", "toneNameLetter",
		"toneValidDay", "type" })
public class ContentInfo {

	protected String addTime;
	@XmlElement(nillable = true)
	protected List<AlbumInfo> albumInfo;
	protected String appendInfo;
	protected String approveTime;
	protected String auditFilePath;
	protected String cmsSingerName;
	protected String cmsSingerNameLetter;
	protected String corpID;
	@XmlElement(name = "ISRC")
	protected String isrc;
	protected String musicID;
	protected String playFilePath;
	protected String price;
	protected String property;
	protected String singerID;
	protected String singerName;
	protected String songID;
	protected String songName;
	protected String spID;
	protected String spName;
	protected String status;
	protected String toneID;
	protected String toneName;
	protected String toneNameLetter;
	protected String toneValidDay;
	protected String type;

	/**
	 * Gets the value of the addTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddTime() {
		return addTime;
	}

	/**
	 * Sets the value of the addTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAddTime(String value) {
		this.addTime = value;
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
	 * Gets the value of the appendInfo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAppendInfo() {
		return appendInfo;
	}

	/**
	 * Sets the value of the appendInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAppendInfo(String value) {
		this.appendInfo = value;
	}

	/**
	 * Gets the value of the approveTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getApproveTime() {
		return approveTime;
	}

	/**
	 * Sets the value of the approveTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setApproveTime(String value) {
		this.approveTime = value;
	}

	/**
	 * Gets the value of the auditFilePath property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAuditFilePath() {
		return auditFilePath;
	}

	/**
	 * Sets the value of the auditFilePath property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAuditFilePath(String value) {
		this.auditFilePath = value;
	}

	/**
	 * Gets the value of the cmsSingerName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCmsSingerName() {
		return cmsSingerName;
	}

	/**
	 * Sets the value of the cmsSingerName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCmsSingerName(String value) {
		this.cmsSingerName = value;
	}

	/**
	 * Gets the value of the cmsSingerNameLetter property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCmsSingerNameLetter() {
		return cmsSingerNameLetter;
	}

	/**
	 * Sets the value of the cmsSingerNameLetter property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCmsSingerNameLetter(String value) {
		this.cmsSingerNameLetter = value;
	}

	/**
	 * Gets the value of the corpID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCorpID() {
		return corpID;
	}

	/**
	 * Sets the value of the corpID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCorpID(String value) {
		this.corpID = value;
	}

	/**
	 * Gets the value of the isrc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getISRC() {
		return isrc;
	}

	/**
	 * Sets the value of the isrc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setISRC(String value) {
		this.isrc = value;
	}

	/**
	 * Gets the value of the musicID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMusicID() {
		return musicID;
	}

	/**
	 * Sets the value of the musicID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMusicID(String value) {
		this.musicID = value;
	}

	/**
	 * Gets the value of the playFilePath property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPlayFilePath() {
		return playFilePath;
	}

	/**
	 * Sets the value of the playFilePath property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPlayFilePath(String value) {
		this.playFilePath = value;
	}

	/**
	 * Gets the value of the price property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * Sets the value of the price property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrice(String value) {
		this.price = value;
	}

	/**
	 * Gets the value of the property property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * Sets the value of the property property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProperty(String value) {
		this.property = value;
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
	 * Gets the value of the spID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSpID() {
		return spID;
	}

	/**
	 * Sets the value of the spID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSpID(String value) {
		this.spID = value;
	}

	/**
	 * Gets the value of the spName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSpName() {
		return spName;
	}

	/**
	 * Sets the value of the spName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSpName(String value) {
		this.spName = value;
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
	 * Gets the value of the toneID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getToneID() {
		return toneID;
	}

	/**
	 * Sets the value of the toneID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setToneID(String value) {
		this.toneID = value;
	}

	/**
	 * Gets the value of the toneName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getToneName() {
		return toneName;
	}

	/**
	 * Sets the value of the toneName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setToneName(String value) {
		this.toneName = value;
	}

	/**
	 * Gets the value of the toneNameLetter property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getToneNameLetter() {
		return toneNameLetter;
	}

	/**
	 * Sets the value of the toneNameLetter property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setToneNameLetter(String value) {
		this.toneNameLetter = value;
	}

	/**
	 * Gets the value of the toneValidDay property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getToneValidDay() {
		return toneValidDay;
	}

	/**
	 * Sets the value of the toneValidDay property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setToneValidDay(String value) {
		this.toneValidDay = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

}
