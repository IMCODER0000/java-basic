package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ThrowsTest2 {
	

	
	
	
	
	
	public static void main(String[] args) {
		
		
		ThrowsTest ob = new ThrowsTest();
		
		ob.test("test3.txt");
		
		
		try {
			ob.test2("test2.txt");
		} catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "예외 발생"); 
		}
		
		
		
		
	}
	

	
	
	

}
