/**
 * ProviderErrorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.common.ErrorDetails_xsd;


/**
 * Structure to hold provider-level (p2k, ensemble) error information.
 * Kept for backwards compatibility.
 */
public class ProviderErrorType  implements java.io.Serializable {
    /* Numeric encoding of the error.  Intended to be consumed programatically. */
    private java.lang.String providerErrorCode;

    /* Human-readable description of the error. */
    private java.lang.String providerErrorText;

    public ProviderErrorType() {
    }

    public ProviderErrorType(
           java.lang.String providerErrorCode,
           java.lang.String providerErrorText) {
           this.providerErrorCode = providerErrorCode;
           this.providerErrorText = providerErrorText;
    }


    /**
     * Gets the providerErrorCode value for this ProviderErrorType.
     * 
     * @return providerErrorCode   * Numeric encoding of the error.  Intended to be consumed programatically.
     */
    public java.lang.String getProviderErrorCode() {
        return providerErrorCode;
    }


    /**
     * Sets the providerErrorCode value for this ProviderErrorType.
     * 
     * @param providerErrorCode   * Numeric encoding of the error.  Intended to be consumed programatically.
     */
    public void setProviderErrorCode(java.lang.String providerErrorCode) {
        this.providerErrorCode = providerErrorCode;
    }


    /**
     * Gets the providerErrorText value for this ProviderErrorType.
     * 
     * @return providerErrorText   * Human-readable description of the error.
     */
    public java.lang.String getProviderErrorText() {
        return providerErrorText;
    }


    /**
     * Sets the providerErrorText value for this ProviderErrorType.
     * 
     * @param providerErrorText   * Human-readable description of the error.
     */
    public void setProviderErrorText(java.lang.String providerErrorText) {
        this.providerErrorText = providerErrorText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProviderErrorType)) return false;
        ProviderErrorType other = (ProviderErrorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.providerErrorCode==null && other.getProviderErrorCode()==null) || 
             (this.providerErrorCode!=null &&
              this.providerErrorCode.equals(other.getProviderErrorCode()))) &&
            ((this.providerErrorText==null && other.getProviderErrorText()==null) || 
             (this.providerErrorText!=null &&
              this.providerErrorText.equals(other.getProviderErrorText())));
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
        if (getProviderErrorCode() != null) {
            _hashCode += getProviderErrorCode().hashCode();
        }
        if (getProviderErrorText() != null) {
            _hashCode += getProviderErrorText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProviderErrorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "ProviderErrorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "providerErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "ProviderErrorCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerErrorText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "providerErrorText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
