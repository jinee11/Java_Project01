package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> do while 문으로 무한루프를 돌립니다.
		//		스캐너에서 1 정수를 넣으면 "1. 평균출력" 2,3 마찬가지
		//		인풋값 4 정수를 넣기 전까진 계속 반복 "프로그램 종료"
		//		1~4 이외 "잘못된 입력입니다. 1~4까지만 넣어주세요"
		
		Scanner sc = new Scanner(System.in);
		
				int i;
		
		System.out.println("========================================");
		System.out.println("1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
		System.out.println("========================================");
		System.out.println(" 위 번호를 선택하세요 >>>");
		i = sc.nextInt();
		do {
			System.out.println("1. 평균 출력");
		} while (i == 1);
		
		i = sc.nextInt();
		do {
			System.out.println("2. 합계 출력");
		} while (i == 2);
		
		i = sc.nextInt();
		do {
			System.out.println("3. 이름 출력");
		} while (i == 3);
		
		i = sc.nextInt();
		do {
			System.out.println("4. 프로그램 종료");
		} while (i == 4);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
