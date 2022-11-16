package chapter04.ex02;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		// <문제> switch 문을 사용하여 프로그램 하세요
		//		스캐너로 정수 1를 인풋받으면 "금메달입니다" 출력
		//				  2를 받으면 "은메달입니다" 출력
						//3를 받으면 "동메달입니다" 출력
		//그외 값을 받으면 "메달이 없습니다" 출력
		
		int medal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		medal = sc.nextInt();
	
		switch (medal) {
		case 1 :
			System.out.println("금메달입니다");
			break;
		case 2 :
			System.out.println("은메달입니다");
			break;
		case 3 :
			System.out.println("동메달입니다");
			break;
		default :
			System.out.println("메달이 없습니다");
			break;
		}
		
		
		//<문제2> switch 문을 사용하여 프로그램 하세요/
		//스캐너로 정수 gold를 인풋 받으면 "금메달입니다"출력
		//			silver인풋 받으면 "은메달입니다"출력
		//			bronze인풋 받으면 "동메달입니다"출력
		//			그외 "메달이 없습니다"
		
		
		
		String medal2;
		
		
		System.out.println("메달 색을 영어로 입력해주세요");
		medal2 = sc.next();
		
		
		switch (medal2) {
		case "gold": case "Gold" : case "GOLD": //대소문자도 구분하기 때문에 다양한 케이스롤 넣어줘야함
			System.out.println("금메달입니다");
			break;
		case "silver" :
			System.out.println("은메달입니다");
			break;
		case "bronze" :
			System.out.println("동메달입니다");
			break;
		default :
			System.out.println("메달이 없습니다");
			break;
		
		}
		
		
		sc.close();
		
		
		
	}

}
