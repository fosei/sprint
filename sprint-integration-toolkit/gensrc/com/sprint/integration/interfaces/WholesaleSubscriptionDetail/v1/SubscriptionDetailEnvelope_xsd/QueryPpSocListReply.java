/**
 * QueryPpSocListReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd;


/**
 * This API retrieves a list of available services for a given Reseller
 * based on the leaf level CSA provided.  This includes services inherited
 * from the CSA hierarchy.
 */
public class QueryPpSocListReply  implements java.io.Serializable {
    private com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.SocProfileRecord[] socProfileList;

    public QueryPpSocListReply() {
    }

    public QueryPpSocListReply(
           com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.SocProfileRecord[] socProfileList) {
           this.socProfileList = socProfileList;
    }


    /**
     * Gets the socProfileList value for this QueryPpSocListReply.
     * 
     * @return socProfileList
     */
    public com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.SocProfileRecord[] getSocProfileList() {
        return socProfileList;
    }


    /**
     * Sets the socProfileList value for this QueryPpSocListReply.
     * 
     * @param socProfileList
     */
    public void setSocProfileList(com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.SocProfileRecord[] socProfileList) {
        this.socProfileList = socProfileList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPpSocListReply)) return false;
        QueryPpSocListReply other = (QueryPpSocListReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.socProfileList==null && other.getSocProfileList()==null) || 
             (this.socProfileList!=null &&
              java.util.Arrays.equals(this.socProfileList, other.getSocProfileList())));
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
        if (getSocProfileList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSocProfileList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSocProfileList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryPpSocListReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "QueryPpSocListReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socProfileList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "socProfileList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "SocProfileRecord"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "socProfileRecord"));
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
