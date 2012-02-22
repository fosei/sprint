/**
 * QueryCsaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd;


/**
 * This API provides the ability to request a CSA for an address from
 * an external system.
 */
public class QueryCsaRequest  implements java.io.Serializable {
    private com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.GeographicCodeType geoCode;

    /* Street address (address number may be omitted for cross-street
     * searches) */
    private java.lang.String street;

    /* Cross Street is the name of an intersecting street for cross-street
     * geocoding. */
    private java.lang.String xStreet;

    private java.lang.String city;

    private java.lang.String state;

    private com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.PostalCode zip;

    private java.lang.String country;

    public QueryCsaRequest() {
    }

    public QueryCsaRequest(
           com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.GeographicCodeType geoCode,
           java.lang.String street,
           java.lang.String xStreet,
           java.lang.String city,
           java.lang.String state,
           com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.PostalCode zip,
           java.lang.String country) {
           this.geoCode = geoCode;
           this.street = street;
           this.xStreet = xStreet;
           this.city = city;
           this.state = state;
           this.zip = zip;
           this.country = country;
    }


    /**
     * Gets the geoCode value for this QueryCsaRequest.
     * 
     * @return geoCode
     */
    public com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.GeographicCodeType getGeoCode() {
        return geoCode;
    }


    /**
     * Sets the geoCode value for this QueryCsaRequest.
     * 
     * @param geoCode
     */
    public void setGeoCode(com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.GeographicCodeType geoCode) {
        this.geoCode = geoCode;
    }


    /**
     * Gets the street value for this QueryCsaRequest.
     * 
     * @return street   * Street address (address number may be omitted for cross-street
     * searches)
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this QueryCsaRequest.
     * 
     * @param street   * Street address (address number may be omitted for cross-street
     * searches)
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the xStreet value for this QueryCsaRequest.
     * 
     * @return xStreet   * Cross Street is the name of an intersecting street for cross-street
     * geocoding.
     */
    public java.lang.String getXStreet() {
        return xStreet;
    }


    /**
     * Sets the xStreet value for this QueryCsaRequest.
     * 
     * @param xStreet   * Cross Street is the name of an intersecting street for cross-street
     * geocoding.
     */
    public void setXStreet(java.lang.String xStreet) {
        this.xStreet = xStreet;
    }


    /**
     * Gets the city value for this QueryCsaRequest.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this QueryCsaRequest.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this QueryCsaRequest.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this QueryCsaRequest.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this QueryCsaRequest.
     * 
     * @return zip
     */
    public com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.PostalCode getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this QueryCsaRequest.
     * 
     * @param zip
     */
    public void setZip(com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.PostalCode zip) {
        this.zip = zip;
    }


    /**
     * Gets the country value for this QueryCsaRequest.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this QueryCsaRequest.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCsaRequest)) return false;
        QueryCsaRequest other = (QueryCsaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geoCode==null && other.getGeoCode()==null) || 
             (this.geoCode!=null &&
              this.geoCode.equals(other.getGeoCode()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.xStreet==null && other.getXStreet()==null) || 
             (this.xStreet!=null &&
              this.xStreet.equals(other.getXStreet()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
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
        if (getGeoCode() != null) {
            _hashCode += getGeoCode().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getXStreet() != null) {
            _hashCode += getXStreet().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCsaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "QueryCsaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "geoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "GeographicCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "PostalAddressLine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "xStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "PostalCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "country"));
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
