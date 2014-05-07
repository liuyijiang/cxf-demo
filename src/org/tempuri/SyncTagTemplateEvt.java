package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SyncTagTemplateEvt complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SyncTagTemplateEvt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagTemplateVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagTemplate" type="{http://tempuri.org/}ArrayOfTagTemplate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncTagTemplateEvt", propOrder = { "pid", "seq", "key",
		"transactionID", "action", "tagTemplateVersion", "tagTemplate" })
public class SyncTagTemplateEvt {

	@XmlElement(name = "PID")
	protected String pid;
	@XmlElement(name = "SEQ")
	protected String seq;
	protected String key;
	protected String transactionID;
	protected String action;
	protected String tagTemplateVersion;
	protected ArrayOfTagTemplate tagTemplate;

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
	 * Gets the value of the tagTemplateVersion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTagTemplateVersion() {
		return tagTemplateVersion;
	}

	/**
	 * Sets the value of the tagTemplateVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTagTemplateVersion(String value) {
		this.tagTemplateVersion = value;
	}

	/**
	 * Gets the value of the tagTemplate property.
	 * 
	 * @return possible object is {@link ArrayOfTagTemplate }
	 * 
	 */
	public ArrayOfTagTemplate getTagTemplate() {
		return tagTemplate;
	}

	/**
	 * Sets the value of the tagTemplate property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfTagTemplate }
	 * 
	 */
	public void setTagTemplate(ArrayOfTagTemplate value) {
		this.tagTemplate = value;
	}

}
