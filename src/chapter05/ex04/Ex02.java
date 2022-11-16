package chapter05.ex04;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// 배열
		
		//1. 배열 선언 : - 동일한 데이터 타입을 저장. - 방의 크기가 지정되면 수정이 불가
		int[] arr1;				//배열 선언
		arr1 = new int[500];	//방크기 정의
			  //new <- heap에 저장하겠다
		
		//배열에 저장된 기본 값을 출력 : heap 강제 초기 값이 할당됨 
		System.out.println("=== 배열의 초기값 출력 =====");

		for (int i = 0 ; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.err.println();
		
		//2. 배열의 값을 저장 (for 문을 사용해서 저장)
		for (int i = 0; i< arr1.length;i++) {
			arr1[i] = i+1; //0번방에 +1= 1번방 이렇게 값을 저장하는것
		}
		
		//3. 배열의 각 방에 저장된 내용을 출력 : for, Enhanced for, Arrays.toString(arr1)
		System.out.println("===for ===========");
		
		for(int i = 0; i < arr1.length ; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println("\n===Enhanced for ===========");
		
		for(int k : arr1) {
			System.out.print(k + " ");
		}
		
		System.out.println("\n===Arrays.toString(arr1) ===========");
		
		System.out.println(Arrays.toString(arr1));
		
		
		
		
		
		
		

	}

}
