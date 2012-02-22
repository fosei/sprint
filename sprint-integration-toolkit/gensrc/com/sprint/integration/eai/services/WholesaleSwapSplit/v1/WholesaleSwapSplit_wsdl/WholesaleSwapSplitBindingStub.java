/**
 * WholesaleSwapSplitBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl;

public class WholesaleSwapSplitBindingStub extends org.apache.axis.client.Stub implements com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapEsn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "swapEsn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapEsnRequest"), com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapEsnRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapEsnReply"));
        oper.setReturnClass(com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapEsnReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "swapEsnResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "errorDetailItem"),
                      "com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapMdn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "swapMdn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapMdnRequest"), com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapMdnReply"));
        oper.setReturnClass(com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "swapMdnResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "errorDetailItem"),
                      "com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapMdnWithReserveId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "swapMdnWithReserveId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapMdnWithReserveIdRequest"), com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnWithReserveIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapMdnWithReserveIdReply"));
        oper.setReturnClass(com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnWithReserveIdReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "swapMdnWithReserveIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "errorDetailItem"),
                      "com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapMsid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "swapMsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapMsidRequest"), com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMsidRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapMsidReply"));
        oper.setReturnClass(com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMsidReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "swapMsidResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "errorDetailItem"),
                      "com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SplitNpaMdn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "splitNpaMdn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SplitNpaMdnRequest"), com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SplitNpaMdnRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SplitNpaMdnReply"));
        oper.setReturnClass(com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SplitNpaMdnReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "splitNpaMdnResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "errorDetailItem"),
                      "com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[4] = oper;

    }

    public WholesaleSwapSplitBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WholesaleSwapSplitBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WholesaleSwapSplitBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", ">ProviderErrorType>providerErrorCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "ErrorDetailsType");
            cachedSerQNames.add(qName);
            cls = com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "ProviderErrorCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "ProviderErrorTextType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "ProviderErrorType");
            cachedSerQNames.add(qName);
            cls = com.sprint.integration.common.ErrorDetails_xsd.ProviderErrorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "ElectronicSerialNumber");
            cachedSerQNames.add(qName);
            cls = com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.ElectronicSerialNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "ElectronicSerialNumberDec");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "ElectronicSerialNumberHex");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "MDNReservationID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "MobileDirectoryNumberString");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "MobileEquipmentIdentifier");
            cachedSerQNames.add(qName);
            cls = com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.MobileEquipmentIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "MobileEquipmentIdentifierDec");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "MobileEquipmentIdentifierHex");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "MobileStationIdentificationNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SerialNumber");
            cachedSerQNames.add(qName);
            cls = com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SerialNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SplitNpaMdnReply");
            cachedSerQNames.add(qName);
            cls = com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SplitNpaMdnReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SplitNpaMdnRequest");
            cachedSerQNames.add(qName);
            cls = com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SplitNpaMdnRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapEsnReply");
            cachedSerQNames.add(qName);
            cls = com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapEsnReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapEsnRequest");
            cachedSerQNames.add(qName);
            cls = com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapEsnRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapMdnReply");
            cachedSerQNames.add(qName);
            cls = com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapMdnRequest");
            cachedSerQNames.add(qName);
            cls = com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapMdnWithReserveIdReply");
            cachedSerQNames.add(qName);
            cls = com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnWithReserveIdReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapMdnWithReserveIdRequest");
            cachedSerQNames.add(qName);
            cls = com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnWithReserveIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapMsidReply");
            cachedSerQNames.add(qName);
            cls = com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMsidReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapMsidRequest");
            cachedSerQNames.add(qName);
            cls = com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMsidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapEsnReply swapEsn(com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapEsnRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("swapEsn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SwapEsn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapEsnReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapEsnReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapEsnReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnReply swapMdn(com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("swapMdn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SwapMdn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnWithReserveIdReply swapMdnWithReserveId(com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnWithReserveIdRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("swapMdnWithReserveId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SwapMdnWithReserveId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnWithReserveIdReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnWithReserveIdReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnWithReserveIdReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMsidReply swapMsid(com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMsidRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("swapMsid");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SwapMsid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMsidReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMsidReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMsidReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SplitNpaMdnReply splitNpaMdn(com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SplitNpaMdnRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("splitNpaMdn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SplitNpaMdn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SplitNpaMdnReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SplitNpaMdnReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SplitNpaMdnReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
