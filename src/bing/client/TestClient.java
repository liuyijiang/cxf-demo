package bing.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import bing.bean.FileInfo;
import bing.server.TestService;
import bing.tool.File2ByteArray;

public class TestClient {
  
	//http://211.137.107.18:18080/services/ReceiveTyqkDataService?wsdl
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestClient t = new TestClient();
		t.testSaveFile();
	}

	public void testSaveFile(){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress("http://localhost:8080/cxf-test-web/ws/testService?wsdl");
		factory.setServiceClass(TestService.class); 
		TestService s = (TestService) factory.create();
		FileInfo f = new FileInfo();
		f.setFileName("userheader.png");
		f.setFile(File2ByteArray.file2ByteArray("E://userheader.png"));
		s.saveFile(f);
	}
	
	//ssl 
	public void testUserLogin(){
		
	}
	
}
