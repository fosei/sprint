/**
 * ActivateSubscriptionWithPortInReply.java
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
public class ActivateSubscriptionWithPortInReply  implements java.io.Serializable {
    private com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.SubscriptionReply sub;

    private com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortResult portResult;

    public ActivateSubscriptionWithPortInReply() {
    }

    public ActivateSubscriptionWithPortInReply(
           com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.SubscriptionReply sub,
           com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortResult portResult) {
           this.sub = sub;
           this.portResult = portResult;
    }


    /**
     * Gets the sub value for this ActivateSubscriptionWithPortInReply.
     * 
     * @return sub
     */
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.SubscriptionReply getSub() {
        return sub;
    }


    /**
     * Sets the sub value for this ActivateSubscriptionWithPortInReply.
     * 
     * @param sub
     */
    public void setSub(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.SubscriptionReply sub) {
        this.sub = sub;
    }


    /**
     * Gets the portResult value for this ActivateSubscriptionWithPortInReply.
     * 
     * @return portResult
     */
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortResult getPortResult() {
        return portResult;
    }


    /**
     * Sets the portResult value for this ActivateSubscriptionWithPortInReply.
     * 
     * @param portResult
     */
    public void setPortResult(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortResult portResult) {
        this.portResult = portResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivateSubscriptionWithPortInReply)) return false;
        ActivateSubscriptionWithPortInReply other = (ActivateSubscriptionWithPortInReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sub==null && other.getSub()==null) || 
             (this.sub!=null &&
              this.sub.equals(other.getSub()))) &&
            ((this.portResult==null && other.getPortResult()==null) || 
             (this.portResult!=null &&
              this.portResult.equals(other.getPortResult())));
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
        if (getSub() != null) {
            _hashCode += getSub().hashCode();
        }
        if (getPortResult() != null) {
            _hashCode += getPortResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivateSubscriptionWithPortInReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "ActivateSubscriptionWithPortInReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "sub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "SubscriptionReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "portResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "PortResult"));
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
