package oop.inheritance.chap07;

public class Teacher extends Person {
	
//	String name;
//	int age;
	private String subject;
	
	
	
	    
	 public Teacher(String name, int age, String subject) {
		 super(name, age);
	     this.subject = subject;
	 }
	

	public void setSubject(String subject) {
		this.subject = subject;
	}
	

	public String getSubject() {
		return this.subject;
	}
	

	
	public void display() {
		super.display();
		System.out.println("\t담당과목 : " + getSubject());
	}

}
