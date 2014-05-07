package cn.com.karakal.tyqk.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dataSendStatusBean complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dataSendStatusBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="copyrightid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pkid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendStat" type="{http://ws.tyqk.karakal.com.cn}sendStat" minOccurs="0"/>
 *         &lt;element name="sendType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataSendStatusBean", propOrder = { "copyrightid", "pkid",
		"productid", "remark", "responseCode", "responseDesc", "sendDate",
		"sendStat", "sendType", "siteName", "transactionId" })
public class DataSendStatusBean {

	protected String copyrightid;
	protected String pkid;
	protected String productid;
	protected String remark;
	protected String responseCode;
	protected String responseDesc;
	protected String sendDate;
	protected SendStat sendStat;
	protected String sendType;
	protected String siteName;
	protected String transactionId;

	/**
	 * Gets the value of the copyrightid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCopyrightid() {
		return copyrightid;
	}

	/**
	 * Sets the value of the copyrightid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCopyrightid(String value) {
		this.copyrightid = value;
	}

	/**
	 * Gets the value of the pkid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPkid() {
		return pkid;
	}

	/**
	 * Sets the value of the pkid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPkid(String value) {
		this.pkid = value;
	}

	/**
	 * Gets the value of the productid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductid() {
		return productid;
	}

	/**
	 * Sets the value of the productid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductid(String value) {
		this.productid = value;
	}

	/**
	 * Gets the value of the remark property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * Sets the value of the remark property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRemark(String value) {
		this.remark = value;
	}

	/**
	 * Gets the value of the responseCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResponseCode() {
		return responseCode;
	}

	/**
	 * Sets the value of the responseCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResponseCode(String value) {
		this.responseCode = value;
	}

	/**
	 * Gets the value of the responseDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResponseDesc() {
		return responseDesc;
	}

	/**
	 * Sets the value of the responseDesc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResponseDesc(String value) {
		this.responseDesc = value;
	}

	/**
	 * Gets the value of the sendDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSendDate() {
		return sendDate;
	}

	/**
	 * Sets the value of the sendDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSendDate(String value) {
		this.sendDate = value;
	}

	/**
	 * Gets the value of the sendStat property.
	 * 
	 * @return possible object is {@link SendStat }
	 * 
	 */
	public SendStat getSendStat() {
		return sendStat;
	}

	/**
	 * Sets the value of the sendStat property.
	 * 
	 * @param value
	 *            allowed object is {@link SendStat }
	 * 
	 */
	public void setSendStat(SendStat value) {
		this.sendStat = value;
	}

	/**
	 * Gets the value of the sendType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSendType() {
		return sendType;
	}

	/**
	 * Sets the value of the sendType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSendType(String value) {
		this.sendType = value;
	}

	/**
	 * Gets the value of the siteName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSiteName() {
		return siteName;
	}

	/**
	 * Sets the value of the siteName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSiteName(String value) {
		this.siteName = value;
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

}
