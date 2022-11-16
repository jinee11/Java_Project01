package Java_Jungsuk.pjw;

import java.util.Scanner;

public class Ex01_5 {

	public static void main(String[] args) {
		// <실습 문제 >    <완료시간 : 6:10분, p.jangwoo@gmail.com  Ex01.java > 
		// 정수 2개를 Scanner 로 인풋 받고 두 값이 같으면 true를 다르면 false 출력
		// 이름 2개를 Scanner 로 인풋 받고 두 값이 같으면 true를 다르면 false 출력
			// 등가연산자 사용. 
			//기본자료형 : ==
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		String a1, b2;
		
		System.out.println("정수 두개 이름 두개를 공백 두고 입력");
		a = sc.nextInt();
		b = sc.nextInt();
		a1 = sc.next();
		b2 = sc.next();
		
		System.out.println("정수의 값이 똑같으면 true 틀리면 false:" + (a == b ));
		System.out.println("이름 같 true 틀 false :" + (a1.equals(b2)));
		
		

	}

}
