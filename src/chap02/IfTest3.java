package chap02;

import java.util.Random;

public class IfTest3 {
	
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int num = rand.nextInt(-10, 120);
		
		System.out.println("num : " + num);
		
		
		if(num<0 || num>100) {
			
			System.out.println("잘못입력");
			
		} else {
			if(num>=90) {
				System.out.println("pass");
			} else {
				System.out.println("fail");
			}
			
		}
		
		
		
		
	}
	
	
	

}
