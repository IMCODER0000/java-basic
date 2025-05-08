package oop.basic.chap05.constructor;

public class Student extends Person {
	

//	String name;
//	int age;
	private int id;
	
	
	 public Student() {
	        
	 }
	    
	 public Student(String name, int age, int id) {
	        this.name = name;
	        this.age = age;
	        this.id = id;
	 }
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void display() {
		System.out.println("이름 : " + getName() + " 나이 : " + getAge() + " 학  번 : " + getId() + "\t");
	}
	

}
