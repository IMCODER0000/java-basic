package oop.basic.chap05.constructor;

public class Staff extends Person{

	
//	String name;
//	int age;
    private String dept;
    
    public Staff() {
        
    }
    
    public Staff(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
    

    public String getJob() {
        return dept;
    }
    public void setJob(String dept) {
        this.dept = dept;
    }
    
    public void display() {
        System.out.println("이름 : " + this.getName() + " 나이 : " + this.getAge() + " 부서 : " + this.getJob());
    }
}