/**
 * NetworkServiceProviderInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class NetworkServiceProviderInfoType  implements java.io.Serializable {
    /* SPID Value for Network Service Provider */
    private java.lang.String networkServiceProviderId;

    /* Local Service Provider
     * The OCN of the NSP.  In a case when the new local service provider
     * is the same company as the new network service provider, the value
     * of the NNSP field should be copied into this field.  
     * When a reseller, this should be populated with "ZZZZ". */
    private java.lang.String localServiceProviderId;

    /* Service Provider Name . */
    private java.lang.String serviceProviderName;

    public NetworkServiceProviderInfoType() {
    }

    public NetworkServiceProviderInfoType(
           java.lang.String networkServiceProviderId,
           java.lang.String localServiceProviderId,
           java.lang.String serviceProviderName) {
           this.networkServiceProviderId = networkServiceProviderId;
           this.localServiceProviderId = localServiceProviderId;
           this.serviceProviderName = serviceProviderName;
    }


    /**
     * Gets the networkServiceProviderId value for this NetworkServiceProviderInfoType.
     * 
     * @return networkServiceProviderId   * SPID Value for Network Service Provider
     */
    public java.lang.String getNetworkServiceProviderId() {
        return networkServiceProviderId;
    }


    /**
     * Sets the networkServiceProviderId value for this NetworkServiceProviderInfoType.
     * 
     * @param networkServiceProviderId   * SPID Value for Network Service Provider
     */
    public void setNetworkServiceProviderId(java.lang.String networkServiceProviderId) {
        this.networkServiceProviderId = networkServiceProviderId;
    }


    /**
     * Gets the localServiceProviderId value for this NetworkServiceProviderInfoType.
     * 
     * @return localServiceProviderId   * Local Service Provider
     * The OCN of the NSP.  In a case when the new local service provider
     * is the same company as the new network service provider, the value
     * of the NNSP field should be copied into this field.  
     * When a reseller, this should be populated with "ZZZZ".
     */
    public java.lang.String getLocalServiceProviderId() {
        return localServiceProviderId;
    }


    /**
     * Sets the localServiceProviderId value for this NetworkServiceProviderInfoType.
     * 
     * @param localServiceProviderId   * Local Service Provider
     * The OCN of the NSP.  In a case when the new local service provider
     * is the same company as the new network service provider, the value
     * of the NNSP field should be copied into this field.  
     * When a reseller, this should be populated with "ZZZZ".
     */
    public void setLocalServiceProviderId(java.lang.String localServiceProviderId) {
        this.localServiceProviderId = localServiceProviderId;
    }


    /**
     * Gets the serviceProviderName value for this NetworkServiceProviderInfoType.
     * 
     * @return serviceProviderName   * Service Provider Name .
     */
    public java.lang.String getServiceProviderName() {
        return serviceProviderName;
    }


    /**
     * Sets the serviceProviderName value for this NetworkServiceProviderInfoType.
     * 
     * @param serviceProviderName   * Service Provider Name .
     */
    public void setServiceProviderName(java.lang.String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkServiceProviderInfoType)) return false;
        NetworkServiceProviderInfoType other = (NetworkServiceProviderInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkServiceProviderId==null && other.getNetworkServiceProviderId()==null) || 
             (this.networkServiceProviderId!=null &&
              this.networkServiceProviderId.equals(other.getNetworkServiceProviderId()))) &&
            ((this.localServiceProviderId==null && other.getLocalServiceProviderId()==null) || 
             (this.localServiceProviderId!=null &&
              this.localServiceProviderId.equals(other.getLocalServiceProviderId()))) &&
            ((this.serviceProviderName==null && other.getServiceProviderName()==null) || 
             (this.serviceProviderName!=null &&
              this.serviceProviderName.equals(other.getServiceProviderName())));
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
        if (getNetworkServiceProviderId() != null) {
            _hashCode += getNetworkServiceProviderId().hashCode();
        }
        if (getLocalServiceProviderId() != null) {
            _hashCode += getLocalServiceProviderId().hashCode();
        }
        if (getServiceProviderName() != null) {
            _hashCode += getServiceProviderName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkServiceProviderInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "NetworkServiceProviderInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkServiceProviderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "networkServiceProviderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localServiceProviderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "localServiceProviderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceProviderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "serviceProviderName"));
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
