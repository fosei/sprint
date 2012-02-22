/**
 * ProductDeployment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd;


/**
 * A line item record of a price plan or a service.
 */
public class ProductDeployment  implements java.io.Serializable {
    private java.lang.String serviceCode;

    private java.util.Date serviceEffectiveDate;

    private java.util.Date serviceExpirationDate;

    private java.lang.String callForwardingNumber;

    public ProductDeployment() {
    }

    public ProductDeployment(
           java.lang.String serviceCode,
           java.util.Date serviceEffectiveDate,
           java.util.Date serviceExpirationDate,
           java.lang.String callForwardingNumber) {
           this.serviceCode = serviceCode;
           this.serviceEffectiveDate = serviceEffectiveDate;
           this.serviceExpirationDate = serviceExpirationDate;
           this.callForwardingNumber = callForwardingNumber;
    }


    /**
     * Gets the serviceCode value for this ProductDeployment.
     * 
     * @return serviceCode
     */
    public java.lang.String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this ProductDeployment.
     * 
     * @param serviceCode
     */
    public void setServiceCode(java.lang.String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the serviceEffectiveDate value for this ProductDeployment.
     * 
     * @return serviceEffectiveDate
     */
    public java.util.Date getServiceEffectiveDate() {
        return serviceEffectiveDate;
    }


    /**
     * Sets the serviceEffectiveDate value for this ProductDeployment.
     * 
     * @param serviceEffectiveDate
     */
    public void setServiceEffectiveDate(java.util.Date serviceEffectiveDate) {
        this.serviceEffectiveDate = serviceEffectiveDate;
    }


    /**
     * Gets the serviceExpirationDate value for this ProductDeployment.
     * 
     * @return serviceExpirationDate
     */
    public java.util.Date getServiceExpirationDate() {
        return serviceExpirationDate;
    }


    /**
     * Sets the serviceExpirationDate value for this ProductDeployment.
     * 
     * @param serviceExpirationDate
     */
    public void setServiceExpirationDate(java.util.Date serviceExpirationDate) {
        this.serviceExpirationDate = serviceExpirationDate;
    }


    /**
     * Gets the callForwardingNumber value for this ProductDeployment.
     * 
     * @return callForwardingNumber
     */
    public java.lang.String getCallForwardingNumber() {
        return callForwardingNumber;
    }


    /**
     * Sets the callForwardingNumber value for this ProductDeployment.
     * 
     * @param callForwardingNumber
     */
    public void setCallForwardingNumber(java.lang.String callForwardingNumber) {
        this.callForwardingNumber = callForwardingNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductDeployment)) return false;
        ProductDeployment other = (ProductDeployment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceCode==null && other.getServiceCode()==null) || 
             (this.serviceCode!=null &&
              this.serviceCode.equals(other.getServiceCode()))) &&
            ((this.serviceEffectiveDate==null && other.getServiceEffectiveDate()==null) || 
             (this.serviceEffectiveDate!=null &&
              this.serviceEffectiveDate.equals(other.getServiceEffectiveDate()))) &&
            ((this.serviceExpirationDate==null && other.getServiceExpirationDate()==null) || 
             (this.serviceExpirationDate!=null &&
              this.serviceExpirationDate.equals(other.getServiceExpirationDate()))) &&
            ((this.callForwardingNumber==null && other.getCallForwardingNumber()==null) || 
             (this.callForwardingNumber!=null &&
              this.callForwardingNumber.equals(other.getCallForwardingNumber())));
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
        if (getServiceCode() != null) {
            _hashCode += getServiceCode().hashCode();
        }
        if (getServiceEffectiveDate() != null) {
            _hashCode += getServiceEffectiveDate().hashCode();
        }
        if (getServiceExpirationDate() != null) {
            _hashCode += getServiceExpirationDate().hashCode();
        }
        if (getCallForwardingNumber() != null) {
            _hashCode += getCallForwardingNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductDeployment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "ProductDeployment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "serviceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "ProductId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "serviceEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "serviceExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callForwardingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "callForwardingNumber"));
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
