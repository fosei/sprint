/**
 * WholesaleUsageInquiryServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleUsageInquiry.v1.WholesaleUsageInquiry_wsdl;

public class WholesaleUsageInquiryServiceTestCase extends junit.framework.TestCase {
    public WholesaleUsageInquiryServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testWholesaleUsageInquiryPortWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.sprint.integration.eai.services.WholesaleUsageInquiry.v1.WholesaleUsageInquiry_wsdl.WholesaleUsageInquiryServiceLocator().getWholesaleUsageInquiryPortAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.sprint.integration.eai.services.WholesaleUsageInquiry.v1.WholesaleUsageInquiry_wsdl.WholesaleUsageInquiryServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1WholesaleUsageInquiryPortQuerySubscriptionUsage() throws Exception {
        com.sprint.integration.eai.services.WholesaleUsageInquiry.v1.WholesaleUsageInquiry_wsdl.WholesaleUsageInquiryBindingStub binding;
        try {
            binding = (com.sprint.integration.eai.services.WholesaleUsageInquiry.v1.WholesaleUsageInquiry_wsdl.WholesaleUsageInquiryBindingStub)
                          new com.sprint.integration.eai.services.WholesaleUsageInquiry.v1.WholesaleUsageInquiry_wsdl.WholesaleUsageInquiryServiceLocator().getWholesaleUsageInquiryPort();
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
            com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.QuerySubscriptionUsageReply value = null;
            value = binding.querySubscriptionUsage(new com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.QuerySubscriptionUsageRequest());
        }
        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
            throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
        }
            // TBD - validate results
    }

}
