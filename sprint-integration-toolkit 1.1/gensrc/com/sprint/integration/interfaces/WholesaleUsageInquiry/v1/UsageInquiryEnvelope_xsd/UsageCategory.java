/**
 * UsageCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd;


/**
 * If nothing is populated, all field defaults to Y and all usage
 * (except IP) is returned for that subscription.
 */
public class UsageCategory  implements java.io.Serializable {
    private java.lang.Boolean all;

    private java.lang.Boolean circuitSwitchData;

    private java.lang.Boolean ipData;

    private java.lang.Boolean smsData;

    private java.lang.Boolean voiceData;

    public UsageCategory() {
    }

    public UsageCategory(
           java.lang.Boolean all,
           java.lang.Boolean circuitSwitchData,
           java.lang.Boolean ipData,
           java.lang.Boolean smsData,
           java.lang.Boolean voiceData) {
           this.all = all;
           this.circuitSwitchData = circuitSwitchData;
           this.ipData = ipData;
           this.smsData = smsData;
           this.voiceData = voiceData;
    }


    /**
     * Gets the all value for this UsageCategory.
     * 
     * @return all
     */
    public java.lang.Boolean getAll() {
        return all;
    }


    /**
     * Sets the all value for this UsageCategory.
     * 
     * @param all
     */
    public void setAll(java.lang.Boolean all) {
        this.all = all;
    }


    /**
     * Gets the circuitSwitchData value for this UsageCategory.
     * 
     * @return circuitSwitchData
     */
    public java.lang.Boolean getCircuitSwitchData() {
        return circuitSwitchData;
    }


    /**
     * Sets the circuitSwitchData value for this UsageCategory.
     * 
     * @param circuitSwitchData
     */
    public void setCircuitSwitchData(java.lang.Boolean circuitSwitchData) {
        this.circuitSwitchData = circuitSwitchData;
    }


    /**
     * Gets the ipData value for this UsageCategory.
     * 
     * @return ipData
     */
    public java.lang.Boolean getIpData() {
        return ipData;
    }


    /**
     * Sets the ipData value for this UsageCategory.
     * 
     * @param ipData
     */
    public void setIpData(java.lang.Boolean ipData) {
        this.ipData = ipData;
    }


    /**
     * Gets the smsData value for this UsageCategory.
     * 
     * @return smsData
     */
    public java.lang.Boolean getSmsData() {
        return smsData;
    }


    /**
     * Sets the smsData value for this UsageCategory.
     * 
     * @param smsData
     */
    public void setSmsData(java.lang.Boolean smsData) {
        this.smsData = smsData;
    }


    /**
     * Gets the voiceData value for this UsageCategory.
     * 
     * @return voiceData
     */
    public java.lang.Boolean getVoiceData() {
        return voiceData;
    }


    /**
     * Sets the voiceData value for this UsageCategory.
     * 
     * @param voiceData
     */
    public void setVoiceData(java.lang.Boolean voiceData) {
        this.voiceData = voiceData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsageCategory)) return false;
        UsageCategory other = (UsageCategory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.all==null && other.getAll()==null) || 
             (this.all!=null &&
              this.all.equals(other.getAll()))) &&
            ((this.circuitSwitchData==null && other.getCircuitSwitchData()==null) || 
             (this.circuitSwitchData!=null &&
              this.circuitSwitchData.equals(other.getCircuitSwitchData()))) &&
            ((this.ipData==null && other.getIpData()==null) || 
             (this.ipData!=null &&
              this.ipData.equals(other.getIpData()))) &&
            ((this.smsData==null && other.getSmsData()==null) || 
             (this.smsData!=null &&
              this.smsData.equals(other.getSmsData()))) &&
            ((this.voiceData==null && other.getVoiceData()==null) || 
             (this.voiceData!=null &&
              this.voiceData.equals(other.getVoiceData())));
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
        if (getAll() != null) {
            _hashCode += getAll().hashCode();
        }
        if (getCircuitSwitchData() != null) {
            _hashCode += getCircuitSwitchData().hashCode();
        }
        if (getIpData() != null) {
            _hashCode += getIpData().hashCode();
        }
        if (getSmsData() != null) {
            _hashCode += getSmsData().hashCode();
        }
        if (getVoiceData() != null) {
            _hashCode += getVoiceData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsageCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "UsageCategory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("all");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "all"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circuitSwitchData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "circuitSwitchData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "ipData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "smsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "voiceData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleUsageInquiry/v1/UsageInquiryEnvelope.xsd", "BooleanFlag"));
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
