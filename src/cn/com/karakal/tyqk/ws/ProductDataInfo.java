package cn.com.karakal.tyqk.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for productDataInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="productDataInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invalidDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productDataInfo", propOrder = { "invalidDate", "productId",
		"productName", "productStatus", "receiveDate", "singerName", "uuid" })
public class ProductDataInfo {

	protected String invalidDate;
	protected String productId;
	protected String productName;
	protected String productStatus;
	protected String receiveDate;
	protected String singerName;
	protected String uuid;

	/**
	 * Gets the value of the invalidDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvalidDate() {
		return invalidDate;
	}

	/**
	 * Sets the value of the invalidDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInvalidDate(String value) {
		this.invalidDate = value;
	}

	/**
	 * Gets the value of the productId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * Sets the value of the productId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductId(String value) {
		this.productId = value;
	}

	/**
	 * Gets the value of the productName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Sets the value of the productName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductName(String value) {
		this.productName = value;
	}

	/**
	 * Gets the value of the productStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductStatus() {
		return productStatus;
	}

	/**
	 * Sets the value of the productStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductStatus(String value) {
		this.productStatus = value;
	}

	/**
	 * Gets the value of the receiveDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReceiveDate() {
		return receiveDate;
	}

	/**
	 * Sets the value of the receiveDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReceiveDate(String value) {
		this.receiveDate = value;
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
	 * Gets the value of the uuid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * Sets the value of the uuid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUuid(String value) {
		this.uuid = value;
	}

}
