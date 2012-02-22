/**
 * WholesaleUsageInquiryPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleUsageInquiry.v1.WholesaleUsageInquiry_wsdl;

public interface WholesaleUsageInquiryPortType extends java.rmi.Remote {
    public com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.QuerySubscriptionUsageReply querySubscriptionUsage(com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.QuerySubscriptionUsageRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
}
