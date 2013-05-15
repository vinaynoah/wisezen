package com.fboy.wisezen.persistance;

import java.util.Date;

import com.fboy.wisezen.db.DbManager;

public class Institute {

	private int InstituteID;
	private String institutename;
	private String officeHours;
	private String street;
	private String city;
	private String state;
	private String country;
	private String googleMapLink;
	private String phoneLandLine1;
	private String phoneMobile1;
	private String phoneLandLine2;
	private String phoneMobile2;

	private String email1;
	private String email2;
	private String website;
	private String fbPage;
	private Date createdDate;
	private Date modifiedDate;
	private String createdBy;

	public Institute(int InstituteID, String institutename, String officeHours,
			String street, String city, String state, String country,
			String googleMapLink, String phoneLandLine1, String phoneMobile1,
			String phoneLandLine2, String phoneMobile2, String email1,
			String email2, String website, String fbPage, Date createdDate,
			Date modifiedDate, String createdBy) {

	}

	public Institute() {

	}

	public boolean addInstitute() {
		String insertSqlQuery = "insert into INSTITUTE (INSTITUTE_NAME, OFFICE_HOURS, . . . .) VALUES ( "
				+ this.institutename + ",";
		return false;
	}

	public boolean updateInstitute() {
		String updateQuery = "update INSTITUTE set ";
		return false;
	}

	public boolean deleteInstitute() {
		String deleteQuery = "delete from INSTITUTE where INSTITUTE_ID = \""
				+ this.InstituteID + "\"";
		return DbManager.delete(deleteQuery);

	}

	public int getInstituteID() {
		return InstituteID;
	}

	public void setInstituteID(int instituteID) {
		InstituteID = instituteID;
	}

	public String getInstitutename() {
		return institutename;
	}

	public void setInstitutename(String institutename) {
		this.institutename = institutename;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGoogleMapLink() {
		return googleMapLink;
	}

	public void setGoogleMapLink(String googleMapLink) {
		this.googleMapLink = googleMapLink;
	}

	public String getPhoneLandLine1() {
		return phoneLandLine1;
	}

	public void setPhoneLandLine1(String phoneLandLine1) {
		this.phoneLandLine1 = phoneLandLine1;
	}

	public String getPhoneMobile1() {
		return phoneMobile1;
	}

	public void setPhoneMobile1(String phoneMobile1) {
		this.phoneMobile1 = phoneMobile1;
	}

	public String getPhoneLandLine2() {
		return phoneLandLine2;
	}

	public void setPhoneLandLine2(String phoneLandLine2) {
		this.phoneLandLine2 = phoneLandLine2;
	}

	public String getPhoneMobile2() {
		return phoneMobile2;
	}

	public void setPhoneMobile2(String phoneMobile2) {
		this.phoneMobile2 = phoneMobile2;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFbPage() {
		return fbPage;
	}

	public void setFbPage(String fbPage) {
		this.fbPage = fbPage;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
