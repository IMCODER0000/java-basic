package exception;

import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionTest5 {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		try {
			System.out.println("시작");
			System.out.println("종료");
			System.out.print("나눌 숫자 : ");
			int num = key.nextInt();
			System.out.print(10/num);
			if(num%2 ==0) {
				System.out.print(args[0]);
			}else {
				String str = null;
				System.out.print(str.length());
			}
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안돼 ~~~~~");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("명령어 매개변수 없어 ~~~");
		} catch(InputMismatchException e) {
			System.out.println("숫자만 입력해야해 ~~~~");
		} finally {
			System.out.println("종료");
		}
		
		
		
		
		
		
	}
	

	
	
	

}
