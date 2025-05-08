package chap02;

import java.util.Random;

public class IfTest1 {
	public static void main(String[] args) {
		
		
		Random random = new Random();
		
		int randomNum = random.nextInt(101);
		
		System.out.println(randomNum);
		
		if(randomNum > 90) {
			
			System.out.println("테스트 작업 완료!");
		}else {
			
			System.out.println("테스트 작업 실패!");
		}
		
		
		
		
		
		
	}

}
