package com.pd.main.dto;

public class CotactDTO {

	private Integer ContactId;

	private String ContactName;

	private String ContactEmail;

	private Long ContactNum;

	public CotactDTO() {

	}

	public CotactDTO(Integer contactId, String contactName, String contactEmail, Long contactNum) {
		ContactId = contactId;
		ContactName = contactName;
		ContactEmail = contactEmail;
		ContactNum = contactNum;
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

	@Override
	public String toString() {
		return "CotactDTO [ContactId=" + ContactId + ", ContactName=" + ContactName + ", ContactEmail=" + ContactEmail
				+ ", ContactNum=" + ContactNum + "]";
	}

}
