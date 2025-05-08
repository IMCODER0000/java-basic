package oop.basic.chap05;
//MyMethod클래스에서 정의된 메소드를 사용
//=> 메소드호출
public class MyMethodTest {
	public static void main(String[] args) {
		MyMethod obj = new MyMethod();
		System.out.println("프로그램시작");
		System.out.println("step1");
		//1. 매개변수가 없고 리턴값이 없는 메소드의 호출
		obj.display();
		obj.display();
		System.out.println("step2");
		System.out.println("step3");
		//2. 리턴값이 없고 매개변수1개 메소드를 호출
		obj.display("*");
		obj.display("#");
		obj.display("★");
		
		//3. 리턴값이 없고 매개변수2개 메소드를 호출
		obj.display("▣",20);
		obj.display("◆", 50);
		obj.display("%", 5);
		
		int result = obj.add(1000, 2000);
		
		
		
	}
}













