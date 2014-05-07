package cn.com.karakal.tyqk.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://ws.tyqk.karakal.com.cn}syncCrbtProductEvt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "arg0" })
@XmlRootElement(name = "syncCrbtProduct")
public class SyncCrbtProduct {

	@XmlElement(required = true)
	protected SyncCrbtProductEvt arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link SyncCrbtProductEvt }
	 * 
	 */
	public SyncCrbtProductEvt getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link SyncCrbtProductEvt }
	 * 
	 */
	public void setArg0(SyncCrbtProductEvt value) {
		this.arg0 = value;
	}

}
