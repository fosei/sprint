/**
 * WholesaleSubscriptionDetailServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl;

public class WholesaleSubscriptionDetailServiceLocator extends org.apache.axis.client.Service implements com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailService {

    public WholesaleSubscriptionDetailServiceLocator() {
    }


    public WholesaleSubscriptionDetailServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WholesaleSubscriptionDetailServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WholesaleSubscriptionDetailPort
    private java.lang.String WholesaleSubscriptionDetailPort_address = "https://webservicesgateway.sprint.com:444/services/mvno/WholesaleSubscriptionDetailService/v1";

    public java.lang.String getWholesaleSubscriptionDetailPortAddress() {
        return WholesaleSubscriptionDetailPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WholesaleSubscriptionDetailPortWSDDServiceName = "WholesaleSubscriptionDetailPort";

    public java.lang.String getWholesaleSubscriptionDetailPortWSDDServiceName() {
        return WholesaleSubscriptionDetailPortWSDDServiceName;
    }

    public void setWholesaleSubscriptionDetailPortWSDDServiceName(java.lang.String name) {
        WholesaleSubscriptionDetailPortWSDDServiceName = name;
    }

    public com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailPortType getWholesaleSubscriptionDetailPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WholesaleSubscriptionDetailPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWholesaleSubscriptionDetailPort(endpoint);
    }

    public com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailPortType getWholesaleSubscriptionDetailPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub _stub = new com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub(portAddress, this);
            _stub.setPortName(getWholesaleSubscriptionDetailPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWholesaleSubscriptionDetailPortEndpointAddress(java.lang.String address) {
        WholesaleSubscriptionDetailPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub _stub = new com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub(new java.net.URL(WholesaleSubscriptionDetailPort_address), this);
                _stub.setPortName(getWholesaleSubscriptionDetailPortWSDDServiceName());
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
        if ("WholesaleSubscriptionDetailPort".equals(inputPortName)) {
            return getWholesaleSubscriptionDetailPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://integration.sprint.com/eai/services/WholesaleSubscriptionDetail/v1/WholesaleSubscriptionDetail.wsdl", "WholesaleSubscriptionDetailService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://integration.sprint.com/eai/services/WholesaleSubscriptionDetail/v1/WholesaleSubscriptionDetail.wsdl", "WholesaleSubscriptionDetailPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WholesaleSubscriptionDetailPort".equals(portName)) {
            setWholesaleSubscriptionDetailPortEndpointAddress(address);
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
