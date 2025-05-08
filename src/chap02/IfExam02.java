package chap02;

import java.util.Scanner;

public class IfExam02 {
	
	
	
	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in); 
			
			System.out.print("숫자 입력 : ");
			
			int num = scanner.nextInt();
			
			
			if(num >=0) {
				if(num%5 == 0) {
					System.out.println("입력한 숫자는 5의 배수입니다.");
				} else {
					System.out.println("입력한 숫자는 5의 배수가 아닙니다.");
				}
			} else {
				System.out.println("음수 입니다.");
			}
			
			
			
			
			
			
		}
		
	
	
	

}
