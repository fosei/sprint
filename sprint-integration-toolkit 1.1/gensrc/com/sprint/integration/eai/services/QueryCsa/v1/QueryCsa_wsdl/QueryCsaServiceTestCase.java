/**
 * QueryCsaServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl;

public class QueryCsaServiceTestCase extends junit.framework.TestCase {
    public QueryCsaServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testQueryCsaPortWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl.QueryCsaServiceLocator().getQueryCsaPortAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl.QueryCsaServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1QueryCsaPortQueryCsa() throws Exception {
        com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl.QueryCsaBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl.QueryCsaBindingStub)
                          new com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl.QueryCsaServiceLocator().getQueryCsaPort();
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
            com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.QueryCsaReply value = null;
            value = binding.queryCsa(new com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.QueryCsaRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

}
