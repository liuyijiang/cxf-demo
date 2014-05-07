
package com.sitech.nbc.product.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.sitech.nbc.product.model.xsd.DAlbumInfoEvt;
import com.sitech.nbc.product.model.xsd.Response;
import com.sitech.nbc.product.model.xsd.SyncCatalogInfoEvt;
import com.sitech.nbc.product.model.xsd.SyncCrbtDeployResultEvt;
import com.sitech.nbc.product.model.xsd.SyncCrbtProductEvt;
import com.sitech.nbc.product.model.xsd.SyncMaterialEvt;
import com.sitech.nbc.product.model.xsd.SyncTagTemplateEvt;
import com.sitech.nbc.product.model.xsd.SyncTagsEvt;
import com.sitech.nbc.product.model.xsd.SyncWirelessProductEvt;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sitech.nbc.product.server package. 
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

    private final static QName _DeployeDAlbumEvent_QNAME = new QName("http://server.product.nbc.sitech.com", "event");
    private final static QName _SyncWirelessProductResponseReturn_QNAME = new QName("http://server.product.nbc.sitech.com", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sitech.nbc.product.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeployeDAlbum }
     * 
     */
    public DeployeDAlbum createDeployeDAlbum() {
        return new DeployeDAlbum();
    }

    /**
     * Create an instance of {@link SyncWirelessProductResponse }
     * 
     */
    public SyncWirelessProductResponse createSyncWirelessProductResponse() {
        return new SyncWirelessProductResponse();
    }

    /**
     * Create an instance of {@link SyncTagTemplateResponse }
     * 
     */
    public SyncTagTemplateResponse createSyncTagTemplateResponse() {
        return new SyncTagTemplateResponse();
    }

    /**
     * Create an instance of {@link SyncCrbtDeployResult }
     * 
     */
    public SyncCrbtDeployResult createSyncCrbtDeployResult() {
        return new SyncCrbtDeployResult();
    }

    /**
     * Create an instance of {@link SyncTagTemplate }
     * 
     */
    public SyncTagTemplate createSyncTagTemplate() {
        return new SyncTagTemplate();
    }

    /**
     * Create an instance of {@link SyncMaterialResponse }
     * 
     */
    public SyncMaterialResponse createSyncMaterialResponse() {
        return new SyncMaterialResponse();
    }

    /**
     * Create an instance of {@link SyncTagsResponse }
     * 
     */
    public SyncTagsResponse createSyncTagsResponse() {
        return new SyncTagsResponse();
    }

    /**
     * Create an instance of {@link SyncCrbtProductResponse }
     * 
     */
    public SyncCrbtProductResponse createSyncCrbtProductResponse() {
        return new SyncCrbtProductResponse();
    }

    /**
     * Create an instance of {@link SyncTags }
     * 
     */
    public SyncTags createSyncTags() {
        return new SyncTags();
    }

    /**
     * Create an instance of {@link SyncCrbtProduct }
     * 
     */
    public SyncCrbtProduct createSyncCrbtProduct() {
        return new SyncCrbtProduct();
    }

    /**
     * Create an instance of {@link SyncWirelessProduct }
     * 
     */
    public SyncWirelessProduct createSyncWirelessProduct() {
        return new SyncWirelessProduct();
    }

    /**
     * Create an instance of {@link SyncCrbtDeployResultResponse }
     * 
     */
    public SyncCrbtDeployResultResponse createSyncCrbtDeployResultResponse() {
        return new SyncCrbtDeployResultResponse();
    }

    /**
     * Create an instance of {@link SyncCatalogInfoResponse }
     * 
     */
    public SyncCatalogInfoResponse createSyncCatalogInfoResponse() {
        return new SyncCatalogInfoResponse();
    }

    /**
     * Create an instance of {@link SyncMaterial }
     * 
     */
    public SyncMaterial createSyncMaterial() {
        return new SyncMaterial();
    }

    /**
     * Create an instance of {@link SyncCatalogInfo }
     * 
     */
    public SyncCatalogInfo createSyncCatalogInfo() {
        return new SyncCatalogInfo();
    }

    /**
     * Create an instance of {@link DeployeDAlbumResponse }
     * 
     */
    public DeployeDAlbumResponse createDeployeDAlbumResponse() {
        return new DeployeDAlbumResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DAlbumInfoEvt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "event", scope = DeployeDAlbum.class)
    public JAXBElement<DAlbumInfoEvt> createDeployeDAlbumEvent(DAlbumInfoEvt value) {
        return new JAXBElement<DAlbumInfoEvt>(_DeployeDAlbumEvent_QNAME, DAlbumInfoEvt.class, DeployeDAlbum.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "return", scope = SyncWirelessProductResponse.class)
    public JAXBElement<Response> createSyncWirelessProductResponseReturn(Response value) {
        return new JAXBElement<Response>(_SyncWirelessProductResponseReturn_QNAME, Response.class, SyncWirelessProductResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "return", scope = SyncTagTemplateResponse.class)
    public JAXBElement<Response> createSyncTagTemplateResponseReturn(Response value) {
        return new JAXBElement<Response>(_SyncWirelessProductResponseReturn_QNAME, Response.class, SyncTagTemplateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncCrbtDeployResultEvt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "event", scope = SyncCrbtDeployResult.class)
    public JAXBElement<SyncCrbtDeployResultEvt> createSyncCrbtDeployResultEvent(SyncCrbtDeployResultEvt value) {
        return new JAXBElement<SyncCrbtDeployResultEvt>(_DeployeDAlbumEvent_QNAME, SyncCrbtDeployResultEvt.class, SyncCrbtDeployResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncTagTemplateEvt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "event", scope = SyncTagTemplate.class)
    public JAXBElement<SyncTagTemplateEvt> createSyncTagTemplateEvent(SyncTagTemplateEvt value) {
        return new JAXBElement<SyncTagTemplateEvt>(_DeployeDAlbumEvent_QNAME, SyncTagTemplateEvt.class, SyncTagTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "return", scope = SyncMaterialResponse.class)
    public JAXBElement<Response> createSyncMaterialResponseReturn(Response value) {
        return new JAXBElement<Response>(_SyncWirelessProductResponseReturn_QNAME, Response.class, SyncMaterialResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "return", scope = SyncTagsResponse.class)
    public JAXBElement<Response> createSyncTagsResponseReturn(Response value) {
        return new JAXBElement<Response>(_SyncWirelessProductResponseReturn_QNAME, Response.class, SyncTagsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "return", scope = SyncCrbtProductResponse.class)
    public JAXBElement<Response> createSyncCrbtProductResponseReturn(Response value) {
        return new JAXBElement<Response>(_SyncWirelessProductResponseReturn_QNAME, Response.class, SyncCrbtProductResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncTagsEvt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "event", scope = SyncTags.class)
    public JAXBElement<SyncTagsEvt> createSyncTagsEvent(SyncTagsEvt value) {
        return new JAXBElement<SyncTagsEvt>(_DeployeDAlbumEvent_QNAME, SyncTagsEvt.class, SyncTags.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncCrbtProductEvt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "event", scope = SyncCrbtProduct.class)
    public JAXBElement<SyncCrbtProductEvt> createSyncCrbtProductEvent(SyncCrbtProductEvt value) {
        return new JAXBElement<SyncCrbtProductEvt>(_DeployeDAlbumEvent_QNAME, SyncCrbtProductEvt.class, SyncCrbtProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncWirelessProductEvt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "event", scope = SyncWirelessProduct.class)
    public JAXBElement<SyncWirelessProductEvt> createSyncWirelessProductEvent(SyncWirelessProductEvt value) {
        return new JAXBElement<SyncWirelessProductEvt>(_DeployeDAlbumEvent_QNAME, SyncWirelessProductEvt.class, SyncWirelessProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "return", scope = SyncCrbtDeployResultResponse.class)
    public JAXBElement<Response> createSyncCrbtDeployResultResponseReturn(Response value) {
        return new JAXBElement<Response>(_SyncWirelessProductResponseReturn_QNAME, Response.class, SyncCrbtDeployResultResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "return", scope = SyncCatalogInfoResponse.class)
    public JAXBElement<Response> createSyncCatalogInfoResponseReturn(Response value) {
        return new JAXBElement<Response>(_SyncWirelessProductResponseReturn_QNAME, Response.class, SyncCatalogInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncMaterialEvt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "event", scope = SyncMaterial.class)
    public JAXBElement<SyncMaterialEvt> createSyncMaterialEvent(SyncMaterialEvt value) {
        return new JAXBElement<SyncMaterialEvt>(_DeployeDAlbumEvent_QNAME, SyncMaterialEvt.class, SyncMaterial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncCatalogInfoEvt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "event", scope = SyncCatalogInfo.class)
    public JAXBElement<SyncCatalogInfoEvt> createSyncCatalogInfoEvent(SyncCatalogInfoEvt value) {
        return new JAXBElement<SyncCatalogInfoEvt>(_DeployeDAlbumEvent_QNAME, SyncCatalogInfoEvt.class, SyncCatalogInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.product.nbc.sitech.com", name = "return", scope = DeployeDAlbumResponse.class)
    public JAXBElement<Response> createDeployeDAlbumResponseReturn(Response value) {
        return new JAXBElement<Response>(_SyncWirelessProductResponseReturn_QNAME, Response.class, DeployeDAlbumResponse.class, value);
    }

}
