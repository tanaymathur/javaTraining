package com.seed.beans;

public class Customer {
	private long mobile;
	private int pincode;
	private String name;
	public Customer() {
	}
	public long getMobile() {
		return mobile;
	}
	public int getPincode() {
		return pincode;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
//	TODO:1	Provide no-argument public constructor
//	TODO:2	Provide getters and setters for all attributes.
}
