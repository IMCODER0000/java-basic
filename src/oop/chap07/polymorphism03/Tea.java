package oop.chap07.polymorphism03;

public class Tea extends Beverage{
	
	
	static int amount;
	
	

	
	public Tea(String name) {
		super(name);
		Tea.amount++;
		calcPrice();
	}


	public static int getAmount() {
		return amount;
	}


	public static void setAmount(int amount) {
		Tea.amount = amount;
	}

	@Override
	public void print() {
		System.out.println(getName() +" 이며, 가격은 " + getPrice());
	}


	@Override
	public void calcPrice() {
		switch(super.getName()) {
		case "lemonTea" :
			super.setPrice(1500);
			break;
		case "ginsengTea" :
			super.setPrice(2000);
			break;
		case "redginsengTea" :
			super.setPrice(2500);
			break;
			
	}
	}
	

}
