/**
 * ContentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.karakal.tyqk.ws;

public class ContentInfo  implements java.io.Serializable {
    private java.lang.String addTime;

    private cn.com.karakal.tyqk.ws.AlbumInfo[] albumInfo;

    private java.lang.String appendInfo;

    private java.lang.String approveTime;

    private java.lang.String auditFilePath;

    private java.lang.String cmsSingerName;

    private java.lang.String cmsSingerNameLetter;

    private java.lang.String corpID;

    private java.lang.String ISRC;

    private java.lang.String musicID;

    private java.lang.String playFilePath;

    private java.lang.String price;

    private java.lang.String property;

    private java.lang.String singerID;

    private java.lang.String singerName;

    private java.lang.String songID;

    private java.lang.String songName;

    private java.lang.String spID;

    private java.lang.String spName;

    private java.lang.String status;

    private java.lang.String toneID;

    private java.lang.String toneName;

    private java.lang.String toneNameLetter;

    private java.lang.String toneValidDay;

    private java.lang.String type;

    public ContentInfo() {
    }

    public ContentInfo(
           java.lang.String addTime,
           cn.com.karakal.tyqk.ws.AlbumInfo[] albumInfo,
           java.lang.String appendInfo,
           java.lang.String approveTime,
           java.lang.String auditFilePath,
           java.lang.String cmsSingerName,
           java.lang.String cmsSingerNameLetter,
           java.lang.String corpID,
           java.lang.String ISRC,
           java.lang.String musicID,
           java.lang.String playFilePath,
           java.lang.String price,
           java.lang.String property,
           java.lang.String singerID,
           java.lang.String singerName,
           java.lang.String songID,
           java.lang.String songName,
           java.lang.String spID,
           java.lang.String spName,
           java.lang.String status,
           java.lang.String toneID,
           java.lang.String toneName,
           java.lang.String toneNameLetter,
           java.lang.String toneValidDay,
           java.lang.String type) {
           this.addTime = addTime;
           this.albumInfo = albumInfo;
           this.appendInfo = appendInfo;
           this.approveTime = approveTime;
           this.auditFilePath = auditFilePath;
           this.cmsSingerName = cmsSingerName;
           this.cmsSingerNameLetter = cmsSingerNameLetter;
           this.corpID = corpID;
           this.ISRC = ISRC;
           this.musicID = musicID;
           this.playFilePath = playFilePath;
           this.price = price;
           this.property = property;
           this.singerID = singerID;
           this.singerName = singerName;
           this.songID = songID;
           this.songName = songName;
           this.spID = spID;
           this.spName = spName;
           this.status = status;
           this.toneID = toneID;
           this.toneName = toneName;
           this.toneNameLetter = toneNameLetter;
           this.toneValidDay = toneValidDay;
           this.type = type;
    }


    /**
     * Gets the addTime value for this ContentInfo.
     * 
     * @return addTime
     */
    public java.lang.String getAddTime() {
        return addTime;
    }


    /**
     * Sets the addTime value for this ContentInfo.
     * 
     * @param addTime
     */
    public void setAddTime(java.lang.String addTime) {
        this.addTime = addTime;
    }


    /**
     * Gets the albumInfo value for this ContentInfo.
     * 
     * @return albumInfo
     */
    public cn.com.karakal.tyqk.ws.AlbumInfo[] getAlbumInfo() {
        return albumInfo;
    }


    /**
     * Sets the albumInfo value for this ContentInfo.
     * 
     * @param albumInfo
     */
    public void setAlbumInfo(cn.com.karakal.tyqk.ws.AlbumInfo[] albumInfo) {
        this.albumInfo = albumInfo;
    }

    public cn.com.karakal.tyqk.ws.AlbumInfo getAlbumInfo(int i) {
        return this.albumInfo[i];
    }

    public void setAlbumInfo(int i, cn.com.karakal.tyqk.ws.AlbumInfo _value) {
        this.albumInfo[i] = _value;
    }


    /**
     * Gets the appendInfo value for this ContentInfo.
     * 
     * @return appendInfo
     */
    public java.lang.String getAppendInfo() {
        return appendInfo;
    }


    /**
     * Sets the appendInfo value for this ContentInfo.
     * 
     * @param appendInfo
     */
    public void setAppendInfo(java.lang.String appendInfo) {
        this.appendInfo = appendInfo;
    }


    /**
     * Gets the approveTime value for this ContentInfo.
     * 
     * @return approveTime
     */
    public java.lang.String getApproveTime() {
        return approveTime;
    }


    /**
     * Sets the approveTime value for this ContentInfo.
     * 
     * @param approveTime
     */
    public void setApproveTime(java.lang.String approveTime) {
        this.approveTime = approveTime;
    }


    /**
     * Gets the auditFilePath value for this ContentInfo.
     * 
     * @return auditFilePath
     */
    public java.lang.String getAuditFilePath() {
        return auditFilePath;
    }


    /**
     * Sets the auditFilePath value for this ContentInfo.
     * 
     * @param auditFilePath
     */
    public void setAuditFilePath(java.lang.String auditFilePath) {
        this.auditFilePath = auditFilePath;
    }


    /**
     * Gets the cmsSingerName value for this ContentInfo.
     * 
     * @return cmsSingerName
     */
    public java.lang.String getCmsSingerName() {
        return cmsSingerName;
    }


    /**
     * Sets the cmsSingerName value for this ContentInfo.
     * 
     * @param cmsSingerName
     */
    public void setCmsSingerName(java.lang.String cmsSingerName) {
        this.cmsSingerName = cmsSingerName;
    }


    /**
     * Gets the cmsSingerNameLetter value for this ContentInfo.
     * 
     * @return cmsSingerNameLetter
     */
    public java.lang.String getCmsSingerNameLetter() {
        return cmsSingerNameLetter;
    }


    /**
     * Sets the cmsSingerNameLetter value for this ContentInfo.
     * 
     * @param cmsSingerNameLetter
     */
    public void setCmsSingerNameLetter(java.lang.String cmsSingerNameLetter) {
        this.cmsSingerNameLetter = cmsSingerNameLetter;
    }


    /**
     * Gets the corpID value for this ContentInfo.
     * 
     * @return corpID
     */
    public java.lang.String getCorpID() {
        return corpID;
    }


    /**
     * Sets the corpID value for this ContentInfo.
     * 
     * @param corpID
     */
    public void setCorpID(java.lang.String corpID) {
        this.corpID = corpID;
    }


    /**
     * Gets the ISRC value for this ContentInfo.
     * 
     * @return ISRC
     */
    public java.lang.String getISRC() {
        return ISRC;
    }


    /**
     * Sets the ISRC value for this ContentInfo.
     * 
     * @param ISRC
     */
    public void setISRC(java.lang.String ISRC) {
        this.ISRC = ISRC;
    }


    /**
     * Gets the musicID value for this ContentInfo.
     * 
     * @return musicID
     */
    public java.lang.String getMusicID() {
        return musicID;
    }


    /**
     * Sets the musicID value for this ContentInfo.
     * 
     * @param musicID
     */
    public void setMusicID(java.lang.String musicID) {
        this.musicID = musicID;
    }


    /**
     * Gets the playFilePath value for this ContentInfo.
     * 
     * @return playFilePath
     */
    public java.lang.String getPlayFilePath() {
        return playFilePath;
    }


    /**
     * Sets the playFilePath value for this ContentInfo.
     * 
     * @param playFilePath
     */
    public void setPlayFilePath(java.lang.String playFilePath) {
        this.playFilePath = playFilePath;
    }


    /**
     * Gets the price value for this ContentInfo.
     * 
     * @return price
     */
    public java.lang.String getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ContentInfo.
     * 
     * @param price
     */
    public void setPrice(java.lang.String price) {
        this.price = price;
    }


    /**
     * Gets the property value for this ContentInfo.
     * 
     * @return property
     */
    public java.lang.String getProperty() {
        return property;
    }


    /**
     * Sets the property value for this ContentInfo.
     * 
     * @param property
     */
    public void setProperty(java.lang.String property) {
        this.property = property;
    }


    /**
     * Gets the singerID value for this ContentInfo.
     * 
     * @return singerID
     */
    public java.lang.String getSingerID() {
        return singerID;
    }


    /**
     * Sets the singerID value for this ContentInfo.
     * 
     * @param singerID
     */
    public void setSingerID(java.lang.String singerID) {
        this.singerID = singerID;
    }


    /**
     * Gets the singerName value for this ContentInfo.
     * 
     * @return singerName
     */
    public java.lang.String getSingerName() {
        return singerName;
    }


    /**
     * Sets the singerName value for this ContentInfo.
     * 
     * @param singerName
     */
    public void setSingerName(java.lang.String singerName) {
        this.singerName = singerName;
    }


    /**
     * Gets the songID value for this ContentInfo.
     * 
     * @return songID
     */
    public java.lang.String getSongID() {
        return songID;
    }


    /**
     * Sets the songID value for this ContentInfo.
     * 
     * @param songID
     */
    public void setSongID(java.lang.String songID) {
        this.songID = songID;
    }


    /**
     * Gets the songName value for this ContentInfo.
     * 
     * @return songName
     */
    public java.lang.String getSongName() {
        return songName;
    }


    /**
     * Sets the songName value for this ContentInfo.
     * 
     * @param songName
     */
    public void setSongName(java.lang.String songName) {
        this.songName = songName;
    }


    /**
     * Gets the spID value for this ContentInfo.
     * 
     * @return spID
     */
    public java.lang.String getSpID() {
        return spID;
    }


    /**
     * Sets the spID value for this ContentInfo.
     * 
     * @param spID
     */
    public void setSpID(java.lang.String spID) {
        this.spID = spID;
    }


    /**
     * Gets the spName value for this ContentInfo.
     * 
     * @return spName
     */
    public java.lang.String getSpName() {
        return spName;
    }


    /**
     * Sets the spName value for this ContentInfo.
     * 
     * @param spName
     */
    public void setSpName(java.lang.String spName) {
        this.spName = spName;
    }


    /**
     * Gets the status value for this ContentInfo.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ContentInfo.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the toneID value for this ContentInfo.
     * 
     * @return toneID
     */
    public java.lang.String getToneID() {
        return toneID;
    }


    /**
     * Sets the toneID value for this ContentInfo.
     * 
     * @param toneID
     */
    public void setToneID(java.lang.String toneID) {
        this.toneID = toneID;
    }


    /**
     * Gets the toneName value for this ContentInfo.
     * 
     * @return toneName
     */
    public java.lang.String getToneName() {
        return toneName;
    }


    /**
     * Sets the toneName value for this ContentInfo.
     * 
     * @param toneName
     */
    public void setToneName(java.lang.String toneName) {
        this.toneName = toneName;
    }


    /**
     * Gets the toneNameLetter value for this ContentInfo.
     * 
     * @return toneNameLetter
     */
    public java.lang.String getToneNameLetter() {
        return toneNameLetter;
    }


    /**
     * Sets the toneNameLetter value for this ContentInfo.
     * 
     * @param toneNameLetter
     */
    public void setToneNameLetter(java.lang.String toneNameLetter) {
        this.toneNameLetter = toneNameLetter;
    }


    /**
     * Gets the toneValidDay value for this ContentInfo.
     * 
     * @return toneValidDay
     */
    public java.lang.String getToneValidDay() {
        return toneValidDay;
    }


    /**
     * Sets the toneValidDay value for this ContentInfo.
     * 
     * @param toneValidDay
     */
    public void setToneValidDay(java.lang.String toneValidDay) {
        this.toneValidDay = toneValidDay;
    }


    /**
     * Gets the type value for this ContentInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ContentInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentInfo)) return false;
        ContentInfo other = (ContentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addTime==null && other.getAddTime()==null) || 
             (this.addTime!=null &&
              this.addTime.equals(other.getAddTime()))) &&
            ((this.albumInfo==null && other.getAlbumInfo()==null) || 
             (this.albumInfo!=null &&
              java.util.Arrays.equals(this.albumInfo, other.getAlbumInfo()))) &&
            ((this.appendInfo==null && other.getAppendInfo()==null) || 
             (this.appendInfo!=null &&
              this.appendInfo.equals(other.getAppendInfo()))) &&
            ((this.approveTime==null && other.getApproveTime()==null) || 
             (this.approveTime!=null &&
              this.approveTime.equals(other.getApproveTime()))) &&
            ((this.auditFilePath==null && other.getAuditFilePath()==null) || 
             (this.auditFilePath!=null &&
              this.auditFilePath.equals(other.getAuditFilePath()))) &&
            ((this.cmsSingerName==null && other.getCmsSingerName()==null) || 
             (this.cmsSingerName!=null &&
              this.cmsSingerName.equals(other.getCmsSingerName()))) &&
            ((this.cmsSingerNameLetter==null && other.getCmsSingerNameLetter()==null) || 
             (this.cmsSingerNameLetter!=null &&
              this.cmsSingerNameLetter.equals(other.getCmsSingerNameLetter()))) &&
            ((this.corpID==null && other.getCorpID()==null) || 
             (this.corpID!=null &&
              this.corpID.equals(other.getCorpID()))) &&
            ((this.ISRC==null && other.getISRC()==null) || 
             (this.ISRC!=null &&
              this.ISRC.equals(other.getISRC()))) &&
            ((this.musicID==null && other.getMusicID()==null) || 
             (this.musicID!=null &&
              this.musicID.equals(other.getMusicID()))) &&
            ((this.playFilePath==null && other.getPlayFilePath()==null) || 
             (this.playFilePath!=null &&
              this.playFilePath.equals(other.getPlayFilePath()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.property==null && other.getProperty()==null) || 
             (this.property!=null &&
              this.property.equals(other.getProperty()))) &&
            ((this.singerID==null && other.getSingerID()==null) || 
             (this.singerID!=null &&
              this.singerID.equals(other.getSingerID()))) &&
            ((this.singerName==null && other.getSingerName()==null) || 
             (this.singerName!=null &&
              this.singerName.equals(other.getSingerName()))) &&
            ((this.songID==null && other.getSongID()==null) || 
             (this.songID!=null &&
              this.songID.equals(other.getSongID()))) &&
            ((this.songName==null && other.getSongName()==null) || 
             (this.songName!=null &&
              this.songName.equals(other.getSongName()))) &&
            ((this.spID==null && other.getSpID()==null) || 
             (this.spID!=null &&
              this.spID.equals(other.getSpID()))) &&
            ((this.spName==null && other.getSpName()==null) || 
             (this.spName!=null &&
              this.spName.equals(other.getSpName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.toneID==null && other.getToneID()==null) || 
             (this.toneID!=null &&
              this.toneID.equals(other.getToneID()))) &&
            ((this.toneName==null && other.getToneName()==null) || 
             (this.toneName!=null &&
              this.toneName.equals(other.getToneName()))) &&
            ((this.toneNameLetter==null && other.getToneNameLetter()==null) || 
             (this.toneNameLetter!=null &&
              this.toneNameLetter.equals(other.getToneNameLetter()))) &&
            ((this.toneValidDay==null && other.getToneValidDay()==null) || 
             (this.toneValidDay!=null &&
              this.toneValidDay.equals(other.getToneValidDay()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getAddTime() != null) {
            _hashCode += getAddTime().hashCode();
        }
        if (getAlbumInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlbumInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlbumInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppendInfo() != null) {
            _hashCode += getAppendInfo().hashCode();
        }
        if (getApproveTime() != null) {
            _hashCode += getApproveTime().hashCode();
        }
        if (getAuditFilePath() != null) {
            _hashCode += getAuditFilePath().hashCode();
        }
        if (getCmsSingerName() != null) {
            _hashCode += getCmsSingerName().hashCode();
        }
        if (getCmsSingerNameLetter() != null) {
            _hashCode += getCmsSingerNameLetter().hashCode();
        }
        if (getCorpID() != null) {
            _hashCode += getCorpID().hashCode();
        }
        if (getISRC() != null) {
            _hashCode += getISRC().hashCode();
        }
        if (getMusicID() != null) {
            _hashCode += getMusicID().hashCode();
        }
        if (getPlayFilePath() != null) {
            _hashCode += getPlayFilePath().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getProperty() != null) {
            _hashCode += getProperty().hashCode();
        }
        if (getSingerID() != null) {
            _hashCode += getSingerID().hashCode();
        }
        if (getSingerName() != null) {
            _hashCode += getSingerName().hashCode();
        }
        if (getSongID() != null) {
            _hashCode += getSongID().hashCode();
        }
        if (getSongName() != null) {
            _hashCode += getSongName().hashCode();
        }
        if (getSpID() != null) {
            _hashCode += getSpID().hashCode();
        }
        if (getSpName() != null) {
            _hashCode += getSpName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getToneID() != null) {
            _hashCode += getToneID().hashCode();
        }
        if (getToneName() != null) {
            _hashCode += getToneName().hashCode();
        }
        if (getToneNameLetter() != null) {
            _hashCode += getToneNameLetter().hashCode();
        }
        if (getToneValidDay() != null) {
            _hashCode += getToneValidDay().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.tyqk.karakal.com.cn", "contentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("albumInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "albumInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.tyqk.karakal.com.cn", "albumInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appendInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appendInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditFilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmsSingerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmsSingerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmsSingerNameLetter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmsSingerNameLetter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corpID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISRC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ISRC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("musicID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "musicID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("playFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "playFilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property");
        elemField.setXmlName(new javax.xml.namespace.QName("", "property"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singerID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "singerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "singerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("songID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "songID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("songName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "songName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
        elemField.setFieldName("toneName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toneName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toneNameLetter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toneNameLetter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toneValidDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toneValidDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
