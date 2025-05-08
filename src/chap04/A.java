package chap04;

import java.util.Scanner;
import java.io.*;

public class A {

	public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
	
    public static void main(String[] args) throws Exception {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	
    	
//    	String[] A = br.readLine().split(",");
    	String[] A = br.readLine().split(" ");
    	
    	
    	
    	
    
    
 
//  	   System.out.println(A[0]);
    	
    	
    	
//    	System.out.println(A);
    
    	
//    	int gcd = GCD(a,b);
//    	
//    	System.out.println(gcd);
    	
    }
	
	
}

