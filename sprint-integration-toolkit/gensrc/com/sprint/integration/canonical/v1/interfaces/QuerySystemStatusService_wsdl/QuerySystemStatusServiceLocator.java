/**
 * QuerySystemStatusServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl;

public class QuerySystemStatusServiceLocator extends org.apache.axis.client.Service implements com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl.QuerySystemStatusService {

    public QuerySystemStatusServiceLocator() {
    }


    public QuerySystemStatusServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QuerySystemStatusServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for QuerySystemStatusPortType
    private java.lang.String QuerySystemStatusPortType_address = "https://webservicesgatewaytest.sprint.com:444/services/demo/secured/QuerySystemStatusService/v1";

    public java.lang.String getQuerySystemStatusPortTypeAddress() {
        return QuerySystemStatusPortType_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String QuerySystemStatusPortTypeWSDDServiceName = "QuerySystemStatusPortType";

    public java.lang.String getQuerySystemStatusPortTypeWSDDServiceName() {
        return QuerySystemStatusPortTypeWSDDServiceName;
    }

    public void setQuerySystemStatusPortTypeWSDDServiceName(java.lang.String name) {
        QuerySystemStatusPortTypeWSDDServiceName = name;
    }

    public com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl.QuerySystemStatusPortType getQuerySystemStatusPortType() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(QuerySystemStatusPortType_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getQuerySystemStatusPortType(endpoint);
    }

    public com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl.QuerySystemStatusPortType getQuerySystemStatusPortType(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl.QuerySystemStatusSOAPBindingStub _stub = new com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl.QuerySystemStatusSOAPBindingStub(portAddress, this);
            _stub.setPortName(getQuerySystemStatusPortTypeWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setQuerySystemStatusPortTypeEndpointAddress(java.lang.String address) {
        QuerySystemStatusPortType_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl.QuerySystemStatusPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl.QuerySystemStatusSOAPBindingStub _stub = new com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl.QuerySystemStatusSOAPBindingStub(new java.net.URL(QuerySystemStatusPortType_address), this);
                _stub.setPortName(getQuerySystemStatusPortTypeWSDDServiceName());
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
        if ("QuerySystemStatusPortType".equals(inputPortName)) {
            return getQuerySystemStatusPortType();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://integration.sprint.com/canonical/v1/interfaces/QuerySystemStatusService.wsdl", "QuerySystemStatusService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://integration.sprint.com/canonical/v1/interfaces/QuerySystemStatusService.wsdl", "QuerySystemStatusPortType"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("QuerySystemStatusPortType".equals(portName)) {
            setQuerySystemStatusPortTypeEndpointAddress(address);
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
