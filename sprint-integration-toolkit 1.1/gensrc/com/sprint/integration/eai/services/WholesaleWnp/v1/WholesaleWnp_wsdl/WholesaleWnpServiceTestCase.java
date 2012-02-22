/**
 * WholesaleWnpServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl;

public class WholesaleWnpServiceTestCase extends junit.framework.TestCase {
    public WholesaleWnpServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testWholesaleWnpPortWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpServiceLocator().getWholesaleWnpPortAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1WholesaleWnpPortChangePortInDueDateTime() throws Exception {
        com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub)
                          new com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpServiceLocator().getWholesaleWnpPort();
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
            com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ChangePortInDueDateTimeReply value = null;
            value = binding.changePortInDueDateTime(new com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ChangePortInDueDateTimeRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test2WholesaleWnpPortModifyPortIn() throws Exception {
        com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub)
                          new com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpServiceLocator().getWholesaleWnpPort();
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
            com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ModifyPortInReply value = null;
            value = binding.modifyPortIn(new com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ModifyPortInRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test3WholesaleWnpPortCancelPort() throws Exception {
        com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub)
                          new com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpServiceLocator().getWholesaleWnpPort();
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
            com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.CancelPortReply value = null;
            value = binding.cancelPort(new com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.CancelPortRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test4WholesaleWnpPortActivateSubscriptionWithPortIn() throws Exception {
        com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub)
                          new com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpServiceLocator().getWholesaleWnpPort();
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
            com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ActivateSubscriptionWithPortInReply value = null;
            value = binding.activateSubscriptionWithPortIn(new com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ActivateSubscriptionWithPortInRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test5WholesaleWnpPortPortInSwapMdn() throws Exception {
        com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub)
                          new com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpServiceLocator().getWholesaleWnpPort();
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
            com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortInSwapMdnReply value = null;
            value = binding.portInSwapMdn(new com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortInSwapMdnRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test6WholesaleWnpPortPreValidatePort() throws Exception {
        com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub)
                          new com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpServiceLocator().getWholesaleWnpPort();
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
            com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PreValidatePortReply value = null;
            value = binding.preValidatePort(new com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PreValidatePortRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test7WholesaleWnpPortQueryPendingResellerPortIns() throws Exception {
        com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub)
                          new com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpServiceLocator().getWholesaleWnpPort();
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
            com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.QueryPendingResellerPortInsReply value = null;
            value = binding.queryPendingResellerPortIns(new com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.QueryPendingResellerPortInsRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

}
