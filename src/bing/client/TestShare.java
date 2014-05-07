package bing.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import cn.com.karakal.tyqk.ws.ManualSendProductDataServiceBean;
import cn.com.karakal.tyqk.ws.ReceiveTyqkDataService;
import cn.com.karakal.tyqk.ws.Response;
import cn.com.karakal.tyqk.ws.SyncCrbtDeployResultEvt;

public class TestShare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestShare t = new TestShare();
		t.rePushData();
	}

	public void rePushData(){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress("http://localhost:18080/tyqk_serverEJB2/ManualSendProductDataService/ManualSendProductDataServiceBean?wsdl");
		//factory.setAddress("http://10.25.182.27:18099/tyqk_serverEJB/ManualSendProductDataService/ManualSendProductDataServiceBean?wsdl");
		//factory.setAddress("http://10.25.182.19:18088/tyqk_serverEJB/ManualSendProductDataService/ManualSendProductDataServiceBean?wsdl");
		//type0 彩铃 1 振全随 2 成功率  3 编目 4 素材 5 标签模板 6 标签 7 数字专辑 8 互联网试听产品  9 素材2 10 编目2 
		factory.setServiceClass(ManualSendProductDataServiceBean.class); 
		ManualSendProductDataServiceBean msd = (ManualSendProductDataServiceBean) factory.create();
		List<String> site = new ArrayList<String>();
		site.add("nlpt");
		List<String> dataTypes = new ArrayList<String>();
		dataTypes.add("ff8080813fbe908201402fd9bf5d211e");
		msd.manualSendProductData(7, site, dataTypes);
		//msd.batchAppendSend("2013-12-12", "2013-10-30", site, dataTypes);
		System.out.println(1);
	}
	
	//补发
	public void sendData(){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress("http://10.25.182.15:18088/tyqk_serverEJB/ManualSendProductDataService/ManualSendProductDataServiceBean?wsdl");
		factory.setServiceClass(ManualSendProductDataServiceBean.class); 
		ManualSendProductDataServiceBean msd = (ManualSendProductDataServiceBean) factory.create();
	    List<String> site = new ArrayList<String>();
	    site.add("ivr");
	    site.add("mgac");
	    List<String> ids = new ArrayList<String>();  //00000000424b057a01425476a7d47932
	    ids.add("00000000424b057a01425476a7d47930");
//	    ids.add("00000000424b057a0142558c0ed7182a");
//	    ids.add("00000000424b057a0142558c0c99181c");
//	    ids.add("00000000424b057a0142558c0e2e1823");
//	    ids.add("00000000424b057a0142558c0ec31827");
//	    ids.add("00000000424b057a0142558c10da183e");
//	    ids.add("00000000424b057a0142558c113b1847");
//	    ids.add("00000000424b057a0142558c1156184e");
//	    ids.add("00000000424b057a0142558c0c4f1816");
//	    ids.add("00000000424b057a0142558c0ee0182e");
//	    ids.add("00000000424b057a0142558c0f651833");
//	    ids.add("00000000424b057a0142558c105b1837");
//	    ids.add("00000000424b057a0142558c10d5183b");
//	    ids.add("00000000424b057a0142558c12611857");
//	    ids.add("00000000424b057a0142558c0c351810");
     	msd.manualSendProductData(4,site,ids);
	    System.out.println("ok");
	}
	
	public void test(){
		String[] ss = new String[] {"云南","重庆","山西","安徽","河北","黑龙江","湖南","湖北","辽宁","宁夏","上海","新疆","陕西","广东","河南","北京","内蒙古","广西","天津","甘肃","四川","吉林","江苏","海南","青海","贵州"};
		//String[] fail = new String[] {"浙江","西藏","福建","12530999","统一曲库","江西","山东"};
		String[] fail = new String[] {"浙江","西藏","福建","12530999","统一曲库22","江西","山东"};
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		//factory.setAddress("http://localhost:8080/tyqk_serverEJB2/ManualSendProductDataService/ManualSendProductDataServiceBean?wsdl");
		//factory.setAddress("http://10.25.182.27:18099/tyqk_serverEJB/ManualSendProductDataService/ManualSendProductDataServiceBean?wsdl");
		factory.setAddress("http://211.137.107.18/services/ReceiveTyqkDataService?wsdl");
		 
		factory.setServiceClass(ReceiveTyqkDataService.class); 
		ReceiveTyqkDataService msd = (ReceiveTyqkDataService) factory.create();
//		List<String> site = new ArrayList<String>();
//		site.add("qzcl");
//		List<Integer> dataTypes = new ArrayList<Integer>();
//		dataTypes.add(1);
		SyncCrbtDeployResultEvt event = new SyncCrbtDeployResultEvt();
		event.setAccessPlatformID("0001102");
		event.setEventInfo("新增");
		event.setKey("3a250eae0a90ef873a0b60c76c125a7c");
		event.setPID("6000013");
		event.setRole("000");
		event.setRoleCode("000");
		event.setSEQ("60000132013100923144399999999");
		event.setSuccessRate("81.25%");
		event.setToneID("600907000001322422");
		event.setTransactionID("81282420");
		event.getFailProvinceName().addAll(Arrays.asList(fail));
		event.getSuccessProvinceName().addAll(Arrays.asList(ss));
		Response rps = msd.syncCrbtDeployResult(event);
		System.out.println(rps.getReturnCode());
		System.out.println(rps.getDescription());
		System.out.println(1);
		
		
	}
	
}
