/**
 * ElectronicSerialNumber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd;


/**
 * Electronic Serial Number is a unique number that is embedded electronically
 * by the manufacturer into a CDMA wireless communication device that
 * identifies that individual unit. It can be represented in 11-digit
 * decimal or 8-digit hexadecimal (HEX) format. Once ESNs are exhausted,
 * MEIDs are embedded in devices to uniquely identify the device.
 */
public class ElectronicSerialNumber  implements java.io.Serializable {
    /* Electronic Serial Number is a unique number that is embedded
     * electronically by the manufacturer into a CDMA wireless communication
     * device that identifies that individual unit. It can be represented
     * in 11-digit decimal or 8-digit hexadecimal (HEX) format. Once ESNs
     * are exhausted, MEIDs are embedded in devices to uniquely identify
     * the device.   This is the 11 digit decimal representation. */
    private java.lang.String electronicSerialNumberDec;

    /* Electronic Serial Number is a unique number that is embedded
     * electronically by the manufacturer into a CDMA wireless communication
     * device that identifies that individual unit. It can be represented
     * in 11-digit decimal or 8-digit hexadecimal (HEX) format. Once ESNs
     * are exhausted, MEIDs are embedded in devices to uniquely identify
     * the device. This is the 8 digit hexidecimal representation. */
    private java.lang.String electronicSerialNumberHex;

    public ElectronicSerialNumber() {
    }

    public ElectronicSerialNumber(
           java.lang.String electronicSerialNumberDec,
           java.lang.String electronicSerialNumberHex) {
           this.electronicSerialNumberDec = electronicSerialNumberDec;
           this.electronicSerialNumberHex = electronicSerialNumberHex;
    }


    /**
     * Gets the electronicSerialNumberDec value for this ElectronicSerialNumber.
     * 
     * @return electronicSerialNumberDec   * Electronic Serial Number is a unique number that is embedded
     * electronically by the manufacturer into a CDMA wireless communication
     * device that identifies that individual unit. It can be represented
     * in 11-digit decimal or 8-digit hexadecimal (HEX) format. Once ESNs
     * are exhausted, MEIDs are embedded in devices to uniquely identify
     * the device.   This is the 11 digit decimal representation.
     */
    public java.lang.String getElectronicSerialNumberDec() {
        return electronicSerialNumberDec;
    }


    /**
     * Sets the electronicSerialNumberDec value for this ElectronicSerialNumber.
     * 
     * @param electronicSerialNumberDec   * Electronic Serial Number is a unique number that is embedded
     * electronically by the manufacturer into a CDMA wireless communication
     * device that identifies that individual unit. It can be represented
     * in 11-digit decimal or 8-digit hexadecimal (HEX) format. Once ESNs
     * are exhausted, MEIDs are embedded in devices to uniquely identify
     * the device.   This is the 11 digit decimal representation.
     */
    public void setElectronicSerialNumberDec(java.lang.String electronicSerialNumberDec) {
        this.electronicSerialNumberDec = electronicSerialNumberDec;
    }


    /**
     * Gets the electronicSerialNumberHex value for this ElectronicSerialNumber.
     * 
     * @return electronicSerialNumberHex   * Electronic Serial Number is a unique number that is embedded
     * electronically by the manufacturer into a CDMA wireless communication
     * device that identifies that individual unit. It can be represented
     * in 11-digit decimal or 8-digit hexadecimal (HEX) format. Once ESNs
     * are exhausted, MEIDs are embedded in devices to uniquely identify
     * the device. This is the 8 digit hexidecimal representation.
     */
    public java.lang.String getElectronicSerialNumberHex() {
        return electronicSerialNumberHex;
    }


    /**
     * Sets the electronicSerialNumberHex value for this ElectronicSerialNumber.
     * 
     * @param electronicSerialNumberHex   * Electronic Serial Number is a unique number that is embedded
     * electronically by the manufacturer into a CDMA wireless communication
     * device that identifies that individual unit. It can be represented
     * in 11-digit decimal or 8-digit hexadecimal (HEX) format. Once ESNs
     * are exhausted, MEIDs are embedded in devices to uniquely identify
     * the device. This is the 8 digit hexidecimal representation.
     */
    public void setElectronicSerialNumberHex(java.lang.String electronicSerialNumberHex) {
        this.electronicSerialNumberHex = electronicSerialNumberHex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElectronicSerialNumber)) return false;
        ElectronicSerialNumber other = (ElectronicSerialNumber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.electronicSerialNumberDec==null && other.getElectronicSerialNumberDec()==null) || 
             (this.electronicSerialNumberDec!=null &&
              this.electronicSerialNumberDec.equals(other.getElectronicSerialNumberDec()))) &&
            ((this.electronicSerialNumberHex==null && other.getElectronicSerialNumberHex()==null) || 
             (this.electronicSerialNumberHex!=null &&
              this.electronicSerialNumberHex.equals(other.getElectronicSerialNumberHex())));
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
        if (getElectronicSerialNumberDec() != null) {
            _hashCode += getElectronicSerialNumberDec().hashCode();
        }
        if (getElectronicSerialNumberHex() != null) {
            _hashCode += getElectronicSerialNumberHex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElectronicSerialNumber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "ElectronicSerialNumber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("electronicSerialNumberDec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "electronicSerialNumberDec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("electronicSerialNumberHex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "electronicSerialNumberHex"));
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
