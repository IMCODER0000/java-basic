package oop.basic.chap05;

public class MyMethodDemoTest {
	
	
	public static void main(String[] args) {
		
		MyMethodDemo mmd = new MyMethodDemo();
		
		mmd.printGuGu(2);
		System.out.println();
		System.out.println();
		mmd.printGuGu();
		System.out.println();
		System.out.println();
		
		
		int result = mmd.calc(2, 100, 100);

		System.out.println(result);
		
	}

}
