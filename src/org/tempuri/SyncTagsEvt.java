package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SyncTagsEvt complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SyncTagsEvt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectTags" type="{http://tempuri.org/}objectTags" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncTagsEvt", propOrder = { "pid", "seq", "key",
		"transactionID", "action", "objectCount", "objectTags" })
public class SyncTagsEvt {

	@XmlElement(name = "PID")
	protected String pid;
	@XmlElement(name = "SEQ")
	protected String seq;
	protected String key;
	protected String transactionID;
	protected String action;
	protected String objectCount;
	@XmlElement(nillable = true)
	protected List<ObjectTags> objectTags;

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
	 * Gets the value of the objectCount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getObjectCount() {
		return objectCount;
	}

	/**
	 * Sets the value of the objectCount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setObjectCount(String value) {
		this.objectCount = value;
	}

	/**
	 * Gets the value of the objectTags property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the objectTags property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getObjectTags().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ObjectTags }
	 * 
	 * 
	 */
	public List<ObjectTags> getObjectTags() {
		if (objectTags == null) {
			objectTags = new ArrayList<ObjectTags>();
		}
		return this.objectTags;
	}

}
