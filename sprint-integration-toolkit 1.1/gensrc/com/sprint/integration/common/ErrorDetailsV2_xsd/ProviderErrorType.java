/**
 * ProviderErrorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.common.ErrorDetailsV2_xsd;


/**
 * Structure to hold EAI or back-office detail error information.
 * It is not intended for programmatic decisions unless specific API
 * documentation allows, but to facilitate troubleshooting by logging
 * verbose error conditions.
 */
public class ProviderErrorType  implements java.io.Serializable {
    /* Numeric encoding of the error.  Intended to be consumed programatically. */
    private java.lang.String providerErrorCode;

    /* Human-readable description of the error. */
    private java.lang.String providerErrorText;

    private java.lang.String errorSystem;

    private java.lang.String errorTransactionId;

    private java.lang.String errorProgramId;

    private java.lang.String fieldInError;

    public ProviderErrorType() {
    }

    public ProviderErrorType(
           java.lang.String providerErrorCode,
           java.lang.String providerErrorText,
           java.lang.String errorSystem,
           java.lang.String errorTransactionId,
           java.lang.String errorProgramId,
           java.lang.String fieldInError) {
           this.providerErrorCode = providerErrorCode;
           this.providerErrorText = providerErrorText;
           this.errorSystem = errorSystem;
           this.errorTransactionId = errorTransactionId;
           this.errorProgramId = errorProgramId;
           this.fieldInError = fieldInError;
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


    /**
     * Gets the errorSystem value for this ProviderErrorType.
     * 
     * @return errorSystem
     */
    public java.lang.String getErrorSystem() {
        return errorSystem;
    }


    /**
     * Sets the errorSystem value for this ProviderErrorType.
     * 
     * @param errorSystem
     */
    public void setErrorSystem(java.lang.String errorSystem) {
        this.errorSystem = errorSystem;
    }


    /**
     * Gets the errorTransactionId value for this ProviderErrorType.
     * 
     * @return errorTransactionId
     */
    public java.lang.String getErrorTransactionId() {
        return errorTransactionId;
    }


    /**
     * Sets the errorTransactionId value for this ProviderErrorType.
     * 
     * @param errorTransactionId
     */
    public void setErrorTransactionId(java.lang.String errorTransactionId) {
        this.errorTransactionId = errorTransactionId;
    }


    /**
     * Gets the errorProgramId value for this ProviderErrorType.
     * 
     * @return errorProgramId
     */
    public java.lang.String getErrorProgramId() {
        return errorProgramId;
    }


    /**
     * Sets the errorProgramId value for this ProviderErrorType.
     * 
     * @param errorProgramId
     */
    public void setErrorProgramId(java.lang.String errorProgramId) {
        this.errorProgramId = errorProgramId;
    }


    /**
     * Gets the fieldInError value for this ProviderErrorType.
     * 
     * @return fieldInError
     */
    public java.lang.String getFieldInError() {
        return fieldInError;
    }


    /**
     * Sets the fieldInError value for this ProviderErrorType.
     * 
     * @param fieldInError
     */
    public void setFieldInError(java.lang.String fieldInError) {
        this.fieldInError = fieldInError;
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
              this.providerErrorText.equals(other.getProviderErrorText()))) &&
            ((this.errorSystem==null && other.getErrorSystem()==null) || 
             (this.errorSystem!=null &&
              this.errorSystem.equals(other.getErrorSystem()))) &&
            ((this.errorTransactionId==null && other.getErrorTransactionId()==null) || 
             (this.errorTransactionId!=null &&
              this.errorTransactionId.equals(other.getErrorTransactionId()))) &&
            ((this.errorProgramId==null && other.getErrorProgramId()==null) || 
             (this.errorProgramId!=null &&
              this.errorProgramId.equals(other.getErrorProgramId()))) &&
            ((this.fieldInError==null && other.getFieldInError()==null) || 
             (this.fieldInError!=null &&
              this.fieldInError.equals(other.getFieldInError())));
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
        if (getErrorSystem() != null) {
            _hashCode += getErrorSystem().hashCode();
        }
        if (getErrorTransactionId() != null) {
            _hashCode += getErrorTransactionId().hashCode();
        }
        if (getErrorProgramId() != null) {
            _hashCode += getErrorProgramId().hashCode();
        }
        if (getFieldInError() != null) {
            _hashCode += getFieldInError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProviderErrorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetailsV2.xsd", "ProviderErrorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetailsV2.xsd", "providerErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetailsV2.xsd", "ProviderErrorCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerErrorText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetailsV2.xsd", "providerErrorText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetailsV2.xsd", "ProviderErrorTextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetailsV2.xsd", "errorSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetailsV2.xsd", "errorTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorProgramId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetailsV2.xsd", "errorProgramId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldInError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/common/ErrorDetailsV2.xsd", "fieldInError"));
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
