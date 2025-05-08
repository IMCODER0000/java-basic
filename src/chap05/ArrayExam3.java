package chap05;

public class ArrayExam3 {
	
	public static void main(String[] args) {
		
		int[] scoreArr = {98,99,100,89,88};
		int sum = 0;
		
		for(int i = 0; i < scoreArr.length; i++ ) {
			
			sum += scoreArr[i];
			
		}
		
		System.out.println("총합: " + sum );
		System.out.println("평균: " + sum/scoreArr.length);
		
		
	}
	

}
