package chapter05.ex06;

import java.util.Arrays;

public class Ex {
		//<2차원 배열 복습>
	public static void main(String[] args) {
		//1. 배열의 선언
		int[][] arr1 = new int[5][100];
		
		System.out.println(arr1.length); //행의 갯수=5
		System.out.println(arr1[0].length);//[0]행의 열의 갯수=100
		
		System.out.println("================");
		
		//2. 2차원 배열의 값 넣기 : 2중 for문
		//밖의 for문은 행의 정의 i<-행번호 arr1.length<-행의 갯수
		
		int a = 0; //여기서 방에 들어갈 변수 값을 선언하면
		           //ex) 0행 1~100 1행 101~200.. 값이 초기화 안됨
				   //[][]arr2를 arr1를 똑같이 만들어도 0행에 601~700 1행 701~이렇게 들어감
		for (int i =0; i<arr1.length;i++) {
			//안의 for문은 열의 정의 j<-열번호 arr1[i].length<-i행의 열의 갯수
			for(int j =0 /*a = 0*/ ;j<arr1[i].length;j++,a++) {
				arr1[i][j] = a+1; //a변수로 배열변수방 값을 넣음
				//i가 0번 일때 j가 열의 번호100보다 작은 0~99번까지 반복
				//주석처리한 곳에서 변수 선언한 a가 0~99번 방까지 1씩 증가해서 들어가고 다시 0으로 돌아감
				//ex) 0행 1~100 1행 1~100...
			}
		}
		
		
		System.out.println("==for==");
		
		//3. 배열의 값을 출력 하기(for - for)
		for (int i = 0; i<arr1.length;i++) { //행의 루프
			for(int j = 0; j<arr1[i].length;j++) { //열의 루프
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("==Enhanced for==");
		
		//4. Enhanced for 문을 사용해서 값 출력
		for (int[] k : arr1) { //arr1 배열 변수의 루프를 돌면서 행을 꺼내와서 변수 k에 저장
			for(int b : k) { //1차원 행을 저장한k의 각방의 값을 꺼내와서 변수 a에 저장
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		System.out.println("==Arrays.toString()==");

		
		//5. Arrays.toString() <= 1차원 배열의 값을 출력
			// arr1 : 2차원 배열
		for(int[] k:arr1) { //2차원 배열 arr1의 행의 값을 꺼내서 1차원 배열 k에 저장
			System.out.println(Arrays.toString(k));
		}

	}

}
