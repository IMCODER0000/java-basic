package oop.basic.chap05;

public class StaticMethodDemoTest {
	
	public static void main(String[] args) {
		
		StaticMethodDemo obj = new StaticMethodDemo();
		
		obj.print();
		
		StaticMethodDemo.print();
		

		test2();
		
	}
	
	public void test() {
		System.out.println("test");
	}
	
	public static void test2() {
		System.out.println("test2");
	}
	
	

}
