package chap02;

import java.util.Scanner;

public class MultiIfExam {
	

	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("주민번호 입력 : ");
		
		int n = sc.nextInt();
		
		
		if(n == 1 || n == 3) {
			System.out.println("남자");
		} else if(n == 2 || n == 4) {
			System.out.println("여자");
		} else {
			System.out.println("기타");
		}
		
		
		
	}
	
	

}
