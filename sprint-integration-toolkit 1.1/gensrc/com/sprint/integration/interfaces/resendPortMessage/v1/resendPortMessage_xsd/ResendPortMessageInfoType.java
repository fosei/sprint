/**
 * ResendPortMessageInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd;

public class ResendPortMessageInfoType  implements java.io.Serializable {
    /* EAI populates this with MQ message id, which is unique and
     * is used to identify 'a' message. This field is conditional and will
     * be populated only for 'PortOut Request'. FE doesn't need to display
     * this record, but they need to send this info to EAI to push the respective
     * message. */
    private java.lang.String messageId;

    private java.lang.String mdn;

    /* EAI Message Type Codes
     * 
     * POR - PortOutRequest
     * DDT - DueDateTime
     * PIR - PortInResponse
     * PTS - PortStatus
     * PTA - PortAbandonment
     * PTN - PortNotifications
     * PTC - PortCancel */
    private com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.PortMessageTypeCode messageTypeCode;

    /* A given message can have  one of the following four status
     * at any given point.
     * M - Message Stored
     * F - Send Failed
     * S - Send Successful */
    private com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.MessageStatusCodeType messageStatusCode;

    /* Gives the flexibility to FrontEnds to query messages by dateTime
     * ranges. This dateTime is against 'Message Creation Timestamp' */
    private com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.DateRangeInfoType dateRangeInfo;

    public ResendPortMessageInfoType() {
    }

    public ResendPortMessageInfoType(
           java.lang.String messageId,
           java.lang.String mdn,
           com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.PortMessageTypeCode messageTypeCode,
           com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.MessageStatusCodeType messageStatusCode,
           com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.DateRangeInfoType dateRangeInfo) {
           this.messageId = messageId;
           this.mdn = mdn;
           this.messageTypeCode = messageTypeCode;
           this.messageStatusCode = messageStatusCode;
           this.dateRangeInfo = dateRangeInfo;
    }


    /**
     * Gets the messageId value for this ResendPortMessageInfoType.
     * 
     * @return messageId   * EAI populates this with MQ message id, which is unique and
     * is used to identify 'a' message. This field is conditional and will
     * be populated only for 'PortOut Request'. FE doesn't need to display
     * this record, but they need to send this info to EAI to push the respective
     * message.
     */
    public java.lang.String getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this ResendPortMessageInfoType.
     * 
     * @param messageId   * EAI populates this with MQ message id, which is unique and
     * is used to identify 'a' message. This field is conditional and will
     * be populated only for 'PortOut Request'. FE doesn't need to display
     * this record, but they need to send this info to EAI to push the respective
     * message.
     */
    public void setMessageId(java.lang.String messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the mdn value for this ResendPortMessageInfoType.
     * 
     * @return mdn
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this ResendPortMessageInfoType.
     * 
     * @param mdn
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the messageTypeCode value for this ResendPortMessageInfoType.
     * 
     * @return messageTypeCode   * EAI Message Type Codes
     * 
     * POR - PortOutRequest
     * DDT - DueDateTime
     * PIR - PortInResponse
     * PTS - PortStatus
     * PTA - PortAbandonment
     * PTN - PortNotifications
     * PTC - PortCancel
     */
    public com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.PortMessageTypeCode getMessageTypeCode() {
        return messageTypeCode;
    }


    /**
     * Sets the messageTypeCode value for this ResendPortMessageInfoType.
     * 
     * @param messageTypeCode   * EAI Message Type Codes
     * 
     * POR - PortOutRequest
     * DDT - DueDateTime
     * PIR - PortInResponse
     * PTS - PortStatus
     * PTA - PortAbandonment
     * PTN - PortNotifications
     * PTC - PortCancel
     */
    public void setMessageTypeCode(com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.PortMessageTypeCode messageTypeCode) {
        this.messageTypeCode = messageTypeCode;
    }


    /**
     * Gets the messageStatusCode value for this ResendPortMessageInfoType.
     * 
     * @return messageStatusCode   * A given message can have  one of the following four status
     * at any given point.
     * M - Message Stored
     * F - Send Failed
     * S - Send Successful
     */
    public com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.MessageStatusCodeType getMessageStatusCode() {
        return messageStatusCode;
    }


    /**
     * Sets the messageStatusCode value for this ResendPortMessageInfoType.
     * 
     * @param messageStatusCode   * A given message can have  one of the following four status
     * at any given point.
     * M - Message Stored
     * F - Send Failed
     * S - Send Successful
     */
    public void setMessageStatusCode(com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.MessageStatusCodeType messageStatusCode) {
        this.messageStatusCode = messageStatusCode;
    }


    /**
     * Gets the dateRangeInfo value for this ResendPortMessageInfoType.
     * 
     * @return dateRangeInfo   * Gives the flexibility to FrontEnds to query messages by dateTime
     * ranges. This dateTime is against 'Message Creation Timestamp'
     */
    public com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.DateRangeInfoType getDateRangeInfo() {
        return dateRangeInfo;
    }


    /**
     * Sets the dateRangeInfo value for this ResendPortMessageInfoType.
     * 
     * @param dateRangeInfo   * Gives the flexibility to FrontEnds to query messages by dateTime
     * ranges. This dateTime is against 'Message Creation Timestamp'
     */
    public void setDateRangeInfo(com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.DateRangeInfoType dateRangeInfo) {
        this.dateRangeInfo = dateRangeInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResendPortMessageInfoType)) return false;
        ResendPortMessageInfoType other = (ResendPortMessageInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messageId==null && other.getMessageId()==null) || 
             (this.messageId!=null &&
              this.messageId.equals(other.getMessageId()))) &&
            ((this.mdn==null && other.getMdn()==null) || 
             (this.mdn!=null &&
              this.mdn.equals(other.getMdn()))) &&
            ((this.messageTypeCode==null && other.getMessageTypeCode()==null) || 
             (this.messageTypeCode!=null &&
              this.messageTypeCode.equals(other.getMessageTypeCode()))) &&
            ((this.messageStatusCode==null && other.getMessageStatusCode()==null) || 
             (this.messageStatusCode!=null &&
              this.messageStatusCode.equals(other.getMessageStatusCode()))) &&
            ((this.dateRangeInfo==null && other.getDateRangeInfo()==null) || 
             (this.dateRangeInfo!=null &&
              this.dateRangeInfo.equals(other.getDateRangeInfo())));
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
        if (getMessageId() != null) {
            _hashCode += getMessageId().hashCode();
        }
        if (getMdn() != null) {
            _hashCode += getMdn().hashCode();
        }
        if (getMessageTypeCode() != null) {
            _hashCode += getMessageTypeCode().hashCode();
        }
        if (getMessageStatusCode() != null) {
            _hashCode += getMessageStatusCode().hashCode();
        }
        if (getDateRangeInfo() != null) {
            _hashCode += getDateRangeInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResendPortMessageInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "ResendPortMessageInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "messageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "mdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "messageTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "PortMessageTypeCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "messageStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "MessageStatusCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRangeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "dateRangeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "DateRangeInfoType"));
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
