package oop.inheritance.chap07;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}	
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void display() {
		System.out.print("이름 : " + this.getName() + "\t나이 : " + this.getAge());
	}
	

}
