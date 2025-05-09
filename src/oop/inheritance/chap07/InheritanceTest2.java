package oop.inheritance.chap07;



class Parent{
	public void display() {
		System.out.println("부모의 display");
		
	}
}


class Child extends Parent{
	
	public void display() {
		System.out.println("하위클래스의 display");
		
		
	}
	
	public void test() {
		System.out.println("자식클래스의 test()");
		display();
		super.display();
	}
	
}








public class InheritanceTest2 {
	public static void main(String[] args) {
		Child ob = new Child();
		ob.test();

	}

}
