/**
 * ServiceRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd;


/**
 * A line item record of a price plan or a service.
 */
public class ServiceRecord  implements java.io.Serializable {
    private java.lang.String serviceCode;

    /* Service Description */
    private java.lang.String serviceDescription;

    private java.util.Date effectiveDate;

    private java.util.Date expirationDate;

    private java.lang.String callForwardingNumber;

    /* Sequence of 0 to many Member Service records which contain
     * the service description for a package’s member service(s). This is
     * only provided when returning information in this record for a package
     * service. */
    private java.lang.String[] serviceDescriptionList;

    public ServiceRecord() {
    }

    public ServiceRecord(
           java.lang.String serviceCode,
           java.lang.String serviceDescription,
           java.util.Date effectiveDate,
           java.util.Date expirationDate,
           java.lang.String callForwardingNumber,
           java.lang.String[] serviceDescriptionList) {
           this.serviceCode = serviceCode;
           this.serviceDescription = serviceDescription;
           this.effectiveDate = effectiveDate;
           this.expirationDate = expirationDate;
           this.callForwardingNumber = callForwardingNumber;
           this.serviceDescriptionList = serviceDescriptionList;
    }


    /**
     * Gets the serviceCode value for this ServiceRecord.
     * 
     * @return serviceCode
     */
    public java.lang.String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this ServiceRecord.
     * 
     * @param serviceCode
     */
    public void setServiceCode(java.lang.String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the serviceDescription value for this ServiceRecord.
     * 
     * @return serviceDescription   * Service Description
     */
    public java.lang.String getServiceDescription() {
        return serviceDescription;
    }


    /**
     * Sets the serviceDescription value for this ServiceRecord.
     * 
     * @param serviceDescription   * Service Description
     */
    public void setServiceDescription(java.lang.String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }


    /**
     * Gets the effectiveDate value for this ServiceRecord.
     * 
     * @return effectiveDate
     */
    public java.util.Date getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ServiceRecord.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expirationDate value for this ServiceRecord.
     * 
     * @return expirationDate
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this ServiceRecord.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the callForwardingNumber value for this ServiceRecord.
     * 
     * @return callForwardingNumber
     */
    public java.lang.String getCallForwardingNumber() {
        return callForwardingNumber;
    }


    /**
     * Sets the callForwardingNumber value for this ServiceRecord.
     * 
     * @param callForwardingNumber
     */
    public void setCallForwardingNumber(java.lang.String callForwardingNumber) {
        this.callForwardingNumber = callForwardingNumber;
    }


    /**
     * Gets the serviceDescriptionList value for this ServiceRecord.
     * 
     * @return serviceDescriptionList   * Sequence of 0 to many Member Service records which contain
     * the service description for a package’s member service(s). This is
     * only provided when returning information in this record for a package
     * service.
     */
    public java.lang.String[] getServiceDescriptionList() {
        return serviceDescriptionList;
    }


    /**
     * Sets the serviceDescriptionList value for this ServiceRecord.
     * 
     * @param serviceDescriptionList   * Sequence of 0 to many Member Service records which contain
     * the service description for a package’s member service(s). This is
     * only provided when returning information in this record for a package
     * service.
     */
    public void setServiceDescriptionList(java.lang.String[] serviceDescriptionList) {
        this.serviceDescriptionList = serviceDescriptionList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceRecord)) return false;
        ServiceRecord other = (ServiceRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceCode==null && other.getServiceCode()==null) || 
             (this.serviceCode!=null &&
              this.serviceCode.equals(other.getServiceCode()))) &&
            ((this.serviceDescription==null && other.getServiceDescription()==null) || 
             (this.serviceDescription!=null &&
              this.serviceDescription.equals(other.getServiceDescription()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.callForwardingNumber==null && other.getCallForwardingNumber()==null) || 
             (this.callForwardingNumber!=null &&
              this.callForwardingNumber.equals(other.getCallForwardingNumber()))) &&
            ((this.serviceDescriptionList==null && other.getServiceDescriptionList()==null) || 
             (this.serviceDescriptionList!=null &&
              java.util.Arrays.equals(this.serviceDescriptionList, other.getServiceDescriptionList())));
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
        if (getServiceCode() != null) {
            _hashCode += getServiceCode().hashCode();
        }
        if (getServiceDescription() != null) {
            _hashCode += getServiceDescription().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getCallForwardingNumber() != null) {
            _hashCode += getCallForwardingNumber().hashCode();
        }
        if (getServiceDescriptionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceDescriptionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceDescriptionList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "ServiceRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "serviceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "ProductId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "serviceDescription"));
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
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callForwardingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "callForwardingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDescriptionList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "serviceDescriptionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "ServiceDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "serviceDescription"));
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
