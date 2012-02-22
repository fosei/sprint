/**
 * QueryPortMessageRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class QueryPortMessageRequestType  implements java.io.Serializable {
    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.QueryPortMessageListType queryPortMessageInfo;

    public QueryPortMessageRequestType() {
    }

    public QueryPortMessageRequestType(
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.QueryPortMessageListType queryPortMessageInfo) {
           this.queryPortMessageInfo = queryPortMessageInfo;
    }


    /**
     * Gets the queryPortMessageInfo value for this QueryPortMessageRequestType.
     * 
     * @return queryPortMessageInfo
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.QueryPortMessageListType getQueryPortMessageInfo() {
        return queryPortMessageInfo;
    }


    /**
     * Sets the queryPortMessageInfo value for this QueryPortMessageRequestType.
     * 
     * @param queryPortMessageInfo
     */
    public void setQueryPortMessageInfo(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.QueryPortMessageListType queryPortMessageInfo) {
        this.queryPortMessageInfo = queryPortMessageInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPortMessageRequestType)) return false;
        QueryPortMessageRequestType other = (QueryPortMessageRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryPortMessageInfo==null && other.getQueryPortMessageInfo()==null) || 
             (this.queryPortMessageInfo!=null &&
              this.queryPortMessageInfo.equals(other.getQueryPortMessageInfo())));
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
        if (getQueryPortMessageInfo() != null) {
            _hashCode += getQueryPortMessageInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPortMessageRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "QueryPortMessageRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryPortMessageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "queryPortMessageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "QueryPortMessageListType"));
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
