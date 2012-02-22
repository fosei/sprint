/**
 * PendingPortInResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd;


/**
 * This is a list of all access numbers pending port-in for the reseller
 * provided.
 */
public class PendingPortInResult  implements java.io.Serializable {
    private java.lang.String accessNumber;

    private java.util.Date portDueDate;

    private java.lang.String portStatus;

    public PendingPortInResult() {
    }

    public PendingPortInResult(
           java.lang.String accessNumber,
           java.util.Date portDueDate,
           java.lang.String portStatus) {
           this.accessNumber = accessNumber;
           this.portDueDate = portDueDate;
           this.portStatus = portStatus;
    }


    /**
     * Gets the accessNumber value for this PendingPortInResult.
     * 
     * @return accessNumber
     */
    public java.lang.String getAccessNumber() {
        return accessNumber;
    }


    /**
     * Sets the accessNumber value for this PendingPortInResult.
     * 
     * @param accessNumber
     */
    public void setAccessNumber(java.lang.String accessNumber) {
        this.accessNumber = accessNumber;
    }


    /**
     * Gets the portDueDate value for this PendingPortInResult.
     * 
     * @return portDueDate
     */
    public java.util.Date getPortDueDate() {
        return portDueDate;
    }


    /**
     * Sets the portDueDate value for this PendingPortInResult.
     * 
     * @param portDueDate
     */
    public void setPortDueDate(java.util.Date portDueDate) {
        this.portDueDate = portDueDate;
    }


    /**
     * Gets the portStatus value for this PendingPortInResult.
     * 
     * @return portStatus
     */
    public java.lang.String getPortStatus() {
        return portStatus;
    }


    /**
     * Sets the portStatus value for this PendingPortInResult.
     * 
     * @param portStatus
     */
    public void setPortStatus(java.lang.String portStatus) {
        this.portStatus = portStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PendingPortInResult)) return false;
        PendingPortInResult other = (PendingPortInResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessNumber==null && other.getAccessNumber()==null) || 
             (this.accessNumber!=null &&
              this.accessNumber.equals(other.getAccessNumber()))) &&
            ((this.portDueDate==null && other.getPortDueDate()==null) || 
             (this.portDueDate!=null &&
              this.portDueDate.equals(other.getPortDueDate()))) &&
            ((this.portStatus==null && other.getPortStatus()==null) || 
             (this.portStatus!=null &&
              this.portStatus.equals(other.getPortStatus())));
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
        if (getAccessNumber() != null) {
            _hashCode += getAccessNumber().hashCode();
        }
        if (getPortDueDate() != null) {
            _hashCode += getPortDueDate().hashCode();
        }
        if (getPortStatus() != null) {
            _hashCode += getPortStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PendingPortInResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "PendingPortInResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "accessNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "portDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "portStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
