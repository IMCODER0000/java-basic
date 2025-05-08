package chap04;

import java.util.Scanner;

public class WhileExam2 {
	
	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int i = 1;
		
		while(i<10) {
			
			System.out.print(num + " x " + i + " = " + num*i);
			System.out.println();
			i++;
			
			
		}
		
		
		
		
		
		
	}
		
	

}
