package chapter05.ex06;

import java.util.Arrays;

public class Ex02_01 {

	public static void main(String[] args) {
		// <문제>
		/*
		 	2차원 배열 변수 : arr1
		 	arr1[0]		<== 2의 배수만 저장
		 	arr2[1]		<== 5의 배수만 저장
		 	arr3[2]		<== 3의 배수와 8의배수를 저장
		 	arr3[3]		<== 1부터 시작해서 1씩 증가하는데 7의 배수는 제외하고 저장
		 	
		 	행의 갯수 : 4
		 	열의 갯수 : 100
		 	
		 	1. for문 출력  2. Enhanced for  3. Arrays.toString()
		 */

		int[][] arr1 = new int[4][100];
		int[][] arr2 = new int[4][100];
		int[][] arr3 = new int[4][100];
		
//		int i;//행
//		int x;//열
		//j=배수
		
		for (int i = 0; i< 1 ; i++) {
			for (int x = 0, j = 2; x <arr1[i].length ; x++,j+=2) {
				if(j%2==0) {
					arr1[i][x]=j;
					
					System.out.print(arr1[i][x]+" ");
				}
			}
		}
		System.out.println("\n결과 확인");
		for (int[] arr11:arr1) {
			System.out.println(Arrays.toString(arr11));
		}
		System.out.println();
		
		for (int i = 1 ; i < 2; i++) {
			for (int x=0,j=5; x< arr2[i].length ; x++,j+=5) {
				if(j%5==0) {
					arr2[i][x]=j;
					
					System.out.print(arr2[i][x]+" ");
				}
			}
		}
		System.out.println("\n결과 확인");
		for (int[] arr22:arr2) {
			System.out.println(Arrays.toString(arr22));
		}
		System.out.println();
		
		for(int i = 2 ; i < 3; i++) {
			for(int x=0, j=1 ; x<arr3[i].length ; x++,j++) {
				if(j%3==0||j%8==0) {
					arr3[i][x]=j;
					
					System.out.print(arr3[i][x]+" ");
				}
			}
		}
		System.out.println("\n결과 확인");
		for (int[] arr33:arr3) {
			System.out.println(Arrays.toString(arr33));
		}
		

	
		
		
		
		
	}

}
