/**
 * BillingAddressInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class BillingAddressInfoType  implements java.io.Serializable {
    /* Old Service Provider Billing Street Number */
    private java.lang.String streetNumber;

    /* Old Service Provider Billing Street Name */
    private java.lang.String streetName;

    /* Old Service Provider Billing Street Directional e.g: E, NE,
     * N, NW */
    private java.lang.String streetDirectionInd;

    /* Old Service Provider Billing City */
    private java.lang.String city;

    /* Old Service Provider State
     * State/Province of the subscriber’s billing address */
    private java.lang.String state;

    /* Old Service Provider Zip Code or postal code of the subscriber’s
     * billing address */
    private java.lang.String zipCode;

    /* Old service provider country of the billing address. */
    private java.lang.String country;

    public BillingAddressInfoType() {
    }

    public BillingAddressInfoType(
           java.lang.String streetNumber,
           java.lang.String streetName,
           java.lang.String streetDirectionInd,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zipCode,
           java.lang.String country) {
           this.streetNumber = streetNumber;
           this.streetName = streetName;
           this.streetDirectionInd = streetDirectionInd;
           this.city = city;
           this.state = state;
           this.zipCode = zipCode;
           this.country = country;
    }


    /**
     * Gets the streetNumber value for this BillingAddressInfoType.
     * 
     * @return streetNumber   * Old Service Provider Billing Street Number
     */
    public java.lang.String getStreetNumber() {
        return streetNumber;
    }


    /**
     * Sets the streetNumber value for this BillingAddressInfoType.
     * 
     * @param streetNumber   * Old Service Provider Billing Street Number
     */
    public void setStreetNumber(java.lang.String streetNumber) {
        this.streetNumber = streetNumber;
    }


    /**
     * Gets the streetName value for this BillingAddressInfoType.
     * 
     * @return streetName   * Old Service Provider Billing Street Name
     */
    public java.lang.String getStreetName() {
        return streetName;
    }


    /**
     * Sets the streetName value for this BillingAddressInfoType.
     * 
     * @param streetName   * Old Service Provider Billing Street Name
     */
    public void setStreetName(java.lang.String streetName) {
        this.streetName = streetName;
    }


    /**
     * Gets the streetDirectionInd value for this BillingAddressInfoType.
     * 
     * @return streetDirectionInd   * Old Service Provider Billing Street Directional e.g: E, NE,
     * N, NW
     */
    public java.lang.String getStreetDirectionInd() {
        return streetDirectionInd;
    }


    /**
     * Sets the streetDirectionInd value for this BillingAddressInfoType.
     * 
     * @param streetDirectionInd   * Old Service Provider Billing Street Directional e.g: E, NE,
     * N, NW
     */
    public void setStreetDirectionInd(java.lang.String streetDirectionInd) {
        this.streetDirectionInd = streetDirectionInd;
    }


    /**
     * Gets the city value for this BillingAddressInfoType.
     * 
     * @return city   * Old Service Provider Billing City
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this BillingAddressInfoType.
     * 
     * @param city   * Old Service Provider Billing City
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this BillingAddressInfoType.
     * 
     * @return state   * Old Service Provider State
     * State/Province of the subscriber’s billing address
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this BillingAddressInfoType.
     * 
     * @param state   * Old Service Provider State
     * State/Province of the subscriber’s billing address
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zipCode value for this BillingAddressInfoType.
     * 
     * @return zipCode   * Old Service Provider Zip Code or postal code of the subscriber’s
     * billing address
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this BillingAddressInfoType.
     * 
     * @param zipCode   * Old Service Provider Zip Code or postal code of the subscriber’s
     * billing address
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the country value for this BillingAddressInfoType.
     * 
     * @return country   * Old service provider country of the billing address.
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this BillingAddressInfoType.
     * 
     * @param country   * Old service provider country of the billing address.
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingAddressInfoType)) return false;
        BillingAddressInfoType other = (BillingAddressInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.streetNumber==null && other.getStreetNumber()==null) || 
             (this.streetNumber!=null &&
              this.streetNumber.equals(other.getStreetNumber()))) &&
            ((this.streetName==null && other.getStreetName()==null) || 
             (this.streetName!=null &&
              this.streetName.equals(other.getStreetName()))) &&
            ((this.streetDirectionInd==null && other.getStreetDirectionInd()==null) || 
             (this.streetDirectionInd!=null &&
              this.streetDirectionInd.equals(other.getStreetDirectionInd()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry())));
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
        if (getStreetNumber() != null) {
            _hashCode += getStreetNumber().hashCode();
        }
        if (getStreetName() != null) {
            _hashCode += getStreetName().hashCode();
        }
        if (getStreetDirectionInd() != null) {
            _hashCode += getStreetDirectionInd().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingAddressInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "BillingAddressInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "streetNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "streetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetDirectionInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "streetDirectionInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "country"));
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
