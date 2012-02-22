/**
 * PortInSwapMdnRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd;


/**
 * This API provides the ability to port-in an access number and then
 * swap that access number with the current access number on an existing
 * Reseller subscription.
 */
public class PortInSwapMdnRequest  implements java.io.Serializable {
    private java.lang.String oldMdn;

    private java.lang.String newMdn;

    private com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ProvisionBeforeShippingFlag activity;

    private com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortInformation portInfo;

    public PortInSwapMdnRequest() {
    }

    public PortInSwapMdnRequest(
           java.lang.String oldMdn,
           java.lang.String newMdn,
           com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ProvisionBeforeShippingFlag activity,
           com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortInformation portInfo) {
           this.oldMdn = oldMdn;
           this.newMdn = newMdn;
           this.activity = activity;
           this.portInfo = portInfo;
    }


    /**
     * Gets the oldMdn value for this PortInSwapMdnRequest.
     * 
     * @return oldMdn
     */
    public java.lang.String getOldMdn() {
        return oldMdn;
    }


    /**
     * Sets the oldMdn value for this PortInSwapMdnRequest.
     * 
     * @param oldMdn
     */
    public void setOldMdn(java.lang.String oldMdn) {
        this.oldMdn = oldMdn;
    }


    /**
     * Gets the newMdn value for this PortInSwapMdnRequest.
     * 
     * @return newMdn
     */
    public java.lang.String getNewMdn() {
        return newMdn;
    }


    /**
     * Sets the newMdn value for this PortInSwapMdnRequest.
     * 
     * @param newMdn
     */
    public void setNewMdn(java.lang.String newMdn) {
        this.newMdn = newMdn;
    }


    /**
     * Gets the activity value for this PortInSwapMdnRequest.
     * 
     * @return activity
     */
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ProvisionBeforeShippingFlag getActivity() {
        return activity;
    }


    /**
     * Sets the activity value for this PortInSwapMdnRequest.
     * 
     * @param activity
     */
    public void setActivity(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ProvisionBeforeShippingFlag activity) {
        this.activity = activity;
    }


    /**
     * Gets the portInfo value for this PortInSwapMdnRequest.
     * 
     * @return portInfo
     */
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortInformation getPortInfo() {
        return portInfo;
    }


    /**
     * Sets the portInfo value for this PortInSwapMdnRequest.
     * 
     * @param portInfo
     */
    public void setPortInfo(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortInformation portInfo) {
        this.portInfo = portInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortInSwapMdnRequest)) return false;
        PortInSwapMdnRequest other = (PortInSwapMdnRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldMdn==null && other.getOldMdn()==null) || 
             (this.oldMdn!=null &&
              this.oldMdn.equals(other.getOldMdn()))) &&
            ((this.newMdn==null && other.getNewMdn()==null) || 
             (this.newMdn!=null &&
              this.newMdn.equals(other.getNewMdn()))) &&
            ((this.activity==null && other.getActivity()==null) || 
             (this.activity!=null &&
              this.activity.equals(other.getActivity()))) &&
            ((this.portInfo==null && other.getPortInfo()==null) || 
             (this.portInfo!=null &&
              this.portInfo.equals(other.getPortInfo())));
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
        if (getOldMdn() != null) {
            _hashCode += getOldMdn().hashCode();
        }
        if (getNewMdn() != null) {
            _hashCode += getNewMdn().hashCode();
        }
        if (getActivity() != null) {
            _hashCode += getActivity().hashCode();
        }
        if (getPortInfo() != null) {
            _hashCode += getPortInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortInSwapMdnRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "PortInSwapMdnRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "oldMdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "newMdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "activity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "ProvisionBeforeShippingFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "portInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "PortInformation"));
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
