package object;

public class Vehicle {
	
	private Owner owner;
	private int price;
	
	

	public Vehicle() {
		super();

	}
	
	public Vehicle(Owner owner, int price) {
		super();
		this.owner = owner;
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		Vehicle v = (Vehicle) o;
		return this.owner.equals(v.getOwner());
	}
	
	
	
	
	@Override
	public String toString() {
		return "소유주정보 : 이름은 "+ this.getOwner().getName() +"이고, 헨드폰 번호는 " +this.getOwner().getCellPhone()+ "입니다. \n 차량정보 : 가격은 "+ this.getPrice()+"입니다.";
		
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
