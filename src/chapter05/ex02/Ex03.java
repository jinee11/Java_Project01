package chapter05.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// <문제> 스캐너로 배열의 방 갯수를 인풋받습니다.
		// 배열 변수 : arr1 <- 2의 배수를 저장후 출력 ,Enhanced for문 출력
		// 배열 변수 : arr2 <- 3의 배수를 인풋 받아서 출력, for문 출력
		//	arr.length
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("방의 갯수를 입력하세요>>");
		a = sc.nextInt();
		
		System.out.println("2의 배수 출력");
		int[] arr1 = new int[a];
		
		for (int i = 0, j = 2; i< arr1.length ; i++, j+=2) {
			arr1[i] = j;
		}
		for(int k : arr1) {
			System.out.print(k + " ");
		}
		
		int b;
		
		System.out.println("\n방의 갯수를 입력하세요>>");
		b = sc.nextInt();
		
		
		int[] arr2 = new int[b];
		
		for (int i=0, j=3 ; i < arr2.length ; i++, j+=3) {
			arr2[i] = j;
		}
		
		for (int i=0 ; i > arr2.length ; i++) {
			System.out.println("3의 배수 출력\n" + arr2[i]);
		}
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}