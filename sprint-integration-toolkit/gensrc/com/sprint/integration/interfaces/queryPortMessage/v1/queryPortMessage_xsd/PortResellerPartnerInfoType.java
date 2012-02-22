/**
 * PortResellerPartnerInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class PortResellerPartnerInfoType  implements java.io.Serializable {
    /* Port-In Reseller Partner Id */
    private java.lang.String portInResellerPartnerId;

    /* Port-Out Reseller Partner Id */
    private java.lang.String portOutResellerPartnerId;

    public PortResellerPartnerInfoType() {
    }

    public PortResellerPartnerInfoType(
           java.lang.String portInResellerPartnerId,
           java.lang.String portOutResellerPartnerId) {
           this.portInResellerPartnerId = portInResellerPartnerId;
           this.portOutResellerPartnerId = portOutResellerPartnerId;
    }


    /**
     * Gets the portInResellerPartnerId value for this PortResellerPartnerInfoType.
     * 
     * @return portInResellerPartnerId   * Port-In Reseller Partner Id
     */
    public java.lang.String getPortInResellerPartnerId() {
        return portInResellerPartnerId;
    }


    /**
     * Sets the portInResellerPartnerId value for this PortResellerPartnerInfoType.
     * 
     * @param portInResellerPartnerId   * Port-In Reseller Partner Id
     */
    public void setPortInResellerPartnerId(java.lang.String portInResellerPartnerId) {
        this.portInResellerPartnerId = portInResellerPartnerId;
    }


    /**
     * Gets the portOutResellerPartnerId value for this PortResellerPartnerInfoType.
     * 
     * @return portOutResellerPartnerId   * Port-Out Reseller Partner Id
     */
    public java.lang.String getPortOutResellerPartnerId() {
        return portOutResellerPartnerId;
    }


    /**
     * Sets the portOutResellerPartnerId value for this PortResellerPartnerInfoType.
     * 
     * @param portOutResellerPartnerId   * Port-Out Reseller Partner Id
     */
    public void setPortOutResellerPartnerId(java.lang.String portOutResellerPartnerId) {
        this.portOutResellerPartnerId = portOutResellerPartnerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortResellerPartnerInfoType)) return false;
        PortResellerPartnerInfoType other = (PortResellerPartnerInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.portInResellerPartnerId==null && other.getPortInResellerPartnerId()==null) || 
             (this.portInResellerPartnerId!=null &&
              this.portInResellerPartnerId.equals(other.getPortInResellerPartnerId()))) &&
            ((this.portOutResellerPartnerId==null && other.getPortOutResellerPartnerId()==null) || 
             (this.portOutResellerPartnerId!=null &&
              this.portOutResellerPartnerId.equals(other.getPortOutResellerPartnerId())));
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
        if (getPortInResellerPartnerId() != null) {
            _hashCode += getPortInResellerPartnerId().hashCode();
        }
        if (getPortOutResellerPartnerId() != null) {
            _hashCode += getPortOutResellerPartnerId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortResellerPartnerInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "PortResellerPartnerInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portInResellerPartnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "portInResellerPartnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portOutResellerPartnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "portOutResellerPartnerId"));
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
