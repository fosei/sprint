/**
 * PortMessageTypeCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class PortMessageTypeCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PortMessageTypeCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _POR = "POR";
    public static final java.lang.String _DDT = "DDT";
    public static final java.lang.String _PIR = "PIR";
    public static final java.lang.String _PTS = "PTS";
    public static final java.lang.String _PTA = "PTA";
    public static final java.lang.String _PTN = "PTN";
    public static final java.lang.String _PTC = "PTC";
    public static final java.lang.String _RPR = "RPR";
    public static final PortMessageTypeCode POR = new PortMessageTypeCode(_POR);
    public static final PortMessageTypeCode DDT = new PortMessageTypeCode(_DDT);
    public static final PortMessageTypeCode PIR = new PortMessageTypeCode(_PIR);
    public static final PortMessageTypeCode PTS = new PortMessageTypeCode(_PTS);
    public static final PortMessageTypeCode PTA = new PortMessageTypeCode(_PTA);
    public static final PortMessageTypeCode PTN = new PortMessageTypeCode(_PTN);
    public static final PortMessageTypeCode PTC = new PortMessageTypeCode(_PTC);
    public static final PortMessageTypeCode RPR = new PortMessageTypeCode(_RPR);
    public java.lang.String getValue() { return _value_;}
    public static PortMessageTypeCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PortMessageTypeCode enumeration = (PortMessageTypeCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PortMessageTypeCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PortMessageTypeCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "PortMessageTypeCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
