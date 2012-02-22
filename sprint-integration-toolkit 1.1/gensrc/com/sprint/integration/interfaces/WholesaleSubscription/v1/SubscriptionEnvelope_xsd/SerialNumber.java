/**
 * SerialNumber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd;


/**
 * Serial Number is a valid Electronic Serial Number or Mobile Eequipment
 * Identifier in either decimal or hex format.
 */
public class SerialNumber  implements java.io.Serializable {
    private com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ElectronicSerialNumber electronicSerialNumber;

    private com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.MobileEquipmentIdentifier mobileEquipmentIdentifier;

    public SerialNumber() {
    }

    public SerialNumber(
           com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ElectronicSerialNumber electronicSerialNumber,
           com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.MobileEquipmentIdentifier mobileEquipmentIdentifier) {
           this.electronicSerialNumber = electronicSerialNumber;
           this.mobileEquipmentIdentifier = mobileEquipmentIdentifier;
    }


    /**
     * Gets the electronicSerialNumber value for this SerialNumber.
     * 
     * @return electronicSerialNumber
     */
    public com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ElectronicSerialNumber getElectronicSerialNumber() {
        return electronicSerialNumber;
    }


    /**
     * Sets the electronicSerialNumber value for this SerialNumber.
     * 
     * @param electronicSerialNumber
     */
    public void setElectronicSerialNumber(com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ElectronicSerialNumber electronicSerialNumber) {
        this.electronicSerialNumber = electronicSerialNumber;
    }


    /**
     * Gets the mobileEquipmentIdentifier value for this SerialNumber.
     * 
     * @return mobileEquipmentIdentifier
     */
    public com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.MobileEquipmentIdentifier getMobileEquipmentIdentifier() {
        return mobileEquipmentIdentifier;
    }


    /**
     * Sets the mobileEquipmentIdentifier value for this SerialNumber.
     * 
     * @param mobileEquipmentIdentifier
     */
    public void setMobileEquipmentIdentifier(com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.MobileEquipmentIdentifier mobileEquipmentIdentifier) {
        this.mobileEquipmentIdentifier = mobileEquipmentIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SerialNumber)) return false;
        SerialNumber other = (SerialNumber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.electronicSerialNumber==null && other.getElectronicSerialNumber()==null) || 
             (this.electronicSerialNumber!=null &&
              this.electronicSerialNumber.equals(other.getElectronicSerialNumber()))) &&
            ((this.mobileEquipmentIdentifier==null && other.getMobileEquipmentIdentifier()==null) || 
             (this.mobileEquipmentIdentifier!=null &&
              this.mobileEquipmentIdentifier.equals(other.getMobileEquipmentIdentifier())));
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
        if (getElectronicSerialNumber() != null) {
            _hashCode += getElectronicSerialNumber().hashCode();
        }
        if (getMobileEquipmentIdentifier() != null) {
            _hashCode += getMobileEquipmentIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SerialNumber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "SerialNumber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("electronicSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "electronicSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "ElectronicSerialNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileEquipmentIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "mobileEquipmentIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "MobileEquipmentIdentifier"));
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
