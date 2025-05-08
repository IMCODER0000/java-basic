package oop.basic.chap05.constructor;

public class Teacher extends Person {
	
//	String name;
//	int age;
	private String subject;
	
	
	public Teacher() {
        
	 }
	    
	 public Teacher(String name, int age, String subject) {
	        this.name = name;
	        this.age = age;
	        this.subject = subject;
	 }
	

	public void setSubject(String subject) {
		this.subject = subject;
	}
	

	public String getSubject() {
		return this.subject;
	}
	

	
	public void display() {
		System.out.println("이름 : " + getName() + " 나이 : " + getAge() + " 담당과목 : " + getSubject());
	}

}
