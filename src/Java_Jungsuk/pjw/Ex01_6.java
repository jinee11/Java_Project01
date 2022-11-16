package Java_Jungsuk.pjw;

import java.util.Scanner;

public class Ex01_6 {

	public static void main(String[] args) {
		//<문제1> 스캐너로 정수 값을 인풋받고 인풋받은 정수값이 홀수이면 "홀수"라고 출력
        //짝수면 "짝수" 라고 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력");
		int a;
		a = sc.nextInt();
		System.out.println(a%2 > 0 ? "짝":"홀" );
		

	}

}
