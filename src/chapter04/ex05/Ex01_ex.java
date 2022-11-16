package chapter04.ex05;

import java.util.Scanner;

public class Ex01_ex {

	public static void main(String[] args) {
		// <문제> do while 문으로 무한루프를 돌립니다.
		//		스캐너에서 1 정수를 넣으면 "1. 평균출력" 2,3 마찬가지
		//		인풋값 4 정수를 넣기 전까진 계속 반복 "프로그램 종료"
		//		1~4 이외 "잘못된 입력입니다. 1~4까지만 넣어주세요
		

		
		Scanner sc = new Scanner(System.in); //1번
		int a; //2번
		
		do { //3번
			System.out.println("========================================");
			System.out.println("1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
			System.out.println("========================================");
			System.out.println(" 위 번호를 선택하세요 >>>");
			a = sc.nextInt(); //4번
			
			if ( a==1) { //5번
				System.out.println("1. 평균출력");
			}else if (a==2) {
				System.out.println("2. 합계출력");
			}else if (a==3) {
				System.out.println("3. 이름출력");
			}else if (a==4) {
				System.out.println("4. 프로그램 종료");
				break; //탈출해야함
			}else { //디폴트 값
				System.out.println("잘못된 입력입니다. 1~4까지만 넣어주세요");
			}
			
		}while (true); //true여야 계속 루프 돌아감
		
		System.out.println("do while 문을 탈출하였습니다"); //6번
		
  sc.close();
	}

}
