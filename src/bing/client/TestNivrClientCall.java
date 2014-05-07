package bing.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.tempuri.SyncMaterialEvt;
import org.tempuri.SyncProductManageSoap;

import com.sitech.nbc.product.server.ProductServicePortType;

public class TestNivrClientCall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
			factory.setAddress("http://192.168.1.224:8088/nivr/SyncProductManageSoap?wsdl");
			factory.setServiceClass(SyncProductManageSoap.class); 
			 factory.getInInterceptors().add(new LoggingInInterceptor());
		        factory.getOutInterceptors().add(new LoggingOutInterceptor());
		        SyncProductManageSoap s = (SyncProductManageSoap) factory.create();
			 Client client = ClientProxy.getClient(s);
			 SyncMaterialEvt  event = new SyncMaterialEvt();
			 event.setAction("12");
			 s.syncMaterial(event);
//			QName qname = new QName("http://model.product.nbc.sitech.com/xsd","action");
//			JAXBElement<String> action = new JAXBElement(qname,String.class,"2");
//			QName qnamepid = new QName("http://model.product.nbc.sitech.com/xsd","PID");
//			JAXBElement<String> pid = new JAXBElement(qnamepid,String.class,"555662");
//			SyncCatalogInfoEvt val = new SyncCatalogInfoEvt();
//			val.setAction(action);
//			val.setPID(pid);
			//s.syncCatalogInfo(val);
			if (client != null) {
	            HTTPConduit conduit = (HTTPConduit) client.getConduit();
	            HTTPClientPolicy policy = new HTTPClientPolicy();
	            policy.setConnectionTimeout(10000);
	            policy.setReceiveTimeout(10000);
	            policy.setAllowChunking(false); 
	            conduit.setClient(policy); 
	        }   
			System.out.println(1);
			}catch(Exception e){
				e.printStackTrace();
			}

	}

}
