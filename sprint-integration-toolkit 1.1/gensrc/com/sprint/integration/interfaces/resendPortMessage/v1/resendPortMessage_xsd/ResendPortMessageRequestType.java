/**
 * ResendPortMessageRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd;

public class ResendPortMessageRequestType  implements java.io.Serializable {
    private com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageInfoListType resendPortMessageInfoList;

    public ResendPortMessageRequestType() {
    }

    public ResendPortMessageRequestType(
           com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageInfoListType resendPortMessageInfoList) {
           this.resendPortMessageInfoList = resendPortMessageInfoList;
    }


    /**
     * Gets the resendPortMessageInfoList value for this ResendPortMessageRequestType.
     * 
     * @return resendPortMessageInfoList
     */
    public com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageInfoListType getResendPortMessageInfoList() {
        return resendPortMessageInfoList;
    }


    /**
     * Sets the resendPortMessageInfoList value for this ResendPortMessageRequestType.
     * 
     * @param resendPortMessageInfoList
     */
    public void setResendPortMessageInfoList(com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageInfoListType resendPortMessageInfoList) {
        this.resendPortMessageInfoList = resendPortMessageInfoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResendPortMessageRequestType)) return false;
        ResendPortMessageRequestType other = (ResendPortMessageRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resendPortMessageInfoList==null && other.getResendPortMessageInfoList()==null) || 
             (this.resendPortMessageInfoList!=null &&
              this.resendPortMessageInfoList.equals(other.getResendPortMessageInfoList())));
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
        if (getResendPortMessageInfoList() != null) {
            _hashCode += getResendPortMessageInfoList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResendPortMessageRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "ResendPortMessageRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resendPortMessageInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "resendPortMessageInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "ResendPortMessageInfoListType"));
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
