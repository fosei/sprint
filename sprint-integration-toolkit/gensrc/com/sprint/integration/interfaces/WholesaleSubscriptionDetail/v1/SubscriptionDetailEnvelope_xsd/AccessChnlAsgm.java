/**
 * AccessChnlAsgm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd;

public class AccessChnlAsgm  implements java.io.Serializable {
    private java.util.Date effectiveDate;

    private java.util.Date expirationDate;

    private java.lang.String networkStatusCode;

    private java.lang.String naiValue;

    private java.lang.String serviceAttributeTypeCode;

    public AccessChnlAsgm() {
    }

    public AccessChnlAsgm(
           java.util.Date effectiveDate,
           java.util.Date expirationDate,
           java.lang.String networkStatusCode,
           java.lang.String naiValue,
           java.lang.String serviceAttributeTypeCode) {
           this.effectiveDate = effectiveDate;
           this.expirationDate = expirationDate;
           this.networkStatusCode = networkStatusCode;
           this.naiValue = naiValue;
           this.serviceAttributeTypeCode = serviceAttributeTypeCode;
    }


    /**
     * Gets the effectiveDate value for this AccessChnlAsgm.
     * 
     * @return effectiveDate
     */
    public java.util.Date getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this AccessChnlAsgm.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expirationDate value for this AccessChnlAsgm.
     * 
     * @return expirationDate
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this AccessChnlAsgm.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the networkStatusCode value for this AccessChnlAsgm.
     * 
     * @return networkStatusCode
     */
    public java.lang.String getNetworkStatusCode() {
        return networkStatusCode;
    }


    /**
     * Sets the networkStatusCode value for this AccessChnlAsgm.
     * 
     * @param networkStatusCode
     */
    public void setNetworkStatusCode(java.lang.String networkStatusCode) {
        this.networkStatusCode = networkStatusCode;
    }


    /**
     * Gets the naiValue value for this AccessChnlAsgm.
     * 
     * @return naiValue
     */
    public java.lang.String getNaiValue() {
        return naiValue;
    }


    /**
     * Sets the naiValue value for this AccessChnlAsgm.
     * 
     * @param naiValue
     */
    public void setNaiValue(java.lang.String naiValue) {
        this.naiValue = naiValue;
    }


    /**
     * Gets the serviceAttributeTypeCode value for this AccessChnlAsgm.
     * 
     * @return serviceAttributeTypeCode
     */
    public java.lang.String getServiceAttributeTypeCode() {
        return serviceAttributeTypeCode;
    }


    /**
     * Sets the serviceAttributeTypeCode value for this AccessChnlAsgm.
     * 
     * @param serviceAttributeTypeCode
     */
    public void setServiceAttributeTypeCode(java.lang.String serviceAttributeTypeCode) {
        this.serviceAttributeTypeCode = serviceAttributeTypeCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccessChnlAsgm)) return false;
        AccessChnlAsgm other = (AccessChnlAsgm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.networkStatusCode==null && other.getNetworkStatusCode()==null) || 
             (this.networkStatusCode!=null &&
              this.networkStatusCode.equals(other.getNetworkStatusCode()))) &&
            ((this.naiValue==null && other.getNaiValue()==null) || 
             (this.naiValue!=null &&
              this.naiValue.equals(other.getNaiValue()))) &&
            ((this.serviceAttributeTypeCode==null && other.getServiceAttributeTypeCode()==null) || 
             (this.serviceAttributeTypeCode!=null &&
              this.serviceAttributeTypeCode.equals(other.getServiceAttributeTypeCode())));
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
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getNetworkStatusCode() != null) {
            _hashCode += getNetworkStatusCode().hashCode();
        }
        if (getNaiValue() != null) {
            _hashCode += getNaiValue().hashCode();
        }
        if (getServiceAttributeTypeCode() != null) {
            _hashCode += getServiceAttributeTypeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccessChnlAsgm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "AccessChnlAsgm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "networkStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naiValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "naiValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceAttributeTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "serviceAttributeTypeCode"));
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
