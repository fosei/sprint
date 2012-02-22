/**
 * SocProfileRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd;

public class SocProfileRecord  implements java.io.Serializable {
    private java.lang.String soc;

    private java.util.Date effectiveDate;

    private java.lang.String serviceCode;

    private java.lang.String socStatus;

    private java.util.Date saleEffectiveDate;

    private java.util.Date saleExpireDate;

    private java.lang.String socDescription;

    private java.util.Date expirationDate;

    private java.lang.String serviceType;

    public SocProfileRecord() {
    }

    public SocProfileRecord(
           java.lang.String soc,
           java.util.Date effectiveDate,
           java.lang.String serviceCode,
           java.lang.String socStatus,
           java.util.Date saleEffectiveDate,
           java.util.Date saleExpireDate,
           java.lang.String socDescription,
           java.util.Date expirationDate,
           java.lang.String serviceType) {
           this.soc = soc;
           this.effectiveDate = effectiveDate;
           this.serviceCode = serviceCode;
           this.socStatus = socStatus;
           this.saleEffectiveDate = saleEffectiveDate;
           this.saleExpireDate = saleExpireDate;
           this.socDescription = socDescription;
           this.expirationDate = expirationDate;
           this.serviceType = serviceType;
    }


    /**
     * Gets the soc value for this SocProfileRecord.
     * 
     * @return soc
     */
    public java.lang.String getSoc() {
        return soc;
    }


    /**
     * Sets the soc value for this SocProfileRecord.
     * 
     * @param soc
     */
    public void setSoc(java.lang.String soc) {
        this.soc = soc;
    }


    /**
     * Gets the effectiveDate value for this SocProfileRecord.
     * 
     * @return effectiveDate
     */
    public java.util.Date getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this SocProfileRecord.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the serviceCode value for this SocProfileRecord.
     * 
     * @return serviceCode
     */
    public java.lang.String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this SocProfileRecord.
     * 
     * @param serviceCode
     */
    public void setServiceCode(java.lang.String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the socStatus value for this SocProfileRecord.
     * 
     * @return socStatus
     */
    public java.lang.String getSocStatus() {
        return socStatus;
    }


    /**
     * Sets the socStatus value for this SocProfileRecord.
     * 
     * @param socStatus
     */
    public void setSocStatus(java.lang.String socStatus) {
        this.socStatus = socStatus;
    }


    /**
     * Gets the saleEffectiveDate value for this SocProfileRecord.
     * 
     * @return saleEffectiveDate
     */
    public java.util.Date getSaleEffectiveDate() {
        return saleEffectiveDate;
    }


    /**
     * Sets the saleEffectiveDate value for this SocProfileRecord.
     * 
     * @param saleEffectiveDate
     */
    public void setSaleEffectiveDate(java.util.Date saleEffectiveDate) {
        this.saleEffectiveDate = saleEffectiveDate;
    }


    /**
     * Gets the saleExpireDate value for this SocProfileRecord.
     * 
     * @return saleExpireDate
     */
    public java.util.Date getSaleExpireDate() {
        return saleExpireDate;
    }


    /**
     * Sets the saleExpireDate value for this SocProfileRecord.
     * 
     * @param saleExpireDate
     */
    public void setSaleExpireDate(java.util.Date saleExpireDate) {
        this.saleExpireDate = saleExpireDate;
    }


    /**
     * Gets the socDescription value for this SocProfileRecord.
     * 
     * @return socDescription
     */
    public java.lang.String getSocDescription() {
        return socDescription;
    }


    /**
     * Sets the socDescription value for this SocProfileRecord.
     * 
     * @param socDescription
     */
    public void setSocDescription(java.lang.String socDescription) {
        this.socDescription = socDescription;
    }


    /**
     * Gets the expirationDate value for this SocProfileRecord.
     * 
     * @return expirationDate
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this SocProfileRecord.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the serviceType value for this SocProfileRecord.
     * 
     * @return serviceType
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this SocProfileRecord.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SocProfileRecord)) return false;
        SocProfileRecord other = (SocProfileRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.soc==null && other.getSoc()==null) || 
             (this.soc!=null &&
              this.soc.equals(other.getSoc()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.serviceCode==null && other.getServiceCode()==null) || 
             (this.serviceCode!=null &&
              this.serviceCode.equals(other.getServiceCode()))) &&
            ((this.socStatus==null && other.getSocStatus()==null) || 
             (this.socStatus!=null &&
              this.socStatus.equals(other.getSocStatus()))) &&
            ((this.saleEffectiveDate==null && other.getSaleEffectiveDate()==null) || 
             (this.saleEffectiveDate!=null &&
              this.saleEffectiveDate.equals(other.getSaleEffectiveDate()))) &&
            ((this.saleExpireDate==null && other.getSaleExpireDate()==null) || 
             (this.saleExpireDate!=null &&
              this.saleExpireDate.equals(other.getSaleExpireDate()))) &&
            ((this.socDescription==null && other.getSocDescription()==null) || 
             (this.socDescription!=null &&
              this.socDescription.equals(other.getSocDescription()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType())));
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
        if (getSoc() != null) {
            _hashCode += getSoc().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getServiceCode() != null) {
            _hashCode += getServiceCode().hashCode();
        }
        if (getSocStatus() != null) {
            _hashCode += getSocStatus().hashCode();
        }
        if (getSaleEffectiveDate() != null) {
            _hashCode += getSaleEffectiveDate().hashCode();
        }
        if (getSaleExpireDate() != null) {
            _hashCode += getSaleExpireDate().hashCode();
        }
        if (getSocDescription() != null) {
            _hashCode += getSocDescription().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SocProfileRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "SocProfileRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "soc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "ProductId"));
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
        elemField.setFieldName("serviceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "serviceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "ProductId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "socStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "StatusCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "saleEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "saleExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "socDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "ProductDescription"));
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
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "serviceType"));
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
