package chap02;

import java.util.Random;

public class IfExam01 {
	
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		
		int num = rand.nextInt(100);
		
		System.out.println("입력한 숫자 : " + num);
		
		
		if(num%5 == 0) {
			System.out.println("입력한 숫자는 5의 배수입니다.");
		} else {
			System.out.println("입력한 숫자는 5의 배수가 아닙니.");
		}
		
		
		
		
		
	}

}
