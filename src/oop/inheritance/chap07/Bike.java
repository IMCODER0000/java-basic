package oop.inheritance.chap07;

public class Bike extends Wheeler {
	
	public Bike() {
		super();
	}
	
	public Bike(String carName, int velocity, int wheelNumber) {
		super(velocity, carName, wheelNumber);
	}
	
	
	public void speedUp(int speed) {
		
		this.velocity += speed;

		
		if(this.velocity >40) {
			this.velocity = 40;
			System.out.println("자전거의 최속도위반으로 속도를 " + this.velocity +" 으로 올립니다.");
		} else {
			System.out.println("자전거의 현재 속도는" + this.velocity + "입니다.");
		}
		

	}

	public void speedDown(int speed) {
		
		this.velocity -= speed;
		
		
		if(this.velocity < 10) {
			this.velocity = 10;
			System.out.println("자전거의 최저속도위반으로 속도를 " + this.velocity +" 으로 올립니다.");
		} else {
			System.out.println("자전거의 현재 속도는" + this.velocity + "입니다.");
		}
	}
	
	


}
