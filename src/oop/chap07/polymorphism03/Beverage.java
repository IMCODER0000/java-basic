package oop.chap07.polymorphism03;

public abstract class Beverage {
	
	private String name;
	protected int price;
	
	
	
	
	public Beverage() {
		
	}
	
	
	public Beverage(String name) {
		super();
		this.name = name;
	}

	public abstract void calcPrice();
	
	public void print() {
		System.out.println(i+" 번째 판매 음료는 " + b[i].getName() +" 이며, 가격은 " + b[i].getPrice());
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
	

	

	
	
	
}
