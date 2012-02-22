/**
 * WholesalePortMessageListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class WholesalePortMessageListType  implements java.io.Serializable {
    private boolean areMoreRecords;

    private java.lang.String lastSequenceNumber;

    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.WholesalePortMessageTypeListType wholesalePortMessageTypeList;

    public WholesalePortMessageListType() {
    }

    public WholesalePortMessageListType(
           boolean areMoreRecords,
           java.lang.String lastSequenceNumber,
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.WholesalePortMessageTypeListType wholesalePortMessageTypeList) {
           this.areMoreRecords = areMoreRecords;
           this.lastSequenceNumber = lastSequenceNumber;
           this.wholesalePortMessageTypeList = wholesalePortMessageTypeList;
    }


    /**
     * Gets the areMoreRecords value for this WholesalePortMessageListType.
     * 
     * @return areMoreRecords
     */
    public boolean isAreMoreRecords() {
        return areMoreRecords;
    }


    /**
     * Sets the areMoreRecords value for this WholesalePortMessageListType.
     * 
     * @param areMoreRecords
     */
    public void setAreMoreRecords(boolean areMoreRecords) {
        this.areMoreRecords = areMoreRecords;
    }


    /**
     * Gets the lastSequenceNumber value for this WholesalePortMessageListType.
     * 
     * @return lastSequenceNumber
     */
    public java.lang.String getLastSequenceNumber() {
        return lastSequenceNumber;
    }


    /**
     * Sets the lastSequenceNumber value for this WholesalePortMessageListType.
     * 
     * @param lastSequenceNumber
     */
    public void setLastSequenceNumber(java.lang.String lastSequenceNumber) {
        this.lastSequenceNumber = lastSequenceNumber;
    }


    /**
     * Gets the wholesalePortMessageTypeList value for this WholesalePortMessageListType.
     * 
     * @return wholesalePortMessageTypeList
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.WholesalePortMessageTypeListType getWholesalePortMessageTypeList() {
        return wholesalePortMessageTypeList;
    }


    /**
     * Sets the wholesalePortMessageTypeList value for this WholesalePortMessageListType.
     * 
     * @param wholesalePortMessageTypeList
     */
    public void setWholesalePortMessageTypeList(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.WholesalePortMessageTypeListType wholesalePortMessageTypeList) {
        this.wholesalePortMessageTypeList = wholesalePortMessageTypeList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WholesalePortMessageListType)) return false;
        WholesalePortMessageListType other = (WholesalePortMessageListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.areMoreRecords == other.isAreMoreRecords() &&
            ((this.lastSequenceNumber==null && other.getLastSequenceNumber()==null) || 
             (this.lastSequenceNumber!=null &&
              this.lastSequenceNumber.equals(other.getLastSequenceNumber()))) &&
            ((this.wholesalePortMessageTypeList==null && other.getWholesalePortMessageTypeList()==null) || 
             (this.wholesalePortMessageTypeList!=null &&
              this.wholesalePortMessageTypeList.equals(other.getWholesalePortMessageTypeList())));
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
        _hashCode += (isAreMoreRecords() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLastSequenceNumber() != null) {
            _hashCode += getLastSequenceNumber().hashCode();
        }
        if (getWholesalePortMessageTypeList() != null) {
            _hashCode += getWholesalePortMessageTypeList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WholesalePortMessageListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "WholesalePortMessageListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areMoreRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "areMoreRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastSequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "lastSequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wholesalePortMessageTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "wholesalePortMessageTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "WholesalePortMessageTypeListType"));
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
