package oop.inheritance.chap07;

public class Beverage {
	
	String type;
	int price;
	
	public Beverage() {
		
	}
	
	public Beverage(String type, int price) {
		this.type = type;
		this.price = price;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
