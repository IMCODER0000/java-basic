package oop.inheritance.chap07;

public class Staff extends Person{

	
//	String name;
//	int age;
    private String dept;
    
    
   public Staff() {
	   
   }
   
    
    public Staff(String name, int age, String dept) {
        super(name, age);
        this.dept = dept;
    }
    

    public String getJob() {
        return dept;
    }
    public void setJob(String dept) {
        this.dept = dept;
    }
    
    public void display() {
    	super.display();
        System.out.println("\t부서 : " + this.getJob());
    }
}