/**
 * PortInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd;

public class PortInformation  implements java.io.Serializable {
    private java.lang.String mdn;

    private com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.TimeZoneCode timeZone;

    private java.lang.String authorizedBy;

    private java.lang.String billFirstName;

    private java.lang.String billLastName;

    private java.lang.String businessName;

    private java.lang.String billStreetNumber;

    private java.lang.String billStreetName;

    private java.lang.String billStreetDirectionIndicator;

    private java.lang.String billCityName;

    private java.lang.String billStateCode;

    private com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PostalCode zip;

    private java.lang.String ssn;

    private java.lang.String taxId;

    private java.lang.String accountNumber;

    private java.lang.String passwordPin;

    public PortInformation() {
    }

    public PortInformation(
           java.lang.String mdn,
           com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.TimeZoneCode timeZone,
           java.lang.String authorizedBy,
           java.lang.String billFirstName,
           java.lang.String billLastName,
           java.lang.String businessName,
           java.lang.String billStreetNumber,
           java.lang.String billStreetName,
           java.lang.String billStreetDirectionIndicator,
           java.lang.String billCityName,
           java.lang.String billStateCode,
           com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PostalCode zip,
           java.lang.String ssn,
           java.lang.String taxId,
           java.lang.String accountNumber,
           java.lang.String passwordPin) {
           this.mdn = mdn;
           this.timeZone = timeZone;
           this.authorizedBy = authorizedBy;
           this.billFirstName = billFirstName;
           this.billLastName = billLastName;
           this.businessName = businessName;
           this.billStreetNumber = billStreetNumber;
           this.billStreetName = billStreetName;
           this.billStreetDirectionIndicator = billStreetDirectionIndicator;
           this.billCityName = billCityName;
           this.billStateCode = billStateCode;
           this.zip = zip;
           this.ssn = ssn;
           this.taxId = taxId;
           this.accountNumber = accountNumber;
           this.passwordPin = passwordPin;
    }


    /**
     * Gets the mdn value for this PortInformation.
     * 
     * @return mdn
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this PortInformation.
     * 
     * @param mdn
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the timeZone value for this PortInformation.
     * 
     * @return timeZone
     */
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.TimeZoneCode getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this PortInformation.
     * 
     * @param timeZone
     */
    public void setTimeZone(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.TimeZoneCode timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the authorizedBy value for this PortInformation.
     * 
     * @return authorizedBy
     */
    public java.lang.String getAuthorizedBy() {
        return authorizedBy;
    }


    /**
     * Sets the authorizedBy value for this PortInformation.
     * 
     * @param authorizedBy
     */
    public void setAuthorizedBy(java.lang.String authorizedBy) {
        this.authorizedBy = authorizedBy;
    }


    /**
     * Gets the billFirstName value for this PortInformation.
     * 
     * @return billFirstName
     */
    public java.lang.String getBillFirstName() {
        return billFirstName;
    }


    /**
     * Sets the billFirstName value for this PortInformation.
     * 
     * @param billFirstName
     */
    public void setBillFirstName(java.lang.String billFirstName) {
        this.billFirstName = billFirstName;
    }


    /**
     * Gets the billLastName value for this PortInformation.
     * 
     * @return billLastName
     */
    public java.lang.String getBillLastName() {
        return billLastName;
    }


    /**
     * Sets the billLastName value for this PortInformation.
     * 
     * @param billLastName
     */
    public void setBillLastName(java.lang.String billLastName) {
        this.billLastName = billLastName;
    }


    /**
     * Gets the businessName value for this PortInformation.
     * 
     * @return businessName
     */
    public java.lang.String getBusinessName() {
        return businessName;
    }


    /**
     * Sets the businessName value for this PortInformation.
     * 
     * @param businessName
     */
    public void setBusinessName(java.lang.String businessName) {
        this.businessName = businessName;
    }


    /**
     * Gets the billStreetNumber value for this PortInformation.
     * 
     * @return billStreetNumber
     */
    public java.lang.String getBillStreetNumber() {
        return billStreetNumber;
    }


    /**
     * Sets the billStreetNumber value for this PortInformation.
     * 
     * @param billStreetNumber
     */
    public void setBillStreetNumber(java.lang.String billStreetNumber) {
        this.billStreetNumber = billStreetNumber;
    }


    /**
     * Gets the billStreetName value for this PortInformation.
     * 
     * @return billStreetName
     */
    public java.lang.String getBillStreetName() {
        return billStreetName;
    }


    /**
     * Sets the billStreetName value for this PortInformation.
     * 
     * @param billStreetName
     */
    public void setBillStreetName(java.lang.String billStreetName) {
        this.billStreetName = billStreetName;
    }


    /**
     * Gets the billStreetDirectionIndicator value for this PortInformation.
     * 
     * @return billStreetDirectionIndicator
     */
    public java.lang.String getBillStreetDirectionIndicator() {
        return billStreetDirectionIndicator;
    }


    /**
     * Sets the billStreetDirectionIndicator value for this PortInformation.
     * 
     * @param billStreetDirectionIndicator
     */
    public void setBillStreetDirectionIndicator(java.lang.String billStreetDirectionIndicator) {
        this.billStreetDirectionIndicator = billStreetDirectionIndicator;
    }


    /**
     * Gets the billCityName value for this PortInformation.
     * 
     * @return billCityName
     */
    public java.lang.String getBillCityName() {
        return billCityName;
    }


    /**
     * Sets the billCityName value for this PortInformation.
     * 
     * @param billCityName
     */
    public void setBillCityName(java.lang.String billCityName) {
        this.billCityName = billCityName;
    }


    /**
     * Gets the billStateCode value for this PortInformation.
     * 
     * @return billStateCode
     */
    public java.lang.String getBillStateCode() {
        return billStateCode;
    }


    /**
     * Sets the billStateCode value for this PortInformation.
     * 
     * @param billStateCode
     */
    public void setBillStateCode(java.lang.String billStateCode) {
        this.billStateCode = billStateCode;
    }


    /**
     * Gets the zip value for this PortInformation.
     * 
     * @return zip
     */
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PostalCode getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this PortInformation.
     * 
     * @param zip
     */
    public void setZip(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PostalCode zip) {
        this.zip = zip;
    }


    /**
     * Gets the ssn value for this PortInformation.
     * 
     * @return ssn
     */
    public java.lang.String getSsn() {
        return ssn;
    }


    /**
     * Sets the ssn value for this PortInformation.
     * 
     * @param ssn
     */
    public void setSsn(java.lang.String ssn) {
        this.ssn = ssn;
    }


    /**
     * Gets the taxId value for this PortInformation.
     * 
     * @return taxId
     */
    public java.lang.String getTaxId() {
        return taxId;
    }


    /**
     * Sets the taxId value for this PortInformation.
     * 
     * @param taxId
     */
    public void setTaxId(java.lang.String taxId) {
        this.taxId = taxId;
    }


    /**
     * Gets the accountNumber value for this PortInformation.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this PortInformation.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the passwordPin value for this PortInformation.
     * 
     * @return passwordPin
     */
    public java.lang.String getPasswordPin() {
        return passwordPin;
    }


    /**
     * Sets the passwordPin value for this PortInformation.
     * 
     * @param passwordPin
     */
    public void setPasswordPin(java.lang.String passwordPin) {
        this.passwordPin = passwordPin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortInformation)) return false;
        PortInformation other = (PortInformation) obj;
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
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.authorizedBy==null && other.getAuthorizedBy()==null) || 
             (this.authorizedBy!=null &&
              this.authorizedBy.equals(other.getAuthorizedBy()))) &&
            ((this.billFirstName==null && other.getBillFirstName()==null) || 
             (this.billFirstName!=null &&
              this.billFirstName.equals(other.getBillFirstName()))) &&
            ((this.billLastName==null && other.getBillLastName()==null) || 
             (this.billLastName!=null &&
              this.billLastName.equals(other.getBillLastName()))) &&
            ((this.businessName==null && other.getBusinessName()==null) || 
             (this.businessName!=null &&
              this.businessName.equals(other.getBusinessName()))) &&
            ((this.billStreetNumber==null && other.getBillStreetNumber()==null) || 
             (this.billStreetNumber!=null &&
              this.billStreetNumber.equals(other.getBillStreetNumber()))) &&
            ((this.billStreetName==null && other.getBillStreetName()==null) || 
             (this.billStreetName!=null &&
              this.billStreetName.equals(other.getBillStreetName()))) &&
            ((this.billStreetDirectionIndicator==null && other.getBillStreetDirectionIndicator()==null) || 
             (this.billStreetDirectionIndicator!=null &&
              this.billStreetDirectionIndicator.equals(other.getBillStreetDirectionIndicator()))) &&
            ((this.billCityName==null && other.getBillCityName()==null) || 
             (this.billCityName!=null &&
              this.billCityName.equals(other.getBillCityName()))) &&
            ((this.billStateCode==null && other.getBillStateCode()==null) || 
             (this.billStateCode!=null &&
              this.billStateCode.equals(other.getBillStateCode()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            ((this.ssn==null && other.getSsn()==null) || 
             (this.ssn!=null &&
              this.ssn.equals(other.getSsn()))) &&
            ((this.taxId==null && other.getTaxId()==null) || 
             (this.taxId!=null &&
              this.taxId.equals(other.getTaxId()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.passwordPin==null && other.getPasswordPin()==null) || 
             (this.passwordPin!=null &&
              this.passwordPin.equals(other.getPasswordPin())));
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
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getAuthorizedBy() != null) {
            _hashCode += getAuthorizedBy().hashCode();
        }
        if (getBillFirstName() != null) {
            _hashCode += getBillFirstName().hashCode();
        }
        if (getBillLastName() != null) {
            _hashCode += getBillLastName().hashCode();
        }
        if (getBusinessName() != null) {
            _hashCode += getBusinessName().hashCode();
        }
        if (getBillStreetNumber() != null) {
            _hashCode += getBillStreetNumber().hashCode();
        }
        if (getBillStreetName() != null) {
            _hashCode += getBillStreetName().hashCode();
        }
        if (getBillStreetDirectionIndicator() != null) {
            _hashCode += getBillStreetDirectionIndicator().hashCode();
        }
        if (getBillCityName() != null) {
            _hashCode += getBillCityName().hashCode();
        }
        if (getBillStateCode() != null) {
            _hashCode += getBillStateCode().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getSsn() != null) {
            _hashCode += getSsn().hashCode();
        }
        if (getTaxId() != null) {
            _hashCode += getTaxId().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getPasswordPin() != null) {
            _hashCode += getPasswordPin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "PortInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "mdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "TimeZoneCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "authorizedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "OrganizationName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "billFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "FirstName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "billLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "LastName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "businessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "OrganizationName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billStreetNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "billStreetNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "StreetNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billStreetName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "billStreetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "StreetName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billStreetDirectionIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "billStreetDirectionIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "TrailingDirection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "billCityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "CityName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billStateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "billStateCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "PostalCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "ssn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "PartyOtherIdValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "taxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "PartyOtherIdValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordPin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "passwordPin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "Password"));
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
