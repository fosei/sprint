/**
 * CallDetailRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd;


/**
 * For Voice, SMS, CicuitSwitch (Data) and All type of usageCategory.
 */
public class CallDetailRecord  implements java.io.Serializable {
    private java.math.BigDecimal airtimeMinutes;

    private java.lang.String activityUnit;

    private java.lang.String contentPartnerName;

    private java.lang.Boolean boboIndicator;

    private java.util.Date callDate;

    private org.apache.axis.types.Time callTime;

    private java.lang.String callingNumber;

    private java.lang.String calledDestination;

    private java.lang.String calledNumber;

    private java.lang.String homeCall;

    private java.lang.String nai;

    private java.lang.String rpdrServiceCode;

    private java.lang.String sid;

    private java.lang.String usageQuantity;

    private java.lang.String usageSourceInd;

    private java.lang.String contentTypeName;

    private java.lang.String contentDetailedDescription;

    public CallDetailRecord() {
    }

    public CallDetailRecord(
           java.math.BigDecimal airtimeMinutes,
           java.lang.String activityUnit,
           java.lang.String contentPartnerName,
           java.lang.Boolean boboIndicator,
           java.util.Date callDate,
           org.apache.axis.types.Time callTime,
           java.lang.String callingNumber,
           java.lang.String calledDestination,
           java.lang.String calledNumber,
           java.lang.String homeCall,
           java.lang.String nai,
           java.lang.String rpdrServiceCode,
           java.lang.String sid,
           java.lang.String usageQuantity,
           java.lang.String usageSourceInd,
           java.lang.String contentTypeName,
           java.lang.String contentDetailedDescription) {
           this.airtimeMinutes = airtimeMinutes;
           this.activityUnit = activityUnit;
           this.contentPartnerName = contentPartnerName;
           this.boboIndicator = boboIndicator;
           this.callDate = callDate;
           this.callTime = callTime;
           this.callingNumber = callingNumber;
           this.calledDestination = calledDestination;
           this.calledNumber = calledNumber;
           this.homeCall = homeCall;
           this.nai = nai;
           this.rpdrServiceCode = rpdrServiceCode;
           this.sid = sid;
           this.usageQuantity = usageQuantity;
           this.usageSourceInd = usageSourceInd;
           this.contentTypeName = contentTypeName;
           this.contentDetailedDescription = contentDetailedDescription;
    }


    /**
     * Gets the airtimeMinutes value for this CallDetailRecord.
     * 
     * @return airtimeMinutes
     */
    public java.math.BigDecimal getAirtimeMinutes() {
        return airtimeMinutes;
    }


    /**
     * Sets the airtimeMinutes value for this CallDetailRecord.
     * 
     * @param airtimeMinutes
     */
    public void setAirtimeMinutes(java.math.BigDecimal airtimeMinutes) {
        this.airtimeMinutes = airtimeMinutes;
    }


    /**
     * Gets the activityUnit value for this CallDetailRecord.
     * 
     * @return activityUnit
     */
    public java.lang.String getActivityUnit() {
        return activityUnit;
    }


    /**
     * Sets the activityUnit value for this CallDetailRecord.
     * 
     * @param activityUnit
     */
    public void setActivityUnit(java.lang.String activityUnit) {
        this.activityUnit = activityUnit;
    }


    /**
     * Gets the contentPartnerName value for this CallDetailRecord.
     * 
     * @return contentPartnerName
     */
    public java.lang.String getContentPartnerName() {
        return contentPartnerName;
    }


    /**
     * Sets the contentPartnerName value for this CallDetailRecord.
     * 
     * @param contentPartnerName
     */
    public void setContentPartnerName(java.lang.String contentPartnerName) {
        this.contentPartnerName = contentPartnerName;
    }


    /**
     * Gets the boboIndicator value for this CallDetailRecord.
     * 
     * @return boboIndicator
     */
    public java.lang.Boolean getBoboIndicator() {
        return boboIndicator;
    }


    /**
     * Sets the boboIndicator value for this CallDetailRecord.
     * 
     * @param boboIndicator
     */
    public void setBoboIndicator(java.lang.Boolean boboIndicator) {
        this.boboIndicator = boboIndicator;
    }


    /**
     * Gets the callDate value for this CallDetailRecord.
     * 
     * @return callDate
     */
    public java.util.Date getCallDate() {
        return callDate;
    }


    /**
     * Sets the callDate value for this CallDetailRecord.
     * 
     * @param callDate
     */
    public void setCallDate(java.util.Date callDate) {
        this.callDate = callDate;
    }


    /**
     * Gets the callTime value for this CallDetailRecord.
     * 
     * @return callTime
     */
    public org.apache.axis.types.Time getCallTime() {
        return callTime;
    }


    /**
     * Sets the callTime value for this CallDetailRecord.
     * 
     * @param callTime
     */
    public void setCallTime(org.apache.axis.types.Time callTime) {
        this.callTime = callTime;
    }


    /**
     * Gets the callingNumber value for this CallDetailRecord.
     * 
     * @return callingNumber
     */
    public java.lang.String getCallingNumber() {
        return callingNumber;
    }


    /**
     * Sets the callingNumber value for this CallDetailRecord.
     * 
     * @param callingNumber
     */
    public void setCallingNumber(java.lang.String callingNumber) {
        this.callingNumber = callingNumber;
    }


    /**
     * Gets the calledDestination value for this CallDetailRecord.
     * 
     * @return calledDestination
     */
    public java.lang.String getCalledDestination() {
        return calledDestination;
    }


    /**
     * Sets the calledDestination value for this CallDetailRecord.
     * 
     * @param calledDestination
     */
    public void setCalledDestination(java.lang.String calledDestination) {
        this.calledDestination = calledDestination;
    }


    /**
     * Gets the calledNumber value for this CallDetailRecord.
     * 
     * @return calledNumber
     */
    public java.lang.String getCalledNumber() {
        return calledNumber;
    }


    /**
     * Sets the calledNumber value for this CallDetailRecord.
     * 
     * @param calledNumber
     */
    public void setCalledNumber(java.lang.String calledNumber) {
        this.calledNumber = calledNumber;
    }


    /**
     * Gets the homeCall value for this CallDetailRecord.
     * 
     * @return homeCall
     */
    public java.lang.String getHomeCall() {
        return homeCall;
    }


    /**
     * Sets the homeCall value for this CallDetailRecord.
     * 
     * @param homeCall
     */
    public void setHomeCall(java.lang.String homeCall) {
        this.homeCall = homeCall;
    }


    /**
     * Gets the nai value for this CallDetailRecord.
     * 
     * @return nai
     */
    public java.lang.String getNai() {
        return nai;
    }


    /**
     * Sets the nai value for this CallDetailRecord.
     * 
     * @param nai
     */
    public void setNai(java.lang.String nai) {
        this.nai = nai;
    }


    /**
     * Gets the rpdrServiceCode value for this CallDetailRecord.
     * 
     * @return rpdrServiceCode
     */
    public java.lang.String getRpdrServiceCode() {
        return rpdrServiceCode;
    }


    /**
     * Sets the rpdrServiceCode value for this CallDetailRecord.
     * 
     * @param rpdrServiceCode
     */
    public void setRpdrServiceCode(java.lang.String rpdrServiceCode) {
        this.rpdrServiceCode = rpdrServiceCode;
    }


    /**
     * Gets the sid value for this CallDetailRecord.
     * 
     * @return sid
     */
    public java.lang.String getSid() {
        return sid;
    }


    /**
     * Sets the sid value for this CallDetailRecord.
     * 
     * @param sid
     */
    public void setSid(java.lang.String sid) {
        this.sid = sid;
    }


    /**
     * Gets the usageQuantity value for this CallDetailRecord.
     * 
     * @return usageQuantity
     */
    public java.lang.String getUsageQuantity() {
        return usageQuantity;
    }


    /**
     * Sets the usageQuantity value for this CallDetailRecord.
     * 
     * @param usageQuantity
     */
    public void setUsageQuantity(java.lang.String usageQuantity) {
        this.usageQuantity = usageQuantity;
    }


    /**
     * Gets the usageSourceInd value for this CallDetailRecord.
     * 
     * @return usageSourceInd
     */
    public java.lang.String getUsageSourceInd() {
        return usageSourceInd;
    }


    /**
     * Sets the usageSourceInd value for this CallDetailRecord.
     * 
     * @param usageSourceInd
     */
    public void setUsageSourceInd(java.lang.String usageSourceInd) {
        this.usageSourceInd = usageSourceInd;
    }


    /**
     * Gets the contentTypeName value for this CallDetailRecord.
     * 
     * @return contentTypeName
     */
    public java.lang.String getContentTypeName() {
        return contentTypeName;
    }


    /**
     * Sets the contentTypeName value for this CallDetailRecord.
     * 
     * @param contentTypeName
     */
    public void setContentTypeName(java.lang.String contentTypeName) {
        this.contentTypeName = contentTypeName;
    }


    /**
     * Gets the contentDetailedDescription value for this CallDetailRecord.
     * 
     * @return contentDetailedDescription
     */
    public java.lang.String getContentDetailedDescription() {
        return contentDetailedDescription;
    }


    /**
     * Sets the contentDetailedDescription value for this CallDetailRecord.
     * 
     * @param contentDetailedDescription
     */
    public void setContentDetailedDescription(java.lang.String contentDetailedDescription) {
        this.contentDetailedDescription = contentDetailedDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallDetailRecord)) return false;
        CallDetailRecord other = (CallDetailRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airtimeMinutes==null && other.getAirtimeMinutes()==null) || 
             (this.airtimeMinutes!=null &&
              this.airtimeMinutes.equals(other.getAirtimeMinutes()))) &&
            ((this.activityUnit==null && other.getActivityUnit()==null) || 
             (this.activityUnit!=null &&
              this.activityUnit.equals(other.getActivityUnit()))) &&
            ((this.contentPartnerName==null && other.getContentPartnerName()==null) || 
             (this.contentPartnerName!=null &&
              this.contentPartnerName.equals(other.getContentPartnerName()))) &&
            ((this.boboIndicator==null && other.getBoboIndicator()==null) || 
             (this.boboIndicator!=null &&
              this.boboIndicator.equals(other.getBoboIndicator()))) &&
            ((this.callDate==null && other.getCallDate()==null) || 
             (this.callDate!=null &&
              this.callDate.equals(other.getCallDate()))) &&
            ((this.callTime==null && other.getCallTime()==null) || 
             (this.callTime!=null &&
              this.callTime.equals(other.getCallTime()))) &&
            ((this.callingNumber==null && other.getCallingNumber()==null) || 
             (this.callingNumber!=null &&
              this.callingNumber.equals(other.getCallingNumber()))) &&
            ((this.calledDestination==null && other.getCalledDestination()==null) || 
             (this.calledDestination!=null &&
              this.calledDestination.equals(other.getCalledDestination()))) &&
            ((this.calledNumber==null && other.getCalledNumber()==null) || 
             (this.calledNumber!=null &&
              this.calledNumber.equals(other.getCalledNumber()))) &&
            ((this.homeCall==null && other.getHomeCall()==null) || 
             (this.homeCall!=null &&
              this.homeCall.equals(other.getHomeCall()))) &&
            ((this.nai==null && other.getNai()==null) || 
             (this.nai!=null &&
              this.nai.equals(other.getNai()))) &&
            ((this.rpdrServiceCode==null && other.getRpdrServiceCode()==null) || 
             (this.rpdrServiceCode!=null &&
              this.rpdrServiceCode.equals(other.getRpdrServiceCode()))) &&
            ((this.sid==null && other.getSid()==null) || 
             (this.sid!=null &&
              this.sid.equals(other.getSid()))) &&
            ((this.usageQuantity==null && other.getUsageQuantity()==null) || 
             (this.usageQuantity!=null &&
              this.usageQuantity.equals(other.getUsageQuantity()))) &&
            ((this.usageSourceInd==null && other.getUsageSourceInd()==null) || 
             (this.usageSourceInd!=null &&
              this.usageSourceInd.equals(other.getUsageSourceInd()))) &&
            ((this.contentTypeName==null && other.getContentTypeName()==null) || 
             (this.contentTypeName!=null &&
              this.contentTypeName.equals(other.getContentTypeName()))) &&
            ((this.contentDetailedDescription==null && other.getContentDetailedDescription()==null) || 
             (this.contentDetailedDescription!=null &&
              this.contentDetailedDescription.equals(other.getContentDetailedDescription())));
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
        if (getAirtimeMinutes() != null) {
            _hashCode += getAirtimeMinutes().hashCode();
        }
        if (getActivityUnit() != null) {
            _hashCode += getActivityUnit().hashCode();
        }
        if (getContentPartnerName() != null) {
            _hashCode += getContentPartnerName().hashCode();
        }
        if (getBoboIndicator() != null) {
            _hashCode += getBoboIndicator().hashCode();
        }
        if (getCallDate() != null) {
            _hashCode += getCallDate().hashCode();
        }
        if (getCallTime() != null) {
            _hashCode += getCallTime().hashCode();
        }
        if (getCallingNumber() != null) {
            _hashCode += getCallingNumber().hashCode();
        }
        if (getCalledDestination() != null) {
            _hashCode += getCalledDestination().hashCode();
        }
        if (getCalledNumber() != null) {
            _hashCode += getCalledNumber().hashCode();
        }
        if (getHomeCall() != null) {
            _hashCode += getHomeCall().hashCode();
        }
        if (getNai() != null) {
            _hashCode += getNai().hashCode();
        }
        if (getRpdrServiceCode() != null) {
            _hashCode += getRpdrServiceCode().hashCode();
        }
        if (getSid() != null) {
            _hashCode += getSid().hashCode();
        }
        if (getUsageQuantity() != null) {
            _hashCode += getUsageQuantity().hashCode();
        }
        if (getUsageSourceInd() != null) {
            _hashCode += getUsageSourceInd().hashCode();
        }
        if (getContentTypeName() != null) {
            _hashCode += getContentTypeName().hashCode();
        }
        if (getContentDetailedDescription() != null) {
            _hashCode += getContentDetailedDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallDetailRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "CallDetailRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airtimeMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "airtimeMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "activityUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "UnitOfMeasureCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentPartnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "contentPartnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "OrganizationName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boboIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "boboIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "callDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "callTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "callingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledDestination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "calledDestination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "calledNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "homeCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nai");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "nai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpdrServiceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "rpdrServiceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "sid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "usageQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageSourceInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "usageSourceInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "contentTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "NoteText"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentDetailedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "contentDetailedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "NoteText"));
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
