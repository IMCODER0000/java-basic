package chap04;

public class ForExam_Hap {
	
	public static void main() {
		
		int sum = 0;
		int oddSum = 0;
		int evenSum = 0;
		
		
		for(int i=1; i<=100; i++) {
			sum += i;
			if(i%2 ==0) {
				evenSum += i;
			} else {
				
				oddSum += i;
			}
		}
		
		System.out.println("총 합 : "  + sum);
		System.out.println("홀수 합:" + oddSum);
		System.out.println("짝수 합 : " + evenSum);
		
		
	}
	
	

}
