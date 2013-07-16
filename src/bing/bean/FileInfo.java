package bing.bean;

import java.io.Serializable;

public class FileInfo implements Serializable{
  
	/**
	 * 
	 */
	private static final long serialVersionUID = -5661830049369560368L;

	private String fileName;
	
	private byte[] file;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}
	
	
	
}
