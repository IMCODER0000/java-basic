package exception;

import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionTest4 {
	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		int i = 1;
		
//		try{
//			while(i<=5) {
//				System.out.println("i : " + i);
//				System.out.print("나눌 숫자 입력 : ");
//				int num  = key.nextInt();
//				System.out.println("계산 결과 => " + (i/num));
//				i++;
//				
//			}
//		} catch(ArithmeticException e) {
//			System.out.println("계산 오~~~~~~~~~~");
//		}
		
		
		while(i<=5) {
			System.out.println("i : " + i);
			System.out.print("나눌 숫자 입력 : ");
			int num  = key.nextInt();
			try {
				System.out.println("계산 결과 => " + (i/num));
			}catch(ArithmeticException e) {
				System.out.println("계산 오류");
			}
			
			i++;
		}
		
		
		
		
		
		
		
	}
	

	
	
	

}
