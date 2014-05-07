
package com.sitech.nbc.product.model.dalbum_child.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paramDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paramName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamInfo", propOrder = {
    "contentID",
    "paramDesc",
    "paramName",
    "paramType"
})
public class ParamInfo {

    @XmlElementRef(name = "contentID", namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> contentID;
    @XmlElementRef(name = "paramDesc", namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> paramDesc;
    @XmlElementRef(name = "paramName", namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> paramName;
    @XmlElementRef(name = "paramType", namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> paramType;

    /**
     * Gets the value of the contentID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContentID() {
        return contentID;
    }

    /**
     * Sets the value of the contentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContentID(JAXBElement<String> value) {
        this.contentID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paramDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParamDesc() {
        return paramDesc;
    }

    /**
     * Sets the value of the paramDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParamDesc(JAXBElement<String> value) {
        this.paramDesc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paramName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParamName() {
        return paramName;
    }

    /**
     * Sets the value of the paramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParamName(JAXBElement<String> value) {
        this.paramName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paramType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParamType() {
        return paramType;
    }

    /**
     * Sets the value of the paramType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParamType(JAXBElement<String> value) {
        this.paramType = ((JAXBElement<String> ) value);
    }

}
