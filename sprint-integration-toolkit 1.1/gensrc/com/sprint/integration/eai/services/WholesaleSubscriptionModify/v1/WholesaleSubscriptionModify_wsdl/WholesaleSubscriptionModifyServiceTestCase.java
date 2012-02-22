/**
 * WholesaleSubscriptionModifyServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl;

public class WholesaleSubscriptionModifyServiceTestCase extends junit.framework.TestCase {
    public WholesaleSubscriptionModifyServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testWholesaleSubscriptionModifyPortWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyServiceLocator().getWholesaleSubscriptionModifyPortAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1WholesaleSubscriptionModifyPortChangeServicePlans() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyServiceLocator().getWholesaleSubscriptionModifyPort();
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
            com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ConfirmMsg value = null;
            value = binding.changeServicePlans(new com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ChangeServicePlansRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test2WholesaleSubscriptionModifyPortExpireSubscription() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyServiceLocator().getWholesaleSubscriptionModifyPort();
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
            com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ConfirmMsg value = null;
            value = binding.expireSubscription(new com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ExpireSubscriptionRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test3WholesaleSubscriptionModifyPortRestoreSubscription() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyServiceLocator().getWholesaleSubscriptionModifyPort();
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
            com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ConfirmMsg value = null;
            value = binding.restoreSubscription(new com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.RestoreSubscriptionRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test4WholesaleSubscriptionModifyPortSuspendSubscription() throws Exception {
        com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyBindingStub)
                          new com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyServiceLocator().getWholesaleSubscriptionModifyPort();
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
            com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ConfirmMsg value = null;
            value = binding.suspendSubscription(new com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.SuspendSubscriptionRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

}
