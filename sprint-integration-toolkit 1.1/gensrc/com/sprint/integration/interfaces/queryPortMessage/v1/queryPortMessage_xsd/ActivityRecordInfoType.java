/**
 * ActivityRecordInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class ActivityRecordInfoType  implements java.io.Serializable {
    /* Application Id that initiated the request */
    private java.lang.String applId;

    /* A given message can have  one of the following four status
     * at any given point.
     * 1. Message Stored
     * 2. Message Queried
     * 3. Send Failed
     * 4. Send Successful */
    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.MessageStatus messageActivityDesc;

    /* The initial date and time the specified activity type occurred. */
    private java.util.Calendar initialActivityDateTime;

    /* Date and time the specified activity type most recently occured. */
    private java.util.Calendar dateStamp;

    public ActivityRecordInfoType() {
    }

    public ActivityRecordInfoType(
           java.lang.String applId,
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.MessageStatus messageActivityDesc,
           java.util.Calendar initialActivityDateTime,
           java.util.Calendar dateStamp) {
           this.applId = applId;
           this.messageActivityDesc = messageActivityDesc;
           this.initialActivityDateTime = initialActivityDateTime;
           this.dateStamp = dateStamp;
    }


    /**
     * Gets the applId value for this ActivityRecordInfoType.
     * 
     * @return applId   * Application Id that initiated the request
     */
    public java.lang.String getApplId() {
        return applId;
    }


    /**
     * Sets the applId value for this ActivityRecordInfoType.
     * 
     * @param applId   * Application Id that initiated the request
     */
    public void setApplId(java.lang.String applId) {
        this.applId = applId;
    }


    /**
     * Gets the messageActivityDesc value for this ActivityRecordInfoType.
     * 
     * @return messageActivityDesc   * A given message can have  one of the following four status
     * at any given point.
     * 1. Message Stored
     * 2. Message Queried
     * 3. Send Failed
     * 4. Send Successful
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.MessageStatus getMessageActivityDesc() {
        return messageActivityDesc;
    }


    /**
     * Sets the messageActivityDesc value for this ActivityRecordInfoType.
     * 
     * @param messageActivityDesc   * A given message can have  one of the following four status
     * at any given point.
     * 1. Message Stored
     * 2. Message Queried
     * 3. Send Failed
     * 4. Send Successful
     */
    public void setMessageActivityDesc(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.MessageStatus messageActivityDesc) {
        this.messageActivityDesc = messageActivityDesc;
    }


    /**
     * Gets the initialActivityDateTime value for this ActivityRecordInfoType.
     * 
     * @return initialActivityDateTime   * The initial date and time the specified activity type occurred.
     */
    public java.util.Calendar getInitialActivityDateTime() {
        return initialActivityDateTime;
    }


    /**
     * Sets the initialActivityDateTime value for this ActivityRecordInfoType.
     * 
     * @param initialActivityDateTime   * The initial date and time the specified activity type occurred.
     */
    public void setInitialActivityDateTime(java.util.Calendar initialActivityDateTime) {
        this.initialActivityDateTime = initialActivityDateTime;
    }


    /**
     * Gets the dateStamp value for this ActivityRecordInfoType.
     * 
     * @return dateStamp   * Date and time the specified activity type most recently occured.
     */
    public java.util.Calendar getDateStamp() {
        return dateStamp;
    }


    /**
     * Sets the dateStamp value for this ActivityRecordInfoType.
     * 
     * @param dateStamp   * Date and time the specified activity type most recently occured.
     */
    public void setDateStamp(java.util.Calendar dateStamp) {
        this.dateStamp = dateStamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivityRecordInfoType)) return false;
        ActivityRecordInfoType other = (ActivityRecordInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applId==null && other.getApplId()==null) || 
             (this.applId!=null &&
              this.applId.equals(other.getApplId()))) &&
            ((this.messageActivityDesc==null && other.getMessageActivityDesc()==null) || 
             (this.messageActivityDesc!=null &&
              this.messageActivityDesc.equals(other.getMessageActivityDesc()))) &&
            ((this.initialActivityDateTime==null && other.getInitialActivityDateTime()==null) || 
             (this.initialActivityDateTime!=null &&
              this.initialActivityDateTime.equals(other.getInitialActivityDateTime()))) &&
            ((this.dateStamp==null && other.getDateStamp()==null) || 
             (this.dateStamp!=null &&
              this.dateStamp.equals(other.getDateStamp())));
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
        if (getApplId() != null) {
            _hashCode += getApplId().hashCode();
        }
        if (getMessageActivityDesc() != null) {
            _hashCode += getMessageActivityDesc().hashCode();
        }
        if (getInitialActivityDateTime() != null) {
            _hashCode += getInitialActivityDateTime().hashCode();
        }
        if (getDateStamp() != null) {
            _hashCode += getDateStamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivityRecordInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "ActivityRecordInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "applId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageActivityDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "messageActivityDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "MessageStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialActivityDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "initialActivityDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "dateStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
