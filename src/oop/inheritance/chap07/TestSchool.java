package oop.inheritance.chap07;




public class TestSchool {
	public static void main(String[] args) {
		
		Student s = new Student("김석진",31,202001);
//		s.setName("김석진");
//		s.setAge(31);
//		s.setId(202001);

		Teacher t = new Teacher ("김남준",30, "JAVA");
//		t.setName("김남준");
//		t.setAge(30);
//		t.setSubject("JAVA");

		Staff  e = new Staff("전정국", 25, "작곡과");
//		e.setName("전정국");
//		e.setAge(25);
//		e.setJob("작곡과");
		
		s.display();
		t.display();
		e.display();
	}

}



