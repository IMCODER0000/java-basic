package chap04;

import java.util.Scanner;

public class ForExam_GuGu {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		for (int i = 1; i<10; i++) {
			System.out.print(num + " x " + i + " = " + num*i);
			System.out.println();
		
		}
		
		
		
		
	}

}
