package oop.polymorphism.chap07.inter;

public abstract class Animal {

	private int speed;
	private double distance;
	
	public Animal() {
		
	}
	
	public Animal(int speed) {
		super();
		this.speed = speed;
	}
	
	public abstract void run(int hours);
	
	public double getDistance() {
		return this.distance;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
	
	
	
	
	
}
