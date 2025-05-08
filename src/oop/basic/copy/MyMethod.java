package oop.basic.copy;
//메소드를 유형별로 정의
public class MyMethod {
	//3. 리턴값이 없고 매개변수가 2개인 메소드
	//=> 출력할 기호와 출력할 횟수를 매개변수로 전달 받아서 사용할 수 있도록 메소드를 정의
	public void display(String str,int count) {
		for(int i=1;i<=count;i++) {
			System.out.print(str);
		}
		System.out.println();
		System.out.println("---------------------");
	}
	
	
	
	//2. 리턴값이 없고 매개변수가 1개인 메소드
	//  => 매개변수갯수, 타입, 순서를 다르게 정의하면 같은 이름의 메소드를 여러 개 정의하고
	//     사용할 수 있다. 이를 메소드 오버로딩이라 한다.
	public void display(String str) {
		for(int i=1;i<=10;i++) {
			System.out.print(str);
		}
		System.out.println();
		System.out.println("---------------------");
	}
	
	
	//1. 매개변수가 없고 리턴값이 없는 메소드
	//  => * 기호를 10회 출력하고 싶은 개발자만 활용 가능
	public void display() {
		for(int i=1;i<=10;i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("---------------------");
	}
	
}
