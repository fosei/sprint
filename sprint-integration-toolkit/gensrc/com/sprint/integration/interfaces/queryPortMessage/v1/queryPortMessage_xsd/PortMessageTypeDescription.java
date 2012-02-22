/**
 * PortMessageTypeDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class PortMessageTypeDescription implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PortMessageTypeDescription(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "PortOut Request";
    public static final java.lang.String _value2 = "Due Date and Time";
    public static final java.lang.String _value3 = "PortIn Response";
    public static final java.lang.String _value4 = "Port Status";
    public static final java.lang.String _value5 = "Port Abandonment";
    public static final java.lang.String _value6 = "Port Notification";
    public static final java.lang.String _value7 = "Port Cancellation";
    public static final java.lang.String _value8 = "Reply PortOut Request";
    public static final PortMessageTypeDescription value1 = new PortMessageTypeDescription(_value1);
    public static final PortMessageTypeDescription value2 = new PortMessageTypeDescription(_value2);
    public static final PortMessageTypeDescription value3 = new PortMessageTypeDescription(_value3);
    public static final PortMessageTypeDescription value4 = new PortMessageTypeDescription(_value4);
    public static final PortMessageTypeDescription value5 = new PortMessageTypeDescription(_value5);
    public static final PortMessageTypeDescription value6 = new PortMessageTypeDescription(_value6);
    public static final PortMessageTypeDescription value7 = new PortMessageTypeDescription(_value7);
    public static final PortMessageTypeDescription value8 = new PortMessageTypeDescription(_value8);
    public java.lang.String getValue() { return _value_;}
    public static PortMessageTypeDescription fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PortMessageTypeDescription enumeration = (PortMessageTypeDescription)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PortMessageTypeDescription fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PortMessageTypeDescription.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "PortMessageTypeDescription"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
