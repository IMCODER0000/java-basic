package Task;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);



        System.out.println("********미니계산기*********");
        System.out.println("1. 더하기");
        System.out.println("2. 곱하기");
        System.out.println("3. 빼기");
        System.out.println("4. 나누기");
        System.out.print("연산자 선택 : ");
        int operator = sc.nextInt();
        System.out.print("숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

//        switch (inputOperator){
//            case 1:
//                System.out.println("계산 결과 => " + (num1 + num2));
//                break;
//            case 2:
//                System.out.println("계산 결과 => " + (num1 * num2));
//                break;
//            case 3:
//                System.out.println("계산 결과 => " + (num1 - num2));
//                break;
//            case 4:
//                System.out.println("계산 결과 => " + (num1 / num2));
//                break;
//            default:
//                System.out.println("잘못된 연산자 입니다.");
//                break;
//
//        }
        
        
        
        if(operator == 1) {
        	System.out.println("계산 결과 => " + (num1 + num2));
        	
        } else if(operator == 2) {
        	System.out.println("계산 결과 => " + (num1 * num2));
        	
        } else if(operator == 3) {
        	System.out.println("계산 결과 => " + (num1 - num2));
        	
        } else if(operator == 4) {
        	 System.out.println("계산 결과 => " + (num1 / num2));
        	
        } else {
        	System.out.println("잘못된 연산자 입니다.");
        }

    }








 }
    







