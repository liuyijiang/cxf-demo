package cn.com.karakal.tyqk.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for productInfoResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="productInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.tyqk.karakal.com.cn}response">
 *       &lt;sequence>
 *         &lt;element name="linkedHashMapForProductInfo" type="{http://ws.tyqk.karakal.com.cn}productDataInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productInfoResponse", propOrder = { "linkedHashMapForProductInfo" })
public class ProductInfoResponse extends Response {

	@XmlElement(nillable = true)
	protected List<ProductDataInfo> linkedHashMapForProductInfo;

	/**
	 * Gets the value of the linkedHashMapForProductInfo property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the linkedHashMapForProductInfo property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLinkedHashMapForProductInfo().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ProductDataInfo }
	 * 
	 * 
	 */
	public List<ProductDataInfo> getLinkedHashMapForProductInfo() {
		if (linkedHashMapForProductInfo == null) {
			linkedHashMapForProductInfo = new ArrayList<ProductDataInfo>();
		}
		return this.linkedHashMapForProductInfo;
	}

}
