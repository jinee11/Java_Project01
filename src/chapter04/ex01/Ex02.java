package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> 스캐너에서 번호를 입력받아서 아래 내용을 작동 시키는 프로그램을 작성
		// if 조건 or...
		
		Scanner sc = new Scanner(System.in);
		
		int select; //프로그램 선택하는 변수
		//1
		int kor;
		int eng;
		int math;
		
		int sum;
		double avg;
		
		//2
		int a;
		//3
		String aName;
		String bName;
		
		System.out.println("===============================================");
		System.out.println("1.학점의 합계/평균 | 2. 홀수/짝수 | 3. 같은 이름 식벽");
		System.out.println("===============================================");
		System.out.println("위의 번호를 선택하세요.>>>");
		select = sc.nextInt();
		
		if (select == 1) {
			System.out.println("1번을 선택했습니다.");
			System.out.println("국어, 영어, 수학 점수를 차례대로 입력하세요");
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			System.out.println("학점의 합계는 "+(sum=kor+eng+math)+"입니다");
			System.out.println("평균은 "+(sum/3.0)+"입니다.");
			
		}else if(select == 2) {
			System.out.println("정수를 입력하세요");
			a = sc.nextInt();
			System.out.println(a%2 == 0 ? "짝수입니다":"홀수입니다.");
			
		}else if(select == 3) {
			System.out.println("이름을 입력하세요");
			aName = sc.next();
			bName = sc.next();
			System.out.println(aName .equals(bName));
		}
		
		
		
		sc.close();
		
	}

}
