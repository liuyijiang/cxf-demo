package bing.client;

import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.ait.com.soap.service.impl.CXFFristService;

public class TestMyClientCall {
	
   public static void main(String[] args) {
	   TestMyClientCall t = new TestMyClientCall();
	   t.rePushData();
   }
   
   public void rePushData(){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		//factory.setAddress("http://localhost:8080/tyqk_serverEJB2/ManualSendProductDataService/ManualSendProductDataServiceBean?wsdl");
		//factory.setAddress("http://10.25.182.27:18099/tyqk_serverEJB/ManualSendProductDataService/ManualSendProductDataServiceBean?wsdl");
		factory.setAddress("http://localhost:8080/CXF_Service/rest/CXFFristService?wsdl");
		factory.setServiceClass(CXFFristService.class); 
		CXFFristService msd = (CXFFristService) factory.create();
		System.out.println(msd.sayHello("liuyijiang"));
		System.out.println(1);
	}
   
}
