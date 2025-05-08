package oop.basic.chap05;

public class Staff {
	
	private String name;
	private int age;
	private String job;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public String getJob() {
		return this.job;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void display() {
		System.out.println("이름 : " + getName() + " 나이 : " + getAge() +" 부  서 : " + getJob());
	}

}
