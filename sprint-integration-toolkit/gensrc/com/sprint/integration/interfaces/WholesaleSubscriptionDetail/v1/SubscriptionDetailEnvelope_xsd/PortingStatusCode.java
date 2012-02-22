/**
 * PortingStatusCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd;

public class PortingStatusCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PortingStatusCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PIP = "PIP";
    public static final java.lang.String _PINP = "PINP";
    public static final java.lang.String _POND = "POND";
    public static final java.lang.String _PCP = "PCP";
    public static final java.lang.String _PCNP = "PCNP";
    public static final java.lang.String _PSP = "PSP";
    public static final java.lang.String _PSNP = "PSNP";
    public static final java.lang.String _PSCP = "PSCP";
    public static final java.lang.String _PSCNP = "PSCNP";
    public static final java.lang.String _PNDS = "PNDS";
    public static final java.lang.String _NCPA = "NCPA";
    public static final PortingStatusCode PIP = new PortingStatusCode(_PIP);
    public static final PortingStatusCode PINP = new PortingStatusCode(_PINP);
    public static final PortingStatusCode POND = new PortingStatusCode(_POND);
    public static final PortingStatusCode PCP = new PortingStatusCode(_PCP);
    public static final PortingStatusCode PCNP = new PortingStatusCode(_PCNP);
    public static final PortingStatusCode PSP = new PortingStatusCode(_PSP);
    public static final PortingStatusCode PSNP = new PortingStatusCode(_PSNP);
    public static final PortingStatusCode PSCP = new PortingStatusCode(_PSCP);
    public static final PortingStatusCode PSCNP = new PortingStatusCode(_PSCNP);
    public static final PortingStatusCode PNDS = new PortingStatusCode(_PNDS);
    public static final PortingStatusCode NCPA = new PortingStatusCode(_NCPA);
    public java.lang.String getValue() { return _value_;}
    public static PortingStatusCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PortingStatusCode enumeration = (PortingStatusCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PortingStatusCode fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortingStatusCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "PortingStatusCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
