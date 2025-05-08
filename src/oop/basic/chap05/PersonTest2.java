package oop.basic.chap05;

public class PersonTest2 {
	public static void main(String[] args) {

		Person2 obj =  new Person2("RM", "서울", 40);
		
		
//		obj.setName("RM");
//		obj.setAddr("서울");
//		obj.setAge(40);
		
		String objName = obj.getName();
		String objAddr = obj.getAddr();
		int objAge = obj.getAge();
		
		System.out.println("이름 : " + objName);
		System.out.println("주소 : " + objAddr);
		System.out.println("나이 : " + objAge);
		
		
		
	}

}