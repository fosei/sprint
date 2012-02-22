/**
 * ActivityRecordListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd;

public class ActivityRecordListType  implements java.io.Serializable {
    private com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.ActivityRecordInfoType[] activityRecordInfo;

    public ActivityRecordListType() {
    }

    public ActivityRecordListType(
           com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.ActivityRecordInfoType[] activityRecordInfo) {
           this.activityRecordInfo = activityRecordInfo;
    }


    /**
     * Gets the activityRecordInfo value for this ActivityRecordListType.
     * 
     * @return activityRecordInfo
     */
    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.ActivityRecordInfoType[] getActivityRecordInfo() {
        return activityRecordInfo;
    }


    /**
     * Sets the activityRecordInfo value for this ActivityRecordListType.
     * 
     * @param activityRecordInfo
     */
    public void setActivityRecordInfo(com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.ActivityRecordInfoType[] activityRecordInfo) {
        this.activityRecordInfo = activityRecordInfo;
    }

    public com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.ActivityRecordInfoType getActivityRecordInfo(int i) {
        return this.activityRecordInfo[i];
    }

    public void setActivityRecordInfo(int i, com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.ActivityRecordInfoType _value) {
        this.activityRecordInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivityRecordListType)) return false;
        ActivityRecordListType other = (ActivityRecordListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activityRecordInfo==null && other.getActivityRecordInfo()==null) || 
             (this.activityRecordInfo!=null &&
              java.util.Arrays.equals(this.activityRecordInfo, other.getActivityRecordInfo())));
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
        if (getActivityRecordInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivityRecordInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivityRecordInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ActivityRecordListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "ActivityRecordListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityRecordInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "activityRecordInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/queryPortMessage/v1/queryPortMessage.xsd", "ActivityRecordInfoType"));
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
