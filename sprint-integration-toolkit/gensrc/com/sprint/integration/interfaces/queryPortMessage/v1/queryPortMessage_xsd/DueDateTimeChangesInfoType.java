/**
 * DueDateTimeChangesInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class DueDateTimeChangesInfoType  implements java.io.Serializable {
    /* Original Due Date and Time */
    private java.util.Calendar originalDueDateTime;

    /* Revised Due Date and Time */
    private java.util.Calendar revisedDueDateTime;

    public DueDateTimeChangesInfoType() {
    }

    public DueDateTimeChangesInfoType(
           java.util.Calendar originalDueDateTime,
           java.util.Calendar revisedDueDateTime) {
           this.originalDueDateTime = originalDueDateTime;
           this.revisedDueDateTime = revisedDueDateTime;
    }


    /**
     * Gets the originalDueDateTime value for this DueDateTimeChangesInfoType.
     * 
     * @return originalDueDateTime   * Original Due Date and Time
     */
    public java.util.Calendar getOriginalDueDateTime() {
        return originalDueDateTime;
    }


    /**
     * Sets the originalDueDateTime value for this DueDateTimeChangesInfoType.
     * 
     * @param originalDueDateTime   * Original Due Date and Time
     */
    public void setOriginalDueDateTime(java.util.Calendar originalDueDateTime) {
        this.originalDueDateTime = originalDueDateTime;
    }


    /**
     * Gets the revisedDueDateTime value for this DueDateTimeChangesInfoType.
     * 
     * @return revisedDueDateTime   * Revised Due Date and Time
     */
    public java.util.Calendar getRevisedDueDateTime() {
        return revisedDueDateTime;
    }


    /**
     * Sets the revisedDueDateTime value for this DueDateTimeChangesInfoType.
     * 
     * @param revisedDueDateTime   * Revised Due Date and Time
     */
    public void setRevisedDueDateTime(java.util.Calendar revisedDueDateTime) {
        this.revisedDueDateTime = revisedDueDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DueDateTimeChangesInfoType)) return false;
        DueDateTimeChangesInfoType other = (DueDateTimeChangesInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originalDueDateTime==null && other.getOriginalDueDateTime()==null) || 
             (this.originalDueDateTime!=null &&
              this.originalDueDateTime.equals(other.getOriginalDueDateTime()))) &&
            ((this.revisedDueDateTime==null && other.getRevisedDueDateTime()==null) || 
             (this.revisedDueDateTime!=null &&
              this.revisedDueDateTime.equals(other.getRevisedDueDateTime())));
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
        if (getOriginalDueDateTime() != null) {
            _hashCode += getOriginalDueDateTime().hashCode();
        }
        if (getRevisedDueDateTime() != null) {
            _hashCode += getRevisedDueDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DueDateTimeChangesInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "DueDateTimeChangesInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalDueDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "originalDueDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisedDueDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "revisedDueDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
