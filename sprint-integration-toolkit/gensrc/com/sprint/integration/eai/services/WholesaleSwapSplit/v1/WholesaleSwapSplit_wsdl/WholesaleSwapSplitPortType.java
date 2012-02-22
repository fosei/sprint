/**
 * WholesaleSwapSplitPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl;

public interface WholesaleSwapSplitPortType extends java.rmi.Remote {
    public com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapEsnReply swapEsn(com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapEsnRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnReply swapMdn(com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnWithReserveIdReply swapMdnWithReserveId(com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnWithReserveIdRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMsidReply swapMsid(com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMsidRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SplitNpaMdnReply splitNpaMdn(com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SplitNpaMdnRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
}
