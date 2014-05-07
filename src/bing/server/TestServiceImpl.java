package bing.server;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

import bing.bean.FileInfo;
import bing.bean.User;

import com.guba.mogilefs.MogileFS;
import com.guba.mogilefs.SimpleMogileFSImpl;

@WebService(endpointInterface = "bing.server.TestService", serviceName = "TestService")
public class TestServiceImpl implements TestService {

	//简单测试配置cxf 
	@Override
	public String getTimeInfo(int i) {
		Date date = new Date();
		String formater = "yyyy-MM-dd HH:mm:ss";
		switch (i) {
		case 1:
			formater = "yyyy#MM#dd HH@mm@ss";
			break;
		case 2:	
			formater = "yyyy_MM_dd HH*mm*ss";
			break;
		default: 	
			formater = "yyyy-MM-dd HH:mm:ss";
			break;
		}
		SimpleDateFormat s  = new SimpleDateFormat(formater);
		return s.format(date);
	}

	//cxf 上传文件 到分布式文件系统中 返回一个文件路径
	@Override
	public String saveFile(FileInfo fileinfo) {
		try{
		    File file = new File("E://"+fileinfo.getFileName());
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(fileinfo.getFile());
			fos.close();
			MogileFS fs = new SimpleMogileFSImpl("testdomain", new String[] {"192.168.2.114:7001"});
			fs.storeFile(fileinfo.getFileName(), "testclass",file); // key  class
			System.out.println("store ok");
		}catch(Exception e){
		   e.printStackTrace();	
		}
		return null;
	}

	@Override
	public String userlogin(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
