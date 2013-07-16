package bing.server;

import javax.jws.WebService;

import bing.bean.FileInfo;
import bing.bean.User;

@WebService
public interface TestService {
   
	//
	public String getTimeInfo(int i);
	
	public String saveFile(FileInfo fileinfo);
	
	public String userlogin(User user);
}
