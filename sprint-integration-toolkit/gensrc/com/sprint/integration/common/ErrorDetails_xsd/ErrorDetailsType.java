/**
 * ErrorDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.common.ErrorDetails_xsd;


/**
 * Defines the customization of the SOAP 1.1 Fault details element.
 */
public class ErrorDetailsType  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    /* Old P2K error format.  On the path to deprecation.  Kept for
     * backwards compatibility. */
    private com.sprint.integration.common.ErrorDetails_xsd.ProviderErrorType providerError;

    public ErrorDetailsType() {
    }

    public ErrorDetailsType(
           com.sprint.integration.common.ErrorDetails_xsd.ProviderErrorType providerError) {
        this.providerError = providerError;
    }


    /**
     * Gets the providerError value for this ErrorDetailsType.
     * 
     * @return providerError   * Old P2K error format.  On the path to deprecation.  Kept for
     * backwards compatibility.
     */
    public com.sprint.integration.common.ErrorDetails_xsd.ProviderErrorType getProviderError() {
        return providerError;
    }


    /**
     * Sets the providerError value for this ErrorDetailsType.
     * 
     * @param providerError   * Old P2K error format.  On the path to deprecation.  Kept for
     * backwards compatibility.
     */
    public void setProviderError(com.sprint.integration.common.ErrorDetails_xsd.ProviderErrorType providerError) {
        this.providerError = providerError;
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
              this.providerError.equals(other.getProviderError())));
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
            _hashCode += getProviderError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErrorDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "ErrorDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "providerError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetails.xsd", "ProviderErrorType"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
