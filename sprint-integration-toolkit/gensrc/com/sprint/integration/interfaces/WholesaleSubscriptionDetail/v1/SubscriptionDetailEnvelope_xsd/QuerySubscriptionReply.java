/**
 * QuerySubscriptionReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd;


/**
 * This API provides the ability to access Reseller subscription current
 * and historical information based on access number or Device ID.
 */
public class QuerySubscriptionReply  implements java.io.Serializable {
    private com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessEqpAsgmInfo[] esnList;

    private java.lang.Boolean areMoreEsn;

    private com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessNbrAsgmInfo[] mdnList;

    private java.lang.Boolean areMoreMdn;

    private java.util.Date activationDate;

    private java.lang.String csa;

    private com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessChnlAsgm[] currentNaiList;

    private com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessChnlAsgm[] expiredNaiList;

    private java.lang.Boolean areMorePricePlans;

    private com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ServiceRecord[] pricePlanList;

    private java.util.Date subscriptionEffectiveDate;

    private java.util.Date subscriptionExpireDate;

    private java.lang.String subscriptionTypeCode;

    private java.lang.Boolean areMoreServices;

    /* List of service records containing valid feature services the
     * MVNO has defined and available for the CSA. */
    private com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ServiceRecord[] detailedServiceList;

    public QuerySubscriptionReply() {
    }

    public QuerySubscriptionReply(
           com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessEqpAsgmInfo[] esnList,
           java.lang.Boolean areMoreEsn,
           com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessNbrAsgmInfo[] mdnList,
           java.lang.Boolean areMoreMdn,
           java.util.Date activationDate,
           java.lang.String csa,
           com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessChnlAsgm[] currentNaiList,
           com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessChnlAsgm[] expiredNaiList,
           java.lang.Boolean areMorePricePlans,
           com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ServiceRecord[] pricePlanList,
           java.util.Date subscriptionEffectiveDate,
           java.util.Date subscriptionExpireDate,
           java.lang.String subscriptionTypeCode,
           java.lang.Boolean areMoreServices,
           com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ServiceRecord[] detailedServiceList) {
           this.esnList = esnList;
           this.areMoreEsn = areMoreEsn;
           this.mdnList = mdnList;
           this.areMoreMdn = areMoreMdn;
           this.activationDate = activationDate;
           this.csa = csa;
           this.currentNaiList = currentNaiList;
           this.expiredNaiList = expiredNaiList;
           this.areMorePricePlans = areMorePricePlans;
           this.pricePlanList = pricePlanList;
           this.subscriptionEffectiveDate = subscriptionEffectiveDate;
           this.subscriptionExpireDate = subscriptionExpireDate;
           this.subscriptionTypeCode = subscriptionTypeCode;
           this.areMoreServices = areMoreServices;
           this.detailedServiceList = detailedServiceList;
    }


    /**
     * Gets the esnList value for this QuerySubscriptionReply.
     * 
     * @return esnList
     */
    public com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessEqpAsgmInfo[] getEsnList() {
        return esnList;
    }


    /**
     * Sets the esnList value for this QuerySubscriptionReply.
     * 
     * @param esnList
     */
    public void setEsnList(com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessEqpAsgmInfo[] esnList) {
        this.esnList = esnList;
    }


    /**
     * Gets the areMoreEsn value for this QuerySubscriptionReply.
     * 
     * @return areMoreEsn
     */
    public java.lang.Boolean getAreMoreEsn() {
        return areMoreEsn;
    }


    /**
     * Sets the areMoreEsn value for this QuerySubscriptionReply.
     * 
     * @param areMoreEsn
     */
    public void setAreMoreEsn(java.lang.Boolean areMoreEsn) {
        this.areMoreEsn = areMoreEsn;
    }


    /**
     * Gets the mdnList value for this QuerySubscriptionReply.
     * 
     * @return mdnList
     */
    public com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessNbrAsgmInfo[] getMdnList() {
        return mdnList;
    }


    /**
     * Sets the mdnList value for this QuerySubscriptionReply.
     * 
     * @param mdnList
     */
    public void setMdnList(com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessNbrAsgmInfo[] mdnList) {
        this.mdnList = mdnList;
    }


    /**
     * Gets the areMoreMdn value for this QuerySubscriptionReply.
     * 
     * @return areMoreMdn
     */
    public java.lang.Boolean getAreMoreMdn() {
        return areMoreMdn;
    }


    /**
     * Sets the areMoreMdn value for this QuerySubscriptionReply.
     * 
     * @param areMoreMdn
     */
    public void setAreMoreMdn(java.lang.Boolean areMoreMdn) {
        this.areMoreMdn = areMoreMdn;
    }


    /**
     * Gets the activationDate value for this QuerySubscriptionReply.
     * 
     * @return activationDate
     */
    public java.util.Date getActivationDate() {
        return activationDate;
    }


    /**
     * Sets the activationDate value for this QuerySubscriptionReply.
     * 
     * @param activationDate
     */
    public void setActivationDate(java.util.Date activationDate) {
        this.activationDate = activationDate;
    }


    /**
     * Gets the csa value for this QuerySubscriptionReply.
     * 
     * @return csa
     */
    public java.lang.String getCsa() {
        return csa;
    }


    /**
     * Sets the csa value for this QuerySubscriptionReply.
     * 
     * @param csa
     */
    public void setCsa(java.lang.String csa) {
        this.csa = csa;
    }


    /**
     * Gets the currentNaiList value for this QuerySubscriptionReply.
     * 
     * @return currentNaiList
     */
    public com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessChnlAsgm[] getCurrentNaiList() {
        return currentNaiList;
    }


    /**
     * Sets the currentNaiList value for this QuerySubscriptionReply.
     * 
     * @param currentNaiList
     */
    public void setCurrentNaiList(com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessChnlAsgm[] currentNaiList) {
        this.currentNaiList = currentNaiList;
    }


    /**
     * Gets the expiredNaiList value for this QuerySubscriptionReply.
     * 
     * @return expiredNaiList
     */
    public com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessChnlAsgm[] getExpiredNaiList() {
        return expiredNaiList;
    }


    /**
     * Sets the expiredNaiList value for this QuerySubscriptionReply.
     * 
     * @param expiredNaiList
     */
    public void setExpiredNaiList(com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.AccessChnlAsgm[] expiredNaiList) {
        this.expiredNaiList = expiredNaiList;
    }


    /**
     * Gets the areMorePricePlans value for this QuerySubscriptionReply.
     * 
     * @return areMorePricePlans
     */
    public java.lang.Boolean getAreMorePricePlans() {
        return areMorePricePlans;
    }


    /**
     * Sets the areMorePricePlans value for this QuerySubscriptionReply.
     * 
     * @param areMorePricePlans
     */
    public void setAreMorePricePlans(java.lang.Boolean areMorePricePlans) {
        this.areMorePricePlans = areMorePricePlans;
    }


    /**
     * Gets the pricePlanList value for this QuerySubscriptionReply.
     * 
     * @return pricePlanList
     */
    public com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ServiceRecord[] getPricePlanList() {
        return pricePlanList;
    }


    /**
     * Sets the pricePlanList value for this QuerySubscriptionReply.
     * 
     * @param pricePlanList
     */
    public void setPricePlanList(com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ServiceRecord[] pricePlanList) {
        this.pricePlanList = pricePlanList;
    }


    /**
     * Gets the subscriptionEffectiveDate value for this QuerySubscriptionReply.
     * 
     * @return subscriptionEffectiveDate
     */
    public java.util.Date getSubscriptionEffectiveDate() {
        return subscriptionEffectiveDate;
    }


    /**
     * Sets the subscriptionEffectiveDate value for this QuerySubscriptionReply.
     * 
     * @param subscriptionEffectiveDate
     */
    public void setSubscriptionEffectiveDate(java.util.Date subscriptionEffectiveDate) {
        this.subscriptionEffectiveDate = subscriptionEffectiveDate;
    }


    /**
     * Gets the subscriptionExpireDate value for this QuerySubscriptionReply.
     * 
     * @return subscriptionExpireDate
     */
    public java.util.Date getSubscriptionExpireDate() {
        return subscriptionExpireDate;
    }


    /**
     * Sets the subscriptionExpireDate value for this QuerySubscriptionReply.
     * 
     * @param subscriptionExpireDate
     */
    public void setSubscriptionExpireDate(java.util.Date subscriptionExpireDate) {
        this.subscriptionExpireDate = subscriptionExpireDate;
    }


    /**
     * Gets the subscriptionTypeCode value for this QuerySubscriptionReply.
     * 
     * @return subscriptionTypeCode
     */
    public java.lang.String getSubscriptionTypeCode() {
        return subscriptionTypeCode;
    }


    /**
     * Sets the subscriptionTypeCode value for this QuerySubscriptionReply.
     * 
     * @param subscriptionTypeCode
     */
    public void setSubscriptionTypeCode(java.lang.String subscriptionTypeCode) {
        this.subscriptionTypeCode = subscriptionTypeCode;
    }


    /**
     * Gets the areMoreServices value for this QuerySubscriptionReply.
     * 
     * @return areMoreServices
     */
    public java.lang.Boolean getAreMoreServices() {
        return areMoreServices;
    }


    /**
     * Sets the areMoreServices value for this QuerySubscriptionReply.
     * 
     * @param areMoreServices
     */
    public void setAreMoreServices(java.lang.Boolean areMoreServices) {
        this.areMoreServices = areMoreServices;
    }


    /**
     * Gets the detailedServiceList value for this QuerySubscriptionReply.
     * 
     * @return detailedServiceList   * List of service records containing valid feature services the
     * MVNO has defined and available for the CSA.
     */
    public com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ServiceRecord[] getDetailedServiceList() {
        return detailedServiceList;
    }


    /**
     * Sets the detailedServiceList value for this QuerySubscriptionReply.
     * 
     * @param detailedServiceList   * List of service records containing valid feature services the
     * MVNO has defined and available for the CSA.
     */
    public void setDetailedServiceList(com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ServiceRecord[] detailedServiceList) {
        this.detailedServiceList = detailedServiceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySubscriptionReply)) return false;
        QuerySubscriptionReply other = (QuerySubscriptionReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.esnList==null && other.getEsnList()==null) || 
             (this.esnList!=null &&
              java.util.Arrays.equals(this.esnList, other.getEsnList()))) &&
            ((this.areMoreEsn==null && other.getAreMoreEsn()==null) || 
             (this.areMoreEsn!=null &&
              this.areMoreEsn.equals(other.getAreMoreEsn()))) &&
            ((this.mdnList==null && other.getMdnList()==null) || 
             (this.mdnList!=null &&
              java.util.Arrays.equals(this.mdnList, other.getMdnList()))) &&
            ((this.areMoreMdn==null && other.getAreMoreMdn()==null) || 
             (this.areMoreMdn!=null &&
              this.areMoreMdn.equals(other.getAreMoreMdn()))) &&
            ((this.activationDate==null && other.getActivationDate()==null) || 
             (this.activationDate!=null &&
              this.activationDate.equals(other.getActivationDate()))) &&
            ((this.csa==null && other.getCsa()==null) || 
             (this.csa!=null &&
              this.csa.equals(other.getCsa()))) &&
            ((this.currentNaiList==null && other.getCurrentNaiList()==null) || 
             (this.currentNaiList!=null &&
              java.util.Arrays.equals(this.currentNaiList, other.getCurrentNaiList()))) &&
            ((this.expiredNaiList==null && other.getExpiredNaiList()==null) || 
             (this.expiredNaiList!=null &&
              java.util.Arrays.equals(this.expiredNaiList, other.getExpiredNaiList()))) &&
            ((this.areMorePricePlans==null && other.getAreMorePricePlans()==null) || 
             (this.areMorePricePlans!=null &&
              this.areMorePricePlans.equals(other.getAreMorePricePlans()))) &&
            ((this.pricePlanList==null && other.getPricePlanList()==null) || 
             (this.pricePlanList!=null &&
              java.util.Arrays.equals(this.pricePlanList, other.getPricePlanList()))) &&
            ((this.subscriptionEffectiveDate==null && other.getSubscriptionEffectiveDate()==null) || 
             (this.subscriptionEffectiveDate!=null &&
              this.subscriptionEffectiveDate.equals(other.getSubscriptionEffectiveDate()))) &&
            ((this.subscriptionExpireDate==null && other.getSubscriptionExpireDate()==null) || 
             (this.subscriptionExpireDate!=null &&
              this.subscriptionExpireDate.equals(other.getSubscriptionExpireDate()))) &&
            ((this.subscriptionTypeCode==null && other.getSubscriptionTypeCode()==null) || 
             (this.subscriptionTypeCode!=null &&
              this.subscriptionTypeCode.equals(other.getSubscriptionTypeCode()))) &&
            ((this.areMoreServices==null && other.getAreMoreServices()==null) || 
             (this.areMoreServices!=null &&
              this.areMoreServices.equals(other.getAreMoreServices()))) &&
            ((this.detailedServiceList==null && other.getDetailedServiceList()==null) || 
             (this.detailedServiceList!=null &&
              java.util.Arrays.equals(this.detailedServiceList, other.getDetailedServiceList())));
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
        if (getEsnList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEsnList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEsnList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAreMoreEsn() != null) {
            _hashCode += getAreMoreEsn().hashCode();
        }
        if (getMdnList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMdnList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMdnList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAreMoreMdn() != null) {
            _hashCode += getAreMoreMdn().hashCode();
        }
        if (getActivationDate() != null) {
            _hashCode += getActivationDate().hashCode();
        }
        if (getCsa() != null) {
            _hashCode += getCsa().hashCode();
        }
        if (getCurrentNaiList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrentNaiList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrentNaiList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpiredNaiList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpiredNaiList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpiredNaiList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAreMorePricePlans() != null) {
            _hashCode += getAreMorePricePlans().hashCode();
        }
        if (getPricePlanList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricePlanList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPricePlanList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriptionEffectiveDate() != null) {
            _hashCode += getSubscriptionEffectiveDate().hashCode();
        }
        if (getSubscriptionExpireDate() != null) {
            _hashCode += getSubscriptionExpireDate().hashCode();
        }
        if (getSubscriptionTypeCode() != null) {
            _hashCode += getSubscriptionTypeCode().hashCode();
        }
        if (getAreMoreServices() != null) {
            _hashCode += getAreMoreServices().hashCode();
        }
        if (getDetailedServiceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailedServiceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailedServiceList(), i);
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
        new org.apache.axis.description.TypeDesc(QuerySubscriptionReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "QuerySubscriptionReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esnList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "esnList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "AccessEqpAsgmInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "esnRecord"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areMoreEsn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "areMoreEsn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdnList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "mdnList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "AccessNbrAsgmInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "mdnRecord"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areMoreMdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "areMoreMdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "activationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("currentNaiList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "currentNaiList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "AccessChnlAsgm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "NaiRecord"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiredNaiList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "expiredNaiList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "AccessChnlAsgm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "NaiRecord"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areMorePricePlans");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "areMorePricePlans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePlanList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "pricePlanList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "ServiceRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "pricePlanRecord"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "subscriptionEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "subscriptionExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "subscriptionTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areMoreServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "areMoreServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailedServiceList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "detailedServiceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "ServiceRecord"));
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
