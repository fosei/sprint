/**
 * QueryPortMessageResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class QueryPortMessageResponseType  implements java.io.Serializable {
    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.WholesalePortMessageListType wholesalePortMessageList;

    public QueryPortMessageResponseType() {
    }

    public QueryPortMessageResponseType(
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.WholesalePortMessageListType wholesalePortMessageList) {
           this.wholesalePortMessageList = wholesalePortMessageList;
    }


    /**
     * Gets the wholesalePortMessageList value for this QueryPortMessageResponseType.
     * 
     * @return wholesalePortMessageList
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.WholesalePortMessageListType getWholesalePortMessageList() {
        return wholesalePortMessageList;
    }


    /**
     * Sets the wholesalePortMessageList value for this QueryPortMessageResponseType.
     * 
     * @param wholesalePortMessageList
     */
    public void setWholesalePortMessageList(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.WholesalePortMessageListType wholesalePortMessageList) {
        this.wholesalePortMessageList = wholesalePortMessageList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPortMessageResponseType)) return false;
        QueryPortMessageResponseType other = (QueryPortMessageResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wholesalePortMessageList==null && other.getWholesalePortMessageList()==null) || 
             (this.wholesalePortMessageList!=null &&
              this.wholesalePortMessageList.equals(other.getWholesalePortMessageList())));
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
        if (getWholesalePortMessageList() != null) {
            _hashCode += getWholesalePortMessageList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPortMessageResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "QueryPortMessageResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wholesalePortMessageList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "wholesalePortMessageList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "WholesalePortMessageListType"));
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
