package com.ait.com.soap.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "CXFFristService", targetNamespace = "http://service.soap.com.ait.com/")
public interface CXFFristService {

	/**
	 * 
	 * @param name
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "sayHello", targetNamespace = "http://service.soap.com.ait.com/", className = "com.ait.com.soap.service.SayHello")
	@ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://service.soap.com.ait.com/", className = "com.ait.com.soap.service.SayHelloResponse")
	public String sayHello(
			@WebParam(name = "name", targetNamespace = "") String name);

}
