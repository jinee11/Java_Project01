package chapter04.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> 스캐너로 1월 ~ 12월까지 월을 인풋 받아서 해당 월의 일수를 출력하기
		// 출력 : 1월은 31일 입니다.
			// 2월은 28일 입니다. 
			//일수가 같은건 같은 case 로 묶어줌
			//month 월은 day 일 입니다.
		 
		Scanner sc = new Scanner(System.in);
		
		int month;
		int day = 30;
		
		System.out.println("일수를 알고 싶은 월을 입력하세요>>");
		month = sc.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12 : //31일
		    System.out.println(month+"월은 "+(day+1)+"입니다.");
	     	break;
		case 2 : //29일
			System.out.println(month+"월은 "+(day-1)+"입니다.");
			break; 
		case 4: case 6: case 9 : case 11 : //30일
		    System.out.println(month+"월은 "+day+"입니다.");
		default :
			System.out.println("월이 아닌 숫자입니다.");
			
			
		}	
		
		

	}

}
