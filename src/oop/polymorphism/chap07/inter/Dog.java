package oop.polymorphism.chap07.inter;

public class Dog extends Animal{
	
	public Dog() {
		super();
	}

	public Dog(int speed) {
		super(speed);
	}
	
	@Override
	public void run(int hours) {
		this.setDistance(this.getSpeed() * (hours/2.0));
	}

	
	
	
	
	
	

}
