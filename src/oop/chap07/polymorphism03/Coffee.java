package oop.chap07.polymorphism03;

public class Coffee extends Beverage{
	
	
	static int amount;
	
	

	
	public Coffee(String name) {
		super(name);
		Coffee.amount++ ;
		calcPrice();
	}
	
	
	
	
	public static int getAmount() {
		return amount;
	}
	
	@Override
	public void print() {
		System.out.println(getName() +" 이며, 가격은 " + getPrice());
	}






	public static void setAmount(int amount) {
		Coffee.amount = amount;
	}





	@Override
	public void calcPrice() {
		
		switch(super.getName()) {
			case "Americano" :
				super.setPrice(1500);
				break;
			case "CafeLatte" :
				super.setPrice(2500);
				break;
			case "Cappuccino" :
				super.setPrice(3000);
				break;
				
		}
	}
	

}
