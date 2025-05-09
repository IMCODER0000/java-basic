package oop.polymorphism.chap07;



class Super{
	String data = "상위클래스";
	public void display() {
		System.out.println("super의 display");
	}
}

class Sub extends Super{
	String data = "하위클래스";
	public void display() {
		System.out.println("sub의 display");
	}
	public void test() {
		System.out.println("sub의 test");
	}
}


public class RefTypeCastingTest2 {
	public static void main(String[] args) {
		System.out.println("1. Super타입의 참조변수로 Super객체를 사용");
		Super ob1 = new Super();
		ob1.display();
		System.out.println(ob1.data);
		System.out.println("******************************************");
		
		System.out.println("2. Sub타입의 참조변수로 Sub객체를 사용");
		Sub ob2 = new Sub();
		ob2.display();
		System.out.println(ob2.data);
		System.out.println("******************************************");
		
		System.out.println("3. Super타입의 참조변수로 Sub객체를 사용");
		Super ob3 = new Sub();
		ob3.display();
		System.out.println(ob3.data);
		System.out.println("******************************************");
		
		
	}

}
