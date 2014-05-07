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
 *         &lt;element name="arg0" type="{http://ws.tyqk.karakal.com.cn}syncCrbtDeployResultEvt"/>
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
@XmlRootElement(name = "syncCrbtDeployResult")
public class SyncCrbtDeployResult {

	@XmlElement(required = true)
	protected SyncCrbtDeployResultEvt arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link SyncCrbtDeployResultEvt }
	 * 
	 */
	public SyncCrbtDeployResultEvt getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link SyncCrbtDeployResultEvt }
	 * 
	 */
	public void setArg0(SyncCrbtDeployResultEvt value) {
		this.arg0 = value;
	}

}
