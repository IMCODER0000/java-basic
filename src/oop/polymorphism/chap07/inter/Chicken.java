package oop.polymorphism.chap07.inter;

public class Chicken extends Animal implements Cheatable{
	
	public Chicken() {
		super();
	}

	public Chicken(int speed) {
		super(speed);
	}
	
	@Override
	public void run(int hours) {
		this.setDistance(this.getSpeed() * hours);
	}
	
	@Override
	public void fly() {
		this.setSpeed(getSpeed()*2);
	}
	
	
	
	
	

}
