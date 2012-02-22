/**
 * WholesalePortMessageServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesalePortMessageService.v1.WholesalePortMessageService_wsdl;

public class WholesalePortMessageServiceTestCase extends junit.framework.TestCase {
    public WholesalePortMessageServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testSendPortMessagePortTypeWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.sprint.integration.eai.services.WholesalePortMessageService.v1.WholesalePortMessageService_wsdl.WholesalePortMessageServiceLocator().getSendPortMessagePortTypeAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.sprint.integration.eai.services.WholesalePortMessageService.v1.WholesalePortMessageService_wsdl.WholesalePortMessageServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1SendPortMessagePortTypeQueryPortMessage() throws Exception {
        com.sprint.integration.eai.services.WholesalePortMessageService.v1.WholesalePortMessageService_wsdl.WholesalePortMessageServiceBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesalePortMessageService.v1.WholesalePortMessageService_wsdl.WholesalePortMessageServiceBindingStub)
                          new com.sprint.integration.eai.services.WholesalePortMessageService.v1.WholesalePortMessageService_wsdl.WholesalePortMessageServiceLocator().getSendPortMessagePortType();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.QueryPortMessageResponseType value = null;
            value = binding.queryPortMessage(new com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.QueryPortMessageRequestType());
        }
        catch (com.sprint.integration.common.ErrorDetailsV2_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test2SendPortMessagePortTypeReplyPortOutRequest() throws Exception {
        com.sprint.integration.eai.services.WholesalePortMessageService.v1.WholesalePortMessageService_wsdl.WholesalePortMessageServiceBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesalePortMessageService.v1.WholesalePortMessageService_wsdl.WholesalePortMessageServiceBindingStub)
                          new com.sprint.integration.eai.services.WholesalePortMessageService.v1.WholesalePortMessageService_wsdl.WholesalePortMessageServiceLocator().getSendPortMessagePortType();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.ReplyPortOutRequestResponseType value = null;
            value = binding.replyPortOutRequest(new com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.ReplyPortOutRequestType());
        }
        catch (com.sprint.integration.common.ErrorDetailsV2_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test3SendPortMessagePortTypeResendPortMessage() throws Exception {
        com.sprint.integration.eai.services.WholesalePortMessageService.v1.WholesalePortMessageService_wsdl.WholesalePortMessageServiceBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesalePortMessageService.v1.WholesalePortMessageService_wsdl.WholesalePortMessageServiceBindingStub)
                          new com.sprint.integration.eai.services.WholesalePortMessageService.v1.WholesalePortMessageService_wsdl.WholesalePortMessageServiceLocator().getSendPortMessagePortType();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageResponseType value = null;
            value = binding.resendPortMessage(new com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageRequestType());
        }
        catch (com.sprint.integration.common.ErrorDetailsV2_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

}
