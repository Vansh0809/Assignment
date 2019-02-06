package com.cg.mob.bean;

public class MobileDetails {
	private int mobileId;
	private String name;
	private int price;
	private int quantity;
	
	
	@Override
	public String toString() {
		return "MobileDetails [mobileId=" + mobileId + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	public MobileDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MobileDetails(int mobileId, String name, int price, int quantity) {
		super();
		this.mobileId = mobileId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
