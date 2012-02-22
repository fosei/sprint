/**
 * MobileEquipmentIdentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd;


/**
 * A Mobile Equipment IDentifier (MEID) is a globally unique number
 * for a  physical piece of mobile station equipment. Equipment identifiers
 * are 'burned' into a CDMA device, and should be resistant to modification.
 * The ESN will migrate to the MEID with assignments anticipated to begin
 * in the 2004 to 2005 timeframe.
 */
public class MobileEquipmentIdentifier  implements java.io.Serializable {
    /* A Mobile Equipment IDentifier (MEID) is a globally unique number
     * for a physical piece of mobile station equipment. Equipment identifiers
     * are 'burned' into a CDMA device, and should be resistant to modification.
     * The ESN will migrate to the MEID with assignments anticipated to begin
     * in the 2004 to 2005 timeframe.   This is the 18 character decimal
     * representation. */
    private java.lang.String mobileEquipmentIdentifierDec;

    /* A Mobile Equipment IDentifier (MEID) is a globally unique number
     * for a  physical piece of mobile station equipment. Equipment identifiers
     * are 'burned' into a CDMA device, and should be resistant to modification.
     * The ESN will migrate to the MEID with assignments anticipated to begin
     * in the 2004 to 2005 timeframe.  This is the 14 character hexidecimal
     * representation. */
    private java.lang.String mobileEquipmentIdentifierHex;

    public MobileEquipmentIdentifier() {
    }

    public MobileEquipmentIdentifier(
           java.lang.String mobileEquipmentIdentifierDec,
           java.lang.String mobileEquipmentIdentifierHex) {
           this.mobileEquipmentIdentifierDec = mobileEquipmentIdentifierDec;
           this.mobileEquipmentIdentifierHex = mobileEquipmentIdentifierHex;
    }


    /**
     * Gets the mobileEquipmentIdentifierDec value for this MobileEquipmentIdentifier.
     * 
     * @return mobileEquipmentIdentifierDec   * A Mobile Equipment IDentifier (MEID) is a globally unique number
     * for a physical piece of mobile station equipment. Equipment identifiers
     * are 'burned' into a CDMA device, and should be resistant to modification.
     * The ESN will migrate to the MEID with assignments anticipated to begin
     * in the 2004 to 2005 timeframe.   This is the 18 character decimal
     * representation.
     */
    public java.lang.String getMobileEquipmentIdentifierDec() {
        return mobileEquipmentIdentifierDec;
    }


    /**
     * Sets the mobileEquipmentIdentifierDec value for this MobileEquipmentIdentifier.
     * 
     * @param mobileEquipmentIdentifierDec   * A Mobile Equipment IDentifier (MEID) is a globally unique number
     * for a physical piece of mobile station equipment. Equipment identifiers
     * are 'burned' into a CDMA device, and should be resistant to modification.
     * The ESN will migrate to the MEID with assignments anticipated to begin
     * in the 2004 to 2005 timeframe.   This is the 18 character decimal
     * representation.
     */
    public void setMobileEquipmentIdentifierDec(java.lang.String mobileEquipmentIdentifierDec) {
        this.mobileEquipmentIdentifierDec = mobileEquipmentIdentifierDec;
    }


    /**
     * Gets the mobileEquipmentIdentifierHex value for this MobileEquipmentIdentifier.
     * 
     * @return mobileEquipmentIdentifierHex   * A Mobile Equipment IDentifier (MEID) is a globally unique number
     * for a  physical piece of mobile station equipment. Equipment identifiers
     * are 'burned' into a CDMA device, and should be resistant to modification.
     * The ESN will migrate to the MEID with assignments anticipated to begin
     * in the 2004 to 2005 timeframe.  This is the 14 character hexidecimal
     * representation.
     */
    public java.lang.String getMobileEquipmentIdentifierHex() {
        return mobileEquipmentIdentifierHex;
    }


    /**
     * Sets the mobileEquipmentIdentifierHex value for this MobileEquipmentIdentifier.
     * 
     * @param mobileEquipmentIdentifierHex   * A Mobile Equipment IDentifier (MEID) is a globally unique number
     * for a  physical piece of mobile station equipment. Equipment identifiers
     * are 'burned' into a CDMA device, and should be resistant to modification.
     * The ESN will migrate to the MEID with assignments anticipated to begin
     * in the 2004 to 2005 timeframe.  This is the 14 character hexidecimal
     * representation.
     */
    public void setMobileEquipmentIdentifierHex(java.lang.String mobileEquipmentIdentifierHex) {
        this.mobileEquipmentIdentifierHex = mobileEquipmentIdentifierHex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileEquipmentIdentifier)) return false;
        MobileEquipmentIdentifier other = (MobileEquipmentIdentifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mobileEquipmentIdentifierDec==null && other.getMobileEquipmentIdentifierDec()==null) || 
             (this.mobileEquipmentIdentifierDec!=null &&
              this.mobileEquipmentIdentifierDec.equals(other.getMobileEquipmentIdentifierDec()))) &&
            ((this.mobileEquipmentIdentifierHex==null && other.getMobileEquipmentIdentifierHex()==null) || 
             (this.mobileEquipmentIdentifierHex!=null &&
              this.mobileEquipmentIdentifierHex.equals(other.getMobileEquipmentIdentifierHex())));
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
        if (getMobileEquipmentIdentifierDec() != null) {
            _hashCode += getMobileEquipmentIdentifierDec().hashCode();
        }
        if (getMobileEquipmentIdentifierHex() != null) {
            _hashCode += getMobileEquipmentIdentifierHex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileEquipmentIdentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "MobileEquipmentIdentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileEquipmentIdentifierDec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "mobileEquipmentIdentifierDec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileEquipmentIdentifierHex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "mobileEquipmentIdentifierHex"));
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
