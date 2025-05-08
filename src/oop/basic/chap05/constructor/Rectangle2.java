package oop.basic.chap05.constructor;

public class Rectangle2 {
	
	
	
	private int width;
	private int length;
	private String color;
	
	
	

	
	public int area() {
		return width*length;
	}
	
	public int perimeter() {
		return 2*width + 2*length;
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String biggerArea(Rectangle2 rect) {
		if(this.area() == rect.area()){
			return "equal";
		}
		return this.area() > rect.area() ? this.getColor() : rect.getColor();	
	}
	
	public String biggerPerimeter(Rectangle2 rect) {
		if(this.perimeter() == rect.perimeter()){
			return "equal";
		}
		return this.perimeter() > rect.perimeter() ? this.getColor() : rect.getColor();	
	}
	
	
	
	
	
	



	
	
	

}
