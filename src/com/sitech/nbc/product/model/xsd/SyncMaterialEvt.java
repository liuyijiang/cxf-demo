
package com.sitech.nbc.product.model.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncMaterialEvt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncMaterialEvt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="album" type="{http://model.product.nbc.sitech.com/xsd}Album" minOccurs="0"/>
 *         &lt;element name="artist" type="{http://model.product.nbc.sitech.com/xsd}Artist" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="song" type="{http://model.product.nbc.sitech.com/xsd}Song" minOccurs="0"/>
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
@XmlType(name = "SyncMaterialEvt", propOrder = {
    "pid",
    "seq",
    "action",
    "album",
    "artist",
    "key",
    "objectType",
    "song",
    "transactionID"
})
public class SyncMaterialEvt {

    @XmlElementRef(name = "PID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> pid;
    @XmlElementRef(name = "SEQ", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> seq;
    @XmlElementRef(name = "action", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> action;
    @XmlElementRef(name = "album", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Album> album;
    @XmlElementRef(name = "artist", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Artist> artist;
    @XmlElementRef(name = "key", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> key;
    @XmlElementRef(name = "objectType", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> objectType;
    @XmlElementRef(name = "song", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Song> song;
    @XmlElementRef(name = "transactionID", namespace = "http://model.product.nbc.sitech.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> transactionID;

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
     * Gets the value of the album property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Album }{@code >}
     *     
     */
    public JAXBElement<Album> getAlbum() {
        return album;
    }

    /**
     * Sets the value of the album property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Album }{@code >}
     *     
     */
    public void setAlbum(JAXBElement<Album> value) {
        this.album = ((JAXBElement<Album> ) value);
    }

    /**
     * Gets the value of the artist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Artist }{@code >}
     *     
     */
    public JAXBElement<Artist> getArtist() {
        return artist;
    }

    /**
     * Sets the value of the artist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Artist }{@code >}
     *     
     */
    public void setArtist(JAXBElement<Artist> value) {
        this.artist = ((JAXBElement<Artist> ) value);
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
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObjectType(JAXBElement<String> value) {
        this.objectType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the song property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Song }{@code >}
     *     
     */
    public JAXBElement<Song> getSong() {
        return song;
    }

    /**
     * Sets the value of the song property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Song }{@code >}
     *     
     */
    public void setSong(JAXBElement<Song> value) {
        this.song = ((JAXBElement<Song> ) value);
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
