package exception;

import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionExam1 {
	public static void main(String[] args) {
		
		
		
		Scanner key = new Scanner(System.in);
		
		
		try {
			System.out.print("숫자 입력 : ");
			int data = key.nextInt();
			System.out.println("입력 값 : " + data);
			
		} catch(InputMismatchException e) {
			
//			JOptionPane.showMessageDialog(null, "예외 발생"); 
			System.out.println("잘못입력했습니다");
//			e.printStackTrace();
			
		}

		
		
		
		
		
		
	}
	

	
	
	

}
