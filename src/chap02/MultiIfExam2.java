package chap02;

import java.util.Scanner;
public class MultiIfExam2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		
		int score = sc.nextInt();
		
		System.out.print("평가 : ");
		if(score <= 100 && score >=90) {
			System.out.println("A학점");
		} else if(score <= 89 && score >=80) {
			System.out.println("B학점");
		} else if(score <= 79 && score >=70) {
			System.out.println("C학점");
		} else if(score <= 69 && score >=60) {
			System.out.println("D학점");
		} else if(0<=score && score <= 59) {
			System.out.println("F학점");
		} else  {
			System.out.println("잘못된 입력입니다.");
		} 
	}

}
