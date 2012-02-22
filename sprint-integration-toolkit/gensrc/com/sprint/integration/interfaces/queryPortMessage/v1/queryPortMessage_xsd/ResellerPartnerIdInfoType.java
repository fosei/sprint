/**
 * ResellerPartnerIdInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class ResellerPartnerIdInfoType  implements java.io.Serializable {
    /* Reseller Partner Id */
    private java.lang.String resellerPartnerId;

    /* This structure contains both reseller partner information if
     * customer is porting among resellers. If the customer is porting from
     * Sprint Network to non-Sprint or vice versa, this structure will not
     * be populated */
    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortResellerPartnerInfoType portResellerPartnerInfo;

    public ResellerPartnerIdInfoType() {
    }

    public ResellerPartnerIdInfoType(
           java.lang.String resellerPartnerId,
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortResellerPartnerInfoType portResellerPartnerInfo) {
           this.resellerPartnerId = resellerPartnerId;
           this.portResellerPartnerInfo = portResellerPartnerInfo;
    }


    /**
     * Gets the resellerPartnerId value for this ResellerPartnerIdInfoType.
     * 
     * @return resellerPartnerId   * Reseller Partner Id
     */
    public java.lang.String getResellerPartnerId() {
        return resellerPartnerId;
    }


    /**
     * Sets the resellerPartnerId value for this ResellerPartnerIdInfoType.
     * 
     * @param resellerPartnerId   * Reseller Partner Id
     */
    public void setResellerPartnerId(java.lang.String resellerPartnerId) {
        this.resellerPartnerId = resellerPartnerId;
    }


    /**
     * Gets the portResellerPartnerInfo value for this ResellerPartnerIdInfoType.
     * 
     * @return portResellerPartnerInfo   * This structure contains both reseller partner information if
     * customer is porting among resellers. If the customer is porting from
     * Sprint Network to non-Sprint or vice versa, this structure will not
     * be populated
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortResellerPartnerInfoType getPortResellerPartnerInfo() {
        return portResellerPartnerInfo;
    }


    /**
     * Sets the portResellerPartnerInfo value for this ResellerPartnerIdInfoType.
     * 
     * @param portResellerPartnerInfo   * This structure contains both reseller partner information if
     * customer is porting among resellers. If the customer is porting from
     * Sprint Network to non-Sprint or vice versa, this structure will not
     * be populated
     */
    public void setPortResellerPartnerInfo(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortResellerPartnerInfoType portResellerPartnerInfo) {
        this.portResellerPartnerInfo = portResellerPartnerInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResellerPartnerIdInfoType)) return false;
        ResellerPartnerIdInfoType other = (ResellerPartnerIdInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resellerPartnerId==null && other.getResellerPartnerId()==null) || 
             (this.resellerPartnerId!=null &&
              this.resellerPartnerId.equals(other.getResellerPartnerId()))) &&
            ((this.portResellerPartnerInfo==null && other.getPortResellerPartnerInfo()==null) || 
             (this.portResellerPartnerInfo!=null &&
              this.portResellerPartnerInfo.equals(other.getPortResellerPartnerInfo())));
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
        if (getResellerPartnerId() != null) {
            _hashCode += getResellerPartnerId().hashCode();
        }
        if (getPortResellerPartnerInfo() != null) {
            _hashCode += getPortResellerPartnerInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResellerPartnerIdInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "ResellerPartnerIdInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resellerPartnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "resellerPartnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portResellerPartnerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "portResellerPartnerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "PortResellerPartnerInfoType"));
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
