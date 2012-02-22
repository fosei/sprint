/**
 * SwapMsidRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd;

public class SwapMsidRequest  implements java.io.Serializable {
    private java.lang.String oldMsid;

    public SwapMsidRequest() {
    }

    public SwapMsidRequest(
           java.lang.String oldMsid) {
           this.oldMsid = oldMsid;
    }


    /**
     * Gets the oldMsid value for this SwapMsidRequest.
     * 
     * @return oldMsid
     */
    public java.lang.String getOldMsid() {
        return oldMsid;
    }


    /**
     * Sets the oldMsid value for this SwapMsidRequest.
     * 
     * @param oldMsid
     */
    public void setOldMsid(java.lang.String oldMsid) {
        this.oldMsid = oldMsid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwapMsidRequest)) return false;
        SwapMsidRequest other = (SwapMsidRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldMsid==null && other.getOldMsid()==null) || 
             (this.oldMsid!=null &&
              this.oldMsid.equals(other.getOldMsid())));
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
        if (getOldMsid() != null) {
            _hashCode += getOldMsid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwapMsidRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapMsidRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMsid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "oldMsid"));
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
