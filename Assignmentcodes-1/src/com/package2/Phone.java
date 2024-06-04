package com.package2;

public class Phone {
	private int phoneId;
    private String os;
    private String brand;
    private int price;

    public Phone(int phoneId,String os,String brand,int price) {
        this.phoneId=phoneId;
        this.os=os;
        this.brand=brand;
        this.price=price;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId=phoneId;
    }

    public String getOs() {
        return os.toLowerCase();
    }

    public void setOs(String os) {
        this.os=os;
    }

    public String getBrand() {
        return brand.toLowerCase();
    }

    public void setBrand(String brand) {
        this.brand=brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price=price;
    }
}
