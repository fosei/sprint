/**
 * ActivateSubscriptionWithPortInRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd;


/**
 * This API provides the ability to port-in an access number and then
 * add a new subscription with that access number to an existing Reseller
 * liable account.
 */
public class ActivateSubscriptionWithPortInRequest  implements java.io.Serializable {
    private com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortInformation portInfo;

    private com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.SubscriptionRequest sub;

    public ActivateSubscriptionWithPortInRequest() {
    }

    public ActivateSubscriptionWithPortInRequest(
           com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortInformation portInfo,
           com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.SubscriptionRequest sub) {
           this.portInfo = portInfo;
           this.sub = sub;
    }


    /**
     * Gets the portInfo value for this ActivateSubscriptionWithPortInRequest.
     * 
     * @return portInfo
     */
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortInformation getPortInfo() {
        return portInfo;
    }


    /**
     * Sets the portInfo value for this ActivateSubscriptionWithPortInRequest.
     * 
     * @param portInfo
     */
    public void setPortInfo(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortInformation portInfo) {
        this.portInfo = portInfo;
    }


    /**
     * Gets the sub value for this ActivateSubscriptionWithPortInRequest.
     * 
     * @return sub
     */
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.SubscriptionRequest getSub() {
        return sub;
    }


    /**
     * Sets the sub value for this ActivateSubscriptionWithPortInRequest.
     * 
     * @param sub
     */
    public void setSub(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.SubscriptionRequest sub) {
        this.sub = sub;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivateSubscriptionWithPortInRequest)) return false;
        ActivateSubscriptionWithPortInRequest other = (ActivateSubscriptionWithPortInRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.portInfo==null && other.getPortInfo()==null) || 
             (this.portInfo!=null &&
              this.portInfo.equals(other.getPortInfo()))) &&
            ((this.sub==null && other.getSub()==null) || 
             (this.sub!=null &&
              this.sub.equals(other.getSub())));
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
        if (getPortInfo() != null) {
            _hashCode += getPortInfo().hashCode();
        }
        if (getSub() != null) {
            _hashCode += getSub().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivateSubscriptionWithPortInRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "ActivateSubscriptionWithPortInRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "portInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "PortInformation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "sub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "SubscriptionRequest"));
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
