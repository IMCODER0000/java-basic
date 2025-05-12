package oop.chap07.polymorphism02;

public abstract class Shape {
	
	protected double area;
	private String name;
	

	public Shape() {
		super();
	}
	
	
	public Shape(String name) {
		super();
		this.name = name;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println(this.getName() + "의 면적은 " + this.getArea() );
	}
	
	public abstract void calculationArea();
	
	
	

}
