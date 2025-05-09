package oop.inheritance.chap07;



class Super{
	int num = 100;
	String data = "데이터";
	
}

class Sub extends Super{
	int num = 100000;
	public void display() {
		System.out.println("-------------------------------");
		System.out.println("num : " + num);
		System.out.println("this.num : " + this.num);
		System.out.println("super.num : " + super.num);
		System.out.println("data : " + data);
		System.out.println("super.data : " + super.data);
		System.out.println("-------------------------------");
	}
	
	
}








public class InheritanceTest1 {
	public static void main(String[] args) {
		Sub ob = new Sub();
		ob.display();
		System.out.println(ob.num);
		
	}

}
