/**
 * CoverageQuality.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd;

public class CoverageQuality implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CoverageQuality(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "Best Coverage";
    public static final java.lang.String _value2 = "Good Coverage";
    public static final java.lang.String _value3 = "Fair Coverage";
    public static final java.lang.String _value4 = "No coverage";
    public static final CoverageQuality value1 = new CoverageQuality(_value1);
    public static final CoverageQuality value2 = new CoverageQuality(_value2);
    public static final CoverageQuality value3 = new CoverageQuality(_value3);
    public static final CoverageQuality value4 = new CoverageQuality(_value4);
    public java.lang.String getValue() { return _value_;}
    public static CoverageQuality fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CoverageQuality enumeration = (CoverageQuality)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CoverageQuality fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CoverageQuality.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "CoverageQuality"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
