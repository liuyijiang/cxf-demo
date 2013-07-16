/**
 * ReceiveTyqkDataServiceBeanLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.karakal.tyqk.ws;

public class ReceiveTyqkDataServiceBeanLocator extends org.apache.axis.client.Service implements cn.com.karakal.tyqk.ws.ReceiveTyqkDataServiceBean {

    public ReceiveTyqkDataServiceBeanLocator() {
    }


    public ReceiveTyqkDataServiceBeanLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReceiveTyqkDataServiceBeanLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReceiveTyqkDataServicePort
    private java.lang.String ReceiveTyqkDataServicePort_address = "http://211.137.107.18:18080/services/ReceiveTyqkDataService";

    public java.lang.String getReceiveTyqkDataServicePortAddress() {
        return ReceiveTyqkDataServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReceiveTyqkDataServicePortWSDDServiceName = "ReceiveTyqkDataServicePort";

    public java.lang.String getReceiveTyqkDataServicePortWSDDServiceName() {
        return ReceiveTyqkDataServicePortWSDDServiceName;
    }

    public void setReceiveTyqkDataServicePortWSDDServiceName(java.lang.String name) {
        ReceiveTyqkDataServicePortWSDDServiceName = name;
    }

    public cn.com.karakal.tyqk.ws.ReceiveTyqkDataService getReceiveTyqkDataServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReceiveTyqkDataServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReceiveTyqkDataServicePort(endpoint);
    }

    public cn.com.karakal.tyqk.ws.ReceiveTyqkDataService getReceiveTyqkDataServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.com.karakal.tyqk.ws.ReceiveTyqkDataServicePortSoapBindingStub _stub = new cn.com.karakal.tyqk.ws.ReceiveTyqkDataServicePortSoapBindingStub(portAddress, this);
            _stub.setPortName(getReceiveTyqkDataServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReceiveTyqkDataServicePortEndpointAddress(java.lang.String address) {
        ReceiveTyqkDataServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.com.karakal.tyqk.ws.ReceiveTyqkDataService.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.com.karakal.tyqk.ws.ReceiveTyqkDataServicePortSoapBindingStub _stub = new cn.com.karakal.tyqk.ws.ReceiveTyqkDataServicePortSoapBindingStub(new java.net.URL(ReceiveTyqkDataServicePort_address), this);
                _stub.setPortName(getReceiveTyqkDataServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ReceiveTyqkDataServicePort".equals(inputPortName)) {
            return getReceiveTyqkDataServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.tyqk.karakal.com.cn", "ReceiveTyqkDataServiceBean");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.tyqk.karakal.com.cn", "ReceiveTyqkDataServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReceiveTyqkDataServicePort".equals(portName)) {
            setReceiveTyqkDataServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
