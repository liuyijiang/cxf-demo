package cn.com.karakal.tyqk.ws;

public class ReceiveTyqkDataServiceProxy implements cn.com.karakal.tyqk.ws.ReceiveTyqkDataService {
  private String _endpoint = null;
  private cn.com.karakal.tyqk.ws.ReceiveTyqkDataService receiveTyqkDataService = null;
  
  public ReceiveTyqkDataServiceProxy() {
    _initReceiveTyqkDataServiceProxy();
  }
  
  public ReceiveTyqkDataServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initReceiveTyqkDataServiceProxy();
  }
  
  private void _initReceiveTyqkDataServiceProxy() {
    try {
      receiveTyqkDataService = (new cn.com.karakal.tyqk.ws.ReceiveTyqkDataServiceBeanLocator()).getReceiveTyqkDataServicePort();
      if (receiveTyqkDataService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)receiveTyqkDataService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)receiveTyqkDataService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (receiveTyqkDataService != null)
      ((javax.xml.rpc.Stub)receiveTyqkDataService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.com.karakal.tyqk.ws.ReceiveTyqkDataService getReceiveTyqkDataService() {
    if (receiveTyqkDataService == null)
      _initReceiveTyqkDataServiceProxy();
    return receiveTyqkDataService;
  }
  
  public cn.com.karakal.tyqk.ws.Response syncCrbtProduct(cn.com.karakal.tyqk.ws.SyncCrbtProductEvt arg0) throws java.rmi.RemoteException{
    if (receiveTyqkDataService == null)
      _initReceiveTyqkDataServiceProxy();
    return receiveTyqkDataService.syncCrbtProduct(arg0);
  }
  
  public cn.com.karakal.tyqk.ws.Response syncCrbtDeployResult(cn.com.karakal.tyqk.ws.SyncCrbtDeployResultEvt arg0) throws java.rmi.RemoteException{
    if (receiveTyqkDataService == null)
      _initReceiveTyqkDataServiceProxy();
    return receiveTyqkDataService.syncCrbtDeployResult(arg0);
  }
  
  
}