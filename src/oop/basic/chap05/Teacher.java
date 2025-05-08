package oop.basic.chap05;

public class Teacher {
	
	
	
	private String name;
	private int age;
	private String subject;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void display() {
		System.out.println("이름 : " + getName() + " 나이 : " + getAge() + " 담당과목 : " + getSubject());
	}

}
