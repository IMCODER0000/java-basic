package chap04;

import java.util.Scanner;

public class SwitchExam2 {
	
	public static void main(String[] args) {
	
		Scanner key = new Scanner(System.in);
        System.out.print("점수:");
        int jumsu = key.nextInt();
        String score = "";
        
        switch(jumsu/10) {
        	case 10:
        	case 9:
        		score = "A학점";
        		break;
        	case 8:
        		score = "B학점";
        		break;
        	case 7:
        		score = "C학점";
        		break;
        	case 6:
        		score = "D학점";
        		break;
        	default :
        		score = "F학점";
        		break;
        
        
        }
        
        
        
            System.out.println(score);
        
		
		
		
		
		
	}

}
