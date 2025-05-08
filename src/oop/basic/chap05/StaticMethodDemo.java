package oop.basic.chap05;

public class StaticMethodDemo {
	
	public StaticMethodDemo() {
		System.out.println("StaticMethodDemo생성");
		
		
	}
	
	
	public static void print() {
		System.out.println("++++++++print+++++++");
	}
	
	public static void display() {
		System.out.println("++++++++display+++++++");

	}
	
	public void test() {
		System.out.println("++++++++test+++++++");
	}
	
	public static void show() {
		System.out.println("++++++++show+++++++");
	}
	
	public void change() {
		System.out.println("++++++++change+++++++");
		
		this.test();
		
		show();
	}
	

}

