package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Artist complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Artist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="artistID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="artistName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="englishName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="artistNamePinyin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="artistNameFirstLetter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anotherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activeYears" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="artistPicS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="artistPicM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="artistPicL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="similarArtist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="school" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="representWorks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weitht" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bloodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hobby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instrument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="awards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerarea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerstyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerlevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Artist", propOrder = { "artistID", "artistName", "status",
		"gender", "englishName", "artistNamePinyin", "artistNameFirstLetter",
		"formerName", "anotherName", "nickName", "activeYears", "artistPicS",
		"artistPicM", "artistPicL", "similarArtist", "company", "country",
		"nation", "birthDate", "birthPlace", "school", "representWorks",
		"height", "weitht", "bloodType", "hobby", "instrument", "awards",
		"idol", "lover", "intro", "singerarea", "singerstyle", "singerlevel" })
public class Artist {

	protected String artistID;
	protected String artistName;
	protected String status;
	protected String gender;
	protected String englishName;
	protected String artistNamePinyin;
	protected String artistNameFirstLetter;
	protected String formerName;
	protected String anotherName;
	protected String nickName;
	protected String activeYears;
	protected String artistPicS;
	protected String artistPicM;
	protected String artistPicL;
	protected String similarArtist;
	protected String company;
	protected String country;
	protected String nation;
	protected String birthDate;
	protected String birthPlace;
	protected String school;
	protected String representWorks;
	protected String height;
	protected String weitht;
	protected String bloodType;
	protected String hobby;
	protected String instrument;
	protected String awards;
	protected String idol;
	protected String lover;
	protected String intro;
	protected String singerarea;
	protected String singerstyle;
	protected String singerlevel;

	/**
	 * Gets the value of the artistID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArtistID() {
		return artistID;
	}

	/**
	 * Sets the value of the artistID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArtistID(String value) {
		this.artistID = value;
	}

	/**
	 * Gets the value of the artistName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArtistName() {
		return artistName;
	}

	/**
	 * Sets the value of the artistName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArtistName(String value) {
		this.artistName = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatus(String value) {
		this.status = value;
	}

	/**
	 * Gets the value of the gender property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the value of the gender property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGender(String value) {
		this.gender = value;
	}

	/**
	 * Gets the value of the englishName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEnglishName() {
		return englishName;
	}

	/**
	 * Sets the value of the englishName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEnglishName(String value) {
		this.englishName = value;
	}

	/**
	 * Gets the value of the artistNamePinyin property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArtistNamePinyin() {
		return artistNamePinyin;
	}

	/**
	 * Sets the value of the artistNamePinyin property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArtistNamePinyin(String value) {
		this.artistNamePinyin = value;
	}

	/**
	 * Gets the value of the artistNameFirstLetter property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArtistNameFirstLetter() {
		return artistNameFirstLetter;
	}

	/**
	 * Sets the value of the artistNameFirstLetter property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArtistNameFirstLetter(String value) {
		this.artistNameFirstLetter = value;
	}

	/**
	 * Gets the value of the formerName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFormerName() {
		return formerName;
	}

	/**
	 * Sets the value of the formerName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFormerName(String value) {
		this.formerName = value;
	}

	/**
	 * Gets the value of the anotherName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAnotherName() {
		return anotherName;
	}

	/**
	 * Sets the value of the anotherName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAnotherName(String value) {
		this.anotherName = value;
	}

	/**
	 * Gets the value of the nickName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * Sets the value of the nickName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNickName(String value) {
		this.nickName = value;
	}

	/**
	 * Gets the value of the activeYears property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getActiveYears() {
		return activeYears;
	}

	/**
	 * Sets the value of the activeYears property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setActiveYears(String value) {
		this.activeYears = value;
	}

	/**
	 * Gets the value of the artistPicS property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArtistPicS() {
		return artistPicS;
	}

	/**
	 * Sets the value of the artistPicS property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArtistPicS(String value) {
		this.artistPicS = value;
	}

	/**
	 * Gets the value of the artistPicM property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArtistPicM() {
		return artistPicM;
	}

	/**
	 * Sets the value of the artistPicM property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArtistPicM(String value) {
		this.artistPicM = value;
	}

	/**
	 * Gets the value of the artistPicL property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArtistPicL() {
		return artistPicL;
	}

	/**
	 * Sets the value of the artistPicL property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArtistPicL(String value) {
		this.artistPicL = value;
	}

	/**
	 * Gets the value of the similarArtist property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSimilarArtist() {
		return similarArtist;
	}

	/**
	 * Sets the value of the similarArtist property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSimilarArtist(String value) {
		this.similarArtist = value;
	}

	/**
	 * Gets the value of the company property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * Sets the value of the company property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCompany(String value) {
		this.company = value;
	}

	/**
	 * Gets the value of the country property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the value of the country property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountry(String value) {
		this.country = value;
	}

	/**
	 * Gets the value of the nation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNation() {
		return nation;
	}

	/**
	 * Sets the value of the nation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNation(String value) {
		this.nation = value;
	}

	/**
	 * Gets the value of the birthDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * Sets the value of the birthDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBirthDate(String value) {
		this.birthDate = value;
	}

	/**
	 * Gets the value of the birthPlace property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBirthPlace() {
		return birthPlace;
	}

	/**
	 * Sets the value of the birthPlace property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBirthPlace(String value) {
		this.birthPlace = value;
	}

	/**
	 * Gets the value of the school property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * Sets the value of the school property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSchool(String value) {
		this.school = value;
	}

	/**
	 * Gets the value of the representWorks property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRepresentWorks() {
		return representWorks;
	}

	/**
	 * Sets the value of the representWorks property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRepresentWorks(String value) {
		this.representWorks = value;
	}

	/**
	 * Gets the value of the height property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * Sets the value of the height property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHeight(String value) {
		this.height = value;
	}

	/**
	 * Gets the value of the weitht property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWeitht() {
		return weitht;
	}

	/**
	 * Sets the value of the weitht property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWeitht(String value) {
		this.weitht = value;
	}

	/**
	 * Gets the value of the bloodType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBloodType() {
		return bloodType;
	}

	/**
	 * Sets the value of the bloodType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBloodType(String value) {
		this.bloodType = value;
	}

	/**
	 * Gets the value of the hobby property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHobby() {
		return hobby;
	}

	/**
	 * Sets the value of the hobby property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHobby(String value) {
		this.hobby = value;
	}

	/**
	 * Gets the value of the instrument property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInstrument() {
		return instrument;
	}

	/**
	 * Sets the value of the instrument property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInstrument(String value) {
		this.instrument = value;
	}

	/**
	 * Gets the value of the awards property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAwards() {
		return awards;
	}

	/**
	 * Sets the value of the awards property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAwards(String value) {
		this.awards = value;
	}

	/**
	 * Gets the value of the idol property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdol() {
		return idol;
	}

	/**
	 * Sets the value of the idol property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdol(String value) {
		this.idol = value;
	}

	/**
	 * Gets the value of the lover property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLover() {
		return lover;
	}

	/**
	 * Sets the value of the lover property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLover(String value) {
		this.lover = value;
	}

	/**
	 * Gets the value of the intro property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIntro() {
		return intro;
	}

	/**
	 * Sets the value of the intro property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIntro(String value) {
		this.intro = value;
	}

	/**
	 * Gets the value of the singerarea property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSingerarea() {
		return singerarea;
	}

	/**
	 * Sets the value of the singerarea property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSingerarea(String value) {
		this.singerarea = value;
	}

	/**
	 * Gets the value of the singerstyle property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSingerstyle() {
		return singerstyle;
	}

	/**
	 * Sets the value of the singerstyle property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSingerstyle(String value) {
		this.singerstyle = value;
	}

	/**
	 * Gets the value of the singerlevel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSingerlevel() {
		return singerlevel;
	}

	/**
	 * Sets the value of the singerlevel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSingerlevel(String value) {
		this.singerlevel = value;
	}

}
