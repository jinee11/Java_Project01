package Java_Jungsuk.pjw;

import java.util.Scanner;

public class Ex01_4 {

	public static void main(String[] args) {
		// 완료시간 :  <<2: 45분>>
		// <문제> 스캐너를 등록 하고 , 
		//   어머님이름, 아버님 이름, 형제이름 , 자신이름      sc.next(); 
		//   어머님나이 , 아버님 나이 , 형제나이 , 자신나이    sc.netxtInt(); 
		
		// 콘솔에서 인풋 받은 이름은 모두 출력 
		// 나이의 합계와 평균을 출력 
		
		Scanner sc = new Scanner(System.in);
		
		String a, b, c, d;
		int a1,a2,a3,a4;
		
		System.out.println("아빠 이름");
		a = sc.next();
		System.out.println("엄마 이름");
		b = sc.next();
		System.out.println("자매 이름");
		c = sc.next();
		System.out.println("내 이름");
		d = sc.next();
		
		System.out.println("아빠 나이");
		a1 = sc.nextInt();
		System.out.println("엄마 나이");
		a2 = sc.nextInt();
		System.out.println("자매 나이");
		a3 = sc.nextInt();
		System.out.println("내 나이");
		a4 = sc.nextInt();
		
		int sum = a1+a2+a3+a4;
		double avg = sum/4.0;
		
		System.out.printf("나이의 합계 : %d, 평균은 : %4.2f 입니다", sum, avg );
		
		
		
		
		sc.close();
		
		

	}

}
