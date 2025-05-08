package chap02;

public class IfExam03 {
	
	
	public static void main(String[] args) {
		
		
		int num = 30;
		
		if(num>0) {
			if(num == 0) {
				System.out.println("0 입니다.");
			} else {
				if(num%2==0) {
					System.out.println("양수이면서 짝수 입니다");
				} else {
					System.out.println("양수이면서 홀수 입니다");
				}
				
			}
			
			
		} else {
			if(num == 0) {
				System.out.println("0 입니다.");
			} else {
				System.out.println("음수 입니다.");
			}
		}
			
		
		
		
		
		
		
		
	}
	
	
	

}
