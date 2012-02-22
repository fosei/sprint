/**
 * PostalCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd;

public class PostalCode  implements java.io.Serializable {
    private java.lang.String uspsPostalCd;

    private java.lang.String uspsPostalCdExtension;

    public PostalCode() {
    }

    public PostalCode(
           java.lang.String uspsPostalCd,
           java.lang.String uspsPostalCdExtension) {
           this.uspsPostalCd = uspsPostalCd;
           this.uspsPostalCdExtension = uspsPostalCdExtension;
    }


    /**
     * Gets the uspsPostalCd value for this PostalCode.
     * 
     * @return uspsPostalCd
     */
    public java.lang.String getUspsPostalCd() {
        return uspsPostalCd;
    }


    /**
     * Sets the uspsPostalCd value for this PostalCode.
     * 
     * @param uspsPostalCd
     */
    public void setUspsPostalCd(java.lang.String uspsPostalCd) {
        this.uspsPostalCd = uspsPostalCd;
    }


    /**
     * Gets the uspsPostalCdExtension value for this PostalCode.
     * 
     * @return uspsPostalCdExtension
     */
    public java.lang.String getUspsPostalCdExtension() {
        return uspsPostalCdExtension;
    }


    /**
     * Sets the uspsPostalCdExtension value for this PostalCode.
     * 
     * @param uspsPostalCdExtension
     */
    public void setUspsPostalCdExtension(java.lang.String uspsPostalCdExtension) {
        this.uspsPostalCdExtension = uspsPostalCdExtension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostalCode)) return false;
        PostalCode other = (PostalCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uspsPostalCd==null && other.getUspsPostalCd()==null) || 
             (this.uspsPostalCd!=null &&
              this.uspsPostalCd.equals(other.getUspsPostalCd()))) &&
            ((this.uspsPostalCdExtension==null && other.getUspsPostalCdExtension()==null) || 
             (this.uspsPostalCdExtension!=null &&
              this.uspsPostalCdExtension.equals(other.getUspsPostalCdExtension())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUspsPostalCd() != null) {
            _hashCode += getUspsPostalCd().hashCode();
        }
        if (getUspsPostalCdExtension() != null) {
            _hashCode += getUspsPostalCdExtension().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostalCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "PostalCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uspsPostalCd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "uspsPostalCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uspsPostalCdExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "uspsPostalCdExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
