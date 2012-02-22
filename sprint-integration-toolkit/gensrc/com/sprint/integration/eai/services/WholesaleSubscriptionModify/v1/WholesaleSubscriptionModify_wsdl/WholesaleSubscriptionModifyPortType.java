/**
 * WholesaleSubscriptionModifyPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl;

public interface WholesaleSubscriptionModifyPortType extends java.rmi.Remote {
    public com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ConfirmMsg changeServicePlans(com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ChangeServicePlansRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ConfirmMsg expireSubscription(com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ExpireSubscriptionRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ConfirmMsg restoreSubscription(com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.RestoreSubscriptionRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ConfirmMsg suspendSubscription(com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.SuspendSubscriptionRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
}
