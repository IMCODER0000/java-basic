package exception;

import java.util.InputMismatchException;
import java.util.Scanner;



public class ThrowExam {
    public void test() throws InputMismatchException,NullPointerException{
        Scanner key = new Scanner(System.in);
        String str = null;
        System.out.println("숫자입력:");
        int data = key.nextInt();
        System.out.println("입력한 숫자는 :"+data);
      
        System.out.println(str.length());
    }
    public static void main(String[] args) {
    	
    	try {
    		 ThrowExam obj = new ThrowExam();
    	        obj.test();
    	} catch(InputMismatchException e) {
    		System.out.println("숫자만 입력해주세요");
    	} catch(NullPointerException e) {
    		System.out.println("NUll을 참조할 수 없습니다.");
    	}
    	
       
    }

}
