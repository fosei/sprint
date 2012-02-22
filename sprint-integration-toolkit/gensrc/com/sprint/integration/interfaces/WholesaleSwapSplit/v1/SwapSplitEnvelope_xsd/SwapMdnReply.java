/**
 * SwapMdnReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd;

public class SwapMdnReply  implements java.io.Serializable {
    /* North American Numbering Plan (NANP) Telecom Number, is the
     * 10 digit telephone number comprised of the NPA Number, the NXX Number
     * and the Phone Line Number */
    private java.lang.String newMdn;

    /* Mobile Station Identification Number (MSID) is the internal
     * identifying number for a CDMA handset's phone number under Local Number
     * Portability.  Mobile Station Identification Number stays with the
     * carrier while the MDN stays with the customer. */
    private java.lang.String msid;

    public SwapMdnReply() {
    }

    public SwapMdnReply(
           java.lang.String newMdn,
           java.lang.String msid) {
           this.newMdn = newMdn;
           this.msid = msid;
    }


    /**
     * Gets the newMdn value for this SwapMdnReply.
     * 
     * @return newMdn   * North American Numbering Plan (NANP) Telecom Number, is the
     * 10 digit telephone number comprised of the NPA Number, the NXX Number
     * and the Phone Line Number
     */
    public java.lang.String getNewMdn() {
        return newMdn;
    }


    /**
     * Sets the newMdn value for this SwapMdnReply.
     * 
     * @param newMdn   * North American Numbering Plan (NANP) Telecom Number, is the
     * 10 digit telephone number comprised of the NPA Number, the NXX Number
     * and the Phone Line Number
     */
    public void setNewMdn(java.lang.String newMdn) {
        this.newMdn = newMdn;
    }


    /**
     * Gets the msid value for this SwapMdnReply.
     * 
     * @return msid   * Mobile Station Identification Number (MSID) is the internal
     * identifying number for a CDMA handset's phone number under Local Number
     * Portability.  Mobile Station Identification Number stays with the
     * carrier while the MDN stays with the customer.
     */
    public java.lang.String getMsid() {
        return msid;
    }


    /**
     * Sets the msid value for this SwapMdnReply.
     * 
     * @param msid   * Mobile Station Identification Number (MSID) is the internal
     * identifying number for a CDMA handset's phone number under Local Number
     * Portability.  Mobile Station Identification Number stays with the
     * carrier while the MDN stays with the customer.
     */
    public void setMsid(java.lang.String msid) {
        this.msid = msid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwapMdnReply)) return false;
        SwapMdnReply other = (SwapMdnReply) obj;
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
              this.msid.equals(other.getMsid())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwapMdnReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "SwapMdnReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "newMdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSwapSplit/v1/SwapSplitEnvelope.xsd", "msid"));
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
