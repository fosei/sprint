/**
 * SwapMdnWithReserveIdRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd;

public class SwapMdnWithReserveIdRequest  implements java.io.Serializable {
    private java.lang.String oldMdn;

    private java.lang.String reserveMdnId;

    public SwapMdnWithReserveIdRequest() {
    }

    public SwapMdnWithReserveIdRequest(
           java.lang.String oldMdn,
           java.lang.String reserveMdnId) {
           this.oldMdn = oldMdn;
           this.reserveMdnId = reserveMdnId;
    }


    /**
     * Gets the oldMdn value for this SwapMdnWithReserveIdRequest.
     * 
     * @return oldMdn
     */
    public java.lang.String getOldMdn() {
        return oldMdn;
    }


    /**
     * Sets the oldMdn value for this SwapMdnWithReserveIdRequest.
     * 
     * @param oldMdn
     */
    public void setOldMdn(java.lang.String oldMdn) {
        this.oldMdn = oldMdn;
    }


    /**
     * Gets the reserveMdnId value for this SwapMdnWithReserveIdRequest.
     * 
     * @return reserveMdnId
     */
    public java.lang.String getReserveMdnId() {
        return reserveMdnId;
    }


    /**
     * Sets the reserveMdnId value for this SwapMdnWithReserveIdRequest.
     * 
     * @param reserveMdnId
     */
    public void setReserveMdnId(java.lang.String reserveMdnId) {
        this.reserveMdnId = reserveMdnId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwapMdnWithReserveIdRequest)) return false;
        SwapMdnWithReserveIdRequest other = (SwapMdnWithReserveIdRequest) obj;
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
            ((this.reserveMdnId==null && other.getReserveMdnId()==null) || 
             (this.reserveMdnId!=null &&
              this.reserveMdnId.equals(other.getReserveMdnId())));
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
        if (getReserveMdnId() != null) {
            _hashCode += getReserveMdnId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwapMdnWithReserveIdRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapMdnWithReserveIdRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "oldMdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserveMdnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "reserveMdnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
