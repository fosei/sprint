/**
 * QueryCsaReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd;


/**
 * This API provides the ability to request a CSA for an address from
 * an external system.
 */
public class QueryCsaReply  implements java.io.Serializable {
    /* Input street address(address number may be ommitted for cross-street
     * searches) */
    private java.lang.String street;

    private java.lang.String xStreet;

    private java.lang.String city;

    private java.lang.String state;

    private com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.PostalCode zip;

    private java.lang.String country;

    private java.math.BigDecimal longitude;

    private java.math.BigDecimal latitude;

    private java.lang.String confidence;

    private java.lang.String csa;

    private java.lang.Boolean is3G;

    private java.lang.Boolean evdo;

    private java.lang.Boolean iden;

    private java.lang.Boolean hybrid;

    private com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.CoverageQuality coverageQualityCdma;

    private com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.CoverageQuality coverageQualityIden;

    private java.lang.Boolean roamDigital;

    private java.lang.Boolean roamAnalog;

    private java.lang.Boolean upcomingCoverageCdma;

    private java.lang.Boolean upcomingCoverageIden;

    private java.lang.String npa;

    private java.lang.String nxx;

    private java.lang.String affiliateName;

    public QueryCsaReply() {
    }

    public QueryCsaReply(
           java.lang.String street,
           java.lang.String xStreet,
           java.lang.String city,
           java.lang.String state,
           com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.PostalCode zip,
           java.lang.String country,
           java.math.BigDecimal longitude,
           java.math.BigDecimal latitude,
           java.lang.String confidence,
           java.lang.String csa,
           java.lang.Boolean is3G,
           java.lang.Boolean evdo,
           java.lang.Boolean iden,
           java.lang.Boolean hybrid,
           com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.CoverageQuality coverageQualityCdma,
           com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.CoverageQuality coverageQualityIden,
           java.lang.Boolean roamDigital,
           java.lang.Boolean roamAnalog,
           java.lang.Boolean upcomingCoverageCdma,
           java.lang.Boolean upcomingCoverageIden,
           java.lang.String npa,
           java.lang.String nxx,
           java.lang.String affiliateName) {
           this.street = street;
           this.xStreet = xStreet;
           this.city = city;
           this.state = state;
           this.zip = zip;
           this.country = country;
           this.longitude = longitude;
           this.latitude = latitude;
           this.confidence = confidence;
           this.csa = csa;
           this.is3G = is3G;
           this.evdo = evdo;
           this.iden = iden;
           this.hybrid = hybrid;
           this.coverageQualityCdma = coverageQualityCdma;
           this.coverageQualityIden = coverageQualityIden;
           this.roamDigital = roamDigital;
           this.roamAnalog = roamAnalog;
           this.upcomingCoverageCdma = upcomingCoverageCdma;
           this.upcomingCoverageIden = upcomingCoverageIden;
           this.npa = npa;
           this.nxx = nxx;
           this.affiliateName = affiliateName;
    }


    /**
     * Gets the street value for this QueryCsaReply.
     * 
     * @return street   * Input street address(address number may be ommitted for cross-street
     * searches)
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this QueryCsaReply.
     * 
     * @param street   * Input street address(address number may be ommitted for cross-street
     * searches)
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the xStreet value for this QueryCsaReply.
     * 
     * @return xStreet
     */
    public java.lang.String getXStreet() {
        return xStreet;
    }


    /**
     * Sets the xStreet value for this QueryCsaReply.
     * 
     * @param xStreet
     */
    public void setXStreet(java.lang.String xStreet) {
        this.xStreet = xStreet;
    }


    /**
     * Gets the city value for this QueryCsaReply.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this QueryCsaReply.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this QueryCsaReply.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this QueryCsaReply.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this QueryCsaReply.
     * 
     * @return zip
     */
    public com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.PostalCode getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this QueryCsaReply.
     * 
     * @param zip
     */
    public void setZip(com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.PostalCode zip) {
        this.zip = zip;
    }


    /**
     * Gets the country value for this QueryCsaReply.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this QueryCsaReply.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the longitude value for this QueryCsaReply.
     * 
     * @return longitude
     */
    public java.math.BigDecimal getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this QueryCsaReply.
     * 
     * @param longitude
     */
    public void setLongitude(java.math.BigDecimal longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the latitude value for this QueryCsaReply.
     * 
     * @return latitude
     */
    public java.math.BigDecimal getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this QueryCsaReply.
     * 
     * @param latitude
     */
    public void setLatitude(java.math.BigDecimal latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the confidence value for this QueryCsaReply.
     * 
     * @return confidence
     */
    public java.lang.String getConfidence() {
        return confidence;
    }


    /**
     * Sets the confidence value for this QueryCsaReply.
     * 
     * @param confidence
     */
    public void setConfidence(java.lang.String confidence) {
        this.confidence = confidence;
    }


    /**
     * Gets the csa value for this QueryCsaReply.
     * 
     * @return csa
     */
    public java.lang.String getCsa() {
        return csa;
    }


    /**
     * Sets the csa value for this QueryCsaReply.
     * 
     * @param csa
     */
    public void setCsa(java.lang.String csa) {
        this.csa = csa;
    }


    /**
     * Gets the is3G value for this QueryCsaReply.
     * 
     * @return is3G
     */
    public java.lang.Boolean getIs3G() {
        return is3G;
    }


    /**
     * Sets the is3G value for this QueryCsaReply.
     * 
     * @param is3G
     */
    public void setIs3G(java.lang.Boolean is3G) {
        this.is3G = is3G;
    }


    /**
     * Gets the evdo value for this QueryCsaReply.
     * 
     * @return evdo
     */
    public java.lang.Boolean getEvdo() {
        return evdo;
    }


    /**
     * Sets the evdo value for this QueryCsaReply.
     * 
     * @param evdo
     */
    public void setEvdo(java.lang.Boolean evdo) {
        this.evdo = evdo;
    }


    /**
     * Gets the iden value for this QueryCsaReply.
     * 
     * @return iden
     */
    public java.lang.Boolean getIden() {
        return iden;
    }


    /**
     * Sets the iden value for this QueryCsaReply.
     * 
     * @param iden
     */
    public void setIden(java.lang.Boolean iden) {
        this.iden = iden;
    }


    /**
     * Gets the hybrid value for this QueryCsaReply.
     * 
     * @return hybrid
     */
    public java.lang.Boolean getHybrid() {
        return hybrid;
    }


    /**
     * Sets the hybrid value for this QueryCsaReply.
     * 
     * @param hybrid
     */
    public void setHybrid(java.lang.Boolean hybrid) {
        this.hybrid = hybrid;
    }


    /**
     * Gets the coverageQualityCdma value for this QueryCsaReply.
     * 
     * @return coverageQualityCdma
     */
    public com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.CoverageQuality getCoverageQualityCdma() {
        return coverageQualityCdma;
    }


    /**
     * Sets the coverageQualityCdma value for this QueryCsaReply.
     * 
     * @param coverageQualityCdma
     */
    public void setCoverageQualityCdma(com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.CoverageQuality coverageQualityCdma) {
        this.coverageQualityCdma = coverageQualityCdma;
    }


    /**
     * Gets the coverageQualityIden value for this QueryCsaReply.
     * 
     * @return coverageQualityIden
     */
    public com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.CoverageQuality getCoverageQualityIden() {
        return coverageQualityIden;
    }


    /**
     * Sets the coverageQualityIden value for this QueryCsaReply.
     * 
     * @param coverageQualityIden
     */
    public void setCoverageQualityIden(com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.CoverageQuality coverageQualityIden) {
        this.coverageQualityIden = coverageQualityIden;
    }


    /**
     * Gets the roamDigital value for this QueryCsaReply.
     * 
     * @return roamDigital
     */
    public java.lang.Boolean getRoamDigital() {
        return roamDigital;
    }


    /**
     * Sets the roamDigital value for this QueryCsaReply.
     * 
     * @param roamDigital
     */
    public void setRoamDigital(java.lang.Boolean roamDigital) {
        this.roamDigital = roamDigital;
    }


    /**
     * Gets the roamAnalog value for this QueryCsaReply.
     * 
     * @return roamAnalog
     */
    public java.lang.Boolean getRoamAnalog() {
        return roamAnalog;
    }


    /**
     * Sets the roamAnalog value for this QueryCsaReply.
     * 
     * @param roamAnalog
     */
    public void setRoamAnalog(java.lang.Boolean roamAnalog) {
        this.roamAnalog = roamAnalog;
    }


    /**
     * Gets the upcomingCoverageCdma value for this QueryCsaReply.
     * 
     * @return upcomingCoverageCdma
     */
    public java.lang.Boolean getUpcomingCoverageCdma() {
        return upcomingCoverageCdma;
    }


    /**
     * Sets the upcomingCoverageCdma value for this QueryCsaReply.
     * 
     * @param upcomingCoverageCdma
     */
    public void setUpcomingCoverageCdma(java.lang.Boolean upcomingCoverageCdma) {
        this.upcomingCoverageCdma = upcomingCoverageCdma;
    }


    /**
     * Gets the upcomingCoverageIden value for this QueryCsaReply.
     * 
     * @return upcomingCoverageIden
     */
    public java.lang.Boolean getUpcomingCoverageIden() {
        return upcomingCoverageIden;
    }


    /**
     * Sets the upcomingCoverageIden value for this QueryCsaReply.
     * 
     * @param upcomingCoverageIden
     */
    public void setUpcomingCoverageIden(java.lang.Boolean upcomingCoverageIden) {
        this.upcomingCoverageIden = upcomingCoverageIden;
    }


    /**
     * Gets the npa value for this QueryCsaReply.
     * 
     * @return npa
     */
    public java.lang.String getNpa() {
        return npa;
    }


    /**
     * Sets the npa value for this QueryCsaReply.
     * 
     * @param npa
     */
    public void setNpa(java.lang.String npa) {
        this.npa = npa;
    }


    /**
     * Gets the nxx value for this QueryCsaReply.
     * 
     * @return nxx
     */
    public java.lang.String getNxx() {
        return nxx;
    }


    /**
     * Sets the nxx value for this QueryCsaReply.
     * 
     * @param nxx
     */
    public void setNxx(java.lang.String nxx) {
        this.nxx = nxx;
    }


    /**
     * Gets the affiliateName value for this QueryCsaReply.
     * 
     * @return affiliateName
     */
    public java.lang.String getAffiliateName() {
        return affiliateName;
    }


    /**
     * Sets the affiliateName value for this QueryCsaReply.
     * 
     * @param affiliateName
     */
    public void setAffiliateName(java.lang.String affiliateName) {
        this.affiliateName = affiliateName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCsaReply)) return false;
        QueryCsaReply other = (QueryCsaReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
              this.country.equals(other.getCountry()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.confidence==null && other.getConfidence()==null) || 
             (this.confidence!=null &&
              this.confidence.equals(other.getConfidence()))) &&
            ((this.csa==null && other.getCsa()==null) || 
             (this.csa!=null &&
              this.csa.equals(other.getCsa()))) &&
            ((this.is3G==null && other.getIs3G()==null) || 
             (this.is3G!=null &&
              this.is3G.equals(other.getIs3G()))) &&
            ((this.evdo==null && other.getEvdo()==null) || 
             (this.evdo!=null &&
              this.evdo.equals(other.getEvdo()))) &&
            ((this.iden==null && other.getIden()==null) || 
             (this.iden!=null &&
              this.iden.equals(other.getIden()))) &&
            ((this.hybrid==null && other.getHybrid()==null) || 
             (this.hybrid!=null &&
              this.hybrid.equals(other.getHybrid()))) &&
            ((this.coverageQualityCdma==null && other.getCoverageQualityCdma()==null) || 
             (this.coverageQualityCdma!=null &&
              this.coverageQualityCdma.equals(other.getCoverageQualityCdma()))) &&
            ((this.coverageQualityIden==null && other.getCoverageQualityIden()==null) || 
             (this.coverageQualityIden!=null &&
              this.coverageQualityIden.equals(other.getCoverageQualityIden()))) &&
            ((this.roamDigital==null && other.getRoamDigital()==null) || 
             (this.roamDigital!=null &&
              this.roamDigital.equals(other.getRoamDigital()))) &&
            ((this.roamAnalog==null && other.getRoamAnalog()==null) || 
             (this.roamAnalog!=null &&
              this.roamAnalog.equals(other.getRoamAnalog()))) &&
            ((this.upcomingCoverageCdma==null && other.getUpcomingCoverageCdma()==null) || 
             (this.upcomingCoverageCdma!=null &&
              this.upcomingCoverageCdma.equals(other.getUpcomingCoverageCdma()))) &&
            ((this.upcomingCoverageIden==null && other.getUpcomingCoverageIden()==null) || 
             (this.upcomingCoverageIden!=null &&
              this.upcomingCoverageIden.equals(other.getUpcomingCoverageIden()))) &&
            ((this.npa==null && other.getNpa()==null) || 
             (this.npa!=null &&
              this.npa.equals(other.getNpa()))) &&
            ((this.nxx==null && other.getNxx()==null) || 
             (this.nxx!=null &&
              this.nxx.equals(other.getNxx()))) &&
            ((this.affiliateName==null && other.getAffiliateName()==null) || 
             (this.affiliateName!=null &&
              this.affiliateName.equals(other.getAffiliateName())));
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
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getConfidence() != null) {
            _hashCode += getConfidence().hashCode();
        }
        if (getCsa() != null) {
            _hashCode += getCsa().hashCode();
        }
        if (getIs3G() != null) {
            _hashCode += getIs3G().hashCode();
        }
        if (getEvdo() != null) {
            _hashCode += getEvdo().hashCode();
        }
        if (getIden() != null) {
            _hashCode += getIden().hashCode();
        }
        if (getHybrid() != null) {
            _hashCode += getHybrid().hashCode();
        }
        if (getCoverageQualityCdma() != null) {
            _hashCode += getCoverageQualityCdma().hashCode();
        }
        if (getCoverageQualityIden() != null) {
            _hashCode += getCoverageQualityIden().hashCode();
        }
        if (getRoamDigital() != null) {
            _hashCode += getRoamDigital().hashCode();
        }
        if (getRoamAnalog() != null) {
            _hashCode += getRoamAnalog().hashCode();
        }
        if (getUpcomingCoverageCdma() != null) {
            _hashCode += getUpcomingCoverageCdma().hashCode();
        }
        if (getUpcomingCoverageIden() != null) {
            _hashCode += getUpcomingCoverageIden().hashCode();
        }
        if (getNpa() != null) {
            _hashCode += getNpa().hashCode();
        }
        if (getNxx() != null) {
            _hashCode += getNxx().hashCode();
        }
        if (getAffiliateName() != null) {
            _hashCode += getAffiliateName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCsaReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "QueryCsaReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confidence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "confidence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "csa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is3G");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "is3g"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evdo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "evdo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "iden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hybrid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "hybrid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageQualityCdma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "coverageQualityCdma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "CoverageQuality"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageQualityIden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "coverageQualityIden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "CoverageQuality"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamDigital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "roamDigital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamAnalog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "roamAnalog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upcomingCoverageCdma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "UpcomingCoverageCdma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upcomingCoverageIden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "UpcomingCoverageIden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "BooleanFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "npa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nxx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "nxx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affiliateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "affiliateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/QueryCsa/v1/QueryCsaEnvelope.xsd", "OrganizationName"));
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
