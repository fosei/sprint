/**
 * QueryPendingResellerPortInsReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd;

public class QueryPendingResellerPortInsReply  implements java.io.Serializable {
    /* Set to TRUE if more access numbers pending port-ins exist,
     * otherwise the value is set to FALSE. */
    private com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.MoreRecordsAvailableFlag areMorePendingPortIns;

    private com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PendingPortInResult[] accessNumberList;

    public QueryPendingResellerPortInsReply() {
    }

    public QueryPendingResellerPortInsReply(
           com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.MoreRecordsAvailableFlag areMorePendingPortIns,
           com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PendingPortInResult[] accessNumberList) {
           this.areMorePendingPortIns = areMorePendingPortIns;
           this.accessNumberList = accessNumberList;
    }


    /**
     * Gets the areMorePendingPortIns value for this QueryPendingResellerPortInsReply.
     * 
     * @return areMorePendingPortIns   * Set to TRUE if more access numbers pending port-ins exist,
     * otherwise the value is set to FALSE.
     */
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.MoreRecordsAvailableFlag getAreMorePendingPortIns() {
        return areMorePendingPortIns;
    }


    /**
     * Sets the areMorePendingPortIns value for this QueryPendingResellerPortInsReply.
     * 
     * @param areMorePendingPortIns   * Set to TRUE if more access numbers pending port-ins exist,
     * otherwise the value is set to FALSE.
     */
    public void setAreMorePendingPortIns(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.MoreRecordsAvailableFlag areMorePendingPortIns) {
        this.areMorePendingPortIns = areMorePendingPortIns;
    }


    /**
     * Gets the accessNumberList value for this QueryPendingResellerPortInsReply.
     * 
     * @return accessNumberList
     */
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PendingPortInResult[] getAccessNumberList() {
        return accessNumberList;
    }


    /**
     * Sets the accessNumberList value for this QueryPendingResellerPortInsReply.
     * 
     * @param accessNumberList
     */
    public void setAccessNumberList(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PendingPortInResult[] accessNumberList) {
        this.accessNumberList = accessNumberList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPendingResellerPortInsReply)) return false;
        QueryPendingResellerPortInsReply other = (QueryPendingResellerPortInsReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.areMorePendingPortIns==null && other.getAreMorePendingPortIns()==null) || 
             (this.areMorePendingPortIns!=null &&
              this.areMorePendingPortIns.equals(other.getAreMorePendingPortIns()))) &&
            ((this.accessNumberList==null && other.getAccessNumberList()==null) || 
             (this.accessNumberList!=null &&
              java.util.Arrays.equals(this.accessNumberList, other.getAccessNumberList())));
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
        if (getAreMorePendingPortIns() != null) {
            _hashCode += getAreMorePendingPortIns().hashCode();
        }
        if (getAccessNumberList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessNumberList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessNumberList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryPendingResellerPortInsReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "QueryPendingResellerPortInsReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areMorePendingPortIns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "areMorePendingPortIns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "MoreRecordsAvailableFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessNumberList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "accessNumberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "PendingPortInResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "accessNumberRecord"));
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
