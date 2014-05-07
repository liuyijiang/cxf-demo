
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
 * <p>Java class for Album complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Album">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="albumID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumIntro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumNameFirstLetter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumNamePinyin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumPicL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumPicM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumPicS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="awards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productionCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publishArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publishCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="songIDs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Album", propOrder = {
    "albumID",
    "albumIntro",
    "albumLength",
    "albumName",
    "albumNameFirstLetter",
    "albumNamePinyin",
    "albumPicL",
    "albumPicM",
    "albumPicS",
    "awards",
    "language",
    "productionCompany",
    "publishArea",
    "publishCompany",
    "publishDate",
    "salesVolume",
    "singerID",
    "songIDs",
    "status",
    "trackCount"
})
public class Album {

    @XmlElementRef(name = "albumID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> albumID;
    @XmlElementRef(name = "albumIntro", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> albumIntro;
    @XmlElementRef(name = "albumLength", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> albumLength;
    @XmlElementRef(name = "albumName", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> albumName;
    @XmlElementRef(name = "albumNameFirstLetter", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> albumNameFirstLetter;
    @XmlElementRef(name = "albumNamePinyin", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> albumNamePinyin;
    @XmlElementRef(name = "albumPicL", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> albumPicL;
    @XmlElementRef(name = "albumPicM", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> albumPicM;
    @XmlElementRef(name = "albumPicS", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> albumPicS;
    @XmlElementRef(name = "awards", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> awards;
    @XmlElementRef(name = "language", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> language;
    @XmlElementRef(name = "productionCompany", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> productionCompany;
    @XmlElementRef(name = "publishArea", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> publishArea;
    @XmlElementRef(name = "publishCompany", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> publishCompany;
    @XmlElementRef(name = "publishDate", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> publishDate;
    @XmlElementRef(name = "salesVolume", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> salesVolume;
    @XmlElementRef(name = "singerID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> singerID;
    @XmlElement(nillable = true)
    protected List<String> songIDs;
    @XmlElementRef(name = "status", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "trackCount", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> trackCount;

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
     * Gets the value of the albumIntro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlbumIntro() {
        return albumIntro;
    }

    /**
     * Sets the value of the albumIntro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlbumIntro(JAXBElement<String> value) {
        this.albumIntro = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the albumLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlbumLength() {
        return albumLength;
    }

    /**
     * Sets the value of the albumLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlbumLength(JAXBElement<String> value) {
        this.albumLength = ((JAXBElement<String> ) value);
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
     * Gets the value of the albumNameFirstLetter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlbumNameFirstLetter() {
        return albumNameFirstLetter;
    }

    /**
     * Sets the value of the albumNameFirstLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlbumNameFirstLetter(JAXBElement<String> value) {
        this.albumNameFirstLetter = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the albumNamePinyin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlbumNamePinyin() {
        return albumNamePinyin;
    }

    /**
     * Sets the value of the albumNamePinyin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlbumNamePinyin(JAXBElement<String> value) {
        this.albumNamePinyin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the albumPicL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlbumPicL() {
        return albumPicL;
    }

    /**
     * Sets the value of the albumPicL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlbumPicL(JAXBElement<String> value) {
        this.albumPicL = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the albumPicM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlbumPicM() {
        return albumPicM;
    }

    /**
     * Sets the value of the albumPicM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlbumPicM(JAXBElement<String> value) {
        this.albumPicM = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the albumPicS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlbumPicS() {
        return albumPicS;
    }

    /**
     * Sets the value of the albumPicS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlbumPicS(JAXBElement<String> value) {
        this.albumPicS = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the awards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAwards() {
        return awards;
    }

    /**
     * Sets the value of the awards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAwards(JAXBElement<String> value) {
        this.awards = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguage(JAXBElement<String> value) {
        this.language = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the productionCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductionCompany() {
        return productionCompany;
    }

    /**
     * Sets the value of the productionCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductionCompany(JAXBElement<String> value) {
        this.productionCompany = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the publishArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPublishArea() {
        return publishArea;
    }

    /**
     * Sets the value of the publishArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPublishArea(JAXBElement<String> value) {
        this.publishArea = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the publishCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPublishCompany() {
        return publishCompany;
    }

    /**
     * Sets the value of the publishCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPublishCompany(JAXBElement<String> value) {
        this.publishCompany = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the publishDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPublishDate() {
        return publishDate;
    }

    /**
     * Sets the value of the publishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPublishDate(JAXBElement<String> value) {
        this.publishDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesVolume property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesVolume() {
        return salesVolume;
    }

    /**
     * Sets the value of the salesVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesVolume(JAXBElement<String> value) {
        this.salesVolume = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the singerID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSingerID() {
        return singerID;
    }

    /**
     * Sets the value of the singerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSingerID(JAXBElement<String> value) {
        this.singerID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the songIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the songIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSongIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSongIDs() {
        if (songIDs == null) {
            songIDs = new ArrayList<String>();
        }
        return this.songIDs;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trackCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrackCount() {
        return trackCount;
    }

    /**
     * Sets the value of the trackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrackCount(JAXBElement<String> value) {
        this.trackCount = ((JAXBElement<String> ) value);
    }

}
