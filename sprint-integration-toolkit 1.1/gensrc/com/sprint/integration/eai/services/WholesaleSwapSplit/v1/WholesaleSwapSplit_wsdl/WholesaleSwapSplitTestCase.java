/**
 * WholesaleSwapSplitTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl;

public class WholesaleSwapSplitTestCase extends junit.framework.TestCase {
    public WholesaleSwapSplitTestCase(java.lang.String name) {
        super(name);
    }

    public void testWholesaleSwapSplitPortWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitLocator().getWholesaleSwapSplitPortAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1WholesaleSwapSplitPortSwapEsn() throws Exception {
        com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitLocator().getWholesaleSwapSplitPort();
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
            com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapEsnReply value = null;
            value = binding.swapEsn(new com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapEsnRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test2WholesaleSwapSplitPortSwapMdn() throws Exception {
        com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitLocator().getWholesaleSwapSplitPort();
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
            com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnReply value = null;
            value = binding.swapMdn(new com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test3WholesaleSwapSplitPortSwapMdnWithReserveId() throws Exception {
        com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitLocator().getWholesaleSwapSplitPort();
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
            com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnWithReserveIdReply value = null;
            value = binding.swapMdnWithReserveId(new com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnWithReserveIdRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test4WholesaleSwapSplitPortSwapMsid() throws Exception {
        com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitLocator().getWholesaleSwapSplitPort();
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
            com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMsidReply value = null;
            value = binding.swapMsid(new com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMsidRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test5WholesaleSwapSplitPortSplitNpaMdn() throws Exception {
        com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitLocator().getWholesaleSwapSplitPort();
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
            com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SplitNpaMdnReply value = null;
            value = binding.splitNpaMdn(new com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SplitNpaMdnRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

}
