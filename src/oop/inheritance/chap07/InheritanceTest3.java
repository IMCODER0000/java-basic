package oop.inheritance.chap07;



class SuperA extends Object{
	
	private String name;
	private int age;
	
	public void display() {
		System.out.println("부모의 display");
	}
	
	public SuperA() {
		
	}
	
	public SuperA(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}


class SubA extends SuperA{
	
	String subdata;
	public SubA(String name, int age, String subdata) {
		super(name, age);
		this.subdata = subdata;
	}
	
}








public class InheritanceTest3 {
	public static void main(String[] args) {
		SubA ob = new SubA("석진", 30, "멋지다");
//		System.out.println("성명 : " + ob.name + ", 나이 : " + ob.age + ", 정보 : " + ob.subdata);
	
	}

}
