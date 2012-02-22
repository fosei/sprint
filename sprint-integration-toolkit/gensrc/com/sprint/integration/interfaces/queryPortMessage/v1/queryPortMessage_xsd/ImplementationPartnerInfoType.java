/**
 * ImplementationPartnerInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class ImplementationPartnerInfoType  implements java.io.Serializable {
    /* Implementation Contact 
     * Name of representative or port center in control of port. Used for
     * the old service provider point of contact in resolving an issue. */
    private java.lang.String contactName;

    /* Telephone Number Implementation Contact - Telephone number
     * for the contact.
     * 
     * Format:
     * NPA-NXX-LLLL-XXXX or NPA-NXX-LLLL */
    private java.lang.String contactPhone;

    public ImplementationPartnerInfoType() {
    }

    public ImplementationPartnerInfoType(
           java.lang.String contactName,
           java.lang.String contactPhone) {
           this.contactName = contactName;
           this.contactPhone = contactPhone;
    }


    /**
     * Gets the contactName value for this ImplementationPartnerInfoType.
     * 
     * @return contactName   * Implementation Contact 
     * Name of representative or port center in control of port. Used for
     * the old service provider point of contact in resolving an issue.
     */
    public java.lang.String getContactName() {
        return contactName;
    }


    /**
     * Sets the contactName value for this ImplementationPartnerInfoType.
     * 
     * @param contactName   * Implementation Contact 
     * Name of representative or port center in control of port. Used for
     * the old service provider point of contact in resolving an issue.
     */
    public void setContactName(java.lang.String contactName) {
        this.contactName = contactName;
    }


    /**
     * Gets the contactPhone value for this ImplementationPartnerInfoType.
     * 
     * @return contactPhone   * Telephone Number Implementation Contact - Telephone number
     * for the contact.
     * 
     * Format:
     * NPA-NXX-LLLL-XXXX or NPA-NXX-LLLL
     */
    public java.lang.String getContactPhone() {
        return contactPhone;
    }


    /**
     * Sets the contactPhone value for this ImplementationPartnerInfoType.
     * 
     * @param contactPhone   * Telephone Number Implementation Contact - Telephone number
     * for the contact.
     * 
     * Format:
     * NPA-NXX-LLLL-XXXX or NPA-NXX-LLLL
     */
    public void setContactPhone(java.lang.String contactPhone) {
        this.contactPhone = contactPhone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImplementationPartnerInfoType)) return false;
        ImplementationPartnerInfoType other = (ImplementationPartnerInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contactName==null && other.getContactName()==null) || 
             (this.contactName!=null &&
              this.contactName.equals(other.getContactName()))) &&
            ((this.contactPhone==null && other.getContactPhone()==null) || 
             (this.contactPhone!=null &&
              this.contactPhone.equals(other.getContactPhone())));
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
        if (getContactName() != null) {
            _hashCode += getContactName().hashCode();
        }
        if (getContactPhone() != null) {
            _hashCode += getContactPhone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImplementationPartnerInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "ImplementationPartnerInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "contactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "contactPhone"));
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
