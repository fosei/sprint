/**
 * CsaRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd;


/**
 * Sequence of 0 to many CSA records, including subMktCode and description.
 */
public class CsaRecord  implements java.io.Serializable {
    /* Communication service area (CSA) returned to P2K by EI. */
    private java.lang.String csa;

    /* CSA description returned to P2K by EI. */
    private java.lang.String csaDescription;

    public CsaRecord() {
    }

    public CsaRecord(
           java.lang.String csa,
           java.lang.String csaDescription) {
           this.csa = csa;
           this.csaDescription = csaDescription;
    }


    /**
     * Gets the csa value for this CsaRecord.
     * 
     * @return csa   * Communication service area (CSA) returned to P2K by EI.
     */
    public java.lang.String getCsa() {
        return csa;
    }


    /**
     * Sets the csa value for this CsaRecord.
     * 
     * @param csa   * Communication service area (CSA) returned to P2K by EI.
     */
    public void setCsa(java.lang.String csa) {
        this.csa = csa;
    }


    /**
     * Gets the csaDescription value for this CsaRecord.
     * 
     * @return csaDescription   * CSA description returned to P2K by EI.
     */
    public java.lang.String getCsaDescription() {
        return csaDescription;
    }


    /**
     * Sets the csaDescription value for this CsaRecord.
     * 
     * @param csaDescription   * CSA description returned to P2K by EI.
     */
    public void setCsaDescription(java.lang.String csaDescription) {
        this.csaDescription = csaDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CsaRecord)) return false;
        CsaRecord other = (CsaRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.csa==null && other.getCsa()==null) || 
             (this.csa!=null &&
              this.csa.equals(other.getCsa()))) &&
            ((this.csaDescription==null && other.getCsaDescription()==null) || 
             (this.csaDescription!=null &&
              this.csaDescription.equals(other.getCsaDescription())));
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
        if (getCsa() != null) {
            _hashCode += getCsa().hashCode();
        }
        if (getCsaDescription() != null) {
            _hashCode += getCsaDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CsaRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "CsaRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "csa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csaDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "csaDescription"));
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
