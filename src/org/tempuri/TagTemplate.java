package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for TagTemplate complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="TagTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tagID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentTagID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singleOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="needChildTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TagTemplate", propOrder = { "tagID", "tagName", "parentTagID",
		"tagStatus", "singleOption", "tagLevel", "needChildTag", "priority",
		"tagDesc" })
public class TagTemplate {

	protected String tagID;
	protected String tagName;
	protected String parentTagID;
	protected String tagStatus;
	protected String singleOption;
	protected String tagLevel;
	protected String needChildTag;
	protected String priority;
	protected String tagDesc;

	/**
	 * Gets the value of the tagID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTagID() {
		return tagID;
	}

	/**
	 * Sets the value of the tagID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTagID(String value) {
		this.tagID = value;
	}

	/**
	 * Gets the value of the tagName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTagName() {
		return tagName;
	}

	/**
	 * Sets the value of the tagName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTagName(String value) {
		this.tagName = value;
	}

	/**
	 * Gets the value of the parentTagID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParentTagID() {
		return parentTagID;
	}

	/**
	 * Sets the value of the parentTagID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParentTagID(String value) {
		this.parentTagID = value;
	}

	/**
	 * Gets the value of the tagStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTagStatus() {
		return tagStatus;
	}

	/**
	 * Sets the value of the tagStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTagStatus(String value) {
		this.tagStatus = value;
	}

	/**
	 * Gets the value of the singleOption property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSingleOption() {
		return singleOption;
	}

	/**
	 * Sets the value of the singleOption property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSingleOption(String value) {
		this.singleOption = value;
	}

	/**
	 * Gets the value of the tagLevel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTagLevel() {
		return tagLevel;
	}

	/**
	 * Sets the value of the tagLevel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTagLevel(String value) {
		this.tagLevel = value;
	}

	/**
	 * Gets the value of the needChildTag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNeedChildTag() {
		return needChildTag;
	}

	/**
	 * Sets the value of the needChildTag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNeedChildTag(String value) {
		this.needChildTag = value;
	}

	/**
	 * Gets the value of the priority property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * Sets the value of the priority property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPriority(String value) {
		this.priority = value;
	}

	/**
	 * Gets the value of the tagDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTagDesc() {
		return tagDesc;
	}

	/**
	 * Sets the value of the tagDesc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTagDesc(String value) {
		this.tagDesc = value;
	}

}
