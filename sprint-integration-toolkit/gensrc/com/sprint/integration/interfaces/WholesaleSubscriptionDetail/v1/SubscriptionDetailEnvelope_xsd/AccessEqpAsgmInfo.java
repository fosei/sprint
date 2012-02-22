/**
 * AccessEqpAsgmInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd;

public class AccessEqpAsgmInfo  implements java.io.Serializable {
    private java.lang.String esnMeidDeclId;

    private java.lang.String esnMeidHexId;

    private java.util.Date effectiveDate;

    private org.apache.axis.types.Time effectiveTime;

    private java.util.Date expirationDate;

    public AccessEqpAsgmInfo() {
    }

    public AccessEqpAsgmInfo(
           java.lang.String esnMeidDeclId,
           java.lang.String esnMeidHexId,
           java.util.Date effectiveDate,
           org.apache.axis.types.Time effectiveTime,
           java.util.Date expirationDate) {
           this.esnMeidDeclId = esnMeidDeclId;
           this.esnMeidHexId = esnMeidHexId;
           this.effectiveDate = effectiveDate;
           this.effectiveTime = effectiveTime;
           this.expirationDate = expirationDate;
    }


    /**
     * Gets the esnMeidDeclId value for this AccessEqpAsgmInfo.
     * 
     * @return esnMeidDeclId
     */
    public java.lang.String getEsnMeidDeclId() {
        return esnMeidDeclId;
    }


    /**
     * Sets the esnMeidDeclId value for this AccessEqpAsgmInfo.
     * 
     * @param esnMeidDeclId
     */
    public void setEsnMeidDeclId(java.lang.String esnMeidDeclId) {
        this.esnMeidDeclId = esnMeidDeclId;
    }


    /**
     * Gets the esnMeidHexId value for this AccessEqpAsgmInfo.
     * 
     * @return esnMeidHexId
     */
    public java.lang.String getEsnMeidHexId() {
        return esnMeidHexId;
    }


    /**
     * Sets the esnMeidHexId value for this AccessEqpAsgmInfo.
     * 
     * @param esnMeidHexId
     */
    public void setEsnMeidHexId(java.lang.String esnMeidHexId) {
        this.esnMeidHexId = esnMeidHexId;
    }


    /**
     * Gets the effectiveDate value for this AccessEqpAsgmInfo.
     * 
     * @return effectiveDate
     */
    public java.util.Date getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this AccessEqpAsgmInfo.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the effectiveTime value for this AccessEqpAsgmInfo.
     * 
     * @return effectiveTime
     */
    public org.apache.axis.types.Time getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this AccessEqpAsgmInfo.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(org.apache.axis.types.Time effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expirationDate value for this AccessEqpAsgmInfo.
     * 
     * @return expirationDate
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this AccessEqpAsgmInfo.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccessEqpAsgmInfo)) return false;
        AccessEqpAsgmInfo other = (AccessEqpAsgmInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.esnMeidDeclId==null && other.getEsnMeidDeclId()==null) || 
             (this.esnMeidDeclId!=null &&
              this.esnMeidDeclId.equals(other.getEsnMeidDeclId()))) &&
            ((this.esnMeidHexId==null && other.getEsnMeidHexId()==null) || 
             (this.esnMeidHexId!=null &&
              this.esnMeidHexId.equals(other.getEsnMeidHexId()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate())));
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
        if (getEsnMeidDeclId() != null) {
            _hashCode += getEsnMeidDeclId().hashCode();
        }
        if (getEsnMeidHexId() != null) {
            _hashCode += getEsnMeidHexId().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getEffectiveTime() != null) {
            _hashCode += getEffectiveTime().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccessEqpAsgmInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "AccessEqpAsgmInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esnMeidDeclId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "esnMeidDeclId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esnMeidHexId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "esnMeidHexId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "effectiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "EffectiveTime"));
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
