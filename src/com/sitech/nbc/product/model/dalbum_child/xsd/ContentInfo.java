
package com.sitech.nbc.product.model.dalbum_child.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentInfo", propOrder = {
    "contentID",
    "contentName",
    "contentType",
    "singerName"
})
public class ContentInfo {

    @XmlElementRef(name = "contentID", namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> contentID;
    @XmlElementRef(name = "contentName", namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> contentName;
    @XmlElementRef(name = "contentType", namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> contentType;
    @XmlElementRef(name = "singerName", namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> singerName;

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
     * Gets the value of the contentName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContentName() {
        return contentName;
    }

    /**
     * Sets the value of the contentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContentName(JAXBElement<String> value) {
        this.contentName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContentType(JAXBElement<String> value) {
        this.contentType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the singerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSingerName() {
        return singerName;
    }

    /**
     * Sets the value of the singerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSingerName(JAXBElement<String> value) {
        this.singerName = ((JAXBElement<String> ) value);
    }

}
