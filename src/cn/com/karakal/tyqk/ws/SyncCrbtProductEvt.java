/**
 * SyncCrbtProductEvt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.karakal.tyqk.ws;

public class SyncCrbtProductEvt  implements java.io.Serializable {
    private cn.com.karakal.tyqk.ws.ContentInfo contentInfo;

    private java.lang.String eventType;

    private java.lang.String key;

    private java.lang.String PID;

    private java.lang.String provinceID;

    private java.lang.String reqType;

    private java.lang.String SEQ;

    private java.lang.String timeStamp;

    private java.lang.String transactionID;

    public SyncCrbtProductEvt() {
    }

    public SyncCrbtProductEvt(
           cn.com.karakal.tyqk.ws.ContentInfo contentInfo,
           java.lang.String eventType,
           java.lang.String key,
           java.lang.String PID,
           java.lang.String provinceID,
           java.lang.String reqType,
           java.lang.String SEQ,
           java.lang.String timeStamp,
           java.lang.String transactionID) {
           this.contentInfo = contentInfo;
           this.eventType = eventType;
           this.key = key;
           this.PID = PID;
           this.provinceID = provinceID;
           this.reqType = reqType;
           this.SEQ = SEQ;
           this.timeStamp = timeStamp;
           this.transactionID = transactionID;
    }


    /**
     * Gets the contentInfo value for this SyncCrbtProductEvt.
     * 
     * @return contentInfo
     */
    public cn.com.karakal.tyqk.ws.ContentInfo getContentInfo() {
        return contentInfo;
    }


    /**
     * Sets the contentInfo value for this SyncCrbtProductEvt.
     * 
     * @param contentInfo
     */
    public void setContentInfo(cn.com.karakal.tyqk.ws.ContentInfo contentInfo) {
        this.contentInfo = contentInfo;
    }


    /**
     * Gets the eventType value for this SyncCrbtProductEvt.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this SyncCrbtProductEvt.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the key value for this SyncCrbtProductEvt.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this SyncCrbtProductEvt.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the PID value for this SyncCrbtProductEvt.
     * 
     * @return PID
     */
    public java.lang.String getPID() {
        return PID;
    }


    /**
     * Sets the PID value for this SyncCrbtProductEvt.
     * 
     * @param PID
     */
    public void setPID(java.lang.String PID) {
        this.PID = PID;
    }


    /**
     * Gets the provinceID value for this SyncCrbtProductEvt.
     * 
     * @return provinceID
     */
    public java.lang.String getProvinceID() {
        return provinceID;
    }


    /**
     * Sets the provinceID value for this SyncCrbtProductEvt.
     * 
     * @param provinceID
     */
    public void setProvinceID(java.lang.String provinceID) {
        this.provinceID = provinceID;
    }


    /**
     * Gets the reqType value for this SyncCrbtProductEvt.
     * 
     * @return reqType
     */
    public java.lang.String getReqType() {
        return reqType;
    }


    /**
     * Sets the reqType value for this SyncCrbtProductEvt.
     * 
     * @param reqType
     */
    public void setReqType(java.lang.String reqType) {
        this.reqType = reqType;
    }


    /**
     * Gets the SEQ value for this SyncCrbtProductEvt.
     * 
     * @return SEQ
     */
    public java.lang.String getSEQ() {
        return SEQ;
    }


    /**
     * Sets the SEQ value for this SyncCrbtProductEvt.
     * 
     * @param SEQ
     */
    public void setSEQ(java.lang.String SEQ) {
        this.SEQ = SEQ;
    }


    /**
     * Gets the timeStamp value for this SyncCrbtProductEvt.
     * 
     * @return timeStamp
     */
    public java.lang.String getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this SyncCrbtProductEvt.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.lang.String timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the transactionID value for this SyncCrbtProductEvt.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this SyncCrbtProductEvt.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncCrbtProductEvt)) return false;
        SyncCrbtProductEvt other = (SyncCrbtProductEvt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contentInfo==null && other.getContentInfo()==null) || 
             (this.contentInfo!=null &&
              this.contentInfo.equals(other.getContentInfo()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.PID==null && other.getPID()==null) || 
             (this.PID!=null &&
              this.PID.equals(other.getPID()))) &&
            ((this.provinceID==null && other.getProvinceID()==null) || 
             (this.provinceID!=null &&
              this.provinceID.equals(other.getProvinceID()))) &&
            ((this.reqType==null && other.getReqType()==null) || 
             (this.reqType!=null &&
              this.reqType.equals(other.getReqType()))) &&
            ((this.SEQ==null && other.getSEQ()==null) || 
             (this.SEQ!=null &&
              this.SEQ.equals(other.getSEQ()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID())));
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
        if (getContentInfo() != null) {
            _hashCode += getContentInfo().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getPID() != null) {
            _hashCode += getPID().hashCode();
        }
        if (getProvinceID() != null) {
            _hashCode += getProvinceID().hashCode();
        }
        if (getReqType() != null) {
            _hashCode += getReqType().hashCode();
        }
        if (getSEQ() != null) {
            _hashCode += getSEQ().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncCrbtProductEvt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.tyqk.karakal.com.cn", "syncCrbtProductEvt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.tyqk.karakal.com.cn", "contentInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinceID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "provinceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SEQ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SEQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionID"));
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
