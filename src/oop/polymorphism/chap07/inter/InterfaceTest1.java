package oop.polymorphism.chap07.inter;


interface SuperInterfaceA{
	void show();
}
interface SuperInterfaceB{
	void test();
}

interface ChildInterfaceA extends SuperInterfaceA, SuperInterfaceB{
	void test();
}

class Super{
	public void display() {
		System.out.println("display");
	}
}

class ChildA extends Super implements SuperInterfaceA, SuperInterfaceB {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	
}





public class InterfaceTest1 {
	public static void main(String[] args) {
		ChildA c = new ChildA();
		run1(c);
		run2(c);
		run3(c);
		
		
		
	}
	
	public static void run1(Super obj) {
		obj.display();
	}
	public static void run2(SuperInterfaceA obj) {
		obj.show();
	}
public static void run3(SuperInterfaceB obj) {
		obj.test();
	}

}
