/**
 * BillCustomerNameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class BillCustomerNameType  implements java.io.Serializable {
    /* Old Service Provider Billing First Name */
    private java.lang.String firstName;

    /* Old Service Provider Billing Middle Initial */
    private java.lang.String middleInitial;

    /* Old Service Provider Billing Last Name */
    private java.lang.String billLastName;

    public BillCustomerNameType() {
    }

    public BillCustomerNameType(
           java.lang.String firstName,
           java.lang.String middleInitial,
           java.lang.String billLastName) {
           this.firstName = firstName;
           this.middleInitial = middleInitial;
           this.billLastName = billLastName;
    }


    /**
     * Gets the firstName value for this BillCustomerNameType.
     * 
     * @return firstName   * Old Service Provider Billing First Name
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this BillCustomerNameType.
     * 
     * @param firstName   * Old Service Provider Billing First Name
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the middleInitial value for this BillCustomerNameType.
     * 
     * @return middleInitial   * Old Service Provider Billing Middle Initial
     */
    public java.lang.String getMiddleInitial() {
        return middleInitial;
    }


    /**
     * Sets the middleInitial value for this BillCustomerNameType.
     * 
     * @param middleInitial   * Old Service Provider Billing Middle Initial
     */
    public void setMiddleInitial(java.lang.String middleInitial) {
        this.middleInitial = middleInitial;
    }


    /**
     * Gets the billLastName value for this BillCustomerNameType.
     * 
     * @return billLastName   * Old Service Provider Billing Last Name
     */
    public java.lang.String getBillLastName() {
        return billLastName;
    }


    /**
     * Sets the billLastName value for this BillCustomerNameType.
     * 
     * @param billLastName   * Old Service Provider Billing Last Name
     */
    public void setBillLastName(java.lang.String billLastName) {
        this.billLastName = billLastName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillCustomerNameType)) return false;
        BillCustomerNameType other = (BillCustomerNameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.middleInitial==null && other.getMiddleInitial()==null) || 
             (this.middleInitial!=null &&
              this.middleInitial.equals(other.getMiddleInitial()))) &&
            ((this.billLastName==null && other.getBillLastName()==null) || 
             (this.billLastName!=null &&
              this.billLastName.equals(other.getBillLastName())));
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
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getMiddleInitial() != null) {
            _hashCode += getMiddleInitial().hashCode();
        }
        if (getBillLastName() != null) {
            _hashCode += getBillLastName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillCustomerNameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "BillCustomerNameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleInitial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "middleInitial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "billLastName"));
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
