package chap02;

public class TimeTest {
	
	
	public static void main(String[] args) {
		
		int totalTime = 8800;
		int S = totalTime/60/60;
		totalTime -= S*60*60;
		int M = totalTime/60;
		totalTime -= M*60;
		
		

		

		
		 System.out.println( S+ "시간 " + M + "분 " + totalTime + "초");
		
		
		
		
		
		
	}
	
	

}
