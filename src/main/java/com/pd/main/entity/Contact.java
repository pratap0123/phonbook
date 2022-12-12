package com.pd.main.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CONTACT_DETAILS")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "	CONTACT_ID")
	private Integer ContactId;
	@Column(name = "	CONTACT_NAME")
	private String ContactName;
	@Column(name = "	CONTACT_EMAIL")
	private String ContactEmail;
	@Column(name = "	CONTACT_PHON")
	private Long ContactNum;

	public Contact() {

	}

	public Contact(Integer contactId, String contactName, String contactEmail, Long contactNum) {
		ContactId = contactId;
		ContactName = contactName;
		ContactEmail = contactEmail;
		ContactNum = contactNum;
	}

	public Contact(String contactName, String contactEmail, Long contactNum) {
		ContactName = contactName;
		ContactEmail = contactEmail;
		ContactNum = contactNum;
	}

	@Override
	public String toString() {
		return "Contact [ContactId=" + ContactId + ", ContactName=" + ContactName + ", ContactEmail=" + ContactEmail
				+ ", ContactNum=" + ContactNum + "]";
	}

	public Integer getContactId() {
		return ContactId;
	}

	public void setContactId(Integer contactId) {
		ContactId = contactId;
	}

	public String getContactName() {
		return ContactName;
	}

	public void setContactName(String contactName) {
		ContactName = contactName;
	}

	public String getContactEmail() {
		return ContactEmail;
	}

	public void setContactEmail(String contactEmail) {
		ContactEmail = contactEmail;
	}

	public Long getContactNum() {
		return ContactNum;
	}

	public void setContactNum(Long contactNum) {
		ContactNum = contactNum;
	}

}
