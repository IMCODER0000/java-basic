package oop.chap07.polymorphism02;

public class Rectangular extends Shape {
	
	private double width;
	private double hight;
	
	public Rectangular() {
		super();
	}
	
	
	
	public Rectangular(String name, double width, double hight) {
		super();
		this.width = width;
		this.hight = hight;
		super.setName(name);
	}



	public double getWidth() {
		return width;
	}





	public void setWidth(double width) {
		this.width = width;
	}





	public double getHight() {
		return hight;
	}





	public void setHight(double hight) {
		this.hight = hight;
	}





	@Override
	public void calculationArea() {
		super.setArea(width * hight);
	}
	
	
	

}
