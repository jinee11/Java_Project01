package chapter03.ex06;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		//<문제2 ex02> 스캐너로 3,6,9의 배수이면 "3,6,9의 배수입니다"
		  //그러지 않으면 "3,6,9의 배수가 아닙니다" 를 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		int a1;
		
		System.out.println("정수를 입력하세요>>");
		a1 = sc.nextInt();
				
		System.out.println(a1 + "는(은)" + (((a1%3==0 || a1%6==0 || a1%9==0)) ? "3,6,9의 배수입니다":"3,6,9의 배수가 아닙니다"));
	
		

	}

}
