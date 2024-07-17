package com.example.curtainmodel.curtain_model;
import jakarta.persistence.*;

@Entity
@Table(name="curtain")
public class Curtain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String brand;
    @Column
    private String material;
    @Column
    private String color;
    @Column
    private int price;
    
    public Curtain() {
    	
    }
    
    
    
	public Curtain(int id, String brand, String material, String color, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.material = material;
		this.color = color;
		this.price = price;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

    
}

