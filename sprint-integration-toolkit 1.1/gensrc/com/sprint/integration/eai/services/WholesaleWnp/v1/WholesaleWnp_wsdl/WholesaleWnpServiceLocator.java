/**
 * WholesaleWnpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl;

public class WholesaleWnpServiceLocator extends org.apache.axis.client.Service implements com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpService {

    public WholesaleWnpServiceLocator() {
    }


    public WholesaleWnpServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WholesaleWnpServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WholesaleWnpPort
    private java.lang.String WholesaleWnpPort_address = "https://webservicesgateway.sprint.com:444/services/mvno/WholesaleWnpService/v1";

    public java.lang.String getWholesaleWnpPortAddress() {
        return WholesaleWnpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WholesaleWnpPortWSDDServiceName = "WholesaleWnpPort";

    public java.lang.String getWholesaleWnpPortWSDDServiceName() {
        return WholesaleWnpPortWSDDServiceName;
    }

    public void setWholesaleWnpPortWSDDServiceName(java.lang.String name) {
        WholesaleWnpPortWSDDServiceName = name;
    }

    public com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpPortType getWholesaleWnpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WholesaleWnpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWholesaleWnpPort(endpoint);
    }

    public com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpPortType getWholesaleWnpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub _stub = new com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub(portAddress, this);
            _stub.setPortName(getWholesaleWnpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWholesaleWnpPortEndpointAddress(java.lang.String address) {
        WholesaleWnpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub _stub = new com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub(new java.net.URL(WholesaleWnpPort_address), this);
                _stub.setPortName(getWholesaleWnpPortWSDDServiceName());
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
        if ("WholesaleWnpPort".equals(inputPortName)) {
            return getWholesaleWnpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://integration.sprint.com/eai/services/WholesaleWnp/v1/WholesaleWnp.wsdl", "WholesaleWnpService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://integration.sprint.com/eai/services/WholesaleWnp/v1/WholesaleWnp.wsdl", "WholesaleWnpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WholesaleWnpPort".equals(portName)) {
            setWholesaleWnpPortEndpointAddress(address);
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
