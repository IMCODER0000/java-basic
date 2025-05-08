package oop.basic.chap05;

// 1, 2, 3 메소드 정
// Calc.java, ForGuGu, Multi... 클래스에서는 메소드로 분리된 로직
// 

public class MyMethodDemo {
	

	public void printGuGu(int dan) {
		
		for(int i=1;i<=9;i++) {
			System.out.println(dan+" * "+ i +" = "+(dan*i));
		}	
		
	}
	
	public void printGuGu() {
		for(int dan=2;dan<=9;dan++) {
			for(int i=1;i<=9;i++) {
				System.out.print(dan +" * "+i+" = "+(dan*i)+"\t");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------");
		for(int i=1;i<=9;i++) {
			for(int dan=2;dan<=9;dan++) {
				System.out.print(dan +" * "+i+" = "+(dan*i)+"\t");
			}
			System.out.println();
		}
	}
	
	public int calc(int op, int num1, int num2) {
		
		if(op>=1 & op<=4) {
			System.out.print("숫자를 입력하세요");
			
			int result = 0;
			if(op==1) {
				result = num1+num2;
			}else if(op==2) {
				result = num1*num2;
			}else if(op==3) {
				result = num1-num2;
			}else {
				result = num1/num2;
			}
			
			
			System.out.println("계산결과=>"+result);
			return result;
		}else {
			System.out.println("연산자를 잘못 선택했습니다.");
			return 0;
		}
	}
		
		
	
	

}
