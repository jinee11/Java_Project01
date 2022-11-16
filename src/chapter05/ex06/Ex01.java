package chapter05.ex06;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 
		
		int[][] arr1 = new int[][] {{10,20,30,40,50},{11,12,13,14,15},{111,112,113,114,115}};
		
		//1. 2중 for문을 사용해서 2차원 배열 출력
		
		for(int a = 0; a < arr1.length ; a++) {
			for(int b = 0; b < arr1[a].length; b++) {
				System.out.print(arr1[a][b]+" ");
			}
			System.out.println();
		}
		
		//1. 2중 for문을 사용해서 2차원 배열 출력
		System.out.println("== for문을 사용해서 출력 ==");
		
		for(int i = 0; i<arr1.length;i++) {//i:행의 방번호, arr1.length:행의갯수
			for(int j = 0; j<arr1[i].length ; j++) {//j:열의 방번호. arr1[i].length:열의갯수
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		//2. 향상된 for 문을 사용해서 출력
		System.out.println("== Enhanced for문을 사용해서 출력 ==");
						//arr1<=2차원배열
		for(int[] arr2 : arr1) { //바깥쪽 for문은 arr2(1차원배열)변수에 arr1(2차원)변수의 배열 자체를 불러오는것
			for(int k : arr2) { //k변수는 arr2변수에 담긴 1차원 배열의 행(값)을 계속 들고 오는것
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		
		//3. Arrays.toString()를 사용해서 출력 : 1차원 배열의 값을 출력
		System.out.println("== Arrays.toString()문을 사용해서 출력 ==");
		for (int[] arr3 : arr1) { //arr3에 배열의 행 자체를 가져오는것
			System.out.println(Arrays.toString(arr3));
		}
		
		
		
		

	}

}
