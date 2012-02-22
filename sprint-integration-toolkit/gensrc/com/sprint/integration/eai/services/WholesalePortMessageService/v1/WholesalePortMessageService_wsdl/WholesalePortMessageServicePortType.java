/**
 * WholesalePortMessageServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesalePortMessageService.v1.WholesalePortMessageService_wsdl;

public interface WholesalePortMessageServicePortType extends java.rmi.Remote {
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.QueryPortMessageResponseType queryPortMessage(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.QueryPortMessageRequestType parameters) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetailsV2_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.ReplyPortOutRequestResponseType replyPortOutRequest(com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.ReplyPortOutRequestType parameters) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetailsV2_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageResponseType resendPortMessage(com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageRequestType parameters) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetailsV2_xsd.ErrorDetailsType;
}
