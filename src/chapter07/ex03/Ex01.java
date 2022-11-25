package chapter07.ex03;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 가변 길이 배열 문제
		/*
		 	values[0] : 값이 정수 1~9 인풋 "파워 레벨 1입니다." 출력 2면 2입니다
		 	values[1] : 값이 정수 1~9 인풋 "스피드 레벨 1입니다." 출력 2면 2입니다
		 	
		 */
		Ex01.arrayFlexble(2,6);
	}
	
	public static void arrayFlexble (int...values) {
		if (values[0] > 0 && values[0] < 10) {
			System.out.printf("파워 레벨 %d 입니다." , values[0]);
		}else {
			System.out.println("잘못된 입력입니다. 1 ~9 사이의 값만 넣으세요");
		}if (values[1] > 0 && values[1] < 10) {
			System.out.printf("스피드 레벨 %d 입니다." , values[1]);
		}else {
			System.out.println("잘못된 입력입니다. 1 ~9 사이의 값만 넣으세요");
		}
		
	}

}
