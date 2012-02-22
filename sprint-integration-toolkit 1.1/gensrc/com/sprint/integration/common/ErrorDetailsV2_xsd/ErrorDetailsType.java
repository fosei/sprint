/**
 * ErrorDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.common.ErrorDetailsV2_xsd;


/**
 * Defines the customization of the SOAP 1.1 Fault details element.
 */
public class ErrorDetailsType  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private com.sprint.integration.common.ErrorDetailsV2_xsd.ProviderErrorType[] providerError;

    public ErrorDetailsType() {
    }

    public ErrorDetailsType(
           com.sprint.integration.common.ErrorDetailsV2_xsd.ProviderErrorType[] providerError) {
        this.providerError = providerError;
    }


    /**
     * Gets the providerError value for this ErrorDetailsType.
     * 
     * @return providerError
     */
    public com.sprint.integration.common.ErrorDetailsV2_xsd.ProviderErrorType[] getProviderError() {
        return providerError;
    }


    /**
     * Sets the providerError value for this ErrorDetailsType.
     * 
     * @param providerError
     */
    public void setProviderError(com.sprint.integration.common.ErrorDetailsV2_xsd.ProviderErrorType[] providerError) {
        this.providerError = providerError;
    }

    public com.sprint.integration.common.ErrorDetailsV2_xsd.ProviderErrorType getProviderError(int i) {
        return this.providerError[i];
    }

    public void setProviderError(int i, com.sprint.integration.common.ErrorDetailsV2_xsd.ProviderErrorType _value) {
        this.providerError[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErrorDetailsType)) return false;
        ErrorDetailsType other = (ErrorDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.providerError==null && other.getProviderError()==null) || 
             (this.providerError!=null &&
              java.util.Arrays.equals(this.providerError, other.getProviderError())));
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
        if (getProviderError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProviderError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProviderError(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErrorDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetailsV2.xsd", "ErrorDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetailsV2.xsd", "providerError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetailsV2.xsd", "ProviderErrorType"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
