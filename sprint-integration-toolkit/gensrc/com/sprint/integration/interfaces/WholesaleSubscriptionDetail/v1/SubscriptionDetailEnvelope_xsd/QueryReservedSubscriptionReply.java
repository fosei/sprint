/**
 * QueryReservedSubscriptionReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd;


/**
 * This API is used to retrieve reserved subscription detail information
 * based on access number.
 */
public class QueryReservedSubscriptionReply  implements java.io.Serializable {
    private java.lang.String mdn;

    private java.lang.String csa;

    private java.lang.String msid;

    private java.lang.String majorAccountNumber;

    private com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ProductDeployment pricePlan;

    private java.lang.String reserveMdnId;

    private java.util.Date reserveDate;

    private java.lang.String reserveSubscriptionId;

    private org.apache.axis.types.Time reserveTime;

    /* List of service records containing valid feature services the
     * MVNO has defined and available for the CSA. */
    private com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ProductDeployment[] serviceList;

    public QueryReservedSubscriptionReply() {
    }

    public QueryReservedSubscriptionReply(
           java.lang.String mdn,
           java.lang.String csa,
           java.lang.String msid,
           java.lang.String majorAccountNumber,
           com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ProductDeployment pricePlan,
           java.lang.String reserveMdnId,
           java.util.Date reserveDate,
           java.lang.String reserveSubscriptionId,
           org.apache.axis.types.Time reserveTime,
           com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ProductDeployment[] serviceList) {
           this.mdn = mdn;
           this.csa = csa;
           this.msid = msid;
           this.majorAccountNumber = majorAccountNumber;
           this.pricePlan = pricePlan;
           this.reserveMdnId = reserveMdnId;
           this.reserveDate = reserveDate;
           this.reserveSubscriptionId = reserveSubscriptionId;
           this.reserveTime = reserveTime;
           this.serviceList = serviceList;
    }


    /**
     * Gets the mdn value for this QueryReservedSubscriptionReply.
     * 
     * @return mdn
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this QueryReservedSubscriptionReply.
     * 
     * @param mdn
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the csa value for this QueryReservedSubscriptionReply.
     * 
     * @return csa
     */
    public java.lang.String getCsa() {
        return csa;
    }


    /**
     * Sets the csa value for this QueryReservedSubscriptionReply.
     * 
     * @param csa
     */
    public void setCsa(java.lang.String csa) {
        this.csa = csa;
    }


    /**
     * Gets the msid value for this QueryReservedSubscriptionReply.
     * 
     * @return msid
     */
    public java.lang.String getMsid() {
        return msid;
    }


    /**
     * Sets the msid value for this QueryReservedSubscriptionReply.
     * 
     * @param msid
     */
    public void setMsid(java.lang.String msid) {
        this.msid = msid;
    }


    /**
     * Gets the majorAccountNumber value for this QueryReservedSubscriptionReply.
     * 
     * @return majorAccountNumber
     */
    public java.lang.String getMajorAccountNumber() {
        return majorAccountNumber;
    }


    /**
     * Sets the majorAccountNumber value for this QueryReservedSubscriptionReply.
     * 
     * @param majorAccountNumber
     */
    public void setMajorAccountNumber(java.lang.String majorAccountNumber) {
        this.majorAccountNumber = majorAccountNumber;
    }


    /**
     * Gets the pricePlan value for this QueryReservedSubscriptionReply.
     * 
     * @return pricePlan
     */
    public com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ProductDeployment getPricePlan() {
        return pricePlan;
    }


    /**
     * Sets the pricePlan value for this QueryReservedSubscriptionReply.
     * 
     * @param pricePlan
     */
    public void setPricePlan(com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ProductDeployment pricePlan) {
        this.pricePlan = pricePlan;
    }


    /**
     * Gets the reserveMdnId value for this QueryReservedSubscriptionReply.
     * 
     * @return reserveMdnId
     */
    public java.lang.String getReserveMdnId() {
        return reserveMdnId;
    }


    /**
     * Sets the reserveMdnId value for this QueryReservedSubscriptionReply.
     * 
     * @param reserveMdnId
     */
    public void setReserveMdnId(java.lang.String reserveMdnId) {
        this.reserveMdnId = reserveMdnId;
    }


    /**
     * Gets the reserveDate value for this QueryReservedSubscriptionReply.
     * 
     * @return reserveDate
     */
    public java.util.Date getReserveDate() {
        return reserveDate;
    }


    /**
     * Sets the reserveDate value for this QueryReservedSubscriptionReply.
     * 
     * @param reserveDate
     */
    public void setReserveDate(java.util.Date reserveDate) {
        this.reserveDate = reserveDate;
    }


    /**
     * Gets the reserveSubscriptionId value for this QueryReservedSubscriptionReply.
     * 
     * @return reserveSubscriptionId
     */
    public java.lang.String getReserveSubscriptionId() {
        return reserveSubscriptionId;
    }


    /**
     * Sets the reserveSubscriptionId value for this QueryReservedSubscriptionReply.
     * 
     * @param reserveSubscriptionId
     */
    public void setReserveSubscriptionId(java.lang.String reserveSubscriptionId) {
        this.reserveSubscriptionId = reserveSubscriptionId;
    }


    /**
     * Gets the reserveTime value for this QueryReservedSubscriptionReply.
     * 
     * @return reserveTime
     */
    public org.apache.axis.types.Time getReserveTime() {
        return reserveTime;
    }


    /**
     * Sets the reserveTime value for this QueryReservedSubscriptionReply.
     * 
     * @param reserveTime
     */
    public void setReserveTime(org.apache.axis.types.Time reserveTime) {
        this.reserveTime = reserveTime;
    }


    /**
     * Gets the serviceList value for this QueryReservedSubscriptionReply.
     * 
     * @return serviceList   * List of service records containing valid feature services the
     * MVNO has defined and available for the CSA.
     */
    public com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ProductDeployment[] getServiceList() {
        return serviceList;
    }


    /**
     * Sets the serviceList value for this QueryReservedSubscriptionReply.
     * 
     * @param serviceList   * List of service records containing valid feature services the
     * MVNO has defined and available for the CSA.
     */
    public void setServiceList(com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ProductDeployment[] serviceList) {
        this.serviceList = serviceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryReservedSubscriptionReply)) return false;
        QueryReservedSubscriptionReply other = (QueryReservedSubscriptionReply) obj;
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
            ((this.csa==null && other.getCsa()==null) || 
             (this.csa!=null &&
              this.csa.equals(other.getCsa()))) &&
            ((this.msid==null && other.getMsid()==null) || 
             (this.msid!=null &&
              this.msid.equals(other.getMsid()))) &&
            ((this.majorAccountNumber==null && other.getMajorAccountNumber()==null) || 
             (this.majorAccountNumber!=null &&
              this.majorAccountNumber.equals(other.getMajorAccountNumber()))) &&
            ((this.pricePlan==null && other.getPricePlan()==null) || 
             (this.pricePlan!=null &&
              this.pricePlan.equals(other.getPricePlan()))) &&
            ((this.reserveMdnId==null && other.getReserveMdnId()==null) || 
             (this.reserveMdnId!=null &&
              this.reserveMdnId.equals(other.getReserveMdnId()))) &&
            ((this.reserveDate==null && other.getReserveDate()==null) || 
             (this.reserveDate!=null &&
              this.reserveDate.equals(other.getReserveDate()))) &&
            ((this.reserveSubscriptionId==null && other.getReserveSubscriptionId()==null) || 
             (this.reserveSubscriptionId!=null &&
              this.reserveSubscriptionId.equals(other.getReserveSubscriptionId()))) &&
            ((this.reserveTime==null && other.getReserveTime()==null) || 
             (this.reserveTime!=null &&
              this.reserveTime.equals(other.getReserveTime()))) &&
            ((this.serviceList==null && other.getServiceList()==null) || 
             (this.serviceList!=null &&
              java.util.Arrays.equals(this.serviceList, other.getServiceList())));
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
        if (getCsa() != null) {
            _hashCode += getCsa().hashCode();
        }
        if (getMsid() != null) {
            _hashCode += getMsid().hashCode();
        }
        if (getMajorAccountNumber() != null) {
            _hashCode += getMajorAccountNumber().hashCode();
        }
        if (getPricePlan() != null) {
            _hashCode += getPricePlan().hashCode();
        }
        if (getReserveMdnId() != null) {
            _hashCode += getReserveMdnId().hashCode();
        }
        if (getReserveDate() != null) {
            _hashCode += getReserveDate().hashCode();
        }
        if (getReserveSubscriptionId() != null) {
            _hashCode += getReserveSubscriptionId().hashCode();
        }
        if (getReserveTime() != null) {
            _hashCode += getReserveTime().hashCode();
        }
        if (getServiceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryReservedSubscriptionReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "QueryReservedSubscriptionReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "mdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "csa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("majorAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "majorAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "PartyOtherIdValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "pricePlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "ProductDeployment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserveMdnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "reserveMdnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "reserveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserveSubscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "reserveSubscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "IdentifierString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "reserveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "EffectiveTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "serviceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "ProductDeployment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "serviceRecord"));
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
