
package com.sitech.nbc.product.model.xsd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import com.sitech.nbc.product.model.dalbum_child.xsd.ContentInfo;
import com.sitech.nbc.product.model.dalbum_child.xsd.MetadataInfo;
import com.sitech.nbc.product.model.dalbum_child.xsd.ParamInfo;


/**
 * <p>Java class for DAlbumInfoEvt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DAlbumInfoEvt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessPlatformID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmpID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentSet" type="{http://dalbum_child.model.product.nbc.sitech.com/xsd}ContentInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="invalidateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metadataSet" type="{http://dalbum_child.model.product.nbc.sitech.com/xsd}MetadataInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paramSet" type="{http://dalbum_child.model.product.nbc.sitech.com/xsd}ParamInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="securityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DAlbumInfoEvt", propOrder = {
    "cVersion",
    "seq",
    "spid",
    "spName",
    "accessPlatformID",
    "action",
    "albumDesc",
    "albumID",
    "albumName",
    "albumType",
    "cmpID",
    "contentSet",
    "invalidateDate",
    "key",
    "metadataSet",
    "paramSet",
    "pid",
    "price",
    "relationID",
    "securityID",
    "transactionId",
    "validateDate"
})
public class DAlbumInfoEvt {

    @XmlElementRef(name = "CVersion", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cVersion;
    @XmlElementRef(name = "SEQ", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> seq;
    @XmlElementRef(name = "SPID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> spid;
    @XmlElementRef(name = "SPName", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> spName;
    @XmlElementRef(name = "accessPlatformID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> accessPlatformID;
    @XmlElementRef(name = "action", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> action;
    @XmlElementRef(name = "albumDesc", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> albumDesc;
    @XmlElementRef(name = "albumID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> albumID;
    @XmlElementRef(name = "albumName", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> albumName;
    @XmlElementRef(name = "albumType", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> albumType;
    @XmlElementRef(name = "cmpID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cmpID;
    @XmlElement(nillable = true)
    protected List<ContentInfo> contentSet;
    @XmlElementRef(name = "invalidateDate", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> invalidateDate;
    @XmlElementRef(name = "key", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> key;
    @XmlElement(nillable = true)
    protected List<MetadataInfo> metadataSet;
    @XmlElement(nillable = true)
    protected List<ParamInfo> paramSet;
    @XmlElementRef(name = "pid", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> pid;
    @XmlElementRef(name = "price", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> price;
    @XmlElementRef(name = "relationID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> relationID;
    @XmlElementRef(name = "securityID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> securityID;
    @XmlElementRef(name = "transactionId", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> transactionId;
    @XmlElementRef(name = "validateDate", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> validateDate;

    /**
     * Gets the value of the cVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCVersion() {
        return cVersion;
    }

    /**
     * Sets the value of the cVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCVersion(JAXBElement<String> value) {
        this.cVersion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSEQ() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSEQ(JAXBElement<String> value) {
        this.seq = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPID() {
        return spid;
    }

    /**
     * Sets the value of the spid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPID(JAXBElement<String> value) {
        this.spid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPName() {
        return spName;
    }

    /**
     * Sets the value of the spName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPName(JAXBElement<String> value) {
        this.spName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the accessPlatformID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccessPlatformID() {
        return accessPlatformID;
    }

    /**
     * Sets the value of the accessPlatformID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccessPlatformID(JAXBElement<String> value) {
        this.accessPlatformID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAction(JAXBElement<String> value) {
        this.action = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the albumDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlbumDesc() {
        return albumDesc;
    }

    /**
     * Sets the value of the albumDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlbumDesc(JAXBElement<String> value) {
        this.albumDesc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the albumID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlbumID() {
        return albumID;
    }

    /**
     * Sets the value of the albumID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlbumID(JAXBElement<String> value) {
        this.albumID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the albumName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlbumName() {
        return albumName;
    }

    /**
     * Sets the value of the albumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlbumName(JAXBElement<String> value) {
        this.albumName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the albumType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlbumType() {
        return albumType;
    }

    /**
     * Sets the value of the albumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlbumType(JAXBElement<String> value) {
        this.albumType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpID() {
        return cmpID;
    }

    /**
     * Sets the value of the cmpID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpID(JAXBElement<String> value) {
        this.cmpID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contentSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentInfo }
     * 
     * 
     */
    public List<ContentInfo> getContentSet() {
        if (contentSet == null) {
            contentSet = new ArrayList<ContentInfo>();
        }
        return this.contentSet;
    }

    /**
     * Gets the value of the invalidateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvalidateDate() {
        return invalidateDate;
    }

    /**
     * Sets the value of the invalidateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvalidateDate(JAXBElement<String> value) {
        this.invalidateDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKey(JAXBElement<String> value) {
        this.key = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the metadataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataInfo }
     * 
     * 
     */
    public List<MetadataInfo> getMetadataSet() {
        if (metadataSet == null) {
            metadataSet = new ArrayList<MetadataInfo>();
        }
        return this.metadataSet;
    }

    /**
     * Gets the value of the paramSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamInfo }
     * 
     * 
     */
    public List<ParamInfo> getParamSet() {
        if (paramSet == null) {
            paramSet = new ArrayList<ParamInfo>();
        }
        return this.paramSet;
    }

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPid(JAXBElement<String> value) {
        this.pid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrice(JAXBElement<String> value) {
        this.price = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the relationID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelationID() {
        return relationID;
    }

    /**
     * Sets the value of the relationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelationID(JAXBElement<String> value) {
        this.relationID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the securityID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecurityID() {
        return securityID;
    }

    /**
     * Sets the value of the securityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecurityID(JAXBElement<String> value) {
        this.securityID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionId(JAXBElement<String> value) {
        this.transactionId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the validateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidateDate() {
        return validateDate;
    }

    /**
     * Sets the value of the validateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidateDate(JAXBElement<String> value) {
        this.validateDate = ((JAXBElement<String> ) value);
    }

}
