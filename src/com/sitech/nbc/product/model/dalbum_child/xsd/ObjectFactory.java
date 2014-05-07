
package com.sitech.nbc.product.model.dalbum_child.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sitech.nbc.product.model.dalbum_child.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MetadataInfoFileType_QNAME = new QName("http://dalbum_child.model.product.nbc.sitech.com/xsd", "fileType");
    private final static QName _MetadataInfoCmpUrl_QNAME = new QName("http://dalbum_child.model.product.nbc.sitech.com/xsd", "cmpUrl");
    private final static QName _MetadataInfoTerminalList_QNAME = new QName("http://dalbum_child.model.product.nbc.sitech.com/xsd", "terminalList");
    private final static QName _MetadataInfoResourceID_QNAME = new QName("http://dalbum_child.model.product.nbc.sitech.com/xsd", "resourceID");
    private final static QName _MetadataInfoIsGet_QNAME = new QName("http://dalbum_child.model.product.nbc.sitech.com/xsd", "isGet");
    private final static QName _MetadataInfoMimeType_QNAME = new QName("http://dalbum_child.model.product.nbc.sitech.com/xsd", "mimeType");
    private final static QName _MetadataInfoChord_QNAME = new QName("http://dalbum_child.model.product.nbc.sitech.com/xsd", "chord");
    private final static QName _MetadataInfoSize_QNAME = new QName("http://dalbum_child.model.product.nbc.sitech.com/xsd", "size");
    private final static QName _ContentInfoSingerName_QNAME = new QName("http://dalbum_child.model.product.nbc.sitech.com/xsd", "singerName");
    private final static QName _ContentInfoContentType_QNAME = new QName("http://dalbum_child.model.product.nbc.sitech.com/xsd", "contentType");
    private final static QName _ContentInfoContentName_QNAME = new QName("http://dalbum_child.model.product.nbc.sitech.com/xsd", "contentName");
    private final static QName _ContentInfoContentID_QNAME = new QName("http://dalbum_child.model.product.nbc.sitech.com/xsd", "contentID");
    private final static QName _ParamInfoParamDesc_QNAME = new QName("http://dalbum_child.model.product.nbc.sitech.com/xsd", "paramDesc");
    private final static QName _ParamInfoParamType_QNAME = new QName("http://dalbum_child.model.product.nbc.sitech.com/xsd", "paramType");
    private final static QName _ParamInfoParamName_QNAME = new QName("http://dalbum_child.model.product.nbc.sitech.com/xsd", "paramName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sitech.nbc.product.model.dalbum_child.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MetadataInfo }
     * 
     */
    public MetadataInfo createMetadataInfo() {
        return new MetadataInfo();
    }

    /**
     * Create an instance of {@link ContentInfo }
     * 
     */
    public ContentInfo createContentInfo() {
        return new ContentInfo();
    }

    /**
     * Create an instance of {@link ParamInfo }
     * 
     */
    public ParamInfo createParamInfo() {
        return new ParamInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "fileType", scope = MetadataInfo.class)
    public JAXBElement<String> createMetadataInfoFileType(String value) {
        return new JAXBElement<String>(_MetadataInfoFileType_QNAME, String.class, MetadataInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "cmpUrl", scope = MetadataInfo.class)
    public JAXBElement<String> createMetadataInfoCmpUrl(String value) {
        return new JAXBElement<String>(_MetadataInfoCmpUrl_QNAME, String.class, MetadataInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "terminalList", scope = MetadataInfo.class)
    public JAXBElement<String> createMetadataInfoTerminalList(String value) {
        return new JAXBElement<String>(_MetadataInfoTerminalList_QNAME, String.class, MetadataInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "resourceID", scope = MetadataInfo.class)
    public JAXBElement<String> createMetadataInfoResourceID(String value) {
        return new JAXBElement<String>(_MetadataInfoResourceID_QNAME, String.class, MetadataInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "isGet", scope = MetadataInfo.class)
    public JAXBElement<String> createMetadataInfoIsGet(String value) {
        return new JAXBElement<String>(_MetadataInfoIsGet_QNAME, String.class, MetadataInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "mimeType", scope = MetadataInfo.class)
    public JAXBElement<String> createMetadataInfoMimeType(String value) {
        return new JAXBElement<String>(_MetadataInfoMimeType_QNAME, String.class, MetadataInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "chord", scope = MetadataInfo.class)
    public JAXBElement<String> createMetadataInfoChord(String value) {
        return new JAXBElement<String>(_MetadataInfoChord_QNAME, String.class, MetadataInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "size", scope = MetadataInfo.class)
    public JAXBElement<String> createMetadataInfoSize(String value) {
        return new JAXBElement<String>(_MetadataInfoSize_QNAME, String.class, MetadataInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "singerName", scope = ContentInfo.class)
    public JAXBElement<String> createContentInfoSingerName(String value) {
        return new JAXBElement<String>(_ContentInfoSingerName_QNAME, String.class, ContentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "contentType", scope = ContentInfo.class)
    public JAXBElement<String> createContentInfoContentType(String value) {
        return new JAXBElement<String>(_ContentInfoContentType_QNAME, String.class, ContentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "contentName", scope = ContentInfo.class)
    public JAXBElement<String> createContentInfoContentName(String value) {
        return new JAXBElement<String>(_ContentInfoContentName_QNAME, String.class, ContentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "contentID", scope = ContentInfo.class)
    public JAXBElement<String> createContentInfoContentID(String value) {
        return new JAXBElement<String>(_ContentInfoContentID_QNAME, String.class, ContentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "paramDesc", scope = ParamInfo.class)
    public JAXBElement<String> createParamInfoParamDesc(String value) {
        return new JAXBElement<String>(_ParamInfoParamDesc_QNAME, String.class, ParamInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "paramType", scope = ParamInfo.class)
    public JAXBElement<String> createParamInfoParamType(String value) {
        return new JAXBElement<String>(_ParamInfoParamType_QNAME, String.class, ParamInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "contentID", scope = ParamInfo.class)
    public JAXBElement<String> createParamInfoContentID(String value) {
        return new JAXBElement<String>(_ContentInfoContentID_QNAME, String.class, ParamInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dalbum_child.model.product.nbc.sitech.com/xsd", name = "paramName", scope = ParamInfo.class)
    public JAXBElement<String> createParamInfoParamName(String value) {
        return new JAXBElement<String>(_ParamInfoParamName_QNAME, String.class, ParamInfo.class, value);
    }

}
