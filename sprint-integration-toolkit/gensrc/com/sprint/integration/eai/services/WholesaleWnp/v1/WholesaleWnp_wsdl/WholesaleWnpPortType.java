/**
 * WholesaleWnpPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl;

public interface WholesaleWnpPortType extends java.rmi.Remote {
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ChangePortInDueDateTimeReply changePortInDueDateTime(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ChangePortInDueDateTimeRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ModifyPortInReply modifyPortIn(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ModifyPortInRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.CancelPortReply cancelPort(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.CancelPortRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ActivateSubscriptionWithPortInReply activateSubscriptionWithPortIn(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ActivateSubscriptionWithPortInRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortInSwapMdnReply portInSwapMdn(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortInSwapMdnRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PreValidatePortReply preValidatePort(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PreValidatePortRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.QueryPendingResellerPortInsReply queryPendingResellerPortIns(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.QueryPendingResellerPortInsRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
}
