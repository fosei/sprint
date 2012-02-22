/**
 * QuerySystemStatusServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl;

public class QuerySystemStatusServiceTestCase extends junit.framework.TestCase {
    public QuerySystemStatusServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testQuerySystemStatusPortTypeWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl.QuerySystemStatusServiceLocator().getQuerySystemStatusPortTypeAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl.QuerySystemStatusServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1QuerySystemStatusPortTypePing() throws Exception {
        com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl.QuerySystemStatusSOAPBindingStub binding;
        try {
            binding = (com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl.QuerySystemStatusSOAPBindingStub)
                          new com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl.QuerySystemStatusServiceLocator().getQuerySystemStatusPortType();
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
        com.sprint.integration.canonical.v1.interfaces.PingResponse_xsd.PingResponseType value = null;
        value = binding.ping(new com.sprint.integration.canonical.v1.interfaces.PingRequest_xsd.PingRequestType());
        // TBD - validate results
    }

}
