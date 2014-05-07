package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ParamInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ParamInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paramValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamInfo", propOrder = { "paramName", "paramValue" })
public class ParamInfo {

	protected String paramName;
	protected String paramValue;

	/**
	 * Gets the value of the paramName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParamName() {
		return paramName;
	}

	/**
	 * Sets the value of the paramName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParamName(String value) {
		this.paramName = value;
	}

	/**
	 * Gets the value of the paramValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParamValue() {
		return paramValue;
	}

	/**
	 * Sets the value of the paramValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParamValue(String value) {
		this.paramValue = value;
	}

}