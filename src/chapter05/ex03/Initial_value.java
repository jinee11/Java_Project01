package chapter05.ex03;

import java.util.Arrays;

public class Initial_value {

	public static void main(String[] args) {
		// 기본 자료형과 참조 자료형의 초기값
		//	기본 자료형 : Stack 공간에 변수와 변수의 값 저장됨
					// 강제 초기화 안됨. 사용시에는 초기 값을 넣고 사용
		//	참조 자료형 (배열) : Stack 공간에 [배열] 변수와 heap 영역의 주소정보가 저장
		//					 Heap 영역에는 값이 저장
					//강제 초기화 됨. boolean (기본값 false), 정수(0), 실수(0.0)
								// char (공백), String (null)
		
		// 1. Stack 메모리값( 강제 초기화 되지 않음)
		int value1;
//		value1 = 0; //이열이 없으면 아래가 오류 초기값을 할당을 안할경우
//		System.out.println(value1); //오류발생! 초기값이 할당 안되있어서
		int[] value2;
//		value2 = new int[3];
				//new <= heap 영억에 주소 값을 만들어 넣어라
//		System.out.println(value2); //오류발생! value2의 heap영역의 주소값이 없다
		
		int value3 = 0;
		System.out.println(value3);
		int[] value4 = null;	//null<=값이 비어있는 상태 (0이 아님)
		                        //(참조 자료형에만 사용가능)
		System.out.println(value4); //null : value4에 heap 영역의 주소가 비어있는 상태)
		
		System.out.println("======== boolean : 초기값 : false ================");
		
		// 2. Heap 영역은 강제 초기화가 된다. boolean (기본값 false), 정수(0), 실수(0.0)
			//2-1. 기본자료형 배열
			
			boolean[] arr1 = new boolean[3]; // 기본값으로 false가 각 방에 할당됨
			
			for (int i = 0 ; i <arr1.length ; i++) {
				System.out.print(arr1[i]+" "); //false false false
			}	//각방에 초기 값이 들어있다.
			
			System.out.println("\n===== 정수형 : 초기값 : 0 ==================");
			
			int[] arr2 = new int[5];
			
			for (int i = 0 ; i < arr2.length ; i++) {
				System.out.print(arr2[i] + " "); // 0 0 0 0 0
			}	//각방 초기값 있음
			
			System.out.println("\n===== 실후형 : 초기값 : 0.0 ==================");
			
			double[] arr3 = new double[3];
			
			for (int i = 0 ; i < arr3.length ; i++) {
				System.out.print(arr3[i] +" "); //0.0 0.0 0.0
			}	//각방 초기값
			
			System.out.println("\n===== 문자 : 초기값으로 없다 <<공백>> ==================");
			
			char[] arr4 = new char[3];
			
			for (int i = 0 ; i<arr4.length;i++) {
				System.out.println(arr4[i]+" ");
			}
			
			System.out.println("===== 문자열 : 초기값 : null ==================");
			
			String[] arr5 = new String[3];
			for (int i = 0; i<arr5.length ; i++) {
				System.out.print(arr5[i]+" ");
			}
			
			System.out.println("\n======= Arrays.toString() 로 출력 ==========");
			
			System.out.println(Arrays.toString(arr1)); // boolean
			System.out.println(Arrays.toString(arr2)); // int
			System.out.println(Arrays.toString(arr3)); // double
			System.out.println(Arrays.toString(arr4)); // char
			System.out.println(Arrays.toString(arr5)); // String
			
			
			
		
		
		
		
	}

}
