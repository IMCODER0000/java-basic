package chap04;

public class WhileExam1 {
	
	public static void main(String[] args) {
		
		
		
		int sum = 0;
		int oddSum = 0;
		int evenSum = 0;
		int i = 0;
	
		
		while(i<=100) {
			sum += i;
			if(i%2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
			
			i++;
		}
		
		
		System.out.println("총 합 : "  + sum);
		System.out.println("홀수 합:" + oddSum);
		System.out.println("짝수 합 : " + evenSum);
		
		
		
		
	}
	

}
