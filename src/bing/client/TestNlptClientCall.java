package bing.client;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import com.sitech.nbc.product.model.xsd.SyncCatalogInfoEvt;
import com.sitech.nbc.product.model.xsd.SyncMaterialEvt;
import com.sitech.nbc.product.server.ProductServicePortType;

public class TestNlptClientCall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestNlptClientCall t = new TestNlptClientCall();
		t.test();

	}

	public void test(){
		try{
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress("http://192.168.1.224:8093/axis2/services/productService?wsdl");
		factory.setServiceClass(ProductServicePortType.class); 
		 factory.getInInterceptors().add(new LoggingInInterceptor());
	        factory.getOutInterceptors().add(new LoggingOutInterceptor());
		ProductServicePortType s = (ProductServicePortType) factory.create();
		 Client client = ClientProxy.getClient(s);
		QName qname = new QName("http://model.product.nbc.sitech.com/xsd","action");
		JAXBElement<String> action = new JAXBElement(qname,String.class,"2");
		QName qnamepid = new QName("http://model.product.nbc.sitech.com/xsd","PID");
		JAXBElement<String> pid = new JAXBElement(qnamepid,String.class,"555662");
		SyncCatalogInfoEvt val = new SyncCatalogInfoEvt();
		val.setAction(action);
		val.setPID(pid);
		//s.syncCatalogInfo(val);
		if (client != null) {
            HTTPConduit conduit = (HTTPConduit) client.getConduit();
            HTTPClientPolicy policy = new HTTPClientPolicy();
            policy.setConnectionTimeout(10000);
            policy.setReceiveTimeout(10000);
            policy.setAllowChunking(false); 
            conduit.setClient(policy); 
        }   
		s.syncCatalogInfo(val);
		//s.syncMaterial(event)
		SyncMaterialEvt ss = new SyncMaterialEvt();
		System.out.println(1);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
