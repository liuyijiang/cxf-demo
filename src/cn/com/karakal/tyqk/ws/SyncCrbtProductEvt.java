package cn.com.karakal.tyqk.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for syncCrbtProductEvt complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="syncCrbtProductEvt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contentInfo" type="{http://ws.tyqk.karakal.com.cn}contentInfo" minOccurs="0"/>
 *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provinceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syncCrbtProductEvt", propOrder = { "contentInfo", "eventType",
		"key", "pid", "provinceID", "reqType", "seq", "timeStamp",
		"transactionID" })
public class SyncCrbtProductEvt {

	protected ContentInfo contentInfo;
	protected String eventType;
	protected String key;
	@XmlElement(name = "PID")
	protected String pid;
	protected String provinceID;
	protected String reqType;
	@XmlElement(name = "SEQ")
	protected String seq;
	protected String timeStamp;
	protected String transactionID;

	/**
	 * Gets the value of the contentInfo property.
	 * 
	 * @return possible object is {@link ContentInfo }
	 * 
	 */
	public ContentInfo getContentInfo() {
		return contentInfo;
	}

	/**
	 * Sets the value of the contentInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link ContentInfo }
	 * 
	 */
	public void setContentInfo(ContentInfo value) {
		this.contentInfo = value;
	}

	/**
	 * Gets the value of the eventType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEventType() {
		return eventType;
	}

	/**
	 * Sets the value of the eventType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEventType(String value) {
		this.eventType = value;
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
	 * Gets the value of the provinceID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProvinceID() {
		return provinceID;
	}

	/**
	 * Sets the value of the provinceID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProvinceID(String value) {
		this.provinceID = value;
	}

	/**
	 * Gets the value of the reqType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReqType() {
		return reqType;
	}

	/**
	 * Sets the value of the reqType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReqType(String value) {
		this.reqType = value;
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
	 * Gets the value of the timeStamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * Sets the value of the timeStamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTimeStamp(String value) {
		this.timeStamp = value;
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

}
