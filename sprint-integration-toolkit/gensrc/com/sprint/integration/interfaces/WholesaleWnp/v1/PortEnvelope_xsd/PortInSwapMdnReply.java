/**
 * PortInSwapMdnReply.java
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
public class PortInSwapMdnReply  implements java.io.Serializable {
    private java.lang.String newMdn;

    private java.lang.String msid;

    private com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortResult portResult;

    public PortInSwapMdnReply() {
    }

    public PortInSwapMdnReply(
           java.lang.String newMdn,
           java.lang.String msid,
           com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortResult portResult) {
           this.newMdn = newMdn;
           this.msid = msid;
           this.portResult = portResult;
    }


    /**
     * Gets the newMdn value for this PortInSwapMdnReply.
     * 
     * @return newMdn
     */
    public java.lang.String getNewMdn() {
        return newMdn;
    }


    /**
     * Sets the newMdn value for this PortInSwapMdnReply.
     * 
     * @param newMdn
     */
    public void setNewMdn(java.lang.String newMdn) {
        this.newMdn = newMdn;
    }


    /**
     * Gets the msid value for this PortInSwapMdnReply.
     * 
     * @return msid
     */
    public java.lang.String getMsid() {
        return msid;
    }


    /**
     * Sets the msid value for this PortInSwapMdnReply.
     * 
     * @param msid
     */
    public void setMsid(java.lang.String msid) {
        this.msid = msid;
    }


    /**
     * Gets the portResult value for this PortInSwapMdnReply.
     * 
     * @return portResult
     */
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortResult getPortResult() {
        return portResult;
    }


    /**
     * Sets the portResult value for this PortInSwapMdnReply.
     * 
     * @param portResult
     */
    public void setPortResult(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortResult portResult) {
        this.portResult = portResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortInSwapMdnReply)) return false;
        PortInSwapMdnReply other = (PortInSwapMdnReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.newMdn==null && other.getNewMdn()==null) || 
             (this.newMdn!=null &&
              this.newMdn.equals(other.getNewMdn()))) &&
            ((this.msid==null && other.getMsid()==null) || 
             (this.msid!=null &&
              this.msid.equals(other.getMsid()))) &&
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
        if (getNewMdn() != null) {
            _hashCode += getNewMdn().hashCode();
        }
        if (getMsid() != null) {
            _hashCode += getMsid().hashCode();
        }
        if (getPortResult() != null) {
            _hashCode += getPortResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortInSwapMdnReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "PortInSwapMdnReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "newMdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "msid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
