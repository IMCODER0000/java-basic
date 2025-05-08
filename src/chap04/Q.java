package chap04;

import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	
    	int bigger = a > b ? a : b;
    	int result = 0;
    	
    	for( int i = 1; i<=bigger; i ++) {
    		if(a%i ==0  && b%i ==0) {
    			
    			if(result<i) {
    				result = i;
    			}
    		}
    	}
    	
    	
    	
    	
    	
    	System.out.println(result);
    
    	
    }
	
	
}

