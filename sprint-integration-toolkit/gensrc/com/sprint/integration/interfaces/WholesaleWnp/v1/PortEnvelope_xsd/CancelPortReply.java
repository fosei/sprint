/**
 * CancelPortReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd;


/**
 * This API provides the ability to cancel a port-in for a Reseller
 * access number with a port-in that is in progress through an external
 * system.
 */
public class CancelPortReply  implements java.io.Serializable {
    /* status from external number porting system for port-in cancel
     * request */
    private java.lang.String cancelStatus;

    /* status text from external number porting system for port-in
     * cancel request. */
    private java.lang.String cancelStatusText;

    public CancelPortReply() {
    }

    public CancelPortReply(
           java.lang.String cancelStatus,
           java.lang.String cancelStatusText) {
           this.cancelStatus = cancelStatus;
           this.cancelStatusText = cancelStatusText;
    }


    /**
     * Gets the cancelStatus value for this CancelPortReply.
     * 
     * @return cancelStatus   * status from external number porting system for port-in cancel
     * request
     */
    public java.lang.String getCancelStatus() {
        return cancelStatus;
    }


    /**
     * Sets the cancelStatus value for this CancelPortReply.
     * 
     * @param cancelStatus   * status from external number porting system for port-in cancel
     * request
     */
    public void setCancelStatus(java.lang.String cancelStatus) {
        this.cancelStatus = cancelStatus;
    }


    /**
     * Gets the cancelStatusText value for this CancelPortReply.
     * 
     * @return cancelStatusText   * status text from external number porting system for port-in
     * cancel request.
     */
    public java.lang.String getCancelStatusText() {
        return cancelStatusText;
    }


    /**
     * Sets the cancelStatusText value for this CancelPortReply.
     * 
     * @param cancelStatusText   * status text from external number porting system for port-in
     * cancel request.
     */
    public void setCancelStatusText(java.lang.String cancelStatusText) {
        this.cancelStatusText = cancelStatusText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelPortReply)) return false;
        CancelPortReply other = (CancelPortReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancelStatus==null && other.getCancelStatus()==null) || 
             (this.cancelStatus!=null &&
              this.cancelStatus.equals(other.getCancelStatus()))) &&
            ((this.cancelStatusText==null && other.getCancelStatusText()==null) || 
             (this.cancelStatusText!=null &&
              this.cancelStatusText.equals(other.getCancelStatusText())));
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
        if (getCancelStatus() != null) {
            _hashCode += getCancelStatus().hashCode();
        }
        if (getCancelStatusText() != null) {
            _hashCode += getCancelStatusText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelPortReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "CancelPortReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "cancelStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "StatusCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelStatusText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "cancelStatusText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "StatusDescription"));
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
