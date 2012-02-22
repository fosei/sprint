/**
 * AccessNbrAsgmInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd;

public class AccessNbrAsgmInfo  implements java.io.Serializable {
    private java.lang.String accessNbr;

    private java.util.Date effectiveDate;

    private org.apache.axis.types.Time effectiveTime;

    private java.util.Date expirationDate;

    private org.apache.axis.types.Time expirationTime;

    private java.lang.String msid;

    private java.util.Date portDueDate;

    private com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.PortingStatusCode portStateInd;

    private java.lang.String switchStatusCode;

    public AccessNbrAsgmInfo() {
    }

    public AccessNbrAsgmInfo(
           java.lang.String accessNbr,
           java.util.Date effectiveDate,
           org.apache.axis.types.Time effectiveTime,
           java.util.Date expirationDate,
           org.apache.axis.types.Time expirationTime,
           java.lang.String msid,
           java.util.Date portDueDate,
           com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.PortingStatusCode portStateInd,
           java.lang.String switchStatusCode) {
           this.accessNbr = accessNbr;
           this.effectiveDate = effectiveDate;
           this.effectiveTime = effectiveTime;
           this.expirationDate = expirationDate;
           this.expirationTime = expirationTime;
           this.msid = msid;
           this.portDueDate = portDueDate;
           this.portStateInd = portStateInd;
           this.switchStatusCode = switchStatusCode;
    }


    /**
     * Gets the accessNbr value for this AccessNbrAsgmInfo.
     * 
     * @return accessNbr
     */
    public java.lang.String getAccessNbr() {
        return accessNbr;
    }


    /**
     * Sets the accessNbr value for this AccessNbrAsgmInfo.
     * 
     * @param accessNbr
     */
    public void setAccessNbr(java.lang.String accessNbr) {
        this.accessNbr = accessNbr;
    }


    /**
     * Gets the effectiveDate value for this AccessNbrAsgmInfo.
     * 
     * @return effectiveDate
     */
    public java.util.Date getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this AccessNbrAsgmInfo.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the effectiveTime value for this AccessNbrAsgmInfo.
     * 
     * @return effectiveTime
     */
    public org.apache.axis.types.Time getEffectiveTime() {
        return effectiveTime;
    }


    /**
     * Sets the effectiveTime value for this AccessNbrAsgmInfo.
     * 
     * @param effectiveTime
     */
    public void setEffectiveTime(org.apache.axis.types.Time effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Gets the expirationDate value for this AccessNbrAsgmInfo.
     * 
     * @return expirationDate
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this AccessNbrAsgmInfo.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the expirationTime value for this AccessNbrAsgmInfo.
     * 
     * @return expirationTime
     */
    public org.apache.axis.types.Time getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this AccessNbrAsgmInfo.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(org.apache.axis.types.Time expirationTime) {
        this.expirationTime = expirationTime;
    }


    /**
     * Gets the msid value for this AccessNbrAsgmInfo.
     * 
     * @return msid
     */
    public java.lang.String getMsid() {
        return msid;
    }


    /**
     * Sets the msid value for this AccessNbrAsgmInfo.
     * 
     * @param msid
     */
    public void setMsid(java.lang.String msid) {
        this.msid = msid;
    }


    /**
     * Gets the portDueDate value for this AccessNbrAsgmInfo.
     * 
     * @return portDueDate
     */
    public java.util.Date getPortDueDate() {
        return portDueDate;
    }


    /**
     * Sets the portDueDate value for this AccessNbrAsgmInfo.
     * 
     * @param portDueDate
     */
    public void setPortDueDate(java.util.Date portDueDate) {
        this.portDueDate = portDueDate;
    }


    /**
     * Gets the portStateInd value for this AccessNbrAsgmInfo.
     * 
     * @return portStateInd
     */
    public com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.PortingStatusCode getPortStateInd() {
        return portStateInd;
    }


    /**
     * Sets the portStateInd value for this AccessNbrAsgmInfo.
     * 
     * @param portStateInd
     */
    public void setPortStateInd(com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.PortingStatusCode portStateInd) {
        this.portStateInd = portStateInd;
    }


    /**
     * Gets the switchStatusCode value for this AccessNbrAsgmInfo.
     * 
     * @return switchStatusCode
     */
    public java.lang.String getSwitchStatusCode() {
        return switchStatusCode;
    }


    /**
     * Sets the switchStatusCode value for this AccessNbrAsgmInfo.
     * 
     * @param switchStatusCode
     */
    public void setSwitchStatusCode(java.lang.String switchStatusCode) {
        this.switchStatusCode = switchStatusCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccessNbrAsgmInfo)) return false;
        AccessNbrAsgmInfo other = (AccessNbrAsgmInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessNbr==null && other.getAccessNbr()==null) || 
             (this.accessNbr!=null &&
              this.accessNbr.equals(other.getAccessNbr()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.effectiveTime==null && other.getEffectiveTime()==null) || 
             (this.effectiveTime!=null &&
              this.effectiveTime.equals(other.getEffectiveTime()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.expirationTime==null && other.getExpirationTime()==null) || 
             (this.expirationTime!=null &&
              this.expirationTime.equals(other.getExpirationTime()))) &&
            ((this.msid==null && other.getMsid()==null) || 
             (this.msid!=null &&
              this.msid.equals(other.getMsid()))) &&
            ((this.portDueDate==null && other.getPortDueDate()==null) || 
             (this.portDueDate!=null &&
              this.portDueDate.equals(other.getPortDueDate()))) &&
            ((this.portStateInd==null && other.getPortStateInd()==null) || 
             (this.portStateInd!=null &&
              this.portStateInd.equals(other.getPortStateInd()))) &&
            ((this.switchStatusCode==null && other.getSwitchStatusCode()==null) || 
             (this.switchStatusCode!=null &&
              this.switchStatusCode.equals(other.getSwitchStatusCode())));
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
        if (getAccessNbr() != null) {
            _hashCode += getAccessNbr().hashCode();
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
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        if (getMsid() != null) {
            _hashCode += getMsid().hashCode();
        }
        if (getPortDueDate() != null) {
            _hashCode += getPortDueDate().hashCode();
        }
        if (getPortStateInd() != null) {
            _hashCode += getPortStateInd().hashCode();
        }
        if (getSwitchStatusCode() != null) {
            _hashCode += getSwitchStatusCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccessNbrAsgmInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "AccessNbrAsgmInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "accessNbr"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "expirationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "ExpirationTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "msid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "portDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portStateInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "portStateInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "PortingStatusCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "switchStatusCode"));
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
