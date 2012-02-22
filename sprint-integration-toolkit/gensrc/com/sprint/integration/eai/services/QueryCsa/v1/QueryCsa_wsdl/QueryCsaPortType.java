/**
 * QueryCsaPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl;

public interface QueryCsaPortType extends java.rmi.Remote {
    public com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.QueryCsaReply queryCsa(com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.QueryCsaRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
}
