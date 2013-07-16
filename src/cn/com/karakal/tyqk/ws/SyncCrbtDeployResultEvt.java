/**
 * SyncCrbtDeployResultEvt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.karakal.tyqk.ws;

public class SyncCrbtDeployResultEvt  implements java.io.Serializable {
    private java.lang.String accessPlatformID;

    private java.lang.String CVersion;

    private java.lang.String eventInfo;

    private java.lang.String[] failProvinceName;

    private java.lang.String key;

    private java.lang.String PID;

    private java.lang.String role;

    private java.lang.String roleCode;

    private java.lang.String SEQ;

    private java.lang.String[] successProvinceName;

    private java.lang.String successRate;

    private java.lang.String toneID;

    private java.lang.String transactionID;

    public SyncCrbtDeployResultEvt() {
    }

    public SyncCrbtDeployResultEvt(
           java.lang.String accessPlatformID,
           java.lang.String CVersion,
           java.lang.String eventInfo,
           java.lang.String[] failProvinceName,
           java.lang.String key,
           java.lang.String PID,
           java.lang.String role,
           java.lang.String roleCode,
           java.lang.String SEQ,
           java.lang.String[] successProvinceName,
           java.lang.String successRate,
           java.lang.String toneID,
           java.lang.String transactionID) {
           this.accessPlatformID = accessPlatformID;
           this.CVersion = CVersion;
           this.eventInfo = eventInfo;
           this.failProvinceName = failProvinceName;
           this.key = key;
           this.PID = PID;
           this.role = role;
           this.roleCode = roleCode;
           this.SEQ = SEQ;
           this.successProvinceName = successProvinceName;
           this.successRate = successRate;
           this.toneID = toneID;
           this.transactionID = transactionID;
    }


    /**
     * Gets the accessPlatformID value for this SyncCrbtDeployResultEvt.
     * 
     * @return accessPlatformID
     */
    public java.lang.String getAccessPlatformID() {
        return accessPlatformID;
    }


    /**
     * Sets the accessPlatformID value for this SyncCrbtDeployResultEvt.
     * 
     * @param accessPlatformID
     */
    public void setAccessPlatformID(java.lang.String accessPlatformID) {
        this.accessPlatformID = accessPlatformID;
    }


    /**
     * Gets the CVersion value for this SyncCrbtDeployResultEvt.
     * 
     * @return CVersion
     */
    public java.lang.String getCVersion() {
        return CVersion;
    }


    /**
     * Sets the CVersion value for this SyncCrbtDeployResultEvt.
     * 
     * @param CVersion
     */
    public void setCVersion(java.lang.String CVersion) {
        this.CVersion = CVersion;
    }


    /**
     * Gets the eventInfo value for this SyncCrbtDeployResultEvt.
     * 
     * @return eventInfo
     */
    public java.lang.String getEventInfo() {
        return eventInfo;
    }


    /**
     * Sets the eventInfo value for this SyncCrbtDeployResultEvt.
     * 
     * @param eventInfo
     */
    public void setEventInfo(java.lang.String eventInfo) {
        this.eventInfo = eventInfo;
    }


    /**
     * Gets the failProvinceName value for this SyncCrbtDeployResultEvt.
     * 
     * @return failProvinceName
     */
    public java.lang.String[] getFailProvinceName() {
        return failProvinceName;
    }


    /**
     * Sets the failProvinceName value for this SyncCrbtDeployResultEvt.
     * 
     * @param failProvinceName
     */
    public void setFailProvinceName(java.lang.String[] failProvinceName) {
        this.failProvinceName = failProvinceName;
    }

    public java.lang.String getFailProvinceName(int i) {
        return this.failProvinceName[i];
    }

    public void setFailProvinceName(int i, java.lang.String _value) {
        this.failProvinceName[i] = _value;
    }


    /**
     * Gets the key value for this SyncCrbtDeployResultEvt.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this SyncCrbtDeployResultEvt.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the PID value for this SyncCrbtDeployResultEvt.
     * 
     * @return PID
     */
    public java.lang.String getPID() {
        return PID;
    }


    /**
     * Sets the PID value for this SyncCrbtDeployResultEvt.
     * 
     * @param PID
     */
    public void setPID(java.lang.String PID) {
        this.PID = PID;
    }


    /**
     * Gets the role value for this SyncCrbtDeployResultEvt.
     * 
     * @return role
     */
    public java.lang.String getRole() {
        return role;
    }


    /**
     * Sets the role value for this SyncCrbtDeployResultEvt.
     * 
     * @param role
     */
    public void setRole(java.lang.String role) {
        this.role = role;
    }


    /**
     * Gets the roleCode value for this SyncCrbtDeployResultEvt.
     * 
     * @return roleCode
     */
    public java.lang.String getRoleCode() {
        return roleCode;
    }


    /**
     * Sets the roleCode value for this SyncCrbtDeployResultEvt.
     * 
     * @param roleCode
     */
    public void setRoleCode(java.lang.String roleCode) {
        this.roleCode = roleCode;
    }


    /**
     * Gets the SEQ value for this SyncCrbtDeployResultEvt.
     * 
     * @return SEQ
     */
    public java.lang.String getSEQ() {
        return SEQ;
    }


    /**
     * Sets the SEQ value for this SyncCrbtDeployResultEvt.
     * 
     * @param SEQ
     */
    public void setSEQ(java.lang.String SEQ) {
        this.SEQ = SEQ;
    }


    /**
     * Gets the successProvinceName value for this SyncCrbtDeployResultEvt.
     * 
     * @return successProvinceName
     */
    public java.lang.String[] getSuccessProvinceName() {
        return successProvinceName;
    }


    /**
     * Sets the successProvinceName value for this SyncCrbtDeployResultEvt.
     * 
     * @param successProvinceName
     */
    public void setSuccessProvinceName(java.lang.String[] successProvinceName) {
        this.successProvinceName = successProvinceName;
    }

    public java.lang.String getSuccessProvinceName(int i) {
        return this.successProvinceName[i];
    }

    public void setSuccessProvinceName(int i, java.lang.String _value) {
        this.successProvinceName[i] = _value;
    }


    /**
     * Gets the successRate value for this SyncCrbtDeployResultEvt.
     * 
     * @return successRate
     */
    public java.lang.String getSuccessRate() {
        return successRate;
    }


    /**
     * Sets the successRate value for this SyncCrbtDeployResultEvt.
     * 
     * @param successRate
     */
    public void setSuccessRate(java.lang.String successRate) {
        this.successRate = successRate;
    }


    /**
     * Gets the toneID value for this SyncCrbtDeployResultEvt.
     * 
     * @return toneID
     */
    public java.lang.String getToneID() {
        return toneID;
    }


    /**
     * Sets the toneID value for this SyncCrbtDeployResultEvt.
     * 
     * @param toneID
     */
    public void setToneID(java.lang.String toneID) {
        this.toneID = toneID;
    }


    /**
     * Gets the transactionID value for this SyncCrbtDeployResultEvt.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this SyncCrbtDeployResultEvt.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncCrbtDeployResultEvt)) return false;
        SyncCrbtDeployResultEvt other = (SyncCrbtDeployResultEvt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessPlatformID==null && other.getAccessPlatformID()==null) || 
             (this.accessPlatformID!=null &&
              this.accessPlatformID.equals(other.getAccessPlatformID()))) &&
            ((this.CVersion==null && other.getCVersion()==null) || 
             (this.CVersion!=null &&
              this.CVersion.equals(other.getCVersion()))) &&
            ((this.eventInfo==null && other.getEventInfo()==null) || 
             (this.eventInfo!=null &&
              this.eventInfo.equals(other.getEventInfo()))) &&
            ((this.failProvinceName==null && other.getFailProvinceName()==null) || 
             (this.failProvinceName!=null &&
              java.util.Arrays.equals(this.failProvinceName, other.getFailProvinceName()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.PID==null && other.getPID()==null) || 
             (this.PID!=null &&
              this.PID.equals(other.getPID()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.roleCode==null && other.getRoleCode()==null) || 
             (this.roleCode!=null &&
              this.roleCode.equals(other.getRoleCode()))) &&
            ((this.SEQ==null && other.getSEQ()==null) || 
             (this.SEQ!=null &&
              this.SEQ.equals(other.getSEQ()))) &&
            ((this.successProvinceName==null && other.getSuccessProvinceName()==null) || 
             (this.successProvinceName!=null &&
              java.util.Arrays.equals(this.successProvinceName, other.getSuccessProvinceName()))) &&
            ((this.successRate==null && other.getSuccessRate()==null) || 
             (this.successRate!=null &&
              this.successRate.equals(other.getSuccessRate()))) &&
            ((this.toneID==null && other.getToneID()==null) || 
             (this.toneID!=null &&
              this.toneID.equals(other.getToneID()))) &&
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
        if (getAccessPlatformID() != null) {
            _hashCode += getAccessPlatformID().hashCode();
        }
        if (getCVersion() != null) {
            _hashCode += getCVersion().hashCode();
        }
        if (getEventInfo() != null) {
            _hashCode += getEventInfo().hashCode();
        }
        if (getFailProvinceName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailProvinceName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailProvinceName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getPID() != null) {
            _hashCode += getPID().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getRoleCode() != null) {
            _hashCode += getRoleCode().hashCode();
        }
        if (getSEQ() != null) {
            _hashCode += getSEQ().hashCode();
        }
        if (getSuccessProvinceName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessProvinceName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessProvinceName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuccessRate() != null) {
            _hashCode += getSuccessRate().hashCode();
        }
        if (getToneID() != null) {
            _hashCode += getToneID().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncCrbtDeployResultEvt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.tyqk.karakal.com.cn", "syncCrbtDeployResultEvt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessPlatformID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessPlatformID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failProvinceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failProvinceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roleCode"));
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
        elemField.setFieldName("successProvinceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "successProvinceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "successRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toneID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toneID"));
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
