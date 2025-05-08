package oop.basic.chap05;

public class Person2 {
	private String name;
	private String addr;
	private int age;
	private int point;
	
	
	public Person2(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddr() {
		return this.addr;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	
}
