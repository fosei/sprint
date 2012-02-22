/**
 * QueryPendingResellerPortInsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd;

public class QueryPendingResellerPortInsRequest  implements java.io.Serializable {
    /* The last mobile access number (MDN) returned in the previous
     * pending port-in list when requesting for more MDNs. */
    private java.lang.String prevEndingAccessNbr;

    public QueryPendingResellerPortInsRequest() {
    }

    public QueryPendingResellerPortInsRequest(
           java.lang.String prevEndingAccessNbr) {
           this.prevEndingAccessNbr = prevEndingAccessNbr;
    }


    /**
     * Gets the prevEndingAccessNbr value for this QueryPendingResellerPortInsRequest.
     * 
     * @return prevEndingAccessNbr   * The last mobile access number (MDN) returned in the previous
     * pending port-in list when requesting for more MDNs.
     */
    public java.lang.String getPrevEndingAccessNbr() {
        return prevEndingAccessNbr;
    }


    /**
     * Sets the prevEndingAccessNbr value for this QueryPendingResellerPortInsRequest.
     * 
     * @param prevEndingAccessNbr   * The last mobile access number (MDN) returned in the previous
     * pending port-in list when requesting for more MDNs.
     */
    public void setPrevEndingAccessNbr(java.lang.String prevEndingAccessNbr) {
        this.prevEndingAccessNbr = prevEndingAccessNbr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPendingResellerPortInsRequest)) return false;
        QueryPendingResellerPortInsRequest other = (QueryPendingResellerPortInsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prevEndingAccessNbr==null && other.getPrevEndingAccessNbr()==null) || 
             (this.prevEndingAccessNbr!=null &&
              this.prevEndingAccessNbr.equals(other.getPrevEndingAccessNbr())));
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
        if (getPrevEndingAccessNbr() != null) {
            _hashCode += getPrevEndingAccessNbr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPendingResellerPortInsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "QueryPendingResellerPortInsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevEndingAccessNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "prevEndingAccessNbr"));
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
