/**
 * QuerySubscriptionUsageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd;


/**
 * This API is used to view usage associated with the active subscription
 * for a given MDN/ESN.
 */
public class QuerySubscriptionUsageRequest  implements java.io.Serializable {
    private com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.SerialNumber esn;

    private java.util.Date prevEndingCallDate;

    private org.apache.axis.types.Time prevEndingCallTime;

    private com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.UsageCategory usageCategory;

    private java.lang.String mdn;

    private java.util.Date fromDate;

    private java.util.Date toDate;

    private com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.UsageTypeCode usageType;

    public QuerySubscriptionUsageRequest() {
    }

    public QuerySubscriptionUsageRequest(
           com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.SerialNumber esn,
           java.util.Date prevEndingCallDate,
           org.apache.axis.types.Time prevEndingCallTime,
           com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.UsageCategory usageCategory,
           java.lang.String mdn,
           java.util.Date fromDate,
           java.util.Date toDate,
           com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.UsageTypeCode usageType) {
           this.esn = esn;
           this.prevEndingCallDate = prevEndingCallDate;
           this.prevEndingCallTime = prevEndingCallTime;
           this.usageCategory = usageCategory;
           this.mdn = mdn;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.usageType = usageType;
    }


    /**
     * Gets the esn value for this QuerySubscriptionUsageRequest.
     * 
     * @return esn
     */
    public com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.SerialNumber getEsn() {
        return esn;
    }


    /**
     * Sets the esn value for this QuerySubscriptionUsageRequest.
     * 
     * @param esn
     */
    public void setEsn(com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.SerialNumber esn) {
        this.esn = esn;
    }


    /**
     * Gets the prevEndingCallDate value for this QuerySubscriptionUsageRequest.
     * 
     * @return prevEndingCallDate
     */
    public java.util.Date getPrevEndingCallDate() {
        return prevEndingCallDate;
    }


    /**
     * Sets the prevEndingCallDate value for this QuerySubscriptionUsageRequest.
     * 
     * @param prevEndingCallDate
     */
    public void setPrevEndingCallDate(java.util.Date prevEndingCallDate) {
        this.prevEndingCallDate = prevEndingCallDate;
    }


    /**
     * Gets the prevEndingCallTime value for this QuerySubscriptionUsageRequest.
     * 
     * @return prevEndingCallTime
     */
    public org.apache.axis.types.Time getPrevEndingCallTime() {
        return prevEndingCallTime;
    }


    /**
     * Sets the prevEndingCallTime value for this QuerySubscriptionUsageRequest.
     * 
     * @param prevEndingCallTime
     */
    public void setPrevEndingCallTime(org.apache.axis.types.Time prevEndingCallTime) {
        this.prevEndingCallTime = prevEndingCallTime;
    }


    /**
     * Gets the usageCategory value for this QuerySubscriptionUsageRequest.
     * 
     * @return usageCategory
     */
    public com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.UsageCategory getUsageCategory() {
        return usageCategory;
    }


    /**
     * Sets the usageCategory value for this QuerySubscriptionUsageRequest.
     * 
     * @param usageCategory
     */
    public void setUsageCategory(com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.UsageCategory usageCategory) {
        this.usageCategory = usageCategory;
    }


    /**
     * Gets the mdn value for this QuerySubscriptionUsageRequest.
     * 
     * @return mdn
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this QuerySubscriptionUsageRequest.
     * 
     * @param mdn
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the fromDate value for this QuerySubscriptionUsageRequest.
     * 
     * @return fromDate
     */
    public java.util.Date getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this QuerySubscriptionUsageRequest.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Date fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this QuerySubscriptionUsageRequest.
     * 
     * @return toDate
     */
    public java.util.Date getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this QuerySubscriptionUsageRequest.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Date toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the usageType value for this QuerySubscriptionUsageRequest.
     * 
     * @return usageType
     */
    public com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.UsageTypeCode getUsageType() {
        return usageType;
    }


    /**
     * Sets the usageType value for this QuerySubscriptionUsageRequest.
     * 
     * @param usageType
     */
    public void setUsageType(com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.UsageTypeCode usageType) {
        this.usageType = usageType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubscriptionUsageRequest)) return false;
        QuerySubscriptionUsageRequest other = (QuerySubscriptionUsageRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.esn==null && other.getEsn()==null) || 
             (this.esn!=null &&
              this.esn.equals(other.getEsn()))) &&
            ((this.prevEndingCallDate==null && other.getPrevEndingCallDate()==null) || 
             (this.prevEndingCallDate!=null &&
              this.prevEndingCallDate.equals(other.getPrevEndingCallDate()))) &&
            ((this.prevEndingCallTime==null && other.getPrevEndingCallTime()==null) || 
             (this.prevEndingCallTime!=null &&
              this.prevEndingCallTime.equals(other.getPrevEndingCallTime()))) &&
            ((this.usageCategory==null && other.getUsageCategory()==null) || 
             (this.usageCategory!=null &&
              this.usageCategory.equals(other.getUsageCategory()))) &&
            ((this.mdn==null && other.getMdn()==null) || 
             (this.mdn!=null &&
              this.mdn.equals(other.getMdn()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.usageType==null && other.getUsageType()==null) || 
             (this.usageType!=null &&
              this.usageType.equals(other.getUsageType())));
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
        if (getEsn() != null) {
            _hashCode += getEsn().hashCode();
        }
        if (getPrevEndingCallDate() != null) {
            _hashCode += getPrevEndingCallDate().hashCode();
        }
        if (getPrevEndingCallTime() != null) {
            _hashCode += getPrevEndingCallTime().hashCode();
        }
        if (getUsageCategory() != null) {
            _hashCode += getUsageCategory().hashCode();
        }
        if (getMdn() != null) {
            _hashCode += getMdn().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getUsageType() != null) {
            _hashCode += getUsageType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySubscriptionUsageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "QuerySubscriptionUsageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "esn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "SerialNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevEndingCallDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "prevEndingCallDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevEndingCallTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "prevEndingCallTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "usageCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "UsageCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "mdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "toDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "usageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "UsageTypeCode"));
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
