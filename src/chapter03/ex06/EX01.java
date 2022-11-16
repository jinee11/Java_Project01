package chapter03.ex06;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		//<문제1> 스캐너로 정수 값을 인풋받고 인풋받은 정수값이 홀수이면 "홀수"라고 출력
		                                         //짝수면 "짝수" 라고 출력
		
		Scanner sc = new Scanner(System.in);
		
		int a1;
	
		System.out.println("숫자를 입력하세요>>");
		a1 = sc.nextInt();
										// /안됨 연산자를 저장하는 %써야함
		System.out.println(a1 + "는(은)" + (a1 % 2 == 0 ? " 짝수입니다.":" 홀수입니다.")); 
										//2로 나눠서 0이되면 짝수
		

		
		
		
		

	}

}
