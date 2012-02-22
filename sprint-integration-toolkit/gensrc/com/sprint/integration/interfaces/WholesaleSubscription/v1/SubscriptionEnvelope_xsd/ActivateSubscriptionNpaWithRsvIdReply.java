/**
 * ActivateSubscriptionNpaWithRsvIdReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd;

public class ActivateSubscriptionNpaWithRsvIdReply  implements java.io.Serializable {
    /* A reserve MDN ID is a reservation ID associated with the reserved
     * access number. */
    private java.lang.String reserveMdnId;

    /* Mobile Directory Number is a North American Numbering Plan
     * (NANP) Telecom Number, the 10 digit telephone number comprised of
     * the NPA Number, the NXX Number and the Phone Line Number. */
    private java.lang.String mdn;

    /* The Mobile Station Identifier that is assigned to the MDN. */
    private java.lang.String msid;

    /* Communication Service Area Identifier of the Reseller. */
    private java.lang.String csa;

    /* Effective date is the date subscription the Subscription will
     * be activated. */
    private java.util.Date effectiveDate;

    /* A line item record of a price plan or a service. */
    private com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ProductDeployment pricePlan;

    /* List of service records containing valid feature services the
     * MVNO has defined and available for the CSA. */
    private com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ProductDeployment[] serviceList;

    public ActivateSubscriptionNpaWithRsvIdReply() {
    }

    public ActivateSubscriptionNpaWithRsvIdReply(
           java.lang.String reserveMdnId,
           java.lang.String mdn,
           java.lang.String msid,
           java.lang.String csa,
           java.util.Date effectiveDate,
           com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ProductDeployment pricePlan,
           com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ProductDeployment[] serviceList) {
           this.reserveMdnId = reserveMdnId;
           this.mdn = mdn;
           this.msid = msid;
           this.csa = csa;
           this.effectiveDate = effectiveDate;
           this.pricePlan = pricePlan;
           this.serviceList = serviceList;
    }


    /**
     * Gets the reserveMdnId value for this ActivateSubscriptionNpaWithRsvIdReply.
     * 
     * @return reserveMdnId   * A reserve MDN ID is a reservation ID associated with the reserved
     * access number.
     */
    public java.lang.String getReserveMdnId() {
        return reserveMdnId;
    }


    /**
     * Sets the reserveMdnId value for this ActivateSubscriptionNpaWithRsvIdReply.
     * 
     * @param reserveMdnId   * A reserve MDN ID is a reservation ID associated with the reserved
     * access number.
     */
    public void setReserveMdnId(java.lang.String reserveMdnId) {
        this.reserveMdnId = reserveMdnId;
    }


    /**
     * Gets the mdn value for this ActivateSubscriptionNpaWithRsvIdReply.
     * 
     * @return mdn   * Mobile Directory Number is a North American Numbering Plan
     * (NANP) Telecom Number, the 10 digit telephone number comprised of
     * the NPA Number, the NXX Number and the Phone Line Number.
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this ActivateSubscriptionNpaWithRsvIdReply.
     * 
     * @param mdn   * Mobile Directory Number is a North American Numbering Plan
     * (NANP) Telecom Number, the 10 digit telephone number comprised of
     * the NPA Number, the NXX Number and the Phone Line Number.
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the msid value for this ActivateSubscriptionNpaWithRsvIdReply.
     * 
     * @return msid   * The Mobile Station Identifier that is assigned to the MDN.
     */
    public java.lang.String getMsid() {
        return msid;
    }


    /**
     * Sets the msid value for this ActivateSubscriptionNpaWithRsvIdReply.
     * 
     * @param msid   * The Mobile Station Identifier that is assigned to the MDN.
     */
    public void setMsid(java.lang.String msid) {
        this.msid = msid;
    }


    /**
     * Gets the csa value for this ActivateSubscriptionNpaWithRsvIdReply.
     * 
     * @return csa   * Communication Service Area Identifier of the Reseller.
     */
    public java.lang.String getCsa() {
        return csa;
    }


    /**
     * Sets the csa value for this ActivateSubscriptionNpaWithRsvIdReply.
     * 
     * @param csa   * Communication Service Area Identifier of the Reseller.
     */
    public void setCsa(java.lang.String csa) {
        this.csa = csa;
    }


    /**
     * Gets the effectiveDate value for this ActivateSubscriptionNpaWithRsvIdReply.
     * 
     * @return effectiveDate   * Effective date is the date subscription the Subscription will
     * be activated.
     */
    public java.util.Date getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ActivateSubscriptionNpaWithRsvIdReply.
     * 
     * @param effectiveDate   * Effective date is the date subscription the Subscription will
     * be activated.
     */
    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the pricePlan value for this ActivateSubscriptionNpaWithRsvIdReply.
     * 
     * @return pricePlan   * A line item record of a price plan or a service.
     */
    public com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ProductDeployment getPricePlan() {
        return pricePlan;
    }


    /**
     * Sets the pricePlan value for this ActivateSubscriptionNpaWithRsvIdReply.
     * 
     * @param pricePlan   * A line item record of a price plan or a service.
     */
    public void setPricePlan(com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ProductDeployment pricePlan) {
        this.pricePlan = pricePlan;
    }


    /**
     * Gets the serviceList value for this ActivateSubscriptionNpaWithRsvIdReply.
     * 
     * @return serviceList   * List of service records containing valid feature services the
     * MVNO has defined and available for the CSA.
     */
    public com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ProductDeployment[] getServiceList() {
        return serviceList;
    }


    /**
     * Sets the serviceList value for this ActivateSubscriptionNpaWithRsvIdReply.
     * 
     * @param serviceList   * List of service records containing valid feature services the
     * MVNO has defined and available for the CSA.
     */
    public void setServiceList(com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ProductDeployment[] serviceList) {
        this.serviceList = serviceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivateSubscriptionNpaWithRsvIdReply)) return false;
        ActivateSubscriptionNpaWithRsvIdReply other = (ActivateSubscriptionNpaWithRsvIdReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reserveMdnId==null && other.getReserveMdnId()==null) || 
             (this.reserveMdnId!=null &&
              this.reserveMdnId.equals(other.getReserveMdnId()))) &&
            ((this.mdn==null && other.getMdn()==null) || 
             (this.mdn!=null &&
              this.mdn.equals(other.getMdn()))) &&
            ((this.msid==null && other.getMsid()==null) || 
             (this.msid!=null &&
              this.msid.equals(other.getMsid()))) &&
            ((this.csa==null && other.getCsa()==null) || 
             (this.csa!=null &&
              this.csa.equals(other.getCsa()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.pricePlan==null && other.getPricePlan()==null) || 
             (this.pricePlan!=null &&
              this.pricePlan.equals(other.getPricePlan()))) &&
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
        if (getReserveMdnId() != null) {
            _hashCode += getReserveMdnId().hashCode();
        }
        if (getMdn() != null) {
            _hashCode += getMdn().hashCode();
        }
        if (getMsid() != null) {
            _hashCode += getMsid().hashCode();
        }
        if (getCsa() != null) {
            _hashCode += getCsa().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getPricePlan() != null) {
            _hashCode += getPricePlan().hashCode();
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
        new org.apache.axis.description.TypeDesc(ActivateSubscriptionNpaWithRsvIdReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "ActivateSubscriptionNpaWithRsvIdReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserveMdnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "reserveMdnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "mdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "msid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "csa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "pricePlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "ProductDeployment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "serviceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "ProductDeployment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscription/v1/SubscriptionEnvelope.xsd", "serviceRecord"));
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
