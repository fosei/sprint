/**
 * PortResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd;

public class PortResult  implements java.io.Serializable {
    private java.lang.String mdn;

    private java.lang.String ppvStatus;

    private java.lang.String ppvStatusText;

    private java.lang.String portInStatus;

    private java.lang.String portInStatusText;

    private java.lang.String portId;

    private java.lang.String oldServiceProvider;

    private java.lang.String portCsa;

    private java.util.Calendar desiredDueDateTime;

    private com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.NumberPortabilityDirectionIndicator numberPortabilityDirectionIndicator;

    private java.util.Date permissiveDialingPeriodBeginDate;

    private java.util.Date permissiveDialingPeriodEndDate;

    public PortResult() {
    }

    public PortResult(
           java.lang.String mdn,
           java.lang.String ppvStatus,
           java.lang.String ppvStatusText,
           java.lang.String portInStatus,
           java.lang.String portInStatusText,
           java.lang.String portId,
           java.lang.String oldServiceProvider,
           java.lang.String portCsa,
           java.util.Calendar desiredDueDateTime,
           com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.NumberPortabilityDirectionIndicator numberPortabilityDirectionIndicator,
           java.util.Date permissiveDialingPeriodBeginDate,
           java.util.Date permissiveDialingPeriodEndDate) {
           this.mdn = mdn;
           this.ppvStatus = ppvStatus;
           this.ppvStatusText = ppvStatusText;
           this.portInStatus = portInStatus;
           this.portInStatusText = portInStatusText;
           this.portId = portId;
           this.oldServiceProvider = oldServiceProvider;
           this.portCsa = portCsa;
           this.desiredDueDateTime = desiredDueDateTime;
           this.numberPortabilityDirectionIndicator = numberPortabilityDirectionIndicator;
           this.permissiveDialingPeriodBeginDate = permissiveDialingPeriodBeginDate;
           this.permissiveDialingPeriodEndDate = permissiveDialingPeriodEndDate;
    }


    /**
     * Gets the mdn value for this PortResult.
     * 
     * @return mdn
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this PortResult.
     * 
     * @param mdn
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the ppvStatus value for this PortResult.
     * 
     * @return ppvStatus
     */
    public java.lang.String getPpvStatus() {
        return ppvStatus;
    }


    /**
     * Sets the ppvStatus value for this PortResult.
     * 
     * @param ppvStatus
     */
    public void setPpvStatus(java.lang.String ppvStatus) {
        this.ppvStatus = ppvStatus;
    }


    /**
     * Gets the ppvStatusText value for this PortResult.
     * 
     * @return ppvStatusText
     */
    public java.lang.String getPpvStatusText() {
        return ppvStatusText;
    }


    /**
     * Sets the ppvStatusText value for this PortResult.
     * 
     * @param ppvStatusText
     */
    public void setPpvStatusText(java.lang.String ppvStatusText) {
        this.ppvStatusText = ppvStatusText;
    }


    /**
     * Gets the portInStatus value for this PortResult.
     * 
     * @return portInStatus
     */
    public java.lang.String getPortInStatus() {
        return portInStatus;
    }


    /**
     * Sets the portInStatus value for this PortResult.
     * 
     * @param portInStatus
     */
    public void setPortInStatus(java.lang.String portInStatus) {
        this.portInStatus = portInStatus;
    }


    /**
     * Gets the portInStatusText value for this PortResult.
     * 
     * @return portInStatusText
     */
    public java.lang.String getPortInStatusText() {
        return portInStatusText;
    }


    /**
     * Sets the portInStatusText value for this PortResult.
     * 
     * @param portInStatusText
     */
    public void setPortInStatusText(java.lang.String portInStatusText) {
        this.portInStatusText = portInStatusText;
    }


    /**
     * Gets the portId value for this PortResult.
     * 
     * @return portId
     */
    public java.lang.String getPortId() {
        return portId;
    }


    /**
     * Sets the portId value for this PortResult.
     * 
     * @param portId
     */
    public void setPortId(java.lang.String portId) {
        this.portId = portId;
    }


    /**
     * Gets the oldServiceProvider value for this PortResult.
     * 
     * @return oldServiceProvider
     */
    public java.lang.String getOldServiceProvider() {
        return oldServiceProvider;
    }


    /**
     * Sets the oldServiceProvider value for this PortResult.
     * 
     * @param oldServiceProvider
     */
    public void setOldServiceProvider(java.lang.String oldServiceProvider) {
        this.oldServiceProvider = oldServiceProvider;
    }


    /**
     * Gets the portCsa value for this PortResult.
     * 
     * @return portCsa
     */
    public java.lang.String getPortCsa() {
        return portCsa;
    }


    /**
     * Sets the portCsa value for this PortResult.
     * 
     * @param portCsa
     */
    public void setPortCsa(java.lang.String portCsa) {
        this.portCsa = portCsa;
    }


    /**
     * Gets the desiredDueDateTime value for this PortResult.
     * 
     * @return desiredDueDateTime
     */
    public java.util.Calendar getDesiredDueDateTime() {
        return desiredDueDateTime;
    }


    /**
     * Sets the desiredDueDateTime value for this PortResult.
     * 
     * @param desiredDueDateTime
     */
    public void setDesiredDueDateTime(java.util.Calendar desiredDueDateTime) {
        this.desiredDueDateTime = desiredDueDateTime;
    }


    /**
     * Gets the numberPortabilityDirectionIndicator value for this PortResult.
     * 
     * @return numberPortabilityDirectionIndicator
     */
    public com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.NumberPortabilityDirectionIndicator getNumberPortabilityDirectionIndicator() {
        return numberPortabilityDirectionIndicator;
    }


    /**
     * Sets the numberPortabilityDirectionIndicator value for this PortResult.
     * 
     * @param numberPortabilityDirectionIndicator
     */
    public void setNumberPortabilityDirectionIndicator(com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.NumberPortabilityDirectionIndicator numberPortabilityDirectionIndicator) {
        this.numberPortabilityDirectionIndicator = numberPortabilityDirectionIndicator;
    }


    /**
     * Gets the permissiveDialingPeriodBeginDate value for this PortResult.
     * 
     * @return permissiveDialingPeriodBeginDate
     */
    public java.util.Date getPermissiveDialingPeriodBeginDate() {
        return permissiveDialingPeriodBeginDate;
    }


    /**
     * Sets the permissiveDialingPeriodBeginDate value for this PortResult.
     * 
     * @param permissiveDialingPeriodBeginDate
     */
    public void setPermissiveDialingPeriodBeginDate(java.util.Date permissiveDialingPeriodBeginDate) {
        this.permissiveDialingPeriodBeginDate = permissiveDialingPeriodBeginDate;
    }


    /**
     * Gets the permissiveDialingPeriodEndDate value for this PortResult.
     * 
     * @return permissiveDialingPeriodEndDate
     */
    public java.util.Date getPermissiveDialingPeriodEndDate() {
        return permissiveDialingPeriodEndDate;
    }


    /**
     * Sets the permissiveDialingPeriodEndDate value for this PortResult.
     * 
     * @param permissiveDialingPeriodEndDate
     */
    public void setPermissiveDialingPeriodEndDate(java.util.Date permissiveDialingPeriodEndDate) {
        this.permissiveDialingPeriodEndDate = permissiveDialingPeriodEndDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortResult)) return false;
        PortResult other = (PortResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mdn==null && other.getMdn()==null) || 
             (this.mdn!=null &&
              this.mdn.equals(other.getMdn()))) &&
            ((this.ppvStatus==null && other.getPpvStatus()==null) || 
             (this.ppvStatus!=null &&
              this.ppvStatus.equals(other.getPpvStatus()))) &&
            ((this.ppvStatusText==null && other.getPpvStatusText()==null) || 
             (this.ppvStatusText!=null &&
              this.ppvStatusText.equals(other.getPpvStatusText()))) &&
            ((this.portInStatus==null && other.getPortInStatus()==null) || 
             (this.portInStatus!=null &&
              this.portInStatus.equals(other.getPortInStatus()))) &&
            ((this.portInStatusText==null && other.getPortInStatusText()==null) || 
             (this.portInStatusText!=null &&
              this.portInStatusText.equals(other.getPortInStatusText()))) &&
            ((this.portId==null && other.getPortId()==null) || 
             (this.portId!=null &&
              this.portId.equals(other.getPortId()))) &&
            ((this.oldServiceProvider==null && other.getOldServiceProvider()==null) || 
             (this.oldServiceProvider!=null &&
              this.oldServiceProvider.equals(other.getOldServiceProvider()))) &&
            ((this.portCsa==null && other.getPortCsa()==null) || 
             (this.portCsa!=null &&
              this.portCsa.equals(other.getPortCsa()))) &&
            ((this.desiredDueDateTime==null && other.getDesiredDueDateTime()==null) || 
             (this.desiredDueDateTime!=null &&
              this.desiredDueDateTime.equals(other.getDesiredDueDateTime()))) &&
            ((this.numberPortabilityDirectionIndicator==null && other.getNumberPortabilityDirectionIndicator()==null) || 
             (this.numberPortabilityDirectionIndicator!=null &&
              this.numberPortabilityDirectionIndicator.equals(other.getNumberPortabilityDirectionIndicator()))) &&
            ((this.permissiveDialingPeriodBeginDate==null && other.getPermissiveDialingPeriodBeginDate()==null) || 
             (this.permissiveDialingPeriodBeginDate!=null &&
              this.permissiveDialingPeriodBeginDate.equals(other.getPermissiveDialingPeriodBeginDate()))) &&
            ((this.permissiveDialingPeriodEndDate==null && other.getPermissiveDialingPeriodEndDate()==null) || 
             (this.permissiveDialingPeriodEndDate!=null &&
              this.permissiveDialingPeriodEndDate.equals(other.getPermissiveDialingPeriodEndDate())));
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
        if (getMdn() != null) {
            _hashCode += getMdn().hashCode();
        }
        if (getPpvStatus() != null) {
            _hashCode += getPpvStatus().hashCode();
        }
        if (getPpvStatusText() != null) {
            _hashCode += getPpvStatusText().hashCode();
        }
        if (getPortInStatus() != null) {
            _hashCode += getPortInStatus().hashCode();
        }
        if (getPortInStatusText() != null) {
            _hashCode += getPortInStatusText().hashCode();
        }
        if (getPortId() != null) {
            _hashCode += getPortId().hashCode();
        }
        if (getOldServiceProvider() != null) {
            _hashCode += getOldServiceProvider().hashCode();
        }
        if (getPortCsa() != null) {
            _hashCode += getPortCsa().hashCode();
        }
        if (getDesiredDueDateTime() != null) {
            _hashCode += getDesiredDueDateTime().hashCode();
        }
        if (getNumberPortabilityDirectionIndicator() != null) {
            _hashCode += getNumberPortabilityDirectionIndicator().hashCode();
        }
        if (getPermissiveDialingPeriodBeginDate() != null) {
            _hashCode += getPermissiveDialingPeriodBeginDate().hashCode();
        }
        if (getPermissiveDialingPeriodEndDate() != null) {
            _hashCode += getPermissiveDialingPeriodEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "PortResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "mdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppvStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "ppvStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "StatusCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppvStatusText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "ppvStatusText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "StatusDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portInStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "portInStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "StatusCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portInStatusText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "portInStatusText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "StatusDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "portId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "MDNReservationID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldServiceProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "oldServiceProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "OrganizationName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portCsa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "portCsa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desiredDueDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "desiredDueDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberPortabilityDirectionIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "numberPortabilityDirectionIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "NumberPortabilityDirectionIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissiveDialingPeriodBeginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "permissiveDialingPeriodBeginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissiveDialingPeriodEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/WholesaleWnp/v1/PortEnvelope.xsd", "permissiveDialingPeriodEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
