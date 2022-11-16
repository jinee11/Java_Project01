package chapter05.ex02;

import java.util.Arrays;

public class Ex02_1 {

	public static void main(String[] args) {
		// <문제> 배열 변수 :arr1 , 방 갯수 : 500개
		// 배열방에 3의 배수 와 5의 배수를 저장
		// 3가지 방법으로 출력 1. for 2. Enhanced for 3.Arrays.toString()를 사용해서 출력
		
//		int[] arr1 = new int[500];
//		
//		for(int i = 0; i <500 ; i++) {
//			arr1[i]=(i+1)*3;
//		}
//		
//		for (int i = 0, j = 1; i <500; i++,j++) {
//			if (j%3==0 ||j%5==0) {
//				arr1[i]=j;
//				System.out.print(arr1[i]+" ");
//			}
//		}
//		
//		System.out.println();
		
		int i = 0;   //방번호를 담는 변수
		int[] arr1 = new int[500];
		
		for (int a = 1 ; a < 3000 ; a++) {//3,5의 배수를 담는 변수 : a
			if(a % 3==0 || a% 5==0){ //둘중 하나 선택하면 실행
				arr1[i] = a; //방에 a값을 저장
				i++; //방의 갯수가 1씩 커짐
			}
			if(i > 499){ //499보다 크면 빠져나옴
				break;
			}
		}
		
		System.out.println("==for====");
		for ( i = 0 ; i < 500 ; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("==E=====");
		for (int k : arr1) {
			System.out.printf("%d ",k);
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr1));

	}

}
