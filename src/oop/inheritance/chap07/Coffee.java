package oop.inheritance.chap07;

public class Coffee extends Beverage {
	
	
	String name;
	
	
	public Coffee(String type, int price, String name) {
		super(type,price);
		this.name = name;
		
	}
	
	public void print() {
		System.out.println("종류 : " + type + " 이름 : " + name + " 가격 : " + price);
	}
	
	
	

}
