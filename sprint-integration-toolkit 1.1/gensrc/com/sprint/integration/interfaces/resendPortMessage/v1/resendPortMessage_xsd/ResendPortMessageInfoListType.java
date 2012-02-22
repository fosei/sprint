/**
 * ResendPortMessageInfoListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd;

public class ResendPortMessageInfoListType  implements java.io.Serializable {
    private com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageInfoType[] resendPortMessageInfo;

    public ResendPortMessageInfoListType() {
    }

    public ResendPortMessageInfoListType(
           com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageInfoType[] resendPortMessageInfo) {
           this.resendPortMessageInfo = resendPortMessageInfo;
    }


    /**
     * Gets the resendPortMessageInfo value for this ResendPortMessageInfoListType.
     * 
     * @return resendPortMessageInfo
     */
    public com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageInfoType[] getResendPortMessageInfo() {
        return resendPortMessageInfo;
    }


    /**
     * Sets the resendPortMessageInfo value for this ResendPortMessageInfoListType.
     * 
     * @param resendPortMessageInfo
     */
    public void setResendPortMessageInfo(com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageInfoType[] resendPortMessageInfo) {
        this.resendPortMessageInfo = resendPortMessageInfo;
    }

    public com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageInfoType getResendPortMessageInfo(int i) {
        return this.resendPortMessageInfo[i];
    }

    public void setResendPortMessageInfo(int i, com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageInfoType _value) {
        this.resendPortMessageInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResendPortMessageInfoListType)) return false;
        ResendPortMessageInfoListType other = (ResendPortMessageInfoListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resendPortMessageInfo==null && other.getResendPortMessageInfo()==null) || 
             (this.resendPortMessageInfo!=null &&
              java.util.Arrays.equals(this.resendPortMessageInfo, other.getResendPortMessageInfo())));
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
        if (getResendPortMessageInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResendPortMessageInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResendPortMessageInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ResendPortMessageInfoListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "ResendPortMessageInfoListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resendPortMessageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "resendPortMessageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "ResendPortMessageInfoType"));
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
