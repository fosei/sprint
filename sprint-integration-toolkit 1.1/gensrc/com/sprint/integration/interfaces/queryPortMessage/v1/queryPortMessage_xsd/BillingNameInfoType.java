/**
 * BillingNameInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class BillingNameInfoType  implements java.io.Serializable {
    /* Old Service Provider Billing Name Prefix
     * Ex: Mr., Mrs. */
    private java.lang.String billPrefixName;

    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.CustomerBusinessNameType nameInfo;

    /* Old Service Provider Billing Name Suffix
     * (Ex: Jr. Sr. etc.) */
    private java.lang.String suffixName;

    public BillingNameInfoType() {
    }

    public BillingNameInfoType(
           java.lang.String billPrefixName,
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.CustomerBusinessNameType nameInfo,
           java.lang.String suffixName) {
           this.billPrefixName = billPrefixName;
           this.nameInfo = nameInfo;
           this.suffixName = suffixName;
    }


    /**
     * Gets the billPrefixName value for this BillingNameInfoType.
     * 
     * @return billPrefixName   * Old Service Provider Billing Name Prefix
     * Ex: Mr., Mrs.
     */
    public java.lang.String getBillPrefixName() {
        return billPrefixName;
    }


    /**
     * Sets the billPrefixName value for this BillingNameInfoType.
     * 
     * @param billPrefixName   * Old Service Provider Billing Name Prefix
     * Ex: Mr., Mrs.
     */
    public void setBillPrefixName(java.lang.String billPrefixName) {
        this.billPrefixName = billPrefixName;
    }


    /**
     * Gets the nameInfo value for this BillingNameInfoType.
     * 
     * @return nameInfo
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.CustomerBusinessNameType getNameInfo() {
        return nameInfo;
    }


    /**
     * Sets the nameInfo value for this BillingNameInfoType.
     * 
     * @param nameInfo
     */
    public void setNameInfo(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.CustomerBusinessNameType nameInfo) {
        this.nameInfo = nameInfo;
    }


    /**
     * Gets the suffixName value for this BillingNameInfoType.
     * 
     * @return suffixName   * Old Service Provider Billing Name Suffix
     * (Ex: Jr. Sr. etc.)
     */
    public java.lang.String getSuffixName() {
        return suffixName;
    }


    /**
     * Sets the suffixName value for this BillingNameInfoType.
     * 
     * @param suffixName   * Old Service Provider Billing Name Suffix
     * (Ex: Jr. Sr. etc.)
     */
    public void setSuffixName(java.lang.String suffixName) {
        this.suffixName = suffixName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingNameInfoType)) return false;
        BillingNameInfoType other = (BillingNameInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billPrefixName==null && other.getBillPrefixName()==null) || 
             (this.billPrefixName!=null &&
              this.billPrefixName.equals(other.getBillPrefixName()))) &&
            ((this.nameInfo==null && other.getNameInfo()==null) || 
             (this.nameInfo!=null &&
              this.nameInfo.equals(other.getNameInfo()))) &&
            ((this.suffixName==null && other.getSuffixName()==null) || 
             (this.suffixName!=null &&
              this.suffixName.equals(other.getSuffixName())));
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
        if (getBillPrefixName() != null) {
            _hashCode += getBillPrefixName().hashCode();
        }
        if (getNameInfo() != null) {
            _hashCode += getNameInfo().hashCode();
        }
        if (getSuffixName() != null) {
            _hashCode += getSuffixName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingNameInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "BillingNameInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPrefixName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "billPrefixName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "nameInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "CustomerBusinessNameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suffixName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "suffixName"));
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
