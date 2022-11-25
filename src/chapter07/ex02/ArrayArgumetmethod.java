package chapter07.ex02;

import java.util.Arrays;

public class ArrayArgumetmethod {
	public static void main(String[] args) {
		//메소드의 매개변수 (Argument)가 배열
		
		//2. 메소드 호출시 Argument로 배열을 넣고 호출
			//2-1. a 배열을 생성 후 호출
		int[] a = new int[] {1,2,3,4,5};
		ArrayArgumetmethod.printArray(a); //메소드 호출
		System.out.println("======================================");
		
			//2-2. 메소드 호출시 객체를 생성해서 호출
		ArrayArgumetmethod.printArray(new int[] {6,7,8,9,10});
		
			//2-3. 주의 : 오류발생
//		ArrayArgumetmethod.printArray({11,12,13,14,15}); new int[] 생략시 오류발생
	}
	
	//매개변수로 배열을 인풋받는 메소드 : 배열의 각방의 모든 내용을 출력해주는 메소드
		//메소드 : 함수 (프로그래밍의 기능)
	public static void printArray (int[] a) {
		//1. 배열의 Index = 0 ~ 마지막 방번호까지 for문을 사용해서 출력
		
		System.out.println("=== 1. for 문을 사용해서 출력 =================");
		for (int i = 0; i < a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n=== 2. Enhancde for 문을 사용해서 출력 =================");
		for (int k : a) {
			System.out.print(k+" ");
		}
		System.out.println("\n=== 3. Arrays.toString 문을 사용해서 출력 =================");
		System.out.println(Arrays.toString(a));
	}
}
