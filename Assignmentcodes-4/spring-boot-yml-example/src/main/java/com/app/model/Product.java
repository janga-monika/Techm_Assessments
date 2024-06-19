package com.app.model;
import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("my.prod")   // gets the values from appplication.properties/application.yml file.
@Component
public class Product {
	private int id;
	private String code;
	private double cost;
	private List<String> version;
	private Map<String,Double> model;
	
	public Product() {
		super();
	}
	public Product(int id) {
		super();
		this.id=id;
	}
	public Product(int id,String code,double cost,List<String> version,Map<String,Double> model) {
		super();
		this.id=id;
		this.code=code;
		this.cost=cost;
		this.version=version;
		this.model=model;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code=code;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost=cost;
	}
	
	public List<String> getVersion() {
		return version;
	}
	public void setVersion(List<String> version) {
		this.version=version;
	}
	public Map<String,Double> getModel(){
		return model;
	}
	public void setModel(Map<String,Double> model) {
		this.model=model;
	}
	@Override
	public String toString() {
		return "Product[id=" + id + ", code="+ code + ",cost=" + cost +",version="+ version +",model=" + model + "]"; 
	}

}
