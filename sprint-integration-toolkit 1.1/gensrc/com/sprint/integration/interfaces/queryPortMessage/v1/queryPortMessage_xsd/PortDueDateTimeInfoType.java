/**
 * PortDueDateTimeInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class PortDueDateTimeInfoType  implements java.io.Serializable {
    /* Due Date and Time */
    private java.util.Calendar dueDateTime;

    /* This structure will contain DDT changes */
    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.DueDateTimeChangesInfoType dueDateTimeChangesInfo;

    public PortDueDateTimeInfoType() {
    }

    public PortDueDateTimeInfoType(
           java.util.Calendar dueDateTime,
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.DueDateTimeChangesInfoType dueDateTimeChangesInfo) {
           this.dueDateTime = dueDateTime;
           this.dueDateTimeChangesInfo = dueDateTimeChangesInfo;
    }


    /**
     * Gets the dueDateTime value for this PortDueDateTimeInfoType.
     * 
     * @return dueDateTime   * Due Date and Time
     */
    public java.util.Calendar getDueDateTime() {
        return dueDateTime;
    }


    /**
     * Sets the dueDateTime value for this PortDueDateTimeInfoType.
     * 
     * @param dueDateTime   * Due Date and Time
     */
    public void setDueDateTime(java.util.Calendar dueDateTime) {
        this.dueDateTime = dueDateTime;
    }


    /**
     * Gets the dueDateTimeChangesInfo value for this PortDueDateTimeInfoType.
     * 
     * @return dueDateTimeChangesInfo   * This structure will contain DDT changes
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.DueDateTimeChangesInfoType getDueDateTimeChangesInfo() {
        return dueDateTimeChangesInfo;
    }


    /**
     * Sets the dueDateTimeChangesInfo value for this PortDueDateTimeInfoType.
     * 
     * @param dueDateTimeChangesInfo   * This structure will contain DDT changes
     */
    public void setDueDateTimeChangesInfo(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.DueDateTimeChangesInfoType dueDateTimeChangesInfo) {
        this.dueDateTimeChangesInfo = dueDateTimeChangesInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortDueDateTimeInfoType)) return false;
        PortDueDateTimeInfoType other = (PortDueDateTimeInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dueDateTime==null && other.getDueDateTime()==null) || 
             (this.dueDateTime!=null &&
              this.dueDateTime.equals(other.getDueDateTime()))) &&
            ((this.dueDateTimeChangesInfo==null && other.getDueDateTimeChangesInfo()==null) || 
             (this.dueDateTimeChangesInfo!=null &&
              this.dueDateTimeChangesInfo.equals(other.getDueDateTimeChangesInfo())));
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
        if (getDueDateTime() != null) {
            _hashCode += getDueDateTime().hashCode();
        }
        if (getDueDateTimeChangesInfo() != null) {
            _hashCode += getDueDateTimeChangesInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortDueDateTimeInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "PortDueDateTimeInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "dueDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDateTimeChangesInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "dueDateTimeChangesInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "DueDateTimeChangesInfoType"));
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
