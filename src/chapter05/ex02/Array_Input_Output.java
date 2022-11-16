package chapter05.ex02;

import java.util.Arrays;

public class Array_Input_Output {

	public static void main(String[] args) {
		// 배열에 값을 넣고, 출력 하기
		
		System.out.println("==== 1. 직접 값을 넣고 출력 =======");
		//배열 변수 선언 및 방 크기 초기화
		int[] arr1 = new int[5];
		
		//직접 해당 방 번호에 값을 할당
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		//직접 방의 번호를 출력
		System.out.println(arr1[0] + " "+arr1[1]+" "+arr1[2]+" "+arr1[3]+" "+arr1[4]);
		
		System.out.println("=== 2. for 문을 사용해서 대량으로 값을 넣고 출력하기 ==============");
		
		//arr2에 방을 100개 선언,for 문을 사용해서 각 방에 1부터 시작 1씩 증가
		int[] arr2 = new int[100]; 
		
		//for문을 사용해서 값 할당하기 : i<= index의 약자(방번호)
		for ( int i = 0 ; i < 100; i++);{ //i: 0번방번호 부터 시작해서 99까지
//			arr2[i] = i + 1;  //각 방의 값을 자동으로 넣는다.
		}
		
		//for 문을 사용해서 넣은 값을 출력 하기
		for (int i = 0 ; i <100 ; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println("\n=== 3. Enhanced FOR (향상된 for문) ==============");
		// Enhanced For : 배열의 각 방의 값을 출력 할때 쉽게 출력 할 수 있다.
		//		- 0 ~ 마지막 방까지 한꺼번에 출력(컨트롤 불가능)
		
		int[] arr3 = new int[100];
		
		// for문을 사용해서 7의 배수만 저장
		for (int i =0 , j = 7; i <100 ; i++, j+=7) {
			arr3[i] = j; //i 각방에 j값을 저장 (heap에)
		}
		System.out.println("=== For 문을 사용해서 출력============");
		//각방의 내용을 for문을 사용해서 출력
		for (int i = 0; i <100 ; i++) {
			System.out.print(arr3[i]+" "); //(heap에 저장된 값을 불러옴)
		}
		
		System.out.println("\n=== 향상된 For 문 : Enhanced For 출력============");
		//0번방부터 마지막방까지 모두 출력
		for (int k : arr3) { //k 각방의 값을 받는 변수(임의지정)
			System.out.print(k + " ");
		}
		
		System.out.println("\n==== Arrays.toString() (배열변수) 출력 =========");
		// Arrays.toString(arr3) : 배열 변수에 저장된 모든 값들을 출력
			//Arrays : 객체
			//toSrting() : 메소드 (함수)
				//메소드 : 객체 지향 언어에서 함수를 메소드 (method)라고 호칭한다.
		
		System.out.println(Arrays.toString(arr3)); //배열 변수의 값을 출력
		
		
		System.out.println("===== 배열의 방의 갯수를 출력 메소드 ================");
		
		System.out.println(arr1.length); //5 <-방갯수 5개
		System.out.println(arr2.length); //100
		System.out.println(arr3.length); //100
		
		System.out.println("=======================");
		
		for (int i = 0; i<arr3.length ; i++) {
			System.out.print(arr3[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
