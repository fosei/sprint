/**
 * QuerySubscriptionUsageReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd;


/**
 * This API is used to view usage associated with the active subscription
 * for a given MDN/ESN.
 */
public class QuerySubscriptionUsageReply  implements java.io.Serializable {
    private java.lang.String mdn;

    private java.util.Date fromDate;

    private java.util.Date toDate;

    private com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.UsageTypeCode usageType;

    private java.math.BigDecimal totalCalls;

    private java.math.BigDecimal totalAirtimeUsage;

    private java.lang.Boolean areMoreCallDetails;

    private com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.CallDetailRecord[] callDetailList;

    public QuerySubscriptionUsageReply() {
    }

    public QuerySubscriptionUsageReply(
           java.lang.String mdn,
           java.util.Date fromDate,
           java.util.Date toDate,
           com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.UsageTypeCode usageType,
           java.math.BigDecimal totalCalls,
           java.math.BigDecimal totalAirtimeUsage,
           java.lang.Boolean areMoreCallDetails,
           com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.CallDetailRecord[] callDetailList) {
           this.mdn = mdn;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.usageType = usageType;
           this.totalCalls = totalCalls;
           this.totalAirtimeUsage = totalAirtimeUsage;
           this.areMoreCallDetails = areMoreCallDetails;
           this.callDetailList = callDetailList;
    }


    /**
     * Gets the mdn value for this QuerySubscriptionUsageReply.
     * 
     * @return mdn
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this QuerySubscriptionUsageReply.
     * 
     * @param mdn
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the fromDate value for this QuerySubscriptionUsageReply.
     * 
     * @return fromDate
     */
    public java.util.Date getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this QuerySubscriptionUsageReply.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Date fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this QuerySubscriptionUsageReply.
     * 
     * @return toDate
     */
    public java.util.Date getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this QuerySubscriptionUsageReply.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Date toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the usageType value for this QuerySubscriptionUsageReply.
     * 
     * @return usageType
     */
    public com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.UsageTypeCode getUsageType() {
        return usageType;
    }


    /**
     * Sets the usageType value for this QuerySubscriptionUsageReply.
     * 
     * @param usageType
     */
    public void setUsageType(com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.UsageTypeCode usageType) {
        this.usageType = usageType;
    }


    /**
     * Gets the totalCalls value for this QuerySubscriptionUsageReply.
     * 
     * @return totalCalls
     */
    public java.math.BigDecimal getTotalCalls() {
        return totalCalls;
    }


    /**
     * Sets the totalCalls value for this QuerySubscriptionUsageReply.
     * 
     * @param totalCalls
     */
    public void setTotalCalls(java.math.BigDecimal totalCalls) {
        this.totalCalls = totalCalls;
    }


    /**
     * Gets the totalAirtimeUsage value for this QuerySubscriptionUsageReply.
     * 
     * @return totalAirtimeUsage
     */
    public java.math.BigDecimal getTotalAirtimeUsage() {
        return totalAirtimeUsage;
    }


    /**
     * Sets the totalAirtimeUsage value for this QuerySubscriptionUsageReply.
     * 
     * @param totalAirtimeUsage
     */
    public void setTotalAirtimeUsage(java.math.BigDecimal totalAirtimeUsage) {
        this.totalAirtimeUsage = totalAirtimeUsage;
    }


    /**
     * Gets the areMoreCallDetails value for this QuerySubscriptionUsageReply.
     * 
     * @return areMoreCallDetails
     */
    public java.lang.Boolean getAreMoreCallDetails() {
        return areMoreCallDetails;
    }


    /**
     * Sets the areMoreCallDetails value for this QuerySubscriptionUsageReply.
     * 
     * @param areMoreCallDetails
     */
    public void setAreMoreCallDetails(java.lang.Boolean areMoreCallDetails) {
        this.areMoreCallDetails = areMoreCallDetails;
    }


    /**
     * Gets the callDetailList value for this QuerySubscriptionUsageReply.
     * 
     * @return callDetailList
     */
    public com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.CallDetailRecord[] getCallDetailList() {
        return callDetailList;
    }


    /**
     * Sets the callDetailList value for this QuerySubscriptionUsageReply.
     * 
     * @param callDetailList
     */
    public void setCallDetailList(com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.CallDetailRecord[] callDetailList) {
        this.callDetailList = callDetailList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubscriptionUsageReply)) return false;
        QuerySubscriptionUsageReply other = (QuerySubscriptionUsageReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
              this.usageType.equals(other.getUsageType()))) &&
            ((this.totalCalls==null && other.getTotalCalls()==null) || 
             (this.totalCalls!=null &&
              this.totalCalls.equals(other.getTotalCalls()))) &&
            ((this.totalAirtimeUsage==null && other.getTotalAirtimeUsage()==null) || 
             (this.totalAirtimeUsage!=null &&
              this.totalAirtimeUsage.equals(other.getTotalAirtimeUsage()))) &&
            ((this.areMoreCallDetails==null && other.getAreMoreCallDetails()==null) || 
             (this.areMoreCallDetails!=null &&
              this.areMoreCallDetails.equals(other.getAreMoreCallDetails()))) &&
            ((this.callDetailList==null && other.getCallDetailList()==null) || 
             (this.callDetailList!=null &&
              java.util.Arrays.equals(this.callDetailList, other.getCallDetailList())));
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
        if (getTotalCalls() != null) {
            _hashCode += getTotalCalls().hashCode();
        }
        if (getTotalAirtimeUsage() != null) {
            _hashCode += getTotalAirtimeUsage().hashCode();
        }
        if (getAreMoreCallDetails() != null) {
            _hashCode += getAreMoreCallDetails().hashCode();
        }
        if (getCallDetailList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCallDetailList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCallDetailList(), i);
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
        new org.apache.axis.description.TypeDesc(QuerySubscriptionUsageReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "QuerySubscriptionUsageReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "totalCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAirtimeUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "totalAirtimeUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areMoreCallDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "areMoreCallDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "callDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "CallDetailRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "callDetailRecord"));
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
