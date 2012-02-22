/**
 * CustomerBusinessNameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class CustomerBusinessNameType  implements java.io.Serializable {
    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.BillCustomerNameType customerNameInfo;

    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.BillBusinessNameType businessNameInfo;

    public CustomerBusinessNameType() {
    }

    public CustomerBusinessNameType(
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.BillCustomerNameType customerNameInfo,
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.BillBusinessNameType businessNameInfo) {
           this.customerNameInfo = customerNameInfo;
           this.businessNameInfo = businessNameInfo;
    }


    /**
     * Gets the customerNameInfo value for this CustomerBusinessNameType.
     * 
     * @return customerNameInfo
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.BillCustomerNameType getCustomerNameInfo() {
        return customerNameInfo;
    }


    /**
     * Sets the customerNameInfo value for this CustomerBusinessNameType.
     * 
     * @param customerNameInfo
     */
    public void setCustomerNameInfo(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.BillCustomerNameType customerNameInfo) {
        this.customerNameInfo = customerNameInfo;
    }


    /**
     * Gets the businessNameInfo value for this CustomerBusinessNameType.
     * 
     * @return businessNameInfo
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.BillBusinessNameType getBusinessNameInfo() {
        return businessNameInfo;
    }


    /**
     * Sets the businessNameInfo value for this CustomerBusinessNameType.
     * 
     * @param businessNameInfo
     */
    public void setBusinessNameInfo(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.BillBusinessNameType businessNameInfo) {
        this.businessNameInfo = businessNameInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerBusinessNameType)) return false;
        CustomerBusinessNameType other = (CustomerBusinessNameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerNameInfo==null && other.getCustomerNameInfo()==null) || 
             (this.customerNameInfo!=null &&
              this.customerNameInfo.equals(other.getCustomerNameInfo()))) &&
            ((this.businessNameInfo==null && other.getBusinessNameInfo()==null) || 
             (this.businessNameInfo!=null &&
              this.businessNameInfo.equals(other.getBusinessNameInfo())));
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
        if (getCustomerNameInfo() != null) {
            _hashCode += getCustomerNameInfo().hashCode();
        }
        if (getBusinessNameInfo() != null) {
            _hashCode += getBusinessNameInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerBusinessNameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "CustomerBusinessNameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerNameInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "customerNameInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "BillCustomerNameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessNameInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "businessNameInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "BillBusinessNameType"));
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
