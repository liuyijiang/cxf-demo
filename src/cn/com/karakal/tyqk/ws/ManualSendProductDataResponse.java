package cn.com.karakal.tyqk.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for manualSendProductDataResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="manualSendProductDataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.tyqk.karakal.com.cn}response" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manualSendProductDataResponse", propOrder = { "_return" })
public class ManualSendProductDataResponse {

	@XmlElement(name = "return")
	protected Response _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link Response }
	 * 
	 */
	public Response getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link Response }
	 * 
	 */
	public void setReturn(Response value) {
		this._return = value;
	}

}
