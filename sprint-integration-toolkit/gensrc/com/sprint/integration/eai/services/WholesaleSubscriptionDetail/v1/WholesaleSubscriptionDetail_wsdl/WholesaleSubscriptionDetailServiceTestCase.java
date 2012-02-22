/**
 * WholesaleSubscriptionDetailServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl;

public class WholesaleSubscriptionDetailServiceTestCase extends junit.framework.TestCase {
    public WholesaleSubscriptionDetailServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testWholesaleSubscriptionDetailPortWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailServiceLocator().getWholesaleSubscriptionDetailPortAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1WholesaleSubscriptionDetailPortQueryPpSocList() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailServiceLocator().getWholesaleSubscriptionDetailPort();
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
            com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryPpSocListReply value = null;
            value = binding.queryPpSocList(new com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryPpSocListRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test2WholesaleSubscriptionDetailPortQuerySubscription() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailServiceLocator().getWholesaleSubscriptionDetailPort();
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
            com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QuerySubscriptionReply value = null;
            value = binding.querySubscription(new com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QuerySubscriptionRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test3WholesaleSubscriptionDetailPortQueryReservedSubscription() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailServiceLocator().getWholesaleSubscriptionDetailPort();
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
            com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryReservedSubscriptionReply value = null;
            value = binding.queryReservedSubscription(new com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryReservedSubscriptionRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test4WholesaleSubscriptionDetailPortQueryValidNpaList() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailServiceLocator().getWholesaleSubscriptionDetailPort();
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
            com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryValidNpaListReply value = null;
            value = binding.queryValidNpaList(new com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryValidNpaListRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test5WholesaleSubscriptionDetailPortQueryCsaList() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailServiceLocator().getWholesaleSubscriptionDetailPort();
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
            com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryCsaListReply value = null;
            value = binding.queryCsaList(new java.lang.String());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

}
