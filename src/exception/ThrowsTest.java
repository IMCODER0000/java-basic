package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ThrowsTest {
	
	
	
	public void test(String filename) {
		try {
			FileReader fr = new FileReader(filename);
		} catch(FileNotFoundException e) {
			System.out.println("파일명 틀림");
		}
		
		
	}
	
	public void test2(String filename) throws FileNotFoundException {
		
		FileReader fr = new FileReader(filename);
		System.out.println("파일명 틀림2");
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		ThrowsTest ob = new ThrowsTest();
		
		ob.test("test1.txt");
		
		
		
		
	}
	

	
	
	

}
