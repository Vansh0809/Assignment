package com.cg.mob.bean;

import java.util.Date;

public class CustomerDetails {
	private String customerName;
	private String customerMailId;
	private int customerMobileId;
	private int customerPhoneNumber;
	private int purchaseId;
	private Date purchaseDate;
	
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDetails(String customerName, String customerMailId, int customerMobileId, int customerPhoneNumber,
			int purchaseId, Date purchaseDate) {
		super();
		this.customerName = customerName;
		this.customerMailId = customerMailId;
		this.customerMobileId = customerMobileId;
		this.customerPhoneNumber = customerPhoneNumber;
		this.purchaseId = purchaseId;
		this.purchaseDate = purchaseDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerMailId() {
		return customerMailId;
	}
	public void setCustomerMailId(String customerMailId) {
		this.customerMailId = customerMailId;
	}
	public int getCustomerMobileId() {
		return customerMobileId;
	}
	public void setCustomerMobileId(int customerMobileId) {
		this.customerMobileId = customerMobileId;
	}
	public int getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(int customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	@Override
	public String toString() {
		return "CustomerDetails [customerName=" + customerName + ", customerMailId=" + customerMailId
				+ ", customerMobileId=" + customerMobileId + ", customerPhoneNumber=" + customerPhoneNumber
				+ ", purchaseId=" + purchaseId + ", purchaseDate=" + purchaseDate + "]";
	}
	
	

}
