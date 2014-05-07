package cn.com.karakal.tyqk.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for syncCrbtDeployResultEvt complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="syncCrbtDeployResultEvt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessPlatformID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failProvinceName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="successProvinceName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="successRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "syncCrbtDeployResultEvt", propOrder = { "accessPlatformID",
		"cVersion", "eventInfo", "failProvinceName", "key", "pid", "role",
		"roleCode", "seq", "successProvinceName", "successRate", "toneID",
		"transactionID" })
public class SyncCrbtDeployResultEvt {

	protected String accessPlatformID;
	@XmlElement(name = "CVersion")
	protected String cVersion;
	protected String eventInfo;
	@XmlElement(nillable = true)
	protected List<String> failProvinceName;
	protected String key;
	@XmlElement(name = "PID")
	protected String pid;
	protected String role;
	protected String roleCode;
	@XmlElement(name = "SEQ")
	protected String seq;
	@XmlElement(nillable = true)
	protected List<String> successProvinceName;
	protected String successRate;
	protected String toneID;
	protected String transactionID;

	/**
	 * Gets the value of the accessPlatformID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccessPlatformID() {
		return accessPlatformID;
	}

	/**
	 * Sets the value of the accessPlatformID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccessPlatformID(String value) {
		this.accessPlatformID = value;
	}

	/**
	 * Gets the value of the cVersion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCVersion() {
		return cVersion;
	}

	/**
	 * Sets the value of the cVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCVersion(String value) {
		this.cVersion = value;
	}

	/**
	 * Gets the value of the eventInfo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEventInfo() {
		return eventInfo;
	}

	/**
	 * Sets the value of the eventInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEventInfo(String value) {
		this.eventInfo = value;
	}

	/**
	 * Gets the value of the failProvinceName property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the failProvinceName property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFailProvinceName().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getFailProvinceName() {
		if (failProvinceName == null) {
			failProvinceName = new ArrayList<String>();
		}
		return this.failProvinceName;
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
	 * Gets the value of the role property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Sets the value of the role property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRole(String value) {
		this.role = value;
	}

	/**
	 * Gets the value of the roleCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRoleCode() {
		return roleCode;
	}

	/**
	 * Sets the value of the roleCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRoleCode(String value) {
		this.roleCode = value;
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
	 * Gets the value of the successProvinceName property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the successProvinceName property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSuccessProvinceName().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getSuccessProvinceName() {
		if (successProvinceName == null) {
			successProvinceName = new ArrayList<String>();
		}
		return this.successProvinceName;
	}

	/**
	 * Gets the value of the successRate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSuccessRate() {
		return successRate;
	}

	/**
	 * Sets the value of the successRate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSuccessRate(String value) {
		this.successRate = value;
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
