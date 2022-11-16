package chapter02.ex08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// 완료시간 :  <<2: 45분>>
		// <문제> 스캐너를 등록 하고 , 
		//   어머님이름, 아버님 이름, 형제이름 , 자신이름      sc.next(); 
		//   어머님나이 , 아버님 나이 , 형제나이 , 자신나이    sc.netxtInt(); 
		
		// 콘솔에서 인풋 받은 이름은 모두 출력 
		// 나이의 합계와 평균을 출력 

		Scanner sc = new Scanner(System.in);
		
		String n1;
		String n2;
		String n3;
		String n4;
		
		int a1;
		int a2;
		int a3;
		int a4;
		
		System.out.println("이름을 입력하세요>>");
		n1 = sc.next();
		System.out.println("이름을 입력하세요>>");
		n2 = sc.next();
		System.out.println("이름을 입력하세요>>");
		n3 = sc.next();
		System.out.println("이름을 입력하세요>>");
		n4 = sc.next();
		
		System.out.println("나이를 입력하세요>>");
		a1 = sc.nextInt();
		System.out.println("나이를 입력하세요>>");
		a2 = sc.nextInt();
		System.out.println("나이를 입력하세요>>");
		a3 = sc.nextInt();
		System.out.println("나이를 입력하세요>>");
		a4 = sc.nextInt();
		
		int sum;
		sum = a1+a2+a3+a4;
		
		double avg;
		avg = sum / 4.0;
		
		System.out.println("나이의 합계는 "+sum+"입니다.");
		System.out.println("나이의 평균은"+avg+"입니다.");
		
		
		
		sc.close();
		
		
			}

}
