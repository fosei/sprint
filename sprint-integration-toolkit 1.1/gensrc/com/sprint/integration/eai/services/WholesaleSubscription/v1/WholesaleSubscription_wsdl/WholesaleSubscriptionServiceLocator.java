/**
 * WholesaleSubscriptionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl;

public class WholesaleSubscriptionServiceLocator extends org.apache.axis.client.Service implements com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionService {

    public WholesaleSubscriptionServiceLocator() {
    }


    public WholesaleSubscriptionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WholesaleSubscriptionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WholesaleSubscriptionPort
    private java.lang.String WholesaleSubscriptionPort_address = "https://webservicesgateway.sprint.com:444/services/mvno/WholesaleSubscriptionService/v1";

    public java.lang.String getWholesaleSubscriptionPortAddress() {
        return WholesaleSubscriptionPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WholesaleSubscriptionPortWSDDServiceName = "WholesaleSubscriptionPort";

    public java.lang.String getWholesaleSubscriptionPortWSDDServiceName() {
        return WholesaleSubscriptionPortWSDDServiceName;
    }

    public void setWholesaleSubscriptionPortWSDDServiceName(java.lang.String name) {
        WholesaleSubscriptionPortWSDDServiceName = name;
    }

    public com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionPortType getWholesaleSubscriptionPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WholesaleSubscriptionPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWholesaleSubscriptionPort(endpoint);
    }

    public com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionPortType getWholesaleSubscriptionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub _stub = new com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub(portAddress, this);
            _stub.setPortName(getWholesaleSubscriptionPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWholesaleSubscriptionPortEndpointAddress(java.lang.String address) {
        WholesaleSubscriptionPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub _stub = new com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub(new java.net.URL(WholesaleSubscriptionPort_address), this);
                _stub.setPortName(getWholesaleSubscriptionPortWSDDServiceName());
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
        if ("WholesaleSubscriptionPort".equals(inputPortName)) {
            return getWholesaleSubscriptionPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://integration.sprint.com/eai/services/WholesaleSubscription/v1/WholesaleSubscription.wsdl", "WholesaleSubscriptionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://integration.sprint.com/eai/services/WholesaleSubscription/v1/WholesaleSubscription.wsdl", "WholesaleSubscriptionPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WholesaleSubscriptionPort".equals(portName)) {
            setWholesaleSubscriptionPortEndpointAddress(address);
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
