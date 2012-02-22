/**
 * GeographicCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd;

public class GeographicCodeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GeographicCodeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ExactAddress = "ExactAddress";
    public static final java.lang.String _CrossStreet = "CrossStreet";
    public static final java.lang.String _Zip = "Zip";
    public static final java.lang.String _CityState = "CityState";
    public static final java.lang.String _International = "International";
    public static final GeographicCodeType ExactAddress = new GeographicCodeType(_ExactAddress);
    public static final GeographicCodeType CrossStreet = new GeographicCodeType(_CrossStreet);
    public static final GeographicCodeType Zip = new GeographicCodeType(_Zip);
    public static final GeographicCodeType CityState = new GeographicCodeType(_CityState);
    public static final GeographicCodeType International = new GeographicCodeType(_International);
    public java.lang.String getValue() { return _value_;}
    public static GeographicCodeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GeographicCodeType enumeration = (GeographicCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GeographicCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GeographicCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "GeographicCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
