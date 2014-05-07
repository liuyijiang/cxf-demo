package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for syncWirelessProductEvt complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="syncWirelessProductEvt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="songID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="songName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumInfo" type="{http://tempuri.org/}ArrayOfAlbumInfo" minOccurs="0"/>
 *         &lt;element name="SPName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="releaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="securityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metadataSet" type="{http://tempuri.org/}metadataInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="drmType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmsAlbum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invalidateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmsSinger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paramSet" type="{http://tempuri.org/}ParamInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syncWirelessProductEvt", propOrder = { "pid", "seq", "key",
		"transactionId", "action", "contentID", "spid", "relationID",
		"contentName", "contentDesc", "songID", "songName", "singerID",
		"singerName", "albumInfo", "spName", "releaseType", "securityID",
		"metadataSet", "property", "drmType", "cmsAlbum", "invalidateDate",
		"validateDate", "price", "cversion", "cmsSinger", "paramSet" })
public class SyncWirelessProductEvt {

	@XmlElement(name = "PID")
	protected String pid;
	@XmlElement(name = "SEQ")
	protected String seq;
	protected String key;
	protected String transactionId;
	protected String action;
	protected String contentID;
	@XmlElement(name = "SPID")
	protected String spid;
	protected String relationID;
	protected String contentName;
	protected String contentDesc;
	protected String songID;
	protected String songName;
	protected String singerID;
	protected String singerName;
	protected ArrayOfAlbumInfo albumInfo;
	@XmlElement(name = "SPName")
	protected String spName;
	protected String releaseType;
	protected String securityID;
	@XmlElement(nillable = true)
	protected List<MetadataInfo> metadataSet;
	protected String property;
	protected String drmType;
	protected String cmsAlbum;
	protected String invalidateDate;
	protected String validateDate;
	protected String price;
	protected String cversion;
	protected String cmsSinger;
	@XmlElement(nillable = true)
	protected List<ParamInfo> paramSet;

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
	 * Gets the value of the transactionId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * Sets the value of the transactionId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransactionId(String value) {
		this.transactionId = value;
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
	 * Gets the value of the contentID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContentID() {
		return contentID;
	}

	/**
	 * Sets the value of the contentID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContentID(String value) {
		this.contentID = value;
	}

	/**
	 * Gets the value of the spid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSPID() {
		return spid;
	}

	/**
	 * Sets the value of the spid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSPID(String value) {
		this.spid = value;
	}

	/**
	 * Gets the value of the relationID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRelationID() {
		return relationID;
	}

	/**
	 * Sets the value of the relationID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRelationID(String value) {
		this.relationID = value;
	}

	/**
	 * Gets the value of the contentName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContentName() {
		return contentName;
	}

	/**
	 * Sets the value of the contentName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContentName(String value) {
		this.contentName = value;
	}

	/**
	 * Gets the value of the contentDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContentDesc() {
		return contentDesc;
	}

	/**
	 * Sets the value of the contentDesc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContentDesc(String value) {
		this.contentDesc = value;
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
	 * Gets the value of the spName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSPName() {
		return spName;
	}

	/**
	 * Sets the value of the spName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSPName(String value) {
		this.spName = value;
	}

	/**
	 * Gets the value of the releaseType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReleaseType() {
		return releaseType;
	}

	/**
	 * Sets the value of the releaseType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReleaseType(String value) {
		this.releaseType = value;
	}

	/**
	 * Gets the value of the securityID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSecurityID() {
		return securityID;
	}

	/**
	 * Sets the value of the securityID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSecurityID(String value) {
		this.securityID = value;
	}

	/**
	 * Gets the value of the metadataSet property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the metadataSet property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMetadataSet().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link MetadataInfo }
	 * 
	 * 
	 */
	public List<MetadataInfo> getMetadataSet() {
		if (metadataSet == null) {
			metadataSet = new ArrayList<MetadataInfo>();
		}
		return this.metadataSet;
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
	 * Gets the value of the drmType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDrmType() {
		return drmType;
	}

	/**
	 * Sets the value of the drmType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDrmType(String value) {
		this.drmType = value;
	}

	/**
	 * Gets the value of the cmsAlbum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCmsAlbum() {
		return cmsAlbum;
	}

	/**
	 * Sets the value of the cmsAlbum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCmsAlbum(String value) {
		this.cmsAlbum = value;
	}

	/**
	 * Gets the value of the invalidateDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvalidateDate() {
		return invalidateDate;
	}

	/**
	 * Sets the value of the invalidateDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInvalidateDate(String value) {
		this.invalidateDate = value;
	}

	/**
	 * Gets the value of the validateDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValidateDate() {
		return validateDate;
	}

	/**
	 * Sets the value of the validateDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValidateDate(String value) {
		this.validateDate = value;
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
	 * Gets the value of the cversion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCversion() {
		return cversion;
	}

	/**
	 * Sets the value of the cversion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCversion(String value) {
		this.cversion = value;
	}

	/**
	 * Gets the value of the cmsSinger property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCmsSinger() {
		return cmsSinger;
	}

	/**
	 * Sets the value of the cmsSinger property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCmsSinger(String value) {
		this.cmsSinger = value;
	}

	/**
	 * Gets the value of the paramSet property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the paramSet property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getParamSet().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ParamInfo }
	 * 
	 * 
	 */
	public List<ParamInfo> getParamSet() {
		if (paramSet == null) {
			paramSet = new ArrayList<ParamInfo>();
		}
		return this.paramSet;
	}

}
