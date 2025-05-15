package exception;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class ExceptionTest2 {
	public static void main(String[] args) {
		
		
		try {
			
			System.out.println("try 시작 ~");
			System.out.println(10/0);
			System.out.println("try 종");
			
			
		} catch(ArithmeticException e) {
			
			JOptionPane.showMessageDialog(null, "예외 발생");
			
			System.out.println("예외 발생");
			System.out.println("예외메세지 : " + e.getMessage());
			
			e.printStackTrace();
			
			
		}
		
		
		
		
	}
	

	
	
	

}
