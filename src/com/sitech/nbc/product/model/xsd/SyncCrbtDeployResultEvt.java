
package com.sitech.nbc.product.model.xsd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncCrbtDeployResultEvt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncCrbtDeployResultEvt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessPlatformID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failProvinceName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="successProvinceName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="successRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncCrbtDeployResultEvt", propOrder = {
    "cVersion",
    "pid",
    "seq",
    "accessPlatformID",
    "eventInfo",
    "failProvinceName",
    "key",
    "role",
    "roleCode",
    "successProvinceName",
    "successRate",
    "toneID",
    "transactionID"
})
public class SyncCrbtDeployResultEvt {

    @XmlElementRef(name = "CVersion", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cVersion;
    @XmlElementRef(name = "PID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> pid;
    @XmlElementRef(name = "SEQ", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> seq;
    @XmlElementRef(name = "accessPlatformID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> accessPlatformID;
    @XmlElementRef(name = "eventInfo", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> eventInfo;
    @XmlElement(nillable = true)
    protected List<String> failProvinceName;
    @XmlElementRef(name = "key", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> key;
    @XmlElementRef(name = "role", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> role;
    @XmlElementRef(name = "roleCode", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> roleCode;
    @XmlElement(nillable = true)
    protected List<String> successProvinceName;
    @XmlElementRef(name = "successRate", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> successRate;
    @XmlElementRef(name = "toneID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> toneID;
    @XmlElementRef(name = "transactionID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> transactionID;

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
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPID() {
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
    public void setPID(JAXBElement<String> value) {
        this.pid = ((JAXBElement<String> ) value);
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
     * Gets the value of the eventInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEventInfo() {
        return eventInfo;
    }

    /**
     * Sets the value of the eventInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEventInfo(JAXBElement<String> value) {
        this.eventInfo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failProvinceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failProvinceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailProvinceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFailProvinceName() {
        if (failProvinceName == null) {
            failProvinceName = new ArrayList<String>();
        }
        return this.failProvinceName;
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
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRole(JAXBElement<String> value) {
        this.role = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the roleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoleCode() {
        return roleCode;
    }

    /**
     * Sets the value of the roleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoleCode(JAXBElement<String> value) {
        this.roleCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the successProvinceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the successProvinceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccessProvinceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSuccessProvinceName() {
        if (successProvinceName == null) {
            successProvinceName = new ArrayList<String>();
        }
        return this.successProvinceName;
    }

    /**
     * Gets the value of the successRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuccessRate() {
        return successRate;
    }

    /**
     * Sets the value of the successRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuccessRate(JAXBElement<String> value) {
        this.successRate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the toneID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToneID() {
        return toneID;
    }

    /**
     * Sets the value of the toneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToneID(JAXBElement<String> value) {
        this.toneID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionID(JAXBElement<String> value) {
        this.transactionID = ((JAXBElement<String> ) value);
    }

}
