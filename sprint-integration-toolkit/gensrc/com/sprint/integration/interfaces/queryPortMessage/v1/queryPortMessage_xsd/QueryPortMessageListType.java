/**
 * QueryPortMessageListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class QueryPortMessageListType  implements java.io.Serializable {
    private java.lang.String mdn;

    /* NPS populates this MQ message id, which is unique and is used
     * to identify 'a' message.  FE doesn't need to display this record,
     * but they need to send this info to EAI to push the respective message. */
    private java.lang.String messageId;

    /* EAI Message Type Codes
     * 
     * POR - PortOutRequest
     * DDT - DueDateTime
     * PIR - PortInResponse
     * PTS - PortStatus
     * PTA - PortAbandonment
     * PTN - PortNotifications
     * PTC - PortCancel
     * RPR - Reply PortOut Request */
    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortMessageTypeCode messageTypeCode;

    /* A given message can have  one of the following four status
     * at any given point.
     * M - Message Stored
     * F - Send Failed
     * S - Send Successful */
    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.MessageStatusCodeType messageStatusCode;

    /* A given message can have  one of the following four status
     * at any given point.
     * given point.
     * M - Message Stored
     * F - Send Failed
     * S - Send Successful
     * Q - Message Queried */
    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.MessageActivityCode recentMessageActivityCode;

    /* Gives the flexibility to FrontEnds to query messages by dateTime
     * ranges. This dateTime is against 'Message Creation Timestamp' and
     * is in Central Time Zone in EAI */
    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.DateRangeInfoType dateRangeInfo;

    /* Field which is used to identify if a MVNO has responded to
     * a PortOut request (either initial or supplemental) */
    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortOutRespondedTypeCode replyPortOutRequestStatus;

    /* Select to indicate to inlcude or exclude POR requests that
     * have been cancelled.  Valid Values, Y, N */
    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.QueryPortMessageListTypePortCancelInd portCancelInd;

    /* The field which indicates EAI has rejected the incoming wholesale
     * port message from NPS due to the predefined business rules */
    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.SendAutoRejectTypeCode autoRejectStatus;

    private java.lang.String lastSequenceNumber;

    /* Conditional flag that Front-End applications have to populate
     * if they want to retreive activityList for a given MDN or MQID
     * 
     * This field is valid only when MDN and or messageId is / are provided
     * in the input along with a dateRange. EAI will return 'activityList'
     * only for a single record if this  flag is 'true'.
     * 
     * EAI will ignore this flag even though the value is 'true' if other
     * parameters are provided in the request (other than MDN, MQID) If only
     * 'dateRange' is provided along with 'activityListInd' to 'true' then
     * EAI will ignore 'activityListInd' and will not populate 'activityList'
     * in the response.
     * 
     * MDN and MQID should belong to same message if provided both in same
     * request */
    private java.lang.Boolean activityListInd;

    public QueryPortMessageListType() {
    }

    public QueryPortMessageListType(
           java.lang.String mdn,
           java.lang.String messageId,
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortMessageTypeCode messageTypeCode,
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.MessageStatusCodeType messageStatusCode,
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.MessageActivityCode recentMessageActivityCode,
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.DateRangeInfoType dateRangeInfo,
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortOutRespondedTypeCode replyPortOutRequestStatus,
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.QueryPortMessageListTypePortCancelInd portCancelInd,
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.SendAutoRejectTypeCode autoRejectStatus,
           java.lang.String lastSequenceNumber,
           java.lang.Boolean activityListInd) {
           this.mdn = mdn;
           this.messageId = messageId;
           this.messageTypeCode = messageTypeCode;
           this.messageStatusCode = messageStatusCode;
           this.recentMessageActivityCode = recentMessageActivityCode;
           this.dateRangeInfo = dateRangeInfo;
           this.replyPortOutRequestStatus = replyPortOutRequestStatus;
           this.portCancelInd = portCancelInd;
           this.autoRejectStatus = autoRejectStatus;
           this.lastSequenceNumber = lastSequenceNumber;
           this.activityListInd = activityListInd;
    }


    /**
     * Gets the mdn value for this QueryPortMessageListType.
     * 
     * @return mdn
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this QueryPortMessageListType.
     * 
     * @param mdn
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the messageId value for this QueryPortMessageListType.
     * 
     * @return messageId   * NPS populates this MQ message id, which is unique and is used
     * to identify 'a' message.  FE doesn't need to display this record,
     * but they need to send this info to EAI to push the respective message.
     */
    public java.lang.String getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this QueryPortMessageListType.
     * 
     * @param messageId   * NPS populates this MQ message id, which is unique and is used
     * to identify 'a' message.  FE doesn't need to display this record,
     * but they need to send this info to EAI to push the respective message.
     */
    public void setMessageId(java.lang.String messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the messageTypeCode value for this QueryPortMessageListType.
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
     * RPR - Reply PortOut Request
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortMessageTypeCode getMessageTypeCode() {
        return messageTypeCode;
    }


    /**
     * Sets the messageTypeCode value for this QueryPortMessageListType.
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
     * RPR - Reply PortOut Request
     */
    public void setMessageTypeCode(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortMessageTypeCode messageTypeCode) {
        this.messageTypeCode = messageTypeCode;
    }


    /**
     * Gets the messageStatusCode value for this QueryPortMessageListType.
     * 
     * @return messageStatusCode   * A given message can have  one of the following four status
     * at any given point.
     * M - Message Stored
     * F - Send Failed
     * S - Send Successful
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.MessageStatusCodeType getMessageStatusCode() {
        return messageStatusCode;
    }


    /**
     * Sets the messageStatusCode value for this QueryPortMessageListType.
     * 
     * @param messageStatusCode   * A given message can have  one of the following four status
     * at any given point.
     * M - Message Stored
     * F - Send Failed
     * S - Send Successful
     */
    public void setMessageStatusCode(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.MessageStatusCodeType messageStatusCode) {
        this.messageStatusCode = messageStatusCode;
    }


    /**
     * Gets the recentMessageActivityCode value for this QueryPortMessageListType.
     * 
     * @return recentMessageActivityCode   * A given message can have  one of the following four status
     * at any given point.
     * given point.
     * M - Message Stored
     * F - Send Failed
     * S - Send Successful
     * Q - Message Queried
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.MessageActivityCode getRecentMessageActivityCode() {
        return recentMessageActivityCode;
    }


    /**
     * Sets the recentMessageActivityCode value for this QueryPortMessageListType.
     * 
     * @param recentMessageActivityCode   * A given message can have  one of the following four status
     * at any given point.
     * given point.
     * M - Message Stored
     * F - Send Failed
     * S - Send Successful
     * Q - Message Queried
     */
    public void setRecentMessageActivityCode(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.MessageActivityCode recentMessageActivityCode) {
        this.recentMessageActivityCode = recentMessageActivityCode;
    }


    /**
     * Gets the dateRangeInfo value for this QueryPortMessageListType.
     * 
     * @return dateRangeInfo   * Gives the flexibility to FrontEnds to query messages by dateTime
     * ranges. This dateTime is against 'Message Creation Timestamp' and
     * is in Central Time Zone in EAI
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.DateRangeInfoType getDateRangeInfo() {
        return dateRangeInfo;
    }


    /**
     * Sets the dateRangeInfo value for this QueryPortMessageListType.
     * 
     * @param dateRangeInfo   * Gives the flexibility to FrontEnds to query messages by dateTime
     * ranges. This dateTime is against 'Message Creation Timestamp' and
     * is in Central Time Zone in EAI
     */
    public void setDateRangeInfo(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.DateRangeInfoType dateRangeInfo) {
        this.dateRangeInfo = dateRangeInfo;
    }


    /**
     * Gets the replyPortOutRequestStatus value for this QueryPortMessageListType.
     * 
     * @return replyPortOutRequestStatus   * Field which is used to identify if a MVNO has responded to
     * a PortOut request (either initial or supplemental)
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortOutRespondedTypeCode getReplyPortOutRequestStatus() {
        return replyPortOutRequestStatus;
    }


    /**
     * Sets the replyPortOutRequestStatus value for this QueryPortMessageListType.
     * 
     * @param replyPortOutRequestStatus   * Field which is used to identify if a MVNO has responded to
     * a PortOut request (either initial or supplemental)
     */
    public void setReplyPortOutRequestStatus(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortOutRespondedTypeCode replyPortOutRequestStatus) {
        this.replyPortOutRequestStatus = replyPortOutRequestStatus;
    }


    /**
     * Gets the portCancelInd value for this QueryPortMessageListType.
     * 
     * @return portCancelInd   * Select to indicate to inlcude or exclude POR requests that
     * have been cancelled.  Valid Values, Y, N
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.QueryPortMessageListTypePortCancelInd getPortCancelInd() {
        return portCancelInd;
    }


    /**
     * Sets the portCancelInd value for this QueryPortMessageListType.
     * 
     * @param portCancelInd   * Select to indicate to inlcude or exclude POR requests that
     * have been cancelled.  Valid Values, Y, N
     */
    public void setPortCancelInd(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.QueryPortMessageListTypePortCancelInd portCancelInd) {
        this.portCancelInd = portCancelInd;
    }


    /**
     * Gets the autoRejectStatus value for this QueryPortMessageListType.
     * 
     * @return autoRejectStatus   * The field which indicates EAI has rejected the incoming wholesale
     * port message from NPS due to the predefined business rules
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.SendAutoRejectTypeCode getAutoRejectStatus() {
        return autoRejectStatus;
    }


    /**
     * Sets the autoRejectStatus value for this QueryPortMessageListType.
     * 
     * @param autoRejectStatus   * The field which indicates EAI has rejected the incoming wholesale
     * port message from NPS due to the predefined business rules
     */
    public void setAutoRejectStatus(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.SendAutoRejectTypeCode autoRejectStatus) {
        this.autoRejectStatus = autoRejectStatus;
    }


    /**
     * Gets the lastSequenceNumber value for this QueryPortMessageListType.
     * 
     * @return lastSequenceNumber
     */
    public java.lang.String getLastSequenceNumber() {
        return lastSequenceNumber;
    }


    /**
     * Sets the lastSequenceNumber value for this QueryPortMessageListType.
     * 
     * @param lastSequenceNumber
     */
    public void setLastSequenceNumber(java.lang.String lastSequenceNumber) {
        this.lastSequenceNumber = lastSequenceNumber;
    }


    /**
     * Gets the activityListInd value for this QueryPortMessageListType.
     * 
     * @return activityListInd   * Conditional flag that Front-End applications have to populate
     * if they want to retreive activityList for a given MDN or MQID
     * 
     * This field is valid only when MDN and or messageId is / are provided
     * in the input along with a dateRange. EAI will return 'activityList'
     * only for a single record if this  flag is 'true'.
     * 
     * EAI will ignore this flag even though the value is 'true' if other
     * parameters are provided in the request (other than MDN, MQID) If only
     * 'dateRange' is provided along with 'activityListInd' to 'true' then
     * EAI will ignore 'activityListInd' and will not populate 'activityList'
     * in the response.
     * 
     * MDN and MQID should belong to same message if provided both in same
     * request
     */
    public java.lang.Boolean getActivityListInd() {
        return activityListInd;
    }


    /**
     * Sets the activityListInd value for this QueryPortMessageListType.
     * 
     * @param activityListInd   * Conditional flag that Front-End applications have to populate
     * if they want to retreive activityList for a given MDN or MQID
     * 
     * This field is valid only when MDN and or messageId is / are provided
     * in the input along with a dateRange. EAI will return 'activityList'
     * only for a single record if this  flag is 'true'.
     * 
     * EAI will ignore this flag even though the value is 'true' if other
     * parameters are provided in the request (other than MDN, MQID) If only
     * 'dateRange' is provided along with 'activityListInd' to 'true' then
     * EAI will ignore 'activityListInd' and will not populate 'activityList'
     * in the response.
     * 
     * MDN and MQID should belong to same message if provided both in same
     * request
     */
    public void setActivityListInd(java.lang.Boolean activityListInd) {
        this.activityListInd = activityListInd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPortMessageListType)) return false;
        QueryPortMessageListType other = (QueryPortMessageListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mdn==null && other.getMdn()==null) || 
             (this.mdn!=null &&
              this.mdn.equals(other.getMdn()))) &&
            ((this.messageId==null && other.getMessageId()==null) || 
             (this.messageId!=null &&
              this.messageId.equals(other.getMessageId()))) &&
            ((this.messageTypeCode==null && other.getMessageTypeCode()==null) || 
             (this.messageTypeCode!=null &&
              this.messageTypeCode.equals(other.getMessageTypeCode()))) &&
            ((this.messageStatusCode==null && other.getMessageStatusCode()==null) || 
             (this.messageStatusCode!=null &&
              this.messageStatusCode.equals(other.getMessageStatusCode()))) &&
            ((this.recentMessageActivityCode==null && other.getRecentMessageActivityCode()==null) || 
             (this.recentMessageActivityCode!=null &&
              this.recentMessageActivityCode.equals(other.getRecentMessageActivityCode()))) &&
            ((this.dateRangeInfo==null && other.getDateRangeInfo()==null) || 
             (this.dateRangeInfo!=null &&
              this.dateRangeInfo.equals(other.getDateRangeInfo()))) &&
            ((this.replyPortOutRequestStatus==null && other.getReplyPortOutRequestStatus()==null) || 
             (this.replyPortOutRequestStatus!=null &&
              this.replyPortOutRequestStatus.equals(other.getReplyPortOutRequestStatus()))) &&
            ((this.portCancelInd==null && other.getPortCancelInd()==null) || 
             (this.portCancelInd!=null &&
              this.portCancelInd.equals(other.getPortCancelInd()))) &&
            ((this.autoRejectStatus==null && other.getAutoRejectStatus()==null) || 
             (this.autoRejectStatus!=null &&
              this.autoRejectStatus.equals(other.getAutoRejectStatus()))) &&
            ((this.lastSequenceNumber==null && other.getLastSequenceNumber()==null) || 
             (this.lastSequenceNumber!=null &&
              this.lastSequenceNumber.equals(other.getLastSequenceNumber()))) &&
            ((this.activityListInd==null && other.getActivityListInd()==null) || 
             (this.activityListInd!=null &&
              this.activityListInd.equals(other.getActivityListInd())));
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
        if (getMdn() != null) {
            _hashCode += getMdn().hashCode();
        }
        if (getMessageId() != null) {
            _hashCode += getMessageId().hashCode();
        }
        if (getMessageTypeCode() != null) {
            _hashCode += getMessageTypeCode().hashCode();
        }
        if (getMessageStatusCode() != null) {
            _hashCode += getMessageStatusCode().hashCode();
        }
        if (getRecentMessageActivityCode() != null) {
            _hashCode += getRecentMessageActivityCode().hashCode();
        }
        if (getDateRangeInfo() != null) {
            _hashCode += getDateRangeInfo().hashCode();
        }
        if (getReplyPortOutRequestStatus() != null) {
            _hashCode += getReplyPortOutRequestStatus().hashCode();
        }
        if (getPortCancelInd() != null) {
            _hashCode += getPortCancelInd().hashCode();
        }
        if (getAutoRejectStatus() != null) {
            _hashCode += getAutoRejectStatus().hashCode();
        }
        if (getLastSequenceNumber() != null) {
            _hashCode += getLastSequenceNumber().hashCode();
        }
        if (getActivityListInd() != null) {
            _hashCode += getActivityListInd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPortMessageListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "QueryPortMessageListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "mdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "messageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "messageTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "PortMessageTypeCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "messageStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "MessageStatusCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recentMessageActivityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "recentMessageActivityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "MessageActivityCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRangeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "dateRangeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "DateRangeInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replyPortOutRequestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "replyPortOutRequestStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "PortOutRespondedTypeCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portCancelInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "portCancelInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", ">QueryPortMessageListType>portCancelInd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRejectStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "autoRejectStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "SendAutoRejectTypeCode"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("activityListInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "activityListInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
