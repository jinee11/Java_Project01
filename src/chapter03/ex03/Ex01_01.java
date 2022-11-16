package chapter03.ex03;

import java.util.Scanner;

public class Ex01_01 {

	public static void main(String[] args) {
		// <실습 문제 >    <완료시간 : 6:10분, p.jangwoo@gmail.com  Ex01.java > 
		// 정수 2개를 Scanner 로 인풋 받고 두 값이 같으면 true를 다르면 false 출력
		// 이름 2개를 Scanner 로 인풋 받고 두 값이 같으면 true를 다르면 false 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		int a1;
		int a2;
		
		String b1;
		String b2;
		
		System.out.println("정수를 입력하세요>>");
		a1 = sc.nextInt();
		System.out.println("정수를 입력하세요>>");
		a2 = sc.nextInt();
		
		System.out.println(a1 == a2);
		
		System.out.println("이름을 입력하세요>>");
		b1 = sc.next();
		System.out.println("이름을 입력하세요>>");
		b2 = sc.next();
		
		System.out.println(b1.equals(b2));
		
		
		

	}

}
