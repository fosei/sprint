/**
 * ChangePortInDueDateTimeReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd;

public class ChangePortInDueDateTimeReply  implements java.io.Serializable {
    private java.lang.String mdn;

    private java.lang.String portId;

    private com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.TimeZoneCode timeZone;

    private java.util.Calendar desiredDueDateTime;

    private java.lang.String statusCode;

    private java.lang.String statusText;

    public ChangePortInDueDateTimeReply() {
    }

    public ChangePortInDueDateTimeReply(
           java.lang.String mdn,
           java.lang.String portId,
           com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.TimeZoneCode timeZone,
           java.util.Calendar desiredDueDateTime,
           java.lang.String statusCode,
           java.lang.String statusText) {
           this.mdn = mdn;
           this.portId = portId;
           this.timeZone = timeZone;
           this.desiredDueDateTime = desiredDueDateTime;
           this.statusCode = statusCode;
           this.statusText = statusText;
    }


    /**
     * Gets the mdn value for this ChangePortInDueDateTimeReply.
     * 
     * @return mdn
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this ChangePortInDueDateTimeReply.
     * 
     * @param mdn
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the portId value for this ChangePortInDueDateTimeReply.
     * 
     * @return portId
     */
    public java.lang.String getPortId() {
        return portId;
    }


    /**
     * Sets the portId value for this ChangePortInDueDateTimeReply.
     * 
     * @param portId
     */
    public void setPortId(java.lang.String portId) {
        this.portId = portId;
    }


    /**
     * Gets the timeZone value for this ChangePortInDueDateTimeReply.
     * 
     * @return timeZone
     */
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.TimeZoneCode getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this ChangePortInDueDateTimeReply.
     * 
     * @param timeZone
     */
    public void setTimeZone(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.TimeZoneCode timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the desiredDueDateTime value for this ChangePortInDueDateTimeReply.
     * 
     * @return desiredDueDateTime
     */
    public java.util.Calendar getDesiredDueDateTime() {
        return desiredDueDateTime;
    }


    /**
     * Sets the desiredDueDateTime value for this ChangePortInDueDateTimeReply.
     * 
     * @param desiredDueDateTime
     */
    public void setDesiredDueDateTime(java.util.Calendar desiredDueDateTime) {
        this.desiredDueDateTime = desiredDueDateTime;
    }


    /**
     * Gets the statusCode value for this ChangePortInDueDateTimeReply.
     * 
     * @return statusCode
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this ChangePortInDueDateTimeReply.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusText value for this ChangePortInDueDateTimeReply.
     * 
     * @return statusText
     */
    public java.lang.String getStatusText() {
        return statusText;
    }


    /**
     * Sets the statusText value for this ChangePortInDueDateTimeReply.
     * 
     * @param statusText
     */
    public void setStatusText(java.lang.String statusText) {
        this.statusText = statusText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePortInDueDateTimeReply)) return false;
        ChangePortInDueDateTimeReply other = (ChangePortInDueDateTimeReply) obj;
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
            ((this.portId==null && other.getPortId()==null) || 
             (this.portId!=null &&
              this.portId.equals(other.getPortId()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.desiredDueDateTime==null && other.getDesiredDueDateTime()==null) || 
             (this.desiredDueDateTime!=null &&
              this.desiredDueDateTime.equals(other.getDesiredDueDateTime()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.statusText==null && other.getStatusText()==null) || 
             (this.statusText!=null &&
              this.statusText.equals(other.getStatusText())));
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
        if (getPortId() != null) {
            _hashCode += getPortId().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getDesiredDueDateTime() != null) {
            _hashCode += getDesiredDueDateTime().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getStatusText() != null) {
            _hashCode += getStatusText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePortInDueDateTimeReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "ChangePortInDueDateTimeReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "mdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "portId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "MDNReservationID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "TimeZoneCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desiredDueDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "desiredDueDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "statusText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "StatusDescription"));
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
