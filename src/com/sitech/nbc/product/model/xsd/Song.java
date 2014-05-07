
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
 * <p>Java class for Song complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Song">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMSURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="albumInfo" type="{http://model.product.nbc.sitech.com/xsd}AlbumInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnductorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnductorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="composerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="composerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="copyrightID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lyricUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lyricsWriterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lyricsWriterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prformerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prformerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publishYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="songID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="songName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="songNameFirstLetter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="songNamePinyin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Song", propOrder = {
    "cmsurl",
    "albumInfo",
    "area",
    "cnductorID",
    "cnductorName",
    "composerID",
    "composerName",
    "copyrightID",
    "intro",
    "language",
    "length",
    "lyricUrl",
    "lyricsWriterID",
    "lyricsWriterName",
    "prformerID",
    "prformerName",
    "publishYear",
    "singerID",
    "singerName",
    "songID",
    "songName",
    "songNameFirstLetter",
    "songNamePinyin",
    "speed",
    "status",
    "trackNo"
})
public class Song {

    @XmlElementRef(name = "CMSURL", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cmsurl;
    @XmlElement(nillable = true)
    protected List<AlbumInfo> albumInfo;
    @XmlElementRef(name = "area", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> area;
    @XmlElementRef(name = "cnductorID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cnductorID;
    @XmlElementRef(name = "cnductorName", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cnductorName;
    @XmlElementRef(name = "composerID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> composerID;
    @XmlElementRef(name = "composerName", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> composerName;
    @XmlElementRef(name = "copyrightID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> copyrightID;
    @XmlElementRef(name = "intro", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> intro;
    @XmlElementRef(name = "language", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> language;
    @XmlElementRef(name = "length", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> length;
    @XmlElementRef(name = "lyricUrl", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> lyricUrl;
    @XmlElementRef(name = "lyricsWriterID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> lyricsWriterID;
    @XmlElementRef(name = "lyricsWriterName", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> lyricsWriterName;
    @XmlElementRef(name = "prformerID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> prformerID;
    @XmlElementRef(name = "prformerName", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> prformerName;
    @XmlElementRef(name = "publishYear", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> publishYear;
    @XmlElementRef(name = "singerID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> singerID;
    @XmlElementRef(name = "singerName", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> singerName;
    @XmlElementRef(name = "songID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> songID;
    @XmlElementRef(name = "songName", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> songName;
    @XmlElementRef(name = "songNameFirstLetter", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> songNameFirstLetter;
    @XmlElementRef(name = "songNamePinyin", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> songNamePinyin;
    @XmlElementRef(name = "speed", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> speed;
    @XmlElementRef(name = "status", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "trackNo", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> trackNo;

    /**
     * Gets the value of the cmsurl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCMSURL() {
        return cmsurl;
    }

    /**
     * Sets the value of the cmsurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCMSURL(JAXBElement<String> value) {
        this.cmsurl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the albumInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the albumInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlbumInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlbumInfo }
     * 
     * 
     */
    public List<AlbumInfo> getAlbumInfo() {
        if (albumInfo == null) {
            albumInfo = new ArrayList<AlbumInfo>();
        }
        return this.albumInfo;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArea(JAXBElement<String> value) {
        this.area = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cnductorID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCnductorID() {
        return cnductorID;
    }

    /**
     * Sets the value of the cnductorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCnductorID(JAXBElement<String> value) {
        this.cnductorID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cnductorName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCnductorName() {
        return cnductorName;
    }

    /**
     * Sets the value of the cnductorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCnductorName(JAXBElement<String> value) {
        this.cnductorName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the composerID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComposerID() {
        return composerID;
    }

    /**
     * Sets the value of the composerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComposerID(JAXBElement<String> value) {
        this.composerID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the composerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComposerName() {
        return composerName;
    }

    /**
     * Sets the value of the composerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComposerName(JAXBElement<String> value) {
        this.composerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the copyrightID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCopyrightID() {
        return copyrightID;
    }

    /**
     * Sets the value of the copyrightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCopyrightID(JAXBElement<String> value) {
        this.copyrightID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the intro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIntro() {
        return intro;
    }

    /**
     * Sets the value of the intro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIntro(JAXBElement<String> value) {
        this.intro = ((JAXBElement<String> ) value);
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
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLength(JAXBElement<String> value) {
        this.length = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lyricUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLyricUrl() {
        return lyricUrl;
    }

    /**
     * Sets the value of the lyricUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLyricUrl(JAXBElement<String> value) {
        this.lyricUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lyricsWriterID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLyricsWriterID() {
        return lyricsWriterID;
    }

    /**
     * Sets the value of the lyricsWriterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLyricsWriterID(JAXBElement<String> value) {
        this.lyricsWriterID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lyricsWriterName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLyricsWriterName() {
        return lyricsWriterName;
    }

    /**
     * Sets the value of the lyricsWriterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLyricsWriterName(JAXBElement<String> value) {
        this.lyricsWriterName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prformerID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrformerID() {
        return prformerID;
    }

    /**
     * Sets the value of the prformerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrformerID(JAXBElement<String> value) {
        this.prformerID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prformerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrformerName() {
        return prformerName;
    }

    /**
     * Sets the value of the prformerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrformerName(JAXBElement<String> value) {
        this.prformerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the publishYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPublishYear() {
        return publishYear;
    }

    /**
     * Sets the value of the publishYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPublishYear(JAXBElement<String> value) {
        this.publishYear = ((JAXBElement<String> ) value);
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

    /**
     * Gets the value of the songID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSongID() {
        return songID;
    }

    /**
     * Sets the value of the songID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSongID(JAXBElement<String> value) {
        this.songID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the songName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSongName() {
        return songName;
    }

    /**
     * Sets the value of the songName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSongName(JAXBElement<String> value) {
        this.songName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the songNameFirstLetter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSongNameFirstLetter() {
        return songNameFirstLetter;
    }

    /**
     * Sets the value of the songNameFirstLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSongNameFirstLetter(JAXBElement<String> value) {
        this.songNameFirstLetter = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the songNamePinyin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSongNamePinyin() {
        return songNamePinyin;
    }

    /**
     * Sets the value of the songNamePinyin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSongNamePinyin(JAXBElement<String> value) {
        this.songNamePinyin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpeed(JAXBElement<String> value) {
        this.speed = ((JAXBElement<String> ) value);
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
     * Gets the value of the trackNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrackNo() {
        return trackNo;
    }

    /**
     * Sets the value of the trackNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrackNo(JAXBElement<String> value) {
        this.trackNo = ((JAXBElement<String> ) value);
    }

}
