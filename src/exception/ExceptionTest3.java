package exception;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class ExceptionTest3 {
	public static void main(String[] args) {
		
		
		try {
			
			System.out.println("try 시작 ~");
			System.out.println(10/0);
			System.out.println("try 종");
		
			
			
		} catch(ArithmeticException e) {
			
			System.out.println("예외 발생");
			
			
		} finally {
			System.out.println("무조건 실행되는 코드 - 자원 반납");
		}
		
		
		
		
	}
	

	
	
	

}
