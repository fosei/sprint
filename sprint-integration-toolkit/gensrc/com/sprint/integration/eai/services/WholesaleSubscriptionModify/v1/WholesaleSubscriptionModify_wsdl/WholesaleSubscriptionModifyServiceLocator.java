/**
 * WholesaleSubscriptionModifyServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl;

public class WholesaleSubscriptionModifyServiceLocator extends org.apache.axis.client.Service implements com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyService {

    public WholesaleSubscriptionModifyServiceLocator() {
    }


    public WholesaleSubscriptionModifyServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WholesaleSubscriptionModifyServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WholesaleSubscriptionModifyPort
    private java.lang.String WholesaleSubscriptionModifyPort_address = "https://webservicesgateway.sprint.com:444/services/mvno/WholesaleSubscriptionModifyService/v1";

    public java.lang.String getWholesaleSubscriptionModifyPortAddress() {
        return WholesaleSubscriptionModifyPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WholesaleSubscriptionModifyPortWSDDServiceName = "WholesaleSubscriptionModifyPort";

    public java.lang.String getWholesaleSubscriptionModifyPortWSDDServiceName() {
        return WholesaleSubscriptionModifyPortWSDDServiceName;
    }

    public void setWholesaleSubscriptionModifyPortWSDDServiceName(java.lang.String name) {
        WholesaleSubscriptionModifyPortWSDDServiceName = name;
    }

    public com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyPortType getWholesaleSubscriptionModifyPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WholesaleSubscriptionModifyPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWholesaleSubscriptionModifyPort(endpoint);
    }

    public com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyPortType getWholesaleSubscriptionModifyPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyBindingStub _stub = new com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyBindingStub(portAddress, this);
            _stub.setPortName(getWholesaleSubscriptionModifyPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWholesaleSubscriptionModifyPortEndpointAddress(java.lang.String address) {
        WholesaleSubscriptionModifyPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyBindingStub _stub = new com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyBindingStub(new java.net.URL(WholesaleSubscriptionModifyPort_address), this);
                _stub.setPortName(getWholesaleSubscriptionModifyPortWSDDServiceName());
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
        if ("WholesaleSubscriptionModifyPort".equals(inputPortName)) {
            return getWholesaleSubscriptionModifyPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://integration.sprint.com/eai/services/WholesaleSubscriptionModify/v1/WholesaleSubscriptionModify.wsdl", "WholesaleSubscriptionModifyService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://integration.sprint.com/eai/services/WholesaleSubscriptionModify/v1/WholesaleSubscriptionModify.wsdl", "WholesaleSubscriptionModifyPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WholesaleSubscriptionModifyPort".equals(portName)) {
            setWholesaleSubscriptionModifyPortEndpointAddress(address);
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
