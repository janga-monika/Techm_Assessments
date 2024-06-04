package com.package2;

public class Travel_Agencies {
	
	private int regNo;
	private String agencyName;
	private String pakageType;
	private int price;
	private Boolean flightFacility ;
	
	public Travel_Agencies(int regNo,String agencyName,String pakageType,int price,Boolean flightFacility)
	{
		this.regNo=regNo;
		this.agencyName=agencyName;
		this.pakageType=pakageType;
		this.price=price;
		this.flightFacility=flightFacility ;
	}
	
	public int get_regNo() {
		return regNo;
	}
	public String get_agencyName() {
		return agencyName;
	}
	public String get_pakageType() {
		return pakageType;
	}
	public int get_price() {
		return price;
	}
	public Boolean get_flightFacility() {
		return flightFacility;
	}
	
	
	
	public void set_regNo(int regNo) {
		this.regNo=regNo;
	}
	
	public void set_agencyName(String agencyName) {
		this.agencyName=agencyName;
	}
	
	public void set_pakageType(String pakageType) {
		this.pakageType=pakageType;
	}
	
	public void set_price(int price) {
		this.price=price;
	}
	
	public void set_flightFacility(Boolean flightFacility) {
		this.flightFacility=flightFacility;
	}

}

