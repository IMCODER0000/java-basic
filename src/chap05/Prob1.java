package chap05;

public class Prob1 {
	
	public static void main(String[] args) {

		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		int evenByIa = 0;
		int oddByIa = 0;
		
		int evenByIb = 0;
		int oddByIb = 0;
		
		
		for(int i = 0; i < ia.length; i++) {
			if(ia[i]%2 ==0) {
				evenByIa += ia[i];
			} else {
				oddByIa += ia[i];
			}
		}
		for(int i = 0; i < ib.length; i++) {
			if(ib[i]%2 ==0) {
				evenByIb += ib[i];
			} else {
				oddByIb += ib[i];
			}
		}
		
		
		System.out.println("( 배열 ia )");
		System.out.println("홀수의 합 : " + oddByIa);
		System.out.println("짝수의 합 : " + evenByIa);
		System.out.println("( 배열 ib )");
		System.out.println("홀수의 합 : " + oddByIb);
		System.out.println("짝수의 합 : " + evenByIb);
		
		
		
	
	}

}
