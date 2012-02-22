/**
 * QueryCsaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl;

public class QueryCsaServiceLocator extends org.apache.axis.client.Service implements com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl.QueryCsaService {

    public QueryCsaServiceLocator() {
    }


    public QueryCsaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QueryCsaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for QueryCsaPort
    private java.lang.String QueryCsaPort_address = "https://webservicesgateway.sprint.com:444/services/mvno/QueryCsaService/v1";

    public java.lang.String getQueryCsaPortAddress() {
        return QueryCsaPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String QueryCsaPortWSDDServiceName = "QueryCsaPort";

    public java.lang.String getQueryCsaPortWSDDServiceName() {
        return QueryCsaPortWSDDServiceName;
    }

    public void setQueryCsaPortWSDDServiceName(java.lang.String name) {
        QueryCsaPortWSDDServiceName = name;
    }

    public com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl.QueryCsaPortType getQueryCsaPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(QueryCsaPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getQueryCsaPort(endpoint);
    }

    public com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl.QueryCsaPortType getQueryCsaPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl.QueryCsaBindingStub _stub = new com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl.QueryCsaBindingStub(portAddress, this);
            _stub.setPortName(getQueryCsaPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setQueryCsaPortEndpointAddress(java.lang.String address) {
        QueryCsaPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl.QueryCsaPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl.QueryCsaBindingStub _stub = new com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl.QueryCsaBindingStub(new java.net.URL(QueryCsaPort_address), this);
                _stub.setPortName(getQueryCsaPortWSDDServiceName());
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
        if ("QueryCsaPort".equals(inputPortName)) {
            return getQueryCsaPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://integration.sprint.com/eai/services/QueryCsa/v1/QueryCsa.wsdl", "QueryCsaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://integration.sprint.com/eai/services/QueryCsa/v1/QueryCsa.wsdl", "QueryCsaPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("QueryCsaPort".equals(portName)) {
            setQueryCsaPortEndpointAddress(address);
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
