
package com.sitech.nbc.product.server;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-b05-RC1
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "productService", targetNamespace = "http://server.product.nbc.sitech.com", wsdlLocation = "http://192.168.1.224:8093/axis2/services/productService?wsdl")
public class ProductService
    extends Service
{

    private final static URL PRODUCTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.sitech.nbc.product.server.ProductService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.sitech.nbc.product.server.ProductService.class.getResource(".");
            url = new URL(baseUrl, "http://192.168.1.224:8093/axis2/services/productService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://192.168.1.224:8093/axis2/services/productService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PRODUCTSERVICE_WSDL_LOCATION = url;
    }

    public ProductService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductService() {
        super(PRODUCTSERVICE_WSDL_LOCATION, new QName("http://server.product.nbc.sitech.com", "productService"));
    }

    /**
     * 
     * @return
     *     returns ProductServicePortType
     */
    @WebEndpoint(name = "productServiceHttpSoap11Endpoint")
    public ProductServicePortType getProductServiceHttpSoap11Endpoint() {
        return super.getPort(new QName("http://server.product.nbc.sitech.com", "productServiceHttpSoap11Endpoint"), ProductServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductServicePortType
     */
    @WebEndpoint(name = "productServiceHttpSoap11Endpoint")
    public ProductServicePortType getProductServiceHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.product.nbc.sitech.com", "productServiceHttpSoap11Endpoint"), ProductServicePortType.class, features);
    }

}