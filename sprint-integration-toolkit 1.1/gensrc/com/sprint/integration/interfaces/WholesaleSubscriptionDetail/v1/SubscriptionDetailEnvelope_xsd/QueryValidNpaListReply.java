/**
 * QueryValidNpaListReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd;


/**
 * This API is used to get the valid NPA List for a given leaf level
 * CSA.
 */
public class QueryValidNpaListReply  implements java.io.Serializable {
    private java.math.BigDecimal rowCount;

    private java.lang.String[] validNpaList;

    public QueryValidNpaListReply() {
    }

    public QueryValidNpaListReply(
           java.math.BigDecimal rowCount,
           java.lang.String[] validNpaList) {
           this.rowCount = rowCount;
           this.validNpaList = validNpaList;
    }


    /**
     * Gets the rowCount value for this QueryValidNpaListReply.
     * 
     * @return rowCount
     */
    public java.math.BigDecimal getRowCount() {
        return rowCount;
    }


    /**
     * Sets the rowCount value for this QueryValidNpaListReply.
     * 
     * @param rowCount
     */
    public void setRowCount(java.math.BigDecimal rowCount) {
        this.rowCount = rowCount;
    }


    /**
     * Gets the validNpaList value for this QueryValidNpaListReply.
     * 
     * @return validNpaList
     */
    public java.lang.String[] getValidNpaList() {
        return validNpaList;
    }


    /**
     * Sets the validNpaList value for this QueryValidNpaListReply.
     * 
     * @param validNpaList
     */
    public void setValidNpaList(java.lang.String[] validNpaList) {
        this.validNpaList = validNpaList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryValidNpaListReply)) return false;
        QueryValidNpaListReply other = (QueryValidNpaListReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rowCount==null && other.getRowCount()==null) || 
             (this.rowCount!=null &&
              this.rowCount.equals(other.getRowCount()))) &&
            ((this.validNpaList==null && other.getValidNpaList()==null) || 
             (this.validNpaList!=null &&
              java.util.Arrays.equals(this.validNpaList, other.getValidNpaList())));
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
        if (getRowCount() != null) {
            _hashCode += getRowCount().hashCode();
        }
        if (getValidNpaList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidNpaList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidNpaList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryValidNpaListReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "QueryValidNpaListReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "rowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validNpaList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "validNpaList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "NpaNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleSubscriptionDetail/v1/SubscriptionDetailEnvelope.xsd", "npa"));
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
