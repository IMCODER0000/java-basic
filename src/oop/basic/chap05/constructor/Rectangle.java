package oop.basic.chap05.constructor;

public class Rectangle {
	
	private int width;
	private int height;
	private String color;
	private int area;
	
	
	public Rectangle() {
		this.color = "흰색";
	}
	
	public Rectangle(int width, int height) {
		this();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int width, int height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public void calculateArea() {
		this.area = width*height;
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}

}
