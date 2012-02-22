/**
 * WholesaleSubscriptionServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl;

public class WholesaleSubscriptionServiceTestCase extends junit.framework.TestCase {
    public WholesaleSubscriptionServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testWholesaleSubscriptionPortWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionServiceLocator().getWholesaleSubscriptionPortAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1WholesaleSubscriptionPortActivatePendingSubscription() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionServiceLocator().getWholesaleSubscriptionPort();
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
            com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivatePendingSubscriptionReply value = null;
            value = binding.activatePendingSubscription(new com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivatePendingSubscriptionRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test2WholesaleSubscriptionPortActivateSubscriptionMsid() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionServiceLocator().getWholesaleSubscriptionPort();
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
            com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionMsidReply value = null;
            value = binding.activateSubscriptionMsid(new com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionMsidRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test3WholesaleSubscriptionPortActivateSubscriptionNpa() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionServiceLocator().getWholesaleSubscriptionPort();
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
            com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionNpaReply value = null;
            value = binding.activateSubscriptionNpa(new com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionNpaRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test4WholesaleSubscriptionPortActivateSubscriptionNpaWithRsvId() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionServiceLocator().getWholesaleSubscriptionPort();
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
            com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionNpaWithRsvIdReply value = null;
            value = binding.activateSubscriptionNpaWithRsvId(new com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionNpaWithRsvIdRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test5WholesaleSubscriptionPortActivateSubscription() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionServiceLocator().getWholesaleSubscriptionPort();
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
            com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionReply value = null;
            value = binding.activateSubscription(new com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test6WholesaleSubscriptionPortActivateSubscriptionWithRsvId() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionServiceLocator().getWholesaleSubscriptionPort();
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
            com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionWithRsvIdReply value = null;
            value = binding.activateSubscriptionWithRsvId(new com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionWithRsvIdRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test7WholesaleSubscriptionPortReserveSubscription() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionServiceLocator().getWholesaleSubscriptionPort();
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
            com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionReply value = null;
            value = binding.reserveSubscription(new com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test8WholesaleSubscriptionPortReserveSubscriptionGeoCode() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionServiceLocator().getWholesaleSubscriptionPort();
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
            com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionGeoCodeReply value = null;
            value = binding.reserveSubscriptionGeoCode(new com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionGeoCodeRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test9WholesaleSubscriptionPortReserveSubscriptionGeoCodeNpa() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionServiceLocator().getWholesaleSubscriptionPort();
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
            com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionGeoCodeNpaReply value = null;
            value = binding.reserveSubscriptionGeoCodeNpa(new com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionGeoCodeNpaRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test10WholesaleSubscriptionPortReserveSubscriptionNpa() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionServiceLocator().getWholesaleSubscriptionPort();
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
            com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionNpaReply value = null;
            value = binding.reserveSubscriptionNpa(new com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionNpaRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test11WholesaleSubscriptionPortReserveSubscriptionWithRsvId() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionServiceLocator().getWholesaleSubscriptionPort();
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
            com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionWithRsvIdReply value = null;
            value = binding.reserveSubscriptionWithRsvId(new com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionWithRsvIdRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

}
