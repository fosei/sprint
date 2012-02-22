/**
 * TimeZoneCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd;

public class TimeZoneCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TimeZoneCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ATL = "ATL";
    public static final java.lang.String _EST = "EST";
    public static final java.lang.String _CST = "CST";
    public static final java.lang.String _MST = "MST";
    public static final java.lang.String _PST = "PST";
    public static final java.lang.String _ALA = "ALA";
    public static final java.lang.String _HAW = "HAW";
    public static final java.lang.String _EDT = "EDT";
    public static final java.lang.String _CDT = "CDT";
    public static final java.lang.String _MDT = "MDT";
    public static final java.lang.String _PDT = "PDT";
    public static final TimeZoneCode ATL = new TimeZoneCode(_ATL);
    public static final TimeZoneCode EST = new TimeZoneCode(_EST);
    public static final TimeZoneCode CST = new TimeZoneCode(_CST);
    public static final TimeZoneCode MST = new TimeZoneCode(_MST);
    public static final TimeZoneCode PST = new TimeZoneCode(_PST);
    public static final TimeZoneCode ALA = new TimeZoneCode(_ALA);
    public static final TimeZoneCode HAW = new TimeZoneCode(_HAW);
    public static final TimeZoneCode EDT = new TimeZoneCode(_EDT);
    public static final TimeZoneCode CDT = new TimeZoneCode(_CDT);
    public static final TimeZoneCode MDT = new TimeZoneCode(_MDT);
    public static final TimeZoneCode PDT = new TimeZoneCode(_PDT);
    public java.lang.String getValue() { return _value_;}
    public static TimeZoneCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TimeZoneCode enumeration = (TimeZoneCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TimeZoneCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TimeZoneCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "TimeZoneCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
