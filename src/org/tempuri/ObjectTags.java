package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for objectTags complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="objectTags">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagIDs" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objectTags", propOrder = { "objectType", "objectID", "tagIDs" })
public class ObjectTags {

	protected String objectType;
	protected String objectID;
	protected ArrayOfString tagIDs;

	/**
	 * Gets the value of the objectType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getObjectType() {
		return objectType;
	}

	/**
	 * Sets the value of the objectType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setObjectType(String value) {
		this.objectType = value;
	}

	/**
	 * Gets the value of the objectID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getObjectID() {
		return objectID;
	}

	/**
	 * Sets the value of the objectID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setObjectID(String value) {
		this.objectID = value;
	}

	/**
	 * Gets the value of the tagIDs property.
	 * 
	 * @return possible object is {@link ArrayOfString }
	 * 
	 */
	public ArrayOfString getTagIDs() {
		return tagIDs;
	}

	/**
	 * Sets the value of the tagIDs property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfString }
	 * 
	 */
	public void setTagIDs(ArrayOfString value) {
		this.tagIDs = value;
	}

}
